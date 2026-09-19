package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bf0 implements nd0 {
    public final /* synthetic */ int a;
    public final nd0 b;

    public bf0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ge0("image/png", 35152, 2);
                break;
            case 2:
                this.b = new kf0();
                break;
            default:
                this.b = new ge0("image/bmp", 16973, 2);
                break;
        }
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) {
        int i = this.a;
        nd0 nd0Var = this.b;
        switch (i) {
            case 0:
                return ((ge0) nd0Var).d(od0Var);
            case 1:
                return ((ge0) nd0Var).d(od0Var);
            default:
                return ((kf0) nd0Var).d(od0Var);
        }
    }

    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) {
        int i = this.a;
        nd0 nd0Var = this.b;
        switch (i) {
            case 0:
                return ((ge0) nd0Var).e(od0Var, rd0Var);
            case 1:
                return ((ge0) nd0Var).e(od0Var, rd0Var);
            default:
                return ((kf0) nd0Var).e(od0Var, rd0Var);
        }
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        int i = this.a;
        nd0 nd0Var = this.b;
        switch (i) {
            case 0:
                ((ge0) nd0Var).f(j, j2);
                break;
            case 1:
                ((ge0) nd0Var).f(j, j2);
                break;
            default:
                ((kf0) nd0Var).f(j, j2);
                break;
        }
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        int i = this.a;
        nd0 nd0Var = this.b;
        switch (i) {
            case 0:
                ((ge0) nd0Var).g(pd0Var);
                break;
            case 1:
                ((ge0) nd0Var).g(pd0Var);
                break;
            default:
                ((kf0) nd0Var).b = pd0Var;
                break;
        }
    }
}
