package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class o82 {
    public final u82 c;
    public final bz1 d;
    public final Context e;
    public volatile ConnectivityManager f;
    public final ae h;
    public AtomicInteger i;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public o82(u82 u82Var, bz1 bz1Var, Context context, ae aeVar) {
        this.c = u82Var;
        this.d = bz1Var;
        this.e = context;
        this.h = aeVar;
    }

    public static String a(String str, h2 h2Var) {
        String strName = h2Var == null ? "NULL" : h2Var.name();
        return ec.n(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    public final void b(boolean z) {
        synchronized (this) {
            if (((Boolean) tu0.e.c.a(lx0.x)).booleanValue()) {
                c(z);
            }
        }
    }

    public final synchronized void c(boolean z) {
        ConcurrentHashMap concurrentHashMap = this.a;
        try {
            if (z) {
                Iterator it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    ((k82) it.next()).j();
                }
            } else {
                Iterator it2 = concurrentHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((k82) it2.next()).f.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00fe A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00ee, B:35:0x0103, B:37:0x0109, B:34:0x00fe), top: B:43:0x0001 }] */
    public final synchronized ArrayList d(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ab2 ab2Var = (ab2) it.next();
                String strA = a(ab2Var.f, h2.a(ab2Var.g));
                hashSet.add(strA);
                ConcurrentHashMap concurrentHashMap = this.a;
                k82 k82Var = (k82) concurrentHashMap.get(strA);
                if (k82Var == null) {
                    ConcurrentHashMap concurrentHashMap2 = this.b;
                    if (concurrentHashMap2.containsKey(strA)) {
                        k82 k82Var2 = (k82) concurrentHashMap2.get(strA);
                        if (k82Var2.e.equals(ab2Var)) {
                            k82Var2.o(ab2Var.i);
                            k82Var2.j();
                            concurrentHashMap.put(strA, k82Var2);
                            concurrentHashMap2.remove(strA);
                        } else {
                            arrayList.add(ab2Var);
                        }
                    } else {
                        arrayList.add(ab2Var);
                    }
                } else if (k82Var.e.equals(ab2Var)) {
                    k82Var.o(ab2Var.i);
                } else {
                    this.b.put(strA, k82Var);
                    concurrentHashMap.remove(strA);
                    arrayList.add(ab2Var);
                }
            }
            Iterator it2 = this.a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.b.put((String) entry.getKey(), (k82) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.b.entrySet().iterator();
            while (it3.hasNext()) {
                k82 k82Var3 = (k82) ((Map.Entry) it3.next()).getValue();
                k82Var3.f.set(false);
                k82Var3.n.set(false);
                ix0 ix0Var = lx0.z;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    k82Var3.i.clear();
                } else {
                    if (((Boolean) tu0Var.c.a(lx0.A)).booleanValue()) {
                        k82Var3.i.clear();
                    }
                }
                if (!k82Var3.h()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean e(String str, h2 h2Var) {
        boolean z;
        try {
            this.h.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            k82 k82VarG = g(str, h2Var);
            z = k82VarG != null && k82VarG.h();
            Long lValueOf = z ? Long.valueOf(System.currentTimeMillis()) : null;
            q82 q82Var = new q82(new p83(str, 22, h2Var));
            int iM = 0;
            bz1 bz1Var = this.d;
            int i = k82VarG == null ? 0 : k82VarG.e.i;
            if (k82VarG != null) {
                iM = k82VarG.m();
            }
            bz1Var.k(i, iM, jCurrentTimeMillis, lValueOf, k82VarG != null ? k82VarG.k() : null, q82Var, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    public final synchronized Object f(h2 h2Var, Class cls, String str) {
        q82 q82Var = new q82(new p83(str, 22, h2Var));
        bz1 bz1Var = this.d;
        this.h.getClass();
        bz1Var.q("poll_ad", "ppac_ts", System.currentTimeMillis(), -1, -1, null, q82Var, "1");
        k82 k82VarG = g(str, h2Var);
        if (k82VarG == null) {
            return null;
        }
        try {
            String strK = k82VarG.k();
            Object objI = k82VarG.i();
            Object objCast = objI == null ? null : cls.cast(objI);
            if (objCast != null) {
                bz1Var.n(System.currentTimeMillis(), k82VarG.e.i, k82VarG.m(), strK, q82Var, "1");
            }
            return objCast;
        } catch (ClassCastException e) {
            vc3.C.h.d("PreloadAdManager.pollAd", e);
            jn.w("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return null;
        }
    }

    public final synchronized k82 g(String str, h2 h2Var) {
        return (k82) this.a.get(a(str, h2Var));
    }
}
