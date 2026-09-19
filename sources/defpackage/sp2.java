package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class sp2 extends no2 {
    public final tp2 J;
    public final j03 K;
    public final Integer L;

    public sp2(tp2 tp2Var, j03 j03Var, Integer num) {
        this.J = tp2Var;
        this.K = j03Var;
        this.L = num;
    }

    public static sp2 J(tp2 tp2Var, Integer num) throws GeneralSecurityException {
        j03 j03VarA;
        wo2 wo2Var = tp2Var.b;
        if (wo2Var == wo2.m) {
            if (num == null) {
                j7.r("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            j03VarA = j03.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (wo2Var != wo2.n) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(wo2Var.g));
            }
            if (num != null) {
                j7.r("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            j03VarA = j03.a(new byte[0]);
        }
        return new sp2(tp2Var, j03VarA, num);
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
