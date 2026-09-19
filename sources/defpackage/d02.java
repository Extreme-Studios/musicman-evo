package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class d02 implements j22 {
    public final i52 a;
    public final long b;

    public d02(i52 i52Var, long j) {
        this.a = i52Var;
        this.b = j;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        Bundle bundle = ((rj1) obj).a;
        i52 i52Var = this.a;
        f93 f93Var = i52Var.d;
        int i = f93Var.B;
        Bundle bundle2 = f93Var.h;
        bundle.putInt("http_timeout_millis", i);
        bundle.putString("slotname", i52Var.g);
        int i2 = i52Var.p.g;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i3 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.b);
        ej1.C(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        ej1.v(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j = f93Var.g;
        ej1.v(bundle, "cust_age", simpleDateFormat.format(new Date(j)), j != -1);
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i4 = f93Var.i;
        ej1.z(bundle, "cust_gender", i4, i4 != -1);
        ej1.F(bundle, "kw", f93Var.j);
        int i5 = f93Var.l;
        ej1.z(bundle, "tag_for_child_directed_treatment", i5, i5 != -1);
        if (f93Var.k) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", f93Var.D);
        int i6 = f93Var.f;
        ej1.z(bundle, "d_imp_hdr", 1, i6 >= 2 && f93Var.m);
        String str = f93Var.n;
        ej1.v(bundle, "ppid", str, i6 >= 2 && !TextUtils.isEmpty(str));
        Location location = f93Var.p;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        ej1.E("url", bundle, f93Var.q);
        ej1.F(bundle, "neighboring_content_urls", f93Var.A);
        Bundle bundle4 = f93Var.s;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        ej1.F(bundle, "category_exclusions", f93Var.t);
        ej1.E("request_agent", bundle, f93Var.u);
        ej1.E("request_pkg", bundle, f93Var.v);
        ej1.C(bundle, "is_designed_for_families", f93Var.w, i6 >= 7);
        if (i6 >= 8) {
            int i7 = f93Var.y;
            ej1.z(bundle, "tag_for_under_age_of_consent", i7, i7 != -1);
            ej1.E("max_ad_content_rating", bundle, f93Var.z);
        }
        Bundle bundle5 = i52Var.e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        ej1.E("plid", bundle, bundle5.getString("plid"));
    }

    @Override // defpackage.j22
    public final void e(Object obj) {
        Bundle bundle = ((rj1) obj).b;
        i52 i52Var = this.a;
        bundle.putString("slotname", i52Var.g);
        f93 f93Var = i52Var.d;
        if (f93Var.k) {
            bundle.putBoolean("test_request", true);
        }
        int i = f93Var.l;
        ej1.z(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (f93Var.f >= 8) {
            int i2 = f93Var.y;
            ej1.z(bundle, "tag_for_under_age_of_consent", i2, i2 != -1);
        }
        ej1.E("url", bundle, f93Var.q);
        ej1.F(bundle, "neighboring_content_urls", f93Var.A);
        Bundle bundle2 = f93Var.h;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) tu0.e.c.a(lx0.W7)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        if (bundle3 != null) {
            bundle.putBundle("extras", bundle3);
        }
    }
}
