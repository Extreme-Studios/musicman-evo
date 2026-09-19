package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fp1 implements r63 {
    public final /* synthetic */ int a = 0;
    public final v63 b;
    public final do1 c;

    public fp1(do1 do1Var, q63 q63Var) {
        this.c = do1Var;
        this.b = q63Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        do1 do1Var = this.c;
        v63 v63Var = this.b;
        switch (i) {
            case 0:
                uq1 uq1Var = (uq1) do1Var.b.h;
                dq.D(uq1Var);
                return new ep1(uq1Var, (ae) v63Var.c());
            default:
                jr1 jr1Var = (jr1) v63Var.c();
                uq1 uq1Var2 = (uq1) do1Var.b.h;
                dq.D(uq1Var2);
                return new mp1(jr1Var, uq1Var2);
        }
    }

    public fp1(q63 q63Var, do1 do1Var) {
        this.b = q63Var;
        this.c = do1Var;
    }
}
