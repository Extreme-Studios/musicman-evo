package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class y02 implements j22 {
    public final double a;
    public final boolean b;

    public y02(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((rj1) obj).a;
        Bundle bundleQ = ej1.q("device", bundle);
        bundle.putBundle("device", bundleQ);
        Bundle bundleQ2 = ej1.q("battery", bundleQ);
        bundleQ.putBundle("battery", bundleQ2);
        bundleQ2.putBoolean("is_charging", this.b);
        bundleQ2.putDouble("battery_level", this.a);
    }
}
