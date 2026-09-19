package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class k82 {
    public final ClientApi a;
    public final Context b;
    public final int c;
    public final r52 d;
    public ab2 e;
    public final AtomicBoolean f;
    public final bb1 g;
    public final kc1 h;
    public final PriorityQueue i;
    public final l82 j;
    public final String k;
    public final AtomicBoolean l;
    public final ScheduledExecutorService m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public bz1 p;
    public final ae q;
    public final q82 r;
    public final /* synthetic */ int s;

    public k82(String str, ClientApi clientApi, Context context, int i, r52 r52Var, ab2 ab2Var, ScheduledExecutorService scheduledExecutorService, l82 l82Var, ae aeVar) {
        this.k = str;
        this.a = clientApi;
        this.b = context;
        this.c = i;
        this.d = r52Var;
        this.e = ab2Var;
        this.i = new PriorityQueue(Math.max(1, ab2Var.i), new s82(0, this));
        this.f = new AtomicBoolean(true);
        this.l = new AtomicBoolean(false);
        this.m = scheduledExecutorService;
        this.j = l82Var;
        this.n = new AtomicBoolean(true);
        this.o = new AtomicBoolean(false);
        this.q = aeVar;
        p83 p83Var = new p83(ab2Var.f, 22, h2.a(this.e.g));
        p83Var.i = str;
        this.r = new q82(p83Var);
    }

    public final synchronized void a(Object obj) {
        try {
            r82 r82Var = new r82(obj, this.q);
            this.i.add(r82Var);
            lu1 lu1VarG = g(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = 0;
            if (this.n.get()) {
                zb3.l.post(new u52(this, lu1VarG, 3, false));
            }
            ScheduledExecutorService scheduledExecutorService = this.m;
            scheduledExecutorService.execute(new oc0(this, jCurrentTimeMillis, lu1VarG));
            scheduledExecutorService.schedule(new t82(this, i), (r82Var.d + Math.min(Math.max(((Long) tu0.e.c.a(lx0.C)).longValue(), -900000L), 10000L)) - (System.currentTimeMillis() - r82Var.b), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z) {
        l82 l82Var = this.j;
        if (l82Var.a()) {
            return;
        }
        if (z) {
            double d = l82Var.e;
            l82Var.e = Math.min((long) (d + d), l82Var.b);
            l82Var.c++;
        }
        ScheduledExecutorService scheduledExecutorService = this.m;
        t82 t82Var = new t82(this, 0);
        double d2 = l82Var.e;
        double d3 = 0.2d * d2;
        long j = (long) (d2 + d3);
        long j2 = (long) (d2 - d3);
        scheduledExecutorService.schedule(t82Var, j2 + ((long) (l82Var.f.nextDouble() * ((j - j2) + 1))), TimeUnit.MILLISECONDS);
    }

    public final synchronized void c() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            r82 r82Var = (r82) it.next();
            long j = r82Var.b;
            long j2 = r82Var.d;
            r82Var.c.getClass();
            if (System.currentTimeMillis() >= j + j2) {
                it.remove();
            }
        }
    }

    public final synchronized void d() {
        try {
            if (this.o.get() && this.i.isEmpty()) {
                this.o.set(false);
                if (this.n.get()) {
                    zb3.l.post(new t82(this, 1));
                }
                this.m.execute(new t82(this, 2));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String e() {
        return true != "none".equals(this.k) ? "2" : "1";
    }

    public final em2 f(Context context) {
        int i = this.s;
        r52 r52Var = this.d;
        switch (i) {
            case 0:
                l41 l41Var = (l41) ((AtomicReference) r52Var.i).get();
                if (l41Var == null) {
                    return na1.C(new g82());
                }
                n71 n71VarZ2 = this.a.Z2(new ju(context), kb3.b(), this.e.f, l41Var, this.c);
                if (n71VarZ2 == null) {
                    return na1.C(new g82());
                }
                tn2 tn2Var = new tn2();
                try {
                    p(this.e.h);
                    u32 u32Var = (u32) n71VarZ2;
                    u32Var.L2(new j82(this, tn2Var, this.e));
                    u32Var.Z(this.e.h);
                    return tn2Var;
                } catch (RemoteException e) {
                    jn.V("Failed to load app open ad.", e);
                    return na1.C(new g82());
                }
            case 1:
                l41 l41Var2 = (l41) ((AtomicReference) r52Var.i).get();
                if (l41Var2 == null) {
                    return na1.C(new g82());
                }
                n71 n71VarF2 = this.a.F2(new ju(context), new kb3(), this.e.f, l41Var2, this.c);
                if (n71VarF2 == null) {
                    return na1.C(new g82());
                }
                tn2 tn2Var2 = new tn2();
                try {
                    p(this.e.h);
                    ((sz1) n71VarF2).c1(this.e.h, new m82(this, tn2Var2, (sz1) n71VarF2));
                    return tn2Var2;
                } catch (RemoteException e2) {
                    jn.V("Failed to load interstitial ad.", e2);
                    return na1.C(new g82());
                }
            default:
                l41 l41Var3 = (l41) ((AtomicReference) r52Var.i).get();
                if (l41Var3 == null) {
                    return na1.C(new g82());
                }
                l81 l81VarT2 = this.a.t2(new ju(context), this.e.f, l41Var3, this.c);
                if (l81VarT2 == null) {
                    return na1.C(new g82());
                }
                tn2 tn2Var3 = new tn2();
                try {
                    p(this.e.h);
                    ((u42) l81VarT2).r2(this.e.h, new v82(this, tn2Var3, (u42) l81VarT2));
                    return tn2Var3;
                } catch (RemoteException unused) {
                    jn.T("Failed to load rewarded ad.");
                    return na1.C(new g82());
                }
        }
    }

    public final /* bridge */ lu1 g(Object obj) {
        switch (this.s) {
            case 0:
                try {
                    return ((ku0) obj).e();
                } catch (RemoteException e) {
                    jn.H("Failed to get response info for the app open ad.", e);
                    return null;
                }
            case 1:
                try {
                    return ((n71) obj).M();
                } catch (RemoteException e2) {
                    jn.H("Failed to get response info for  the interstitial ad.", e2);
                    return null;
                }
            default:
                try {
                    return ((l81) obj).m();
                } catch (RemoteException e3) {
                    jn.H("Failed to get response info for the rewarded ad.", e3);
                    return null;
                }
        }
    }

    public final synchronized boolean h() {
        try {
            if (((Boolean) tu0.e.c.a(lx0.H)).booleanValue()) {
                l82 l82Var = this.j;
                l82Var.e = l82Var.a;
                l82Var.c = 0L;
            }
            c();
        } catch (Throwable th) {
            throw th;
        }
        return !this.i.isEmpty();
    }

    public final synchronized Object i() {
        try {
            l82 l82Var = this.j;
            l82Var.e = l82Var.a;
            l82Var.c = 0L;
            PriorityQueue priorityQueue = this.i;
            r82 r82Var = (r82) priorityQueue.poll();
            this.o.set(r82Var != null);
            if (r82Var == null) {
                r82Var = null;
            } else if (!priorityQueue.isEmpty()) {
                r82 r82Var2 = (r82) priorityQueue.peek();
                h2 h2VarA = h2.a(this.e.g);
                lu1 lu1VarG = g(r82Var.a);
                String str = !(lu1VarG instanceof zj1) ? null : ((zj1) lu1VarG).i;
                if (r82Var2 != null && h2VarA != null && str != null && r82Var2.b < r82Var.b) {
                    bz1 bz1Var = this.p;
                    this.q.getClass();
                    bz1Var.q("poll_ad", "psvroc_ts", System.currentTimeMillis(), this.e.i, m(), str, this.r, e());
                }
            }
            n();
            if (r82Var == null) {
                return null;
            }
            return r82Var.a;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        this.f.set(true);
        this.n.set(true);
        this.m.submit(new t82(this, 0));
    }

    public final synchronized String k() {
        String str;
        Object obj;
        synchronized (this) {
            r82 r82Var = (r82) this.i.peek();
            str = null;
            obj = r82Var == null ? null : r82Var.a;
        }
        return str;
        lu1 lu1VarG = obj == null ? null : g(obj);
        if (lu1VarG instanceof zj1) {
            str = ((zj1) lu1VarG).i;
        }
        return str;
    }

    public final synchronized void l(int i) {
        dq.b(i >= 5);
        l82 l82Var = this.j;
        synchronized (l82Var) {
            dq.b(i > 0);
            l82Var.d = i;
        }
    }

    public final synchronized int m() {
        return this.i.size();
    }

    public final synchronized void n() {
        em2 em2VarF;
        try {
            c();
            d();
            if (!this.l.get() && this.f.get() && this.i.size() < this.e.i) {
                this.l.set(true);
                Activity activityI = vc3.C.g.i();
                if (activityI == null) {
                    jn.T("Empty activity context at preloading: ".concat(String.valueOf(this.e.f)));
                    em2VarF = f(this.b);
                } else {
                    em2VarF = f(activityI);
                }
                s62 s62Var = new s62(this);
                em2VarF.a(new in2(em2VarF, 0, s62Var), this.m);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(int i) {
        dq.b(i > 0);
        h2 h2VarA = h2.a(this.e.g);
        int i2 = this.e.i;
        synchronized (this) {
            try {
                ab2 ab2Var = this.e;
                this.e = new ab2(ab2Var.f, ab2Var.g, ab2Var.h, i > 0 ? i : ab2Var.i);
                PriorityQueue priorityQueue = this.i;
                if (priorityQueue.size() > i) {
                    if (((Boolean) tu0.e.c.a(lx0.w)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < i; i3++) {
                            r82 r82Var = (r82) priorityQueue.poll();
                            if (r82Var != null) {
                                arrayList.add(r82Var);
                            }
                        }
                        priorityQueue.clear();
                        priorityQueue.addAll(arrayList);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bz1 bz1Var = this.p;
        if (bz1Var == null || h2VarA == null) {
            return;
        }
        this.q.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.e.f;
        us2 us2VarA = ((es1) bz1Var.f).a();
        us2VarA.s("action", "cache_resize");
        us2VarA.s("cs_ts", Long.toString(jCurrentTimeMillis));
        us2VarA.s("orig_ma", Integer.toString(i2));
        us2VarA.s("max_ads", Integer.toString(i));
        us2VarA.s("ad_format", h2VarA.name().toLowerCase(Locale.ENGLISH));
        us2VarA.s("ad_unit_id", str);
        us2VarA.s("pid", null);
        us2VarA.s("pv", "1");
        us2VarA.t();
    }

    public final void p(f93 f93Var) {
        if (((Boolean) tu0.e.c.a(lx0.B)).booleanValue()) {
            Bundle bundle = f93Var.G;
            bundle.putInt("plcs", m());
            bundle.putInt("plbs", this.e.i);
            bundle.putString("plid", this.k);
        }
    }

    public final void q(fu1 fu1Var) {
        synchronized (this) {
            try {
                if (this.n.get()) {
                    zb3.l.post(new u52(this, fu1Var, 4, false));
                }
                this.l.set(false);
                int i = fu1Var.f;
                if (i != 1 && i != 8 && i != 10 && i != 11) {
                    b(true);
                    return;
                }
                ab2 ab2Var = this.e;
                int i2 = ab2Var.g;
                String str = ab2Var.f;
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26 + String.valueOf(str).length() + 61);
                sb.append("Preloading ");
                sb.append(i2);
                sb.append(", for adUnitId:");
                sb.append(str);
                sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
                jn.R(sb.toString());
                this.f.set(false);
                ab2 ab2Var2 = this.e;
                p83 p83Var = new p83(ab2Var2.f, 22, h2.a(ab2Var2.g));
                p83Var.i = this.k;
                q82 q82Var = new q82(p83Var);
                bz1 bz1Var = this.p;
                this.q.getClass();
                bz1Var.o(System.currentTimeMillis(), q82Var, fu1Var, this.e.i, m(), e());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k82(String str, ClientApi clientApi, Context context, int i, r52 r52Var, ab2 ab2Var, kc1 kc1Var, ScheduledExecutorService scheduledExecutorService, l82 l82Var, ae aeVar, int i2) {
        this(str, clientApi, context, i, r52Var, ab2Var, scheduledExecutorService, l82Var, aeVar);
        this.s = i2;
        this.h = kc1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k82(ClientApi clientApi, Context context, int i, r52 r52Var, ab2 ab2Var, bb1 bb1Var, ScheduledExecutorService scheduledExecutorService, l82 l82Var, ae aeVar, int i2) {
        this("none", clientApi, context, i, r52Var, ab2Var, scheduledExecutorService, l82Var, aeVar);
        this.s = i2;
        this.g = bb1Var;
    }
}
