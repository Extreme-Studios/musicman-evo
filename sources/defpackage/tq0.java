package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class tq0 implements vq0 {
    public static tq0 w;
    public final Context f;
    public final u40 g;
    public final db2 h;
    public final fb2 i;
    public final jr0 j;
    public final ga2 k;
    public final Executor l;
    public final ct0 m;
    public final zf0 n;
    public final tr0 p;
    public final ad0 q;
    public final zy1 r;
    public volatile boolean u;
    public volatile boolean v;
    public volatile long s = 0;
    public final Object t = new Object();
    public final CountDownLatch o = new CountDownLatch(1);

    public tq0(Context context, ga2 ga2Var, u40 u40Var, db2 db2Var, fb2 fb2Var, jr0 jr0Var, Executor executor, fa2 fa2Var, ct0 ct0Var, tr0 tr0Var, ad0 ad0Var, zy1 zy1Var) {
        this.v = false;
        this.f = context;
        this.k = ga2Var;
        this.g = u40Var;
        this.h = db2Var;
        this.i = fb2Var;
        this.j = jr0Var;
        this.l = executor;
        this.m = ct0Var;
        this.p = tr0Var;
        this.q = ad0Var;
        this.r = zy1Var;
        this.v = false;
        this.n = new zf0(this, fa2Var);
    }

    public static synchronized tq0 m(Context context, ExecutorService executorService, ia2 ia2Var, boolean z) {
        try {
            if (w == null) {
                ga2 ga2VarA = ga2.a(context, executorService, z);
                ix0 ix0Var = lx0.J3;
                tu0 tu0Var = tu0.e;
                dr0 dr0VarN = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue() ? dr0.n(context) : null;
                tr0 tr0VarA = ((Boolean) tu0Var.c.a(lx0.K3)).booleanValue() ? tr0.a(context, executorService) : null;
                ad0 ad0Var = ((Boolean) tu0Var.c.a(lx0.S2)).booleanValue() ? new ad0() : null;
                zy1 zy1Var = ((Boolean) tu0Var.c.a(lx0.b3)).booleanValue() ? new zy1(13) : null;
                y91 y91VarQ = y91.q(context, executorService, ga2VarA);
                ir0 ir0Var = new ir0(context);
                jr0 jr0Var = new jr0(ia2Var, y91VarQ, new rr0(context, ir0Var), ir0Var, dr0VarN, tr0VarA, ad0Var, zy1Var);
                ct0 ct0VarW = rs0.w(context, ga2VarA);
                fa2 fa2Var = new fa2();
                tq0 tq0Var = new tq0(context, ga2VarA, new u40(context, ct0VarW), new db2(context, ct0VarW, new s70(14, ga2VarA), ((Boolean) tu0Var.c.a(lx0.C2)).booleanValue()), new fb2(context, jr0Var, ga2VarA, fa2Var, false), jr0Var, executorService, fa2Var, ct0VarW, tr0VarA, ad0Var, zy1Var);
                w = tq0Var;
                tq0Var.j();
                w.k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return w;
    }

    @Override // defpackage.vq0
    public final void a(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) tu0.e.c.a(lx0.Lc)).booleanValue() || (displayMetrics = this.f.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = displayMetrics.density;
        float f3 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(motionEventObtain);
        motionEventObtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(motionEventObtain2);
        motionEventObtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // defpackage.vq0
    public final String b(Context context) {
        return "19";
    }

    @Override // defpackage.vq0
    public final void c(StackTraceElement[] stackTraceElementArr) {
        zy1 zy1Var = this.r;
        if (zy1Var != null) {
            zy1Var.g = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // defpackage.vq0
    public final String d(Context context) {
        tr0 tr0Var = this.p;
        if (tr0Var != null && tr0Var.d) {
            tr0Var.b = System.currentTimeMillis();
        }
        if (((Boolean) tu0.e.c.a(lx0.S2)).booleanValue()) {
            ad0 ad0Var = this.q;
            ad0Var.b = ad0Var.a;
            ad0Var.a = SystemClock.uptimeMillis();
        }
        k();
        db2 db2VarB = this.i.b();
        if (db2VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = db2VarB.d(context);
        this.k.e(5001, System.currentTimeMillis() - jCurrentTimeMillis, null, strD, null);
        return strD;
    }

    @Override // defpackage.vq0
    public final void e(View view) {
        this.j.c.a(view);
    }

    @Override // defpackage.vq0
    public final void f(MotionEvent motionEvent) {
        db2 db2VarB = this.i.b();
        if (db2VarB != null) {
            try {
                db2VarB.j(motionEvent);
            } catch (eb2 e) {
                this.k.c(e.f, -1L, e);
            }
        }
    }

    @Override // defpackage.vq0
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // defpackage.vq0
    public final String h(Context context, String str, View view, Activity activity) {
        tr0 tr0Var = this.p;
        if (tr0Var != null && tr0Var.d) {
            tr0Var.b = System.currentTimeMillis();
        }
        if (((Boolean) tu0.e.c.a(lx0.S2)).booleanValue()) {
            ad0 ad0Var = this.q;
            ad0Var.h = ad0Var.g;
            ad0Var.g = SystemClock.uptimeMillis();
        }
        k();
        db2 db2VarB = this.i.b();
        if (db2VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strI = db2VarB.i(context, str, view, activity);
        this.k.e(5000, System.currentTimeMillis() - jCurrentTimeMillis, null, strI, null);
        return strI;
    }

    @Override // defpackage.vq0
    public final String i(Context context, View view, Activity activity) {
        tr0 tr0Var = this.p;
        if (tr0Var != null && tr0Var.d) {
            tr0Var.b = System.currentTimeMillis();
        }
        if (((Boolean) tu0.e.c.a(lx0.S2)).booleanValue()) {
            this.q.b(context, view);
        }
        k();
        db2 db2VarB = this.i.b();
        if (db2VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strG = db2VarB.g(context, view, activity);
        this.k.e(5002, System.currentTimeMillis() - jCurrentTimeMillis, null, strG, null);
        return strG;
    }

    public final synchronized void j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        kd0 kd0VarN = n();
        if (kd0VarN == null) {
            this.k.b(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.i.a(kd0VarN)) {
            this.v = true;
            this.o.countDown();
        }
    }

    public final void k() {
        kd0 kd0Var;
        if (this.u) {
            return;
        }
        synchronized (this.t) {
            try {
                if (!this.u) {
                    if ((System.currentTimeMillis() / 1000) - this.s < 3600) {
                        return;
                    }
                    fb2 fb2Var = this.i;
                    synchronized (fb2Var.g) {
                        try {
                            db2 db2Var = fb2Var.f;
                            kd0Var = db2Var != null ? (kd0) db2Var.h : null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if ((kd0Var == null || ((ht0) kd0Var.g).B() - (System.currentTimeMillis() / 1000) < 3600) && rs0.s(this.m)) {
                        this.l.execute(new q7(18, this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d2 A[Catch: all -> 0x009a, o23 -> 0x009d, TryCatch #1 {o23 -> 0x009d, blocks: (B:6:0x001d, B:8:0x002b, B:12:0x0031, B:13:0x003f, B:15:0x004d, B:17:0x005b, B:20:0x0068, B:34:0x00a0, B:38:0x00b9, B:44:0x00d2, B:45:0x00df, B:47:0x00e5, B:49:0x00ed, B:50:0x00f0, B:41:0x00c3, B:42:0x00ca, B:23:0x006f, B:25:0x0075, B:27:0x0087, B:51:0x00fa, B:52:0x0107, B:53:0x0114), top: B:60:0x001d, outer: #0 }] */
    public final void l() {
        String strZ;
        String strA;
        int length;
        kd0 kd0VarN;
        ht0 ht0Var;
        boolean zK;
        long jCurrentTimeMillis = System.currentTimeMillis();
        kd0 kd0VarN2 = n();
        if (kd0VarN2 != null) {
            strZ = ((ht0) kd0VarN2.g).z();
            strA = ((ht0) kd0VarN2.g).A();
        } else {
            strZ = null;
            strA = null;
        }
        try {
            try {
                Context context = this.f;
                ct0 ct0Var = this.m;
                ga2 ga2Var = this.k;
                cb2 cb2VarZ = s90.z(context, ct0Var, strZ, strA, ga2Var);
                byte[] bArr = cb2VarZ.g;
                if (bArr == null || (length = bArr.length) == 0) {
                    ga2Var.b(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        l13 l13VarN = n13.n(bArr, 0, length);
                        v13 v13Var = v13.a;
                        int i = h13.a;
                        dt0 dt0VarC = dt0.C(l13VarN, v13.b);
                        if (dt0VarC.z().z().isEmpty() || dt0VarC.z().A().isEmpty() || dt0VarC.B().p().length == 0 || ((kd0VarN = n()) != null && (ht0Var = (ht0) kd0VarN.g) != null && dt0VarC.z().z().equals(ht0Var.z()) && dt0VarC.z().A().equals(ht0Var.A()))) {
                            this.k.b(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zf0 zf0Var = this.n;
                            int i2 = cb2VarZ.h;
                            if (!((Boolean) tu0.e.c.a(lx0.A2)).booleanValue()) {
                                zK = this.g.k(dt0VarC, zf0Var);
                            } else if (i2 == 3) {
                                zK = this.h.h(dt0VarC);
                            } else if (i2 == 4) {
                                zK = this.h.f(dt0VarC, zf0Var);
                            } else {
                                this.k.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zK) {
                                kd0 kd0VarN3 = n();
                                if (kd0VarN3 != null) {
                                    if (this.i.a(kd0VarN3)) {
                                        this.v = true;
                                    }
                                    this.s = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.k.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.k.b(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (o23 e) {
                this.k.c(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
        } finally {
            this.o.countDown();
        }
    }

    public final kd0 n() {
        if (rs0.s(this.m)) {
            if (((Boolean) tu0.e.c.a(lx0.A2)).booleanValue()) {
                db2 db2Var = this.h;
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (db2.k) {
                    try {
                        ht0 ht0VarS = db2Var.s(1);
                        if (ht0VarS == null) {
                            db2Var.q(4022, jCurrentTimeMillis);
                            return null;
                        }
                        File fileK = db2Var.k(ht0VarS.z());
                        File file = new File(fileK, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(fileK, "pcam");
                        }
                        File file2 = new File(fileK, "pcbc");
                        File file3 = new File(fileK, "pcopt");
                        db2Var.q(5016, jCurrentTimeMillis);
                        return new kd0(ht0VarS, file, file2, file3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            u40 u40Var = this.g;
            ht0 ht0VarQ = u40Var.q(1);
            if (ht0VarQ != null) {
                String strZ = ht0VarQ.z();
                File fileA = ss0.A(strZ, "pcam.jar", u40Var.t());
                if (!fileA.exists()) {
                    fileA = ss0.A(strZ, "pcam", u40Var.t());
                }
                return new kd0(ht0VarQ, fileA, ss0.A(strZ, "pcbc", u40Var.t()), ss0.A(strZ, "pcopt", u40Var.t()));
            }
        }
        return null;
    }
}
