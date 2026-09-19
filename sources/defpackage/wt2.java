package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class wt2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = new js2(gt2.class, et2.j);
        b = new hs2(j03VarA, kt2.i);
        c = new pr2(dt2.class, et2.i);
        d = new mr2(j03VarA, kt2.j);
    }

    public static yw2 a(ao2 ao2Var) throws GeneralSecurityException {
        if (ao2.n == ao2Var) {
            return yw2.TINK;
        }
        if (ao2.o == ao2Var) {
            return yw2.CRUNCHY;
        }
        if (ao2.q == ao2Var) {
            return yw2.RAW;
        }
        if (ao2.p == ao2Var) {
            return yw2.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ao2Var)));
    }

    public static ao2 b(yw2 yw2Var) throws GeneralSecurityException {
        int iOrdinal = yw2Var.ordinal();
        if (iOrdinal == 1) {
            return ao2.n;
        }
        if (iOrdinal == 2) {
            return ao2.p;
        }
        if (iOrdinal == 3) {
            return ao2.q;
        }
        if (iOrdinal == 4) {
            return ao2.o;
        }
        int iA = yw2Var.a();
        throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
    }
}
