package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.media.audiofx.PresetReverb;
import android.media.audiofx.Virtualizer;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class xs {
    public static MediaPlayer a;
    private static ExoPlayer fallbackPlayer;
    public static Equalizer b;
    public static Virtualizer d;
    public static PresetReverb e;
    public static LoudnessEnhancer f;
    public static List<j10> h = new ArrayList<>();
    public static int i = -1;
    public static boolean k = false;
    public static short l = 0;
    public static short m = 0;
    public static int n = 0;
    public static Map<Short, Short> o = new HashMap<>();
    public static List<Object> p = new ArrayList<>();
    public static boolean q = false;
    public static vs r = vs.f;
    public static float s = 1.0f;
    public static float t = 1.0f;
    public static int u = -1;
    public static int v = -1;
    public static boolean w = false;
    private static final Random x = new Random();
    public static volatile boolean isPrepared = false;
    public static volatile boolean videoMode = false;
    private static SurfaceHolder videoSurface;

    public static void a() {
        if (fallbackPlayer != null) {
            fallbackPlayer.setPlaybackParameters(new androidx.media3.common.PlaybackParameters(s, t));
            return;
        }
        if (a == null || !isPrepared || Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return;
        try {
            a.setPlaybackParams(new PlaybackParams().setSpeed(s).setPitch(t));
        } catch (RuntimeException ignored) {
        }
    }

    public static void b(Context context) {
        if (h.isEmpty()) return;
        if (q) {
            d(context, randomIndex());
        } else {
            // Next is a manual action, so it may wrap even while Repeat Off is set.
            d(context, (Math.max(i, 0) + 1) % h.size());
        }
    }

    public static void c(Context context) {
        if (h.isEmpty()) return;
        d(context, (i - 1 + h.size()) % h.size());
    }

    public static void d(Context context, int index) {
        if (index < 0 || index >= h.size()) return;
        i = index;
        u = -1;
        v = -1;
        w = false;
        j10 selectedSong = h.get(index);
        Context playbackContext = context.getApplicationContext();
        isPrepared = false;

        MediaPlayer previous = a;
        a = null;
        if (previous != null) {
            try {
                if (previous.isPlaying()) previous.stop();
            } catch (RuntimeException ignored) {
            }
            try { previous.release(); } catch (RuntimeException ignored) { }
        }

        MediaPlayer player = new MediaPlayer();
        try {
            player.setAudioAttributes(new AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build());
            player.setDataSource(context, selectedSong.f);
            player.prepare();

            a = player;
            isPrepared = true;
            attachEffects(player, player.getAudioSessionId());
            applyPlaybackParams(player);
            player.setOnCompletionListener(completed -> onSongCompleted(playbackContext));
            player.setOnErrorListener((failedPlayer, what, extra) -> {
                isPrepared = false;
                Log.e("MusicPlayer", "Playback error: " + what + "/" + extra
                        + ", uri=" + selectedSong.f + ", title=" + selectedSong.b);
                if (a == failedPlayer) {
                    a = null;
                    try { failedPlayer.reset(); } catch (RuntimeException ignored) { }
                    try { failedPlayer.release(); } catch (RuntimeException ignored) { }
                }
                startExoFallback(context, selectedSong, playbackContext);
                notifySongChanged(selectedSong);
                return true;
            });
            player.start();
            notifySongChanged(selectedSong);
        } catch (Exception error) {
            Log.e("MusicPlayer", "Error playing song", error);
            isPrepared = false;
            if (a == player) a = null;
            try { player.release(); } catch (RuntimeException ignored) { }
            startExoFallback(context, selectedSong, playbackContext);
            notifySongChanged(selectedSong);
        }
    }

    private static void applyPlaybackParams(MediaPlayer player) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return;
        try {
            player.setPlaybackParams(new PlaybackParams().setSpeed(s).setPitch(t));
        } catch (RuntimeException error) {
            Log.w("MusicPlayer", "Unable to apply playback parameters", error);
        }
    }

    public static void f(short band, short level) {
        o.put(band, level);
        if (b != null) {
            try { b.setBandLevel(band, level); } catch (RuntimeException ignored) { }
        }
    }

    public static void stopAndRelease() {
        isPrepared = false;
        releaseEffects();
        if (fallbackPlayer != null) {
            fallbackPlayer.release();
            fallbackPlayer = null;
        }
        if (a != null) {
            MediaPlayer player = a;
            a = null;
            try { player.reset(); } catch (RuntimeException ignored) { }
            try { player.release(); } catch (RuntimeException ignored) { }
        }
    }

    public static boolean isPlaying() {
        if (fallbackPlayer != null) return fallbackPlayer.isPlaying();
        MediaPlayer player = a;
        if (player == null || !isPrepared) return false;
        try {
            return player.isPlaying();
        } catch (RuntimeException ignored) {
            return false;
        }
    }

    public static boolean togglePlayback() {
        if (fallbackPlayer != null) {
            if (fallbackPlayer.isPlaying()) fallbackPlayer.pause(); else fallbackPlayer.play();
            return true;
        }
        MediaPlayer player = a;
        if (player == null || !isPrepared) return false;
        try {
            if (player.isPlaying()) player.pause(); else player.start();
            return true;
        } catch (RuntimeException ignored) {
            return false;
        }
    }

    public static void setVideoSurface(SurfaceHolder surface) {
        videoSurface = surface;
        if (!videoMode) return;
        MediaPlayer player = a;
        if (player != null) {
            try {
                player.setDisplay(surface);
            } catch (RuntimeException ignored) {
            }
        }
    }

    private static void notifySongChanged(j10 song) {
        // Work on a copy: an Activity can unsubscribe while the callback runs.
        for (Object listener : new ArrayList<>(p)) {
            if (listener instanceof cl) {
                try {
                    ((cl) listener).h(song);
                } catch (RuntimeException error) {
                    Log.w("MusicPlayer", "Unable to update song listener", error);
                }
            }
        }
    }

    private static void startExoFallback(Context context, j10 selectedSong, Context playbackContext) {
        if (fallbackPlayer != null) return;
        Log.w("MusicPlayer", "MediaPlayer audio sink failed; using ExoPlayer fallback");
        ExoPlayer player = new ExoPlayer.Builder(context.getApplicationContext()).build();
        fallbackPlayer = player;
        player.addListener(new Player.Listener() {
            @Override
            public void onPlaybackStateChanged(int state) {
                if (state == Player.STATE_READY) {
                    isPrepared = true;
                    player.setPlaybackParameters(new androidx.media3.common.PlaybackParameters(s, t));
                    notifySongChanged(selectedSong);
                } else if (state == Player.STATE_ENDED) {
                    isPrepared = false;
                    onSongCompleted(playbackContext);
                }
            }

            @Override
            public void onPlayerError(PlaybackException error) {
                isPrepared = false;
                Log.e("MusicPlayer", "ExoPlayer fallback failed", error);
                notifySongChanged(selectedSong);
            }
        });
        player.setMediaItem(MediaItem.fromUri(selectedSong.f));
        player.prepare();
        player.play();
    }

    private static int randomIndex() {
        if (h.size() < 2) return Math.max(i, 0);
        int currentIndex = Math.max(i, 0);
        int candidate;
        do {
            candidate = x.nextInt(h.size());
        } while (candidate == currentIndex);
        return candidate;
    }

    private static void onSongCompleted(Context context) {
        if (h.isEmpty() || i < 0) return;

        // f = off, g = repeat all, h = repeat one.
        if (r == vs.h) {
            d(context, i);
        } else if (q) {
            d(context, randomIndex());
        } else if (i < h.size() - 1) {
            d(context, i + 1);
        } else if (r == vs.g) {
            d(context, 0);
        }
        // Repeat Off at the final track intentionally does nothing: playback stays ended.
    }

    private static void attachEffects(MediaPlayer player, int session) {
        releaseEffects();
        try {
            b = new Equalizer(0, session);
            b.setEnabled(true);
            for (Map.Entry<Short, Short> entry : o.entrySet()) b.setBandLevel(entry.getKey(), entry.getValue());
            d = new Virtualizer(0, session);
            d.setStrength(l);
            d.setEnabled(k && l > 0);
            e = new PresetReverb(0, session);
            e.setPreset(m);
            e.setEnabled(m != 0);
            player.attachAuxEffect(e.getId());
            player.setAuxEffectSendLevel(m == 0 ? 0.0f : 1.0f);
            f = new LoudnessEnhancer(session);
            f.setTargetGain(n);
            f.setEnabled(n > 0);
        } catch (RuntimeException error) {
            Log.w("MusicPlayer", "Audio effects unavailable", error);
        }
    }

    private static void releaseEffects() {
        if (b != null) { try { b.release(); } catch (RuntimeException ignored) { } b = null; }
        if (d != null) { try { d.release(); } catch (RuntimeException ignored) { } d = null; }
        if (e != null) { try { e.release(); } catch (RuntimeException ignored) { } e = null; }
        if (f != null) { try { f.release(); } catch (RuntimeException ignored) { } f = null; }
    }
}
