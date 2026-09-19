package defpackage;

import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class c92 {
    public final yl1 a;
    public final WebView b;
    public final da2 c;
    public final HashMap d;
    public final m92 e;

    /* JADX WARN: Multi-variable type inference failed */
    public c92(yl1 yl1Var, WebView webView) {
        HashMap map = new HashMap();
        this.d = map;
        this.e = new m92();
        if (!v51.m.g) {
            j7.e("Method called before OM SDK activation");
            throw null;
        }
        this.a = yl1Var;
        this.b = webView;
        da2 da2Var = this.c;
        if ((da2Var != null ? (View) da2Var.get() : null) != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((x82) it.next()).b(webView);
            }
            this.c = new da2(webView);
        }
        if (!na1.k("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        WebView webView2 = this.b;
        int i = v70.a;
        x3 x3Var = y70.d;
        if (!x3Var.b()) {
            throw y70.a();
        }
        ((WebViewProviderBoundaryInterface) v70.b(webView2).g).removeWebMessageListener("omidJsSessionService");
        rz1 rz1Var = new rz1(4, this);
        WebView webView3 = this.b;
        HashSet hashSet = new HashSet(Arrays.asList("*"));
        if (!x3Var.b()) {
            throw y70.a();
        }
        ((WebViewProviderBoundaryInterface) v70.b(webView3).g).addWebMessageListener("omidJsSessionService", (String[]) hashSet.toArray(new String[0]), new h8(new s70(0, rz1Var)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        y82 y82Var = y82.g;
        b92 b92Var = b92.g;
        d92 d92Var = d92.h;
        int i = 0;
        x82 x82Var = new x82(db2.e(y82Var, b92Var, d92Var, d92Var, false), new m40(this.a, this.b, null, null, w82.g), str);
        this.d.put(str, x82Var);
        da2 da2Var = this.c;
        x82Var.b(da2Var == null ? null : (View) da2Var.get());
        ArrayList arrayList = this.e.a;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l92 l92Var = (l92) obj;
            View view = (View) l92Var.a.get();
            a92 a92Var = l92Var.c;
            if (!x82Var.f) {
                x82Var.b.a(view, a92Var);
            }
        }
        x82Var.a();
    }
}
