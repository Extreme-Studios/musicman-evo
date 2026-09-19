package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class sq2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        a = new js2(op2.class, fi2.D);
        b = new hs2(j03VarA, ki2.B);
        c = new pr2(mp2.class, fi2.C);
        d = new mr2(j03VarA, ki2.C);
    }

    public static yw2 a(ao2 ao2Var) throws GeneralSecurityException {
        if (ao2.k == ao2Var) {
            return yw2.TINK;
        }
        if (ao2.l == ao2Var) {
            return yw2.CRUNCHY;
        }
        if (ao2.m == ao2Var) {
            return yw2.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ao2Var.g));
    }

    public static ao2 b(yw2 yw2Var) throws GeneralSecurityException {
        int iOrdinal = yw2Var.ordinal();
        if (iOrdinal == 1) {
            return ao2.k;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ao2.m;
            }
            if (iOrdinal != 4) {
                int iA = yw2Var.a();
                throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
            }
        }
        return ao2.l;
    }
}
