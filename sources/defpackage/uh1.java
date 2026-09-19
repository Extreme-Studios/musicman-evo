package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh1 implements vl1 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ uh1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.vl1
    public final /* synthetic */ void a() {
        nf0 nf0VarX0;
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((nl1) obj).r();
                break;
            default:
                md1 md1Var = (md1) obj;
                if (md1Var != null && (nf0VarX0 = md1Var.x0()) != null) {
                    nf0VarX0.y();
                    break;
                }
                break;
        }
    }
}
