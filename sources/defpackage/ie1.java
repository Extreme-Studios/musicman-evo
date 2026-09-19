package defpackage;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class ie1 extends he1 {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        final boolean zDidCrash = renderProcessGoneDetail.didCrash();
        final int iRendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        yd1 yd1Var = this.f;
        if (yd1Var.h.compareAndSet(false, true)) {
            if (((Boolean) tu0.e.c.a(lx0.U0)).booleanValue()) {
                return false;
            }
            de1 de1Var = yd1Var.f;
            if (de1Var.getParent() instanceof ViewGroup) {
                ((ViewGroup) de1Var.getParent()).removeView(de1Var);
            }
            de1Var.destroy();
            bv0 bv0Var = new bv0() { // from class: ae1
                @Override // defpackage.bv0
                public final void f(yw0 yw0Var) {
                    int i = de1.h0;
                    nw0 nw0VarA = ow0.A();
                    boolean z = ((ow0) nw0VarA.g).z();
                    boolean z2 = zDidCrash;
                    if (z != z2) {
                        nw0VarA.b();
                        ((ow0) nw0VarA.g).B(z2);
                    }
                    nw0VarA.b();
                    ((ow0) nw0VarA.g).C(iRendererPriorityAtExit);
                    ow0 ow0Var = (ow0) nw0VarA.c();
                    yw0Var.b();
                    ((zw0) yw0Var.g).I(ow0Var);
                }
            };
            cv0 cv0Var = de1Var.f0;
            cv0Var.a(bv0Var);
            cv0Var.b(10003);
        }
        return true;
    }
}
