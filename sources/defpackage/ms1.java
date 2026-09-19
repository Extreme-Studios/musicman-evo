package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ms1 implements v6, pl1, ib0, ck1, lk1, mk1, yk1, ek1, v62 {
    public final List f;
    public final ks1 g;
    public long h;

    public ms1(ks1 ks1Var, if1 if1Var) {
        this.g = ks1Var;
        this.f = Collections.singletonList(if1Var);
    }

    @Override // defpackage.ib0
    public final void B() {
        R(ib0.class, "onAdClicked", new Object[0]);
    }

    @Override // defpackage.lk1
    public final void B0() {
        R(lk1.class, "onAdImpression", new Object[0]);
    }

    @Override // defpackage.pl1
    public final void E0(r71 r71Var) {
        vc3.C.k.getClass();
        this.h = SystemClock.elapsedRealtime();
        R(pl1.class, "onAdRequest", new Object[0]);
    }

    @Override // defpackage.v62
    public final void F(r62 r62Var, String str, Throwable th) {
        R(t62.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // defpackage.ck1
    public final void I(w71 w71Var, String str, String str2) {
        R(ck1.class, "onRewarded", w71Var, str, str2);
    }

    @Override // defpackage.v6
    public final void N(String str, String str2) {
        R(v6.class, "onAppEvent", str, str2);
    }

    @Override // defpackage.v62
    public final void P(String str, r62 r62Var) {
        R(t62.class, "onTaskSucceeded", str);
    }

    public final void R(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        List list = this.f;
        String strConcat = "Event-".concat(simpleName);
        ks1 ks1Var = this.g;
        ks1Var.getClass();
        if (((Boolean) ty0.a.u()).booleanValue()) {
            ks1Var.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(strConcat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                jn.P("unable to log", e);
            }
            jn.R("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }

    @Override // defpackage.ck1
    public final void U() {
        R(ck1.class, "onAdClosed", new Object[0]);
    }

    @Override // defpackage.ek1
    public final void Z(fu1 fu1Var) {
        R(ek1.class, "onAdFailedToLoad", Integer.valueOf(fu1Var.f), fu1Var.g, fu1Var.h);
    }

    @Override // defpackage.ck1
    public final void a() {
        R(ck1.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // defpackage.ck1
    public final void b() {
        R(ck1.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // defpackage.ck1
    public final void d() {
        R(ck1.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // defpackage.yk1
    public final void e() {
        vc3.C.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(jElapsedRealtime);
        jn.p(sb.toString());
        R(yk1.class, "onAdLoaded", new Object[0]);
    }

    @Override // defpackage.mk1
    public final void h(Context context) {
        R(mk1.class, "onDestroy", context);
    }

    @Override // defpackage.mk1
    public final void l(Context context) {
        R(mk1.class, "onPause", context);
    }

    @Override // defpackage.mk1
    public final void p(Context context) {
        R(mk1.class, "onResume", context);
    }

    @Override // defpackage.ck1
    public final void r() {
        R(ck1.class, "onAdOpened", new Object[0]);
    }

    @Override // defpackage.v62
    public final void s(String str) {
        R(t62.class, "onTaskCreated", str);
    }

    @Override // defpackage.v62
    public final void w(String str, r62 r62Var) {
        R(t62.class, "onTaskStarted", str);
    }

    @Override // defpackage.pl1
    public final void A(e52 e52Var) {
    }
}
