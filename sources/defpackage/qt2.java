package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class qt2 {
    static {
        int i = zw2.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        ut2 ut2Var = ut2.a;
        ds2 ds2Var = ds2.b;
        ds2Var.b(ut2.a);
        ds2Var.a(ut2.b);
        ds2Var.b(it2.a);
        int i = mt2.f;
        if (!jn.r(i)) {
            j7.r("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        z61 z61Var = xt2.a;
        fs2 fs2Var = fs2.b;
        fs2Var.c(xt2.c);
        fs2Var.d(xt2.d);
        fs2Var.a(xt2.e);
        fs2Var.b(xt2.f);
        ds2Var.a(mt2.a);
        ds2Var.a(mt2.b);
        cs2 cs2Var = cs2.b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", vt2.a);
        u40 u40Var = new u40(21);
        u40Var.j(32);
        u40Var.p(16);
        ot2 ot2Var = ot2.e;
        u40Var.j = ot2Var;
        nt2 nt2Var = nt2.d;
        u40Var.i = nt2Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", u40Var.A());
        u40 u40Var2 = new u40(21);
        u40Var2.j(32);
        u40Var2.p(32);
        ot2 ot2Var2 = ot2.b;
        u40Var2.j = ot2Var2;
        u40Var2.i = nt2Var;
        map.put("HMAC_SHA256_256BITTAG", u40Var2.A());
        u40 u40Var3 = new u40(21);
        u40Var3.j(32);
        u40Var3.p(32);
        u40Var3.j = ot2Var;
        u40Var3.i = nt2Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", u40Var3.A());
        u40 u40Var4 = new u40(21);
        u40Var4.j(64);
        u40Var4.p(16);
        u40Var4.j = ot2Var2;
        nt2 nt2Var2 = nt2.f;
        u40Var4.i = nt2Var2;
        map.put("HMAC_SHA512_128BITTAG", u40Var4.A());
        u40 u40Var5 = new u40(21);
        u40Var5.j(64);
        u40Var5.p(16);
        u40Var5.j = ot2Var;
        u40Var5.i = nt2Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", u40Var5.A());
        u40 u40Var6 = new u40(21);
        u40Var6.j(64);
        u40Var6.p(32);
        u40Var6.j = ot2Var2;
        u40Var6.i = nt2Var2;
        map.put("HMAC_SHA512_256BITTAG", u40Var6.A());
        u40 u40Var7 = new u40(21);
        u40Var7.j(64);
        u40Var7.p(32);
        u40Var7.j = ot2Var;
        u40Var7.i = nt2Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", u40Var7.A());
        map.put("HMAC_SHA512_512BITTAG", vt2.b);
        u40 u40Var8 = new u40(21);
        u40Var8.j(64);
        u40Var8.p(64);
        u40Var8.j = ot2Var;
        u40Var8.i = nt2Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", u40Var8.A());
        cs2Var.b(Collections.unmodifiableMap(map));
        yr2 yr2Var = yr2.b;
        yr2Var.a(mt2.e, pt2.class);
        zr2.b.a(mt2.d, pt2.class);
        lr2 lr2Var = lr2.d;
        lr2Var.c(mt2.c, i, true);
        if (cr2.a()) {
            return;
        }
        os2 os2Var = ft2.a;
        if (!jn.r(1)) {
            j7.r("Registering AES CMAC is not supported in FIPS mode");
            return;
        }
        fs2Var.c(wt2.a);
        fs2Var.d(wt2.b);
        fs2Var.a(wt2.c);
        fs2Var.b(wt2.d);
        yr2Var.a(to2.l, gt2.class);
        ds2Var.a(ft2.a);
        ds2Var.a(ft2.b);
        HashMap map2 = new HashMap();
        gt2 gt2Var = vt2.c;
        map2.put("AES_CMAC", gt2Var);
        map2.put("AES256_CMAC", gt2Var);
        r52 r52Var = new r52(29);
        r52Var.A(32);
        r52Var.F(16);
        r52Var.i = ao2.q;
        map2.put("AES256_CMAC_RAW", r52Var.M());
        cs2Var.b(Collections.unmodifiableMap(map2));
        lr2Var.a(ft2.c, true);
    }
}
