package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class v32 {
    public final Context a;
    public final Executor b;
    public final if1 c;
    public final nz1 d;
    public final pz1 e;
    public final FrameLayout f;
    public ux0 g;
    public final nl1 h;
    public final e72 i;
    public final am1 j;
    public final h52 k;
    public p62 l;
    public boolean m;
    public fu1 n;
    public uz1 o;

    public v32(Context context, Executor executor, kb3 kb3Var, if1 if1Var, nz1 nz1Var, pz1 pz1Var, h52 h52Var, am1 am1Var) {
        this.a = context;
        this.b = executor;
        this.c = if1Var;
        this.d = nz1Var;
        this.e = pz1Var;
        this.k = h52Var;
        this.h = new nl1((ScheduledExecutorService) if1Var.d.c(), (ae) if1Var.f.c(), (es1) if1Var.j.c());
        this.i = if1Var.c();
        this.f = new FrameLayout(context);
        this.j = am1Var;
        h52Var.b = kb3Var;
        this.m = true;
        this.n = null;
        this.o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(f93 f93Var, String str, rs0 rs0Var, uz1 uz1Var) {
        pf1 pf1Var;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Executor executor = this.b;
        if (str == null) {
            jn.M("Ad unit ID should not be null for banner ad.");
            executor.execute(new ly1(5, this));
            return false;
        }
        boolean zB = b();
        h52 h52Var = this.k;
        if (!zB) {
            ix0 ix0Var = lx0.I9;
            tu0 tu0Var = tu0.e;
            boolean zBooleanValue = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue();
            if1 if1Var = this.c;
            if (zBooleanValue && f93Var.k) {
                ((qt1) if1Var.z.c()).b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(f93Var.E));
            vc3.C.k.getClass();
            Bundle bundleM = jn.m(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            h52Var.c = str;
            h52Var.a = f93Var;
            h52Var.t = bundleM;
            i52 i52VarA = h52Var.a();
            int iJ = i8.J(i52VarA);
            Context context = this.a;
            a72 a72VarE = a72.e(context, iJ, 3, f93Var);
            boolean zBooleanValue2 = ((Boolean) az0.d.u()).booleanValue();
            nz1 nz1Var = this.d;
            d72 d72Var = null;
            if (!zBooleanValue2 || !h52Var.b.p) {
                boolean zBooleanValue3 = ((Boolean) tu0Var.c.a(lx0.O8)).booleanValue();
                int i2 = 13;
                FrameLayout frameLayout = this.f;
                am1 am1Var = this.j;
                nl1 nl1Var = this.h;
                if (zBooleanValue3) {
                    if1 if1Var2 = if1Var.b;
                    uj1 uj1Var = new uj1();
                    uj1Var.a = context;
                    uj1Var.b = i52VarA;
                    uj1 uj1Var2 = new uj1(uj1Var);
                    hm1 hm1Var = new hm1();
                    hm1Var.d(nz1Var, executor);
                    hm1Var.b(nz1Var, executor);
                    im1 im1Var = new im1(hm1Var);
                    zy1 zy1Var = new zy1(i, this.g);
                    un1 un1Var = new un1((Object) wo1.h, (int) (objArr6 == true ? 1 : 0), (Object) d72Var);
                    un1 un1Var2 = new un1(nl1Var, i2, am1Var);
                    pf1Var = new pf1(if1Var2, new kc2(19, frameLayout), un1Var, new fl1(17), im1Var, uj1Var2, new zy1(29, (boolean) (objArr5 == true ? 1 : 0)), zy1Var, un1Var2, null, null);
                } else {
                    if1 if1Var3 = if1Var.b;
                    uj1 uj1Var3 = new uj1();
                    uj1Var3.a = context;
                    uj1Var3.b = i52VarA;
                    uj1 uj1Var4 = new uj1(uj1Var3);
                    hm1 hm1Var2 = new hm1();
                    HashSet hashSet = (HashSet) hm1Var2.c;
                    hm1Var2.d(nz1Var, executor);
                    hashSet.add(new wm1(nz1Var, executor));
                    hashSet.add(new wm1(this.e, executor));
                    hm1Var2.c(nz1Var, executor);
                    ((HashSet) hm1Var2.f).add(new wm1(nz1Var, executor));
                    ((HashSet) hm1Var2.e).add(new wm1(nz1Var, executor));
                    ((HashSet) hm1Var2.h).add(new wm1(nz1Var, executor));
                    hm1Var2.a(nz1Var, executor);
                    hm1Var2.b(nz1Var, executor);
                    ((HashSet) hm1Var2.m).add(new wm1(nz1Var, executor));
                    im1 im1Var2 = new im1(hm1Var2);
                    zy1 zy1Var2 = new zy1((int) (objArr3 == true ? 1 : 0), (Object) this.g);
                    un1 un1Var3 = new un1((Object) wo1.h, (int) (objArr2 == true ? 1 : 0), (Object) d72Var);
                    un1 un1Var4 = new un1(nl1Var, 13, am1Var);
                    pf1Var = new pf1(if1Var3, new kc2(19, frameLayout), un1Var3, new fl1(17), im1Var2, uj1Var4, new zy1(29, (boolean) (objArr == true ? 1 : 0)), zy1Var2, un1Var4, null, null);
                }
                if (((Boolean) my0.c.u()).booleanValue()) {
                    d72Var = (d72) pf1Var.k.c();
                    d72Var.i(3);
                    d72Var.c(f93Var.u);
                    d72Var.d(f93Var.r);
                }
                this.o = uz1Var;
                vi1 vi1Var = (vi1) pf1Var.r.c();
                p62 p62VarC = vi1Var.c(vi1Var.b());
                this.l = p62VarC;
                p62VarC.a(new in2((Object) p62VarC, (int) (objArr4 == true ? 1 : 0), (Object) new y91(this, d72Var, a72VarE, pf1Var, 14)), executor);
                return true;
            }
            if (nz1Var != null) {
                nz1Var.Z(a23.E(7, null, null));
            }
        } else if (!h52Var.p) {
            this.m = true;
            return false;
        }
        return false;
    }

    public final boolean b() {
        p62 p62Var = this.l;
        return (p62Var == null || p62Var.h.isDone()) ? false : true;
    }

    public final void c() {
        synchronized (this) {
            try {
                p62 p62Var = this.l;
                if (p62Var != null && p62Var.h.isDone()) {
                    try {
                        sh1 sh1Var = (sh1) this.l.h.get();
                        this.l = null;
                        FrameLayout frameLayout = this.f;
                        frameLayout.removeAllViews();
                        sh1Var.getClass();
                        ViewParent parent = sh1Var.m.getParent();
                        if (parent instanceof ViewGroup) {
                            String str = sh1Var.f.f;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(str);
                            sb.append(" already has a parent view. Removing its old parent.");
                            jn.T(sb.toString());
                            ((ViewGroup) parent).removeView(sh1Var.m);
                        }
                        ix0 ix0Var = lx0.O8;
                        tu0 tu0Var = tu0.e;
                        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                            kc2 kc2Var = sh1Var.g.f;
                            nz1 nz1Var = this.d;
                            tl1 tl1Var = (tl1) kc2Var.g;
                            tl1Var.g = nz1Var;
                            tl1Var.h = this.e;
                        }
                        frameLayout.addView(sh1Var.m);
                        uz1 uz1Var = this.o;
                        if (uz1Var != null) {
                            uz1Var.m(sh1Var);
                        }
                        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                            Executor executor = this.b;
                            nz1 nz1Var2 = this.d;
                            Objects.requireNonNull(nz1Var2);
                            executor.execute(new ly1(6, nz1Var2));
                        }
                        int i = ((z42) sh1Var.a.b.h).d;
                        if (i >= 0) {
                            this.m = false;
                            nl1 nl1Var = this.h;
                            nl1Var.R1(i);
                            nl1Var.S1(sh1Var.d());
                        } else {
                            this.m = true;
                            this.h.R1(sh1Var.d());
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        e();
                        jn.w("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.m = true;
                        this.h.r();
                    } catch (ExecutionException e2) {
                        e = e2;
                        e();
                        jn.w("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.m = true;
                        this.h.r();
                    }
                } else if (this.l != null) {
                    jn.p("Show timer went off but there is an ongoing ad request.");
                    this.m = true;
                } else {
                    jn.p("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.m = true;
                    this.h.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        Object parent = this.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zb3 zb3Var = vc3.C.c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return zb3.r(view, powerManager, keyguardManager);
    }

    public final void e() {
        this.l = null;
        fu1 fu1Var = this.n;
        this.n = null;
        if (((Boolean) tu0.e.c.a(lx0.O8)).booleanValue() && fu1Var != null) {
            this.b.execute(new hb1(this, fu1Var, 28, false));
        }
        uz1 uz1Var = this.o;
        if (uz1Var != null) {
            uz1Var.mo10a();
        }
    }
}
