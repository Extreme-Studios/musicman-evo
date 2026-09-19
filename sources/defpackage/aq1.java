package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class aq1 {
    public final Context a;
    public final up1 b;
    public final zq0 c;
    public final d60 d;
    public final vg2 e;
    public final cv0 f;
    public final Executor g;
    public final qz0 h;
    public final hq1 i;
    public final jr1 j;
    public final ScheduledExecutorService k;
    public final xq1 l;
    public final es1 m;
    public final f82 n;
    public final bw1 o;
    public final hw1 p;
    public final k52 q;
    public final cs1 r;
    public final os1 s;

    public aq1(Context context, up1 up1Var, zq0 zq0Var, d60 d60Var, vg2 vg2Var, cv0 cv0Var, ya1 ya1Var, i52 i52Var, hq1 hq1Var, jr1 jr1Var, ScheduledExecutorService scheduledExecutorService, es1 es1Var, f82 f82Var, bw1 bw1Var, xq1 xq1Var, hw1 hw1Var, k52 k52Var, cs1 cs1Var, os1 os1Var) {
        this.a = context;
        this.b = up1Var;
        this.c = zq0Var;
        this.d = d60Var;
        this.e = vg2Var;
        this.f = cv0Var;
        this.g = ya1Var;
        this.h = i52Var.j;
        this.i = hq1Var;
        this.j = jr1Var;
        this.k = scheduledExecutorService;
        this.m = es1Var;
        this.n = f82Var;
        this.o = bw1Var;
        this.l = xq1Var;
        this.p = hw1Var;
        this.q = k52Var;
        this.r = cs1Var;
        this.s = os1Var;
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final y22 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new y22(strOptString, strOptString2);
    }

    public final hp a(JSONArray jSONArray, boolean z, boolean z2, int i) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return na1.t(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
            ec.q(vc3.C.k, this.r.e, ec.a(i));
        }
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(b(jSONArray.optJSONObject(i2), z, 0));
        }
        return na1.M(new ym2(vj2.m(arrayList), true), lh0.k, this.g);
    }

    public final hp b(JSONObject jSONObject, boolean z, int i) {
        if (jSONObject == null) {
            return kn2.g;
        }
        ix0 ix0Var = lx0.o4;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        boolean zBooleanValue = ((Boolean) kx0Var.a(ix0Var)).booleanValue();
        HashMap map = null;
        if (zBooleanValue && jSONObject.has((String) kx0Var2.a(lx0.p4))) {
            map = new HashMap();
            for (String str : ((String) kx0Var2.a(lx0.q4)).split(",")) {
                try {
                    map.put(str, jSONObject.getString(str));
                } catch (JSONException unused) {
                }
            }
        }
        HashMap map2 = map;
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) && map2 == null) {
            return kn2.g;
        }
        if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue() && i != 0) {
            ec.q(vc3.C.k, this.r.e, ec.a(i));
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z || map2 != null) {
            return na1.t(new oz0(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, map2));
        }
        final up1 up1Var = this.b;
        up1Var.a.getClass();
        cb1 cb1Var = new cb1();
        n11.a.b(new z01(strOptString, cb1Var));
        qm2 qm2VarM = na1.M(na1.M(cb1Var, new wh2() { // from class: tp1
            @Override // defpackage.wh2
            public final Object apply(Object obj) {
                up1 up1Var2 = up1Var;
                up1Var2.getClass();
                byte[] bArr = ((km0) obj).b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (dOptDouble * 160.0d);
                if (!zOptBoolean) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                ix0 ix0Var2 = lx0.z6;
                tu0 tu0Var2 = tu0.e;
                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    up1Var2.a(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i2 = options.outWidth * options.outHeight;
                    if (i2 > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i2 - 1) / ((Integer) tu0Var2.c.a(lx0.A6)).intValue())) / 2);
                    }
                }
                return up1Var2.a(bArr, options);
            }
        }, up1Var.c), new wh2() { // from class: xp1
            @Override // defpackage.wh2
            public final /* synthetic */ Object apply(Object obj) {
                return new oz0(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.g);
        return jSONObject.optBoolean("require") ? na1.L(qm2VarM, new r21(5, qm2VarM), za1.g) : na1.J(qm2VarM, Exception.class, new kg0(2), za1.g);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    public final pm2 d(JSONObject jSONObject, x42 x42Var, z42 z42Var, vs0 vs0Var, d91 d91Var) {
        kb3 kb3Var;
        hq1 hq1Var;
        String strOptString = jSONObject.optString("base_url");
        String strOptString2 = jSONObject.optString("html");
        int i = 0;
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        if (iOptInt == 0) {
            if (iOptInt2 == 0) {
                kb3Var = kb3.a();
            }
            hq1Var = this.i;
            hq1Var.getClass();
            if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                ec.q(vc3.C.k, hq1Var.i.e, "native-assets-loading-video-composition-start");
            }
            pm2 pm2VarL = na1.L(kn2.g, new yp1(hq1Var, kb3Var, x42Var, z42Var, vs0Var, d91Var, strOptString, strOptString2, 1), hq1Var.b);
            return na1.L(pm2VarL, new zp1(pm2VarL, 1), za1.g);
        }
        i = iOptInt;
        kb3Var = new kb3(this.a, new s2(i, iOptInt2));
        hq1Var = this.i;
        hq1Var.getClass();
        if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
            ec.q(vc3.C.k, hq1Var.i.e, "native-assets-loading-video-composition-start");
        }
        pm2 pm2VarL2 = na1.L(kn2.g, new yp1(hq1Var, kb3Var, x42Var, z42Var, vs0Var, d91Var, strOptString, strOptString2, 1), hq1Var.b);
        return na1.L(pm2VarL2, new zp1(pm2VarL2, 1), za1.g);
    }
}
