package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ce3 {
    public final int a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final Map e;
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    public final hs1 h;
    public ConcurrentHashMap i;

    public ce3(hs1 hs1Var) {
        this.h = hs1Var;
        ix0 ix0Var = lx0.l7;
        tu0 tu0Var = tu0.e;
        this.a = ((Integer) tu0Var.c.a(ix0Var)).intValue();
        ix0 ix0Var2 = lx0.m7;
        kx0 kx0Var = tu0Var.c;
        this.b = ((Long) kx0Var.a(ix0Var2)).longValue();
        this.c = ((Boolean) kx0Var.a(lx0.q7)).booleanValue();
        this.d = ((Boolean) kx0Var.a(lx0.p7)).booleanValue();
        this.e = Collections.synchronizedMap(new ac3(this));
    }

    public final synchronized void a(String str, String str2, cs1 cs1Var) {
        vc3.C.k.getClass();
        this.e.put(str, new tc3(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        c();
        d(cs1Var);
    }

    public final synchronized String b(String str, cs1 cs1Var) {
        tc3 tc3Var = (tc3) this.e.get(str);
        cs1Var.a.put("request_id", str);
        ConcurrentHashMap concurrentHashMap = cs1Var.a;
        if (tc3Var == null) {
            concurrentHashMap.put("mhit", "false");
            return null;
        }
        concurrentHashMap.put("mhit", "true");
        return tc3Var.b;
    }

    public final synchronized void c() {
        vc3.C.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((tc3) entry.getValue()).a.longValue() <= this.b) {
                    break;
                }
                this.g.add(new Pair((String) entry.getKey(), ((tc3) entry.getValue()).b));
                it.remove();
                throw th;
            }
        } catch (ConcurrentModificationException e) {
            vc3.C.h.d("QueryJsonMap.removeExpiredEntries", e);
        }
    }

    public final synchronized void d(cs1 cs1Var) throws Throwable {
        try {
            try {
                if (this.c) {
                    ArrayDeque arrayDeque = this.g;
                    ArrayDeque arrayDequeClone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f;
                    ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    za1.a.execute(new e9(this, cs1Var, arrayDequeClone, arrayDequeClone2, 8));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void e(cs1 cs1Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(cs1Var.a);
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(jn.v(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.h.a(this.i, false);
        }
    }
}
