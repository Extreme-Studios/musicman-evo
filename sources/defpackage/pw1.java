package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pw1 {
    public final Context a;
    public final d60 b;
    public final x42 c;
    public final md1 d;
    public final es1 e;
    public c92 f;

    public pw1(Context context, d60 d60Var, x42 x42Var, md1 md1Var, es1 es1Var) {
        this.a = context;
        this.b = d60Var;
        this.c = x42Var;
        this.d = md1Var;
        this.e = es1Var;
    }

    public final synchronized boolean a() {
        md1 md1Var;
        x42 x42Var = this.c;
        if (x42Var.T) {
            ix0 ix0Var = lx0.G5;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                if (((Boolean) tu0Var.c.a(lx0.J5)).booleanValue() && (md1Var = this.d) != null) {
                    if (this.f != null) {
                        jn.T("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.a;
                    vc3 vc3Var = vc3.C;
                    vc3Var.x.getClass();
                    if (!el1.c(context)) {
                        jn.T("Unable to initialize omid.");
                        return false;
                    }
                    j52 j52Var = x42Var.V;
                    j52Var.getClass();
                    if (((JSONObject) j52Var.f).optBoolean((String) tu0Var.c.a(lx0.L5), true)) {
                        d60 d60Var = this.b;
                        el1 el1Var = vc3Var.x;
                        WebView webViewT = md1Var.t();
                        el1Var.getClass();
                        c92 c92Var = (c92) el1.k(new un1(d60Var, 17, webViewT));
                        if (((Boolean) tu0Var.c.a(lx0.K5)).booleanValue()) {
                            es1 es1Var = this.e;
                            String str = c92Var != null ? "1" : "0";
                            us2 us2VarA = es1Var.a();
                            us2VarA.s("omid_js_session_success", str);
                            us2VarA.t();
                        }
                        if (c92Var == null) {
                            jn.T("Unable to create javascript session service.");
                            return false;
                        }
                        jn.R("Created omid javascript session service.");
                        this.f = c92Var;
                        md1Var.D(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        md1 md1Var;
        try {
            c92 c92Var = this.f;
            if (c92Var == null || (md1Var = this.d) == null) {
                return;
            }
            ArrayList arrayListQ = md1Var.Q();
            int size = arrayListQ.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayListQ.get(i);
                i++;
                vc3.C.x.getClass();
                el1.n(new hb1(c92Var, (View) obj, 23, z));
            }
            md1Var.a("onSdkLoaded", vk2.l);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        md1 md1Var;
        if (this.f == null || (md1Var = this.d) == null) {
            return;
        }
        md1Var.a("onSdkImpression", vk2.l);
    }
}
