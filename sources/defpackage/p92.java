package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class p92 implements j92 {
    public static p92 d;
    public float a;
    public f92 b;
    public i92 c;

    public static p92 a() {
        if (d == null) {
            p92 p92Var = new p92();
            p92Var.a = 0.0f;
            d = p92Var;
        }
        return d;
    }

    @Override // defpackage.j92
    public final void b(boolean z) {
        if (z) {
            z92.f.getClass();
            z92.b();
            return;
        }
        z92.f.getClass();
        Handler handler = z92.h;
        if (handler != null) {
            handler.removeCallbacks(z92.j);
            z92.h = null;
        }
    }
}
