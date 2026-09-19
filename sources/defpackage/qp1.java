package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qp1 implements r63 {
    public final /* synthetic */ int a;
    public final r52 b;

    public /* synthetic */ qp1(r52 r52Var, int i) {
        this.a = i;
        this.b = r52Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        r52 r52Var = this.b;
        switch (i) {
            case 0:
                return (s41) r52Var.i;
            case 1:
                return (t41) r52Var.h;
            default:
                return (v41) r52Var.g;
        }
    }
}
