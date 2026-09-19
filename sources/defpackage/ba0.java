package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ba0 implements z7 {
    public boolean f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public void a(db dbVar) {
        z90 z90Var = (z90) ((dm) this.k).o.get((z3) this.h);
        if (z90Var != null) {
            dq.c(z90Var.r.r);
            t3 t3Var = z90Var.g;
            String name = t3Var.getClass().getName();
            String strValueOf = String.valueOf(dbVar);
            t3Var.c(ec.o(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
            z90Var.l(dbVar, null);
        }
    }

    public synchronized boolean b(Context context) {
        if (!th2.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.j = new s62(new oh2(context));
        } catch (NullPointerException e) {
            jn.p("Error connecting LMD Overlay service");
            vc3.C.h.d("LastMileDeliveryOverlay.bindLastMileDeliveryService", e);
        }
        if (((s62) this.j) == null) {
            this.f = false;
            return false;
        }
        if (((s62) this.k) == null) {
            this.k = new s62(this);
        }
        this.f = true;
        return true;
    }

    public void c(md1 md1Var, kh2 kh2Var) {
        String str = kh2Var.b;
        if (md1Var == null) {
            d("adWebview missing", "onLMDShow");
            return;
        }
        this.i = md1Var;
        if (!this.f && !b(md1Var.getContext())) {
            d("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) tu0.e.c.a(lx0.mc)).booleanValue()) {
            this.h = str;
        }
        if (((s62) this.k) == null) {
            this.k = new s62(this);
        }
        s62 s62Var = (s62) this.j;
        if (s62Var != null) {
            s62 s62Var2 = (s62) this.k;
            oh2 oh2Var = (oh2) s62Var.f;
            qx1 qx1Var = oh2Var.a;
            if (qx1Var == null) {
                oh2.c.f("error: %s", "Play Store not found.");
            } else if (oh2.c(s62Var2, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, str))) {
                qx1Var.d(new sh2(qx1Var, new ib(oh2Var, kh2Var, s62Var2, 19), 0));
            }
        }
    }

    public void d(String str, String str2) {
        jn.p(str);
        if (((md1) this.i) != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            e("onError", map);
        }
    }

    public void e(String str, HashMap map) {
        za1.f.execute(new ib(this, str, map, 24));
    }

    public mh2 f() {
        String str;
        String str2 = null;
        if (!((Boolean) tu0.e.c.a(lx0.mc)).booleanValue() || TextUtils.isEmpty((String) this.h)) {
            String str3 = (String) this.g;
            if (str3 != null) {
                str = null;
                str2 = str3;
            } else {
                d("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = (String) this.h;
        }
        return new mh2(str2, str);
    }

    @Override // defpackage.z7
    public void j(db dbVar) {
        ((dm) this.k).r.post(new in2(this, dbVar, 11, false));
    }
}
