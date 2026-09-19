package defpackage;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u92 extends r92 {
    public WebView e;
    public Long f;
    public final Map g;

    public u92(String str, Map map) {
        super(str);
        this.f = null;
        this.g = map;
    }

    @Override // defpackage.r92
    public final void a() {
        WebView webView = new WebView(n92.h.g);
        this.e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.e.getSettings().setAllowContentAccess(false);
        this.e.getSettings().setAllowFileAccess(false);
        this.e.setWebViewClient(new t92(0, this));
        this.b = new da2(this.e);
        gm.q(this.e, null);
        Map map = this.g;
        Iterator it = map.keySet().iterator();
        if (!it.hasNext()) {
            this.f = Long.valueOf(System.nanoTime());
        } else {
            map.get((String) it.next()).getClass();
            j7.j();
        }
    }

    @Override // defpackage.r92
    public final void b() {
        super.b();
        new Handler().postDelayed(new ly1(this), Math.max(4000 - (this.f == null ? 4000L : (System.nanoTime() - this.f.longValue()) / 1000000), 2000L));
        this.e = null;
    }

    @Override // defpackage.r92
    public final void d(x82 x82Var, m40 m40Var) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap((HashMap) m40Var.i);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (!it.hasNext()) {
            e(x82Var, m40Var, jSONObject);
        } else {
            mapUnmodifiableMap.get((String) it.next()).getClass();
            j7.j();
        }
    }
}
