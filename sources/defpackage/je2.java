package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class je2 implements md2 {
    public final vc2 a;
    public final ie2 b;
    public final ud2 c;
    public final ExecutorService d;
    public final dh2 e;
    public final AtomicReference f = new AtomicReference();

    public je2(vc2 vc2Var, ie2 ie2Var, ud2 ud2Var, ExecutorService executorService, dh2 dh2Var) {
        this.a = vc2Var;
        this.b = ie2Var;
        this.c = ud2Var;
        this.d = executorService;
        this.e = dh2Var;
    }

    @Override // defpackage.md2
    public final hp a() {
        vc2 vc2Var = this.a;
        int iA = vc2Var.A();
        boolean zC = vc2Var.C();
        ie2 ie2Var = this.b;
        ie2Var.getClass();
        fn2 fn2VarR = fn2.r(na1.F(new he2(ie2Var, iA), ie2Var.d));
        kg0 kg0Var = kg0.o;
        cn2 cn2Var = cn2.f;
        pm2 pm2VarL = na1.L(fn2VarR, kg0Var, cn2Var);
        if (zC && iA != 2) {
            pm2VarL = na1.L(na1.I(fn2.r(pm2VarL), Throwable.class, lh0.w, cn2Var), new r21(ie2Var), cn2Var);
        }
        qm2 qm2VarM = na1.M(fn2.r(pm2VarL), new zl0(10, this), cn2Var);
        qm2VarM.a(new in2(qm2VarM, 0, new gv1(9, this)), this.d);
        return qm2VarM;
    }
}
