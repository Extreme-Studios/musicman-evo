package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public abstract class hz2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;
    public static final pr2 e;
    public static final mr2 f;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        j03 j03VarA2 = ct2.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        a = new js2(by2.class, kt2.t);
        b = new hs2(j03VarA, et2.r);
        c = new pr2(ey2.class, kt2.r);
        d = new mr2(j03VarA2, et2.s);
        e = new pr2(cy2.class, kt2.s);
        f = new mr2(j03VarA, et2.t);
    }

    public static yw2 a(bp2 bp2Var) throws GeneralSecurityException {
        if (bp2.m == bp2Var) {
            return yw2.TINK;
        }
        if (bp2.n == bp2Var) {
            return yw2.CRUNCHY;
        }
        if (bp2.p == bp2Var) {
            return yw2.RAW;
        }
        if (bp2.o == bp2Var) {
            return yw2.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(bp2Var.g));
    }

    public static wo2 b(wv2 wv2Var) throws GeneralSecurityException {
        int iOrdinal = wv2Var.ordinal();
        if (iOrdinal == 2) {
            return wo2.p;
        }
        if (iOrdinal == 3) {
            return wo2.o;
        }
        if (iOrdinal == 4) {
            return wo2.q;
        }
        int iA = wv2Var.a();
        throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 26), "Unable to parse HashType: ", iA));
    }

    public static bp2 c(yw2 yw2Var) throws GeneralSecurityException {
        int iOrdinal = yw2Var.ordinal();
        if (iOrdinal == 1) {
            return bp2.m;
        }
        if (iOrdinal == 2) {
            return bp2.o;
        }
        if (iOrdinal == 3) {
            return bp2.p;
        }
        if (iOrdinal == 4) {
            return bp2.n;
        }
        int iA = yw2Var.a();
        throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
    }

    public static int d(zx2 zx2Var) {
        if (zx2.c.equals(zx2Var)) {
            return 33;
        }
        if (zx2.d.equals(zx2Var)) {
            return 49;
        }
        if (zx2.e.equals(zx2Var)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zx2Var.a));
    }

    public static mv2 e(by2 by2Var) {
        wv2 wv2Var;
        int i;
        lv2 lv2VarA = mv2.A();
        wo2 wo2Var = by2Var.c;
        if (wo2.o == wo2Var) {
            wv2Var = wv2.SHA256;
        } else if (wo2.p == wo2Var) {
            wv2Var = wv2.SHA384;
        } else {
            if (wo2.q != wo2Var) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(wo2Var.g));
            }
            wv2Var = wv2.SHA512;
        }
        lv2VarA.b();
        ((mv2) lv2VarA.g).C(wv2Var);
        zx2 zx2Var = by2Var.b;
        int i2 = 4;
        if (zx2.c.equals(zx2Var)) {
            i = 4;
        } else if (zx2.d.equals(zx2Var)) {
            i = 5;
        } else {
            if (!zx2.e.equals(zx2Var)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zx2Var.a));
            }
            i = 6;
        }
        lv2VarA.b();
        ((mv2) lv2VarA.g).F(i);
        xo2 xo2Var = by2Var.a;
        if (xo2.q == xo2Var) {
            i2 = 3;
        } else if (xo2.r != xo2Var) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(xo2Var.g));
        }
        lv2VarA.b();
        ((mv2) lv2VarA.g).G(i2);
        return (mv2) lv2VarA.c();
    }

    public static qv2 f(ey2 ey2Var) {
        int iD = d(ey2Var.J.b);
        ECPoint eCPoint = ey2Var.K;
        pv2 pv2VarE = qv2.E();
        mv2 mv2VarE = e(ey2Var.J);
        pv2VarE.b();
        ((qv2) pv2VarE.g).H(mv2VarE);
        byte[] bArrL0 = w40.l0(eCPoint.getAffineX(), iD);
        l13 l13Var = n13.g;
        l13 l13VarN = n13.n(bArrL0, 0, bArrL0.length);
        pv2VarE.b();
        ((qv2) pv2VarE.g).I(l13VarN);
        byte[] bArrL1 = w40.l0(eCPoint.getAffineY(), iD);
        l13 l13VarN2 = n13.n(bArrL1, 0, bArrL1.length);
        pv2VarE.b();
        ((qv2) pv2VarE.g).J(l13VarN2);
        return (qv2) pv2VarE.c();
    }

    public static zx2 g(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return zx2.c;
        }
        if (i2 == 3) {
            return zx2.d;
        }
        if (i2 == 4) {
            return zx2.e;
        }
        if (i != 1) {
            throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(i2).length() + 35), "Unable to parse EllipticCurveType: ", i2));
        }
        j7.p("Can't get the number of an unknown enum value.");
        return null;
    }

    public static xo2 h(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return xo2.q;
        }
        if (i2 == 2) {
            return xo2.r;
        }
        if (i != 1) {
            throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(i2).length() + 40), "Unable to parse EcdsaSignatureEncoding: ", i2));
        }
        j7.p("Can't get the number of an unknown enum value.");
        return null;
    }
}
