package defpackage;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class rb1 {
    public long b;
    public final long a = TimeUnit.MILLISECONDS.toNanos(((Long) tu0.e.c.a(lx0.P)).longValue());
    public boolean c = true;

    public final void a(SurfaceTexture surfaceTexture, pb1 pb1Var) {
        if (pb1Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.c) {
            long j = timestamp - this.b;
            if (Math.abs(j) < this.a) {
                return;
            }
        }
        this.c = false;
        this.b = timestamp;
        zb3.l.post(new mb1(pb1Var, 3));
    }
}
