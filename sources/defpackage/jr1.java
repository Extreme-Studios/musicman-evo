package defpackage;

import android.content.Context;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class jr1 {
    public final Context a;
    public final zq0 b;
    public final ey0 c;
    public final d60 d;
    public final vg2 e;
    public final cv0 f;
    public final nl1 g;
    public final hw1 h;
    public final k52 i;
    public final es1 j;
    public final me1 k;

    public jr1(Context context, zq0 zq0Var, ey0 ey0Var, d60 d60Var, vg2 vg2Var, cv0 cv0Var, nl1 nl1Var, hw1 hw1Var, k52 k52Var, es1 es1Var, me1 me1Var) {
        this.a = context;
        this.b = zq0Var;
        this.c = ey0Var;
        this.d = d60Var;
        this.e = vg2Var;
        this.f = cv0Var;
        this.g = nl1Var;
        this.h = hw1Var;
        this.i = k52Var;
        this.j = es1Var;
        this.k = me1Var;
    }

    public final md1 a(kb3 kb3Var, x42 x42Var, z42 z42Var) {
        md1 md1VarP = ue0.p(this.a, eg.a(kb3Var), kb3Var.f, false, false, this.b, this.c, this.d, new s70(28, this), this.e, this.f, x42Var, z42Var, this.h, this.i, this.j);
        if (((Boolean) tu0.e.c.a(lx0.De)).booleanValue()) {
            WebView webViewT = md1VarP.t();
            if (this.k.a != null) {
                try {
                    int i = v70.a;
                    if (!y70.g.b()) {
                        throw y70.a();
                    }
                    ((WebViewProviderBoundaryInterface) v70.b(webViewT).g).setProfile("GMA_WEBVIEW_PROFILE");
                    jn.p("WebViewCompat Profile is defined");
                    return md1VarP;
                } catch (IllegalStateException e) {
                    jn.T("WebViewCompat error: ".concat(e.toString()));
                    if (((Boolean) tu0.e.c.a(lx0.Ce)).booleanValue()) {
                        vc3.C.h.d("WebViewCompat.setProfile", e);
                    }
                }
            }
        }
        return md1VarP;
    }
}
