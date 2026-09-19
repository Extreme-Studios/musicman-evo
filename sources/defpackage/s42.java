package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s42 {
    public final Context a;
    public final Executor b;
    public final if1 c;
    public final p42 d;
    public final i42 e;
    public final f52 f;
    public final e72 g;
    public final h52 h;
    public hp i;

    public s42(Context context, Executor executor, if1 if1Var, i42 i42Var, p42 p42Var, h52 h52Var, f52 f52Var) {
        this.a = context;
        this.b = executor;
        this.c = if1Var;
        this.e = i42Var;
        this.d = p42Var;
        this.h = h52Var;
        this.f = f52Var;
        this.g = if1Var.c();
    }

    public final boolean a(f93 f93Var, String str, rs0 rs0Var, uz1 uz1Var) {
        d72 d72Var;
        Executor executor = this.b;
        if (str == null) {
            jn.M("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new ly1(9, this));
            return false;
        }
        hp hpVar = this.i;
        if (hpVar != null && !hpVar.isDone()) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) my0.c.u()).booleanValue();
        i42 i42Var = this.e;
        if (!zBooleanValue || i42Var.l() == null) {
            d72Var = null;
        } else {
            d72Var = (d72) ((wf1) i42Var.l()).g.c();
            d72Var.i(5);
            d72Var.c(f93Var.u);
            d72Var.d(f93Var.r);
        }
        boolean z = f93Var.k;
        Context context = this.a;
        dq.C(context, z);
        if (((Boolean) tu0.e.c.a(lx0.I9)).booleanValue() && z) {
            ((qt1) this.c.z.c()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(f93Var.E));
        vc3.C.k.getClass();
        Bundle bundleM = jn.m(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        h52 h52Var = this.h;
        h52Var.c = str;
        h52Var.b = new kb3("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
        h52Var.a = f93Var;
        h52Var.t = bundleM;
        i52 i52VarA = h52Var.a();
        a72 a72VarE = a72.e(context, i8.J(i52VarA), 5, f93Var);
        r42 r42Var = new r42();
        r42Var.a = i52VarA;
        hp hpVarF = i42Var.f(new vg2((Object) r42Var, (Object) null, 19, false), new bz1(this));
        this.i = hpVarF;
        hpVarF.a(new in2(hpVarF, 0, new kd0((Object) this, uz1Var, d72Var, a72VarE, (Object) r42Var, 10)), executor);
        return true;
    }

    public final mf1 b(g42 g42Var) {
        mf1 mf1Var = new mf1(this.c.b, 1);
        uj1 uj1Var = new uj1();
        uj1Var.a = this.a;
        uj1Var.b = ((r42) g42Var).a;
        uj1Var.d = this.f;
        mf1Var.f = new uj1(uj1Var);
        mf1Var.e = new im1(new hm1());
        return mf1Var;
    }
}
