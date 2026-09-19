package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class tq1 implements Callable {
    public final vg2 a;
    public final Context b;
    public final es1 c;
    public final bw1 d;
    public final Executor e;
    public final zq0 f;
    public final d60 g;
    public final f82 h;
    public final hw1 i;
    public final k52 j;

    public tq1(Context context, Executor executor, zq0 zq0Var, d60 d60Var, vg2 vg2Var, bw1 bw1Var, f82 f82Var, es1 es1Var, hw1 hw1Var, k52 k52Var) {
        this.b = context;
        this.e = executor;
        this.f = zq0Var;
        this.g = d60Var;
        this.a = vg2Var;
        this.d = bw1Var;
        this.h = f82Var;
        this.c = es1Var;
        this.i = hw1Var;
        this.j = k52Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        uq1 uq1Var = new uq1(this);
        synchronized (uq1Var) {
            final String str = (String) tu0.e.c.a(lx0.e4);
            final zq0 zq0Var = uq1Var.f;
            final vg2 vg2Var = uq1Var.b;
            final hw1 hw1Var = uq1Var.k;
            final Context context = uq1Var.c;
            final k52 k52Var = uq1Var.l;
            final d60 d60Var = uq1Var.g;
            final es1 es1Var = uq1Var.d;
            qm2 qm2VarM = na1.M(na1.G(new wm2() { // from class: vd1
                @Override // defpackage.wm2
                public final hp a() throws wd1 {
                    ue0 ue0Var = vc3.C.d;
                    md1 md1VarP = ue0.p(context, new eg(0, 0, 0), "", false, false, zq0Var, null, d60Var, null, vg2Var, new cv0(), null, null, hw1Var, k52Var, es1Var);
                    yu0 yu0Var = new yu0(md1VarP);
                    md1VarP.e0().l = new ud1(yu0Var);
                    md1VarP.loadUrl(str);
                    return yu0Var;
                }
            }, za1.f), new zl0(2, uq1Var), uq1Var.e);
            uq1Var.m = qm2VarM;
            ej1.s(qm2VarM, "NativeJavascriptExecutor.initializeEngine");
        }
        return uq1Var;
    }
}
