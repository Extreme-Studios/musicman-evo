package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rc1 extends pc1 {
    @Override // defpackage.pc1
    public final boolean b(String str) {
        String strD = f32.d(str, "MD5");
        md1 md1Var = (md1) this.h.get();
        if (md1Var != null && strD != null) {
            md1Var.b1(strD, this);
        }
        jn.T("VideoStreamNoopCache is doing nothing.");
        m(str, strD, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // defpackage.pc1
    public final void l() {
    }
}
