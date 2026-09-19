package defpackage;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class rz2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;
    public static final pr2 e;
    public static final mr2 f;
    public static final z61 g;
    public static final z61 h;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        j03 j03VarA2 = ct2.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        a = new js2(az2.class, kt2.C);
        b = new hs2(j03VarA, et2.A);
        c = new pr2(cz2.class, kt2.A);
        d = new mr2(j03VarA2, et2.B);
        e = new pr2(bz2.class, kt2.B);
        f = new mr2(j03VarA, et2.C);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        yw2 yw2Var = yw2.RAW;
        zy2 zy2Var = zy2.e;
        map.put(yw2Var, zy2Var);
        map2.put(zy2Var, yw2Var);
        yw2 yw2Var2 = yw2.TINK;
        zy2 zy2Var2 = zy2.b;
        map.put(yw2Var2, zy2Var2);
        map2.put(zy2Var2, yw2Var2);
        yw2 yw2Var3 = yw2.CRUNCHY;
        zy2 zy2Var3 = zy2.c;
        map.put(yw2Var3, zy2Var3);
        map2.put(zy2Var3, yw2Var3);
        yw2 yw2Var4 = yw2.LEGACY;
        zy2 zy2Var4 = zy2.d;
        map.put(yw2Var4, zy2Var4);
        map2.put(zy2Var4, yw2Var4);
        g = new z61(Collections.unmodifiableMap(map), 25, Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        wv2 wv2Var = wv2.SHA256;
        yy2 yy2Var = yy2.b;
        map3.put(wv2Var, yy2Var);
        map4.put(yy2Var, wv2Var);
        wv2 wv2Var2 = wv2.SHA384;
        yy2 yy2Var2 = yy2.c;
        map3.put(wv2Var2, yy2Var2);
        map4.put(yy2Var2, wv2Var2);
        wv2 wv2Var3 = wv2.SHA512;
        yy2 yy2Var3 = yy2.d;
        map3.put(wv2Var3, yy2Var3);
        map4.put(yy2Var3, wv2Var3);
        h = new z61(Collections.unmodifiableMap(map3), 25, Collections.unmodifiableMap(map4));
    }

    public static lx2 a(az2 az2Var) {
        kx2 kx2VarC = lx2.C();
        yy2 yy2Var = az2Var.d;
        z61 z61Var = h;
        wv2 wv2Var = (wv2) z61Var.D(yy2Var);
        kx2VarC.b();
        ((lx2) kx2VarC.g).E(wv2Var);
        wv2 wv2Var2 = (wv2) z61Var.D(az2Var.e);
        kx2VarC.b();
        ((lx2) kx2VarC.g).F(wv2Var2);
        int i = az2Var.f;
        kx2VarC.b();
        ((lx2) kx2VarC.g).G(i);
        return (lx2) kx2VarC.c();
    }

    public static px2 b(cz2 cz2Var) {
        ox2 ox2VarE = px2.E();
        lx2 lx2VarA = a(cz2Var.J);
        ox2VarE.b();
        ((px2) ox2VarE.g).I(lx2VarA);
        byte[] bArrC0 = w40.c0(cz2Var.K);
        l13 l13Var = n13.g;
        l13 l13VarN = n13.n(bArrC0, 0, bArrC0.length);
        ox2VarE.b();
        ((px2) ox2VarE.g).J(l13VarN);
        byte[] bArrC1 = w40.c0(cz2Var.J.b);
        l13 l13VarN2 = n13.n(bArrC1, 0, bArrC1.length);
        ox2VarE.b();
        ((px2) ox2VarE.g).K(l13VarN2);
        ox2VarE.b();
        ((px2) ox2VarE.g).H(0);
        return (px2) ox2VarE.c();
    }

    public static w32 c(n13 n13Var) {
        return new w32(6, new BigInteger(1, n13Var.p()));
    }
}
