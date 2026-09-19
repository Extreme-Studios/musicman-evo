package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fi1 implements yk1, lk1 {
    public final Context f;
    public final md1 g;
    public final x42 h;
    public final d60 i;
    public qw1 j;
    public boolean k;
    public final pw1 l;

    public fi1(Context context, md1 md1Var, x42 x42Var, d60 d60Var, pw1 pw1Var) {
        this.f = context;
        this.g = md1Var;
        this.h = x42Var;
        this.i = d60Var;
        this.l = pw1Var;
    }

    @Override // defpackage.lk1
    public final synchronized void B0() {
        boolean z;
        md1 md1Var;
        if (((Boolean) tu0.e.c.a(lx0.J5)).booleanValue()) {
            pw1 pw1Var = this.l;
            synchronized (pw1Var) {
                z = pw1Var.f != null;
            }
        }
        if (z) {
            this.l.c();
            return;
        }
        if (!this.k) {
            a();
        }
        if (!this.h.T || this.j == null || (md1Var = this.g) == null) {
            return;
        }
        md1Var.a("onSdkImpression", new m7(0));
    }

    public final synchronized void a() {
        md1 md1Var;
        int i;
        int i2;
        try {
            x42 x42Var = this.h;
            if (x42Var.T && (md1Var = this.g) != null) {
                Context context = this.f;
                vc3 vc3Var = vc3.C;
                vc3Var.x.getClass();
                if (el1.c(context)) {
                    d60 d60Var = this.i;
                    int i3 = d60Var.g;
                    int i4 = d60Var.h;
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 1 + String.valueOf(i4).length());
                    sb.append(i3);
                    sb.append(".");
                    sb.append(i4);
                    String string = sb.toString();
                    j52 j52Var = x42Var.V;
                    String str = j52Var.a() + (-1) != 1 ? "javascript" : null;
                    if (j52Var.a() == 1) {
                        i = 2;
                        i2 = 3;
                    } else if (x42Var.e == 1) {
                        i = 3;
                        i2 = 1;
                    } else {
                        i = 1;
                        i2 = 1;
                    }
                    String str2 = x42Var.l0;
                    el1 el1Var = vc3Var.x;
                    WebView webViewT = md1Var.t();
                    el1Var.getClass();
                    qw1 qw1VarE = el1.e(i, i2, webViewT, string, str, str2);
                    this.j = qw1VarE;
                    if (qw1VarE != null) {
                        x82 x82Var = qw1VarE.a;
                        if (((Boolean) tu0.e.c.a(lx0.I5)).booleanValue()) {
                            el1 el1Var2 = vc3Var.x;
                            WebView webViewT2 = md1Var.t();
                            el1Var2.getClass();
                            el1.g(x82Var, webViewT2);
                            ArrayList arrayListQ = md1Var.Q();
                            int size = arrayListQ.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj = arrayListQ.get(i5);
                                i5++;
                                vc3.C.x.getClass();
                                el1.n(new lw1(x82Var, (View) obj, 0));
                            }
                        } else {
                            View viewP0 = md1Var.p0();
                            vc3Var.x.getClass();
                            el1.g(x82Var, viewP0);
                        }
                        md1Var.j0(this.j);
                        vc3.C.x.getClass();
                        el1.f(x82Var);
                        this.k = true;
                        md1Var.a("onSdkLoaded", new m7(0));
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.yk1
    public final synchronized void e() {
        boolean z;
        if (((Boolean) tu0.e.c.a(lx0.J5)).booleanValue()) {
            pw1 pw1Var = this.l;
            synchronized (pw1Var) {
                z = pw1Var.f != null;
            }
        }
        if (z) {
            this.l.b();
        } else {
            if (this.k) {
                return;
            }
            a();
        }
    }
}
