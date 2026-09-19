package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class hq2 extends no2 {
    public final jq2 J;
    public final gv1 K;
    public final j03 L;
    public final Integer M;

    public hq2(jq2 jq2Var, gv1 gv1Var, j03 j03Var, Integer num) {
        this.J = jq2Var;
        this.K = gv1Var;
        this.L = j03Var;
        this.M = num;
    }

    public static hq2 J(kp2 kp2Var, gv1 gv1Var, Integer num) throws GeneralSecurityException {
        j03 j03VarB;
        String str = kp2Var.g;
        j03 j03Var = (j03) gv1Var.g;
        kp2 kp2Var2 = kp2.m;
        if (kp2Var != kp2Var2 && num == null) {
            throw new GeneralSecurityException(ec.n(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (kp2Var == kp2Var2 && num != null) {
            j7.r("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (j03Var.a.length != 32) {
            int length = j03Var.a.length;
            throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(length).length() + 75), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length));
        }
        jq2 jq2Var = new jq2(kp2Var);
        if (kp2Var == kp2Var2) {
            j03VarB = gs2.a;
        } else if (kp2Var == kp2.l) {
            j03VarB = gs2.a(num.intValue());
        } else {
            if (kp2Var != kp2.k) {
                j7.e("Unknown Variant: ".concat(str));
                return null;
            }
            j03VarB = gs2.b(num.intValue());
        }
        return new hq2(jq2Var, gv1Var, j03VarB, num);
    }

    @Override // defpackage.no2
    public final j03 I() {
        return this.L;
    }

    @Override // defpackage.a23
    public final /* synthetic */ ho2 u() {
        return this.J;
    }
}
