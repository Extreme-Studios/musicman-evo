package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class tp0 implements r63 {
    public final /* synthetic */ int a = 1;
    public final q63 b;
    public final q63 c;
    public final q63 d;
    public final q63 e;
    public final q63 f;
    public final v63 g;
    public final v63 h;
    public final v63 i;
    public final v63 j;
    public final v63 k;
    public final v63 l;
    public final r63 m;

    public tp0(q63 q63Var, v63 v63Var, v63 v63Var2, eg1 eg1Var, v63 v63Var3, q63 q63Var2, v63 v63Var4, q63 q63Var3, dy0 dy0Var, yj1 yj1Var, q63 q63Var4, q63 q63Var5) {
        this.b = q63Var;
        this.g = v63Var;
        this.h = v63Var2;
        this.i = eg1Var;
        this.j = v63Var3;
        this.c = q63Var2;
        this.k = v63Var4;
        this.d = q63Var3;
        this.l = dy0Var;
        this.m = yj1Var;
        this.e = q63Var4;
        this.f = q63Var5;
    }

    public sj1 a() {
        u62 u62Var = (u62) this.b.c();
        d60 d60VarA = ((ef1) this.g).a();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.h.c();
        String packageName = ((xe1) ((eg1) this.i).b).a().getPackageName();
        dq.D(packageName);
        ix0 ix0Var = lx0.a;
        return new sj1(u62Var, d60VarA, applicationInfo, packageName, tu0.e.a.N(), (PackageInfo) this.j.c(), q63.b(this.c), ((ve1) this.k).c(), (String) this.d.c(), ((dy0) this.l).d(), ((yj1) this.m).a(), (em1) this.e.c(), ((Integer) this.f.c()).intValue());
    }

    public my1 b() {
        Context contextA = ((xe1) this.g).a();
        u62 u62Var = (u62) this.b.c();
        hy1 hy1Var = (hy1) this.c.c();
        dk1 dk1Var = (dk1) this.d.c();
        e82 e82Var = (e82) this.e.c();
        f82 f82Var = (f82) this.h.c();
        oi1 oi1Var = (oi1) this.f.c();
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        return new my1(contextA, u62Var, hy1Var, dk1Var, e82Var, f82Var, oi1Var, ya1Var, (ScheduledExecutorService) this.l.c(), (yw1) ((q63) this.i).c(), (d72) ((q63) this.j).c(), ((iq1) this.m).a(), (cs1) ((q63) this.k).c());
    }

    @Override // defpackage.v63
    public final Object c() {
        switch (this.a) {
            case 0:
                if1 if1Var = (if1) ((s63) this.g).a;
                Context contextA = ((xe1) this.h).a();
                zq0 zq0Var = (zq0) this.b.c();
                t52 t52Var = (t52) this.c.c();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new ep0(if1Var, contextA, zq0Var, t52Var, ya1Var, (ScheduledExecutorService) this.d.c(), (hs1) this.e.c(), (f82) this.f.c(), ((ef1) this.l).a(), ((dy0) this.m).a(), (k52) ((q63) this.i).c(), (x93) ((q63) this.j).c(), (g32) ((q63) this.k).c());
            case 1:
                return a();
            default:
                return b();
        }
    }

    public tp0(s63 s63Var, xe1 xe1Var, q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, q63 q63Var5, ef1 ef1Var, dy0 dy0Var, q63 q63Var6, q63 q63Var7, q63 q63Var8) {
        this.g = s63Var;
        this.h = xe1Var;
        this.b = q63Var;
        this.c = q63Var2;
        this.d = q63Var3;
        this.e = q63Var4;
        this.f = q63Var5;
        this.l = ef1Var;
        this.m = dy0Var;
        this.i = q63Var6;
        this.j = q63Var7;
        this.k = q63Var8;
    }

    public tp0(v63 v63Var, q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, v63 v63Var2, q63 q63Var5, v63 v63Var3, q63 q63Var6, q63 q63Var7, iq1 iq1Var, q63 q63Var8) {
        this.g = v63Var;
        this.b = q63Var;
        this.c = q63Var2;
        this.d = q63Var3;
        this.e = q63Var4;
        this.h = v63Var2;
        this.f = q63Var5;
        this.l = v63Var3;
        this.i = q63Var6;
        this.j = q63Var7;
        this.m = iq1Var;
        this.k = q63Var8;
    }
}
