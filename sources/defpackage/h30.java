package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h30 {
    public final Context a;
    public final WebView b;
    public final zq0 c;
    public final k52 d;
    public final int e;
    public final hs1 f;
    public final boolean g;
    public final ya1 h = za1.f;
    public final f82 i;
    public final x93 j;
    public final g32 k;
    public final i73 l;

    public h30(WebView webView, zq0 zq0Var, hs1 hs1Var, f82 f82Var, k52 k52Var, x93 x93Var, g32 g32Var, i73 i73Var) {
        this.b = webView;
        Context context = webView.getContext();
        this.a = context;
        this.c = zq0Var;
        this.f = hs1Var;
        lx0.a(context);
        ix0 ix0Var = lx0.sa;
        tu0 tu0Var = tu0.e;
        this.e = ((Integer) tu0Var.c.a(ix0Var)).intValue();
        this.g = ((Boolean) tu0Var.c.a(lx0.ta)).booleanValue();
        this.i = f82Var;
        this.d = k52Var;
        this.j = x93Var;
        this.k = g32Var;
        this.l = i73Var;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            vc3 vc3Var = vc3.C;
            vc3Var.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strG = this.c.b.g(this.a, str, this.b);
            if (this.g) {
                vc3Var.k.getClass();
                jn.I(this.f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strG;
        } catch (RuntimeException e) {
            jn.P("Exception getting click signals. ", e);
            vc3.C.h.d("TaggingLibraryJsInterface.getClickSignals", e);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 51);
            sb.append("Invalid timeout for getting click signals. Timeout=");
            sb.append(i);
            jn.M(sb.toString());
            return "";
        }
        try {
            return (String) za1.a.b(new hq0(this, 2, str)).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            jn.P("Exception getting click signals with timeout. ", e);
            vc3.C.h.d("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e);
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        zb3 zb3Var = vc3.C.c;
        String string = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        zx0 zx0Var = new zx0(this, string);
        if (((Boolean) wy0.e.u()).booleanValue()) {
            this.j.a(this.b, zx0Var);
            return string;
        }
        if (((Boolean) tu0.e.c.a(lx0.va)).booleanValue()) {
            this.h.execute(new ib(this, bundle, zx0Var, 9));
            return string;
        }
        s70.h(this.a, new q2((p2) new p2(1).f1(bundle)), zx0Var);
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            vc3 vc3Var = vc3.C;
            vc3Var.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strI = this.c.b.i(this.a, this.b, null);
            if (this.g) {
                vc3Var.k.getClass();
                jn.I(this.f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strI;
        } catch (RuntimeException e) {
            jn.P("Exception getting view signals. ", e);
            vc3.C.h.d("TaggingLibraryJsInterface.getViewSignals", e);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50);
            sb.append("Invalid timeout for getting view signals. Timeout=");
            sb.append(i);
            jn.M(sb.toString());
            return "";
        }
        try {
            return (String) za1.a.b(new br0(1, this)).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            jn.P("Exception getting view signals with timeout. ", e);
            vc3.C.h.d("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e);
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) tu0.e.c.a(lx0.xa)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        za1.a.execute(new in2(this, 23, str));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("x");
            int i3 = jSONObject.getInt("y");
            int i4 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 != 0) {
                i = 1;
                if (i5 != 1) {
                    i = 2;
                    if (i5 != 2) {
                        i = 3;
                        if (i5 != 3) {
                            i = -1;
                        }
                    }
                }
            } else {
                i = 0;
            }
            try {
                this.c.b.f(MotionEvent.obtain(0L, i4, i, i2, i3, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (JSONException e) {
                e = e;
                jn.P("Failed to parse the touch string. ", e);
                vc3.C.h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
            }
        } catch (RuntimeException | JSONException e2) {
            e = e2;
        }
    }
}
