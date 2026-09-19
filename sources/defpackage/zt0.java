package defpackage;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zt0 implements ValueCallback {
    public final /* synthetic */ ib a;
    public final /* synthetic */ wt0 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ zt0(ib ibVar, wt0 wt0Var, WebView webView, boolean z) {
        this.a = ibVar;
        this.b = wt0Var;
        this.c = webView;
        this.d = z;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        au0 au0Var = (au0) this.a.i;
        wt0 wt0Var = this.b;
        WebView webView = this.c;
        String str = (String) obj;
        boolean z = this.d;
        au0Var.getClass();
        synchronized (wt0Var.g) {
            wt0Var.m--;
        }
        try {
            boolean z2 = true;
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (au0Var.s || TextUtils.isEmpty(webView.getTitle())) {
                    wt0Var.a(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    wt0Var.a(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (wt0Var.g) {
                if (wt0Var.m != 0) {
                    z2 = false;
                }
            }
            if (z2) {
                au0Var.i.q(wt0Var);
            }
        } catch (JSONException unused) {
            jn.F("Json string may be malformed.");
        } catch (Throwable th) {
            jn.H("Failed to get webview content.", th);
            vc3.C.h.d("ContentFetchTask.processWebViewContent", th);
        }
    }
}
