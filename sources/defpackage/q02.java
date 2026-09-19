package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q02 implements m22 {
    public final Context a;
    public final String b;
    public final String c;
    public final long d;
    public final zi1 e;
    public final v52 f;
    public final i52 g;
    public final h73 h = vc3.C.h.g();
    public final cs1 i;
    public final cj1 j;

    public q02(Context context, String str, String str2, zi1 zi1Var, v52 v52Var, i52 i52Var, cs1 cs1Var, cj1 cj1Var, long j) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.e = zi1Var;
        this.f = v52Var;
        this.g = i52Var;
        this.i = cs1Var;
        this.j = cj1Var;
        this.d = j;
    }

    @Override // defpackage.m22
    public final hp a() {
        Bundle bundle = new Bundle();
        cs1 cs1Var = this.i;
        ConcurrentHashMap concurrentHashMap = cs1Var.a;
        String str = this.b;
        concurrentHashMap.put("seq_num", str);
        if (((Boolean) tu0.e.c.a(lx0.m2)).booleanValue()) {
            vc3.C.k.getClass();
            cs1Var.b("tsacc", String.valueOf(System.currentTimeMillis() - this.d));
            cs1Var.b("foreground", true != zb3.g(this.a) ? "1" : "0");
        }
        zi1 zi1Var = this.e;
        i52 i52Var = this.g;
        f93 f93Var = i52Var.d;
        pa1 pa1Var = zi1Var.g;
        synchronized (pa1Var.d) {
            pa1Var.a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            pa1Var.j = jElapsedRealtime;
            ua1 ua1Var = pa1Var.b;
            synchronized (ua1Var.f) {
                ua1Var.i.a(f93Var, jElapsedRealtime);
            }
        }
        bundle.putAll(this.f.a());
        return na1.t(new r02(this.a, bundle, str, this.c, this.h, i52Var.g, this.j));
    }

    @Override // defpackage.m22
    public final int c() {
        return 12;
    }
}
