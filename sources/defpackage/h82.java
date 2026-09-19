package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class h82 {
    public final HashMap a;
    public final u82 b;
    public final bz1 c;
    public final Context d;
    public volatile ConnectivityManager e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final ae g;
    public AtomicInteger h;

    public h82(u82 u82Var, bz1 bz1Var, Context context, ae aeVar) {
        HashMap map = new HashMap();
        this.a = map;
        map.put(h2.APP_OPEN_AD, new HashMap());
        map.put(h2.INTERSTITIAL, new HashMap());
        map.put(h2.REWARDED, new HashMap());
        this.b = u82Var;
        this.c = bz1Var;
        this.d = context;
        this.g = aeVar;
    }

    public final void a(boolean z) {
        synchronized (this) {
            if (((Boolean) tu0.e.c.a(lx0.x)).booleanValue()) {
                b(z);
            }
        }
    }

    public final synchronized void b(boolean z) {
        try {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                for (k82 k82Var : ((Map) it.next()).values()) {
                    if (z) {
                        k82Var.j();
                    } else {
                        k82Var.f.set(false);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Object c(h2 h2Var, Class cls, String str) {
        bz1 bz1Var = this.c;
        this.g.getClass();
        bz1Var.q("poll_ad", "ppacwe_ts", System.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap map = this.a;
        if (!map.containsKey(h2Var)) {
            return null;
        }
        k82 k82Var = (k82) ((Map) map.get(h2Var)).get(str);
        if (k82Var != null && h2Var.equals(h2.a(k82Var.e.g))) {
            ab2 ab2Var = k82Var.e;
            p83 p83Var = new p83(ab2Var.f, 22, h2.a(ab2Var.g));
            p83Var.i = str;
            q82 q82Var = new q82(p83Var);
            bz1Var.q("poll_ad", "ppac_ts", System.currentTimeMillis(), k82Var.e.i, k82Var.m(), null, q82Var, "2");
            try {
                String strK = k82Var.k();
                Object objI = k82Var.i();
                Object objCast = objI == null ? null : cls.cast(objI);
                if (objCast != null) {
                    bz1Var.n(System.currentTimeMillis(), k82Var.e.i, k82Var.m(), strK, q82Var, "2");
                }
                return objCast;
            } catch (ClassCastException e) {
                vc3.C.h.d("PreloadAdManager.pollAd", e);
                jn.w("Unable to cast ad to the requested type:".concat(cls.getName()), e);
                return null;
            }
        }
        return null;
    }

    public final synchronized boolean d(h2 h2Var) {
        int size;
        int iMax;
        try {
            HashMap map = this.a;
            size = map.containsKey(h2Var) ? ((Map) map.get(h2Var)).size() : 0;
            int iOrdinal = h2Var.ordinal();
            if (iOrdinal == 1) {
                iMax = Math.max(((Integer) tu0.e.c.a(lx0.S4)).intValue(), 1);
            } else if (iOrdinal == 2) {
                iMax = Math.max(((Integer) tu0.e.c.a(lx0.T4)).intValue(), 1);
            } else if (iOrdinal != 5) {
                iMax = 0;
            } else {
                iMax = Math.max(((Integer) tu0.e.c.a(lx0.U4)).intValue(), 1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return size < iMax;
    }
}
