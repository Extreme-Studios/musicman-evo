package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class mp2 extends no2 {
    public final op2 J;
    public final gv1 K;
    public final j03 L;
    public final Integer M;

    public mp2(op2 op2Var, gv1 gv1Var, j03 j03Var, Integer num) {
        this.J = op2Var;
        this.K = gv1Var;
        this.L = j03Var;
        this.M = num;
    }

    public static mp2 J(ao2 ao2Var, gv1 gv1Var, Integer num) throws GeneralSecurityException {
        j03 j03VarB;
        String str = ao2Var.g;
        j03 j03Var = (j03) gv1Var.g;
        ao2 ao2Var2 = ao2.m;
        if (ao2Var != ao2Var2 && num == null) {
            throw new GeneralSecurityException(ec.n(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (ao2Var == ao2Var2 && num != null) {
            j7.r("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (j03Var.a.length != 32) {
            int length = j03Var.a.length;
            throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(length).length() + 74), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length));
        }
        op2 op2Var = new op2(ao2Var);
        if (ao2Var == ao2Var2) {
            j03VarB = gs2.a;
        } else if (ao2Var == ao2.l) {
            j03VarB = gs2.a(num.intValue());
        } else {
            if (ao2Var != ao2.k) {
                j7.e("Unknown Variant: ".concat(str));
                return null;
            }
            j03VarB = gs2.b(num.intValue());
        }
        return new mp2(op2Var, gv1Var, j03VarB, num);
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
