package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v13 {
    public static volatile v13 a;
    public static final v13 b;

    static {
        v13 v13Var = new v13();
        Map map = Collections.EMPTY_MAP;
        b = v13Var;
    }

    public static v13 a() {
        v13 v13Var = a;
        if (v13Var != null) {
            return v13Var;
        }
        synchronized (v13.class) {
            try {
                v13 v13Var2 = a;
                if (v13Var2 != null) {
                    return v13Var2;
                }
                int i = h13.a;
                v13 v13VarY = a23.y();
                a = v13VarY;
                return v13VarY;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
