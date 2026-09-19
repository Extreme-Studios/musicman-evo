package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class zq2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        a = new js2(jq2.class, fi2.H);
        b = new hs2(j03VarA, ki2.F);
        c = new pr2(hq2.class, fi2.G);
        d = new mr2(j03VarA, ki2.G);
    }

    public static yw2 a(kp2 kp2Var) throws GeneralSecurityException {
        if (kp2.k == kp2Var) {
            return yw2.TINK;
        }
        if (kp2.l == kp2Var) {
            return yw2.CRUNCHY;
        }
        if (kp2.m == kp2Var) {
            return yw2.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(kp2Var.g));
    }

    public static kp2 b(yw2 yw2Var) throws GeneralSecurityException {
        int iOrdinal = yw2Var.ordinal();
        if (iOrdinal == 1) {
            return kp2.k;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return kp2.m;
            }
            if (iOrdinal != 4) {
                int iA = yw2Var.a();
                throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
            }
        }
        return kp2.l;
    }
}
