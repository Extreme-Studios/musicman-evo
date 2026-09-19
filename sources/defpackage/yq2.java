package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class yq2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        a = new js2(gq2.class, fi2.F);
        b = new hs2(j03VarA, ki2.D);
        c = new pr2(eq2.class, fi2.E);
        d = new mr2(j03VarA, ki2.E);
    }

    public static yw2 a(gp2 gp2Var) throws GeneralSecurityException {
        if (gp2Var.equals(gp2.k)) {
            return yw2.TINK;
        }
        if (gp2Var.equals(gp2.l)) {
            return yw2.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(gp2Var.g));
    }

    public static gp2 b(yw2 yw2Var) throws GeneralSecurityException {
        int iOrdinal = yw2Var.ordinal();
        if (iOrdinal == 1) {
            return gp2.k;
        }
        if (iOrdinal == 3) {
            return gp2.l;
        }
        int iA = yw2Var.a();
        throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
    }
}
