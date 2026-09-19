package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class dm implements Handler.Callback {
    public static final Status t = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status u = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object v = new Object();
    public static dm w;
    public long f;
    public boolean g;
    public p30 h;
    public xa0 i;
    public final Context j;
    public final zl k;
    public final z61 l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final ConcurrentHashMap o;
    public final n7 p;
    public final n7 q;
    public final za0 r;
    public volatile boolean s;

    public dm(Context context, Looper looper) {
        zl zlVar = zl.d;
        this.f = 10000L;
        this.g = false;
        this.m = new AtomicInteger(1);
        this.n = new AtomicInteger(0);
        this.o = new ConcurrentHashMap(5, 0.75f, 1);
        this.p = new n7(0);
        this.q = new n7(0);
        this.s = true;
        this.j = context;
        za0 za0Var = new za0(looper, this, 0);
        this.r = za0Var;
        this.k = zlVar;
        this.l = new z61(6);
        PackageManager packageManager = context.getPackageManager();
        if (jn.s == null) {
            jn.s = Boolean.valueOf(ej1.k() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (jn.s.booleanValue()) {
            this.s = false;
        }
        za0Var.sendMessage(za0Var.obtainMessage(6));
    }

    public static Status c(z3 z3Var, db dbVar) {
        String str = (String) z3Var.b.h;
        String strValueOf = String.valueOf(dbVar);
        return new Status(17, ec.o(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), dbVar.h, dbVar);
    }

    public static dm e(Context context) {
        dm dmVar;
        HandlerThread handlerThread;
        synchronized (v) {
            if (w == null) {
                synchronized (bc3.g) {
                    try {
                        handlerThread = bc3.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            bc3.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = bc3.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = zl.c;
                w = new dm(applicationContext, looper);
            }
            dmVar = w;
        }
        return dmVar;
    }

    public final boolean a() {
        if (this.g) {
            return false;
        }
        ay ayVar = (ay) zx.o().g;
        if (ayVar != null && !ayVar.g) {
            return false;
        }
        int i = ((SparseIntArray) this.l.g).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(db dbVar, int i) {
        zl zlVar = this.k;
        zlVar.getClass();
        Context context = this.j;
        if (!hn.m(context)) {
            int i2 = dbVar.g;
            PendingIntent activity = dbVar.h;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentB = zlVar.b(i2, context, null);
                if (intentB != null) {
                    activity = PendingIntent.getActivity(context, 0, intentB, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.g;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                zlVar.g(context, i2, PendingIntent.getActivity(context, 0, intent, wa0.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final z90 d(yl ylVar) {
        z3 z3Var = ylVar.j;
        ConcurrentHashMap concurrentHashMap = this.o;
        z90 z90Var = (z90) concurrentHashMap.get(z3Var);
        if (z90Var == null) {
            z90Var = new z90(this, ylVar);
            concurrentHashMap.put(z3Var, z90Var);
        }
        if (z90Var.g.k()) {
            this.q.add(z3Var);
        }
        z90Var.j();
        return z90Var;
    }

    public final void f(db dbVar, int i) {
        if (b(dbVar, i)) {
            return;
        }
        za0 za0Var = this.r;
        za0Var.sendMessage(za0Var.obtainMessage(5, i, 0, dbVar));
    }

    /* JADX WARN: Code duplicated, block: B:172:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:174:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:176:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ed  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 z90, still in use, count: 2, list:
          (r2v6 z90) from 0x03a3: IGET (r2v6 z90) A[WRAPPED] (LINE:932) z90.l int
          (r2v6 z90) from 0x03a9: PHI (r2 I:??) = (r2v3 z90), (r2v6 z90) binds: [B:170:0x03a8, B:228:0x03a9] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm.handleMessage(android.os.Message):boolean");
    }
}
