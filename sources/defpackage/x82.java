package defpackage;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class x82 {
    public final m40 a;
    public r92 d;
    public final String g;
    public final m92 b = new m92();
    public boolean e = false;
    public boolean f = false;
    public da2 c = new da2(null);

    public x82(db2 db2Var, m40 m40Var, String str) {
        this.a = m40Var;
        this.g = str;
        w82 w82Var = (w82) m40Var.l;
        if (w82Var == w82.g || w82Var == w82.h) {
            WebView webView = (WebView) m40Var.g;
            s92 s92Var = new s92(str);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            s92Var.b = new da2(webView);
            this.d = s92Var;
        } else {
            this.d = new u92(str, Collections.unmodifiableMap((HashMap) m40Var.i));
        }
        this.d.a();
        i92.c.a.add(this);
        r92 r92Var = this.d;
        gm gmVar = gm.m;
        WebView webViewC = r92Var.c();
        String str2 = r92Var.a;
        JSONObject jSONObject = new JSONObject();
        v92.b(jSONObject, "impressionOwner", (d92) db2Var.g);
        v92.b(jSONObject, "mediaEventsOwner", (d92) db2Var.h);
        v92.b(jSONObject, "creativeType", (y82) db2Var.i);
        v92.b(jSONObject, "impressionType", (b92) db2Var.j);
        v92.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(db2Var.f));
        gmVar.p(webViewC, "init", jSONObject, str2);
    }

    public final void a() {
        if (this.e || this.d == null) {
            return;
        }
        this.e = true;
        ArrayList arrayList = i92.c.b;
        boolean z = arrayList.size() > 0;
        arrayList.add(this);
        if (!z) {
            p92 p92VarA = p92.a();
            p92VarA.getClass();
            h92 h92Var = h92.i;
            h92Var.h = p92VarA;
            h92Var.f = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z2 = runningAppProcessInfo.importance == 100 || h92Var.a();
            h92Var.g = z2;
            h92Var.b(z2);
            z92.f.getClass();
            z92.b();
            f92 f92Var = p92VarA.b;
            f92Var.getClass();
            f92Var.f.submit(new ly1(14, f92Var));
            f92Var.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, f92Var);
        }
        float f = p92.a().a;
        r92 r92Var = this.d;
        gm.m.p(r92Var.c(), "setDeviceVolume", Float.valueOf(f), r92Var.a);
        r92 r92Var2 = this.d;
        Date date = (Date) g92.e.c;
        r92Var2.f(date != null ? (Date) date.clone() : null);
        this.d.d(this, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f || ((View) this.c.get()) == view) {
            return;
        }
        this.c = new da2(view);
        r92 r92Var = this.d;
        r92Var.getClass();
        r92Var.c = System.nanoTime();
        r92Var.d = 1;
        Collection<x82> collectionUnmodifiableCollection = Collections.unmodifiableCollection(i92.c.a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (x82 x82Var : collectionUnmodifiableCollection) {
            if (x82Var != this && ((View) x82Var.c.get()) == view) {
                x82Var.c.clear();
            }
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.c.clear();
        if (!this.f) {
            this.b.a.clear();
        }
        this.f = true;
        r92 r92Var = this.d;
        gm.m.p(r92Var.c(), "finishSession", r92Var.a);
        i92 i92Var = i92.c;
        ArrayList arrayList = i92Var.a;
        ArrayList arrayList2 = i92Var.b;
        boolean z = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z && arrayList2.size() <= 0) {
            p92 p92VarA = p92.a();
            p92VarA.getClass();
            z92 z92Var = z92.f;
            z92Var.getClass();
            Handler handler = z92.h;
            if (handler != null) {
                handler.removeCallbacks(z92.j);
                z92.h = null;
            }
            z92Var.a.clear();
            z92.g.post(new ly1(z92Var));
            h92 h92Var = h92.i;
            h92Var.f = false;
            h92Var.h = null;
            f92 f92Var = p92VarA.b;
            f92Var.b.getContentResolver().unregisterContentObserver(f92Var);
        }
        this.d.b();
        this.d = null;
    }
}
