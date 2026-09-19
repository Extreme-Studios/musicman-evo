package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class so1 extends to1 {
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final JSONObject h;

    public so1(x42 x42Var, JSONObject jSONObject) {
        super(x42Var);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject jSONObjectY0 = w40.Y0(jSONObject, strArr);
        this.b = jSONObjectY0 == null ? null : jSONObjectY0.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject jSONObjectY1 = w40.Y0(jSONObject, strArr2);
        this.c = jSONObjectY1 == null ? false : jSONObjectY1.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject jSONObjectY2 = w40.Y0(jSONObject, strArr3);
        this.d = jSONObjectY2 == null ? false : jSONObjectY2.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject jSONObjectY3 = w40.Y0(jSONObject, strArr4);
        this.e = jSONObjectY3 == null ? false : jSONObjectY3.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject jSONObjectY4 = w40.Y0(jSONObject, strArr5);
        this.g = jSONObjectY4 != null ? jSONObjectY4.optString(strArr5[0], "") : "";
        this.f = jSONObject.optJSONObject("overlay") != null;
        this.h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // defpackage.to1
    public final boolean a() {
        return this.f;
    }

    @Override // defpackage.to1
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.to1
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.to1
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.to1
    public final String e() {
        return this.g;
    }

    @Override // defpackage.to1
    public final j52 f() {
        JSONObject jSONObject = this.h;
        return jSONObject != null ? new j52(jSONObject) : this.a.V;
    }
}
