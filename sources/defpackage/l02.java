package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class l02 implements j22 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final Object c;

    public /* synthetic */ l02(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                String str = (String) obj2;
                rj1 rj1Var = (rj1) obj;
                if (str != null) {
                    Bundle bundleQ = ej1.q("pii", rj1Var.a);
                    bundleQ.putString("afai", str);
                    bundleQ.putBoolean("is_afai_lat", z);
                }
                break;
            default:
                Bundle bundle = ((rj1) obj).a;
                if (((Boolean) tu0.e.c.a(lx0.Q5)).booleanValue()) {
                    bundle.putBoolean("app_switched", z);
                }
                kf3 kf3Var = (kf3) obj2;
                if (kf3Var != null) {
                    int i2 = kf3Var.f;
                    if (i2 == 1) {
                        bundle.putString("avo", "p");
                    } else if (i2 == 2) {
                        bundle.putString("avo", "l");
                    }
                }
                break;
        }
    }
}
