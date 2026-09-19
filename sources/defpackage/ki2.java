package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ki2 implements ii2, do2, ps2, is2, nr2 {
    public final /* synthetic */ int f;
    public static final /* synthetic */ ki2 g = new ki2(0);
    public static final /* synthetic */ ki2 h = new ki2(2);
    public static final /* synthetic */ ki2 i = new ki2(3);
    public static final /* synthetic */ ki2 j = new ki2(4);
    public static final /* synthetic */ ki2 k = new ki2(5);
    public static final /* synthetic */ ki2 l = new ki2(6);
    public static final /* synthetic */ ki2 m = new ki2(7);
    public static final /* synthetic */ ki2 n = new ki2(8);
    public static final /* synthetic */ ki2 o = new ki2(9);
    public static final /* synthetic */ ki2 p = new ki2(10);
    public static final /* synthetic */ ki2 q = new ki2(11);
    public static final /* synthetic */ ki2 r = new ki2(12);
    public static final /* synthetic */ ki2 s = new ki2(13);
    public static final /* synthetic */ ki2 t = new ki2(14);
    public static final /* synthetic */ ki2 u = new ki2(15);
    public static final /* synthetic */ ki2 v = new ki2(16);
    public static final /* synthetic */ ki2 w = new ki2(17);
    public static final /* synthetic */ ki2 x = new ki2(18);
    public static final /* synthetic */ ki2 y = new ki2(19);
    public static final /* synthetic */ ki2 z = new ki2(20);
    public static final /* synthetic */ ki2 A = new ki2(21);
    public static final /* synthetic */ ki2 B = new ki2(22);
    public static final /* synthetic */ ki2 C = new ki2(23);
    public static final /* synthetic */ ki2 D = new ki2(24);
    public static final /* synthetic */ ki2 E = new ki2(25);
    public static final /* synthetic */ ki2 F = new ki2(26);
    public static final /* synthetic */ ki2 G = new ki2(27);
    public static final /* synthetic */ ki2 H = new ki2(28);
    public static final /* synthetic */ ki2 I = new ki2(29);

    public /* synthetic */ ki2(int i2) {
        this.f = i2;
    }

    public static Cipher d() {
        try {
            Cipher cipher = (Cipher) ar2.a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }

    @Override // defpackage.do2
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo7a() {
        bs2.b.a().getClass();
    }

    @Override // defpackage.ps2
    public Object b(a23 a23Var) throws GeneralSecurityException {
        byte[] bArrB;
        switch (this.f) {
            case 2:
                mp2 mp2Var = (mp2) a23Var;
                ir2 ir2Var = mo2.a;
                return rq2.f.get() != null ? new rq2(((j03) mp2Var.K.g).b(), mp2Var.L.b()) : new wq2(3, ((j03) mp2Var.K.g).b(), mp2Var.L.b());
            case 3:
                dp2 dp2Var = (dp2) a23Var;
                dp2Var.getClass();
                return new wq2(((j03) dp2Var.K.g).b(), dp2Var.L);
            case 4:
                return yz2.b((so2) a23Var);
            case 5:
                ts2 ts2Var = ((vr2) a23Var).J;
                int[] iArr = tr2.b;
                int i2 = ts2Var.f;
                Integer num = (Integer) ts2Var.k;
                int i3 = iArr[ec.z(i2)];
                yn2 yn2Var = (yn2) lr2.d.b(yn2.class, (String) ts2Var.g).a((n13) ts2Var.i);
                yw2 yw2Var = (yw2) ts2Var.j;
                int iOrdinal = yw2Var.ordinal();
                if (iOrdinal == 1) {
                    bArrB = gs2.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    bArrB = gs2.a(num.intValue()).b();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(yw2Var)));
                    }
                    bArrB = gs2.a(num.intValue()).b();
                } else {
                    bArrB = gs2.a.b();
                }
                return new wq2(yn2Var, bArrB);
            case 6:
                return uz2.b((zo2) a23Var);
            case 7:
                return ar2.b((ip2) a23Var);
            case 8:
                os2 os2Var = pp2.a;
                fo2.a(((sp2) a23Var).J.a);
                throw null;
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                dt2 dt2Var = (dt2) a23Var;
                os2 os2Var2 = ft2.a;
                if (dt2Var.J.a != 32) {
                    j7.r("AesCmacKey size wrong, must be 32 bytes");
                    return null;
                }
                if (!jn.r(1)) {
                    j7.r("Cannot use AES-CMAC in FIPS-mode.");
                    return null;
                }
                Provider providerS = ar.s();
                if (providerS != null) {
                    try {
                        return ht2.a(dt2Var, providerS);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                return new ht2();
            case 13:
                eq2 eq2Var = (eq2) a23Var;
                eq2Var.getClass();
                return new xq2(((j03) eq2Var.K.g).b(), eq2Var.L, eq2Var.J.b);
        }
    }

    @Override // defpackage.is2
    public ho2 c(us2 us2Var) throws GeneralSecurityException {
        switch (this.f) {
            case 9:
                js2 js2Var = up2.a;
                gw2 gw2Var = (gw2) us2Var.h;
                if (!gw2Var.z().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    j7.p("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var.z())));
                    return null;
                }
                try {
                    n13 n13VarA = gw2Var.A();
                    v13 v13Var = v13.a;
                    int i2 = h13.a;
                    return new tp2(tw2.A(n13VarA, v13.b).z(), up2.a(gw2Var.B()));
                } catch (o23 e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            case 11:
                js2 js2Var2 = xp2.a;
                gw2 gw2Var2 = (gw2) us2Var.h;
                if (!gw2Var2.z().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    j7.p("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var2.z())));
                    return null;
                }
                try {
                    n13 n13VarA2 = gw2Var2.A();
                    v13 v13Var2 = v13.a;
                    int i3 = h13.a;
                    return xp2.b(xw2.B(n13VarA2, v13.b), gw2Var2.B());
                } catch (o23 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                }
            case 14:
                js2 js2Var3 = kq2.a;
                gw2 gw2Var3 = (gw2) us2Var.h;
                if (!gw2Var3.z().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    j7.p("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var3.z())));
                    return null;
                }
                try {
                    n13 n13VarA3 = gw2Var3.A();
                    v13 v13Var3 = v13.a;
                    int i4 = h13.a;
                    lu2 lu2VarB = lu2.B(n13VarA3, v13.b);
                    if (lu2VarB.A().B() != 0) {
                        j7.r("Only version 0 keys are accepted");
                        return null;
                    }
                    es0 es0Var = new es0(9);
                    es0Var.j(lu2VarB.z().A());
                    es0Var.p(lu2VarB.A().A());
                    es0Var.s(lu2VarB.z().z().z());
                    es0Var.t(lu2VarB.A().z().A());
                    es0Var.j = kq2.c(lu2VarB.A().z().z());
                    es0Var.k = kq2.b(gw2Var3.B());
                    return es0Var.v();
                } catch (o23 e3) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e3);
                }
            case 16:
                js2 js2Var4 = mq2.a;
                gw2 gw2Var4 = (gw2) us2Var.h;
                if (!gw2Var4.z().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    j7.p("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var4.z())));
                    return null;
                }
                try {
                    n13 n13VarA4 = gw2Var4.A();
                    v13 v13Var4 = v13.a;
                    int i5 = h13.a;
                    vu2 vu2VarB = vu2.B(n13VarA4, v13.b);
                    y91 y91Var = new y91(19);
                    y91Var.t(vu2VarB.A());
                    y91Var.x(vu2VarB.z().z());
                    y91Var.A();
                    y91Var.j = mq2.b(gw2Var4.B());
                    return y91Var.F();
                } catch (o23 e4) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e4);
                }
            case 18:
                js2 js2Var5 = oq2.a;
                gw2 gw2Var5 = (gw2) us2Var.h;
                if (!gw2Var5.z().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    j7.p("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var5.z())));
                    return null;
                }
                try {
                    n13 n13VarA5 = gw2Var5.A();
                    v13 v13Var5 = v13.a;
                    int i6 = h13.a;
                    bv2 bv2VarB = bv2.B(n13VarA5, v13.b);
                    if (bv2VarB.A() != 0) {
                        j7.r("Only version 0 parameters are accepted");
                        return null;
                    }
                    u40 u40Var = new u40(20);
                    u40Var.j(bv2VarB.z());
                    u40Var.o();
                    u40Var.r();
                    u40Var.j = oq2.b(gw2Var5.B());
                    return u40Var.z();
                } catch (o23 e5) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e5);
                }
            case 20:
                js2 js2Var6 = qq2.a;
                gw2 gw2Var6 = (gw2) us2Var.h;
                if (!gw2Var6.z().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    j7.p("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var6.z())));
                    return null;
                }
                try {
                    n13 n13VarA6 = gw2Var6.A();
                    v13 v13Var6 = v13.a;
                    int i7 = h13.a;
                    fv2 fv2VarB = fv2.B(n13VarA6, v13.b);
                    if (fv2VarB.A() != 0) {
                        j7.r("Only version 0 parameters are accepted");
                        return null;
                    }
                    int iZ = fv2VarB.z();
                    if (iZ == 16 || iZ == 32) {
                        return new lp2(iZ, qq2.b(gw2Var6.B()));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iZ)));
                } catch (o23 e6) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e6);
                }
            case 22:
                js2 js2Var7 = sq2.a;
                gw2 gw2Var7 = (gw2) us2Var.h;
                if (!gw2Var7.z().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    j7.p("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var7.z())));
                    return null;
                }
                try {
                    n13 n13VarA7 = gw2Var7.A();
                    v13 v13Var7 = v13.a;
                    int i8 = h13.a;
                    iv2.z(n13VarA7, v13.b);
                    return new op2(sq2.b(gw2Var7.B()));
                } catch (o23 e7) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
                }
            case 24:
                js2 js2Var8 = yq2.a;
                gw2 gw2Var8 = (gw2) us2Var.h;
                if (!gw2Var8.z().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    j7.p("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var8.z())));
                    return null;
                }
                try {
                    n13 n13VarA8 = gw2Var8.A();
                    v13 v13Var8 = v13.a;
                    int i9 = h13.a;
                    tx2 tx2VarB = tx2.B(n13VarA8, v13.b);
                    if (tx2VarB.z() == 0) {
                        return gq2.b(tx2VarB.A().z(), yq2.b(gw2Var8.B()));
                    }
                    j7.r("Only version 0 parameters are accepted");
                    return null;
                } catch (o23 e8) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e8);
                }
            default:
                js2 js2Var9 = zq2.a;
                gw2 gw2Var9 = (gw2) us2Var.h;
                if (!gw2Var9.z().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    j7.p("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(gw2Var9.z())));
                    return null;
                }
                try {
                    n13 n13VarA9 = gw2Var9.A();
                    v13 v13Var9 = v13.a;
                    int i10 = h13.a;
                    if (yx2.A(n13VarA9, v13.b).z() == 0) {
                        return new jq2(zq2.b(gw2Var9.B()));
                    }
                    j7.r("Only version 0 parameters are accepted");
                    return null;
                } catch (o23 e9) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e9);
                }
        }
    }

    @Override // defpackage.nr2
    public a23 e(ts2 ts2Var) throws GeneralSecurityException {
        boolean z2 = false;
        switch (this.f) {
            case 10:
                js2 js2Var = up2.a;
                if (!((String) ts2Var.g).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    j7.p("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    n13 n13Var = (n13) ts2Var.i;
                    v13 v13Var = v13.a;
                    int i2 = h13.a;
                    rw2 rw2VarB = rw2.B(n13Var, v13.b);
                    if (rw2VarB.z() == 0) {
                        return sp2.J(new tp2(rw2VarB.A().z(), up2.a((yw2) ts2Var.j)), (Integer) ts2Var.k);
                    }
                    String strValueOf = String.valueOf(rw2VarB);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
                    sb.append("KmsAeadKey are only accepted with version 0, got ");
                    sb.append(strValueOf);
                    throw new GeneralSecurityException(sb.toString());
                } catch (o23 e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            case 12:
                js2 js2Var2 = xp2.a;
                if (!((String) ts2Var.g).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    j7.p("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    n13 n13Var2 = (n13) ts2Var.i;
                    v13 v13Var2 = v13.a;
                    int i3 = h13.a;
                    vw2 vw2VarB = vw2.B(n13Var2, v13.b);
                    if (vw2VarB.z() == 0) {
                        return vp2.J(xp2.b(vw2VarB.A(), (yw2) ts2Var.j), (Integer) ts2Var.k);
                    }
                    String strValueOf2 = String.valueOf(vw2VarB);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 58);
                    sb2.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                    sb2.append(strValueOf2);
                    throw new GeneralSecurityException(sb2.toString());
                } catch (o23 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
            case 15:
                js2 js2Var3 = kq2.a;
                if (!((String) ts2Var.g).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    j7.p("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    n13 n13Var3 = (n13) ts2Var.i;
                    v13 v13Var3 = v13.a;
                    int i4 = h13.a;
                    ju2 ju2VarC = ju2.C(n13Var3, v13.b);
                    if (ju2VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (ju2VarC.A().z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (ju2VarC.B().z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    es0 es0Var = new es0(9);
                    es0Var.j(ju2VarC.A().B().d());
                    es0Var.p(ju2VarC.B().B().d());
                    es0Var.s(ju2VarC.A().A().z());
                    es0Var.t(ju2VarC.B().A().A());
                    es0Var.j = kq2.c(ju2VarC.B().A().z());
                    es0Var.k = kq2.b((yw2) ts2Var.j);
                    yo2 yo2VarV = es0Var.v();
                    u40 u40Var = new u40(19);
                    u40Var.g = yo2VarV;
                    u40Var.h = gv1.h(ju2VarC.A().B().p());
                    u40Var.i = gv1.h(ju2VarC.B().B().p());
                    u40Var.j = (Integer) ts2Var.k;
                    return u40Var.y();
                } catch (o23 unused) {
                    j7.r("Parsing AesCtrHmacAeadKey failed");
                    return null;
                }
            case 17:
                js2 js2Var4 = mq2.a;
                if (!((String) ts2Var.g).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    j7.p("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                    return null;
                }
                try {
                    n13 n13Var4 = (n13) ts2Var.i;
                    v13 v13Var4 = v13.a;
                    int i5 = h13.a;
                    tu2 tu2VarC = tu2.C(n13Var4, v13.b);
                    if (tu2VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    y91 y91Var = new y91(19);
                    y91Var.t(tu2VarC.B().d());
                    y91Var.x(tu2VarC.A().z());
                    y91Var.A();
                    y91Var.j = mq2.b((yw2) ts2Var.j);
                    cp2 cp2VarF = y91Var.F();
                    p83 p83Var = new p83(24, z2);
                    p83Var.g = cp2VarF;
                    p83Var.h = gv1.h(tu2VarC.B().p());
                    p83Var.i = (Integer) ts2Var.k;
                    return p83Var.x();
                } catch (o23 unused2) {
                    j7.r("Parsing AesEaxcKey failed");
                    return null;
                }
            case 19:
                js2 js2Var5 = oq2.a;
                if (!((String) ts2Var.g).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    j7.p("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    n13 n13Var5 = (n13) ts2Var.i;
                    v13 v13Var5 = v13.a;
                    int i6 = h13.a;
                    zu2 zu2VarB = zu2.B(n13Var5, v13.b);
                    if (zu2VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    u40 u40Var2 = new u40(20);
                    u40Var2.j(zu2VarB.A().d());
                    u40Var2.o();
                    u40Var2.r();
                    u40Var2.j = oq2.b((yw2) ts2Var.j);
                    hp2 hp2VarZ = u40Var2.z();
                    r52 r52Var = new r52(27);
                    r52Var.g = hp2VarZ;
                    r52Var.h = gv1.h(zu2VarB.A().p());
                    r52Var.i = (Integer) ts2Var.k;
                    return r52Var.L();
                } catch (o23 unused3) {
                    j7.r("Parsing AesGcmKey failed");
                    return null;
                }
            case zw0.zzm /* 21 */:
                js2 js2Var6 = qq2.a;
                if (!((String) ts2Var.g).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    j7.p("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                    return null;
                }
                try {
                    n13 n13Var6 = (n13) ts2Var.i;
                    v13 v13Var6 = v13.a;
                    int i7 = h13.a;
                    dv2 dv2VarB = dv2.B(n13Var6, v13.b);
                    if (dv2VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int iD = dv2VarB.A().d();
                    if (iD != 16 && iD != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iD)));
                    }
                    lp2 lp2Var = new lp2(iD, qq2.b((yw2) ts2Var.j));
                    p83 p83Var2 = new p83(25, z2);
                    p83Var2.g = lp2Var;
                    p83Var2.h = gv1.h(dv2VarB.A().p());
                    p83Var2.i = (Integer) ts2Var.k;
                    return p83Var2.y();
                } catch (o23 unused4) {
                    j7.r("Parsing AesGcmSivKey failed");
                    return null;
                }
            case 23:
                js2 js2Var7 = sq2.a;
                if (!((String) ts2Var.g).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    j7.p("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                    return null;
                }
                try {
                    n13 n13Var7 = (n13) ts2Var.i;
                    v13 v13Var7 = v13.a;
                    int i8 = h13.a;
                    hv2 hv2VarB = hv2.B(n13Var7, v13.b);
                    if (hv2VarB.z() == 0) {
                        return mp2.J(sq2.b((yw2) ts2Var.j), gv1.h(hv2VarB.A().p()), (Integer) ts2Var.k);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (o23 unused5) {
                    j7.r("Parsing ChaCha20Poly1305Key failed");
                    return null;
                }
            case 25:
                js2 js2Var8 = yq2.a;
                if (!((String) ts2Var.g).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    j7.p("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    n13 n13Var8 = (n13) ts2Var.i;
                    v13 v13Var8 = v13.a;
                    int i9 = h13.a;
                    rx2 rx2VarC = rx2.C(n13Var8, v13.b);
                    if (rx2VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (rx2VarC.B().d() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    return eq2.J(gq2.b(rx2VarC.A().z(), yq2.b((yw2) ts2Var.j)), gv1.h(rx2VarC.B().p()), (Integer) ts2Var.k);
                } catch (o23 unused6) {
                    j7.r("Parsing XAesGcmKey failed");
                    return null;
                }
            default:
                js2 js2Var9 = zq2.a;
                if (!((String) ts2Var.g).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    j7.p("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                    return null;
                }
                try {
                    n13 n13Var9 = (n13) ts2Var.i;
                    v13 v13Var9 = v13.a;
                    int i10 = h13.a;
                    xx2 xx2VarB = xx2.B(n13Var9, v13.b);
                    if (xx2VarB.z() == 0) {
                        return hq2.J(zq2.b((yw2) ts2Var.j), gv1.h(xx2VarB.A().p()), (Integer) ts2Var.k);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (o23 unused7) {
                    j7.r("Parsing XChaCha20Poly1305Key failed");
                    return null;
                }
        }
    }

    @Override // defpackage.ii2
    public /* synthetic */ Object a() {
        throw new IllegalStateException();
    }
}
