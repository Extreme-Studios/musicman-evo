package defpackage;

import android.media.MediaPlayer;
import android.widget.SeekBar;
import android.widget.TextView;
import com.extremestudios.musicmanevo.PlayerActivity;

public class q7 implements Runnable {
    public Object g;
    public q7() {}
    public q7(int i, Object obj) {
        this.g = obj;
    }

    @Override
    public void run() {
        // This runnable is used by PlayerActivity for the playback clock.  The
        // recovered source had an empty body, leaving the UI permanently at 0:00.
        if (!(g instanceof PlayerActivity)) return;

        PlayerActivity activity = (PlayerActivity) g;
        MediaPlayer player = xs.a;
        try {
            if (player != null && xs.isPrepared) {
                int duration = player.getDuration();
                int position = player.getCurrentPosition();

                // Keep an active A-B loop inside its selected range.
                if (xs.w && xs.v > xs.u && position >= xs.v) {
                    player.seekTo(xs.u);
                    position = xs.u;
                }

                SeekBar seekBar = activity.E;
                TextView currentTime = activity.F;
                TextView totalTime = activity.G;
                if (duration > 0) {
                    seekBar.setMax(duration);
                    seekBar.setProgress(Math.min(position, duration));
                    totalTime.setText(PlayerActivity.r(duration));
                }
                currentTime.setText(PlayerActivity.r(Math.max(0, position)));
                activity.u();
            } else {
                // A MediaPlayer error leaves no usable duration or position.
                // Reset stale UI instead of making the controls look functional.
                activity.E.setMax(0);
                activity.E.setProgress(0);
                activity.F.setText(PlayerActivity.r(0));
                activity.G.setText(PlayerActivity.r(0));
                activity.u();
            }
        } catch (IllegalStateException ignored) {
            // MediaPlayer is still preparing or was replaced; retry below.
        }

        activity.W.postDelayed(this, 200L);
    }
}
