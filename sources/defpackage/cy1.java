package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class cy1 implements tw1 {
    @Override // defpackage.tw1
    public final boolean a(e52 e52Var, x42 x42Var) {
        return !TextUtils.isEmpty(x42Var.v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // defpackage.tw1
    public final hp b(e52 e52Var, x42 x42Var) {
        JSONObject jSONObject = x42Var.v;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        i52 i52Var = (i52) e52Var.a.g;
        h52 h52Var = new h52();
        h52Var.o.g = i52Var.p.g;
        f93 f93Var = i52Var.d;
        h52Var.a = f93Var;
        h52Var.b = i52Var.f;
        h52Var.v = i52Var.v;
        String str = i52Var.g;
        h52Var.c = str;
        h52Var.d = i52Var.a;
        h52Var.f = i52Var.h;
        h52Var.g = i52Var.i;
        h52Var.h = i52Var.j;
        h52Var.i = i52Var.k;
        o2 o2Var = i52Var.m;
        h52Var.j = o2Var;
        if (o2Var != null) {
            h52Var.e = o2Var.f;
        }
        ew ewVar = i52Var.n;
        h52Var.k = ewVar;
        if (ewVar != null) {
            h52Var.e = ewVar.f;
            h52Var.l = ewVar.g;
        }
        h52Var.p = i52Var.q;
        h52Var.q = i52Var.r;
        h52Var.r = i52Var.c;
        h52Var.s = i52Var.s;
        h52Var.t = i52Var.t;
        h52Var.u.set(i52Var.u.get());
        h52Var.c = strOptString;
        Bundle bundle = f93Var.r;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundle4.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundle4.putString("_ad", strOptString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = x42Var.D;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        h52Var.a = new f93(f93Var.f, f93Var.g, bundle4, f93Var.i, f93Var.j, f93Var.k, f93Var.l, f93Var.m, f93Var.n, f93Var.o, f93Var.p, f93Var.q, bundle2, f93Var.s, f93Var.t, f93Var.u, f93Var.v, f93Var.w, f93Var.x, f93Var.y, f93Var.z, f93Var.A, f93Var.B, f93Var.C, f93Var.D, f93Var.E, f93Var.F);
        i52 i52VarA = h52Var.a();
        Bundle bundle5 = new Bundle();
        z42 z42Var = (z42) e52Var.b.h;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(z42Var.a));
        bundle6.putInt("refresh_interval", z42Var.c);
        bundle6.putString("gws_query_id", z42Var.b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", x42Var.w);
        bundle7.putString("ad_source_name", x42Var.F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(x42Var.c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(x42Var.d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(x42Var.p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(x42Var.m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(x42Var.g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(x42Var.h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(x42Var.i));
        bundle7.putString("transaction_id", x42Var.j);
        bundle7.putString("valid_from_timestamp", x42Var.k);
        bundle7.putBoolean("is_closable_area_disabled", x42Var.P);
        bundle7.putString("recursive_server_response_data", x42Var.o0);
        bundle7.putBoolean("is_analytics_logging_enabled", x42Var.W);
        g81 g81Var = x42Var.l;
        if (g81Var != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", g81Var.g);
            bundle8.putString("rb_type", g81Var.f);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(i52VarA, bundle5, x42Var, e52Var);
    }

    public abstract p62 c(i52 i52Var, Bundle bundle, x42 x42Var, e52 e52Var);
}
