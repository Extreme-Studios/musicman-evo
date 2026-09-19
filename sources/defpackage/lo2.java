package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class lo2 {
    static {
        int i = zw2.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        ro2 ro2Var = ro2.a;
        ds2 ds2Var = ds2.b;
        ds2Var.b(ro2.a);
        ds2Var.a(ro2.b);
        qt2.a();
        int i = vo2.e;
        if (!jn.r(i)) {
            j7.r("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        js2 js2Var = kq2.a;
        fs2 fs2Var = fs2.b;
        fs2Var.c(kq2.a);
        fs2Var.d(kq2.b);
        fs2Var.a(kq2.c);
        fs2Var.b(kq2.d);
        ds2Var.a(vo2.a);
        cs2 cs2Var = cs2.b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", dq2.e);
        es0 es0Var = new es0(9);
        es0Var.j(16);
        es0Var.p(32);
        es0Var.t(16);
        es0Var.s(16);
        wo2 wo2Var = wo2.j;
        es0Var.j = wo2Var;
        xo2 xo2Var = xo2.j;
        es0Var.k = xo2Var;
        map.put("AES128_CTR_HMAC_SHA256_RAW", es0Var.v());
        map.put("AES256_CTR_HMAC_SHA256", dq2.f);
        es0 es0Var2 = new es0(9);
        es0Var2.j(32);
        es0Var2.p(32);
        es0Var2.t(32);
        es0Var2.s(16);
        es0Var2.j = wo2Var;
        es0Var2.k = xo2Var;
        map.put("AES256_CTR_HMAC_SHA256_RAW", es0Var2.v());
        cs2Var.b(Collections.unmodifiableMap(map));
        zr2 zr2Var = zr2.b;
        zr2Var.a(vo2.c, yo2.class);
        yr2 yr2Var = yr2.b;
        yr2Var.a(vo2.d, yo2.class);
        lr2 lr2Var = lr2.d;
        lr2Var.c(vo2.b, i, true);
        int i2 = fp2.e;
        if (!jn.r(i2)) {
            j7.r("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        fs2Var.c(oq2.a);
        fs2Var.d(oq2.b);
        fs2Var.a(oq2.c);
        fs2Var.b(oq2.d);
        ds2Var.a(fp2.a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", dq2.a);
        u40 u40Var = new u40(20);
        u40Var.o();
        u40Var.j(16);
        u40Var.r();
        gp2 gp2Var = gp2.j;
        u40Var.j = gp2Var;
        map2.put("AES128_GCM_RAW", u40Var.z());
        map2.put("AES256_GCM", dq2.b);
        u40 u40Var2 = new u40(20);
        u40Var2.o();
        u40Var2.j(32);
        u40Var2.r();
        u40Var2.j = gp2Var;
        map2.put("AES256_GCM_RAW", u40Var2.z());
        cs2Var.b(Collections.unmodifiableMap(map2));
        zr2Var.a(fp2.c, hp2.class);
        yr2Var.a(fp2.d, hp2.class);
        lr2Var.c(fp2.b, i2, true);
        if (cr2.a()) {
            return;
        }
        os2 os2Var = ap2.a;
        if (!jn.r(1)) {
            j7.r("Registering AES EAX is not supported in FIPS mode");
            return;
        }
        fs2Var.c(mq2.a);
        fs2Var.d(mq2.b);
        fs2Var.a(mq2.c);
        fs2Var.b(mq2.d);
        ds2Var.a(ap2.a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", dq2.c);
        y91 y91Var = new y91(19);
        y91Var.x(16);
        y91Var.t(16);
        y91Var.A();
        bp2 bp2Var = bp2.j;
        y91Var.j = bp2Var;
        map3.put("AES128_EAX_RAW", y91Var.F());
        map3.put("AES256_EAX", dq2.d);
        y91 y91Var2 = new y91(19);
        y91Var2.x(16);
        y91Var2.t(32);
        y91Var2.A();
        y91Var2.j = bp2Var;
        map3.put("AES256_EAX_RAW", y91Var2.F());
        cs2Var.b(Collections.unmodifiableMap(map3));
        yr2Var.a(ap2.c, cp2.class);
        lr2Var.a(ap2.b, true);
        os2 os2Var2 = jp2.a;
        kp2 kp2Var = kp2.j;
        if (!jn.r(1)) {
            j7.r("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        fs2Var.c(qq2.a);
        fs2Var.d(qq2.b);
        fs2Var.a(qq2.c);
        fs2Var.b(qq2.d);
        HashMap map4 = new HashMap();
        kp2 kp2Var2 = kp2.h;
        map4.put("AES128_GCM_SIV", new lp2(16, kp2Var2));
        map4.put("AES128_GCM_SIV_RAW", new lp2(16, kp2Var));
        map4.put("AES256_GCM_SIV", new lp2(32, kp2Var2));
        map4.put("AES256_GCM_SIV_RAW", new lp2(32, kp2Var));
        cs2Var.b(Collections.unmodifiableMap(map4));
        zr2Var.a(uo2.c, lp2.class);
        yr2Var.a(to2.e, lp2.class);
        ds2Var.a(jp2.a);
        lr2Var.a(jp2.b, true);
        os2 os2Var3 = np2.a;
        if (!jn.r(1)) {
            j7.r("Registering ChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        fs2Var.c(sq2.a);
        fs2Var.d(sq2.b);
        fs2Var.a(sq2.c);
        fs2Var.b(sq2.d);
        ds2Var.a(np2.a);
        yr2Var.a(to2.f, op2.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new op2(ao2.k));
        map5.put("CHACHA20_POLY1305_RAW", new op2(ao2.m));
        cs2Var.b(Collections.unmodifiableMap(map5));
        lr2Var.a(np2.b, true);
        os2 os2Var4 = pp2.a;
        if (!jn.r(1)) {
            j7.r("Registering KMS AEAD is not supported in FIPS mode");
            return;
        }
        fs2Var.c(up2.a);
        fs2Var.d(up2.b);
        fs2Var.a(up2.c);
        fs2Var.b(up2.d);
        ds2Var.a(pp2.a);
        yr2Var.a(pp2.c, tp2.class);
        lr2Var.a(pp2.b, true);
        sr2 sr2Var = rp2.a;
        if (!jn.r(1)) {
            j7.r("Registering KMS Envelope AEAD is not supported in FIPS mode");
            return;
        }
        fs2Var.c(xp2.a);
        fs2Var.d(xp2.b);
        fs2Var.a(xp2.c);
        fs2Var.b(xp2.d);
        yr2Var.a(rp2.b, wp2.class);
        ds2Var.a(rp2.c);
        lr2Var.a(rp2.a, true);
        os2 os2Var5 = iq2.a;
        if (!jn.r(1)) {
            j7.r("Registering XChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        fs2Var.c(zq2.a);
        fs2Var.d(zq2.b);
        fs2Var.a(zq2.c);
        fs2Var.b(zq2.d);
        ds2Var.a(iq2.a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new jq2(kp2.k));
        map6.put("XCHACHA20_POLY1305_RAW", new jq2(kp2.m));
        cs2Var.b(Collections.unmodifiableMap(map6));
        yr2Var.a(iq2.d, jq2.class);
        zr2Var.a(iq2.c, jq2.class);
        lr2Var.a(iq2.b, true);
        os2 os2Var6 = fq2.a;
        fs2Var.c(yq2.a);
        fs2Var.d(yq2.b);
        fs2Var.a(yq2.c);
        fs2Var.b(yq2.d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", dq2.g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", dq2.h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", dq2.i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", dq2.j);
        cs2Var.b(Collections.unmodifiableMap(map7));
        ds2Var.a(fq2.a);
        yr2Var.a(to2.i, gq2.class);
    }
}
