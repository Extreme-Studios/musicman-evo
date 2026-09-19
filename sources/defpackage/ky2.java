package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ky2 extends gz2 {
    public final hy2 J;
    public final j03 K;
    public final j03 L;
    public final Integer M;

    public ky2(hy2 hy2Var, j03 j03Var, j03 j03Var2, Integer num) {
        this.J = hy2Var;
        this.K = j03Var;
        this.L = j03Var2;
        this.M = num;
    }

    public static ky2 J(gy2 gy2Var, j03 j03Var, Integer num) throws GeneralSecurityException {
        j03 j03VarA;
        String str = gy2Var.a;
        byte[] bArr = j03Var.a;
        hy2 hy2Var = new hy2(gy2Var);
        gy2 gy2Var2 = gy2.e;
        if (gy2Var != gy2Var2 && num == null) {
            throw new GeneralSecurityException(ec.n(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (gy2Var == gy2Var2 && num != null) {
            j7.r("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(length).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", length));
        }
        if (gy2Var == gy2Var2) {
            j03VarA = gs2.a;
        } else if (gy2Var == gy2.c || gy2Var == gy2.d) {
            j03VarA = gs2.a(num.intValue());
        } else {
            if (gy2Var != gy2.b) {
                j7.e("Unknown Variant: ".concat(str));
                return null;
            }
            j03VarA = gs2.b(num.intValue());
        }
        return new ky2(hy2Var, j03Var, j03VarA, num);
    }

    @Override // defpackage.gz2
    public final j03 I() {
        return this.L;
    }

    @Override // defpackage.a23
    public final /* synthetic */ ho2 u() {
        return this.J;
    }
}
