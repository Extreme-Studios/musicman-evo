package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qt1 {
    public final rt1 a;
    public final yt1 b;
    public final gt1 c;
    public final mt1 d;
    public final qb e;
    public final xt1 f;
    public final a71 g;
    public final a71 h;
    public final String i;
    public final Context j;
    public final String k;
    public JSONObject p;
    public boolean s;
    public int t;
    public boolean u;
    public final HashMap l = new HashMap();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public String o = "{}";
    public long q = Long.MAX_VALUE;
    public nt1 r = nt1.f;
    public pt1 v = pt1.f;
    public long w = 0;
    public String x = "";

    public qt1(rt1 rt1Var, yt1 yt1Var, gt1 gt1Var, Context context, d60 d60Var, mt1 mt1Var, xt1 xt1Var, a71 a71Var, a71 a71Var2, String str) {
        this.a = rt1Var;
        this.b = yt1Var;
        this.c = gt1Var;
        this.e = new qb(context);
        this.i = d60Var.f;
        this.k = str;
        this.d = mt1Var;
        this.f = xt1Var;
        this.g = a71Var;
        this.h = a71Var2;
        this.j = context;
        vc3.C.o.g = this;
    }

    public final void a() {
        String str;
        boolean z;
        ix0 ix0Var = lx0.I9;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            if (((Boolean) tu0Var.c.a(lx0.X9)).booleanValue()) {
                h73 h73VarG = vc3.C.h.g();
                h73VarG.h();
                synchronized (h73VarG.a) {
                    z = h73VarG.y;
                }
                if (z) {
                    j();
                    return;
                }
            }
            h73 h73VarG2 = vc3.C.h.g();
            h73VarG2.h();
            synchronized (h73VarG2.a) {
                str = h73VarG2.x;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (new JSONObject(str).optBoolean("isTestMode", false)) {
                    j();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(boolean z) {
        if (!this.u && z) {
            j();
        }
        g(z, true);
    }

    public final synchronized void c(String str, it1 it1Var) {
        ix0 ix0Var = lx0.I9;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && f()) {
            if (this.t >= ((Integer) tu0Var.c.a(lx0.K9)).intValue()) {
                jn.T("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap map = this.l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.t++;
            ((List) map.get(str)).add(it1Var);
            if (((Boolean) tu0Var.c.a(lx0.ga)).booleanValue()) {
                String str2 = it1Var.h;
                this.m.put(str2, it1Var);
                HashMap map2 = this.n;
                if (map2.containsKey(str2)) {
                    List list = (List) map2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((cb1) it.next()).b(it1Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized cb1 d(String str) {
        cb1 cb1Var;
        try {
            cb1Var = new cb1();
            HashMap map = this.m;
            if (map.containsKey(str)) {
                cb1Var.b((it1) map.get(str));
            } else {
                HashMap map2 = this.n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(cb1Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return cb1Var;
    }

    public final synchronized void e(ip1 ip1Var, pt1 pt1Var) {
        if (!f()) {
            try {
                ip1Var.g0(a23.E(18, null, null));
                return;
            } catch (RemoteException unused) {
                jn.T("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        int i = 1;
        if (((Boolean) tu0.e.c.a(lx0.I9)).booleanValue()) {
            this.v = pt1Var;
            this.a.a(ip1Var, new w11(this, i), new i11(4, this.f), new w11(this, 0));
            return;
        } else {
            try {
                ip1Var.g0(a23.E(1, null, null));
                return;
            } catch (RemoteException unused2) {
                jn.T("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized boolean f() {
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.X9)).booleanValue();
        boolean z = this.s;
        if (zBooleanValue) {
            return z || vc3.C.o.g();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    public final synchronized void g(boolean z, boolean z2) {
        try {
            if (this.s != z) {
                this.s = z;
                if (z) {
                    if (!((Boolean) tu0.e.c.a(lx0.X9)).booleanValue() || !vc3.C.o.g()) {
                        k();
                    } else if (!f()) {
                        l();
                    }
                } else if (!f()) {
                    l();
                }
                if (z2) {
                    m();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h(nt1 nt1Var, boolean z) {
        try {
            if (this.r != nt1Var) {
                if (f()) {
                    l();
                }
                this.r = nt1Var;
                if (f()) {
                    k();
                }
                if (z) {
                    m();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized JSONObject i() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (it1 it1Var : (List) entry.getValue()) {
                    if (it1Var.j != ht1.f) {
                        jSONArray.put(it1Var.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void j() {
        String str;
        String str2;
        this.u = true;
        mt1 mt1Var = this.d;
        mt1Var.getClass();
        kt1 kt1Var = new kt1(0, mt1Var);
        dt1 dt1Var = mt1Var.a;
        dt1Var.getClass();
        dt1Var.e.f.a(new hb1(dt1Var, kt1Var, 16, false), dt1Var.j);
        this.a.h = this;
        this.b.f = this;
        this.c.i = this;
        this.f.k = this;
        ix0 ix0Var = lx0.ma;
        tu0 tu0Var = tu0.e;
        if (!TextUtils.isEmpty((CharSequence) tu0Var.c.a(ix0Var))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.j);
            List listAsList = Arrays.asList(((String) tu0Var.c.a(ix0Var)).split(","));
            a71 a71Var = this.g;
            a71Var.c = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(a71Var);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                a71Var.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        ix0 ix0Var2 = lx0.na;
        if (!TextUtils.isEmpty((CharSequence) tu0Var.c.a(ix0Var2))) {
            SharedPreferences sharedPreferences = this.j.getSharedPreferences("admob", 0);
            List listAsList2 = Arrays.asList(((String) tu0Var.c.a(ix0Var2)).split(","));
            a71 a71Var2 = this.h;
            a71Var2.c = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(a71Var2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                a71Var2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        h73 h73VarG = vc3.C.h.g();
        h73VarG.h();
        synchronized (h73VarG.a) {
            str = h73VarG.x;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    g(jSONObject.optBoolean("isTestMode", false), false);
                    h((nt1) Enum.valueOf(nt1.class, jSONObject.optString("gesture", "NONE")), false);
                    this.o = jSONObject.optString("networkExtras", "{}");
                    this.q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        h73 h73VarG2 = vc3.C.h.g();
        h73VarG2.h();
        synchronized (h73VarG2.a) {
            str2 = h73VarG2.A;
        }
        this.x = str2;
    }

    public final synchronized void k() {
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 1) {
            this.b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.c.b();
        }
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int iOrdinal = this.r.ordinal();
            if (iOrdinal == 1) {
                yt1 yt1Var = this.b;
                synchronized (yt1Var) {
                    try {
                        if (yt1Var.g) {
                            SensorManager sensorManager2 = yt1Var.b;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(yt1Var, yt1Var.c);
                                jn.p("Stopped listening for shake gestures.");
                            }
                            yt1Var.g = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            gt1 gt1Var = this.c;
            synchronized (gt1Var) {
                try {
                    if (gt1Var.j && (sensorManager = gt1Var.a) != null && (sensor = gt1Var.b) != null) {
                        sensorManager.unregisterListener(gt1Var, sensor);
                        gt1Var.j = false;
                        jn.p("Stopped listening for flick gestures.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        } catch (Throwable th3) {
            throw th3;
        }
        throw th3;
    }

    public final void m() {
        String string;
        vc3 vc3Var = vc3.C;
        h73 h73VarG = vc3Var.h.g();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.s);
                jSONObject.put("gesture", this.r);
                long j = this.q;
                vc3Var.k.getClass();
                if (j > System.currentTimeMillis() / 1000) {
                    jSONObject.put("networkExtras", this.o);
                    jSONObject.put("networkExtrasExpirationSecs", this.q);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        h73VarG.getClass();
        if (((Boolean) tu0.e.c.a(lx0.I9)).booleanValue()) {
            h73VarG.h();
            synchronized (h73VarG.a) {
                try {
                    if (h73VarG.x.equals(string)) {
                        return;
                    }
                    h73VarG.x = string;
                    SharedPreferences.Editor editor = h73VarG.g;
                    if (editor != null) {
                        editor.putString("inspector_info", string);
                        h73VarG.g.apply();
                    }
                    h73VarG.i();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
