package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa implements rk {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ oa(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.rk
    public final Object a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((c4) obj).reportFullyDrawn();
                return null;
            case 1:
                return ss0.m((d70) obj);
            default:
                bz bzVar = (bz) obj;
                bzVar.e().a(new pw(0, bzVar));
                return k50.a;
        }
    }
}
