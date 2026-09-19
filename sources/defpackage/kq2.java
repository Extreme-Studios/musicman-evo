package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        a = new js2(yo2.class, fi2.v);
        b = new hs2(j03VarA, ki2.t);
        c = new pr2(so2.class, fi2.u);
        d = new mr2(j03VarA, ki2.u);
    }

    public static yw2 a(xo2 xo2Var) throws GeneralSecurityException {
        if (xo2.h == xo2Var) {
            return yw2.TINK;
        }
        if (xo2.i == xo2Var) {
            return yw2.CRUNCHY;
        }
        if (xo2.j == xo2Var) {
            return yw2.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(xo2Var)));
    }

    public static xo2 b(yw2 yw2Var) throws GeneralSecurityException {
        int iOrdinal = yw2Var.ordinal();
        if (iOrdinal == 1) {
            return xo2.h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return xo2.j;
            }
            if (iOrdinal != 4) {
                int iA = yw2Var.a();
                throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
            }
        }
        return xo2.i;
    }

    public static wo2 c(wv2 wv2Var) throws GeneralSecurityException {
        int iOrdinal = wv2Var.ordinal();
        if (iOrdinal == 1) {
            return wo2.h;
        }
        if (iOrdinal == 2) {
            return wo2.k;
        }
        if (iOrdinal == 3) {
            return wo2.j;
        }
        if (iOrdinal == 4) {
            return wo2.l;
        }
        if (iOrdinal == 5) {
            return wo2.i;
        }
        int iA = wv2Var.a();
        throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 26), "Unable to parse HashType: ", iA));
    }

    public static cw2 d(yo2 yo2Var) {
        wv2 wv2Var;
        bw2 bw2VarB = cw2.B();
        int i = yo2Var.d;
        bw2VarB.b();
        ((cw2) bw2VarB.g).E(i);
        wo2 wo2Var = yo2Var.f;
        if (wo2.h == wo2Var) {
            wv2Var = wv2.SHA1;
        } else if (wo2.i == wo2Var) {
            wv2Var = wv2.SHA224;
        } else if (wo2.j == wo2Var) {
            wv2Var = wv2.SHA256;
        } else if (wo2.k == wo2Var) {
            wv2Var = wv2.SHA384;
        } else {
            if (wo2.l != wo2Var) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(wo2Var)));
            }
            wv2Var = wv2.SHA512;
        }
        bw2VarB.b();
        ((cw2) bw2VarB.g).D(wv2Var);
        return (cw2) bw2VarB.c();
    }
}
