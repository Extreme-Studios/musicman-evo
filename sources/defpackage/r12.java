package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r12 implements j22 {
    public final i52 a;
    public final PackageInfo b;
    public final h73 c;

    public r12(i52 i52Var, PackageInfo packageInfo, h73 h73Var) {
        this.a = i52Var;
        this.b = packageInfo;
        this.c = h73Var;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        int i;
        JSONObject jSONObject;
        String str;
        JSONArray jSONArrayOptJSONArray;
        String str2;
        int i2;
        String str3;
        i52 i52Var = this.a;
        ArrayList<String> arrayList = i52Var.h;
        rj1 rj1Var = (rj1) obj;
        if (arrayList == null) {
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Bundle bundle = rj1Var.a;
        if (zIsEmpty) {
            bundle.putInt("native_version", 0);
            return;
        }
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", i52Var.i);
        qz0 qz0Var = i52Var.j;
        if (qz0Var != null) {
            if (qz0Var.f > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i3 = qz0Var.m;
                if (i3 == 1) {
                    str3 = "any";
                } else if (i3 == 2) {
                    str3 = "landscape";
                } else if (i3 != 3) {
                    str3 = i3 != 4 ? "unknown" : "square";
                } else {
                    str3 = "portrait";
                }
                if (!"unknown".equals(str3)) {
                    bundle.putString("native_media_orientation", str3);
                }
            }
            int i4 = qz0Var.h;
            if (i4 == 0) {
                str2 = "any";
            } else if (i4 != 1) {
                str2 = i4 != 2 ? "unknown" : "landscape";
            } else {
                str2 = "portrait";
            }
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", qz0Var.i);
            bundle.putBoolean("use_custom_mute", qz0Var.l);
            qz0 qz0Var2 = this.a.j;
            if (qz0Var2 != null && (i2 = qz0Var2.n) != 0) {
                bundle.putBoolean("sccg_tap", qz0Var2.o);
                bundle.putInt("sccg_dir", i2);
            }
        }
        PackageInfo packageInfo = this.b;
        int i5 = packageInfo != null ? packageInfo.versionCode : 0;
        h73 h73Var = this.c;
        h73Var.h();
        synchronized (h73Var.a) {
            i = h73Var.r;
        }
        if (i5 > i) {
            h73Var.h();
            synchronized (h73Var.a) {
                try {
                    h73Var.t = new JSONObject();
                    SharedPreferences.Editor editor = h73Var.g;
                    if (editor != null) {
                        editor.remove("native_advanced_settings");
                        h73Var.g.apply();
                    }
                    h73Var.i();
                } catch (Throwable th) {
                    throw th;
                }
            }
            h73Var.h();
            synchronized (h73Var.a) {
                try {
                    if (h73Var.r != i5) {
                        h73Var.r = i5;
                        SharedPreferences.Editor editor2 = h73Var.g;
                        if (editor2 != null) {
                            editor2.putInt("version_code", i5);
                            h73Var.g.apply();
                        }
                        h73Var.i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        h73Var.h();
        synchronized (h73Var.a) {
            jSONObject = h73Var.t;
        }
        String string = null;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(i52Var.g)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i6 = i52Var.l;
        if (i6 > 1) {
            bundle.putInt("max_num_ads", i6);
        }
        a31 a31Var = i52Var.b;
        if (a31Var != null) {
            String str4 = a31Var.h;
            if (TextUtils.isEmpty(str4)) {
                if (a31Var.f >= 2) {
                    int i7 = a31Var.i;
                    str = (i7 == 2 || i7 != 3) ? "l" : "p";
                } else {
                    int i8 = a31Var.g;
                    if (i8 == 1) {
                        str = "l";
                    } else if (i8 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 41);
                        sb.append("Instream ad video aspect ratio ");
                        sb.append(i8);
                        sb.append(" is wrong.");
                        jn.M(sb.toString());
                        str = "l";
                    } else {
                        str = "p";
                    }
                }
                bundle.putString("ia_var", str);
            } else {
                bundle.putString("ad_tag", str4);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) tu0.e.c.a(lx0.Fc)).booleanValue() || qz0Var == null) {
            return;
        }
        ee2 ee2Var = qz0Var.k;
        if (ee2Var != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", ee2Var.f);
            bundle2.putBoolean("clickToExpandRequested", ee2Var.h);
            bundle2.putBoolean("customControlsRequested", ee2Var.g);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", qz0Var.g);
        bundle.putInt("preferred_ad_choices_position", qz0Var.j);
    }

    @Override // defpackage.j22
    public final void e(Object obj) {
        int i;
        i52 i52Var = this.a;
        ArrayList arrayList = i52Var.h;
        rj1 rj1Var = (rj1) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Bundle bundle = rj1Var.b;
        qz0 qz0Var = i52Var.j;
        if (qz0Var == null || (i = qz0Var.n) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", qz0Var.o);
        bundle.putInt("sccg_dir", i);
    }
}
