package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kt2 implements ps2, is2, nr2, qr2, ks2, c03, w23 {
    public final /* synthetic */ int f;
    public static final /* synthetic */ kt2 g = new kt2(0);
    public static final /* synthetic */ kt2 h = new kt2(1);
    public static final /* synthetic */ kt2 i = new kt2(2);
    public static final /* synthetic */ kt2 j = new kt2(3);
    public static final /* synthetic */ kt2 k = new kt2(4);
    public static final /* synthetic */ kt2 l = new kt2(5);
    public static final /* synthetic */ kt2 m = new kt2(7);
    public static final /* synthetic */ kt2 n = new kt2(8);
    public static final /* synthetic */ kt2 o = new kt2(9);
    public static final /* synthetic */ kt2 p = new kt2(10);
    public static final /* synthetic */ kt2 q = new kt2(11);
    public static final /* synthetic */ kt2 r = new kt2(12);
    public static final /* synthetic */ kt2 s = new kt2(13);
    public static final /* synthetic */ kt2 t = new kt2(14);
    public static final /* synthetic */ kt2 u = new kt2(15);
    public static final /* synthetic */ kt2 v = new kt2(16);
    public static final /* synthetic */ kt2 w = new kt2(17);
    public static final /* synthetic */ kt2 x = new kt2(18);
    public static final /* synthetic */ kt2 y = new kt2(19);
    public static final /* synthetic */ kt2 z = new kt2(20);
    public static final /* synthetic */ kt2 A = new kt2(21);
    public static final /* synthetic */ kt2 B = new kt2(22);
    public static final /* synthetic */ kt2 C = new kt2(23);

    public /* synthetic */ kt2(int i2) {
        this.f = i2;
    }

    @Override // defpackage.c03
    public /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        switch (this.f) {
            case 24:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 25:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // defpackage.ps2
    public ts2 b(a23 a23Var) throws GeneralSecurityException {
        switch (this.f) {
            case 12:
                ey2 ey2Var = (ey2) a23Var;
                return ts2.j("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", hz2.f(ey2Var).a(), 4, hz2.a(ey2Var.J.d), ey2Var.M);
            case 13:
                cy2 cy2Var = (cy2) a23Var;
                js2 js2Var = hz2.a;
                int iD = hz2.d(cy2Var.J.J.b);
                nv2 nv2VarD = ov2.D();
                ey2 ey2Var2 = cy2Var.J;
                qv2 qv2VarF = hz2.f(ey2Var2);
                nv2VarD.b();
                ((ov2) nv2VarD.g).F(qv2VarF);
                byte[] bArrL0 = w40.l0((BigInteger) cy2Var.K.g, iD);
                l13 l13Var = n13.g;
                l13 l13VarN = n13.n(bArrL0, 0, bArrL0.length);
                nv2VarD.b();
                ((ov2) nv2VarD.g).G(l13VarN);
                return ts2.j("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((ov2) nv2VarD.c()).a(), 3, hz2.a(ey2Var2.J.d), ey2Var2.M);
            case 14:
            case 17:
            case 20:
            default:
                bz2 bz2Var = (bz2) a23Var;
                js2 js2Var2 = rz2.a;
                mx2 mx2VarI = nx2.I();
                mx2VarI.b();
                ((nx2) mx2VarI.g).K();
                px2 px2VarB = rz2.b(bz2Var.J);
                mx2VarI.b();
                ((nx2) mx2VarI.g).L(px2VarB);
                byte[] bArrC0 = w40.c0((BigInteger) bz2Var.K.g);
                l13 l13Var2 = n13.g;
                l13 l13VarN2 = n13.n(bArrC0, 0, bArrC0.length);
                mx2VarI.b();
                ((nx2) mx2VarI.g).M(l13VarN2);
                byte[] bArrC1 = w40.c0((BigInteger) bz2Var.L.g);
                l13 l13VarN3 = n13.n(bArrC1, 0, bArrC1.length);
                mx2VarI.b();
                ((nx2) mx2VarI.g).N(l13VarN3);
                byte[] bArrC2 = w40.c0((BigInteger) bz2Var.M.g);
                l13 l13VarN4 = n13.n(bArrC2, 0, bArrC2.length);
                mx2VarI.b();
                ((nx2) mx2VarI.g).O(l13VarN4);
                byte[] bArrC3 = w40.c0((BigInteger) bz2Var.N.g);
                l13 l13VarN5 = n13.n(bArrC3, 0, bArrC3.length);
                mx2VarI.b();
                ((nx2) mx2VarI.g).P(l13VarN5);
                byte[] bArrC4 = w40.c0((BigInteger) bz2Var.O.g);
                l13 l13VarN6 = n13.n(bArrC4, 0, bArrC4.length);
                mx2VarI.b();
                ((nx2) mx2VarI.g).Q(l13VarN6);
                byte[] bArrC5 = w40.c0((BigInteger) bz2Var.P.g);
                l13 l13VarN7 = n13.n(bArrC5, 0, bArrC5.length);
                mx2VarI.b();
                ((nx2) mx2VarI.g).R(l13VarN7);
                l13 l13VarA = ((nx2) mx2VarI.c()).a();
                z61 z61Var = rz2.g;
                cz2 cz2Var = bz2Var.J;
                return ts2.j("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", l13VarA, 3, (yw2) z61Var.D(cz2Var.J.c), cz2Var.M);
            case 15:
                ky2 ky2Var = (ky2) a23Var;
                return ts2.j("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", kz2.a(ky2Var).a(), 4, (yw2) kz2.g.D(ky2Var.J.a), ky2Var.M);
            case 16:
                iy2 iy2Var = (iy2) a23Var;
                js2 js2Var3 = kz2.a;
                sv2 sv2VarD = tv2.D();
                vv2 vv2VarA = kz2.a(iy2Var.J);
                sv2VarD.b();
                ((tv2) sv2VarD.g).G(vv2VarA);
                byte[] bArrB = ((j03) iy2Var.K.g).b();
                l13 l13VarN8 = n13.n(bArrB, 0, bArrB.length);
                sv2VarD.b();
                ((tv2) sv2VarD.g).F(l13VarN8);
                l13 l13VarA2 = ((tv2) sv2VarD.c()).a();
                z61 z61Var2 = kz2.g;
                ky2 ky2Var2 = iy2Var.J;
                return ts2.j("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", l13VarA2, 3, (yw2) z61Var2.D(ky2Var2.J.a), ky2Var2.M);
            case 18:
                vy2 vy2Var = (vy2) a23Var;
                return ts2.j("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", oz2.a(vy2Var).a(), 4, (yw2) oz2.g.D(vy2Var.J.c), vy2Var.M);
            case 19:
                uy2 uy2Var = (uy2) a23Var;
                js2 js2Var4 = oz2.a;
                ex2 ex2VarI = fx2.I();
                ex2VarI.b();
                ((fx2) ex2VarI.g).K();
                hx2 hx2VarA = oz2.a(uy2Var.J);
                ex2VarI.b();
                ((fx2) ex2VarI.g).L(hx2VarA);
                byte[] bArrC6 = w40.c0((BigInteger) uy2Var.K.g);
                l13 l13Var3 = n13.g;
                l13 l13VarN9 = n13.n(bArrC6, 0, bArrC6.length);
                ex2VarI.b();
                ((fx2) ex2VarI.g).M(l13VarN9);
                byte[] bArrC7 = w40.c0((BigInteger) uy2Var.L.g);
                l13 l13VarN10 = n13.n(bArrC7, 0, bArrC7.length);
                ex2VarI.b();
                ((fx2) ex2VarI.g).N(l13VarN10);
                byte[] bArrC8 = w40.c0((BigInteger) uy2Var.M.g);
                l13 l13VarN11 = n13.n(bArrC8, 0, bArrC8.length);
                ex2VarI.b();
                ((fx2) ex2VarI.g).O(l13VarN11);
                byte[] bArrC9 = w40.c0((BigInteger) uy2Var.N.g);
                l13 l13VarN12 = n13.n(bArrC9, 0, bArrC9.length);
                ex2VarI.b();
                ((fx2) ex2VarI.g).P(l13VarN12);
                byte[] bArrC10 = w40.c0((BigInteger) uy2Var.O.g);
                l13 l13VarN13 = n13.n(bArrC10, 0, bArrC10.length);
                ex2VarI.b();
                ((fx2) ex2VarI.g).Q(l13VarN13);
                byte[] bArrC11 = w40.c0((BigInteger) uy2Var.P.g);
                l13 l13VarN14 = n13.n(bArrC11, 0, bArrC11.length);
                ex2VarI.b();
                ((fx2) ex2VarI.g).R(l13VarN14);
                l13 l13VarA3 = ((fx2) ex2VarI.c()).a();
                z61 z61Var3 = oz2.g;
                vy2 vy2Var2 = uy2Var.J;
                return ts2.j("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", l13VarA3, 3, (yw2) z61Var3.D(vy2Var2.J.c), vy2Var2.M);
            case zw0.zzm /* 21 */:
                cz2 cz2Var2 = (cz2) a23Var;
                return ts2.j("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", rz2.b(cz2Var2).a(), 4, (yw2) rz2.g.D(cz2Var2.J.c), cz2Var2.M);
        }
    }

    @Override // defpackage.is2
    public ho2 c(us2 us2Var) throws GeneralSecurityException {
        switch (this.f) {
            case 2:
                js2 js2Var = wt2.a;
                gw2 gw2Var = (gw2) us2Var.h;
                if (!gw2Var.z().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    j7.p("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var.z())));
                    return null;
                }
                try {
                    n13 n13VarA = gw2Var.A();
                    v13 v13Var = v13.a;
                    int i2 = h13.a;
                    fu2 fu2VarB = fu2.B(n13VarA, v13.b);
                    r52 r52Var = new r52(29);
                    r52Var.A(fu2VarB.z());
                    r52Var.F(fu2VarB.A().z());
                    r52Var.i = wt2.b(gw2Var.B());
                    return r52Var.M();
                } catch (o23 e) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
                }
            default:
                z61 z61Var = xt2.a;
                gw2 gw2Var2 = (gw2) us2Var.h;
                if (!gw2Var2.z().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    j7.p("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var2.z())));
                    return null;
                }
                try {
                    n13 n13VarA2 = gw2Var2.A();
                    v13 v13Var2 = v13.a;
                    int i3 = h13.a;
                    aw2 aw2VarC = aw2.C(n13VarA2, v13.b);
                    if (aw2VarC.B() != 0) {
                        int iB = aw2VarC.B();
                        throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iB).length() + 47), "Parsing HmacParameters failed: unknown Version ", iB));
                    }
                    u40 u40Var = new u40(21);
                    u40Var.j(aw2VarC.A());
                    u40Var.p(aw2VarC.z().A());
                    u40Var.i = (nt2) xt2.b.H(aw2VarC.z().z());
                    u40Var.j = (ot2) xt2.a.H(gw2Var2.B());
                    return u40Var.A();
                } catch (o23 e2) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e2);
                }
        }
    }

    @Override // defpackage.ks2
    public us2 d(ho2 ho2Var) {
        switch (this.f) {
            case 14:
                by2 by2Var = (by2) ho2Var;
                js2 js2Var = hz2.a;
                fw2 fw2VarD = gw2.D();
                fw2VarD.f("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
                jv2 jv2VarB = kv2.B();
                mv2 mv2VarE = hz2.e(by2Var);
                jv2VarB.b();
                ((kv2) jv2VarB.g).C(mv2VarE);
                fw2VarD.g(((kv2) jv2VarB.c()).a());
                fw2VarD.h(hz2.a(by2Var.d));
                return us2.o((gw2) fw2VarD.c());
            case 17:
                js2 js2Var2 = kz2.a;
                fw2 fw2VarD2 = gw2.D();
                fw2VarD2.f("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                fw2VarD2.g(rv2.B().a());
                fw2VarD2.h((yw2) kz2.g.D(((hy2) ho2Var).a));
                return us2.o((gw2) fw2VarD2.c());
            case 20:
                ty2 ty2Var = (ty2) ho2Var;
                js2 js2Var3 = oz2.a;
                fw2 fw2VarD3 = gw2.D();
                fw2VarD3.f("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                ax2 ax2VarD = bx2.D();
                cx2 cx2VarA = dx2.A();
                wv2 wv2Var = (wv2) oz2.h.D(ty2Var.d);
                cx2VarA.b();
                ((dx2) cx2VarA.g).C(wv2Var);
                dx2 dx2Var = (dx2) cx2VarA.c();
                ax2VarD.b();
                ((bx2) ax2VarD.g).E(dx2Var);
                int i2 = ty2Var.a;
                ax2VarD.b();
                ((bx2) ax2VarD.g).F(i2);
                byte[] bArrC0 = w40.c0(ty2Var.b);
                l13 l13Var = n13.g;
                l13 l13VarN = n13.n(bArrC0, 0, bArrC0.length);
                ax2VarD.b();
                ((bx2) ax2VarD.g).G(l13VarN);
                fw2VarD3.g(((bx2) ax2VarD.c()).a());
                fw2VarD3.h((yw2) oz2.g.D(ty2Var.c));
                return us2.o((gw2) fw2VarD3.c());
            default:
                az2 az2Var = (az2) ho2Var;
                js2 js2Var4 = rz2.a;
                fw2 fw2VarD4 = gw2.D();
                fw2VarD4.f("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
                ix2 ix2VarD = jx2.D();
                lx2 lx2VarA = rz2.a(az2Var);
                ix2VarD.b();
                ((jx2) ix2VarD.g).E(lx2VarA);
                int i3 = az2Var.a;
                ix2VarD.b();
                ((jx2) ix2VarD.g).F(i3);
                byte[] bArrC1 = w40.c0(az2Var.b);
                l13 l13Var2 = n13.g;
                l13 l13VarN2 = n13.n(bArrC1, 0, bArrC1.length);
                ix2VarD.b();
                ((jx2) ix2VarD.g).G(l13VarN2);
                fw2VarD4.g(((jx2) ix2VarD.c()).a());
                fw2VarD4.h((yw2) rz2.g.D(az2Var.c));
                return us2.o((gw2) fw2VarD4.c());
        }
    }

    @Override // defpackage.nr2
    public a23 e(ts2 ts2Var) throws GeneralSecurityException {
        boolean z2 = false;
        switch (this.f) {
            case 3:
                js2 js2Var = wt2.a;
                if (!((String) ts2Var.g).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    j7.p("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                    return null;
                }
                try {
                    n13 n13Var = (n13) ts2Var.i;
                    v13 v13Var = v13.a;
                    int i2 = h13.a;
                    du2 du2VarC = du2.C(n13Var, v13.b);
                    if (du2VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    r52 r52Var = new r52(29);
                    r52Var.A(du2VarC.A().d());
                    r52Var.F(du2VarC.B().z());
                    r52Var.i = wt2.b((yw2) ts2Var.j);
                    gt2 gt2VarM = r52Var.M();
                    p83 p83Var = new p83(26, z2);
                    p83Var.g = gt2VarM;
                    p83Var.h = gv1.h(du2VarC.A().p());
                    p83Var.i = (Integer) ts2Var.k;
                    return p83Var.z();
                } catch (IllegalArgumentException | o23 unused) {
                    j7.r("Parsing AesCmacKey failed");
                    return null;
                }
            default:
                z61 z61Var = xt2.a;
                if (!((String) ts2Var.g).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    j7.p("Wrong type URL in call to HmacProtoSerialization.parseKey");
                    return null;
                }
                try {
                    n13 n13Var2 = (n13) ts2Var.i;
                    v13 v13Var2 = v13.a;
                    int i3 = h13.a;
                    yv2 yv2VarC = yv2.C(n13Var2, v13.b);
                    if (yv2VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    u40 u40Var = new u40(21);
                    u40Var.j(yv2VarC.B().d());
                    u40Var.p(yv2VarC.A().A());
                    u40Var.i = (nt2) xt2.b.H(yv2VarC.A().z());
                    u40Var.j = (ot2) xt2.a.H((yw2) ts2Var.j);
                    pt2 pt2VarA = u40Var.A();
                    p83 p83Var2 = new p83(27, z2);
                    p83Var2.g = pt2VarA;
                    p83Var2.h = gv1.h(yv2VarC.B().p());
                    p83Var2.i = (Integer) ts2Var.k;
                    return p83Var2.A();
                } catch (IllegalArgumentException | o23 unused2) {
                    j7.r("Parsing HmacKey failed");
                    return null;
                }
        }
    }

    @Override // defpackage.w23
    public boolean f(Class cls) {
        return false;
    }

    @Override // defpackage.w23
    public f33 h(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.ps2
    public Object b(a23 a23Var) throws GeneralSecurityException {
        KeyFactory keyFactory;
        byte[] bArr;
        byte[] bArr2;
        switch (this.f) {
            case 0:
                ht2 ht2Var = new ht2();
                if (jn.r(2)) {
                    return ht2Var;
                }
                j7.r("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                return null;
            case 1:
                ts2 ts2Var = ((vr2) a23Var).J;
                int[] iArr = tr2.b;
                int i2 = ts2Var.f;
                Integer num = (Integer) ts2Var.k;
                int i3 = iArr[ec.z(i2)];
                int iOrdinal = ((yw2) ts2Var.j).ordinal();
                if (iOrdinal == 1) {
                    gs2.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    gs2.a(num.intValue()).b();
                } else if (iOrdinal == 3) {
                    gs2.a.b();
                } else {
                    if (iOrdinal != 4) {
                        j7.r("unknown output prefix type");
                        return null;
                    }
                    gs2.a(num.intValue()).b();
                }
                return new tt2();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                cz2 cz2Var = (cz2) a23Var;
                z61 z61Var = i03.a;
                try {
                    return sz2.d(cz2Var);
                } catch (NoSuchProviderException unused) {
                    KeyFactory keyFactory2 = (KeyFactory) a03.g.a.l("RSA");
                    BigInteger bigInteger = cz2Var.K;
                    az2 az2Var = cz2Var.J;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory2.generatePublic(new RSAPublicKeySpec(bigInteger, az2Var.b));
                    z61 z61Var2 = i03.a;
                    return new h03(rSAPublicKey, (d03) z61Var2.D(az2Var.d), (d03) z61Var2.D(az2Var.e), az2Var.f, cz2Var.L.b(), az2Var.c.equals(zy2.d) ? i03.c : i03.b);
                }
            case 7:
                ey2 ey2Var = (ey2) a23Var;
                byte[] bArr3 = jz2.g;
                Provider providerS = ar.s();
                z61 z61Var3 = jz2.k;
                by2 by2Var = ey2Var.J;
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(ey2Var.K, ej1.t((wz2) z61Var3.D(by2Var.b)));
                if (providerS != null) {
                    keyFactory = KeyFactory.getInstance("EC", providerS);
                } else {
                    keyFactory = (KeyFactory) a03.g.a.l("EC");
                }
                ECPublicKey eCPublicKey = (ECPublicKey) keyFactory.generatePublic(eCPublicKeySpec);
                d03 d03Var = (d03) jz2.i.D(by2Var.c);
                xz2 xz2Var = (xz2) jz2.j.D(by2Var.a);
                byte[] bArrB = ey2Var.L.b();
                if (by2Var.d != bp2.o) {
                    bArr = jz2.g;
                } else {
                    bArr = jz2.h;
                }
                return new jz2(eCPublicKey, d03Var, xz2Var, bArrB, bArr, providerS);
            case 8:
                ky2 ky2Var = (ky2) a23Var;
                if (jn.r(1)) {
                    try {
                        return mz2.b(ky2Var);
                    } catch (GeneralSecurityException unused2) {
                        byte[] bArrB2 = ky2Var.K.b();
                        byte[] bArrB3 = ky2Var.L.b();
                        if (ky2Var.J.a != gy2.d) {
                            bArr2 = new byte[0];
                        } else {
                            bArr2 = new byte[]{0};
                        }
                        return new nz2(bArrB2, bArrB3, bArr2);
                    }
                }
                j7.r("Can not use Ed25519 in FIPS-mode.");
                return null;
            case 9:
                ts2 ts2Var2 = ((vr2) a23Var).J;
                int i4 = tr2.b[ec.z(ts2Var2.f)];
                return new nz2((jo2) lr2.d.b(jo2.class, (String) ts2Var2.g).a((n13) ts2Var2.i), nz2.b(ts2Var2), ((yw2) ts2Var2.j).equals(yw2.LEGACY) ? new byte[]{0} : new byte[0]);
            case 10:
                return g03.b((vy2) a23Var);
        }
    }
}
