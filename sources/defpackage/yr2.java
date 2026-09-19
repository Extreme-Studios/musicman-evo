package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yr2 {
    public static final yr2 b;
    public final HashMap a = new HashMap();

    static {
        to2 to2Var = to2.k;
        yr2 yr2Var = new yr2();
        try {
            yr2Var.a(to2Var, wr2.class);
            b = yr2Var;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized void a(to2 to2Var, Class cls) {
        try {
            HashMap map = this.a;
            to2 to2Var2 = (to2) map.get(cls);
            if (to2Var2 != null && !to2Var2.equals(to2Var)) {
                String string = cls.toString();
                StringBuilder sb = new StringBuilder(string.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(string);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, to2Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final a23 b(ho2 ho2Var, Integer num) {
        a23 a23VarA;
        synchronized (this) {
            to2 to2Var = (to2) this.a.get(ho2Var.getClass());
            if (to2Var == null) {
                String string = ho2Var.toString();
                StringBuilder sb = new StringBuilder(string.length() + 86);
                sb.append("Cannot create a new key for parameters ");
                sb.append(string);
                sb.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb.toString());
            }
            a23VarA = to2Var.a(ho2Var, num);
        }
        return a23VarA;
    }
}
