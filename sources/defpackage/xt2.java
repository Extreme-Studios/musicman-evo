package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class xt2 {
    public static final z61 a;
    public static final z61 b;
    public static final js2 c;
    public static final hs2 d;
    public static final pr2 e;
    public static final mr2 f;

    static {
        j03 j03VarA = ct2.a("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        yw2 yw2Var = yw2.RAW;
        ot2 ot2Var = ot2.e;
        map.put(yw2Var, ot2Var);
        map2.put(ot2Var, yw2Var);
        yw2 yw2Var2 = yw2.TINK;
        ot2 ot2Var2 = ot2.b;
        map.put(yw2Var2, ot2Var2);
        map2.put(ot2Var2, yw2Var2);
        yw2 yw2Var3 = yw2.LEGACY;
        ot2 ot2Var3 = ot2.d;
        map.put(yw2Var3, ot2Var3);
        map2.put(ot2Var3, yw2Var3);
        yw2 yw2Var4 = yw2.CRUNCHY;
        ot2 ot2Var4 = ot2.c;
        map.put(yw2Var4, ot2Var4);
        map2.put(ot2Var4, yw2Var4);
        a = new z61(Collections.unmodifiableMap(map), 25, Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        wv2 wv2Var = wv2.SHA1;
        nt2 nt2Var = nt2.b;
        map3.put(wv2Var, nt2Var);
        map4.put(nt2Var, wv2Var);
        wv2 wv2Var2 = wv2.SHA224;
        nt2 nt2Var2 = nt2.c;
        map3.put(wv2Var2, nt2Var2);
        map4.put(nt2Var2, wv2Var2);
        wv2 wv2Var3 = wv2.SHA256;
        nt2 nt2Var3 = nt2.d;
        map3.put(wv2Var3, nt2Var3);
        map4.put(nt2Var3, wv2Var3);
        wv2 wv2Var4 = wv2.SHA384;
        nt2 nt2Var4 = nt2.e;
        map3.put(wv2Var4, nt2Var4);
        map4.put(nt2Var4, wv2Var4);
        wv2 wv2Var5 = wv2.SHA512;
        nt2 nt2Var5 = nt2.f;
        map3.put(wv2Var5, nt2Var5);
        map4.put(nt2Var5, wv2Var5);
        b = new z61(Collections.unmodifiableMap(map3), 25, Collections.unmodifiableMap(map4));
        c = new js2(pt2.class, et2.l);
        d = new hs2(j03VarA, kt2.k);
        e = new pr2(jt2.class, et2.k);
        f = new mr2(j03VarA, kt2.l);
    }
}
