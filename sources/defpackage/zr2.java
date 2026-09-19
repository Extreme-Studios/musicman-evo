package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zr2 {
    public static final zr2 b = new zr2();
    public final HashMap a = new HashMap();

    public final synchronized void a(uo2 uo2Var, Class cls) {
        try {
            HashMap map = this.a;
            uo2 uo2Var2 = (uo2) map.get(cls);
            if (uo2Var2 != null && !uo2Var2.equals(uo2Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, uo2Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
