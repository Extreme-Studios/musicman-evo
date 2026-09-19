package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class w62 implements qm1, jk1, sm1 {
    public final d72 f;
    public final a72 g;

    public w62(Context context, d72 d72Var) {
        this.f = d72Var;
        this.g = a72.j(context, 13);
    }

    @Override // defpackage.sm1
    public final void a() {
        if (((Boolean) my0.d.u()).booleanValue()) {
            a72 a72Var = this.g;
            a72Var.b(true);
            this.f.a(a72Var);
        }
    }

    @Override // defpackage.qm1
    public final void f() {
        if (((Boolean) my0.d.u()).booleanValue()) {
            this.g.a();
        }
    }

    @Override // defpackage.jk1
    public final void s(fu1 fu1Var) {
        if (((Boolean) my0.d.u()).booleanValue()) {
            String string = fu1Var.a().toString();
            a72 a72Var = this.g;
            a72Var.k(string);
            a72Var.b(false);
            this.f.a(a72Var);
        }
    }

    @Override // defpackage.qm1
    public final void e() {
    }

    @Override // defpackage.sm1
    public final void y() {
    }
}
