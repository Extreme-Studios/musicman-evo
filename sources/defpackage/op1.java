package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class op1 implements lk1 {
    public final ro1 f;
    public final so1 g;
    public final Executor h;
    public final Executor i;

    public op1(ro1 ro1Var, so1 so1Var, Executor executor, ya1 ya1Var) {
        this.f = ro1Var;
        this.g = so1Var;
        this.h = executor;
        this.i = ya1Var;
    }

    @Override // defpackage.lk1
    public final void B0() {
        hp hpVar;
        hp hpVar2;
        cb1 cb1Var;
        if (this.g.e) {
            ro1 ro1Var = this.f;
            qw1 qw1VarK = ro1Var.k();
            if (qw1VarK == null) {
                synchronized (ro1Var) {
                    hpVar = ro1Var.m;
                }
                if (hpVar != null && ((Boolean) tu0.e.c.a(lx0.N5)).booleanValue()) {
                    synchronized (ro1Var) {
                        hpVar2 = ro1Var.m;
                    }
                    synchronized (ro1Var) {
                        cb1Var = ro1Var.n;
                    }
                    if (hpVar2 == null || cb1Var == null) {
                        return;
                    }
                    ym2 ym2Var = new ym2(vj2.n(new hp[]{hpVar2, cb1Var}), false);
                    ym2Var.a(new in2(ym2Var, 0, new oc2(24, this)), this.i);
                    return;
                }
            }
            if (qw1VarK != null) {
                md1 md1VarJ = ro1Var.j();
                md1 md1VarH = ro1Var.h();
                if (md1VarJ == null) {
                    md1VarJ = md1VarH == null ? null : md1VarH;
                }
                if (md1VarJ != null) {
                    this.h.execute(new xd1(md1VarJ, 5));
                }
            }
        }
    }
}
