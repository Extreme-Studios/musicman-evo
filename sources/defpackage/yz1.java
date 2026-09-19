package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yz1 implements j22 {
    public final /* synthetic */ int a;
    public final boolean b;

    public /* synthetic */ yz1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((rj1) obj).a.putString("adid_p", true != z ? "0" : "1");
                break;
            case 1:
                ((rj1) obj).a.putBoolean("ibrr", z);
                break;
            default:
                rj1 rj1Var = (rj1) obj;
                if (z) {
                    rj1Var.a.putBoolean("sdk_prefetch", true);
                }
                break;
        }
    }
}
