package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class hq1 {
    public final i52 a;
    public final Executor b;
    public final jr1 c;
    public final xq1 d;
    public final Context e;
    public final es1 f;
    public final f82 g;
    public final bw1 h;
    public final cs1 i;
    public final os1 j;

    public hq1(i52 i52Var, Executor executor, jr1 jr1Var, Context context, es1 es1Var, f82 f82Var, bw1 bw1Var, xq1 xq1Var, cs1 cs1Var, os1 os1Var) {
        this.a = i52Var;
        this.b = executor;
        this.c = jr1Var;
        this.e = context;
        this.f = es1Var;
        this.g = f82Var;
        this.h = bw1Var;
        this.d = xq1Var;
        this.i = cs1Var;
        this.j = os1Var;
    }

    public static final void b(md1 md1Var) {
        md1Var.t0("/videoClicked", u11.d);
        he1 he1VarE0 = md1Var.e0();
        synchronized (he1VarE0.i) {
            he1VarE0.w = true;
        }
        md1Var.t0("/getNativeAdViewSignals", u11.n);
        md1Var.t0("/getNativeClickMeta", u11.o);
    }

    public final void a(md1 md1Var, vs0 vs0Var, d91 d91Var) {
        os1 os1Var;
        b(md1Var);
        md1Var.t0("/video", u11.g);
        md1Var.t0("/videoMeta", u11.h);
        md1Var.t0("/precache", new m11(26));
        md1Var.t0("/delayPageLoaded", u11.k);
        md1Var.t0("/instrument", u11.i);
        md1Var.t0("/log", u11.c);
        md1Var.t0("/click", new s11(null, 0, null));
        if (this.a.b != null) {
            he1 he1VarE0 = md1Var.e0();
            synchronized (he1VarE0.i) {
                he1VarE0.y = true;
            }
            md1Var.t0("/open", new f21(true != ((Boolean) tu0.e.c.a(lx0.pe)).booleanValue() ? null : vs0Var, null, null, null, null, null));
        } else {
            he1 he1VarE1 = md1Var.e0();
            synchronized (he1VarE1.i) {
                he1VarE1.y = false;
            }
        }
        if (vc3.C.y.a(md1Var.getContext())) {
            HashMap map = new HashMap();
            if (md1Var.E() != null) {
                map = md1Var.E().w0;
            }
            md1Var.t0("/logScionEvent", new s11(md1Var.getContext(), 1, map));
        }
        ix0 ix0Var = lx0.pe;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            md1Var.e0().B = vs0Var;
            md1Var.e0().D = d91Var;
        }
        if (!((Boolean) tu0Var.c.a(lx0.l8)).booleanValue() || (os1Var = this.j) == null) {
            return;
        }
        md1Var.t0("/onDeviceStorageEvent", new i11(3, os1Var));
    }
}
