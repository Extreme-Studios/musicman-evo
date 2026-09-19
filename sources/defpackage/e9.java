package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class e9 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public e9(dr0 dr0Var, f9 f9Var, ur urVar, rr rrVar) {
        this.f = 0;
        this.j = dr0Var;
        this.g = f9Var;
        this.h = urVar;
        this.i = rrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContains;
        uu0 uu0Var;
        boolean z;
        long j;
        final int i = 0;
        final int i2 = 1;
        switch (this.f) {
            case 0:
                g9 g9Var = (g9) ((dr0) this.j).g;
                ur urVar = (ur) this.h;
                f9 f9Var = (f9) this.g;
                if (f9Var != null) {
                    g9Var.E = true;
                    f9Var.b.c(false);
                    g9Var.E = false;
                }
                if (urVar.isEnabled() && urVar.hasSubMenu()) {
                    ((rr) this.i).q(urVar, null, 4);
                    return;
                }
                return;
            case 1:
                y6 y6Var = (y6) this.j;
                q2 q2Var = (q2) this.i;
                Context context = (Context) this.g;
                try {
                    new e31(context, (String) this.h).c(q2Var.a, y6Var);
                    return;
                } catch (IllegalStateException e) {
                    e71.a(context).c("InterstitialAd.load", e);
                    return;
                }
            case 2:
                ns0 ns0Var = (ns0) this.g;
                String str = (String) this.h;
                ep0 ep0Var = (ep0) this.i;
                ma1 ma1Var = (ma1) this.j;
                uk1 uk1Var = ns0Var.b;
                uk1Var.e();
                synchronized (uk1Var.d) {
                    zContains = uk1Var.a.contains(str);
                    break;
                }
                if (zContains || ns0Var.a()) {
                    return;
                }
                ep0Var.f2(new ju(ns0Var.a), ma1Var, null);
                return;
            case 3:
                y6 y6Var2 = (y6) this.j;
                q2 q2Var2 = (q2) this.i;
                Context context2 = (Context) this.g;
                try {
                    new m40(context2, (String) this.h, q2Var2.a, y6Var2).a();
                    return;
                } catch (IllegalStateException e2) {
                    e71.a(context2).c("AppOpenAd.load", e2);
                    return;
                }
            case 4:
                vt1 vt1Var = (vt1) this.j;
                q2 q2Var3 = (q2) this.i;
                Context context3 = (Context) this.g;
                try {
                    new c91(context3, (String) this.h).b(q2Var3.a, vt1Var);
                    return;
                } catch (IllegalStateException e3) {
                    e71.a(context3).c("RewardedInterstitialAd.load", e3);
                    return;
                }
            case 5:
                yu0 yu0Var = (yu0) this.j;
                vu0 vu0Var = (vu0) this.h;
                r52 r52Var = (r52) this.g;
                try {
                    xu0 xu0Var = (xu0) vu0Var.t();
                    boolean z2 = vu0Var.z();
                    wu0 wu0Var = (wu0) this.i;
                    if (z2) {
                        Parcel parcelU = xu0Var.U();
                        kt0.c(parcelU, wu0Var);
                        Parcel parcelY = xu0Var.Y(parcelU, 2);
                        uu0Var = (uu0) kt0.b(parcelY, uu0.CREATOR);
                        parcelY.recycle();
                    } else {
                        Parcel parcelU2 = xu0Var.U();
                        kt0.c(parcelU2, wu0Var);
                        Parcel parcelY2 = xu0Var.Y(parcelU2, 1);
                        uu0Var = (uu0) kt0.b(parcelY2, uu0.CREATOR);
                        parcelY2.recycle();
                    }
                    uu0 uu0Var2 = uu0Var;
                    if (!uu0Var2.a()) {
                        yu0Var.c(new RuntimeException("No entry contents."));
                        ((qk) r52Var.i).c();
                        return;
                    }
                    zu0 zu0Var = new zu0(r52Var, uu0Var2.b());
                    int i3 = zu0Var.read();
                    if (i3 == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    zu0Var.unread(i3);
                    synchronized (uu0Var2) {
                        z = uu0Var2.g;
                    }
                    boolean zD = uu0Var2.d();
                    synchronized (uu0Var2) {
                        j = uu0Var2.i;
                    }
                    yu0Var.b(new av0(zu0Var, z, zD, j, uu0Var2.c()));
                    return;
                } catch (RemoteException e4) {
                    e = e4;
                    Throwable th = e;
                    jn.P("Unable to obtain a cache service instance.", th);
                    yu0Var.c(th);
                    ((qk) r52Var.i).c();
                    return;
                } catch (IOException e5) {
                    e = e5;
                    Throwable th2 = e;
                    jn.P("Unable to obtain a cache service instance.", th2);
                    yu0Var.c(th2);
                    ((qk) r52Var.i).c();
                    return;
                }
            case 6:
                vt1 vt1Var2 = (vt1) this.j;
                q2 q2Var4 = (q2) this.i;
                Context context4 = (Context) this.g;
                try {
                    new u81(context4, (String) this.h).b(q2Var4.a, vt1Var2);
                    return;
                } catch (IllegalStateException e6) {
                    e71.a(context4).c("RewardedAd.load", e6);
                    return;
                }
            case 7:
                AudioTrack audioTrack = (AudioTrack) this.g;
                final bz1 bz1Var = (bz1) this.h;
                Handler handler = (Handler) this.i;
                final ya3 ya3Var = (ya3) this.j;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (bz1Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: ib3
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i4 = i;
                                ya3 ya3Var2 = ya3Var;
                                bz1 bz1Var2 = bz1Var;
                                switch (i4) {
                                    case 0:
                                        un1 un1Var = ((rb3) bz1Var2.f).E0;
                                        Handler handler2 = (Handler) un1Var.g;
                                        if (handler2 != null) {
                                            handler2.post(new ra3(un1Var, ya3Var2, 1));
                                        }
                                        break;
                                    default:
                                        un1 un1Var2 = ((rb3) bz1Var2.f).E0;
                                        Handler handler3 = (Handler) un1Var2.g;
                                        if (handler3 != null) {
                                            handler3.post(new ra3(un1Var2, ya3Var2, 1));
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (qb3.f0) {
                        try {
                            int i4 = qb3.h0 - 1;
                            qb3.h0 = i4;
                            if (i4 == 0) {
                                qb3.g0.shutdown();
                                qb3.g0 = null;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th4) {
                    if (bz1Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: ib3
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i2;
                                ya3 ya3Var2 = ya3Var;
                                bz1 bz1Var2 = bz1Var;
                                switch (i5) {
                                    case 0:
                                        un1 un1Var = ((rb3) bz1Var2.f).E0;
                                        Handler handler2 = (Handler) un1Var.g;
                                        if (handler2 != null) {
                                            handler2.post(new ra3(un1Var, ya3Var2, 1));
                                        }
                                        break;
                                    default:
                                        un1 un1Var2 = ((rb3) bz1Var2.f).E0;
                                        Handler handler3 = (Handler) un1Var2.g;
                                        if (handler3 != null) {
                                            handler3.post(new ra3(un1Var2, ya3Var2, 1));
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (qb3.f0) {
                        try {
                            int i5 = qb3.h0 - 1;
                            qb3.h0 = i5;
                            if (i5 == 0) {
                                qb3.g0.shutdown();
                                qb3.g0 = null;
                            }
                            throw th4;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            default:
                ce3 ce3Var = (ce3) this.g;
                cs1 cs1Var = (cs1) this.h;
                ArrayDeque arrayDeque = (ArrayDeque) this.i;
                ArrayDeque arrayDeque2 = (ArrayDeque) this.j;
                ce3Var.e(cs1Var, arrayDeque, "to");
                ce3Var.e(cs1Var, arrayDeque2, "of");
                return;
        }
    }

    public /* synthetic */ e9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }
}
