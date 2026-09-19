package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class kc0 {
    public final qb0 a;
    public final ic0 b;
    public final jc0 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public kc0(Context context) {
        DisplayManager displayManager;
        qb0 qb0Var = new qb0();
        qb0Var.a = new pb0();
        qb0Var.b = new pb0();
        qb0Var.d = -9223372036854775807L;
        this.a = qb0Var;
        ic0 ic0Var = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new ic0(this, displayManager);
        this.b = ic0Var;
        this.c = ic0Var != null ? jc0.j : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final /* synthetic */ void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            s90.Q("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
        }
    }

    public final void b() {
        float f;
        if (Build.VERSION.SDK_INT < 30 || this.e == null) {
            return;
        }
        qb0 qb0Var = this.a;
        if (!qb0Var.a.b()) {
            f = this.f;
        } else if (qb0Var.a.b()) {
            pb0 pb0Var = qb0Var.a;
            long j = pb0Var.e;
            f = (float) (1.0E9d / (j != 0 ? pb0Var.f / j : 0L));
        } else {
            f = -1.0f;
        }
        float f2 = this.g;
        if (f != f2) {
            if (f != -1.0f && f2 != -1.0f) {
                float f3 = 1.0f;
                if (qb0Var.a.b()) {
                    if ((qb0Var.a.b() ? qb0Var.a.f : -9223372036854775807L) >= 5000000000L) {
                        f3 = 0.1f;
                    }
                }
                if (Math.abs(f - this.g) < f3) {
                    return;
                }
            } else if (f == -1.0f && qb0Var.e < 30) {
                return;
            }
            this.g = f;
            c(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    public final void c(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.h != f) {
            this.h = f;
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                s90.b0("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    public final void d() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e) {
            s90.b0("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
