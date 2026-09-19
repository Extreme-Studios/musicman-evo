package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class y73 implements Runnable, vq0 {
    public static final long u = System.currentTimeMillis();
    public boolean i;
    public final boolean j;
    public final boolean k;
    public final ExecutorService l;
    public final ga2 m;
    public Context n;
    public final Context o;
    public d60 p;
    public final d60 q;
    public final boolean r;
    public int t;
    public final Vector f = new Vector();
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final CountDownLatch s = new CountDownLatch(1);

    public y73(Context context, d60 d60Var) {
        this.n = context;
        this.o = context;
        this.p = d60Var;
        this.q = d60Var;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.l = executorServiceNewCachedThreadPool;
        ix0 ix0Var = lx0.E2;
        tu0 tu0Var = tu0.e;
        boolean zBooleanValue = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue();
        this.r = zBooleanValue;
        this.m = ga2.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        ix0 ix0Var2 = lx0.B2;
        kx0 kx0Var = tu0Var.c;
        this.j = ((Boolean) kx0Var.a(ix0Var2)).booleanValue();
        this.k = ((Boolean) kx0Var.a(lx0.F2)).booleanValue();
        if (((Boolean) kx0Var.a(lx0.D2)).booleanValue()) {
            this.t = 2;
        } else {
            this.t = 1;
        }
        if (!((Boolean) kx0Var.a(lx0.O3)).booleanValue()) {
            this.i = l();
        }
        if (((Boolean) kx0Var.a(lx0.H3)).booleanValue()) {
            za1.a.execute(this);
            return;
        }
        f32 f32Var = ut0.f.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            za1.a.execute(this);
        } else {
            run();
        }
    }

    public static final tq0 p(Context context, d60 d60Var, boolean z, boolean z2) {
        tq0 tq0VarM;
        ro0 ro0VarD = so0.D();
        ro0VarD.b();
        ((so0) ro0VarD.g).F(z);
        String str = d60Var.f;
        ro0VarD.b();
        ((so0) ro0VarD.g).E(str);
        so0 so0Var = (so0) ro0VarD.c();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (tq0.class) {
            ha2 ha2Var = new ha2();
            ha2Var.b = false;
            byte b = (byte) (ha2Var.f | 1);
            ha2Var.c = true;
            ha2Var.d = 100L;
            ha2Var.e = 300L;
            ha2Var.f = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16)) | 32);
            String strZ = so0Var.z();
            if (strZ == null) {
                throw new NullPointerException("Null clientVersion");
            }
            ha2Var.a = strZ;
            ha2Var.b = so0Var.A();
            ha2Var.f = (byte) (ha2Var.f | 1);
            tq0VarM = tq0.m(context, Executors.newCachedThreadPool(), ha2Var.a(), z2);
        }
        return tq0VarM;
    }

    @Override // defpackage.vq0
    public final void a(int i, int i2, int i3) {
        vq0 vq0VarO = o();
        if (vq0VarO != null) {
            m();
            vq0VarO.a(i, i2, i3);
        } else {
            this.f.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
    }

    @Override // defpackage.vq0
    public final String b(Context context) {
        try {
            return (String) na1.F(new hq0(this, 16, context), this.l).get(((Integer) tu0.e.c.a(lx0.V2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.q.f;
            long j = u;
            try {
                zp0 zp0VarZ = aq0.z();
                zp0VarZ.b();
                ((aq0) zp0VarZ.g).B(str);
                zp0VarZ.b();
                ((aq0) zp0VarZ.g).A("0.460000000");
                String packageName = context.getPackageName();
                zp0VarZ.b();
                ((aq0) zp0VarZ.g).D(packageName);
                long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
                zp0VarZ.b();
                ((aq0) zp0VarZ.g).F(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                zp0VarZ.b();
                ((aq0) zp0VarZ.g).C(jCurrentTimeMillis2);
                try {
                    long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    zp0VarZ.b();
                    ((aq0) zp0VarZ.g).E(j2);
                } catch (PackageManager.NameNotFoundException unused3) {
                    zp0VarZ.b();
                    ((aq0) zp0VarZ.g).E(-1L);
                }
                dq0 dq0VarB = iq0.b(null, ((aq0) zp0VarZ.c()).b());
                dq0VarB.b();
                ((eq0) dq0VarB.g).C(5);
                dq0VarB.b();
                ((eq0) dq0VarB.g).D(2);
                return Base64.encodeToString(((eq0) dq0VarB.c()).b(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // defpackage.vq0
    public final void c(StackTraceElement[] stackTraceElementArr) {
        vq0 vq0VarO;
        vq0 vq0VarO2;
        if (((Boolean) tu0.e.c.a(lx0.c3)).booleanValue()) {
            if (this.s.getCount() != 0 || (vq0VarO2 = o()) == null) {
                return;
            }
            vq0VarO2.c(stackTraceElementArr);
            return;
        }
        if (!j() || (vq0VarO = o()) == null) {
            return;
        }
        vq0VarO.c(stackTraceElementArr);
    }

    @Override // defpackage.vq0
    public final String d(Context context) {
        return k(context);
    }

    @Override // defpackage.vq0
    public final void e(View view) {
        vq0 vq0VarO = o();
        if (vq0VarO != null) {
            vq0VarO.e(view);
        }
    }

    @Override // defpackage.vq0
    public final void f(MotionEvent motionEvent) {
        vq0 vq0VarO = o();
        if (vq0VarO == null) {
            this.f.add(new Object[]{motionEvent});
        } else {
            m();
            vq0VarO.f(motionEvent);
        }
    }

    @Override // defpackage.vq0
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // defpackage.vq0
    public final String h(Context context, String str, View view, Activity activity) {
        if (!j()) {
            return "";
        }
        vq0 vq0VarO = o();
        if (((Boolean) tu0.e.c.a(lx0.vb)).booleanValue()) {
            zb3 zb3Var = vc3.C.c;
            zb3.j(view, 4);
        }
        if (vq0VarO == null) {
            return "";
        }
        m();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return vq0VarO.h(context, str, view, activity);
    }

    @Override // defpackage.vq0
    public final String i(Context context, View view, Activity activity) {
        ix0 ix0Var = lx0.ub;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (!((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            vq0 vq0VarO = o();
            if (((Boolean) kx0Var2.a(lx0.vb)).booleanValue()) {
                zb3 zb3Var = vc3.C.c;
                zb3.j(view, 2);
            }
            return vq0VarO != null ? vq0VarO.i(context, view, activity) : "";
        }
        if (!j()) {
            return "";
        }
        vq0 vq0VarO2 = o();
        if (((Boolean) kx0Var2.a(lx0.vb)).booleanValue()) {
            zb3 zb3Var2 = vc3.C.c;
            zb3.j(view, 2);
        }
        return vq0VarO2 != null ? vq0VarO2.i(context, view, activity) : "";
    }

    public final boolean j() {
        try {
            this.s.await();
            return true;
        } catch (InterruptedException e) {
            jn.V("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final String k(Context context) {
        vq0 vq0VarO;
        if (!j() || (vq0VarO = o()) == null) {
            return "";
        }
        m();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return vq0VarO.d(context);
    }

    public final boolean l() {
        Context context = this.n;
        rz1 rz1Var = new rz1(7, this);
        db2 db2Var = new db2(context, rs0.w(context, this.m), rz1Var, ((Boolean) tu0.e.c.a(lx0.C2)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (db2.k) {
            try {
                ht0 ht0VarS = db2Var.s(1);
                if (ht0VarS == null) {
                    db2Var.q(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileK = db2Var.k(ht0VarS.z());
                if (!new File(fileK, "pcam.jar").exists()) {
                    db2Var.q(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileK, "pcbc").exists()) {
                    db2Var.q(5019, jCurrentTimeMillis);
                    return true;
                }
                db2Var.q(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        vq0 vq0VarO = o();
        Vector<Object[]> vector = this.f;
        if (vector.isEmpty() || vq0VarO == null) {
            return;
        }
        for (Object[] objArr : vector) {
            int length = objArr.length;
            if (length == 1) {
                vq0VarO.f((MotionEvent) objArr[0]);
            } else if (length == 3) {
                vq0VarO.a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void n(boolean z) {
        String str = this.p.f;
        Context context = this.n;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        ro0 ro0VarD = so0.D();
        ro0VarD.b();
        ((so0) ro0VarD.g).F(z);
        ro0VarD.b();
        ((so0) ro0VarD.g).E(str);
        so0 so0Var = (so0) ro0VarD.c();
        qk qkVar = new qk();
        qkVar.g = so0Var.z();
        qkVar.f = so0Var.A();
        qkVar.h = so0Var.B();
        so0Var.C();
        synchronized (wq0.class) {
            try {
                if (!wq0.E) {
                    wq0.F = System.currentTimeMillis() / 1000;
                    wq0.C = wq0.q(context, qkVar.f);
                    ix0 ix0Var = lx0.J3;
                    tu0 tu0Var = tu0.e;
                    if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                        wq0.G = dr0.n(context);
                    }
                    ExecutorService executorService = wq0.C.b;
                    if (((Boolean) tu0Var.c.a(lx0.K3)).booleanValue() && executorService != null) {
                        wq0.H = tr0.a(context, executorService);
                    }
                    if (((Boolean) tu0Var.c.a(lx0.S2)).booleanValue()) {
                        wq0.I = new ad0();
                    }
                    if (((Boolean) tu0Var.c.a(lx0.Y2)).booleanValue() || ((ap0) qkVar.h).D()) {
                        wq0.K = new dr0(context, executorService);
                    }
                    if (((Boolean) tu0Var.c.a(lx0.T2)).booleanValue() || ((ap0) qkVar.h).B()) {
                        wq0.J = new p83(context, executorService, (ap0) qkVar.h, wq0.K);
                    }
                    wq0.E = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g.set(new wq0(context, qkVar));
    }

    public final vq0 o() {
        return ((!this.j || this.i) ? this.t : 1) == 2 ? (vq0) this.h.get() : (vq0) this.g.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            ix0 ix0Var = lx0.O3;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                this.i = l();
            }
            boolean z2 = this.p.i;
            boolean z3 = false;
            if (!((Boolean) tu0Var.c.a(lx0.f1)).booleanValue() && z2) {
                z3 = true;
            }
            if (((!this.j || this.i) ? this.t : 1) == 1) {
                n(z3);
                int i = 2;
                if (this.t == 2) {
                    this.l.execute(new c61(this, z3, i));
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    tq0 tq0VarP = p(this.n, this.p, z3, this.r);
                    this.h.set(tq0VarP);
                    if (this.k) {
                        synchronized (tq0VarP) {
                            z = tq0VarP.v;
                        }
                        if (!z) {
                            this.t = 1;
                            n(z3);
                        }
                    }
                } catch (NullPointerException e) {
                    this.t = 1;
                    n(z3);
                    this.m.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.s.countDown();
            this.n = null;
            this.p = null;
        } catch (Throwable th) {
            this.s.countDown();
            this.n = null;
            this.p = null;
            throw th;
        }
    }
}
