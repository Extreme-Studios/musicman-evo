package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class dc3 extends b71 {
    public final d60 f;
    public final kb3 g;
    public final Context h;
    public final es0 i;
    public WebView j;
    public b11 k;
    public AsyncTask l;

    public dc3(Context context, kb3 kb3Var, String str, d60 d60Var) {
        String strConcat;
        this.h = context;
        this.f = d60Var;
        this.g = kb3Var;
        this.j = new WebView(context);
        es0 es0Var = new es0();
        es0Var.f = context.getApplicationContext();
        es0Var.g = str;
        es0Var.h = new TreeMap();
        String packageName = context.getPackageName();
        try {
            String str2 = q90.a(context).d(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            strConcat = sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            jn.P("Unable to get package version name for reporting", e);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        es0Var.k = strConcat;
        this.i = es0Var;
        B3(0);
        this.j.setVerticalScrollBarEnabled(false);
        this.j.getSettings().setJavaScriptEnabled(true);
        this.j.setWebViewClient(new t92(1, this));
        this.j.setOnTouchListener(new ka3());
    }

    @Override // defpackage.n71
    public final boolean B() {
        return false;
    }

    @Override // defpackage.n71
    public final void B1(kf3 kf3Var) {
        throw new IllegalStateException("Unused method");
    }

    public final void B3(int i) {
        if (this.j == null) {
            return;
        }
        this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    public final String C3() {
        String str = (String) this.i.j;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) gy0.d.u();
        return ec.n(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), "https://", str, str2);
    }

    @Override // defpackage.n71
    public final String D() {
        return null;
    }

    @Override // defpackage.n71
    public final void E1(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final void G() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final void I2(zy0 zy0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final void J0(ig1 ig1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final boolean K() {
        return false;
    }

    @Override // defpackage.n71
    public final void K2(ee2 ee2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final void L2(nu0 nu0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final lu1 M() {
        return null;
    }

    @Override // defpackage.n71
    public final void O1(yh1 yh1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final void P0(kb3 kb3Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // defpackage.n71
    public final hv1 Q() {
        return null;
    }

    @Override // defpackage.n71
    public final void X2(b11 b11Var) {
        this.k = b11Var;
    }

    @Override // defpackage.n71
    public final boolean Z(f93 f93Var) {
        dq.g(this.j, "This Search Ad has already been torn down");
        es0 es0Var = this.i;
        TreeMap treeMap = (TreeMap) es0Var.h;
        es0Var.i = f93Var.o.f;
        Bundle bundle = f93Var.r;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) gy0.c.u();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    es0Var.j = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    treeMap.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            treeMap.put("SDKVersion", this.f.f);
            if (((Boolean) gy0.a.u()).booleanValue()) {
                Bundle bundleH0 = w40.h0((Context) es0Var.f, (String) gy0.b.u());
                for (String str3 : bundleH0.keySet()) {
                    treeMap.put(str3, bundleH0.get(str3).toString());
                }
            }
        }
        this.l = new xa3(this).execute(new Void[0]);
        return true;
    }

    @Override // defpackage.n71
    public final rm c() {
        dq.d("getAdFrame must be called on the main UI thread.");
        return new ju(this.j);
    }

    @Override // defpackage.n71
    public final void d() {
        dq.d("pause must be called on the main UI thread.");
    }

    @Override // defpackage.n71
    public final void e() {
        dq.d("resume must be called on the main UI thread.");
    }

    @Override // defpackage.n71
    public final void i() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final void j2() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final Bundle k() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final long k0() {
        return 0L;
    }

    @Override // defpackage.n71
    public final boolean l() {
        return false;
    }

    @Override // defpackage.n71
    public final void m() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final void n() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final kb3 o() {
        return this.g;
    }

    @Override // defpackage.n71
    public final void o2(y71 y71Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final void o3(ux0 ux0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final void p0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final void q() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final b11 q2() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // defpackage.n71
    public final void r() {
        dq.d("destroy must be called on the main UI thread.");
        this.l.cancel(true);
        this.j.destroy();
        this.j = null;
    }

    @Override // defpackage.n71
    public final ig1 s() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // defpackage.n71
    public final String u() {
        return null;
    }

    @Override // defpackage.n71
    public final void u1(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.n71
    public final String v() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // defpackage.n71
    public final void a2(sr1 sr1Var) {
    }

    @Override // defpackage.n71
    public final void i1(boolean z) {
    }

    @Override // defpackage.n71
    public final void k3(rm rmVar) {
    }

    @Override // defpackage.n71
    public final void p2(xi1 xi1Var) {
    }

    @Override // defpackage.n71
    public final void t1(long j) {
    }

    @Override // defpackage.n71
    public final void c1(f93 f93Var, m21 m21Var) {
    }
}
