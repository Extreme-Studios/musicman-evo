package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class jc0 implements Choreographer.FrameCallback, Handler.Callback {
    public static final jc0 j = new jc0();
    public volatile long f = -9223372036854775807L;
    public final Handler g;
    public Choreographer h;
    public int i;

    public jc0() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = qz1.a;
        Handler handler = new Handler(looper, this);
        this.g = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.f = j2;
        Choreographer choreographer = this.h;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.h = Choreographer.getInstance();
            } catch (RuntimeException e) {
                s90.T("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 2) {
            Choreographer choreographer = this.h;
            if (choreographer != null) {
                int i2 = this.i + 1;
                this.i = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.h;
        if (choreographer2 != null) {
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f = -9223372036854775807L;
            }
        }
        return true;
    }
}
