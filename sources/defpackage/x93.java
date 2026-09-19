package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class x93 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Context c;
    public final hs1 d;
    public final ExecutorService e;

    public x93(Context context, hs1 hs1Var, ya1 ya1Var) {
        this.c = context;
        this.d = hs1Var;
        this.e = ya1Var;
    }

    public final synchronized void a(Object obj, fw fwVar) {
        vc3.C.k.getClass();
        za1.f.execute(new ib(this, obj, new Pair(fwVar, Long.valueOf(System.currentTimeMillis())), 22));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:10:0x0027, B:12:0x002b, B:18:0x0035, B:20:0x0039, B:22:0x004a, B:26:0x0054, B:29:0x0073, B:30:0x0077, B:32:0x007d, B:21:0x0042, B:17:0x0032), top: B:38:0x0001 }] */
    public final synchronized void b(final boolean z, ta3 ta3Var) {
        try {
            HashMap map = this.a;
            Boolean boolValueOf = Boolean.valueOf(z);
            ta3 ta3Var2 = (ta3) map.get(boolValueOf);
            final boolean z2 = true;
            if (ta3Var2 != null) {
                vc3.C.k.getClass();
                if ((ta3Var2.c <= System.currentTimeMillis()) || ta3Var2.a == null || ta3Var.a != null) {
                    map.put(boolValueOf, ta3Var);
                }
            } else {
                map.put(boolValueOf, ta3Var);
            }
            long jLongValue = (ta3Var.a != null ? (Long) wy0.f.u() : (Long) wy0.g.u()).longValue();
            if (ta3Var.a != null) {
                z2 = false;
            }
            za1.d.schedule(new Runnable() { // from class: u73
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    this.f.d(z, z2);
                }
            }, jLongValue, TimeUnit.SECONDS);
            HashMap map2 = this.b;
            List list = (List) map2.get(boolValueOf);
            map2.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e(ta3Var, (Pair) it.next(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        HashMap map = this.b;
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.e.submit(new c61(this, z, 3));
    }

    public final synchronized void d(boolean z, boolean z2) throws Throwable {
        x93 x93Var;
        Throwable th;
        Boolean boolValueOf;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z);
            HashMap map = this.a;
            Boolean boolValueOf2 = Boolean.valueOf(z);
            ta3 ta3Var = (ta3) map.get(boolValueOf2);
            int i = 0;
            if (z2 && ta3Var != null) {
                try {
                    i = ta3Var.d + 1;
                } catch (Throwable th2) {
                    th = th2;
                    x93Var = this;
                    throw th;
                }
            }
            int i2 = i;
            ta3 ta3Var2 = (ta3) map.get(boolValueOf2);
            if (ta3Var2 == null) {
                boolValueOf = null;
            } else {
                try {
                    boolValueOf = Boolean.valueOf(ta3Var2.e.get());
                } catch (Throwable th3) {
                    th = th3;
                    x93Var = this;
                    th = th;
                    throw th;
                }
            }
            x93Var = this;
            try {
                ga3 ga3Var = new ga3(x93Var, z, i2, boolValueOf, this.d);
                try {
                    q2 q2Var = new q2((p2) new p2(1).f1(bundle));
                    if (((Boolean) tu0.e.c.a(lx0.Rb)).booleanValue()) {
                        x93Var.e.submit(new ch0(x93Var, q2Var, ga3Var, 5));
                    } else {
                        s70.h(x93Var.c, q2Var, ga3Var);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                th = th;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            x93Var = this;
        }
    }

    public final void e(ta3 ta3Var, Pair pair, boolean z) {
        ta3Var.e.set(true);
        s70 s70Var = ta3Var.a;
        if (s70Var != null) {
            ((fw) pair.first).b(s70Var);
        } else {
            ((fw) pair.first).a(ta3Var.b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        vc3.C.k.getClass();
        jn.I(this.d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z)), new Pair("sgpc_rs", Boolean.toString(s70Var != null)));
    }
}
