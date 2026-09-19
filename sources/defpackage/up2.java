package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class up2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        a = new js2(tp2.class, fi2.q);
        b = new hs2(j03VarA, ki2.o);
        c = new pr2(sp2.class, fi2.p);
        d = new mr2(j03VarA, ki2.p);
    }

    public static wo2 a(yw2 yw2Var) throws GeneralSecurityException {
        int iOrdinal = yw2Var.ordinal();
        if (iOrdinal == 1) {
            return wo2.m;
        }
        if (iOrdinal == 3) {
            return wo2.n;
        }
        int iA = yw2Var.a();
        throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
    }
}
