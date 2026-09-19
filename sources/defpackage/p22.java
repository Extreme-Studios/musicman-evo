package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class p22 implements j22 {
    public final int a;
    public final int b;

    public p22(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        int i;
        Bundle bundle = ((rj1) obj).a;
        int i2 = this.a;
        if (i2 == -1 || (i = this.b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i2);
        bundle.putInt("crashes_without_flags", i);
        ut0 ut0Var = ut0.f;
        if (tu0.e.c.j) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
