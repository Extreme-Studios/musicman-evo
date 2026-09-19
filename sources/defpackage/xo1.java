package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xo1 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final yj1 c;

    public xo1(yj1 yj1Var, v63 v63Var) {
        this.a = 2;
        this.c = yj1Var;
        this.b = v63Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.b;
        yj1 yj1Var = this.c;
        switch (i) {
            case 0:
                return new z91(((xe1) v63Var).a(), yj1Var.a().g);
            case 1:
                return new c02((ae) v63Var.c(), 0, yj1Var.a());
            default:
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new g02(ya1Var, yj1Var.a(), ((ff1) v63Var).c(), 1);
        }
    }

    public /* synthetic */ xo1(v63 v63Var, yj1 yj1Var, int i) {
        this.a = i;
        this.b = v63Var;
        this.c = yj1Var;
    }
}
