package defpackage;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class it1 implements ek1, pl1, al1 {
    public final qt1 f;
    public final String g;
    public final String h;
    public zj1 k;
    public fu1 l;
    public JSONObject p;
    public JSONObject q;
    public boolean r;
    public boolean s;
    public boolean t;
    public String m = "";
    public String n = "";
    public String o = "";
    public int i = 0;
    public ht1 j = ht1.f;

    public it1(qt1 qt1Var, i52 i52Var, String str) {
        this.f = qt1Var;
        this.h = str;
        this.g = i52Var.g;
    }

    public static JSONObject c(fu1 fu1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", fu1Var.h);
        jSONObject.put("errorCode", fu1Var.f);
        jSONObject.put("errorDescription", fu1Var.g);
        fu1 fu1Var2 = fu1Var.i;
        jSONObject.put("underlyingError", fu1Var2 == null ? null : c(fu1Var2));
        return jSONObject;
    }

    @Override // defpackage.pl1
    public final void A(e52 e52Var) {
        qt1 qt1Var = this.f;
        if (qt1Var.f()) {
            y91 y91Var = e52Var.b;
            List list = (List) y91Var.g;
            if (!list.isEmpty()) {
                this.i = ((x42) list.get(0)).b;
            }
            z42 z42Var = (z42) y91Var.h;
            String str = z42Var.l;
            if (!TextUtils.isEmpty(str)) {
                this.m = str;
            }
            String str2 = z42Var.m;
            if (!TextUtils.isEmpty(str2)) {
                this.n = str2;
            }
            JSONObject jSONObject = z42Var.p;
            if (jSONObject.length() > 0) {
                this.q = jSONObject;
            }
            ix0 ix0Var = lx0.ca;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                if (qt1Var.w >= ((Long) tu0Var.c.a(lx0.da)).longValue()) {
                    this.t = true;
                    return;
                }
                String str3 = z42Var.n;
                if (!TextUtils.isEmpty(str3)) {
                    this.o = str3;
                }
                JSONObject jSONObject2 = z42Var.o;
                if (jSONObject2.length() > 0) {
                    this.p = jSONObject2;
                }
                JSONObject jSONObject3 = this.p;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.o)) {
                    length += this.o.length();
                }
                long j = length;
                synchronized (qt1Var) {
                    qt1Var.w += j;
                }
            }
        }
    }

    @Override // defpackage.pl1
    public final void E0(r71 r71Var) {
        if (((Boolean) tu0.e.c.a(lx0.ga)).booleanValue()) {
            return;
        }
        qt1 qt1Var = this.f;
        if (qt1Var.f()) {
            qt1Var.c(this.g, this);
        }
    }

    @Override // defpackage.al1
    public final void G0(mi1 mi1Var) {
        qt1 qt1Var = this.f;
        if (qt1Var.f()) {
            this.k = mi1Var.f;
            this.j = ht1.g;
            if (((Boolean) tu0.e.c.a(lx0.ga)).booleanValue()) {
                qt1Var.c(this.g, this);
            }
        }
    }

    @Override // defpackage.ek1
    public final void Z(fu1 fu1Var) {
        qt1 qt1Var = this.f;
        if (qt1Var.f()) {
            this.j = ht1.h;
            this.l = fu1Var;
            if (((Boolean) tu0.e.c.a(lx0.ga)).booleanValue()) {
                qt1Var.c(this.g, this);
            }
        }
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectB;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.j);
        jSONObject.put("format", x42.a(this.i));
        if (((Boolean) tu0.e.c.a(lx0.ga)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.r);
            if (this.r) {
                jSONObject.put("shown", this.s);
            }
        }
        zj1 zj1Var = this.k;
        if (zj1Var != null) {
            jSONObjectB = b(zj1Var);
        } else {
            fu1 fu1Var = this.l;
            JSONObject jSONObjectB2 = null;
            if (fu1Var != null && (iBinder = fu1Var.j) != null) {
                zj1 zj1Var2 = (zj1) iBinder;
                jSONObjectB2 = b(zj1Var2);
                if (zj1Var2.j.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.l));
                    jSONObjectB2.put("errors", jSONArray);
                }
            }
            jSONObjectB = jSONObjectB2;
        }
        jSONObject.put("responseInfo", jSONObjectB);
        return jSONObject;
    }

    public final JSONObject b(zj1 zj1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zj1Var.f);
        jSONObject.put("responseSecsSinceEpoch", zj1Var.k);
        jSONObject.put("responseId", zj1Var.g);
        ix0 ix0Var = lx0.Z9;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            String str = zj1Var.l;
            if (!TextUtils.isEmpty(str)) {
                jn.F("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.m)) {
            jSONObject.put("adRequestUrl", this.m);
        }
        if (!TextUtils.isEmpty(this.n)) {
            jSONObject.put("postBody", this.n);
        }
        if (!TextUtils.isEmpty(this.o)) {
            jSONObject.put("adResponseBody", this.o);
        }
        Object obj = this.p;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.q;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) tu0Var.c.a(lx0.ca)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.t);
        }
        JSONArray jSONArray = new JSONArray();
        for (ee3 ee3Var : zj1Var.j) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", ee3Var.f);
            jSONObject2.put("latencyMillis", ee3Var.g);
            if (((Boolean) tu0.e.c.a(lx0.aa)).booleanValue()) {
                jSONObject2.put("credentials", ut0.f.a.k(ee3Var.i));
            }
            fu1 fu1Var = ee3Var.h;
            jSONObject2.put("error", fu1Var == null ? null : c(fu1Var));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }
}
