package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sx0 {
    public final LinkedList a = new LinkedList();
    public final LinkedHashMap b;
    public final Object c;

    public sx0(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final rx0 d() {
        vc3.C.k.getClass();
        return new rx0(SystemClock.elapsedRealtime(), null, null);
    }

    public final void a(rx0 rx0Var, long j, String... strArr) {
        synchronized (this.c) {
            this.a.add(new rx0(j, strArr[0], rx0Var));
        }
    }

    public final z61 b() {
        z61 z61Var;
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.Y1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.c) {
            try {
                LinkedList<rx0> linkedList = this.a;
                for (rx0 rx0Var : linkedList) {
                    long j = rx0Var.a;
                    String str = rx0Var.b;
                    rx0 rx0Var2 = rx0Var.c;
                    if (rx0Var2 != null && j > 0) {
                        long j2 = j - rx0Var2.a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j2);
                        sb.append(',');
                        if (zBooleanValue) {
                            boolean zContainsKey = map.containsKey(Long.valueOf(rx0Var2.a));
                            long j3 = rx0Var2.a;
                            if (zContainsKey) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(j3));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                map.put(Long.valueOf(j3), new StringBuilder(str));
                            }
                        }
                    }
                }
                linkedList.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        vc3 vc3Var = vc3.C;
                        vc3Var.k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        vc3Var.k.getClass();
                        sb3.append((jLongValue - SystemClock.elapsedRealtime()) + jCurrentTimeMillis);
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                z61Var = new z61(sb.toString(), 10, string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z61Var;
    }

    public final void c(String str, String str2) {
        mx0 mx0VarA;
        if (TextUtils.isEmpty(str2) || (mx0VarA = vc3.C.h.a()) == null) {
            return;
        }
        synchronized (this.c) {
            qx0 qx0Var = (qx0) ((HashMap) mx0VarA.d).get(str);
            if (qx0Var == null) {
                qx0Var = qx0.b;
            }
            LinkedHashMap linkedHashMap = this.b;
            linkedHashMap.put(str, qx0Var.a((String) linkedHashMap.get(str), str2));
        }
    }
}
