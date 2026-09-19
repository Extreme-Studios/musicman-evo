package defpackage;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aq2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ i73 g;

    public /* synthetic */ aq2(i73 i73Var, int i) {
        this.f = i;
        this.g = i73Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebViewClient webViewClientD;
        int i = this.f;
        i73 i73Var = this.g;
        switch (i) {
            case 0:
                WebView webView = i73Var.a;
                try {
                    zb3 zb3Var = vc3.C.c;
                    if (Build.VERSION.SDK_INT < 26) {
                        if (na1.k("GET_WEB_VIEW_CLIENT")) {
                            try {
                                webViewClientD = v70.d(webView);
                            } catch (RuntimeException e) {
                                vc3.C.h.d("AdUtil.getWebViewClient", e);
                            }
                            break;
                        }
                        throw new IllegalStateException("getWebViewClient not supported");
                    }
                    webViewClientD = webView.getWebViewClient();
                    if (webViewClientD == i73Var) {
                        return;
                    }
                    if (webViewClientD != null) {
                        i73Var.d = webViewClientD;
                    }
                    webView.setWebViewClient(i73Var);
                    i73Var.x();
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            default:
                i73Var.c.execute(new aq2(i73Var, 0));
                return;
        }
    }
}
