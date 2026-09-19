package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.InputEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c41 implements xm2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public c41(tc2 tc2Var, Context context, String str, View view) {
        this.a = 8;
        this.c = context;
        this.b = str;
        this.d = view;
        Objects.requireNonNull(tc2Var);
        this.e = tc2Var;
    }

    public hp a(Object obj) {
        cb1 cb1Var = new cb1();
        r31 r31VarC = ((uj1) this.e).c();
        jn.p("callJs > getEngine: Promise created");
        r31VarC.m(new y91(this, r31VarC, obj, cb1Var, 7), new us2(r31VarC, this, cb1Var));
        return cb1Var;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) throws JSONException, wd1 {
        hp hpVarC;
        kn2 kn2VarT;
        int i = 0;
        switch (this.a) {
            case 0:
                return a(obj);
            case 1:
                sg1 sg1Var = (sg1) this.c;
                Uri.Builder builder = (Uri.Builder) this.d;
                String str = (String) this.b;
                InputEvent inputEvent = (InputEvent) this.e;
                if (((Integer) obj).intValue() != 1) {
                    builder.appendQueryParameter((String) tu0.e.c.a(lx0.Ya), "10");
                    return na1.t(builder.toString());
                }
                Uri.Builder builderBuildUpon = builder.build().buildUpon();
                ix0 ix0Var = lx0.Za;
                kx0 kx0Var = tu0.e.c;
                builderBuildUpon.appendQueryParameter((String) kx0Var.a(ix0Var), "1");
                builderBuildUpon.appendQueryParameter((String) kx0Var.a(lx0.Ya), "12");
                if (str.contains((CharSequence) kx0Var.a(lx0.ab))) {
                    builderBuildUpon.authority((String) kx0Var.a(lx0.bb));
                }
                rw1 rw1Var = sg1Var.c;
                Uri uriBuild = builderBuildUpon.build();
                rw1Var.getClass();
                try {
                    wq wqVar = rw1Var.a;
                    Objects.requireNonNull(wqVar);
                    hpVarC = wqVar.d(uriBuild, inputEvent);
                    break;
                } catch (Exception e) {
                    hpVarC = na1.C(e);
                }
                return na1.L(fn2.r(hpVarC), new r21(2, builder), sg1Var.f);
            case 2:
                Long l = (Long) this.c;
                es1 es1Var = (es1) this.d;
                a72 a72Var = (a72) this.e;
                e72 e72Var = (e72) this.b;
                JSONObject jSONObject = (JSONObject) obj;
                boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
                if (zOptBoolean) {
                    String string = jSONObject.getString("appSettingsJson");
                    vc3 vc3Var = vc3.C;
                    h73 h73VarG = vc3Var.h.g();
                    h73VarG.h();
                    synchronized (h73VarG.a) {
                        try {
                            vc3Var.k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (string == null || string.equals(h73VarG.n.e)) {
                                h73VarG.n.f = jCurrentTimeMillis;
                            } else {
                                h73VarG.n = new qa1(string, jCurrentTimeMillis);
                                SharedPreferences.Editor editor = h73VarG.g;
                                if (editor != null) {
                                    editor.putString("app_settings_json", string);
                                    h73VarG.g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                    h73VarG.g.apply();
                                }
                                h73VarG.i();
                                ArrayList arrayList = h73VarG.c;
                                int size = arrayList.size();
                                while (i < size) {
                                    Object obj2 = arrayList.get(i);
                                    i++;
                                    ((Runnable) obj2).run();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (l != null) {
                        vc3.C.k.getClass();
                        je0.f(es1Var, "cld_s", SystemClock.elapsedRealtime() - l.longValue());
                    }
                }
                String strOptString = jSONObject.optString("errorReason", "");
                if (!TextUtils.isEmpty(strOptString)) {
                    a72Var.k(strOptString);
                }
                a72Var.b(zOptBoolean);
                e72Var.b(a72Var.m());
                return kn2.g;
            case 3:
                aq1 aq1Var = (aq1) this.c;
                String str2 = (String) this.b;
                d91 d91Var = (d91) this.d;
                vs0 vs0Var = (vs0) this.e;
                aq1Var.getClass();
                ue0 ue0Var = vc3.C.d;
                md1 md1VarP = ue0.p(aq1Var.a, new eg(0, 0, 0), "native-omid", false, false, aq1Var.c, null, aq1Var.d, null, aq1Var.e, aq1Var.f, null, null, aq1Var.p, aq1Var.q, aq1Var.m);
                yu0 yu0Var = new yu0(md1VarP);
                md1VarP.e0().l = new dr0(22, yu0Var);
                md1VarP.loadData(Base64.encodeToString(str2.getBytes(), 1), "text/html", "base64");
                if (((Boolean) tu0.e.c.a(lx0.pe)).booleanValue()) {
                    if (d91Var != null) {
                        md1VarP.e0().D = d91Var;
                    }
                    md1VarP.e0().B = vs0Var;
                }
                return yu0Var;
            case 4:
                r52 r52Var = (r52) this.c;
                return na1.L(((fv1) this.d).d((r71) this.e), (xm2) this.b, (ya1) r52Var.g);
            case 5:
                my1 my1Var = (my1) this.c;
                x42 x42Var = (x42) this.d;
                e52 e52Var = (e52) this.e;
                tw1 tw1Var = (tw1) this.b;
                a72 a72VarJ = a72.j(my1Var.j, 12);
                a72VarJ.r0(x42Var.E);
                a72VarJ.a();
                hp hpVarK = na1.K(tw1Var.b(e52Var, x42Var), x42Var.R, TimeUnit.MILLISECONDS, my1Var.f);
                my1Var.h.b(e52Var, x42Var, hpVarK, my1Var.c);
                i8.M(hpVarK, my1Var.k, a72VarJ, false);
                return hpVarK;
            case 6:
                g92 g92Var = (g92) this.c;
                gv1 gv1Var = (gv1) this.d;
                r52 r52Var2 = (r52) this.e;
                x32 x32Var = (x32) this.b;
                d62 d62Var = (d62) obj;
                synchronized (g92Var) {
                    try {
                        g92Var.b = true;
                        d62Var.a = (tj1) ((w32) gv1Var.g).g;
                        if (g92Var.a) {
                            kn2VarT = na1.t(new j62(d62Var, x32Var));
                        } else {
                            r52Var2.H(x32Var.g, d62Var);
                            kn2VarT = kn2.g;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return kn2VarT;
            case 7:
                return ((ge2) ((tc2) this.b).b.f.get()).b((Context) this.c, (View) this.d, (Activity) this.e);
            default:
                return ((ge2) ((tc2) this.e).b.f.get()).f((Context) this.c, (String) this.b, (View) this.d);
        }
    }

    public /* synthetic */ c41(sg1 sg1Var, Uri.Builder builder, String str, InputEvent inputEvent) {
        this.a = 1;
        this.c = sg1Var;
        this.d = builder;
        this.b = str;
        this.e = inputEvent;
    }

    public c41(uj1 uj1Var, String str, y31 y31Var, x31 x31Var) {
        this.a = 0;
        this.e = uj1Var;
        this.b = str;
        this.d = y31Var;
        this.c = x31Var;
    }

    public /* synthetic */ c41(aq1 aq1Var, String str, d91 d91Var, vs0 vs0Var) {
        this.a = 3;
        this.c = aq1Var;
        this.b = str;
        this.d = d91Var;
        this.e = vs0Var;
    }

    public c41(tc2 tc2Var, Context context, View view, Activity activity) {
        this.a = 7;
        this.c = context;
        this.d = view;
        this.e = activity;
        Objects.requireNonNull(tc2Var);
        this.b = tc2Var;
    }

    public /* synthetic */ c41(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }
}
