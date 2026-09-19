package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zg1 implements ck1, yk1, lk1, ib0, jk1, vm1, ll1 {
    public final Context f;
    public final Executor g;
    public final Executor h;
    public final ScheduledExecutorService i;
    public final e52 j;
    public final x42 k;
    public final e82 l;
    public final o52 m;
    public final zq0 n;
    public final ey0 o;
    public final WeakReference p;
    public final WeakReference q;
    public final r52 r;
    public final il1 s;
    public final oj1 t;
    public boolean u;
    public final AtomicBoolean v = new AtomicBoolean();

    public zg1(Context context, ya1 ya1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, e52 e52Var, x42 x42Var, e82 e82Var, o52 o52Var, View view, md1 md1Var, zq0 zq0Var, ey0 ey0Var, r52 r52Var, il1 il1Var, oj1 oj1Var) {
        this.f = context;
        this.g = ya1Var;
        this.h = executor;
        this.i = scheduledExecutorService;
        this.j = e52Var;
        this.k = x42Var;
        this.l = e82Var;
        this.m = o52Var;
        this.n = zq0Var;
        this.p = new WeakReference(view);
        this.q = new WeakReference(md1Var);
        this.o = ey0Var;
        this.r = r52Var;
        this.s = il1Var;
        this.t = oj1Var;
    }

    @Override // defpackage.ib0
    public final void B() {
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.B0)).booleanValue();
        e52 e52Var = this.j;
        if ((zBooleanValue && ((z42) e52Var.b.h).h) || !((Boolean) qy0.d.u()).booleanValue()) {
            x42 x42Var = this.k;
            this.m.b(true == vc3.C.h.i(this.f) ? 2 : 1, this.l.a(e52Var, x42Var, x42Var.c));
        } else {
            ey0 ey0Var = this.o;
            ey0Var.getClass();
            wl2 wl2VarI = na1.I(fn2.r((fn2) na1.K(fn2.r(kn2.g), ((Long) qy0.c.u()).longValue(), TimeUnit.MILLISECONDS, ey0Var.c)), Throwable.class, lh0.h, za1.g);
            wl2VarI.a(new in2(wl2VarI, 0, new zy1(20, this)), this.g);
        }
    }

    @Override // defpackage.lk1
    public final void B0() {
        if (this.v.compareAndSet(false, true)) {
            ix0 ix0Var = lx0.b4;
            tu0 tu0Var = tu0.e;
            kx0 kx0Var = tu0Var.c;
            kx0 kx0Var2 = tu0Var.c;
            int iIntValue = ((Integer) kx0Var.a(ix0Var)).intValue();
            if (iIntValue > 0) {
                h(iIntValue, ((Integer) kx0Var2.a(lx0.c4)).intValue());
            } else if (!((Boolean) kx0Var2.a(lx0.a4)).booleanValue()) {
                l();
            } else {
                this.h.execute(new xg1(this, 0));
            }
        }
    }

    @Override // defpackage.ck1
    public final void I(w71 w71Var, String str, String str2) {
        f52 f52Var;
        x42 x42Var = this.k;
        List list = x42Var.h;
        e82 e82Var = this.l;
        e82Var.getClass();
        ArrayList arrayList = new ArrayList();
        e82Var.h.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = w71Var.f;
            String string = Integer.toString(w71Var.g);
            boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.T3)).booleanValue();
            sx ci2Var = uh2.f;
            if (zBooleanValue) {
                g52 g52Var = e82Var.g;
                if (g52Var != null && (f52Var = g52Var.a) != null) {
                    ci2Var = new ci2(f52Var);
                }
            } else {
                f52 f52Var2 = e82Var.f;
                if (f52Var2 != null) {
                    ci2Var = new ci2(f52Var2);
                }
            }
            String str4 = (String) ci2Var.c(lh0.u).b();
            String str5 = (String) ci2Var.c(lh0.t).b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(v51.r(e82.c(e82.c(e82.c(e82.c(e82.c(e82.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", string), "@gw_sdkver@", e82Var.b), e82Var.e, x42Var.W, x42Var.w0));
            }
        } catch (RemoteException e) {
            jn.P("Unable to determine award type and amount.", e);
        }
        this.m.a(arrayList, null);
    }

    @Override // defpackage.ck1
    public final void b() {
        x42 x42Var = this.k;
        this.m.a(this.l.a(this.j, x42Var, x42Var.g), null);
    }

    @Override // defpackage.ck1
    public final void d() {
        x42 x42Var = this.k;
        this.m.a(this.l.a(this.j, x42Var, x42Var.i), null);
    }

    @Override // defpackage.yk1
    public final synchronized void e() {
        r52 r52Var;
        long j;
        try {
            if (this.u) {
                ArrayList arrayList = new ArrayList(p());
                x42 x42Var = this.k;
                arrayList.addAll(x42Var.f);
                this.m.a(this.l.b(this.j, x42Var, true, null, null, arrayList, null), null);
            } else {
                o52 o52Var = this.m;
                e82 e82Var = this.l;
                e52 e52Var = this.j;
                x42 x42Var2 = this.k;
                o52Var.a(e82Var.a(e52Var, x42Var2, x42Var2.m), null);
                if (((Boolean) tu0.e.c.a(lx0.X3)).booleanValue() && (r52Var = this.r) != null) {
                    List list = ((x42) r52Var.h).m;
                    String strD = ((hy1) r52Var.i).d();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(e82.c((String) it.next(), "@gw_adnetstatus@", strD));
                    }
                    hy1 hy1Var = (hy1) r52Var.i;
                    synchronized (hy1Var) {
                        j = hy1Var.h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList3.add(e82.c((String) obj, "@gw_ttr@", Long.toString(j, 10)));
                    }
                    o52Var.a(e82Var.a((e52) r52Var.g, (x42) r52Var.h, arrayList3), null);
                }
                o52Var.a(e82Var.a(e52Var, x42Var2, x42Var2.f), null);
            }
            this.u = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.p.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            l();
        } else {
            this.i.schedule(new yg1(this, i, i2, 0), i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.vm1
    public final void j() {
        x42 x42Var = this.k;
        this.m.a(this.l.a(this.j, x42Var, x42Var.u0), null);
    }

    @Override // defpackage.ll1
    public final void k() {
        x42 x42Var = this.k;
        if (x42Var.e == 4) {
            this.m.a(this.l.a(this.j, x42Var, x42Var.A0), null);
        }
    }

    public final void l() {
        int i;
        x42 x42Var = this.k;
        List list = x42Var.d;
        if (list == null || list.isEmpty()) {
            return;
        }
        ix0 ix0Var = lx0.S3;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        String strI = ((Boolean) kx0Var.a(ix0Var)).booleanValue() ? this.n.b.i(this.f, (View) this.p.get(), null) : null;
        if ((((Boolean) kx0Var2.a(lx0.B0)).booleanValue() && ((z42) this.j.b.h).h) || !((Boolean) qy0.h.u()).booleanValue()) {
            this.m.a(this.l.b(this.j, x42Var, false, strI, null, p(), this.t), this.s);
            return;
        }
        if (((Boolean) qy0.g.u()).booleanValue() && ((i = x42Var.b) == 1 || i == 2 || i == 5)) {
        }
        fn2 fn2Var = (fn2) na1.K(fn2.r(kn2.g), ((Long) kx0Var2.a(lx0.e1)).longValue(), TimeUnit.MILLISECONDS, this.i);
        fn2Var.a(new in2(fn2Var, 0, new us2(this, 14, strI)), this.g);
    }

    public final List p() {
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.hc)).booleanValue();
        x42 x42Var = this.k;
        if (zBooleanValue) {
            zb3 zb3Var = vc3.C.c;
            Context context = this.f;
            if (zb3.d(context)) {
                Object systemService = context.getSystemService("display");
                Integer numValueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (numValueOf != null) {
                    int iMin = Math.min(numValueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = x42Var.d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return x42Var.d;
    }

    @Override // defpackage.jk1
    public final void s(fu1 fu1Var) {
        if (((Boolean) tu0.e.c.a(lx0.D1)).booleanValue()) {
            int i = fu1Var.f;
            ArrayList arrayList = new ArrayList();
            x42 x42Var = this.k;
            for (String str : x42Var.o) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(e82.c(str, "@gw_mpe@", sb.toString()));
            }
            this.m.a(this.l.a(this.j, x42Var, arrayList), null);
        }
    }

    @Override // defpackage.ck1
    public final void U() {
    }

    @Override // defpackage.ck1
    public final void a() {
    }

    @Override // defpackage.ck1
    public final void r() {
    }
}
