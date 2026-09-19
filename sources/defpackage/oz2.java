package defpackage;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class oz2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;
    public static final pr2 e;
    public static final mr2 f;
    public static final z61 g;
    public static final z61 h;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        j03 j03VarA2 = ct2.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        a = new js2(ty2.class, kt2.z);
        b = new hs2(j03VarA, et2.x);
        c = new pr2(vy2.class, kt2.x);
        d = new mr2(j03VarA2, et2.y);
        e = new pr2(uy2.class, kt2.y);
        f = new mr2(j03VarA, et2.z);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        yw2 yw2Var = yw2.RAW;
        sy2 sy2Var = sy2.e;
        map.put(yw2Var, sy2Var);
        map2.put(sy2Var, yw2Var);
        yw2 yw2Var2 = yw2.TINK;
        sy2 sy2Var2 = sy2.b;
        map.put(yw2Var2, sy2Var2);
        map2.put(sy2Var2, yw2Var2);
        yw2 yw2Var3 = yw2.CRUNCHY;
        sy2 sy2Var3 = sy2.c;
        map.put(yw2Var3, sy2Var3);
        map2.put(sy2Var3, yw2Var3);
        yw2 yw2Var4 = yw2.LEGACY;
        sy2 sy2Var4 = sy2.d;
        map.put(yw2Var4, sy2Var4);
        map2.put(sy2Var4, yw2Var4);
        g = new z61(Collections.unmodifiableMap(map), 25, Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        wv2 wv2Var = wv2.SHA256;
        ry2 ry2Var = ry2.b;
        map3.put(wv2Var, ry2Var);
        map4.put(ry2Var, wv2Var);
        wv2 wv2Var2 = wv2.SHA384;
        ry2 ry2Var2 = ry2.c;
        map3.put(wv2Var2, ry2Var2);
        map4.put(ry2Var2, wv2Var2);
        wv2 wv2Var3 = wv2.SHA512;
        ry2 ry2Var3 = ry2.d;
        map3.put(wv2Var3, ry2Var3);
        map4.put(ry2Var3, wv2Var3);
        h = new z61(Collections.unmodifiableMap(map3), 25, Collections.unmodifiableMap(map4));
    }

    public static hx2 a(vy2 vy2Var) {
        gx2 gx2VarE = hx2.E();
        ty2 ty2Var = vy2Var.J;
        cx2 cx2VarA = dx2.A();
        wv2 wv2Var = (wv2) h.D(ty2Var.d);
        cx2VarA.b();
        ((dx2) cx2VarA.g).C(wv2Var);
        dx2 dx2Var = (dx2) cx2VarA.c();
        gx2VarE.b();
        ((hx2) gx2VarE.g).H(dx2Var);
        byte[] bArrC0 = w40.c0(vy2Var.K);
        l13 l13Var = n13.g;
        l13 l13VarN = n13.n(bArrC0, 0, bArrC0.length);
        gx2VarE.b();
        ((hx2) gx2VarE.g).I(l13VarN);
        byte[] bArrC1 = w40.c0(vy2Var.J.b);
        l13 l13VarN2 = n13.n(bArrC1, 0, bArrC1.length);
        gx2VarE.b();
        ((hx2) gx2VarE.g).J(l13VarN2);
        return (hx2) gx2VarE.c();
    }

    public static w32 b(n13 n13Var) {
        return new w32(6, new BigInteger(1, n13Var.p()));
    }
}
