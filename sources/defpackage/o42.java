package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o42 {
    public final Context a;
    public final Executor b;
    public final if1 c;
    public final nz1 d;
    public final p42 e;
    public ux0 f;
    public final e72 g;
    public final h52 h;
    public p62 i;

    public o42(Context context, Executor executor, if1 if1Var, nz1 nz1Var, p42 p42Var, h52 h52Var) {
        this.a = context;
        this.b = executor;
        this.c = if1Var;
        this.d = nz1Var;
        this.h = h52Var;
        this.e = p42Var;
        this.g = if1Var.c();
    }

    public final boolean a(f93 f93Var, String str, rs0 rs0Var, uz1 uz1Var) {
        sf1 sf1Var;
        d72 d72Var;
        Executor executor = this.b;
        if (str == null) {
            jn.M("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new ly1(7, this));
            return false;
        }
        if (b()) {
            return false;
        }
        ix0 ix0Var = lx0.I9;
        tu0 tu0Var = tu0.e;
        boolean zBooleanValue = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue();
        if1 if1Var = this.c;
        if (zBooleanValue && f93Var.k) {
            ((qt1) if1Var.z.c()).b(true);
        }
        kb3 kb3Var = ((l42) rs0Var).v;
        Pair pair = new Pair("api-call", Long.valueOf(f93Var.E));
        vc3.C.k.getClass();
        Bundle bundleM = jn.m(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        h52 h52Var = this.h;
        h52Var.c = str;
        h52Var.b = kb3Var;
        h52Var.a = f93Var;
        h52Var.t = bundleM;
        i52 i52VarA = h52Var.a();
        int iJ = i8.J(i52VarA);
        Context context = this.a;
        a72 a72VarE = a72.e(context, iJ, 4, f93Var);
        boolean zBooleanValue2 = ((Boolean) tu0Var.c.a(lx0.Q8)).booleanValue();
        nz1 nz1Var = this.d;
        if (zBooleanValue2) {
            if1 if1Var2 = if1Var.b;
            uj1 uj1Var = new uj1();
            uj1Var.a = context;
            uj1Var.b = i52VarA;
            uj1 uj1Var2 = new uj1(uj1Var);
            hm1 hm1Var = new hm1();
            hm1Var.d(nz1Var, executor);
            hm1Var.b(nz1Var, executor);
            sf1Var = new sf1(if1Var2, new fl1(17), new im1(hm1Var), uj1Var2, new zy1(29, false), new zy1(0, this.f), null, null);
        } else {
            hm1 hm1Var2 = new hm1();
            HashSet hashSet = (HashSet) hm1Var2.h;
            HashSet hashSet2 = (HashSet) hm1Var2.e;
            p42 p42Var = this.e;
            if (p42Var != null) {
                hashSet2.add(new wm1(p42Var, executor));
                hashSet.add(new wm1(p42Var, executor));
                hm1Var2.a(p42Var, executor);
            }
            if1 if1Var3 = if1Var.b;
            uj1 uj1Var3 = new uj1();
            uj1Var3.a = context;
            uj1Var3.b = i52VarA;
            uj1 uj1Var4 = new uj1(uj1Var3);
            hm1Var2.d(nz1Var, executor);
            hashSet2.add(new wm1(nz1Var, executor));
            hashSet.add(new wm1(nz1Var, executor));
            hm1Var2.a(nz1Var, executor);
            ((HashSet) hm1Var2.c).add(new wm1(nz1Var, executor));
            hm1Var2.c(nz1Var, executor);
            hm1Var2.b(nz1Var, executor);
            ((HashSet) hm1Var2.m).add(new wm1(nz1Var, executor));
            ((HashSet) hm1Var2.l).add(new wm1(nz1Var, executor));
            sf1Var = new sf1(if1Var3, new fl1(17), new im1(hm1Var2), uj1Var4, new zy1(29, false), new zy1(0, this.f), null, null);
        }
        if (((Boolean) my0.c.u()).booleanValue()) {
            d72Var = (d72) sf1Var.h.c();
            d72Var.i(4);
            d72Var.c(f93Var.u);
            d72Var.d(f93Var.r);
        } else {
            d72Var = null;
        }
        vi1 vi1Var = (vi1) sf1Var.m.c();
        p62 p62VarC = vi1Var.c(vi1Var.b());
        this.i = p62VarC;
        p62VarC.a(new in2(p62VarC, 0, new kd0((Object) this, uz1Var, d72Var, a72VarE, (Object) sf1Var, 9)), executor);
        return 1;
    }

    public final boolean b() {
        p62 p62Var = this.i;
        return (p62Var == null || p62Var.h.isDone()) ? false : true;
    }
}
