package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class sn1 implements ck1, qm1 {
    public final z91 f;
    public final Context g;
    public final aa1 h;
    public final View i;
    public String j;
    public final dv0 k;

    public sn1(z91 z91Var, Context context, aa1 aa1Var, WebView webView, dv0 dv0Var) {
        this.f = z91Var;
        this.g = context;
        this.h = aa1Var;
        this.i = webView;
        this.k = dv0Var;
    }

    @Override // defpackage.ck1
    public final void I(w71 w71Var, String str, String str2) {
        aa1 aa1Var = this.h;
        Context context = this.g;
        if (aa1Var.a(context)) {
            try {
                aa1Var.e(context, aa1Var.d(context), this.f.h, w71Var.f, w71Var.g);
            } catch (RemoteException e) {
                jn.V("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // defpackage.ck1
    public final void U() {
        this.f.a(false);
    }

    @Override // defpackage.qm1
    public final void f() {
        dv0 dv0Var = dv0.APP_OPEN;
        dv0 dv0Var2 = this.k;
        if (dv0Var2 == dv0Var) {
            return;
        }
        aa1 aa1Var = this.h;
        Context context = this.g;
        String str = "";
        if (aa1Var.a(context)) {
            AtomicReference atomicReference = aa1Var.f;
            if (aa1Var.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str2 = (String) aa1Var.i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                    if (str2 == null) {
                        str2 = (String) aa1Var.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (Exception unused) {
                    aa1Var.l("getCurrentScreenName", false);
                }
            }
        }
        this.j = str;
        this.j = str.concat(dv0Var2 == dv0.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // defpackage.ck1
    public final void r() {
        View view = this.i;
        if (view != null && this.j != null) {
            Context context = view.getContext();
            String str = this.j;
            aa1 aa1Var = this.h;
            AtomicReference atomicReference = aa1Var.g;
            if (aa1Var.a(context) && (context instanceof Activity) && aa1Var.m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                ConcurrentHashMap concurrentHashMap = aa1Var.h;
                Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        concurrentHashMap.put("setCurrentScreen", declaredMethod);
                    } catch (Exception unused) {
                        aa1Var.l("setCurrentScreen", false);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    aa1Var.l("setCurrentScreen", false);
                }
            }
        }
        this.f.a(true);
    }

    @Override // defpackage.ck1
    public final void a() {
    }

    @Override // defpackage.ck1
    public final void b() {
    }

    @Override // defpackage.ck1
    public final void d() {
    }

    @Override // defpackage.qm1
    public final void e() {
    }
}
