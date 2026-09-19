package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mq1 implements r63 {
    public final /* synthetic */ int a;
    public final ti1 b;
    public final q12 c;
    public final tz0 d;

    public /* synthetic */ mq1(ti1 ti1Var, q12 q12Var, tz0 tz0Var, int i) {
        this.a = i;
        this.b = ti1Var;
        this.c = q12Var;
        this.d = tz0Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        tz0 tz0Var = this.d;
        q12 q12Var = this.c;
        ti1 ti1Var = this.b;
        switch (i) {
            case 0:
                return new lq1((String) ti1Var.b.i, (no1) q12Var.c(), tz0Var.a());
            default:
                return new nq1((String) ti1Var.b.i, (no1) q12Var.c(), tz0Var.a());
        }
    }
}
