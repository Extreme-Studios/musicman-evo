package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s11 implements v11 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public s11(bo1 bo1Var, View view) {
        this.f = 3;
        this.g = new WeakReference(bo1Var);
        if (((Boolean) tu0.e.c.a(lx0.Jd)).booleanValue()) {
            this.h = new WeakReference(view);
        } else {
            this.h = new WeakReference(null);
        }
    }

    public void a(String str, h21 h21Var) {
        synchronized (this.g) {
            ((HashMap) this.h).put(str, h21Var);
        }
    }

    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        String str;
        switch (this.f) {
            case 0:
                md1 md1Var = (md1) obj;
                u11.b(map, (zm1) this.g);
                String str2 = (String) map.get("u");
                if (str2 == null) {
                    jn.T("URL missing from click GMSG.");
                    return;
                }
                sg1 sg1Var = (sg1) this.h;
                fn2 fn2VarR = fn2.r(u11.a(md1Var, str2));
                int i = 0;
                t11 t11Var = new t11(sg1Var, str2, i);
                ya1 ya1Var = za1.a;
                pm2 pm2VarL = na1.L(fn2VarR, t11Var, ya1Var);
                pm2VarL.a(new in2(pm2VarL, i, new dr0(14, md1Var)), ya1Var);
                return;
            case 1:
                Map map2 = (Map) this.h;
                vc3 vc3Var = vc3.C;
                aa1 aa1Var = vc3Var.y;
                aa1 aa1Var2 = vc3Var.y;
                Context context = (Context) this.g;
                if (aa1Var.a(context)) {
                    String str3 = (String) map.get("eventName");
                    String str4 = (String) map.get("eventId");
                    int iHashCode = str3.hashCode();
                    if (iHashCode != 94399) {
                        if (iHashCode != 94401) {
                            if (iHashCode == 94407 && str3.equals("_ai")) {
                                Map map3 = (Map) map2.get("_ai");
                                aa1Var2.getClass();
                                aa1Var2.h(context, "_ai", str4, aa1.f(map3));
                                return;
                            }
                        } else if (str3.equals("_ac")) {
                            Map map4 = (Map) map2.get("_ac");
                            aa1Var2.getClass();
                            aa1Var2.h(context, "_ac", str4, aa1.f(map4));
                            return;
                        }
                    } else if (str3.equals("_aa")) {
                        aa1Var2.h(context, "_aa", str4, null);
                        return;
                    }
                    jn.M("logScionEvent gmsg contained unsupported eventName");
                    return;
                }
                return;
            case 2:
                String str5 = (String) map.get("id");
                String str6 = (String) map.get("fail");
                String str7 = (String) map.get("fail_reason");
                String str8 = (String) map.get("fail_stack");
                String str9 = (String) map.get("result");
                if (true == TextUtils.isEmpty(str8)) {
                    str7 = "Unknown Fail Reason.";
                }
                String strConcat = TextUtils.isEmpty(str8) ? "" : "\n".concat(String.valueOf(str8));
                synchronized (this.g) {
                    try {
                        h21 h21Var = (h21) ((HashMap) this.h).remove(str5);
                        if (h21Var == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 50);
                            sb.append("Received result for unexpected method invocation: ");
                            sb.append(str5);
                            jn.T(sb.toString());
                            return;
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + strConcat.length());
                            sb2.append(str7);
                            sb2.append(strConcat);
                            h21Var.w(sb2.toString());
                            return;
                        }
                        if (str9 == null) {
                            h21Var.x(null);
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(str9);
                            if (jn.B()) {
                                String string = jSONObject.toString(2);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 13);
                                sb3.append("Result GMSG: ");
                                sb3.append(string);
                                jn.p(sb3.toString());
                            }
                            h21Var.x(jSONObject);
                            break;
                        } catch (JSONException e) {
                            h21Var.w(e.getMessage());
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 3:
                bo1 bo1Var = (bo1) ((WeakReference) this.g).get();
                if (bo1Var == null) {
                    return;
                }
                bo1Var.l.a();
                ix0 ix0Var = lx0.Jd;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    View view = (View) ((WeakReference) this.h).get();
                    x42 x42Var = bo1Var.o;
                    cp1 cp1Var = bo1Var.J;
                    cp1Var.getClass();
                    if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue() || view == null) {
                        return;
                    }
                    for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                        if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                            str = "1";
                            us2 us2VarA = cp1Var.a.a();
                            us2VarA.s("action", "hcp");
                            us2VarA.s("hcp", str);
                            us2VarA.r(x42Var);
                            us2VarA.t();
                            return;
                        }
                    }
                    str = "0";
                    us2 us2VarA2 = cp1Var.a.a();
                    us2VarA2.s("action", "hcp");
                    us2VarA2.s("hcp", str);
                    us2VarA2.r(x42Var);
                    us2VarA2.t();
                    return;
                }
                return;
            case 4:
                ep1 ep1Var = (ep1) this.g;
                try {
                    ep1Var.k = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    jn.M("Failed to call parse unconfirmedClickTimestamp.");
                }
                y01 y01Var = (y01) this.h;
                ep1Var.j = (String) map.get("id");
                String str10 = (String) map.get("asset_id");
                if (y01Var == null) {
                    jn.F("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    Parcel parcelU = y01Var.U();
                    parcelU.writeString(str10);
                    y01Var.K0(parcelU, 1);
                    return;
                } catch (RemoteException e2) {
                    jn.Z("#007 Could not call remote method.", e2);
                    return;
                }
                break;
            case 5:
                ir1 ir1Var = (ir1) this.g;
                md1 md1Var2 = (md1) this.h;
                ih1 ih1Var = ir1Var.i;
                synchronized (ih1Var) {
                    ih1Var.h.add(md1Var2);
                    ch1 ch1Var = ih1Var.f;
                    md1Var2.t0("/updateActiveView", ch1Var.e);
                    md1Var2.t0("/untrackActiveViewUnit", ch1Var.f);
                }
                return;
            default:
                md1 md1Var3 = (md1) obj;
                String str11 = (String) map.get("u");
                if (str11 == null) {
                    jn.T("URL missing from httpTrack GMSG.");
                    return;
                }
                x42 x42VarE = md1Var3.E();
                if (x42VarE != null && !x42VarE.i0) {
                    ((f82) this.g).b(str11, x42VarE.x0, null, null);
                    return;
                }
                z42 z42VarD0 = md1Var3.D0();
                if (z42VarD0 == null) {
                    vc3.C.h.d("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                bw1 bw1Var = (bw1) this.h;
                vc3.C.k.getClass();
                ym0 ym0Var = new ym0(System.currentTimeMillis(), z42VarD0.b, str11, 2);
                bw1Var.getClass();
                bw1Var.a(new z61(bw1Var, 20, ym0Var));
                return;
        }
    }

    public s11() {
        this.f = 2;
        this.g = new Object();
        this.h = new HashMap();
    }

    public /* synthetic */ s11(Object obj, int i, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
