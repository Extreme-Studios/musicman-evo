package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class rx1 implements tw1 {
    public final Context b;
    public final jr1 c;
    public final i52 d;
    public final Executor e;
    public final d60 f;
    public final b21 g;
    public final hw1 i;
    public final cs1 j;
    public final es1 k;
    public final Object l;
    public final /* synthetic */ int a = 0;
    public final boolean h = ((Boolean) tu0.e.c.a(lx0.H9)).booleanValue();

    public rx1(Context context, d60 d60Var, i52 i52Var, Executor executor, sf1 sf1Var, jr1 jr1Var, b21 b21Var, hw1 hw1Var, cs1 cs1Var, es1 es1Var) {
        this.b = context;
        this.d = i52Var;
        this.l = sf1Var;
        this.e = executor;
        this.f = d60Var;
        this.c = jr1Var;
        this.g = b21Var;
        this.i = hw1Var;
        this.j = cs1Var;
        this.k = es1Var;
    }

    @Override // defpackage.tw1
    public final boolean a(e52 e52Var, x42 x42Var) {
        switch (this.a) {
            case 0:
                b52 b52Var = x42Var.s;
                return (b52Var == null || b52Var.a == null) ? false : true;
            default:
                b52 b52Var2 = x42Var.s;
                return (b52Var2 == null || b52Var2.a == null) ? false : true;
        }
    }

    @Override // defpackage.tw1
    public final hp b(e52 e52Var, x42 x42Var) {
        int i = this.a;
        Executor executor = this.e;
        switch (i) {
            case 0:
                pm2 pm2VarL = na1.L(kn2.g, new qn0(this, x42Var, e52Var, new el1(17, (byte) 0), 8), executor);
                pm2VarL.a(new t8(6), executor);
                return pm2VarL;
            default:
                pm2 pm2VarL2 = na1.L(kn2.g, new qn0(this, x42Var, e52Var, new el1(17, (byte) 0), 10), executor);
                pm2VarL2.a(new t8(7), executor);
                return pm2VarL2;
        }
    }

    public rx1(Context context, d60 d60Var, i52 i52Var, Executor executor, wf1 wf1Var, jr1 jr1Var, b21 b21Var, hw1 hw1Var, cs1 cs1Var, es1 es1Var) {
        this.b = context;
        this.d = i52Var;
        this.l = wf1Var;
        this.e = executor;
        this.f = d60Var;
        this.c = jr1Var;
        this.g = b21Var;
        this.i = hw1Var;
        this.j = cs1Var;
        this.k = es1Var;
    }
}
