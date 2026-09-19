package defpackage;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes.dex */
public final class ge1 {
    public final zx a;
    public final de1 b;

    public ge1(de1 de1Var, zx zxVar) {
        this.a = zxVar;
        this.b = de1Var;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            jn.p("Click string is empty, not proceeding.");
            return "";
        }
        de1 de1Var = this.b;
        zq0 zq0Var = de1Var.g;
        if (zq0Var == null) {
            jn.p("Signal utils is empty, ignoring.");
            return "";
        }
        vq0 vq0Var = zq0Var.b;
        if (vq0Var == null) {
            jn.p("Signals object is empty, ignoring.");
            return "";
        }
        if (de1Var.getContext() != null) {
            return vq0Var.h(de1Var.getContext(), str, de1Var, de1Var.f.a);
        }
        jn.p("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        de1 de1Var = this.b;
        zq0 zq0Var = de1Var.g;
        if (zq0Var == null) {
            jn.p("Signal utils is empty, ignoring.");
            return "";
        }
        vq0 vq0Var = zq0Var.b;
        if (vq0Var == null) {
            jn.p("Signals object is empty, ignoring.");
            return "";
        }
        if (de1Var.getContext() != null) {
            return vq0Var.i(de1Var.getContext(), de1Var, de1Var.f.a);
        }
        jn.p("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            jn.T("URL is empty, ignoring message");
        } else {
            zb3.l.post(new hb1(this, str, 5, false));
        }
    }
}
