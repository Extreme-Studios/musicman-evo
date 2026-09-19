package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class oq2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        a = new js2(hp2.class, fi2.z);
        b = new hs2(j03VarA, ki2.x);
        c = new pr2(dp2.class, fi2.y);
        d = new mr2(j03VarA, ki2.y);
    }

    public static yw2 a(gp2 gp2Var) throws GeneralSecurityException {
        if (gp2.h == gp2Var) {
            return yw2.TINK;
        }
        if (gp2.i == gp2Var) {
            return yw2.CRUNCHY;
        }
        if (gp2.j == gp2Var) {
            return yw2.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(gp2Var)));
    }

    public static gp2 b(yw2 yw2Var) throws GeneralSecurityException {
        int iOrdinal = yw2Var.ordinal();
        if (iOrdinal == 1) {
            return gp2.h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return gp2.j;
            }
            if (iOrdinal != 4) {
                int iA = yw2Var.a();
                throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
            }
        }
        return gp2.i;
    }
}
