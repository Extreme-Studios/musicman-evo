package com.extremestudios.musicmanevo;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.b22;
import defpackage.g92;
import defpackage.he;
import defpackage.hu0;
import defpackage.j41;
import defpackage.jn;
import defpackage.kt1;
import defpackage.lx0;
import defpackage.mo;
import defpackage.mz1;
import defpackage.py0;
import defpackage.tu0;
import defpackage.wv;
import defpackage.xs0;
import defpackage.zs;

/* JADX INFO: loaded from: classes.dex */
public final class MusicmanEvoApp extends Application implements Application.ActivityLifecycleCallbacks, he {
    public Activity f;
    public g92 g;

    @Override // defpackage.he
    public final void c(mo moVar) {
        Activity activity = this.f;
        if (activity != null) {
            g92 g92Var = this.g;
            if (g92Var == null) {
                jn.k("appOpenAdManager");
                throw null;
            }
            if (g92Var.b) {
                return;
            }
            hu0 hu0Var = (hu0) g92Var.c;
            if (hu0Var == null) {
                g92Var.a();
            } else {
                hu0Var.b.f = new zs(g92Var);
                hu0Var.b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        g92 g92Var = this.g;
        if (g92Var == null) {
            jn.k("appOpenAdManager");
            throw null;
        }
        if (g92Var.b) {
            return;
        }
        this.f = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: all -> 0x0047, TryCatch #1 {, blocks: (B:18:0x0025, B:24:0x0050, B:26:0x0061, B:28:0x0073, B:35:0x00b7, B:36:0x00c6, B:29:0x0083, B:31:0x0091, B:33:0x00a3, B:34:0x00af, B:23:0x004b), top: B:44:0x0025, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[Catch: all -> 0x0047, TryCatch #1 {, blocks: (B:18:0x0025, B:24:0x0050, B:26:0x0061, B:28:0x0073, B:35:0x00b7, B:36:0x00c6, B:29:0x0083, B:31:0x0091, B:33:0x00a3, B:34:0x00af, B:23:0x004b), top: B:44:0x0025, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3 A[Catch: all -> 0x0047, TryCatch #1 {, blocks: (B:18:0x0025, B:24:0x0050, B:26:0x0061, B:28:0x0073, B:35:0x00b7, B:36:0x00c6, B:29:0x0083, B:31:0x0091, B:33:0x00a3, B:34:0x00af, B:23:0x004b), top: B:44:0x0025, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00af A[Catch: all -> 0x0047, TryCatch #1 {, blocks: (B:18:0x0025, B:24:0x0050, B:26:0x0061, B:28:0x0073, B:35:0x00b7, B:36:0x00c6, B:29:0x0083, B:31:0x0091, B:33:0x00a3, B:34:0x00af, B:23:0x004b), top: B:44:0x0025, inners: #2 }] */
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
        final b22 b22VarC = b22.c();
        synchronized (b22VarC.a) {
            try {
                if (!b22VarC.c) {
                    if (!b22VarC.d) {
                        final int i = 1;
                        b22VarC.c = true;
                        synchronized (b22VarC.e) {
                            try {
                                b22VarC.a(this);
                                b22VarC.f.z2(new kt1(1, b22VarC));
                                b22VarC.f.y2(new j41());
                                b22VarC.g.getClass();
                                b22VarC.g.getClass();
                            } catch (RemoteException e) {
                                jn.V("MobileAdsSettingManager initialization failed", e);
                            }
                            lx0.a(this);
                            if (((Boolean) py0.a.u()).booleanValue()) {
                                if (((Boolean) tu0.e.c.a(lx0.Vb)).booleanValue()) {
                                    jn.F("Initializing on bg thread");
                                    xs0.a.execute(new Runnable() { // from class: w02
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            int i2 = i;
                                            b22 b22Var = b22VarC;
                                            switch (i2) {
                                                case 0:
                                                    synchronized (b22Var.e) {
                                                        b22Var.b();
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    synchronized (b22Var.e) {
                                                        b22Var.b();
                                                        break;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                } else if (((Boolean) py0.b.u()).booleanValue()) {
                                    if (((Boolean) tu0.e.c.a(lx0.Vb)).booleanValue()) {
                                        final int i2 = 0;
                                        xs0.b.execute(new Runnable() { // from class: w02
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                int i3 = i2;
                                                b22 b22Var = b22VarC;
                                                switch (i3) {
                                                    case 0:
                                                        synchronized (b22Var.e) {
                                                            b22Var.b();
                                                            break;
                                                        }
                                                        return;
                                                    default:
                                                        synchronized (b22Var.e) {
                                                            b22Var.b();
                                                            break;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        jn.F("Initializing on calling thread");
                                        b22VarC.b();
                                    }
                                } else {
                                    jn.F("Initializing on calling thread");
                                    b22VarC.b();
                                }
                            } else if (((Boolean) py0.b.u()).booleanValue()) {
                                if (((Boolean) tu0.e.c.a(lx0.Vb)).booleanValue()) {
                                    final int i3 = 0;
                                    xs0.b.execute(new Runnable() { // from class: w02
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            int i4 = i3;
                                            b22 b22Var = b22VarC;
                                            switch (i4) {
                                                case 0:
                                                    synchronized (b22Var.e) {
                                                        b22Var.b();
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    synchronized (b22Var.e) {
                                                        b22Var.b();
                                                        break;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                } else {
                                    jn.F("Initializing on calling thread");
                                    b22VarC.b();
                                }
                            } else {
                                jn.F("Initializing on calling thread");
                                b22VarC.b();
                            }
                            new mz1(this);
                            new mz1(this);
                            new mz1(this);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g92 g92Var = new g92(this);
        this.g = g92Var;
        g92Var.a();
        wv.n.k.a(this);
    }

    @Override // defpackage.he
    public final void a(mo moVar) {
    }

    @Override // defpackage.he
    public final void b(mo moVar) {
    }

    @Override // defpackage.he
    public final void d(mo moVar) {
    }

    @Override // defpackage.he
    public final void e(mo moVar) {
    }

    @Override // defpackage.he
    public final void f(mo moVar) {
    }
}
