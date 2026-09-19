package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.extremestudios.musicmanevo.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wp1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wp1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ky1 {
        Bundle bundle;
        switch (this.a) {
            case 0:
                y91 y91Var = (y91) this.b;
                e52 e52Var = (e52) this.c;
                x42 x42Var = (x42) this.d;
                JSONObject jSONObject = (JSONObject) this.e;
                if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                    ec.q(vc3.C.k, ((cs1) y91Var.j).e, "native-assets-loading-basic-start");
                }
                ro1 ro1Var = new ro1();
                int iOptInt = jSONObject.optInt("template_id", -1);
                synchronized (ro1Var) {
                    ro1Var.a = iOptInt;
                }
                String strOptString = jSONObject.optString("custom_template_id");
                synchronized (ro1Var) {
                    ro1Var.u = strOptString;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
                String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null;
                synchronized (ro1Var) {
                    ro1Var.y = strOptString2;
                }
                i52 i52Var = (i52) e52Var.a.g;
                if (!i52Var.h.contains(Integer.toString(ro1Var.q()))) {
                    int iQ = ro1Var.q();
                    throw new ky1(ec.j(new StringBuilder(String.valueOf(iQ).length() + 21), "Invalid template ID: ", iQ), 1);
                }
                if (ro1Var.q() == 3) {
                    if (ro1Var.g() == null) {
                        throw new ky1("No custom template id for custom template ad response.", 1);
                    }
                    if (!i52Var.i.contains(ro1Var.g())) {
                        throw new ky1("Unexpected custom template id in the response.", 1);
                    }
                }
                double dOptDouble = jSONObject.optDouble("rating", -1.0d);
                synchronized (ro1Var) {
                    ro1Var.r = dOptDouble;
                }
                String strOptString3 = jSONObject.optString("headline", null);
                if (x42Var.M) {
                    vc3 vc3Var = vc3.C;
                    zb3 zb3Var = vc3Var.c;
                    Resources resourcesC = vc3Var.h.c();
                    String string = resourcesC != null ? resourcesC.getString(R.string.s7) : "Test Ad";
                    strOptString3 = ec.n(new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(strOptString3).length()), string, " : ", strOptString3);
                }
                ro1Var.o("headline", strOptString3);
                ro1Var.o("body", jSONObject.optString("body", null));
                ro1Var.o("call_to_action", jSONObject.optString("call_to_action", null));
                ro1Var.o("store", jSONObject.optString("store", null));
                ro1Var.o("price", jSONObject.optString("price", null));
                ro1Var.o("advertiser", jSONObject.optString("advertiser", null));
                return ro1Var;
            case 1:
                if (((Boolean) tu0.e.c.a(lx0.m2)).booleanValue() && (bundle = ((r71) this.b).r) != null) {
                    ec.q(vc3.C.k, bundle, "http-response-ready");
                }
                return new lv1((rv1) ((p62) this.c).h.get(), (JSONObject) ((p62) this.d).h.get(), (s71) ((p62) this.e).h.get());
            case 2:
                View view = (View) this.d;
                Activity activity = (Activity) this.e;
                hg2 hg2Var = (hg2) this.b;
                Context context = (Context) this.c;
                dh2 dh2Var = hg2Var.e;
                db2 db2VarB = hg2Var.a.b();
                if (db2VarB == null) {
                    dh2Var.b(15004);
                    return "";
                }
                String strG = db2VarB.g(context, view, activity);
                if (strG != null) {
                    return strG;
                }
                dh2Var.b(15007);
                return "";
            case 3:
                hg2 hg2Var2 = (hg2) this.b;
                Context context2 = (Context) this.c;
                String str = (String) this.d;
                View view2 = (View) this.e;
                dh2 dh2Var2 = hg2Var2.e;
                db2 db2VarB2 = hg2Var2.a.b();
                if (db2VarB2 == null) {
                    dh2Var2.b(15004);
                    return "";
                }
                String strI = db2VarB2.i(context2, str, view2, null);
                if (strI != null) {
                    return strI;
                }
                dh2Var2.b(15008);
                return "";
            case 4:
                View view3 = (View) this.d;
                Activity activity2 = (Activity) this.e;
                ig2 ig2Var = (ig2) this.b;
                Context context3 = (Context) this.c;
                HashMap map = new HashMap();
                ig2Var.e.e(20106, new oc1(ig2Var, map, context3, view3, activity2));
                String strI2 = ig2Var.i(map);
                map.clear();
                return strI2;
            default:
                ig2 ig2Var2 = (ig2) this.b;
                Context context4 = (Context) this.c;
                String str2 = (String) this.d;
                View view4 = (View) this.e;
                HashMap map2 = new HashMap();
                ig2Var2.e.e(20106, new oc1(ig2Var2, map2, context4, view4, str2));
                String strI3 = ig2Var2.i(map2);
                map2.clear();
                return strI3;
        }
    }
}
