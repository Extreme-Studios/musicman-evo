package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class sa1 {
    public final Object a = new Object();
    public final h73 b;
    public final ua1 c;
    public boolean d;
    public Context e;
    public d60 f;
    public String g;
    public mx0 h;
    public es1 i;
    public Boolean j;
    public final AtomicInteger k;
    public final AtomicInteger l;
    public final ra1 m;
    public final Object n;
    public hp o;
    public final AtomicBoolean p;

    public sa1() {
        h73 h73Var = new h73();
        this.b = h73Var;
        this.c = new ua1(ut0.f.c, h73Var);
        this.d = false;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = new AtomicInteger(0);
        this.l = new AtomicInteger(0);
        this.m = new ra1();
        this.n = new Object();
        this.p = new AtomicBoolean();
    }

    public final mx0 a() {
        mx0 mx0Var;
        synchronized (this.a) {
            mx0Var = this.h;
        }
        return mx0Var;
    }

    public final void b(Context context, d60 d60Var, es1 es1Var) {
        mx0 mx0Var;
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.e = context.getApplicationContext();
                    this.f = d60Var;
                    vc3.C.g.f(this.c);
                    this.b.j(this.e);
                    e71.b(this.e, this.f);
                    this.i = es1Var;
                    ix0 ix0Var = lx0.f2;
                    tu0 tu0Var = tu0.e;
                    if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                        mx0Var = new mx0();
                    } else {
                        jn.p("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        mx0Var = null;
                    }
                    this.h = mx0Var;
                    if (mx0Var != null) {
                        ej1.s(new s91(this).o1(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.e;
                    if (ej1.k()) {
                        if (((Boolean) tu0Var.c.a(lx0.b9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new tt(this));
                            } catch (RuntimeException e) {
                                jn.V("Failed to register network callback", e);
                                this.p.set(true);
                            }
                        }
                    }
                    this.d = true;
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) tu0.e.c.a(lx0.we)).booleanValue()) {
            return;
        }
        vc3.C.c.E(context, d60Var.f);
    }

    public final Resources c() {
        if (this.f.i) {
            return this.e.getResources();
        }
        try {
            boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.Hb)).booleanValue();
            Context context = this.e;
            if (zBooleanValue) {
                return yd.A(context).a.getResources();
            }
            yd.A(context).a.getResources();
            return null;
        } catch (mb3 e) {
            jn.V("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void d(String str, Throwable th) {
        e71.b(this.e, this.f).c(str, th);
    }

    public final void e(String str, Throwable th) {
        e71.b(this.e, this.f).g(th, str, ((Double) dz0.f.u()).floatValue());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001d, B:10:0x002d, B:13:0x0037, B:14:0x0040), top: B:19:0x0007 }] */
    public final void f(String str, Throwable th) {
        Context context = this.e;
        d60 d60Var = this.f;
        synchronized (e71.q) {
            try {
                if (e71.s == null) {
                    ix0 ix0Var = lx0.e8;
                    tu0 tu0Var = tu0.e;
                    if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                        if (((Boolean) tu0Var.c.a(lx0.d8)).booleanValue()) {
                            e71.s = new ue0(15);
                        } else {
                            e71.s = new e71(context, d60Var);
                        }
                    } else {
                        e71.s = new ue0(15);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e71.s.c(str, th);
    }

    public final h73 g() {
        h73 h73Var;
        synchronized (this.a) {
            h73Var = this.b;
        }
        return h73Var;
    }

    public final hp h() {
        if (this.e != null) {
            if (!((Boolean) tu0.e.c.a(lx0.j3)).booleanValue()) {
                synchronized (this.n) {
                    try {
                        hp hpVar = this.o;
                        if (hpVar != null) {
                            return hpVar;
                        }
                        hp hpVarB = za1.a.b(new br0(2, this));
                        this.o = hpVarB;
                        return hpVarB;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return na1.t(new ArrayList());
    }

    public final boolean i(Context context) {
        if (ej1.k()) {
            if (((Boolean) tu0.e.c.a(lx0.b9)).booleanValue()) {
                return this.p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
