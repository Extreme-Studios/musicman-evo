package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p32 {
    public final Context a;
    public final Executor b;
    public final if1 c;
    public final o32 d;
    public final i42 e;
    public final d60 f;
    public final FrameLayout g;
    public final e72 h;
    public final h52 i;
    public hp j;

    public p32(Context context, Executor executor, if1 if1Var, i42 i42Var, o32 o32Var, h52 h52Var, d60 d60Var) {
        this.a = context;
        this.b = executor;
        this.c = if1Var;
        this.e = i42Var;
        this.d = o32Var;
        this.i = h52Var;
        this.f = d60Var;
        this.g = new FrameLayout(context);
        this.h = if1Var.c();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public final synchronized boolean a(f93 f93Var, String str, rs0 rs0Var, uz1 uz1Var) throws Throwable {
        p32 p32Var;
        Throwable th;
        boolean z;
        d72 d72Var;
        nf1 nf1Var;
        try {
            try {
                if (!f93Var.b()) {
                    if (((Boolean) py0.d.u()).booleanValue()) {
                        try {
                            if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            p32Var = this;
                        }
                    } else {
                        z = false;
                    }
                    try {
                        if (this.f.h < ((Integer) tu0.e.c.a(lx0.Xb)).intValue() || !z) {
                            dq.d("loadAd must be called on the main UI thread.");
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        p32Var = this;
                        th = th;
                        throw th;
                    }
                }
                if (str == null) {
                    jn.M("Ad unit ID should not be null for app open ad.");
                    this.b.execute(new ly1(4, this));
                    return false;
                }
                if (this.j != null) {
                    return false;
                }
                if (!((Boolean) my0.c.u()).booleanValue() || (nf1Var = (nf1) this.e.l()) == null) {
                    d72Var = null;
                } else {
                    d72 d72Var2 = (d72) nf1Var.f.c();
                    d72Var2.i(7);
                    d72Var2.c(f93Var.u);
                    d72Var2.d(f93Var.r);
                    d72Var = d72Var2;
                }
                Context context = this.a;
                boolean z2 = f93Var.k;
                dq.C(context, z2);
                if (((Boolean) tu0.e.c.a(lx0.I9)).booleanValue() && z2) {
                    ((qt1) this.c.z.c()).b(true);
                }
                Pair pair = new Pair("api-call", Long.valueOf(f93Var.E));
                vc3.C.k.getClass();
                Bundle bundleM = jn.m(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
                h52 h52Var = this.i;
                h52Var.c = str;
                h52Var.b = kb3.b();
                h52Var.a = f93Var;
                h52Var.t = bundleM;
                i52 i52VarA = h52Var.a();
                a72 a72VarE = a72.e(context, i8.J(i52VarA), 7, f93Var);
                n32 n32Var = new n32();
                n32Var.a = i52VarA;
                hp hpVarF = this.e.f(new vg2((Object) n32Var, (Object) null, 19, false), new kc2(28, this));
                this.j = hpVarF;
                p32Var = this;
                try {
                    try {
                        hpVarF.a(new in2(hpVarF, 0, new kd0((Object) p32Var, uz1Var, d72Var, a72VarE, (Object) n32Var, 8)), p32Var.b);
                        return true;
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
            }
        } catch (Throwable th7) {
            th = th7;
            p32Var = this;
            th = th;
        }
        throw th;
    }

    public final synchronized mf1 b(g42 g42Var) {
        n32 n32Var = (n32) g42Var;
        if (((Boolean) tu0.e.c.a(lx0.P8)).booleanValue()) {
            uj1 uj1Var = new uj1();
            uj1Var.a = this.a;
            uj1Var.b = n32Var.a;
            uj1 uj1Var2 = new uj1(uj1Var);
            hm1 hm1Var = new hm1();
            o32 o32Var = this.d;
            Executor executor = this.b;
            ((HashSet) hm1Var.l).add(new wm1(o32Var, executor));
            hm1Var.c(o32Var, executor);
            im1 im1Var = new im1(hm1Var);
            mf1 mf1Var = new mf1(this.c.b, 0);
            mf1Var.f = uj1Var2;
            mf1Var.e = im1Var;
            return mf1Var;
        }
        o32 o32Var2 = this.d;
        o32 o32Var3 = new o32(o32Var2.f);
        o32Var3.m = o32Var2;
        hm1 hm1Var2 = new hm1();
        Executor executor2 = this.b;
        hm1Var2.a(o32Var3, executor2);
        ((HashSet) hm1Var2.g).add(new wm1(o32Var3, executor2));
        ((HashSet) hm1Var2.n).add(new wm1(o32Var3, executor2));
        ((HashSet) hm1Var2.m).add(new wm1(o32Var3, executor2));
        ((HashSet) hm1Var2.l).add(new wm1(o32Var3, executor2));
        hm1Var2.c(o32Var3, executor2);
        hm1Var2.o = o32Var3;
        uj1 uj1Var3 = new uj1();
        uj1Var3.a = this.a;
        uj1Var3.b = n32Var.a;
        uj1 uj1Var4 = new uj1(uj1Var3);
        im1 im1Var2 = new im1(hm1Var2);
        mf1 mf1Var2 = new mf1(this.c.b, 0);
        mf1Var2.f = uj1Var4;
        mf1Var2.e = im1Var2;
        return mf1Var2;
    }
}
