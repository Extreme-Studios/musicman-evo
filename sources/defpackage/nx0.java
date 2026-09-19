package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class nx0 implements r63 {
    public final /* synthetic */ int a = 0;
    public final q63 b;
    public final q63 c;
    public final q63 d;
    public final v63 e;
    public final v63 f;
    public final v63 g;
    public final v63 h;
    public final v63 i;
    public final v63 j;

    public nx0(xe1 xe1Var, hj1 hj1Var, q63 q63Var, q63 q63Var2, q63 q63Var3, yj1 yj1Var, q63 q63Var4, q63 q63Var5, q63 q63Var6) {
        this.f = xe1Var;
        this.e = hj1Var;
        this.g = q63Var;
        this.b = q63Var2;
        this.c = q63Var3;
        this.j = yj1Var;
        this.d = q63Var4;
        this.h = q63Var5;
        this.i = q63Var6;
    }

    @Override // defpackage.v63
    public final Object c() {
        sj1 sj1Var;
        String string;
        int i;
        String string2;
        int i2;
        j01 j01Var;
        Iterator it;
        je0 je0VarA;
        switch (this.a) {
            case 0:
                ep0 ep0Var = (ep0) this.f.c();
                u62 u62Var = (u62) this.b.c();
                tz0 tz0Var = (tz0) this.h;
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                yy0 yy0Var = new yy0(ya1Var, 0, ((i91) tz0Var.b).a());
                sj1 sj1VarA = ((tp0) this.i).a();
                fn1 fn1Var = (fn1) this.c.c();
                ns0 ns0Var = (ns0) this.g.c();
                ma1 ma1Var = (ma1) this.d.c();
                int iIntValue = ((Integer) ((q63) this.e).c()).intValue();
                Bundle bundle = ((yj1) this.j).a().t;
                j01 j01Var2 = null;
                if (iIntValue != 1 || ma1Var == null) {
                    sj1Var = sj1VarA;
                } else {
                    vc3 vc3Var = vc3.C;
                    vc3Var.k.getClass();
                    bundle.putLong("read-from-disk-start", System.currentTimeMillis());
                    ns0Var.getClass();
                    ns0.b(37, bundle);
                    if (vc3Var.h.g().s()) {
                        ns0Var.b.c();
                        ns0.c(7, bundle);
                    } else {
                        PackageInfo packageInfo = ns0Var.e;
                        uk1 uk1Var = ns0Var.b;
                        if (packageInfo == null) {
                            uk1Var.c();
                            ns0.c(10, bundle);
                        } else {
                            Context context = ns0Var.a;
                            uk1Var.e();
                            synchronized (uk1Var.d) {
                                string = uk1Var.a.getString("pn", null);
                                break;
                            }
                            uk1Var.e();
                            synchronized (uk1Var.d) {
                                i = uk1Var.a.getInt("vc", -1);
                                break;
                            }
                            uk1Var.e();
                            synchronized (uk1Var.d) {
                                string2 = uk1Var.a.getString("dm", null);
                                break;
                            }
                            uk1Var.e();
                            synchronized (uk1Var.d) {
                                i2 = uk1Var.a.getInt("aav", -1);
                                break;
                            }
                            if (TextUtils.equals(context.getApplicationInfo().packageName, string) && i == packageInfo.versionCode && TextUtils.equals(Build.MODEL, string2) && i2 == Build.VERSION.SDK_INT) {
                                Iterator it2 = uk1Var.d().entrySet().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    try {
                                        long j = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                                        vc3 vc3Var2 = vc3.C;
                                        vc3Var2.k.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                                        ix0 ix0Var = lx0.Y7;
                                        tu0 tu0Var = tu0.e;
                                        it = it2;
                                        try {
                                            if (jCurrentTimeMillis <= ((Long) tu0Var.c.a(ix0Var)).longValue()) {
                                                mc2 mc2VarF = mc2.f(context);
                                                long jLongValue = ((Long) tu0Var.c.a(lx0.C3)).longValue();
                                                boolean zS = vc3Var2.h.g().s();
                                                mc2VarF.getClass();
                                                synchronized (mc2.class) {
                                                    try {
                                                        je0VarA = mc2VarF.a(null, null, jLongValue, zS);
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                    break;
                                                }
                                                je0 je0VarG = nc2.f(context).g(((Long) tu0Var.c.a(lx0.D3)).longValue(), vc3Var2.h.g().s());
                                                long j2 = je0VarA.f;
                                                if (j2 == -1 || j2 <= j) {
                                                    long j3 = je0VarG.f;
                                                    if (j3 == -1 || j3 <= j) {
                                                    }
                                                }
                                                it2 = it;
                                            }
                                            uk1Var.a((String) entry.getKey());
                                        } catch (IOException | JSONException unused) {
                                            continue;
                                        }
                                    } catch (IOException | JSONException unused2) {
                                        it = it2;
                                    }
                                    it2 = it;
                                }
                            } else {
                                uk1Var.c();
                                String str = context.getApplicationInfo().packageName;
                                int i3 = packageInfo.versionCode;
                                String str2 = Build.MODEL;
                                uk1Var.b(str, i3, Build.VERSION.SDK_INT);
                            }
                            ns0.b(38, bundle);
                            vc3.C.k.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - ns0Var.c;
                            ix0 ix0Var2 = lx0.V7;
                            tu0 tu0Var2 = tu0.e;
                            if (jCurrentTimeMillis2 > ((Long) tu0Var2.c.a(ix0Var2)).longValue()) {
                                ns0.c(2, bundle);
                                sj1Var = sj1VarA;
                            } else {
                                ns0.b(39, bundle);
                                String str3 = ma1Var.f;
                                String str4 = ma1Var.g;
                                f93 f93Var = ma1Var.i;
                                String string3 = f93Var.s.toString();
                                String string4 = f93Var.h.toString();
                                String str5 = f93Var.n;
                                String str6 = f93Var.u;
                                String strValueOf = String.valueOf(f93Var.t);
                                int length = String.valueOf(str3).length();
                                int length2 = String.valueOf(str4).length();
                                int length3 = String.valueOf(string3).length();
                                int length4 = String.valueOf(string4).length();
                                sj1Var = sj1VarA;
                                StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length() + strValueOf.length());
                                ec.x(sb, str3, str4, string3, string4);
                                sb.append(str5);
                                sb.append(str6);
                                sb.append(strValueOf);
                                String strD = f32.d(sb.toString(), "SHA-256");
                                if (TextUtils.isEmpty(strD)) {
                                    ns0.c(3, bundle);
                                } else {
                                    ns0.b(40, bundle);
                                    ns0.b(41, bundle);
                                    String strA = ns0Var.b.a(strD);
                                    ns0.b(42, bundle);
                                    if (!ns0Var.a()) {
                                        ns0Var.d.schedule(new e9(ns0Var, strD, ep0Var, new ma1(str3, str4, ma1Var.h, f93Var, 2, strD), 2), ((Long) tu0Var2.c.a(lx0.X7)).longValue(), TimeUnit.MILLISECONDS);
                                    }
                                    if (TextUtils.isEmpty(strA)) {
                                        ns0.c(4, bundle);
                                    } else {
                                        ns0.b(43, bundle);
                                        try {
                                            JSONObject jSONObject = new JSONObject(strA);
                                            String string5 = jSONObject.getString("sr");
                                            if (TextUtils.isEmpty(string5)) {
                                                ns0.c(8, bundle);
                                            } else {
                                                String string6 = jSONObject.getString("rs");
                                                if (TextUtils.isEmpty(string6)) {
                                                    ns0.c(9, bundle);
                                                } else {
                                                    String strI = zb3.I(new String(Base64.decode(string6, 10), StandardCharsets.UTF_8), "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2");
                                                    ns0.b(44, bundle);
                                                    try {
                                                        j01Var = null;
                                                        try {
                                                            j01 j01Var3 = new j01(new JsonReader(new StringReader(string5)), null);
                                                            j01Var3.c = strI;
                                                            j01Var3.e = bundle;
                                                            bundle.putBoolean("sod_h", true);
                                                            j01Var2 = j01Var3;
                                                        } catch (IOException e) {
                                                            e = e;
                                                            ns0.c(6, bundle);
                                                            vc3.C.h.d("DiskCachingManager.getSignalResponse", e);
                                                            j01Var2 = j01Var;
                                                        }
                                                    } catch (IOException e2) {
                                                        e = e2;
                                                        j01Var = null;
                                                    }
                                                }
                                            }
                                        } catch (JSONException e3) {
                                            j01Var = null;
                                            ns0.c(5, bundle);
                                            vc3.C.h.d("DiskCachingManager.getSignalResponse", e3);
                                        }
                                    }
                                }
                            }
                            j01Var2 = null;
                        }
                        ec.q(vc3.C.k, bundle, "read-from-disk-end");
                    }
                    sj1Var = sj1VarA;
                    ec.q(vc3.C.k, bundle, "read-from-disk-end");
                }
                if (j01Var2 != null) {
                    synchronized (fn1Var) {
                        fn1Var.L1(new s70(26, j01Var2));
                    }
                    return na1.t(j01Var2);
                }
                p62 p62VarY = u62Var.a(sj1Var.b(), r62.y).q(yy0Var).x(((Integer) tu0.e.c.a(lx0.Z5)).intValue()).y();
                p62VarY.a(new in2(p62VarY, 0, new zx(13, fn1Var)), za1.a);
                return p62VarY;
            case 1:
                return new tq1(((xe1) this.f).a(), (Executor) this.b.c(), (zq0) this.c.c(), ((ef1) this.g).a(), yf1.a(), (bw1) this.d.c(), (f82) ((q63) this.e).c(), (es1) ((q63) this.h).c(), (hw1) ((q63) this.i).c(), (k52) ((q63) this.j).c());
            case 2:
                Executor executor = (Executor) this.b.c();
                Context contextA = ((xe1) this.f).a();
                WeakReference weakReference = ((we1) this.g).b.d;
                dq.D(weakReference);
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                return new dt1(executor, contextA, weakReference, ya1Var2, (rr1) this.c.c(), (ScheduledExecutorService) this.d.c(), (js1) ((q63) this.e).c(), ((ef1) this.h).a(), new nm1(((bk1) this.i).b.c()), (e72) ((q63) this.j).c());
            case 3:
                return new sz1((Context) ((s63) this.e).a, (kb3) ((s63) this.h).a, (String) ((s63) this.i).a, (o42) this.b.c(), (nz1) this.c.c(), (p42) this.d.c(), ((ef1) this.f).a(), (zq0) this.g.c(), (es1) this.j.c());
            case 4:
                Context contextA2 = ((xe1) this.f).a();
                String str7 = ((zi1) ((hj1) this.e).b.c()).g.e;
                dq.D(str7);
                return new q02(contextA2, str7, (String) this.g.c(), (zi1) this.b.c(), (v52) this.c.c(), ((yj1) this.j).a(), (cs1) this.d.c(), (cj1) this.h.c(), ((Long) this.i.c()).longValue());
            case 5:
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                return new e22(ya1Var3, (ScheduledExecutorService) this.f.c(), (String) this.g.c(), (ez1) this.e.c(), (Context) this.b.c(), ((yj1) this.j).a(), (cz1) this.c.c(), (rr1) this.h.c(), (et1) this.i.c(), ((Integer) this.d.c()).intValue());
            default:
                hy1 hy1Var = (hy1) this.b.c();
                d60 d60VarA = ((ef1) this.f).a();
                String str8 = ((zi1) ((hj1) this.e).b.c()).g.e;
                dq.D(str8);
                return new e82(hy1Var, d60VarA, str8, (String) this.g.c(), (Context) this.c.c(), (f52) ((wj1) this.h).b.d, (g52) this.d.c(), (ae) this.i.c(), (zq0) this.j.c());
        }
    }

    public nx0(xe1 xe1Var, q63 q63Var, q63 q63Var2, ef1 ef1Var, yf1 yf1Var, q63 q63Var3, q63 q63Var4, q63 q63Var5, q63 q63Var6, q63 q63Var7) {
        this.f = xe1Var;
        this.b = q63Var;
        this.c = q63Var2;
        this.g = ef1Var;
        this.d = q63Var3;
        this.e = q63Var4;
        this.h = q63Var5;
        this.i = q63Var6;
        this.j = q63Var7;
    }

    public nx0(q63 q63Var, xe1 xe1Var, we1 we1Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, ef1 ef1Var, bk1 bk1Var, q63 q63Var5) {
        this.b = q63Var;
        this.f = xe1Var;
        this.g = we1Var;
        this.c = q63Var2;
        this.d = q63Var3;
        this.e = q63Var4;
        this.h = ef1Var;
        this.i = bk1Var;
        this.j = q63Var5;
    }

    public nx0(q63 q63Var, q63 q63Var2, tz0 tz0Var, tp0 tp0Var, q63 q63Var3, q63 q63Var4, q63 q63Var5, q63 q63Var6, yj1 yj1Var) {
        this.f = q63Var;
        this.b = q63Var2;
        this.h = tz0Var;
        this.i = tp0Var;
        this.c = q63Var3;
        this.g = q63Var4;
        this.d = q63Var5;
        this.e = q63Var6;
        this.j = yj1Var;
    }

    public nx0(q63 q63Var, v63 v63Var, hj1 hj1Var, v63 v63Var2, q63 q63Var2, wj1 wj1Var, q63 q63Var3, v63 v63Var3, v63 v63Var4) {
        this.b = q63Var;
        this.f = v63Var;
        this.e = hj1Var;
        this.g = v63Var2;
        this.c = q63Var2;
        this.h = wj1Var;
        this.d = q63Var3;
        this.i = v63Var3;
        this.j = v63Var4;
    }

    public nx0(s63 s63Var, s63 s63Var2, s63 s63Var3, q63 q63Var, q63 q63Var2, q63 q63Var3, ef1 ef1Var, q63 q63Var4, q63 q63Var5) {
        this.e = s63Var;
        this.h = s63Var2;
        this.i = s63Var3;
        this.b = q63Var;
        this.c = q63Var2;
        this.d = q63Var3;
        this.f = ef1Var;
        this.g = q63Var4;
        this.j = q63Var5;
    }

    public nx0(v63 v63Var, v63 v63Var2, v63 v63Var3, q63 q63Var, yj1 yj1Var, q63 q63Var2, v63 v63Var4, v63 v63Var5, q63 q63Var3) {
        this.f = v63Var;
        this.g = v63Var2;
        this.e = v63Var3;
        this.b = q63Var;
        this.j = yj1Var;
        this.c = q63Var2;
        this.h = v63Var4;
        this.i = v63Var5;
        this.d = q63Var3;
    }
}
