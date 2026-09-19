package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class iy2 extends fz2 {
    public final ky2 J;
    public final gv1 K;

    public iy2(ky2 ky2Var, gv1 gv1Var) {
        this.J = ky2Var;
        this.K = gv1Var;
    }

    public static iy2 I(ky2 ky2Var, gv1 gv1Var) throws GeneralSecurityException {
        j03 j03Var = (j03) gv1Var.g;
        if (j03Var.a.length != 32) {
            int length = j03Var.a.length;
            throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(length).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", length));
        }
        if (Arrays.equals(ky2Var.K.b(), w40.d0(w40.m0(j03Var.b())))) {
            return new iy2(ky2Var, gv1Var);
        }
        j7.r("Ed25519 keys mismatch");
        return null;
    }

    @Override // defpackage.a23
    public final ho2 u() {
        return this.J.J;
    }
}
