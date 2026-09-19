package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.media.audiofx.BassBoost;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.media.audiofx.PresetReverb;
import android.media.audiofx.Virtualizer;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class xs {
    public static MediaPlayer a = null;
    public static Equalizer b = null;
    public static BassBoost c = null;
    public static Virtualizer d = null;
    public static PresetReverb e = null;
    public static LoudnessEnhancer f = null;
    public static int g = -1;
    public static boolean k;
    public static short l;
    public static short m;
    public static int n;
    public static boolean q;
    public static boolean w;
    public static List h = lh.f;
    public static int i = -1;
    public static boolean j = true;
    public static final LinkedHashMap o = new LinkedHashMap();
    public static final LinkedHashSet p = new LinkedHashSet();
    public static vs r = vs.f;
    public static float s = 1.0f;
    public static float t = 1.0f;
    public static int u = -1;
    public static int v = -1;

    public static void a() {
        try {
            MediaPlayer mediaPlayer = a;
            if (mediaPlayer != null) {
                PlaybackParams playbackParams = new PlaybackParams();
                playbackParams.setSpeed(s);
                playbackParams.setPitch(t);
                mediaPlayer.setPlaybackParams(playbackParams);
            }
        } catch (Exception e2) {
            Log.e("MusicPlayer", "Error applying playback params", e2);
        }
    }

    public static void b(Context context) {
        if (h.isEmpty()) {
            return;
        }
        if (!q) {
            if (i < h.size() - 1) {
                d(context, i + 1);
                return;
            } else {
                if (r == vs.g) {
                    d(context, 0);
                    return;
                }
                return;
            }
        }
        int iNextInt = i;
        if (h.size() > 1) {
            while (iNextInt == i) {
                x xVar = nw.f;
                iNextInt = nw.f.a().nextInt(h.size());
            }
        }
        d(context, iNextInt);
    }

    public static void c(Context context) {
        if (h.isEmpty()) {
            return;
        }
        int i2 = i;
        if (i2 > 0) {
            d(context, i2 - 1);
        } else if (r == vs.g) {
            d(context, h.size() - 1);
        }
    }

    public static void d(final Context context, int i2) {
        if (i2 < 0 || i2 >= h.size()) {
            return;
        }
        i = i2;
        j10 j10Var = (j10) h.get(i2);
        u = -1;
        v = -1;
        w = false;
        try {
            MediaPlayer mediaPlayer = a;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.release();
            }
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
            mediaPlayer2.setDataSource(context, j10Var.f);
            mediaPlayer2.prepare();
            int audioSessionId = mediaPlayer2.getAudioSessionId();
            if (g != audioSessionId) {
                g = audioSessionId;
                g(audioSessionId);
                Log.d("MusicPlayer", "Attached effects to new session: " + g);
            }
            PresetReverb presetReverb = e;
            if (presetReverb != null) {
                mediaPlayer2.attachAuxEffect(presetReverb.getId());
                mediaPlayer2.setAuxEffectSendLevel(m == 0 ? 0.0f : 1.0f);
            }
            a();
            mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: us
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer3) {
                    int i3 = ws.a[xs.r.ordinal()];
                    Context context2 = context;
                    if (i3 == 1) {
                        xs.d(context2, xs.i);
                    } else {
                        xs.b(context2);
                    }
                }
            });
            mediaPlayer2.start();
            Iterator it = x9.J(p).iterator();
            while (it.hasNext()) {
                try {
                    ((cl) it.next()).h(j10Var);
                } catch (Exception e2) {
                    Log.e("MusicPlayer", "Error notifying song change", e2);
                }
            }
            a = mediaPlayer2;
        } catch (Exception e3) {
            Log.e("MusicPlayer", "Error playing song: " + e3.getMessage(), e3);
        }
    }

    public static void e() {
        Equalizer equalizer = b;
        if (equalizer == null) {
            return;
        }
        short s2 = equalizer.getBandLevelRange()[0];
        short s3 = equalizer.getBandLevelRange()[1];
        for (Map.Entry entry : o.entrySet()) {
            short sShortValue = ((Number) entry.getKey()).shortValue();
            short sShortValue2 = ((Number) entry.getValue()).shortValue();
            if (sShortValue < equalizer.getNumberOfBands()) {
                if (s2 > s3) {
                    throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + '.');
                }
                if (sShortValue2 < s2) {
                    sShortValue2 = s2;
                } else if (sShortValue2 > s3) {
                    sShortValue2 = s3;
                }
                equalizer.setBandLevel(sShortValue, sShortValue2);
            }
        }
    }

    public static void f(short s2, short s3) {
        o.put(Short.valueOf(s2), Short.valueOf(s3));
        try {
            Equalizer equalizer = b;
            if (equalizer != null) {
                equalizer.setBandLevel(s2, s3);
            }
        } catch (Exception e2) {
            Log.e("MusicPlayer", "Error setting EQ band " + ((int) s2), e2);
        }
    }

    public static void g(int i2) {
        try {
            Equalizer equalizer = new Equalizer(0, i2);
            equalizer.setEnabled(true);
            b = equalizer;
            e();
            BassBoost bassBoost = new BassBoost(0, i2);
            bassBoost.setEnabled(j);
            bassBoost.setStrength((short) 1000);
            c = bassBoost;
            Virtualizer virtualizer = new Virtualizer(0, i2);
            if (virtualizer.getStrengthSupported()) {
                virtualizer.setStrength((short) 1000);
            }
            virtualizer.setEnabled(k);
            d = virtualizer;
            PresetReverb presetReverb = new PresetReverb(0, 0);
            presetReverb.setPreset(m);
            presetReverb.setEnabled(true);
            e = presetReverb;
            LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(i2);
            loudnessEnhancer.setTargetGain(n);
            loudnessEnhancer.setEnabled(true);
            f = loudnessEnhancer;
        } catch (Exception e2) {
            Log.e("MusicPlayer", "Error setting up effects", e2);
        }
    }
}
