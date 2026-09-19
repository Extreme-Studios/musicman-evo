package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class qq2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        a = new js2(lp2.class, fi2.B);
        b = new hs2(j03VarA, ki2.z);
        c = new pr2(ip2.class, fi2.A);
        d = new mr2(j03VarA, ki2.A);
    }

    public static yw2 a(kp2 kp2Var) throws GeneralSecurityException {
        if (kp2.h == kp2Var) {
            return yw2.TINK;
        }
        if (kp2.i == kp2Var) {
            return yw2.CRUNCHY;
        }
        if (kp2.j == kp2Var) {
            return yw2.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(kp2Var)));
    }

    public static kp2 b(yw2 yw2Var) throws GeneralSecurityException {
        int iOrdinal = yw2Var.ordinal();
        if (iOrdinal == 1) {
            return kp2.h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return kp2.j;
            }
            if (iOrdinal != 4) {
                int iA = yw2Var.a();
                throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
            }
        }
        return kp2.i;
    }
}
