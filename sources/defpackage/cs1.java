package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cs1 {
    public final ConcurrentHashMap a;
    public final ua1 b;
    public final i52 c;
    public final zq0 d;
    public final Bundle e;

    public cs1(Context context, hs1 hs1Var, ua1 ua1Var, i52 i52Var, String str, String str2, zq0 zq0Var) {
        ActivityManager.MemoryInfo memoryInfo;
        f93 f93Var = i52Var.d;
        this.e = new Bundle();
        hs1Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(hs1Var.a);
        this.a = concurrentHashMap;
        this.b = ua1Var;
        this.c = i52Var;
        this.d = zq0Var;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        c();
        ix0 ix0Var = lx0.m2;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(vc3.C.h.k.get()));
            if (((Boolean) kx0Var2.a(lx0.u2)).booleanValue()) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager == null) {
                    memoryInfo = null;
                } else {
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    try {
                        activityManager.getMemoryInfo(memoryInfo2);
                    } catch (NullPointerException unused) {
                        jn.T("Error retrieving the memory information.");
                    }
                    memoryInfo = memoryInfo2;
                }
                if (memoryInfo != null) {
                    b("mem_avl", String.valueOf(memoryInfo.availMem));
                    b("mem_tt", String.valueOf(memoryInfo.totalMem));
                    b("low_m", true != memoryInfo.lowMemory ? "0" : "1");
                }
            }
        }
        if (((Boolean) kx0Var2.a(lx0.w2)).booleanValue()) {
            b("ad_unit_id", i52Var.g);
        }
        if (((Boolean) kx0Var2.a(lx0.n7)).booleanValue()) {
            int iN = jn.N(i52Var) - 1;
            if (iN == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (iN == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (iN == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (iN != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            b("ragent", f93Var.u);
            b("rtype", jn.v(jn.z(f93Var)));
        }
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            b("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            b("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.a.put(str, str2);
    }

    public final void c() {
        String str;
        if (((Boolean) tu0.e.c.a(lx0.pa)).booleanValue()) {
            vq0 vq0Var = this.d.b;
            boolean z = vq0Var instanceof y73;
            ConcurrentHashMap concurrentHashMap = this.a;
            if (z) {
                int i = ((y73) vq0Var).t;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                concurrentHashMap.put("asv", i2 != 0 ? "2" : "1");
                return;
            }
            if (!(vq0Var instanceof te1)) {
                concurrentHashMap.put("asv", "NA");
                return;
            }
            ge2 ge2Var = (ge2) ((tc2) ((te1) vq0Var).g.g).b.f.get();
            int iE = (ge2Var == null ? 1 : ge2Var.e()) - 1;
            if (iE == 1) {
                str = "1.0";
            } else if (iE != 2) {
                str = iE != 3 ? "uns" : "3.0";
            } else {
                str = "2.0";
            }
            concurrentHashMap.put("asv", str);
        }
    }
}
