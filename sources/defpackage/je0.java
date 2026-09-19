package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class je0 implements od0, pd0, n62 {
    public long f;
    public Object g;

    public je0(int i) {
        switch (i) {
            case 6:
                this.g = null;
                this.f = -1L;
                break;
            default:
                this.g = new ArrayList();
                break;
        }
    }

    public static final void f(es1 es1Var, String str, long j) {
        if (es1Var != null) {
            if (((Boolean) tu0.e.c.a(lx0.vd)).booleanValue()) {
                us2 us2VarA = es1Var.a();
                us2VarA.s("action", "lat_init");
                us2VarA.s(str, Long.toString(j));
                us2VarA.t();
            }
        }
    }

    @Override // defpackage.od0
    public void A(int i) {
        ((od0) this.g).A(i);
    }

    @Override // defpackage.od0
    public boolean B(byte[] bArr, int i, int i2, boolean z) {
        return ((od0) this.g).B(bArr, 0, i2, z);
    }

    @Override // defpackage.n62
    public Object b(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((h73) ((xv1) this.g).a).s()) {
            return null;
        }
        long j = this.f;
        jv0 jv0VarP = kv0.P();
        jv0VarP.b();
        ((kv0) jv0VarP.g).L(j);
        byte[] bArrB = ((kv0) jv0VarP.c()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        s90.X(sQLiteDatabase, j, bArrB);
        return null;
    }

    @Override // defpackage.k73
    public int d(byte[] bArr, int i, int i2) {
        return ((od0) this.g).d(bArr, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(Context context, d60 d60Var, boolean z, qa1 qa1Var, String str, String str2, Runnable runnable, e72 e72Var, es1 es1Var, Long l, boolean z2) {
        a72 a72Var;
        Exception exc;
        PackageInfo packageInfoD;
        e72 e72Var2 = e72Var;
        vc3 vc3Var = vc3.C;
        ae aeVar = vc3Var.k;
        ae aeVar2 = vc3Var.k;
        aeVar.getClass();
        if (SystemClock.elapsedRealtime() - this.f < 5000) {
            jn.T("Not retrying to fetch app settings");
            return;
        }
        aeVar2.getClass();
        this.f = SystemClock.elapsedRealtime();
        if (qa1Var != null && !TextUtils.isEmpty(qa1Var.e)) {
            long j = qa1Var.f;
            aeVar2.getClass();
            if (System.currentTimeMillis() - j <= ((Long) tu0.e.c.a(lx0.A4)).longValue() && qa1Var.h) {
                return;
            }
        }
        if (context == null) {
            jn.T("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            jn.T("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.g = applicationContext;
        a72 a72VarJ = a72.j(context, 4);
        a72VarJ.a();
        a41 a41VarN = vc3Var.r.n((Context) this.g, d60Var, e72Var2);
        ue0 ue0Var = z31.b;
        c41 c41VarA = a41VarN.a("google.afma.config.fetchAppSettings", ue0Var, ue0Var);
        boolean z3 = false;
        Object[] objArr = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                ix0 ix0Var = lx0.a;
                tu0 tu0Var = tu0.e;
                jSONObject.put("experiment_ids", TextUtils.join(",", tu0Var.a.N()));
                jSONObject.put("js", d60Var.f);
                if (((Boolean) tu0Var.c.a(lx0.oa)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z2);
                }
                try {
                    ApplicationInfo applicationInfo = ((Context) this.g).getApplicationInfo();
                    if (applicationInfo != null && (packageInfoD = q90.a(context).d(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfoD.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    jn.p("Error fetching PackageInfo.");
                }
                hp hpVarA = c41VarA.a(jSONObject);
                try {
                    c41 c41Var = new c41(l, es1Var, a72VarJ, e72Var2, 2);
                    a72Var = a72VarJ;
                    try {
                        ya1 ya1Var = za1.g;
                        pm2 pm2VarL = na1.L(hpVarA, c41Var, ya1Var);
                        if (runnable != null) {
                            ((cb1) hpVarA).f.a(runnable, ya1Var);
                        }
                        if (l != null) {
                            ((cb1) hpVarA).f.a(new hb1(es1Var, l, 19, z3), ya1Var);
                        }
                        String str3 = "ConfigLoader.maybeFetchNewAppSettings";
                        if (((Boolean) tu0.e.c.a(lx0.h8)).booleanValue()) {
                            pm2VarL.a(new in2((Object) pm2VarL, (int) (objArr == true ? 1 : 0), (Object) new gp2(str3, 2)), ya1Var);
                        } else {
                            ej1.s(pm2VarL, "ConfigLoader.maybeFetchNewAppSettings");
                        }
                    } catch (Exception e) {
                        e = e;
                        exc = e;
                        jn.P("Error requesting application settings", exc);
                        a72Var.f(exc);
                        a72Var.b(false);
                        e72Var2.b(a72Var.m());
                    }
                } catch (Exception e2) {
                    e = e2;
                    a72Var = a72VarJ;
                    e72Var2 = e72Var2;
                }
            } catch (Exception e3) {
                exc = e3;
                a72Var = a72VarJ;
                jn.P("Error requesting application settings", exc);
                a72Var.f(exc);
                a72Var.b(false);
                e72Var2.b(a72Var.m());
            }
        } catch (Exception e4) {
            e = e4;
            a72Var = a72VarJ;
            exc = e;
            jn.P("Error requesting application settings", exc);
            a72Var.f(exc);
            a72Var.b(false);
            e72Var2.b(a72Var.m());
        }
    }

    @Override // defpackage.od0
    public void i() {
        ((od0) this.g).i();
    }

    @Override // defpackage.od0
    public int l() {
        return ((od0) this.g).l();
    }

    @Override // defpackage.od0
    public long m() {
        return ((od0) this.g).m() - this.f;
    }

    @Override // defpackage.od0
    public long o() {
        return ((od0) this.g).o() - this.f;
    }

    @Override // defpackage.od0
    public long p() {
        return ((od0) this.g).p() - this.f;
    }

    @Override // defpackage.pd0
    public void s() {
        ((pd0) this.g).s();
    }

    @Override // defpackage.od0
    public void t(int i) {
        ((od0) this.g).t(i);
    }

    @Override // defpackage.od0
    public void u(byte[] bArr, int i, int i2) {
        ((od0) this.g).u(bArr, i, i2);
    }

    @Override // defpackage.pd0
    public void v(ee0 ee0Var) {
        ((pd0) this.g).v(new ke0(this, ee0Var, ee0Var));
    }

    @Override // defpackage.od0
    public boolean w(byte[] bArr, int i, int i2, boolean z) {
        return ((od0) this.g).w(bArr, 0, i2, z);
    }

    @Override // defpackage.od0
    public void x(byte[] bArr, int i, int i2) {
        ((od0) this.g).x(bArr, i, i2);
    }

    @Override // defpackage.od0
    public int y(byte[] bArr, int i, int i2) {
        return ((od0) this.g).y(bArr, i, i2);
    }

    @Override // defpackage.pd0
    public me0 z(int i, int i2) {
        return ((pd0) this.g).z(i, i2);
    }

    public /* synthetic */ je0(Object obj, long j) {
        this.g = obj;
        this.f = j;
    }

    public je0(od0 od0Var, long j) {
        this.g = od0Var;
        hn.v(od0Var.o() >= j);
        this.f = j;
    }

    public /* synthetic */ je0(long j, Object obj) {
        this.f = j;
        this.g = obj;
    }
}
