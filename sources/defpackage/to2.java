package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class to2 {
    public static final /* synthetic */ to2 b = new to2(0);
    public static final /* synthetic */ to2 c = new to2(1);
    public static final /* synthetic */ to2 d = new to2(2);
    public static final /* synthetic */ to2 e = new to2(3);
    public static final /* synthetic */ to2 f = new to2(4);
    public static final /* synthetic */ to2 g = new to2(5);
    public static final /* synthetic */ to2 h = new to2(6);
    public static final /* synthetic */ to2 i = new to2(7);
    public static final /* synthetic */ to2 j = new to2(8);
    public static final /* synthetic */ to2 k = new to2(9);
    public static final /* synthetic */ to2 l = new to2(10);
    public static final /* synthetic */ to2 m = new to2(11);
    public static final /* synthetic */ to2 n = new to2(12);
    public static final /* synthetic */ to2 o = new to2(13);
    public static final /* synthetic */ to2 p = new to2(14);
    public static final /* synthetic */ to2 q = new to2(15);
    public final /* synthetic */ int a;

    public /* synthetic */ to2(int i2) {
        this.a = i2;
    }

    public final a23 a(ho2 ho2Var, Integer num) throws GeneralSecurityException {
        int i2 = 27;
        int i3 = 26;
        int i4 = 24;
        boolean z = false;
        switch (this.a) {
            case 0:
                yo2 yo2Var = (yo2) ho2Var;
                os2 os2Var = vo2.a;
                int i5 = yo2Var.a;
                if (i5 != 16 && i5 != 32) {
                    j7.r("AES key size must be 16 or 32 bytes");
                    return null;
                }
                u40 u40Var = new u40(19);
                u40Var.g = yo2Var;
                u40Var.j = num;
                u40Var.h = gv1.l(i5);
                u40Var.i = gv1.l(yo2Var.b);
                return u40Var.y();
            case 1:
                cp2 cp2Var = (cp2) ho2Var;
                os2 os2Var2 = ap2.a;
                int i6 = cp2Var.a;
                if (i6 == 24) {
                    j7.r("192 bit AES GCM Parameters are not valid");
                    return null;
                }
                p83 p83Var = new p83(i4, z);
                p83Var.g = cp2Var;
                p83Var.i = num;
                p83Var.h = gv1.l(i6);
                return p83Var.x();
            case 2:
                hp2 hp2Var = (hp2) ho2Var;
                os2 os2Var3 = fp2.a;
                int i7 = hp2Var.a;
                if (i7 == 24) {
                    j7.r("192 bit AES GCM Parameters are not valid");
                    return null;
                }
                r52 r52Var = new r52(27);
                r52Var.g = hp2Var;
                r52Var.i = num;
                r52Var.h = gv1.l(i7);
                return r52Var.L();
            case 3:
                lp2 lp2Var = (lp2) ho2Var;
                os2 os2Var4 = jp2.a;
                p83 p83Var2 = new p83(25, z);
                p83Var2.g = lp2Var;
                p83Var2.i = num;
                p83Var2.h = gv1.l(lp2Var.a);
                return p83Var2.y();
            case 4:
                os2 os2Var5 = np2.a;
                return mp2.J(((op2) ho2Var).a, gv1.l(32), num);
            case 5:
                os2 os2Var6 = pp2.a;
                return sp2.J((tp2) ho2Var, num);
            case 6:
                sr2 sr2Var = rp2.a;
                return vp2.J((wp2) ho2Var, num);
            case 7:
                return eq2.J((gq2) ho2Var, gv1.l(32), num);
            case 8:
                os2 os2Var7 = iq2.a;
                return hq2.J(((jq2) ho2Var).a, gv1.l(32), num);
            case 9:
                yr2 yr2Var = yr2.b;
                gw2 gw2Var = (gw2) ((wr2) ho2Var).a.h;
                lr2 lr2Var = lr2.d;
                sr2 sr2VarD = lr2Var.d(gw2Var.z());
                if (!((Boolean) lr2Var.b.get(gw2Var.z())).booleanValue()) {
                    j7.r("Creating new keys is not allowed.");
                    return null;
                }
                n13 n13VarA = gw2Var.A();
                sr2VarD.getClass();
                fw2 fw2VarD = gw2.D();
                fw2VarD.f(sr2VarD.a);
                fw2VarD.g(n13VarA);
                fw2VarD.h(yw2.RAW);
                gw2 gw2Var2 = (gw2) fw2VarD.c();
                us2 us2Var = new us2(gw2Var2, 0, ct2.b(gw2Var2.z()));
                fs2 fs2Var = fs2.b;
                ts2 ts2Var = (ts2) fs2Var.f(yr2.b.b(fs2Var.g(us2Var), null));
                dw2 dw2VarC = ew2.C();
                String str = (String) ts2Var.g;
                dw2VarC.b();
                ((ew2) dw2VarC.g).E(str);
                n13 n13Var = (n13) ts2Var.i;
                dw2VarC.b();
                ((ew2) dw2VarC.g).F(n13Var);
                int i8 = ts2Var.f;
                dw2VarC.b();
                ((ew2) dw2VarC.g).G(i8);
                ew2 ew2Var = (ew2) dw2VarC.c();
                return new vr2(ts2.j(ew2Var.z(), ew2Var.A(), ew2Var.B(), gw2Var.B(), num));
            case 10:
                gt2 gt2Var = (gt2) ho2Var;
                os2 os2Var8 = ft2.a;
                int i9 = gt2Var.a;
                if (i9 != 32) {
                    j7.r("AesCmacKey size wrong, must be 32 bytes");
                    return null;
                }
                p83 p83Var3 = new p83(i3, z);
                p83Var3.g = gt2Var;
                p83Var3.h = gv1.l(i9);
                p83Var3.i = num;
                return p83Var3.z();
            case 11:
                pt2 pt2Var = (pt2) ho2Var;
                os2 os2Var9 = mt2.a;
                p83 p83Var4 = new p83(i2, z);
                p83Var4.g = pt2Var;
                p83Var4.h = gv1.l(pt2Var.a);
                p83Var4.i = num;
                return p83Var4.A();
            case 12:
                by2 by2Var = (by2) ho2Var;
                os2 os2Var10 = fy2.a;
                ECParameterSpec eCParameterSpec = by2Var.b.b;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) a03.f.a.l("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
                dy2 dy2Var = new dy2();
                dy2Var.g = by2Var;
                dy2Var.f = num;
                dy2Var.h = eCPublicKey.getW();
                ey2 ey2VarA = dy2Var.a();
                z61 z61Var = new z61(26);
                z61Var.g = ey2VarA;
                z61Var.h = new w32(6, eCPrivateKey.getS());
                return z61Var.I();
            case 13:
                hy2 hy2Var = (hy2) ho2Var;
                os2 os2Var11 = jy2.a;
                byte[] bArrA = vs2.a(32);
                if (bArrA.length == 32) {
                    return iy2.I(ky2.J(hy2Var.a, j03.a(Arrays.copyOf(w40.d0(w40.m0(bArrA)), 32)), num), new gv1(12, j03.a(Arrays.copyOf(bArrA, bArrA.length))));
                }
                j7.p("Given secret seed length is not 32");
                return null;
            case 14:
                ty2 ty2Var = (ty2) ho2Var;
                os2 os2Var12 = wy2.a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) a03.f.a.l("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(ty2Var.a, new BigInteger(1, ty2Var.b.toByteArray())));
                KeyPair keyPairGenerateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair2.getPrivate();
                p83 p83Var5 = new p83(28, z);
                p83Var5.g = ty2Var;
                p83Var5.h = rSAPublicKey.getModulus();
                p83Var5.i = num;
                vy2 vy2VarB = p83Var5.B();
                m40 m40Var = new m40(false);
                m40Var.f = vy2VarB;
                w32 w32Var = new w32(6, rSAPrivateCrtKey.getPrimeP());
                w32 w32Var2 = new w32(6, rSAPrivateCrtKey.getPrimeQ());
                m40Var.h = w32Var;
                m40Var.i = w32Var2;
                m40Var.g = new w32(6, rSAPrivateCrtKey.getPrivateExponent());
                w32 w32Var3 = new w32(6, rSAPrivateCrtKey.getPrimeExponentP());
                w32 w32Var4 = new w32(6, rSAPrivateCrtKey.getPrimeExponentQ());
                m40Var.j = w32Var3;
                m40Var.k = w32Var4;
                m40Var.l = new w32(6, rSAPrivateCrtKey.getCrtCoefficient());
                return m40Var.e();
            default:
                az2 az2Var = (az2) ho2Var;
                os2 os2Var13 = dz2.a;
                KeyPairGenerator keyPairGenerator3 = (KeyPairGenerator) a03.f.a.l("RSA");
                keyPairGenerator3.initialize(new RSAKeyGenParameterSpec(az2Var.a, new BigInteger(1, az2Var.b.toByteArray())));
                KeyPair keyPairGenerateKeyPair3 = keyPairGenerator3.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) keyPairGenerateKeyPair3.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyPairGenerateKeyPair3.getPrivate();
                dy2 dy2Var2 = new dy2();
                dy2Var2.g = az2Var;
                dy2Var2.h = rSAPublicKey2.getModulus();
                dy2Var2.f = num;
                cz2 cz2VarD = dy2Var2.d();
                m40 m40Var2 = new m40(false);
                m40Var2.f = cz2VarD;
                w32 w32Var5 = new w32(6, rSAPrivateCrtKey2.getPrimeP());
                w32 w32Var6 = new w32(6, rSAPrivateCrtKey2.getPrimeQ());
                m40Var2.h = w32Var5;
                m40Var2.i = w32Var6;
                m40Var2.g = new w32(6, rSAPrivateCrtKey2.getPrivateExponent());
                w32 w32Var7 = new w32(6, rSAPrivateCrtKey2.getPrimeExponentP());
                w32 w32Var8 = new w32(6, rSAPrivateCrtKey2.getPrimeExponentQ());
                m40Var2.j = w32Var7;
                m40Var2.k = w32Var8;
                m40Var2.l = new w32(6, rSAPrivateCrtKey2.getCrtCoefficient());
                return m40Var2.f();
        }
    }
}
