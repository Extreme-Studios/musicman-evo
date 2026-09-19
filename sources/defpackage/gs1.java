package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gs1 implements v62 {
    public final cs1 g;
    public final ae h;
    public final HashMap f = new HashMap();
    public final HashMap i = new HashMap();

    public gs1(cs1 cs1Var, Set set, ae aeVar) {
        this.g = cs1Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            fs1 fs1Var = (fs1) it.next();
            HashMap map = this.i;
            fs1Var.getClass();
            map.put(r62.j, fs1Var);
        }
        this.h = aeVar;
    }

    @Override // defpackage.v62
    public final void F(r62 r62Var, String str, Throwable th) {
        HashMap map = this.f;
        if (map.containsKey(r62Var)) {
            this.h.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(r62Var)).longValue();
            this.g.a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.i.containsKey(r62Var)) {
            a(r62Var, false);
        }
    }

    @Override // defpackage.v62
    public final void P(String str, r62 r62Var) {
        HashMap map = this.f;
        if (map.containsKey(r62Var)) {
            this.h.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(r62Var)).longValue();
            this.g.a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.i.containsKey(r62Var)) {
            a(r62Var, true);
        }
    }

    public final void a(r62 r62Var, boolean z) {
        fs1 fs1Var = (fs1) this.i.get(r62Var);
        if (fs1Var == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        r62 r62Var2 = fs1Var.b;
        HashMap map = this.f;
        if (map.containsKey(r62Var2)) {
            this.h.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(r62Var2)).longValue();
            String str2 = fs1Var.a;
            int length = str.length();
            ConcurrentHashMap concurrentHashMap = this.g.a;
            StringBuilder sb = new StringBuilder(length + String.valueOf(jElapsedRealtime).length());
            sb.append(str);
            sb.append(jElapsedRealtime);
            concurrentHashMap.put("label.".concat(str2), sb.toString());
        }
    }

    @Override // defpackage.v62
    public final void w(String str, r62 r62Var) {
        this.h.getClass();
        this.f.put(r62Var, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // defpackage.v62
    public final void s(String str) {
    }
}
