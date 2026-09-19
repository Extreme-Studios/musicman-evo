package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qn1 implements yk1, lb3, lk1 {
    public final Context f;
    public final md1 g;
    public final x42 h;
    public final d60 i;
    public final pw1 j;
    public qw1 k;

    public qn1(Context context, md1 md1Var, x42 x42Var, d60 d60Var, pw1 pw1Var) {
        this.f = context;
        this.g = md1Var;
        this.h = x42Var;
        this.i = d60Var;
        this.j = pw1Var;
    }

    @Override // defpackage.lk1
    public final void B0() {
        md1 md1Var;
        if (a()) {
            this.j.c();
        } else {
            if (this.k == null || (md1Var = this.g) == null) {
                return;
            }
            if (((Boolean) tu0.e.c.a(lx0.M5)).booleanValue()) {
                md1Var.a("onSdkImpression", new m7(0));
            }
        }
    }

    @Override // defpackage.lb3
    public final void H1(int i) {
        this.k = null;
    }

    public final boolean a() {
        c92 c92Var;
        if (!((Boolean) tu0.e.c.a(lx0.J5)).booleanValue()) {
            return false;
        }
        pw1 pw1Var = this.j;
        synchronized (pw1Var) {
            c92Var = pw1Var.f;
        }
        return c92Var != null;
    }

    @Override // defpackage.yk1
    public final void e() {
        md1 md1Var;
        x42 x42Var = this.h;
        if (!x42Var.T || (md1Var = this.g) == null) {
            return;
        }
        vc3 vc3Var = vc3.C;
        el1 el1Var = vc3Var.x;
        el1 el1Var2 = vc3Var.x;
        el1Var.getClass();
        if (el1.c(this.f)) {
            if (a()) {
                this.j.b();
                return;
            }
            d60 d60Var = this.i;
            int i = d60Var.g;
            int i2 = d60Var.h;
            int i3 = 1;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String string = sb.toString();
            j52 j52Var = x42Var.V;
            String str = j52Var.a() + (-1) != 1 ? "javascript" : null;
            int i4 = 2;
            if (j52Var.a() == 1) {
                i3 = 3;
            } else {
                i4 = x42Var.Y == 2 ? 4 : 1;
            }
            int i5 = i4;
            int i6 = i3;
            String str2 = x42Var.l0;
            WebView webViewT = md1Var.t();
            el1Var2.getClass();
            qw1 qw1VarE = el1.e(i5, i6, webViewT, string, str, str2);
            this.k = qw1VarE;
            if (qw1VarE != null) {
                x82 x82Var = qw1VarE.a;
                if (((Boolean) tu0.e.c.a(lx0.I5)).booleanValue()) {
                    WebView webViewT2 = md1Var.t();
                    el1Var2.getClass();
                    el1.g(x82Var, webViewT2);
                    ArrayList arrayListQ = md1Var.Q();
                    int size = arrayListQ.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayListQ.get(i7);
                        i7++;
                        vc3.C.x.getClass();
                        el1.n(new lw1(x82Var, (View) obj, 0));
                    }
                } else {
                    View viewP0 = md1Var.p0();
                    el1Var2.getClass();
                    el1.g(x82Var, viewP0);
                }
                md1Var.j0(this.k);
                vc3.C.x.getClass();
                el1.f(x82Var);
                md1Var.a("onSdkLoaded", new m7(0));
            }
        }
    }

    @Override // defpackage.lb3
    public final void f() {
        md1 md1Var;
        if (((Boolean) tu0.e.c.a(lx0.M5)).booleanValue() || (md1Var = this.g) == null) {
            return;
        }
        if (this.k != null || a()) {
            if (this.k != null) {
                md1Var.a("onSdkImpression", new m7(0));
            } else {
                this.j.c();
            }
        }
    }

    @Override // defpackage.lb3
    public final void C1() {
    }

    @Override // defpackage.lb3
    public final void F1() {
    }

    @Override // defpackage.lb3
    public final void K0() {
    }

    @Override // defpackage.lb3
    public final void N1() {
    }

    @Override // defpackage.lb3
    public final void S2() {
    }

    @Override // defpackage.lb3
    public final void Y() {
    }

    @Override // defpackage.lb3
    public final void g3() {
    }

    @Override // defpackage.lb3
    public final void i3() {
    }

    @Override // defpackage.lb3
    public final void n2() {
    }
}
