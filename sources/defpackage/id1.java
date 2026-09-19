package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class id1 extends lb1 {
    public final vb1 h;
    public zy1 i;
    public pb1 j;
    public boolean k;
    public int l;

    public id1(Context context, vb1 vb1Var) {
        super(context);
        this.l = 1;
        this.k = false;
        this.h = vb1Var;
        vb1Var.a(this);
    }

    public final boolean D() {
        int i = this.l;
        return (i == 1 || i == 2 || this.i == null) ? false : true;
    }

    public final void E(int i) {
        wb1 wb1Var = this.g;
        vb1 vb1Var = this.h;
        if (i == 4) {
            vb1Var.d();
            wb1Var.d = true;
            wb1Var.a();
        } else if (this.l == 4) {
            vb1Var.m = false;
            wb1Var.d = false;
            wb1Var.a();
        }
        this.l = i;
    }

    @Override // defpackage.lb1
    public final String d() {
        return "ImmersivePlayer";
    }

    @Override // defpackage.lb1
    public final void e(pb1 pb1Var) {
        this.j = pb1Var;
    }

    @Override // defpackage.lb1
    public final void f(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.i = new zy1(19);
            E(3);
            zb3.l.post(new hd1(this, 2));
        }
    }

    @Override // defpackage.lb1
    public final void g() {
        jn.p("AdImmersivePlayerView stop");
        zy1 zy1Var = this.i;
        if (zy1Var != null) {
            ((AtomicBoolean) zy1Var.g).set(false);
            this.i = null;
            E(1);
        }
        this.h.b();
    }

    @Override // defpackage.lb1
    public final void h() {
        jn.p("AdImmersivePlayerView play");
        if (D()) {
            ((AtomicBoolean) this.i.g).set(true);
            E(4);
            this.f.c = true;
            zb3.l.post(new hd1(this, 0));
        }
    }

    @Override // defpackage.lb1
    public final void i() {
        jn.p("AdImmersivePlayerView pause");
        if (D() && ((AtomicBoolean) this.i.g).get()) {
            ((AtomicBoolean) this.i.g).set(false);
            E(5);
            zb3.l.post(new hd1(this, 1));
        }
    }

    @Override // defpackage.lb1
    public final int j() {
        return D() ? 0 : -1;
    }

    @Override // defpackage.lb1
    public final int k() {
        return 0;
    }

    @Override // defpackage.lb1
    public final void l(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        jn.p(sb.toString());
    }

    @Override // defpackage.lb1
    public final int n() {
        return 0;
    }

    @Override // defpackage.lb1
    public final int o() {
        return 0;
    }

    @Override // defpackage.lb1
    public final long p() {
        return 0L;
    }

    @Override // defpackage.lb1
    public final long q() {
        return 0L;
    }

    @Override // defpackage.lb1
    public final long r() {
        return 0L;
    }

    @Override // defpackage.lb1
    public final int s() {
        return D() ? 0 : -1;
    }

    @Override // android.view.View
    public final String toString() {
        String name = id1.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return ec.n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // defpackage.lb1
    public final void y() {
        if (this.i != null) {
            this.g.getClass();
        }
    }

    @Override // defpackage.lb1
    public final void m(float f, float f2) {
    }
}
