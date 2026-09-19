package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n52 extends j31 {
    public final /* synthetic */ x52 f;

    public /* synthetic */ n52(x52 x52Var) {
        this.f = x52Var;
    }

    @Override // defpackage.s31
    public final void Q2(f93 f93Var, int i) {
        jn.M("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        f32.b.post(new ly1(10, this));
    }

    @Override // defpackage.s31
    public final void Z(f93 f93Var) {
        Q2(f93Var, 1);
    }

    @Override // defpackage.s31
    public final String d() {
        return null;
    }

    @Override // defpackage.s31
    public final boolean e() {
        return false;
    }

    @Override // defpackage.s31
    public final String f() {
        return null;
    }
}
