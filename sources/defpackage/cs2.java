package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cs2 {
    public static final cs2 b = new cs2();
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, ho2 ho2Var) {
        try {
            HashMap map = this.a;
            if (!map.containsKey(str)) {
                map.put(str, ho2Var);
                return;
            }
            if (((ho2) map.get(str)).equals(ho2Var)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(ho2Var);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(strValueOf);
            sb.append("), cannot insert ");
            sb.append(strValueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (ho2) entry.getValue());
        }
    }
}
