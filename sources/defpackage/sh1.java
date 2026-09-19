package defpackage;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class sh1 extends mi1 {
    public final Context l;
    public final View m;
    public final md1 n;
    public final y42 o;
    public final li1 p;
    public final wo1 q;
    public final an1 r;
    public final o63 s;
    public final Executor t;
    public kb3 u;

    public sh1(nm0 nm0Var, Context context, y42 y42Var, View view, md1 md1Var, li1 li1Var, wo1 wo1Var, an1 an1Var, o63 o63Var, Executor executor) {
        super(nm0Var);
        this.l = context;
        this.m = view;
        this.n = md1Var;
        this.o = y42Var;
        this.p = li1Var;
        this.q = wo1Var;
        this.r = an1Var;
        this.s = o63Var;
        this.t = executor;
    }

    @Override // defpackage.mi1
    public final void a() {
        this.t.execute(new va1(12, this));
        super.a();
    }

    public final y42 c() {
        kb3 kb3Var = this.u;
        if (kb3Var != null) {
            return kb3Var.n ? new y42(-3, 0, true) : new y42(kb3Var.j, kb3Var.g, false);
        }
        x42 x42Var = this.b;
        if (x42Var.c0) {
            for (String str : x42Var.a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.m;
            return new y42(view.getWidth(), view.getHeight(), false);
        }
        return (y42) x42Var.r.get(0);
    }

    public final int d() {
        ix0 ix0Var = lx0.z8;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && this.b.g0) {
            if (!((Boolean) tu0Var.c.a(lx0.A8)).booleanValue()) {
                return 0;
            }
        }
        return ((z42) this.a.b.h).c;
    }
}
