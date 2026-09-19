package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q22 implements j22 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final ArrayList j;
    public final String k;
    public final String l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final String p;
    public final int q;
    public final String r;

    public q22(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, boolean z6, long j, boolean z7, String str5, int i, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = str2;
        this.h = str6;
        this.j = arrayList;
        this.k = str3;
        this.l = str4;
        this.m = z6;
        this.n = j;
        this.o = z7;
        this.p = str5;
        this.q = i;
        this.r = str8;
        this.i = str7;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        String str;
        Bundle bundle = ((rj1) obj).a;
        bundle.putBoolean("cog", this.a);
        bundle.putBoolean("coh", this.b);
        bundle.putString("gl", this.c);
        bundle.putBoolean("simulator", this.d);
        bundle.putBoolean("is_latchsky", this.e);
        bundle.putInt("build_api_level", this.q);
        ix0 ix0Var = lx0.Pb;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (!((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f);
        }
        bundle.putString("hl", this.g);
        if (((Boolean) kx0Var2.a(lx0.fe)).booleanValue() || ((Boolean) kx0Var2.a(lx0.ge)).booleanValue()) {
            bundle.putString("dlc", this.h);
        }
        ArrayList<String> arrayList = this.j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.k);
        bundle.putString("submodel", Build.MODEL);
        Bundle bundleQ = ej1.q("device", bundle);
        bundle.putBundle("device", bundleQ);
        bundleQ.putString("build", Build.FINGERPRINT);
        bundleQ.putLong("remaining_data_partition_space", this.n);
        Bundle bundleQ2 = ej1.q("browser", bundleQ);
        bundleQ.putBundle("browser", bundleQ2);
        bundleQ2.putBoolean("is_browser_custom_tabs_capable", this.m);
        String str3 = this.l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle bundleQ3 = ej1.q("play_store", bundleQ);
            bundleQ.putBundle("play_store", bundleQ3);
            bundleQ3.putString("package_version", str3);
        }
        if (((Boolean) kx0Var2.a(lx0.fc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.o);
        }
        String str4 = this.p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) kx0Var2.a(lx0.Zb)).booleanValue()) {
            ej1.C(bundle, "gotmt_l", true, ((Boolean) kx0Var2.a(lx0.Wb)).booleanValue());
            ej1.C(bundle, "gotmt_i", true, ((Boolean) kx0Var2.a(lx0.Vb)).booleanValue());
        }
        if (!((Boolean) kx0Var2.a(lx0.Oe)).booleanValue() || (str = this.r) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        Bundle bundle = ((rj1) obj).b;
        bundle.putBoolean("simulator", this.d);
        bundle.putInt("build_api_level", this.q);
        ArrayList<String> arrayList = this.j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", Build.MODEL);
    }
}
