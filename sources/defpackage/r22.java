package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class r22 implements j22 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public r22(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((rj1) obj).a;
        String str = this.a;
        ej1.v(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i = this.b;
        ej1.z(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.c);
        bundle.putInt("pt", this.d);
        Bundle bundleQ = ej1.q("device", bundle);
        bundle.putBundle("device", bundleQ);
        Bundle bundleQ2 = ej1.q("network", bundleQ);
        bundleQ.putBundle("network", bundleQ2);
        bundleQ2.putInt("active_network_state", this.f);
        bundleQ2.putBoolean("active_network_metered", this.e);
    }
}
