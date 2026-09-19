package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class as1 implements pl1, yk1, ek1, en1 {
    public final cs1 f;
    public final hs1 g;
    public final int h;

    public as1(cs1 cs1Var, hs1 hs1Var, int i) {
        this.f = cs1Var;
        this.g = hs1Var;
        this.h = i;
    }

    @Override // defpackage.pl1
    public final void A(e52 e52Var) {
        cs1 cs1Var = this.f;
        cs1Var.getClass();
        y91 y91Var = e52Var.b;
        List list = (List) y91Var.g;
        if (!list.isEmpty()) {
            int i = ((x42) list.get(0)).b;
            cs1Var.b("ad_format", x42.a(i));
            if (i == 6) {
                cs1Var.a.put("as", true != cs1Var.b.l ? "0" : "1");
            }
        }
        if (((Boolean) tu0.e.c.a(lx0.o2)).booleanValue()) {
            cs1Var.b("mwl", Integer.toString(list.size()));
        }
        cs1Var.b("gqi", ((z42) y91Var.h).b);
    }

    @Override // defpackage.pl1
    public final void E0(r71 r71Var) {
        this.f.a(r71Var.f);
    }

    @Override // defpackage.en1
    public final void F(String str) {
        ix0 ix0Var = lx0.n7;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) tu0Var.c.a(lx0.U7)).booleanValue();
            cs1 cs1Var = this.f;
            if (zBooleanValue) {
                cs1Var.a.put("sgw", String.valueOf(this.h));
            }
            cs1Var.a.put("action", "sgf");
            cs1Var.b("sgf_reason", str);
            cs1Var.c();
            this.g.a(cs1Var.a, false);
        }
    }

    @Override // defpackage.ek1
    public final void Z(fu1 fu1Var) {
        cs1 cs1Var = this.f;
        cs1Var.a.put("action", "ftl");
        cs1Var.b("ftl", String.valueOf(fu1Var.f));
        cs1Var.b("ed", fu1Var.h);
        if (((Boolean) tu0.e.c.a(lx0.C7)).booleanValue()) {
            cs1Var.b("emsg", fu1Var.g);
        }
        cs1Var.c();
        this.g.a(cs1Var.a, false);
    }

    @Override // defpackage.en1
    public final void a(j01 j01Var) {
        String str;
        ix0 ix0Var = lx0.n7;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) kx0Var2.a(lx0.U7)).booleanValue();
            cs1 cs1Var = this.f;
            if (zBooleanValue) {
                cs1Var.a.put("sgw", String.valueOf(this.h));
            }
            hs1 hs1Var = this.g;
            if (j01Var == null) {
                ConcurrentHashMap concurrentHashMap = cs1Var.a;
                concurrentHashMap.put("action", "sgs");
                concurrentHashMap.put("request_id", "-1");
                hs1Var.a(concurrentHashMap, false);
                return;
            }
            r71 r71Var = j01Var.d;
            Bundle bundle = j01Var.e;
            if (r71Var != null) {
                b(r71Var.r, bs1.d);
            } else if (bundle != null && !bundle.isEmpty()) {
                b(bundle, bs1.d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(j01Var.c) ? j01Var.b : j01Var.c);
                ConcurrentHashMap concurrentHashMap2 = cs1Var.a;
                ConcurrentHashMap concurrentHashMap3 = cs1Var.a;
                concurrentHashMap2.put("action", "sgs");
                if (((Boolean) kx0Var2.a(lx0.wa)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        jn.P("Error retrieving JSONObject from the requestJson, ", e);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap3.put("tpc", str);
                if (r71Var != null) {
                    cs1Var.a(r71Var.f);
                }
                cs1Var.c();
                hs1Var.a(concurrentHashMap3, false);
            } catch (JSONException unused) {
                ConcurrentHashMap concurrentHashMap4 = cs1Var.a;
                concurrentHashMap4.put("action", "sgf");
                concurrentHashMap4.put("sgf_reason", "request_invalid");
                hs1Var.a(concurrentHashMap4, false);
            }
        }
    }

    public final void b(Bundle bundle, vj2 vj2Var) {
        ix0 ix0Var = lx0.m2;
        tu0 tu0Var = tu0.e;
        if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue() || bundle == null) {
            return;
        }
        ec.q(vc3.C.k, bundle, "public-api-callback");
        cs1 cs1Var = this.f;
        cs1Var.getClass();
        if (((Boolean) tu0Var.c.a(lx0.ce)).booleanValue()) {
            cs1Var.b("brr", true != cs1Var.c.q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            cs1Var.b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = vj2Var.size();
        for (int i = 0; i < size; i++) {
            bs1 bs1Var = (bs1) vj2Var.get(i);
            long j = bundle.getLong(ec.a(bs1Var.b), -1L);
            long j2 = bundle.getLong(ec.a(bs1Var.c), -1L);
            if (j > 0 && j2 > 0) {
                cs1Var.b(bs1Var.a, String.valueOf(j2 - j));
            }
        }
        c(bundle.getBundle("client_sig_latency_key"));
        c(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) tu0.e.c.a(lx0.U7)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                cs1Var.b("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                cs1Var.b("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.f.b(str, String.valueOf(j));
            }
        }
    }

    @Override // defpackage.yk1
    public final void e() {
        cs1 cs1Var = this.f;
        ConcurrentHashMap concurrentHashMap = cs1Var.a;
        concurrentHashMap.put("action", "loaded");
        b(cs1Var.e, bs1.e);
        if (((Boolean) tu0.e.c.a(lx0.td)).booleanValue()) {
            concurrentHashMap.put("mafe", true != na1.k("MUTE_AUDIO") ? "0" : "1");
        }
        cs1Var.c();
        this.g.a(concurrentHashMap, false);
    }
}
