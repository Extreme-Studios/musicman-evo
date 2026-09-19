package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ru1 {
    public static final Pattern p = Pattern.compile("\\?");
    public final if1 a;
    public final Context b;
    public final d60 c;
    public final i52 d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final String g;
    public final d72 h;
    public final cs1 i;
    public final f82 j;
    public final ol1 k;
    public final Object l = new Object();
    public String m;
    public List n;
    public Bundle o;

    public ru1(if1 if1Var, Context context, d60 d60Var, i52 i52Var, ya1 ya1Var, String str, d72 d72Var, cs1 cs1Var, zf0 zf0Var, ScheduledExecutorService scheduledExecutorService, f82 f82Var, ol1 ol1Var) {
        this.a = if1Var;
        this.b = context;
        this.c = d60Var;
        this.d = i52Var;
        this.e = ya1Var;
        this.g = str;
        this.h = d72Var;
        this.i = cs1Var;
        this.f = scheduledExecutorService;
        this.j = f82Var;
        this.k = ol1Var;
    }

    public final fm2 a(String str, String str2) {
        hp hpVarT;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return na1.C(new ky1("Invalid ad string.", 15));
        }
        Context context = this.b;
        a72 a72VarJ = a72.j(context, 11);
        a72VarJ.a();
        a41 a41VarN = vc3.C.r.n(context, this.c, this.a.c());
        ue0 ue0Var = z31.b;
        c41 c41VarA = a41VarN.a("google.afma.response.normalize", ue0Var, ue0Var);
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.w7)).booleanValue();
        int i = 7;
        Executor executor = this.e;
        cs1 cs1Var = this.i;
        if (zBooleanValue) {
            try {
                str3 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    this.m = jSONObject.optString("fetch_url", "");
                    this.n = w40.X(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    jn.T("Invalid ad response.");
                }
            } catch (JSONException unused2) {
                str3 = str;
            }
            String string = this.m;
            List list = this.n;
            if (TextUtils.isEmpty(string)) {
                hpVarT = na1.t(str3);
                cs1Var.b("sst", "1");
            } else {
                cs1Var.b("sst", "2");
                ix0 ix0Var = lx0.y7;
                tu0 tu0Var = tu0.e;
                kx0 kx0Var = tu0Var.c;
                kx0 kx0Var2 = tu0Var.c;
                String str5 = (String) kx0Var.a(ix0Var);
                if (((Boolean) kx0Var2.a(lx0.x7)).booleanValue()) {
                    Pattern pattern = p;
                    xh2 xh2Var = new xh2(pattern);
                    Matcher matcher = pattern.matcher("");
                    matcher.getClass();
                    hn.K(!matcher.matches(), "The pattern may not match the empty string: %s", xh2Var);
                    List listM = new bz1(new gv1(10, xh2Var)).m(string);
                    if (listM.size() < 2) {
                        hpVarT = na1.C(new ky1("Invalid fetch URL.", 1));
                    } else {
                        str4 = (String) listM.get(1);
                        zb3 zb3Var = vc3.C.c;
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        hpVarT = na1.J((fn2) na1.K(fn2.r(za1.a.b(new hq0(this, 9, new qv1(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5)))), ((Integer) kx0Var2.a(lx0.z7)).intValue(), TimeUnit.MILLISECONDS, this.f), Exception.class, new yy0(this, i, list), executor);
                    }
                } else {
                    hpVarT = na1.J((fn2) na1.K(fn2.r(za1.a.b(new hq0(this, 9, new qv1(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5)))), ((Integer) kx0Var2.a(lx0.z7)).intValue(), TimeUnit.MILLISECONDS, this.f), Exception.class, new yy0(this, i, list), executor);
                }
            }
        } else {
            hpVarT = na1.t(str);
            cs1Var.b("sst", "1");
        }
        pm2 pm2VarL = na1.L(na1.L(na1.L(hpVarT, new r21(8, str2), executor), new yy0(this, 6, c41VarA), executor), new r21(i, this), executor);
        i8.M(pm2VarL, this.h, a72VarJ, false);
        pm2VarL.a(new in2(pm2VarL, 0, new zy1(26, this)), za1.g);
        return pm2VarL;
    }

    public final void b(int i) {
        Bundle bundle = this.i.e;
        if (((Boolean) tu0.e.c.a(lx0.B7)).booleanValue()) {
            ec.q(vc3.C.k, bundle, ec.a(i));
        }
    }

    public final String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.g));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            jn.T("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }
}
