package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ho1 implements r63 {
    public final /* synthetic */ int a;
    public final tz0 b;

    public /* synthetic */ ho1(tz0 tz0Var, int i) {
        this.a = i;
        this.b = tz0Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        tz0 tz0Var = this.b;
        switch (i) {
            case 0:
                return new go1(tz0Var.a());
            default:
                return new ar1(tz0Var.a());
        }
    }
}
