package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class ld1 extends WebChromeClient {
    public final yd1 a;

    public ld1(yd1 yd1Var) {
        this.a = yd1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof md1)) {
            return webView.getContext();
        }
        md1 md1Var = (md1) webView;
        Activity activityG = md1Var.g();
        return activityG != null ? activityG : md1Var.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        he1 he1Var;
        vs0 vs0Var;
        try {
            yd1 yd1Var = this.a;
            if (yd1Var != null && (he1Var = yd1Var.f.s) != null && (vs0Var = he1Var.B) != null && vs0Var != null && !vs0Var.a()) {
                StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb.append("window.");
                sb.append(str);
                sb.append("('");
                sb.append(str3);
                sb.append("')");
                vs0Var.b(sb.toString());
                return false;
            }
            zb3 zb3Var = vc3.C.c;
            AlertDialog.Builder builderK = zb3.k(context);
            builderK.setTitle(str2);
            if (!z) {
                builderK.setMessage(str3).setPositiveButton(R.string.ok, new jd1(jsResult, 1)).setNegativeButton(R.string.cancel, new jd1(jsResult, 0)).setOnCancelListener(new af(2, jsResult)).create().show();
                return true;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builderK.setView(linearLayout).setPositiveButton(R.string.ok, new tk0(jsPromptResult, 1, editText)).setNegativeButton(R.string.cancel, new th0(4, jsPromptResult)).setOnCancelListener(new af(3, jsPromptResult)).create().show();
            return true;
        } catch (WindowManager.BadTokenException e) {
            jn.V("Fail to display Dialog.", e);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof md1)) {
            jn.T("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        nf0 nf0VarX0 = ((md1) webView).x0();
        if (nf0VarX0 == null) {
            jn.T("Tried to close an AdWebView not associated with an overlay.");
        } else {
            nf0VarX0.y();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(strMessage).length();
        StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(strSourceId).length() + 1 + String.valueOf(iLineNumber).length() + 1);
        ec.x(sb, "JS: ", strMessage, " (", strSourceId);
        String strK = ec.k(sb, ":", iLineNumber, ")");
        if (strK.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = kd1.a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            jn.M(strK);
        } else if (i == 2) {
            jn.T(strK);
        } else if (i == 3 || i == 4 || i != 5) {
            jn.R(strK);
        } else {
            jn.F(strK);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        he1 he1Var = this.a.f.s;
        if (he1Var != null) {
            webView2.setWebViewClient(he1Var);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(131072L, j4) + j, 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            zb3 zb3Var = vc3.C.c;
            yd1 yd1Var = this.a;
            boolean z = zb3.c(yd1Var.getContext(), "android.permission.ACCESS_FINE_LOCATION") || zb3.c(yd1Var.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
            ix0 ix0Var = lx0.Yd;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                callback.invoke(str, false, true);
            } else {
                callback.invoke(str, z, true);
            }
            if (((Boolean) tu0Var.c.a(lx0.Zd)).booleanValue()) {
                jn.F("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        nf0 nf0VarX0 = this.a.f.x0();
        if (nf0VarX0 == null) {
            jn.T("Could not get ad overlay when hiding custom view.");
        } else {
            nf0VarX0.r();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        nf0 nf0VarX0 = this.a.f.x0();
        if (nf0VarX0 == null) {
            jn.T("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = nf0VarX0.g;
        FrameLayout frameLayout = new FrameLayout(activity);
        nf0VarX0.m = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        nf0VarX0.m.addView(view, -1, -1);
        activity.setContentView(nf0VarX0.m);
        nf0VarX0.w = true;
        nf0VarX0.n = customViewCallback;
        nf0VarX0.l = true;
        nf0VarX0.I3(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
