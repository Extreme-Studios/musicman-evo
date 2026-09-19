package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ij1 implements pl1, en1 {
    public final Context f;
    public final i52 g;
    public final d60 h;
    public final h73 i;
    public final dt1 j;
    public final e72 k;
    public final qt1 l;

    public ij1(Context context, i52 i52Var, d60 d60Var, h73 h73Var, dt1 dt1Var, e72 e72Var, qt1 qt1Var) {
        this.f = context;
        this.g = i52Var;
        this.h = d60Var;
        this.i = h73Var;
        this.j = dt1Var;
        this.k = e72Var;
        this.l = qt1Var;
    }

    @Override // defpackage.pl1
    public final void E0(r71 r71Var) {
        b();
    }

    @Override // defpackage.en1
    public final void a(j01 j01Var) {
        if (((Boolean) tu0.e.c.a(lx0.t4)).booleanValue()) {
            b();
        }
    }

    public final void b() {
        if (((Boolean) tu0.e.c.a(lx0.s4)).booleanValue()) {
            String str = this.g.g;
            qa1 qa1VarM = this.i.m();
            je0 je0Var = vc3.C.l;
            boolean zF = this.l.f();
            je0Var.getClass();
            je0Var.e(this.f, this.h, false, qa1VarM, qa1VarM != null ? qa1VarM.d : null, str, null, this.k, null, null, zF);
        }
        this.j.a();
    }

    @Override // defpackage.pl1
    public final void A(e52 e52Var) {
    }

    @Override // defpackage.en1
    public final void F(String str) {
    }
}
