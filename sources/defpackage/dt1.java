package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dt1 {
    public final long d;
    public final Context f;
    public final WeakReference g;
    public final rr1 h;
    public final Executor i;
    public final Executor j;
    public final ScheduledExecutorService k;
    public final js1 l;
    public final d60 m;
    public final nm1 o;
    public final e72 p;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public final cb1 e = new cb1();
    public final ConcurrentHashMap n = new ConcurrentHashMap();
    public boolean q = true;

    public dt1(Executor executor, Context context, WeakReference weakReference, ya1 ya1Var, rr1 rr1Var, ScheduledExecutorService scheduledExecutorService, js1 js1Var, d60 d60Var, nm1 nm1Var, e72 e72Var) {
        this.h = rr1Var;
        this.f = context;
        this.g = weakReference;
        this.i = ya1Var;
        this.k = scheduledExecutorService;
        this.j = executor;
        this.l = js1Var;
        this.m = d60Var;
        this.o = nm1Var;
        this.p = e72Var;
        vc3.C.k.getClass();
        this.d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final void a() {
        final int i = 0;
        final int i2 = 1;
        if (!((Boolean) az0.a.u()).booleanValue()) {
            int i3 = this.m.h;
            ix0 ix0Var = lx0.V1;
            tu0 tu0Var = tu0.e;
            if (i3 >= ((Integer) tu0Var.c.a(ix0Var)).intValue() && this.q) {
                if (this.a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.a) {
                            return;
                        }
                        this.l.d();
                        this.o.b();
                        cb1 cb1Var = this.e;
                        Runnable runnable = new Runnable(this) { // from class: bt1
                            public final /* synthetic */ dt1 g;

                            {
                                this.g = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        dt1 dt1Var = this.g;
                                        js1 js1Var = dt1Var.l;
                                        synchronized (js1Var) {
                                            try {
                                                if (((Boolean) tu0.e.c.a(lx0.h2)).booleanValue() && !js1Var.d) {
                                                    HashMap mapE = js1Var.e();
                                                    mapE.put("action", "init_finished");
                                                    ArrayList arrayList = js1Var.b;
                                                    arrayList.add(mapE);
                                                    int size = arrayList.size();
                                                    int i4 = 0;
                                                    while (i4 < size) {
                                                        Object obj = arrayList.get(i4);
                                                        i4++;
                                                        js1Var.f.a((Map) obj, false);
                                                    }
                                                    js1Var.d = true;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        dt1Var.o.d();
                                        dt1Var.b = true;
                                        return;
                                    default:
                                        dt1 dt1Var2 = this.g;
                                        synchronized (dt1Var2) {
                                            try {
                                                if (dt1Var2.c) {
                                                    return;
                                                }
                                                vc3.C.k.getClass();
                                                dt1Var2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - dt1Var2.d), "Timeout.", false);
                                                dt1Var2.l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                dt1Var2.o.s("com.google.android.gms.ads.MobileAds", "timeout");
                                                dt1Var2.e.c(new Exception());
                                                return;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                }
                            }
                        };
                        Executor executor = this.i;
                        cb1Var.f.a(runnable, executor);
                        this.a = true;
                        hp hpVarC = c();
                        this.k.schedule(new Runnable(this) { // from class: bt1
                            public final /* synthetic */ dt1 g;

                            {
                                this.g = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        dt1 dt1Var = this.g;
                                        js1 js1Var = dt1Var.l;
                                        synchronized (js1Var) {
                                            try {
                                                if (((Boolean) tu0.e.c.a(lx0.h2)).booleanValue() && !js1Var.d) {
                                                    HashMap mapE = js1Var.e();
                                                    mapE.put("action", "init_finished");
                                                    ArrayList arrayList = js1Var.b;
                                                    arrayList.add(mapE);
                                                    int size = arrayList.size();
                                                    int i4 = 0;
                                                    while (i4 < size) {
                                                        Object obj = arrayList.get(i4);
                                                        i4++;
                                                        js1Var.f.a((Map) obj, false);
                                                    }
                                                    js1Var.d = true;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        dt1Var.o.d();
                                        dt1Var.b = true;
                                        return;
                                    default:
                                        dt1 dt1Var2 = this.g;
                                        synchronized (dt1Var2) {
                                            try {
                                                if (dt1Var2.c) {
                                                    return;
                                                }
                                                vc3.C.k.getClass();
                                                dt1Var2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - dt1Var2.d), "Timeout.", false);
                                                dt1Var2.l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                dt1Var2.o.s("com.google.android.gms.ads.MobileAds", "timeout");
                                                dt1Var2.e.c(new Exception());
                                                return;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                }
                            }
                        }, ((Long) tu0Var.c.a(lx0.X1)).longValue(), TimeUnit.SECONDS);
                        hpVarC.a(new in2(hpVarC, i, new oc2(this)), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.e.b(Boolean.FALSE);
        this.a = true;
        this.b = true;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.n;
        for (String str : concurrentHashMap.keySet()) {
            s21 s21Var = (s21) concurrentHashMap.get(str);
            arrayList.add(new s21(str, s21Var.h, s21Var.i, s21Var.g));
        }
        return arrayList;
    }

    public final synchronized hp c() {
        vc3 vc3Var = vc3.C;
        String str = vc3Var.h.g().m().e;
        if (!TextUtils.isEmpty(str)) {
            return na1.t(str);
        }
        cb1 cb1Var = new cb1();
        h73 h73VarG = vc3Var.h.g();
        h73VarG.c.add(new hb1(this, cb1Var, 15, false));
        return cb1Var;
    }

    public final void d(String str, int i, String str2, boolean z) {
        this.n.put(str, new s21(str, i, str2, z));
    }
}
