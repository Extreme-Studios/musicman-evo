package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g22 implements j22 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;

    public g22(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = str2;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        Bundle bundle = ((rj1) obj).a;
        bundle.putString("js", this.c);
        bundle.putBoolean("is_nonagon", true);
        ix0 ix0Var = lx0.d4;
        tu0 tu0Var = tu0.e;
        bundle.putString("extra_caps", (String) tu0Var.c.a(ix0Var));
        bundle.putInt("target_api", this.e);
        bundle.putInt("dv", this.f);
        bundle.putInt("lv", this.g);
        if (((Boolean) tu0Var.c.a(lx0.p6)).booleanValue()) {
            String str = this.h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleQ = ej1.q("sdk_env", bundle);
        bundleQ.putBoolean("mf", ((Boolean) ry0.e.u()).booleanValue());
        bundleQ.putBoolean("instant_app", this.a);
        bundleQ.putBoolean("lite", this.b);
        bundleQ.putBoolean("is_privileged_process", this.d);
        bundle.putBundle("sdk_env", bundleQ);
        Bundle bundleQ2 = ej1.q("build_meta", bundleQ);
        bundleQ2.putString("cl", "811902923");
        bundleQ2.putString("rapid_rc", "dev");
        bundleQ2.putString("rapid_rollup", "HEAD");
        bundleQ.putBundle("build_meta", bundleQ2);
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        Bundle bundle = ((rj1) obj).b;
        bundle.putString("js", this.c);
        bundle.putInt("target_api", this.e);
    }
}
