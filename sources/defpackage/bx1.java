package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bx1 implements tw1 {
    public final nf1 a;
    public final jr1 b;
    public final i52 c;
    public final Executor d;
    public final d60 e;
    public final b21 f;
    public final boolean g = ((Boolean) tu0.e.c.a(lx0.H9)).booleanValue();
    public final hw1 h;
    public final cs1 i;
    public final es1 j;

    public bx1(nf1 nf1Var, Executor executor, jr1 jr1Var, i52 i52Var, d60 d60Var, b21 b21Var, hw1 hw1Var, cs1 cs1Var, es1 es1Var) {
        this.a = nf1Var;
        this.d = executor;
        this.b = jr1Var;
        this.c = i52Var;
        this.e = d60Var;
        this.f = b21Var;
        this.h = hw1Var;
        this.i = cs1Var;
        this.j = es1Var;
    }

    @Override // defpackage.tw1
    public final boolean a(e52 e52Var, x42 x42Var) {
        b52 b52Var = x42Var.s;
        return (b52Var == null || b52Var.a == null) ? false : true;
    }

    @Override // defpackage.tw1
    public final hp b(e52 e52Var, x42 x42Var) {
        el1 el1Var = new el1(17, (byte) 0);
        kn2 kn2Var = kn2.g;
        qn0 qn0Var = new qn0(this, x42Var, e52Var, el1Var, 4);
        Executor executor = this.d;
        pm2 pm2VarL = na1.L(kn2Var, qn0Var, executor);
        pm2VarL.a(new t8(5), executor);
        return pm2VarL;
    }
}
