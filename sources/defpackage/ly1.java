package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.WebView;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ly1 implements Runnable {
    public final /* synthetic */ int f;
    public Object g;

    public ly1(z92 z92Var) {
        this.f = 16;
        Objects.requireNonNull(z92Var);
        this.g = z92Var;
    }

    private final void a() {
        h73 h73Var = (h73) this.g;
        if (h73Var.b) {
            if (!(h73Var.k() && h73Var.l()) && ((Boolean) ky0.b.u()).booleanValue()) {
                synchronized (h73Var.a) {
                    try {
                        if (Looper.getMainLooper() == null) {
                            return;
                        }
                        if (h73Var.e == null) {
                            h73Var.e = new au0();
                        }
                        au0 au0Var = h73Var.e;
                        synchronized (au0Var.h) {
                            try {
                                if (au0Var.f) {
                                    jn.F("Content hash thread already started, quitting...");
                                } else {
                                    au0Var.f = true;
                                    au0Var.start();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        jn.R("start fetching content...");
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        hp hpVar;
        byte b = 0;
        Object[] objArr = 0;
        switch (this.f) {
            case 0:
                hy1 hy1Var = (hy1) this.g;
                synchronized (hy1Var) {
                    hy1Var.a.getClass();
                    hy1Var.h = SystemClock.elapsedRealtime() - hy1Var.i;
                }
                return;
            case 1:
                gz1 gz1Var = (gz1) this.g;
                synchronized (gz1Var) {
                    gz1Var.B3("Signal collection timeout.", 3);
                }
                return;
            case 2:
                boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.jb)).booleanValue();
                Throwable th = (Throwable) this.g;
                if (zBooleanValue) {
                    vc3.C.h.f("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    vc3.C.h.e("TopicsSignal.fetchTopicsSignal", th);
                    return;
                }
            case 3:
                ((nf0) this.g).C3();
                return;
            case 4:
                ((p32) this.g).d.Z(a23.E(6, null, null));
                return;
            case 5:
                ((v32) this.g).d.Z(a23.E(6, null, null));
                return;
            case 6:
                ((nz1) this.g).e();
                return;
            case 7:
                ((o42) this.g).d.Z(a23.E(6, null, null));
                return;
            case 8:
                ((p42) this.g).e();
                return;
            case 9:
                ((s42) this.g).d.Z(a23.E(6, null, null));
                return;
            case 10:
                b11 b11Var = ((n52) this.g).f.f;
                if (b11Var != null) {
                    try {
                        b11Var.H(1);
                        return;
                    } catch (RemoteException e) {
                        jn.V("Could not notify onAdFailedToLoad event.", e);
                        return;
                    }
                }
                return;
            case 11:
                b11 b11Var2 = ((q62) this.g).f;
                if (b11Var2 != null) {
                    try {
                        b11Var2.H(1);
                        return;
                    } catch (RemoteException e2) {
                        jn.V("Could not notify onAdFailedToLoad event.", e2);
                        return;
                    }
                }
                return;
            case 12:
                y21 y21Var = ((n72) this.g).f;
                if (y21Var != null) {
                    try {
                        y21Var.R1(Collections.EMPTY_LIST);
                        return;
                    } catch (RemoteException e3) {
                        jn.V("Could not notify onComplete event.", e3);
                        return;
                    }
                }
                return;
            case 13:
                s81 s81Var = (s81) this.g;
                if (s81Var != null) {
                    try {
                        s81Var.t(1);
                        return;
                    } catch (RemoteException e4) {
                        jn.Z("#007 Could not call remote method.", e4);
                        return;
                    }
                }
                return;
            case 14:
                f92 f92Var = (f92) this.g;
                AtomicBoolean atomicBoolean = f92Var.e;
                AudioManager audioManager = f92Var.c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f = 0.0f;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f = streamVolume / streamMaxVolume;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) f92Var.d.getAndSet(Float.valueOf(f))).floatValue() != f) {
                    f92Var.a.post(new e92(this, f));
                    return;
                }
                return;
            case 15:
                ((WebView) this.g).destroy();
                return;
            case 16:
                us2 us2Var = ((z92) this.g).e;
                us2Var.getClass();
                ba2 ba2Var = new ba2(us2Var);
                r52 r52Var = (r52) us2Var.h;
                ba2Var.a = r52Var;
                ArrayDeque arrayDeque = (ArrayDeque) r52Var.h;
                arrayDeque.add(ba2Var);
                if (((aa2) r52Var.i) == null) {
                    aa2 aa2Var = (aa2) arrayDeque.poll();
                    r52Var.i = aa2Var;
                    if (aa2Var != null) {
                        aa2Var.executeOnExecutor((ThreadPoolExecutor) r52Var.g, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                k30 k30Var = (k30) this.g;
                kb2 kb2Var = new kb2();
                Log.d("GASS", "Clearcut logging disabled");
                k30Var.a.e(new hb2(kb2Var));
                return;
            case 18:
                ((HttpURLConnection) this.g).disconnect();
                return;
            case 19:
                synchronized (((bq2) this.g).h) {
                    ((ve3) ((bq2) this.g).i.h).f();
                    break;
                }
                return;
            case 20:
                wg2 wg2Var = (wg2) this.g;
                hp hpVarB = wg2Var.d.b(new s22(10, wg2Var));
                wg2Var.c.d(53, hpVarB);
                wg2Var.g = hpVarB;
                return;
            case zw0.zzm /* 21 */:
                xg2 xg2Var = (xg2) this.g;
                tt ttVar = new tt(5, xg2Var);
                try {
                    Object systemService = xg2Var.a.getSystemService("connectivity");
                    if (systemService == null) {
                        throw null;
                    }
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(ttVar);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 22:
                bh2 bh2Var = (bh2) this.g;
                sr0 sr0Var = new sr0(1, bh2Var);
                try {
                    Object systemService2 = bh2Var.a.getSystemService("appops");
                    if (systemService2 == null) {
                        throw null;
                    }
                    ((AppOpsManager) systemService2).startWatchingActive(bh2.g, bh2Var.b, sr0Var);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 23:
                qx1 qx1Var = ((ph2) this.g).a;
                ((wo2) qx1Var.i).d("unlinkToDeath", new Object[0]);
                hh2 hh2Var = (hh2) qx1Var.o;
                hh2Var.getClass();
                ((v90) hh2Var).g.unlinkToDeath((qh2) qx1Var.m, 0);
                qx1Var.o = null;
                qx1Var.f = false;
                return;
            case 24:
                qx1 qx1Var2 = (qx1) this.g;
                if (((hh2) qx1Var2.o) != null) {
                    ((wo2) qx1Var2.i).d("Unbind from service.", new Object[0]);
                    Context context = (Context) qx1Var2.g;
                    ph2 ph2Var = (ph2) qx1Var2.n;
                    ph2Var.getClass();
                    context.unbindService(ph2Var);
                    qx1Var2.f = false;
                    qx1Var2.o = null;
                    qx1Var2.n = null;
                    ArrayList arrayList = (ArrayList) qx1Var2.k;
                    synchronized (arrayList) {
                        arrayList.clear();
                        break;
                    }
                    return;
                }
                return;
            case 25:
                vn2 vn2Var = (vn2) this.g;
                if (vn2Var == null || (hpVar = vn2Var.m) == null) {
                    return;
                }
                this.g = null;
                if (hpVar.isDone()) {
                    vn2Var.m(hpVar);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = vn2Var.n;
                    vn2Var.n = null;
                    String string = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                StringBuilder sb = new StringBuilder(String.valueOf(jAbs).length() + 55);
                                sb.append("Timed out (timeout delayed by ");
                                sb.append(jAbs);
                                sb.append(" ms after scheduled time)");
                                string = sb.toString();
                            }
                        } catch (Throwable th2) {
                            vn2Var.e(new un2(string));
                            throw th2;
                        }
                    }
                    String string2 = hpVar.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 2 + string2.length());
                    sb2.append(string);
                    sb2.append(": ");
                    sb2.append(string2);
                    vn2Var.e(new un2(sb2.toString()));
                    hpVar.cancel(true);
                    return;
                } catch (Throwable th3) {
                    hpVar.cancel(true);
                    throw th3;
                }
            case 26:
                a();
                return;
            case 27:
                Context context2 = (Context) ((p83) this.g).g;
                long j = p83.D(context2).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? j + 33696000000L : -1L;
                if (j2 == -1 || System.currentTimeMillis() <= j2) {
                    return;
                }
                if (!p83.D(context2).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context2.getPackageName());
                Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 28:
                p73 p73Var = (p73) this.g;
                String str = qz1.a;
                int iGenerateAudioSessionId = na1.o(p73Var.k).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                ts2 ts2Var = p73Var.G;
                Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                ts2Var.k = numValueOf;
                hb1 hb1Var = new hb1(ts2Var, numValueOf, 7, objArr == true ? 1 : 0);
                wx1 wx1Var = (wx1) ts2Var.h;
                if (wx1Var.a.getLooper().getThread().isAlive()) {
                    wx1Var.d(hb1Var);
                    return;
                }
                return;
            default:
                z93 z93Var = ((b83) this.g).A;
                z93Var.s(z93Var.t(), 1034, new r53(12, b));
                return;
        }
    }

    public /* synthetic */ ly1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public /* synthetic */ ly1(b83 b83Var, int i) {
        this.f = 29;
        this.g = b83Var;
    }

    public ly1(u92 u92Var) {
        this.f = 15;
        this.g = u92Var.e;
    }

    public /* synthetic */ ly1() {
        this.f = 25;
    }
}
