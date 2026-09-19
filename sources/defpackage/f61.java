package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f61 extends us2 implements v11 {
    public final yd1 i;
    public final Context j;
    public final WindowManager k;
    public final n92 l;
    public DisplayMetrics m;
    public float n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    public f61(yd1 yd1Var, Context context, n92 n92Var) {
        super(yd1Var, "", 12, false);
        this.o = -1;
        this.p = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.i = yd1Var;
        this.j = context;
        this.l = n92Var;
        this.k = (WindowManager) context.getSystemService("window");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[PHI: r5
  0x0063: PHI (r5v2 int) = (r5v1 int), (r5v5 int) binds: [B:11:0x0042, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public final void E(int i, int i2) {
        int i3;
        Context context = this.j;
        int i4 = 0;
        if (context instanceof Activity) {
            zb3 zb3Var = vc3.C.c;
            i3 = zb3.q((Activity) context)[0];
        } else {
            i3 = 0;
        }
        yd1 yd1Var = this.i;
        de1 de1Var = yd1Var.f;
        if (de1Var.x() == null || !de1Var.x().b()) {
            int width = yd1Var.getWidth();
            int height = yd1Var.getHeight();
            if (((Boolean) tu0.e.c.a(lx0.c0)).booleanValue()) {
                if (width == 0) {
                    width = de1Var.x() != null ? de1Var.x().c : 0;
                }
                if (height != 0) {
                    i4 = height;
                } else if (de1Var.x() != null) {
                    i4 = de1Var.x().b;
                }
            } else {
                i4 = height;
            }
            ut0 ut0Var = ut0.f;
            this.t = ut0Var.a.i(context, width);
            this.u = ut0Var.a.i(context, i4);
        }
        try {
            ((md1) this.g).b("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2 - i3).put("width", this.t).put("height", this.u));
        } catch (JSONException e) {
            jn.P("Error occurred while dispatching default position.", e);
        }
        d61 d61Var = de1Var.s.C;
        if (d61Var != null) {
            d61Var.k = i;
            d61Var.l = i2;
        }
    }

    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.m = new DisplayMetrics();
        Display defaultDisplay = this.k.getDefaultDisplay();
        defaultDisplay.getMetrics(this.m);
        this.n = this.m.density;
        this.q = defaultDisplay.getRotation();
        f32 f32Var = ut0.f.a;
        DisplayMetrics displayMetrics = this.m;
        this.o = Math.round(displayMetrics.widthPixels / displayMetrics.density);
        DisplayMetrics displayMetrics2 = this.m;
        this.p = Math.round(displayMetrics2.heightPixels / displayMetrics2.density);
        yd1 yd1Var = this.i;
        de1 de1Var = yd1Var.f;
        Activity activityG = yd1Var.g();
        if (activityG == null || activityG.getWindow() == null) {
            this.r = this.o;
            this.s = this.p;
        } else {
            zb3 zb3Var = vc3.C.c;
            int[] iArrP = zb3.p(activityG);
            this.r = Math.round(iArrP[0] / this.m.density);
            this.s = Math.round(iArrP[1] / this.m.density);
        }
        if (de1Var.x().b()) {
            this.t = this.o;
            this.u = this.p;
        } else {
            yd1Var.measure(0, 0);
        }
        D(this.o, this.p, this.r, this.s, this.n, this.q);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        n92 n92Var = this.l;
        boolean zC = n92Var.c(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean zC2 = n92Var.c(intent2);
        boolean zC3 = n92Var.c(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        Context context = n92Var.g;
        try {
            jSONObjectPut = new JSONObject().put("sms", zC2).put("tel", zC).put("calendar", zC3).put("storePicture", ((Boolean) na1.p(context, gx0.b)).booleanValue() && q90.a(context).f.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e) {
            jn.P("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        yd1Var.b("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        yd1Var.getLocationOnScreen(iArr);
        ut0 ut0Var = ut0.f;
        f32 f32Var2 = ut0Var.a;
        int i = iArr[0];
        Context context2 = this.j;
        E(f32Var2.i(context2, i), ut0Var.a.i(context2, iArr[1]));
        if (jn.a0(2)) {
            jn.R("Dispatching Ready Event.");
        }
        try {
            ((md1) this.g).b("onReadyEventReceived", new JSONObject().put("js", de1Var.j.f));
        } catch (JSONException e2) {
            jn.P("Error occurred while dispatching ready Event.", e2);
        }
    }
}
