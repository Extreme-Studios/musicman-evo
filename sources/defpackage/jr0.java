package defpackage;

import android.net.NetworkCapabilities;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jr0 implements gb2 {
    public final ia2 a;
    public final y91 b;
    public final rr0 c;
    public final ir0 d;
    public final dr0 e;
    public final tr0 f;
    public final ad0 g;
    public final zy1 h;

    public jr0(ia2 ia2Var, y91 y91Var, rr0 rr0Var, ir0 ir0Var, dr0 dr0Var, tr0 tr0Var, ad0 ad0Var, zy1 zy1Var) {
        this.a = ia2Var;
        this.b = y91Var;
        this.c = rr0Var;
        this.d = ir0Var;
        this.e = dr0Var;
        this.f = tr0Var;
        this.g = ad0Var;
        this.h = zy1Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x011d A[Catch: all -> 0x00fd, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x00fd, blocks: (B:12:0x00ec, B:14:0x00f2, B:16:0x00f9, B:20:0x00ff, B:22:0x010a, B:24:0x010e, B:26:0x0119, B:28:0x011d), top: B:41:0x00ec }] */
    public final HashMap a() {
        long j;
        HashMap map = new HashMap();
        ia2 ia2Var = this.a;
        ve3 ve3Var = (ve3) this.b.j;
        sp0 sp0Var = na2.a;
        if (ve3Var.c()) {
            sp0Var = (sp0) ve3Var.b();
        }
        map.put("v", ia2Var.a);
        map.put("gms", Boolean.valueOf(ia2Var.c));
        map.put("gv", Long.valueOf(sp0Var.w0()));
        map.put("int", sp0Var.u0());
        map.put("attts", Long.valueOf(sp0Var.z0().A()));
        map.put("att", sp0Var.z0().C());
        map.put("attkid", sp0Var.z0().B());
        map.put("up", Boolean.valueOf(this.d.a));
        map.put("t", new Throwable());
        ad0 ad0Var = this.g;
        if (ad0Var != null) {
            map.put("tcq", Long.valueOf(ad0Var.a));
            map.put("tpq", Long.valueOf(ad0Var.b));
            map.put("tcv", Long.valueOf(ad0Var.c));
            map.put("tpv", Long.valueOf(ad0Var.d));
            map.put("tchv", Long.valueOf(ad0Var.e));
            map.put("tphv", Long.valueOf(ad0Var.f));
            map.put("tcc", Long.valueOf(ad0Var.g));
            map.put("tpc", Long.valueOf(ad0Var.h));
            dr0 dr0Var = this.e;
            if (dr0Var != null) {
                synchronized (dr0.class) {
                    try {
                        NetworkCapabilities networkCapabilities = (NetworkCapabilities) dr0Var.g;
                        if (networkCapabilities != null) {
                            if (networkCapabilities.hasTransport(4)) {
                                j = 2;
                            } else if (((NetworkCapabilities) dr0Var.g).hasTransport(1)) {
                                j = 1;
                            } else {
                                j = ((NetworkCapabilities) dr0Var.g).hasTransport(0) ? 0L : -1L;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                map.put("nt", Long.valueOf(j));
            }
            tr0 tr0Var = this.f;
            if (tr0Var != null) {
                map.put("vs", Long.valueOf(tr0Var.d ? tr0Var.b - tr0Var.a : -1L));
                long j2 = tr0Var.c;
                tr0Var.c = -1L;
                map.put("vf", Long.valueOf(j2));
            }
        }
        return map;
    }

    @Override // defpackage.gb2
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // defpackage.gb2
    public final HashMap c() {
        return a();
    }

    @Override // defpackage.gb2
    public final HashMap h() {
        HashMap mapA = a();
        zy1 zy1Var = this.h;
        if (zy1Var != null) {
            List list = (List) zy1Var.g;
            zy1Var.g = Collections.EMPTY_LIST;
            mapA.put("vst", list);
        }
        return mapA;
    }

    @Override // defpackage.gb2
    public final HashMap l() {
        HashMap mapA = a();
        rr0 rr0Var = this.c;
        if (rr0Var.q <= -2) {
            WeakReference weakReference = rr0Var.m;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                rr0Var.q = -3L;
            }
        }
        mapA.put("lts", Long.valueOf(rr0Var.q));
        return mapA;
    }
}
