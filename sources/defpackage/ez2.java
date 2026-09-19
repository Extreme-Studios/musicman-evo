package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ez2 {
    static {
        int i = zw2.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        my2 my2Var = my2.a;
        ds2 ds2Var = ds2.b;
        ds2Var.b(my2.a);
        ds2Var.a(my2.b);
        ds2Var.b(py2.a);
        ds2Var.a(py2.b);
        int i = fy2.f;
        if (!jn.r(i)) {
            j7.r("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        js2 js2Var = hz2.a;
        fs2 fs2Var = fs2.b;
        fs2Var.c(hz2.a);
        fs2Var.d(hz2.b);
        fs2Var.a(hz2.c);
        fs2Var.b(hz2.d);
        fs2Var.a(hz2.e);
        fs2Var.b(hz2.f);
        cs2 cs2Var = cs2.b;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", ly2.a);
        map.put("ECDSA_P256_IEEE_P1363", ly2.d);
        y91 y91Var = new y91(21);
        y91Var.i = wo2.o;
        y91Var.h = zx2.c;
        y91Var.g = xo2.q;
        y91Var.j = bp2.p;
        map.put("ECDSA_P256_RAW", y91Var.G());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", ly2.f);
        map.put("ECDSA_P384", ly2.b);
        map.put("ECDSA_P384_IEEE_P1363", ly2.e);
        y91 y91Var2 = new y91(21);
        y91Var2.i = wo2.q;
        zx2 zx2Var = zx2.d;
        y91Var2.h = zx2Var;
        xo2 xo2Var = xo2.r;
        y91Var2.g = xo2Var;
        bp2 bp2Var = bp2.m;
        y91Var2.j = bp2Var;
        map.put("ECDSA_P384_SHA512", y91Var2.G());
        y91 y91Var3 = new y91(21);
        y91Var3.i = wo2.p;
        y91Var3.h = zx2Var;
        y91Var3.g = xo2Var;
        y91Var3.j = bp2Var;
        map.put("ECDSA_P384_SHA384", y91Var3.G());
        map.put("ECDSA_P521", ly2.c);
        map.put("ECDSA_P521_IEEE_P1363", ly2.g);
        cs2Var.b(Collections.unmodifiableMap(map));
        ds2Var.a(fy2.a);
        ds2Var.a(fy2.b);
        yr2 yr2Var = yr2.b;
        yr2Var.a(fy2.e, by2.class);
        lr2 lr2Var = lr2.d;
        lr2Var.c(fy2.c, i, true);
        lr2Var.c(fy2.d, i, false);
        int i2 = wy2.f;
        if (!jn.r(i2)) {
            j7.r("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        fs2Var.c(oz2.a);
        fs2Var.d(oz2.b);
        fs2Var.a(oz2.c);
        fs2Var.b(oz2.d);
        fs2Var.a(oz2.e);
        fs2Var.b(oz2.f);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", ly2.h);
        BigInteger bigInteger = ty2.e;
        qy2 qy2Var = new qy2();
        qy2Var.c = ry2.b;
        qy2Var.a(3072);
        BigInteger bigInteger2 = ty2.e;
        qy2Var.b = bigInteger2;
        sy2 sy2Var = sy2.e;
        qy2Var.d = sy2Var;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", qy2Var.b());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", ly2.i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", ly2.j);
        qy2 qy2Var2 = new qy2();
        qy2Var2.c = ry2.d;
        qy2Var2.a(4096);
        qy2Var2.b = bigInteger2;
        qy2Var2.d = sy2Var;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", qy2Var2.b());
        cs2Var.b(map2);
        ds2Var.a(wy2.a);
        ds2Var.a(wy2.b);
        yr2Var.a(wy2.e, ty2.class);
        lr2Var.c(wy2.c, i2, true);
        lr2Var.c(wy2.d, i2, false);
        int i3 = dz2.f;
        if (!jn.r(i3)) {
            j7.r("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        fs2Var.c(rz2.a);
        fs2Var.d(rz2.b);
        fs2Var.a(rz2.c);
        fs2Var.b(rz2.d);
        fs2Var.a(rz2.e);
        fs2Var.b(rz2.f);
        HashMap map3 = new HashMap();
        BigInteger bigInteger3 = az2.g;
        xy2 xy2Var = new xy2();
        yy2 yy2Var = yy2.b;
        xy2Var.c = yy2Var;
        xy2Var.d = yy2Var;
        xy2Var.b(32);
        xy2Var.a(3072);
        BigInteger bigInteger4 = az2.g;
        xy2Var.b = bigInteger4;
        zy2 zy2Var = zy2.b;
        xy2Var.f = zy2Var;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", xy2Var.c());
        xy2 xy2Var2 = new xy2();
        xy2Var2.c = yy2Var;
        xy2Var2.d = yy2Var;
        xy2Var2.b(32);
        xy2Var2.a(3072);
        xy2Var2.b = bigInteger4;
        zy2 zy2Var2 = zy2.e;
        xy2Var2.f = zy2Var2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", xy2Var2.c());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", ly2.k);
        xy2 xy2Var3 = new xy2();
        yy2 yy2Var2 = yy2.d;
        xy2Var3.c = yy2Var2;
        xy2Var3.d = yy2Var2;
        xy2Var3.b(64);
        xy2Var3.a(4096);
        xy2Var3.b = bigInteger4;
        xy2Var3.f = zy2Var;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", xy2Var3.c());
        xy2 xy2Var4 = new xy2();
        xy2Var4.c = yy2Var2;
        xy2Var4.d = yy2Var2;
        xy2Var4.b(64);
        xy2Var4.a(4096);
        xy2Var4.b = bigInteger4;
        xy2Var4.f = zy2Var2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", xy2Var4.c());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", ly2.l);
        cs2Var.b(Collections.unmodifiableMap(map3));
        ds2Var.a(dz2.a);
        ds2Var.a(dz2.b);
        yr2Var.a(dz2.e, az2.class);
        lr2Var.c(dz2.c, i3, true);
        lr2Var.c(dz2.d, i3, false);
        if (cr2.a()) {
            return;
        }
        os2 os2Var = jy2.a;
        if (!jn.r(1)) {
            j7.r("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        fs2Var.c(kz2.a);
        fs2Var.d(kz2.b);
        fs2Var.a(kz2.c);
        fs2Var.b(kz2.d);
        fs2Var.a(kz2.e);
        fs2Var.b(kz2.f);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new hy2(gy2.b));
        gy2 gy2Var = gy2.e;
        map4.put("ED25519_RAW", new hy2(gy2Var));
        map4.put("ED25519WithRawOutput", new hy2(gy2Var));
        cs2Var.b(Collections.unmodifiableMap(map4));
        yr2Var.a(jy2.f, hy2.class);
        zr2.b.a(jy2.e, hy2.class);
        ds2Var.a(jy2.a);
        ds2Var.a(jy2.b);
        lr2Var.a(jy2.c, true);
        lr2Var.a(jy2.d, false);
    }
}
