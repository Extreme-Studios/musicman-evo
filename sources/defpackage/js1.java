package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class js1 {
    public final String e;
    public final hs1 f;
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public boolean d = false;
    public final h73 a = vc3.C.h.g();

    public js1(String str, hs1 hs1Var) {
        this.e = str;
        this.f = hs1Var;
    }

    public final synchronized void a(String str) {
        if (((Boolean) tu0.e.c.a(lx0.h2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_started");
            mapE.put("ancn", str);
            this.b.add(mapE);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) tu0.e.c.a(lx0.h2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            this.b.add(mapE);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) tu0.e.c.a(lx0.h2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            mapE.put("rqe", str2);
            this.b.add(mapE);
        }
    }

    public final synchronized void d() {
        if (((Boolean) tu0.e.c.a(lx0.h2)).booleanValue() && !this.c) {
            HashMap mapE = e();
            mapE.put("action", "init_started");
            this.b.add(mapE);
            this.c = true;
        }
    }

    public final HashMap e() {
        hs1 hs1Var = this.f;
        hs1Var.getClass();
        HashMap map = new HashMap(hs1Var.a);
        vc3.C.k.getClass();
        map.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        map.put("tid", this.a.s() ? "" : this.e);
        return map;
    }
}
