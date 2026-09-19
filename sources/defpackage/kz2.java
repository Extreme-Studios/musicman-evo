package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class kz2 {
    public static final js2 a;
    public static final hs2 b;
    public static final pr2 c;
    public static final mr2 d;
    public static final pr2 e;
    public static final mr2 f;
    public static final z61 g;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        j03 j03VarA2 = ct2.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        a = new js2(hy2.class, kt2.w);
        b = new hs2(j03VarA, et2.u);
        c = new pr2(ky2.class, kt2.u);
        d = new mr2(j03VarA2, et2.v);
        e = new pr2(iy2.class, kt2.v);
        f = new mr2(j03VarA, et2.w);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        yw2 yw2Var = yw2.RAW;
        gy2 gy2Var = gy2.e;
        map.put(yw2Var, gy2Var);
        map2.put(gy2Var, yw2Var);
        yw2 yw2Var2 = yw2.TINK;
        gy2 gy2Var2 = gy2.b;
        map.put(yw2Var2, gy2Var2);
        map2.put(gy2Var2, yw2Var2);
        yw2 yw2Var3 = yw2.CRUNCHY;
        gy2 gy2Var3 = gy2.c;
        map.put(yw2Var3, gy2Var3);
        map2.put(gy2Var3, yw2Var3);
        yw2 yw2Var4 = yw2.LEGACY;
        gy2 gy2Var4 = gy2.d;
        map.put(yw2Var4, gy2Var4);
        map2.put(gy2Var4, yw2Var4);
        g = new z61(Collections.unmodifiableMap(map), 25, Collections.unmodifiableMap(map2));
    }

    public static vv2 a(ky2 ky2Var) {
        uv2 uv2VarC = vv2.C();
        byte[] bArrB = ky2Var.K.b();
        l13 l13VarN = n13.n(bArrB, 0, bArrB.length);
        uv2VarC.b();
        ((vv2) uv2VarC.g).F(l13VarN);
        return (vv2) uv2VarC.c();
    }
}
