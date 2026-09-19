package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class dh1 implements y31 {
    public final Context f;
    public final ot0 g;
    public final PowerManager h;

    public dh1(Context context, ot0 ot0Var) {
        this.f = context;
        this.g = ot0Var;
        this.h = (PowerManager) context.getSystemService("power");
    }

    @Override // defpackage.y31
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject e(hh1 hh1Var) throws JSONException {
        boolean z;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        pt0 pt0Var = hh1Var.e;
        if (pt0Var == null) {
            jSONObject = new JSONObject();
        } else {
            ot0 ot0Var = this.g;
            if (ot0Var.b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z2 = pt0Var.a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", ot0Var.d).put("activeViewJSON", ot0Var.b).put("timestamp", hh1Var.c).put("adFormat", ot0Var.a).put("hashCode", ot0Var.c).put("isMraid", false).put("isStopped", false).put("isPaused", hh1Var.b).put("isNative", ot0Var.e).put("isScreenOn", this.h.isInteractive());
            vc3 vc3Var = vc3.C;
            mb0 mb0Var = vc3Var.i;
            synchronized (mb0Var) {
                z = mb0Var.a;
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appMuted", z).put("appVolume", vc3Var.i.a());
            Context context = this.f;
            jSONObjectPut2.put("deviceVolume", mb0.b(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut3 = jSONObject3.put("windowVisibility", pt0Var.b).put("isAttachedToWindow", z2);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = pt0Var.c;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = pt0Var.d;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = pt0Var.e;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", pt0Var.f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = pt0Var.g;
            JSONObject jSONObjectPut7 = jSONObjectPut6.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", pt0Var.h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = pt0Var.i;
            jSONObjectPut7.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", hh1Var.a);
            if (((Boolean) tu0.e.c.a(lx0.y1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = pt0Var.k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(hh1Var.d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
