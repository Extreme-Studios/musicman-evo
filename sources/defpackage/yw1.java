package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yw1 {
    public final String c;
    public z42 d = null;
    public x42 e = null;
    public ee3 f = null;
    public final Map b = Collections.synchronizedMap(new HashMap());
    public final List a = Collections.synchronizedList(new ArrayList());

    public yw1(String str) {
        this.c = str;
    }

    public static String d(x42 x42Var) {
        return ((Boolean) tu0.e.c.a(lx0.V3)).booleanValue() ? x42Var.p0 : x42Var.w;
    }

    public final void a(x42 x42Var) {
        String strD = d(x42Var);
        Map map = this.b;
        Object obj = map.get(strD);
        List list = this.a;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.f = (ee3) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            ee3 ee3Var = (ee3) list.get(iIndexOf);
            ee3Var.g = 0L;
            ee3Var.h = null;
        }
    }

    public final synchronized void b(x42 x42Var, int i) {
        Map map = this.b;
        String strD = d(x42Var);
        if (map.containsKey(strD)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = x42Var.v;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        ee3 ee3Var = new ee3(x42Var.E, 0L, null, bundle, x42Var.F, x42Var.G, x42Var.H, x42Var.I);
        try {
            this.a.add(i, ee3Var);
        } catch (IndexOutOfBoundsException e) {
            vc3.C.h.d("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e);
        }
        this.b.put(strD, ee3Var);
    }

    public final void c(x42 x42Var, long j, fu1 fu1Var, boolean z) {
        String strD = d(x42Var);
        Map map = this.b;
        if (map.containsKey(strD)) {
            if (this.e == null) {
                this.e = x42Var;
            }
            ee3 ee3Var = (ee3) map.get(strD);
            ee3Var.g = j;
            ee3Var.h = fu1Var;
            if (((Boolean) tu0.e.c.a(lx0.e7)).booleanValue() && z) {
                this.f = ee3Var;
            }
        }
    }
}
