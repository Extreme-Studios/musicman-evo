package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ws1 implements qs1 {
    public final long a;
    public final sz1 b;

    public ws1(long j, Context context, kc2 kc2Var, if1 if1Var, String str) {
        this.a = j;
        if1 if1Var2 = if1Var.b;
        kb3 kb3Var = new kb3();
        str.getClass();
        sz1 sz1Var = (sz1) ((q63) new s70(if1Var2, context, str, kb3Var).g).c();
        this.b = sz1Var;
        sz1Var.X2(new vs1(this, kc2Var));
    }

    @Override // defpackage.qs1
    public final void a(f93 f93Var) {
        this.b.Z(f93Var);
    }

    @Override // defpackage.qs1
    public final void c() {
        this.b.k3(new ju(null));
    }

    @Override // defpackage.qs1
    public final void h() {
        this.b.r();
    }
}
