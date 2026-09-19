package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ub1 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final long n;

    public ub1(String str) {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", lx0.U);
        this.b = b(jSONObject, "byte_buffer_precache_limit", lx0.l);
        this.c = b(jSONObject, "exo_cache_buffer_size", lx0.v);
        this.d = b(jSONObject, "exo_connect_timeout_millis", lx0.h);
        ix0 ix0Var = lx0.g;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.e = b(jSONObject, "exo_read_timeout_millis", lx0.i);
        this.f = b(jSONObject, "load_check_interval_bytes", lx0.j);
        this.g = b(jSONObject, "player_precache_limit", lx0.k);
        this.h = b(jSONObject, "socket_receive_buffer_size", lx0.m);
        this.i = a(jSONObject, "use_cache_data_source", lx0.I4);
        b(jSONObject, "min_retry_count", lx0.n);
        this.j = a(jSONObject, "treat_load_exception_as_non_fatal", lx0.p);
        this.k = a(jSONObject, "enable_multiple_video_playback", lx0.Z1);
        this.l = a(jSONObject, "use_range_http_data_source", lx0.b2);
        ix0 ix0Var2 = lx0.c2;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
                jLongValue = ((Long) tu0.e.c.a(ix0Var2)).longValue();
            }
        } else {
            jLongValue = ((Long) tu0.e.c.a(ix0Var2)).longValue();
        }
        this.m = jLongValue;
        ix0 ix0Var3 = lx0.d2;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
                jLongValue2 = ((Long) tu0.e.c.a(ix0Var3)).longValue();
            }
        } else {
            jLongValue2 = ((Long) tu0.e.c.a(ix0Var3)).longValue();
        }
        this.n = jLongValue2;
    }

    public static final boolean a(JSONObject jSONObject, String str, ix0 ix0Var) {
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(ix0Var)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, ix0 ix0Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) tu0.e.c.a(ix0Var)).intValue();
    }
}
