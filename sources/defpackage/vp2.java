package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class vp2 extends no2 {
    public final wp2 J;
    public final j03 K;
    public final Integer L;

    public vp2(wp2 wp2Var, j03 j03Var, Integer num) {
        this.J = wp2Var;
        this.K = j03Var;
        this.L = num;
    }

    public static vp2 J(wp2 wp2Var, Integer num) throws GeneralSecurityException {
        j03 j03VarB;
        bp2 bp2Var = wp2Var.a;
        if (bp2Var == bp2.l) {
            if (num != null) {
                j7.r("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            j03VarB = gs2.a;
        } else {
            if (bp2Var != bp2.k) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(bp2Var)));
            }
            if (num == null) {
                j7.r("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            j03VarB = gs2.b(num.intValue());
        }
        return new vp2(wp2Var, j03VarB, num);
    }

    @Override // defpackage.no2
    public final j03 I() {
        return this.K;
    }

    @Override // defpackage.a23
    public final /* synthetic */ ho2 u() {
        return this.J;
    }
}
