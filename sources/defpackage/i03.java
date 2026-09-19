package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class i03 implements jo2 {
    public static final z61 a;
    public static final byte[] b;
    public static final byte[] c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        d03 d03Var = d03.f;
        yy2 yy2Var = yy2.b;
        map.put(d03Var, yy2Var);
        map2.put(yy2Var, d03Var);
        d03 d03Var2 = d03.g;
        yy2 yy2Var2 = yy2.c;
        map.put(d03Var2, yy2Var2);
        map2.put(yy2Var2, d03Var2);
        d03 d03Var3 = d03.h;
        yy2 yy2Var3 = yy2.d;
        map.put(d03Var3, yy2Var3);
        map2.put(yy2Var3, d03Var3);
        a = new z61(Collections.unmodifiableMap(map), 25, Collections.unmodifiableMap(map2));
        b = new byte[0];
        c = new byte[]{0};
    }
}
