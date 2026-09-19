package defpackage;

import android.app.AlertDialog;
import android.webkit.WebView;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class dw1 extends TimerTask {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Timer g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public dw1(c92 c92Var, oc2 oc2Var, Timer timer) {
        this.h = oc2Var;
        this.g = timer;
        Objects.requireNonNull(c92Var);
        this.i = c92Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.f;
        Timer timer = this.g;
        Object obj = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                ((AlertDialog) obj).dismiss();
                timer.cancel();
                nf0 nf0Var = (nf0) obj2;
                if (nf0Var != null) {
                    nf0Var.y();
                    return;
                }
                return;
            default:
                WebView webView = ((c92) obj2).b;
                int i2 = v70.a;
                if (!y70.d.b()) {
                    throw y70.a();
                }
                ((WebViewProviderBoundaryInterface) v70.b(webView).g).removeWebMessageListener("omidJsSessionService");
                de1 de1Var = ((yd1) ((oc2) obj).g).f;
                e32 e32Var = zb3.l;
                Objects.requireNonNull(de1Var);
                e32Var.post(new xd1(de1Var, 0));
                timer.cancel();
                return;
        }
    }

    public dw1(hw1 hw1Var, AlertDialog alertDialog, Timer timer, nf0 nf0Var) {
        this.h = alertDialog;
        this.g = timer;
        this.i = nf0Var;
    }
}
