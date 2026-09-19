package defpackage;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.ECPoint;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class et2 implements ps2, qr2, ks2, is2, nr2, c03 {
    public final /* synthetic */ int f;
    public static final /* synthetic */ et2 g = new et2(0);
    public static final /* synthetic */ et2 h = new et2(1);
    public static final /* synthetic */ et2 i = new et2(3);
    public static final /* synthetic */ et2 j = new et2(4);
    public static final /* synthetic */ et2 k = new et2(5);
    public static final /* synthetic */ et2 l = new et2(6);
    public static final /* synthetic */ et2 m = new et2(7);
    public static final /* synthetic */ et2 n = new et2(8);
    public static final /* synthetic */ et2 o = new et2(9);
    public static final /* synthetic */ et2 p = new et2(10);
    public static final /* synthetic */ et2 q = new et2(11);
    public static final /* synthetic */ et2 r = new et2(12);
    public static final /* synthetic */ et2 s = new et2(13);
    public static final /* synthetic */ et2 t = new et2(14);
    public static final /* synthetic */ et2 u = new et2(15);
    public static final /* synthetic */ et2 v = new et2(16);
    public static final /* synthetic */ et2 w = new et2(17);
    public static final /* synthetic */ et2 x = new et2(18);
    public static final /* synthetic */ et2 y = new et2(19);
    public static final /* synthetic */ et2 z = new et2(20);
    public static final /* synthetic */ et2 A = new et2(21);
    public static final /* synthetic */ et2 B = new et2(22);
    public static final /* synthetic */ et2 C = new et2(23);

    public /* synthetic */ et2(int i2) {
        this.f = i2;
    }

    public static final l23 f(long j2, Object obj) {
        l23 l23Var = (l23) u33.k(j2, obj);
        if (((g13) l23Var).f) {
            return l23Var;
        }
        int size = l23Var.size();
        l23 l23VarZ = l23Var.z(size == 0 ? 10 : size + size);
        u33.l(obj, j2, l23VarZ);
        return l23VarZ;
    }

    public static final u23 g(Object obj, Object obj2) {
        u23 u23VarA = (u23) obj;
        u23 u23Var = (u23) obj2;
        if (!u23Var.isEmpty()) {
            if (!u23VarA.f) {
                u23VarA = u23VarA.a();
            }
            u23VarA.c();
            if (!u23Var.isEmpty()) {
                u23VarA.putAll(u23Var);
            }
        }
        return u23VarA;
    }

    @Override // defpackage.c03
    public /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        switch (this.f) {
            case 24:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 25:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 26:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // defpackage.ps2
    public Object b(a23 a23Var) throws GeneralSecurityException {
        switch (this.f) {
            case 0:
                dt2 dt2Var = (dt2) a23Var;
                os2 os2Var = ft2.a;
                if (dt2Var.J.a == 32) {
                    return new f03(dt2Var);
                }
                j7.r("AesCmacKey size wrong, must be 32 bytes");
                return null;
            case 1:
                return new f03((jt2) a23Var);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                bz2 bz2Var = (bz2) a23Var;
                try {
                    return lz2.b(bz2Var);
                } catch (NoSuchProviderException unused) {
                    KeyFactory keyFactory = (KeyFactory) a03.g.a.l("RSA");
                    cz2 cz2Var = bz2Var.J;
                    cz2 cz2Var2 = bz2Var.J;
                    BigInteger bigInteger = cz2Var.K;
                    az2 az2Var = cz2Var2.J;
                    az2 az2Var2 = cz2Var2.J;
                    RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, az2Var.b, (BigInteger) bz2Var.K.g, (BigInteger) bz2Var.L.g, (BigInteger) bz2Var.M.g, (BigInteger) bz2Var.N.g, (BigInteger) bz2Var.O.g, (BigInteger) bz2Var.P.g));
                    z61 z61Var = i03.a;
                    d03 d03Var = (d03) z61Var.D(az2Var2.d);
                    d03 d03Var2 = (d03) z61Var.D(az2Var2.e);
                    cz2Var2.L.b();
                    lz2 lz2Var = new lz2();
                    if (cr2.a()) {
                        j7.r("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                        return null;
                    }
                    yd.y(d03Var);
                    if (!d03Var.equals(d03Var2)) {
                        j7.r("sigHash and mgf1Hash must be the same");
                        return null;
                    }
                    yd.B(rSAPrivateCrtKey.getModulus().bitLength());
                    yd.D(rSAPrivateCrtKey.getPublicExponent());
                    return lz2Var;
                }
            case 7:
                cy2 cy2Var = (cy2) a23Var;
                Provider providerS = ar.s();
                d03 d03Var3 = (d03) jz2.i.D(cy2Var.J.J.c);
                z61 z61Var2 = jz2.j;
                ey2 ey2Var = cy2Var.J;
                ey2Var.L.b();
                lz2 lz2Var2 = new lz2();
                if (!jn.r(2)) {
                    j7.r("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
                    return null;
                }
                yd.y(d03Var3);
                d03Var3.toString().concat("withECDSA");
                return lz2Var2;
            case 8:
                iy2 iy2Var = (iy2) a23Var;
                if (!jn.r(1)) {
                    j7.r("Can not use Ed25519 in FIPS-mode.");
                    return null;
                }
                try {
                    return lz2.a(iy2Var);
                } catch (GeneralSecurityException unused2) {
                    gv1 gv1Var = iy2Var.K;
                    ky2 ky2Var = iy2Var.J;
                    byte[] bArrB = ((j03) gv1Var.g).b();
                    ky2Var.L.b();
                    lz2 lz2Var3 = new lz2();
                    if (!jn.r(1)) {
                        j7.r("Can not use Ed25519 in FIPS-mode.");
                        return null;
                    }
                    if (bArrB.length == 32) {
                        w40.d0(w40.m0(bArrB));
                        return lz2Var3;
                    }
                    j7.p("Given private key's length is not 32");
                    return null;
                }
            case 9:
                ts2 ts2Var = ((vr2) a23Var).J;
                int i2 = tr2.b[ec.z(ts2Var.f)];
                nz2.b(ts2Var);
                ((yw2) ts2Var.j).equals(yw2.LEGACY);
                return new lz2();
            case 10:
                uy2 uy2Var = (uy2) a23Var;
                int i3 = ct2.a;
                if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    (Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? Integer.valueOf(Build.VERSION.SDK_INT) : null).getClass();
                }
                Provider providerS2 = ar.s();
                KeyFactory keyFactory2 = providerS2 != null ? KeyFactory.getInstance("RSA", providerS2) : (KeyFactory) a03.g.a.l("RSA");
                vy2 vy2Var = uy2Var.J;
                BigInteger bigInteger2 = vy2Var.K;
                ty2 ty2Var = vy2Var.J;
                pz2 pz2Var = new pz2((RSAPrivateCrtKey) keyFactory2.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger2, ty2Var.b, (BigInteger) uy2Var.K.g, (BigInteger) uy2Var.L.g, (BigInteger) uy2Var.M.g, (BigInteger) uy2Var.N.g, (BigInteger) uy2Var.O.g, (BigInteger) uy2Var.P.g)), ty2Var.d, vy2Var.L.b(), ty2Var.c.equals(sy2.d) ? pz2.h : pz2.g, providerS2 != null ? qz2.c(vy2Var, providerS2) : g03.b(vy2Var), providerS2);
                Provider provider = pz2Var.f;
                String str = pz2Var.b;
                Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) a03.d.a.l(str);
                signature.initSign(pz2Var.a);
                byte[] bArr = pz2.i;
                signature.update(bArr);
                byte[] bArr2 = pz2Var.d;
                if (bArr2.length > 0) {
                    signature.update(bArr2);
                }
                byte[] bArrSign = signature.sign();
                byte[] bArr3 = pz2Var.c;
                if (bArr3.length > 0) {
                    bArrSign = na1.x(bArr3, bArrSign);
                }
                try {
                    pz2Var.e.a(bArrSign, bArr);
                    return pz2Var;
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException("RSA signature computation error", e);
                }
        }
    }

    @Override // defpackage.is2
    public ho2 c(us2 us2Var) throws GeneralSecurityException {
        switch (this.f) {
            case 12:
                js2 js2Var = hz2.a;
                gw2 gw2Var = (gw2) us2Var.h;
                if (!gw2Var.z().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    j7.p("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var.z())));
                    return null;
                }
                try {
                    n13 n13VarA = gw2Var.A();
                    v13 v13Var = v13.a;
                    int i2 = h13.a;
                    kv2 kv2VarA = kv2.A(n13VarA, v13.b);
                    y91 y91Var = new y91(21);
                    y91Var.i = hz2.b(kv2VarA.z().z());
                    y91Var.g = hz2.h(kv2VarA.z().E());
                    y91Var.h = hz2.g(kv2VarA.z().D());
                    y91Var.j = hz2.c(gw2Var.B());
                    return y91Var.G();
                } catch (o23 e) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
                }
            case 15:
                js2 js2Var2 = kz2.a;
                gw2 gw2Var2 = (gw2) us2Var.h;
                if (!gw2Var2.z().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    j7.p("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var2.z())));
                    return null;
                }
                try {
                    n13 n13VarA2 = gw2Var2.A();
                    v13 v13Var2 = v13.a;
                    int i3 = h13.a;
                    if (rv2.A(n13VarA2, v13.b).z() == 0) {
                        return new hy2((gy2) kz2.g.H(gw2Var2.B()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (o23 e2) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e2);
                }
            case 18:
                js2 js2Var3 = oz2.a;
                gw2 gw2Var3 = (gw2) us2Var.h;
                if (!gw2Var3.z().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    j7.p("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var3.z())));
                    return null;
                }
                try {
                    n13 n13VarA3 = gw2Var3.A();
                    v13 v13Var3 = v13.a;
                    int i4 = h13.a;
                    bx2 bx2VarC = bx2.C(n13VarA3, v13.b);
                    BigInteger bigInteger = ty2.e;
                    qy2 qy2Var = new qy2();
                    qy2Var.c = (ry2) oz2.h.H(bx2VarC.z().z());
                    qy2Var.b = new BigInteger(1, bx2VarC.B().p());
                    qy2Var.a(bx2VarC.A());
                    qy2Var.d = (sy2) oz2.g.H(gw2Var3.B());
                    return qy2Var.b();
                } catch (o23 e3) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e3);
                }
            default:
                js2 js2Var4 = rz2.a;
                gw2 gw2Var4 = (gw2) us2Var.h;
                if (!gw2Var4.z().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    j7.p("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var4.z())));
                    return null;
                }
                try {
                    n13 n13VarA4 = gw2Var4.A();
                    v13 v13Var4 = v13.a;
                    int i5 = h13.a;
                    jx2 jx2VarC = jx2.C(n13VarA4, v13.b);
                    BigInteger bigInteger2 = az2.g;
                    xy2 xy2Var = new xy2();
                    z61 z61Var = rz2.h;
                    xy2Var.c = (yy2) z61Var.H(jx2VarC.z().z());
                    xy2Var.d = (yy2) z61Var.H(jx2VarC.z().A());
                    xy2Var.b = new BigInteger(1, jx2VarC.B().p());
                    xy2Var.a(jx2VarC.A());
                    xy2Var.b(jx2VarC.z().B());
                    xy2Var.f = (zy2) rz2.g.H(gw2Var4.B());
                    return xy2Var.c();
                } catch (o23 e4) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e4);
                }
        }
    }

    @Override // defpackage.ks2
    public us2 d(ho2 ho2Var) {
        switch (this.f) {
            case 4:
                gt2 gt2Var = (gt2) ho2Var;
                js2 js2Var = wt2.a;
                fw2 fw2VarD = gw2.D();
                fw2VarD.f("type.googleapis.com/google.crypto.tink.AesCmacKey");
                eu2 eu2VarC = fu2.C();
                gu2 gu2VarA = hu2.A();
                int i2 = gt2Var.b;
                gu2VarA.b();
                ((hu2) gu2VarA.g).C(i2);
                hu2 hu2Var = (hu2) gu2VarA.c();
                eu2VarC.b();
                ((fu2) eu2VarC.g).E(hu2Var);
                int i3 = gt2Var.a;
                eu2VarC.b();
                ((fu2) eu2VarC.g).D(i3);
                fw2VarD.g(((fu2) eu2VarC.c()).a());
                fw2VarD.h(wt2.a(gt2Var.c));
                return us2.o((gw2) fw2VarD.c());
            default:
                pt2 pt2Var = (pt2) ho2Var;
                z61 z61Var = xt2.a;
                fw2 fw2VarD2 = gw2.D();
                fw2VarD2.f("type.googleapis.com/google.crypto.tink.HmacKey");
                zv2 zv2VarD = aw2.D();
                bw2 bw2VarB = cw2.B();
                int i4 = pt2Var.b;
                bw2VarB.b();
                ((cw2) bw2VarB.g).E(i4);
                wv2 wv2Var = (wv2) xt2.b.D(pt2Var.d);
                bw2VarB.b();
                ((cw2) bw2VarB.g).D(wv2Var);
                cw2 cw2Var = (cw2) bw2VarB.c();
                zv2VarD.b();
                ((aw2) zv2VarD.g).F(cw2Var);
                int i5 = pt2Var.a;
                zv2VarD.b();
                ((aw2) zv2VarD.g).G(i5);
                fw2VarD2.g(((aw2) zv2VarD.c()).a());
                fw2VarD2.h((yw2) xt2.a.D(pt2Var.c));
                return us2.o((gw2) fw2VarD2.c());
        }
    }

    @Override // defpackage.nr2
    public a23 e(ts2 ts2Var) throws GeneralSecurityException {
        int i2 = 28;
        boolean z2 = false;
        switch (this.f) {
            case 13:
                js2 js2Var = hz2.a;
                String str = (String) ts2Var.g;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    j7.p("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                    return null;
                }
                try {
                    n13 n13Var = (n13) ts2Var.i;
                    v13 v13Var = v13.a;
                    int i3 = h13.a;
                    qv2 qv2VarD = qv2.D(n13Var, v13.b);
                    if (qv2VarD.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    y91 y91Var = new y91(21);
                    y91Var.i = hz2.b(qv2VarD.A().z());
                    y91Var.g = hz2.h(qv2VarD.A().E());
                    y91Var.h = hz2.g(qv2VarD.A().D());
                    y91Var.j = hz2.c((yw2) ts2Var.j);
                    by2 by2VarG = y91Var.G();
                    dy2 dy2Var = new dy2();
                    dy2Var.g = by2VarG;
                    dy2Var.h = new ECPoint(new BigInteger(1, qv2VarD.B().p()), new BigInteger(1, qv2VarD.C().p()));
                    dy2Var.f = (Integer) ts2Var.k;
                    return dy2Var.a();
                } catch (IllegalArgumentException | o23 unused) {
                    j7.r("Parsing EcdsaPublicKey failed");
                    return null;
                }
            case 14:
                js2 js2Var2 = hz2.a;
                String str2 = (String) ts2Var.g;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    j7.p("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                    return null;
                }
                try {
                    n13 n13Var2 = (n13) ts2Var.i;
                    v13 v13Var2 = v13.a;
                    int i4 = h13.a;
                    ov2 ov2VarC = ov2.C(n13Var2, v13.b);
                    if (ov2VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    qv2 qv2VarA = ov2VarC.A();
                    if (qv2VarA.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    y91 y91Var2 = new y91(21);
                    y91Var2.i = hz2.b(qv2VarA.A().z());
                    y91Var2.g = hz2.h(qv2VarA.A().E());
                    y91Var2.h = hz2.g(qv2VarA.A().D());
                    y91Var2.j = hz2.c((yw2) ts2Var.j);
                    by2 by2VarG2 = y91Var2.G();
                    dy2 dy2Var2 = new dy2();
                    dy2Var2.g = by2VarG2;
                    dy2Var2.h = new ECPoint(new BigInteger(1, qv2VarA.B().p()), new BigInteger(1, qv2VarA.C().p()));
                    dy2Var2.f = (Integer) ts2Var.k;
                    ey2 ey2VarA = dy2Var2.a();
                    z61 z61Var = new z61(26);
                    z61Var.g = ey2VarA;
                    z61Var.h = new w32(6, new BigInteger(1, ov2VarC.B().p()));
                    return z61Var.I();
                } catch (IllegalArgumentException | o23 unused2) {
                    j7.r("Parsing EcdsaPrivateKey failed");
                    return null;
                }
            case 15:
            case 18:
            case zw0.zzm /* 21 */:
            default:
                js2 js2Var3 = rz2.a;
                String str3 = (String) ts2Var.g;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    j7.p("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str3)));
                    return null;
                }
                try {
                    n13 n13Var3 = (n13) ts2Var.i;
                    v13 v13Var3 = v13.a;
                    int i5 = h13.a;
                    nx2 nx2VarH = nx2.H(n13Var3, v13.b);
                    if (nx2VarH.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    px2 px2VarA = nx2VarH.A();
                    if (px2VarA.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, px2VarA.B().p());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = new BigInteger(1, px2VarA.C().p());
                    BigInteger bigInteger3 = az2.g;
                    xy2 xy2Var = new xy2();
                    z61 z61Var2 = rz2.h;
                    xy2Var.c = (yy2) z61Var2.H(px2VarA.A().z());
                    xy2Var.d = (yy2) z61Var2.H(px2VarA.A().A());
                    xy2Var.b = bigInteger2;
                    xy2Var.a(iBitLength);
                    xy2Var.b(px2VarA.A().B());
                    xy2Var.f = (zy2) rz2.g.H((yw2) ts2Var.j);
                    az2 az2VarC = xy2Var.c();
                    dy2 dy2Var3 = new dy2();
                    dy2Var3.g = az2VarC;
                    dy2Var3.h = bigInteger;
                    dy2Var3.f = (Integer) ts2Var.k;
                    cz2 cz2VarD = dy2Var3.d();
                    m40 m40Var = new m40(z2);
                    m40Var.f = cz2VarD;
                    w32 w32VarC = rz2.c(nx2VarH.C());
                    w32 w32VarC2 = rz2.c(nx2VarH.D());
                    m40Var.h = w32VarC;
                    m40Var.i = w32VarC2;
                    m40Var.g = rz2.c(nx2VarH.B());
                    w32 w32VarC3 = rz2.c(nx2VarH.E());
                    w32 w32VarC4 = rz2.c(nx2VarH.F());
                    m40Var.j = w32VarC3;
                    m40Var.k = w32VarC4;
                    m40Var.l = rz2.c(nx2VarH.G());
                    return m40Var.f();
                } catch (IllegalArgumentException | o23 unused3) {
                    j7.r("Parsing RsaSsaPssPrivateKey failed");
                    return null;
                }
            case 16:
                js2 js2Var4 = kz2.a;
                String str4 = (String) ts2Var.g;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    j7.p("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str4)));
                    return null;
                }
                try {
                    n13 n13Var4 = (n13) ts2Var.i;
                    v13 v13Var4 = v13.a;
                    int i6 = h13.a;
                    vv2 vv2VarB = vv2.B(n13Var4, v13.b);
                    if (vv2VarB.z() == 0) {
                        return ky2.J((gy2) kz2.g.H((yw2) ts2Var.j), j03.a(vv2VarB.A().p()), (Integer) ts2Var.k);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (o23 unused4) {
                    j7.r("Parsing Ed25519PublicKey failed");
                    return null;
                }
            case 17:
                js2 js2Var5 = kz2.a;
                String str5 = (String) ts2Var.g;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    j7.p("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str5)));
                    return null;
                }
                try {
                    n13 n13Var5 = (n13) ts2Var.i;
                    v13 v13Var5 = v13.a;
                    int i7 = h13.a;
                    tv2 tv2VarC = tv2.C(n13Var5, v13.b);
                    if (tv2VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    vv2 vv2VarB2 = tv2VarC.B();
                    if (vv2VarB2.z() == 0) {
                        return iy2.I(ky2.J((gy2) kz2.g.H((yw2) ts2Var.j), j03.a(vv2VarB2.A().p()), (Integer) ts2Var.k), gv1.h(tv2VarC.A().p()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (o23 unused5) {
                    j7.r("Parsing Ed25519PrivateKey failed");
                    return null;
                }
            case 19:
                js2 js2Var6 = oz2.a;
                String str6 = (String) ts2Var.g;
                if (!str6.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    j7.p("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str6)));
                    return null;
                }
                try {
                    n13 n13Var6 = (n13) ts2Var.i;
                    v13 v13Var6 = v13.a;
                    int i8 = h13.a;
                    hx2 hx2VarD = hx2.D(n13Var6, v13.b);
                    if (hx2VarD.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger4 = new BigInteger(1, hx2VarD.B().p());
                    int iBitLength2 = bigInteger4.bitLength();
                    BigInteger bigInteger5 = ty2.e;
                    qy2 qy2Var = new qy2();
                    qy2Var.c = (ry2) oz2.h.H(hx2VarD.A().z());
                    qy2Var.b = new BigInteger(1, hx2VarD.C().p());
                    qy2Var.a(iBitLength2);
                    qy2Var.d = (sy2) oz2.g.H((yw2) ts2Var.j);
                    ty2 ty2VarB = qy2Var.b();
                    p83 p83Var = new p83(i2, z2);
                    p83Var.g = ty2VarB;
                    p83Var.h = bigInteger4;
                    p83Var.i = (Integer) ts2Var.k;
                    return p83Var.B();
                } catch (IllegalArgumentException | o23 unused6) {
                    j7.r("Parsing RsaSsaPkcs1PublicKey failed");
                    return null;
                }
            case 20:
                js2 js2Var7 = oz2.a;
                String str7 = (String) ts2Var.g;
                if (!str7.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    j7.p("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str7)));
                    return null;
                }
                try {
                    n13 n13Var7 = (n13) ts2Var.i;
                    v13 v13Var7 = v13.a;
                    int i9 = h13.a;
                    fx2 fx2VarH = fx2.H(n13Var7, v13.b);
                    if (fx2VarH.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    hx2 hx2VarA = fx2VarH.A();
                    if (hx2VarA.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger6 = new BigInteger(1, hx2VarA.B().p());
                    int iBitLength3 = bigInteger6.bitLength();
                    BigInteger bigInteger7 = new BigInteger(1, hx2VarA.C().p());
                    BigInteger bigInteger8 = ty2.e;
                    qy2 qy2Var2 = new qy2();
                    qy2Var2.c = (ry2) oz2.h.H(hx2VarA.A().z());
                    qy2Var2.b = bigInteger7;
                    qy2Var2.a(iBitLength3);
                    qy2Var2.d = (sy2) oz2.g.H((yw2) ts2Var.j);
                    ty2 ty2VarB2 = qy2Var2.b();
                    p83 p83Var2 = new p83(i2, z2);
                    p83Var2.g = ty2VarB2;
                    p83Var2.h = bigInteger6;
                    p83Var2.i = (Integer) ts2Var.k;
                    vy2 vy2VarB = p83Var2.B();
                    m40 m40Var2 = new m40(z2);
                    m40Var2.f = vy2VarB;
                    w32 w32VarB = oz2.b(fx2VarH.C());
                    w32 w32VarB2 = oz2.b(fx2VarH.D());
                    m40Var2.h = w32VarB;
                    m40Var2.i = w32VarB2;
                    m40Var2.g = oz2.b(fx2VarH.B());
                    w32 w32VarB3 = oz2.b(fx2VarH.E());
                    w32 w32VarB4 = oz2.b(fx2VarH.F());
                    m40Var2.j = w32VarB3;
                    m40Var2.k = w32VarB4;
                    m40Var2.l = oz2.b(fx2VarH.G());
                    return m40Var2.e();
                } catch (IllegalArgumentException | o23 unused7) {
                    j7.r("Parsing RsaSsaPkcs1PrivateKey failed");
                    return null;
                }
            case 22:
                js2 js2Var8 = rz2.a;
                String str8 = (String) ts2Var.g;
                if (!str8.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    j7.p("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str8)));
                    return null;
                }
                try {
                    n13 n13Var8 = (n13) ts2Var.i;
                    v13 v13Var8 = v13.a;
                    int i10 = h13.a;
                    px2 px2VarD = px2.D(n13Var8, v13.b);
                    if (px2VarD.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger9 = new BigInteger(1, px2VarD.B().p());
                    int iBitLength4 = bigInteger9.bitLength();
                    BigInteger bigInteger10 = az2.g;
                    xy2 xy2Var2 = new xy2();
                    z61 z61Var3 = rz2.h;
                    xy2Var2.c = (yy2) z61Var3.H(px2VarD.A().z());
                    xy2Var2.d = (yy2) z61Var3.H(px2VarD.A().A());
                    xy2Var2.b = new BigInteger(1, px2VarD.C().p());
                    xy2Var2.a(iBitLength4);
                    xy2Var2.b(px2VarD.A().B());
                    xy2Var2.f = (zy2) rz2.g.H((yw2) ts2Var.j);
                    az2 az2VarC2 = xy2Var2.c();
                    dy2 dy2Var4 = new dy2();
                    dy2Var4.g = az2VarC2;
                    dy2Var4.h = bigInteger9;
                    dy2Var4.f = (Integer) ts2Var.k;
                    return dy2Var4.d();
                } catch (IllegalArgumentException | o23 unused8) {
                    j7.r("Parsing RsaSsaPssPublicKey failed");
                    return null;
                }
        }
    }

    @Override // defpackage.ps2
    public ts2 b(a23 a23Var) {
        switch (this.f) {
            case 3:
                dt2 dt2Var = (dt2) a23Var;
                js2 js2Var = wt2.a;
                cu2 cu2VarD = du2.D();
                gt2 gt2Var = dt2Var.J;
                gu2 gu2VarA = hu2.A();
                int i2 = gt2Var.b;
                gu2VarA.b();
                ((hu2) gu2VarA.g).C(i2);
                hu2 hu2Var = (hu2) gu2VarA.c();
                cu2VarD.b();
                ((du2) cu2VarD.g).G(hu2Var);
                byte[] bArrB = ((j03) dt2Var.K.g).b();
                l13 l13VarN = n13.n(bArrB, 0, bArrB.length);
                cu2VarD.b();
                ((du2) cu2VarD.g).F(l13VarN);
                return ts2.j("type.googleapis.com/google.crypto.tink.AesCmacKey", ((du2) cu2VarD.c()).a(), 2, wt2.a(dt2Var.J.c), dt2Var.M);
            default:
                jt2 jt2Var = (jt2) a23Var;
                z61 z61Var = xt2.a;
                xv2 xv2VarD = yv2.D();
                pt2 pt2Var = jt2Var.J;
                bw2 bw2VarB = cw2.B();
                int i3 = pt2Var.b;
                bw2VarB.b();
                ((cw2) bw2VarB.g).E(i3);
                wv2 wv2Var = (wv2) xt2.b.D(pt2Var.d);
                bw2VarB.b();
                ((cw2) bw2VarB.g).D(wv2Var);
                cw2 cw2Var = (cw2) bw2VarB.c();
                xv2VarD.b();
                ((yv2) xv2VarD.g).G(cw2Var);
                byte[] bArrB2 = ((j03) jt2Var.K.g).b();
                l13 l13VarN2 = n13.n(bArrB2, 0, bArrB2.length);
                xv2VarD.b();
                ((yv2) xv2VarD.g).H(l13VarN2);
                return ts2.j("type.googleapis.com/google.crypto.tink.HmacKey", ((yv2) xv2VarD.c()).a(), 2, (yw2) xt2.a.D(jt2Var.J.c), jt2Var.M);
        }
    }
}
