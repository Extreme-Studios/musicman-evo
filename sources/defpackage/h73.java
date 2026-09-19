package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h73 {
    public boolean b;
    public hp d;
    public SharedPreferences f;
    public SharedPreferences.Editor g;
    public String i;
    public String j;
    public final Object a = new Object();
    public final ArrayList c = new ArrayList();
    public au0 e = null;
    public boolean h = true;
    public boolean k = true;
    public String l = "-1";
    public int m = -1;
    public qa1 n = new qa1("", 0);
    public long o = 0;
    public long p = 0;
    public int q = -1;
    public int r = 0;
    public Set s = Collections.EMPTY_SET;
    public JSONObject t = new JSONObject();
    public boolean u = true;
    public boolean v = true;
    public String w = null;
    public String x = "";
    public boolean y = false;
    public String z = "";
    public String A = "{}";
    public int B = -1;
    public int C = -1;
    public long D = 0;

    public final void a(String str) {
        h();
        synchronized (this.a) {
            try {
                this.l = str;
                if (this.g != null) {
                    boolean zEquals = str.equals("-1");
                    SharedPreferences.Editor editor = this.g;
                    if (zEquals) {
                        editor.remove("IABTCF_TCString");
                    } else {
                        editor.putString("IABTCF_TCString", str);
                    }
                    this.g.apply();
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        h();
        synchronized (this.a) {
            try {
                this.m = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.g.apply();
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i) {
        h();
        synchronized (this.a) {
            try {
                if (this.C == i) {
                    return;
                }
                this.C = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.g.apply();
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(long j) {
        h();
        synchronized (this.a) {
            try {
                if (this.D == j) {
                    return;
                }
                this.D = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.g.apply();
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(boolean z) {
        if (((Boolean) tu0.e.c.a(lx0.X9)).booleanValue()) {
            h();
            synchronized (this.a) {
                try {
                    if (this.y == z) {
                        return;
                    }
                    this.y = z;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.g.apply();
                    }
                    i();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void f(String str) {
        if (((Boolean) tu0.e.c.a(lx0.X9)).booleanValue()) {
            h();
            synchronized (this.a) {
                try {
                    if (this.z.equals(str)) {
                        return;
                    }
                    this.z = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.g.apply();
                    }
                    i();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(String str) {
        if (((Boolean) tu0.e.c.a(lx0.la)).booleanValue()) {
            h();
            synchronized (this.a) {
                try {
                    if (this.A.equals(str)) {
                        return;
                    }
                    this.A = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.g.apply();
                    }
                    i();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void h() {
        hp hpVar = this.d;
        if (hpVar == null || hpVar.isDone()) {
            return;
        }
        try {
            this.d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            jn.V("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            jn.P("Fail to initialize AdSharedPreferenceManager.", e2);
        }
    }

    public final void i() {
        za1.a.execute(new ly1(26, this));
    }

    public final void j(Context context) {
        synchronized (this.a) {
            try {
                if (this.f != null) {
                    return;
                }
                this.d = za1.a.a(new u52(this, 10, context));
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        boolean z;
        h();
        synchronized (this.a) {
            z = this.u;
        }
        return z;
    }

    public final boolean l() {
        boolean z;
        h();
        synchronized (this.a) {
            z = this.v;
        }
        return z;
    }

    public final qa1 m() {
        qa1 qa1Var;
        h();
        synchronized (this.a) {
            try {
                if (((Boolean) tu0.e.c.a(lx0.vc)).booleanValue() && this.n.a()) {
                    ArrayList arrayList = this.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                }
                qa1Var = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qa1Var;
    }

    public final void n(long j) {
        h();
        synchronized (this.a) {
            try {
                if (this.p == j) {
                    return;
                }
                this.p = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.g.apply();
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(String str, String str2, boolean z) {
        h();
        synchronized (this.a) {
            try {
                JSONArray jSONArrayOptJSONArray = this.t.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        if (!z || !jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            length = i;
                            break;
                        }
                        return;
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z);
                    vc3.C.k.getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    jSONArrayOptJSONArray.put(length, jSONObject);
                    this.t.put(str, jSONArrayOptJSONArray);
                } catch (JSONException e) {
                    jn.V("Could not update native advanced settings", e);
                }
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.t.toString());
                    this.g.apply();
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String p() {
        String str;
        h();
        synchronized (this.a) {
            str = this.w;
        }
        return str;
    }

    public final void q(String str) {
        h();
        synchronized (this.a) {
            try {
                if (TextUtils.equals(this.w, str)) {
                    return;
                }
                this.w = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.g.apply();
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(boolean z) {
        h();
        synchronized (this.a) {
            try {
                if (z == this.k) {
                    return;
                }
                this.k = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.g.apply();
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s() {
        boolean z;
        if (!((Boolean) tu0.e.c.a(lx0.F0)).booleanValue()) {
            return false;
        }
        h();
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    public final void t(boolean z) {
        h();
        synchronized (this.a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) tu0.e.c.a(lx0.lb)).longValue();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z);
                    this.g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.g.apply();
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
