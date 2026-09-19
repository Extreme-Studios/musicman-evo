package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h02 implements j22 {
    public final kb3 a;
    public final String b;
    public final boolean c;
    public final String d;
    public final float e;
    public final int f;
    public final int g;
    public final String h;
    public final boolean i;
    public final gn j;

    public h02(kb3 kb3Var, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2, gn gnVar) {
        dq.g(kb3Var, "the adSize must not be null");
        this.a = kb3Var;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = str3;
        this.i = z2;
        this.j = gnVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:16:0x00af  */
    public final void a(Bundle bundle) {
        gn gnVar;
        kb3 kb3Var = this.a;
        int i = kb3Var.j;
        boolean z = kb3Var.t;
        ej1.v(bundle, "smart_w", "full", i == -1);
        int i2 = kb3Var.g;
        ej1.v(bundle, "smart_h", "auto", i2 == -2);
        ej1.C(bundle, "ene", true, kb3Var.o);
        ej1.v(bundle, "rafmt", "102", kb3Var.r);
        ej1.v(bundle, "rafmt", "103", kb3Var.s);
        ej1.v(bundle, "rafmt", "105", z);
        ej1.C(bundle, "inline_adaptive_slot", true, this.i);
        ej1.C(bundle, "interscroller_slot", true, z);
        ej1.E("format", bundle, this.b);
        ej1.v(bundle, "fluid", "height", this.c);
        String str = this.d;
        ej1.v(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.e);
        bundle.putInt("sw", this.f);
        bundle.putInt("sh", this.g);
        String str2 = this.h;
        ej1.v(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ix0 ix0Var = lx0.de;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            gnVar = this.j;
            if (gnVar != null) {
                bundle.putInt("sam_t", gnVar.b);
                bundle.putInt("sam_b", gnVar.d);
                bundle.putInt("sam_l", gnVar.a);
                bundle.putInt("sam_r", gnVar.c);
            }
        } else if (((Boolean) tu0Var.c.a(lx0.ee)).booleanValue()) {
            gnVar = this.j;
            if (gnVar != null) {
                bundle.putInt("sam_t", gnVar.b);
                bundle.putInt("sam_b", gnVar.d);
                bundle.putInt("sam_l", gnVar.a);
                bundle.putInt("sam_r", gnVar.c);
            }
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        kb3[] kb3VarArr = kb3Var.l;
        if (kb3VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i2);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", kb3Var.n);
            arrayList.add(bundle2);
        } else {
            for (kb3 kb3Var2 : kb3VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", kb3Var2.n);
                bundle3.putInt("height", kb3Var2.g);
                bundle3.putInt("width", kb3Var2.j);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // defpackage.j22
    public final /* synthetic */ void b(Object obj) {
        a(((rj1) obj).a);
    }

    @Override // defpackage.j22
    public final /* synthetic */ void e(Object obj) {
        a(((rj1) obj).b);
    }
}
