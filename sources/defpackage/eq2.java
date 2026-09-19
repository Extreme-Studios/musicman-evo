package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class eq2 extends no2 {
    public final gq2 J;
    public final gv1 K;
    public final j03 L;
    public final Integer M;

    public eq2(gq2 gq2Var, gv1 gv1Var, j03 j03Var, Integer num) {
        this.J = gq2Var;
        this.K = gv1Var;
        this.L = j03Var;
        this.M = num;
    }

    public static eq2 J(gq2 gq2Var, gv1 gv1Var, Integer num) throws GeneralSecurityException {
        j03 j03VarB;
        j03 j03Var = (j03) gv1Var.g;
        gp2 gp2Var = gq2Var.a;
        gp2 gp2Var2 = gp2.l;
        if (gp2Var != gp2Var2 && num == null) {
            String str = gp2Var.g;
            throw new GeneralSecurityException(ec.n(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (gp2Var == gp2Var2 && num != null) {
            j7.r("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (j03Var.a.length != 32) {
            int length = j03Var.a.length;
            throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(length).length() + 68), "XAesGcmKey key must be constructed with key of length 32 bytes, not ", length));
        }
        if (gp2Var == gp2Var2) {
            j03VarB = gs2.a;
        } else {
            if (gp2Var != gp2.k) {
                j7.e("Unknown Variant: ".concat(gp2Var.g));
                return null;
            }
            j03VarB = gs2.b(num.intValue());
        }
        return new eq2(gq2Var, gv1Var, j03VarB, num);
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
