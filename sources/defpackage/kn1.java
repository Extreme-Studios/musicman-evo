package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kn1 implements r63 {
    public final /* synthetic */ int a;
    public final us2 b;

    public /* synthetic */ kn1(us2 us2Var, int i) {
        this.a = i;
        this.b = us2Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        us2 us2Var = this.b;
        switch (i) {
            case 0:
                md1 md1Var = (md1) us2Var.h;
                if (md1Var == null) {
                    return null;
                }
                return md1Var.t();
            case 1:
                md1 md1Var2 = (md1) us2Var.h;
                if (md1Var2 != null) {
                    return md1Var2.t();
                }
                return null;
            default:
                return (md1) us2Var.h;
        }
    }
}
