package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class xp2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        a = new js2(wp2.class, fi2.s);
        b = new hs2(j03VarA, ki2.q);
        c = new pr2(vp2.class, fi2.r);
        d = new mr2(j03VarA, ki2.r);
    }

    public static xw2 a(wp2 wp2Var) {
        byte[] bArrB = ((gw2) ((us2) fs2.b.h(wp2Var.d)).h).b();
        try {
            v13 v13Var = v13.a;
            int i = h13.a;
            gw2 gw2VarC = gw2.C(bArrB, v13.b);
            ww2 ww2VarC = xw2.C();
            String str = wp2Var.b;
            ww2VarC.b();
            ((xw2) ww2VarC.g).E(str);
            ww2VarC.b();
            ((xw2) ww2VarC.g).F(gw2VarC);
            return (xw2) ww2VarC.c();
        } catch (o23 e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static wp2 b(xw2 xw2Var, yw2 yw2Var) throws GeneralSecurityException {
        xo2 xo2Var;
        bp2 bp2Var = bp2.l;
        xo2 xo2Var2 = xo2.p;
        xo2 xo2Var3 = xo2.o;
        xo2 xo2Var4 = xo2.n;
        xo2 xo2Var5 = xo2.l;
        xo2 xo2Var6 = xo2.m;
        xo2 xo2Var7 = xo2.k;
        fw2 fw2VarD = gw2.D();
        fw2VarD.f(xw2Var.A().z());
        fw2VarD.g(xw2Var.A().A());
        fw2VarD.h(yw2.RAW);
        ho2 ho2VarX = yd.x(((gw2) fw2VarD.c()).b());
        if (ho2VarX instanceof hp2) {
            xo2Var = xo2Var7;
        } else if (ho2VarX instanceof op2) {
            xo2Var = xo2Var6;
        } else if (ho2VarX instanceof jq2) {
            xo2Var = xo2Var5;
        } else if (ho2VarX instanceof yo2) {
            xo2Var = xo2Var4;
        } else if (ho2VarX instanceof cp2) {
            xo2Var = xo2Var3;
        } else {
            if (!(ho2VarX instanceof lp2)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(ho2VarX.toString()));
            }
            xo2Var = xo2Var2;
        }
        int iOrdinal = yw2Var.ordinal();
        if (iOrdinal == 1) {
            bp2Var = bp2.k;
        } else if (iOrdinal != 3) {
            int iA = yw2Var.a();
            throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
        }
        String strZ = xw2Var.z();
        oo2 oo2Var = (oo2) ho2VarX;
        if (strZ == null) {
            j7.r("kekUri must be set");
            return null;
        }
        if (oo2Var == null) {
            j7.r("dekParametersForNewKeys must be set");
            return null;
        }
        if (oo2Var.a()) {
            j7.r("dekParametersForNewKeys must not have ID Requirements");
            return null;
        }
        if ((xo2Var == xo2Var7 && (oo2Var instanceof hp2)) || ((xo2Var == xo2Var6 && (oo2Var instanceof op2)) || ((xo2Var == xo2Var5 && (oo2Var instanceof jq2)) || ((xo2Var == xo2Var4 && (oo2Var instanceof yo2)) || ((xo2Var == xo2Var3 && (oo2Var instanceof cp2)) || (xo2Var == xo2Var2 && (oo2Var instanceof lp2))))))) {
            return new wp2(bp2Var, strZ, xo2Var, oo2Var);
        }
        String str = xo2Var.g;
        String strValueOf = String.valueOf(oo2Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + str.length() + 67 + 1);
        ec.x(sb, "Cannot use parsing strategy ", str, " when new keys are picked according to ", strValueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }
}
