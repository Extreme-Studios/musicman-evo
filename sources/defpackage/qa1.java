package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qa1 {
    public String d;
    public String e;
    public long f;
    public JSONObject g;
    public boolean h;
    public boolean j;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final ArrayList i = new ArrayList();

    public qa1(String str, long j) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.d = "";
        this.h = false;
        this.j = false;
        this.e = str;
        this.f = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.g = new JSONObject(str);
            if (((Boolean) tu0.e.c.a(lx0.uc)).booleanValue() && a()) {
                return;
            }
            if (this.g.optInt("status", -1) != 1) {
                this.h = false;
                jn.T("App settings could not be fetched successfully.");
                return;
            }
            this.h = true;
            this.d = this.g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.c.put(strOptString2, new i41(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                    this.a.add(jSONArrayOptJSONArray3.optString(i2));
                }
            }
            if (((Boolean) tu0.e.c.a(lx0.j7)).booleanValue() && (jSONObjectOptJSONObject2 = this.g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    this.i.add(jSONArrayOptJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) tu0.e.c.a(lx0.F6)).booleanValue() || (jSONObjectOptJSONObject = this.g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            jn.V("Exception occurred while processing app setting json", e);
            vc3.C.h.d("AppSettings.parseAppSettingsJson", e);
        }
    }

    public final boolean a() {
        if (b()) {
            return false;
        }
        if (((Boolean) tu0.e.c.a(lx0.B4)).booleanValue()) {
            vc3 vc3Var = vc3.C;
            es1 es1Var = vc3Var.h.i;
            if (es1Var != null) {
                us2 us2VarA = es1Var.a();
                us2VarA.s("action", "cld_reset");
                us2VarA.s("cld_lut_ms", String.valueOf(this.f));
                vc3Var.k.getClass();
                us2VarA.s("event_timestamp", String.valueOf(System.currentTimeMillis()));
                us2VarA.s("cld_ttl_sec", String.valueOf(c()));
                us2VarA.t();
            }
        }
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d = "";
        this.e = "";
        this.g = null;
        this.h = false;
        this.i.clear();
        this.j = false;
        return true;
    }

    public final boolean b() {
        if (!TextUtils.isEmpty(this.e) && this.g != null) {
            long jC = c();
            vc3.C.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jC >= 0) {
                long j = this.f;
                if (j > jCurrentTimeMillis || (jCurrentTimeMillis - j) / 1000 > jC) {
                    return false;
                }
            }
        }
        return true;
    }

    public final long c() {
        ix0 ix0Var = lx0.xc;
        tu0 tu0Var = tu0.e;
        long jLongValue = ((Long) tu0Var.c.a(ix0Var)).longValue();
        ix0 ix0Var2 = lx0.wc;
        kx0 kx0Var = tu0Var.c;
        return (!((Boolean) kx0Var.a(ix0Var2)).booleanValue() || TextUtils.isEmpty(this.e)) ? jLongValue : this.g.optLong("cache_ttl_sec", ((Long) kx0Var.a(ix0Var)).longValue());
    }
}
