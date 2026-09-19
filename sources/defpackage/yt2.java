package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class yt2 extends a23 {
    public final zt2 J;
    public final gv1 K;

    public yt2(zt2 zt2Var, gv1 gv1Var) {
        this.J = zt2Var;
        this.K = gv1Var;
    }

    public static yt2 I(zt2 zt2Var, gv1 gv1Var) throws GeneralSecurityException {
        if (zt2Var.a == ((j03) gv1Var.g).a.length) {
            return new yt2(zt2Var, gv1Var);
        }
        j7.r("Key size mismatch");
        return null;
    }

    @Override // defpackage.a23
    public final /* synthetic */ ho2 u() {
        return this.J;
    }
}
