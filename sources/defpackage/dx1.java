package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class dx1 implements pn1 {
    public final d60 f;
    public final cb1 g;
    public final x42 h;
    public final md1 i;
    public final i52 j;
    public final b21 k;
    public final boolean l;
    public final hw1 m;
    public final es1 n;

    public dx1(d60 d60Var, cb1 cb1Var, x42 x42Var, md1 md1Var, i52 i52Var, boolean z, b21 b21Var, hw1 hw1Var, es1 es1Var) {
        this.f = d60Var;
        this.g = cb1Var;
        this.h = x42Var;
        this.i = md1Var;
        this.j = i52Var;
        this.l = z;
        this.k = b21Var;
        this.m = hw1Var;
        this.n = es1Var;
    }

    @Override // defpackage.pn1
    public final x42 c() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    @Override // defpackage.pn1
    public final void o(boolean z, Context context, ik1 ik1Var) {
        boolean z2;
        float f;
        boolean z3;
        i52 i52Var = this.j;
        b21 b21Var = this.k;
        lf1 lf1Var = (lf1) na1.P(this.g);
        md1 md1Var = this.i;
        md1Var.O0(true);
        boolean z4 = this.l;
        boolean zA = z4 ? b21Var.a(true) : true;
        if (z4) {
            synchronized (b21Var) {
                z3 = b21Var.b;
            }
            if (z3) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (z4) {
            synchronized (b21Var) {
                f = b21Var.c;
            }
        } else {
            f = 0.0f;
        }
        float f2 = f;
        x42 x42Var = this.h;
        q83 q83Var = new q83(zA, true, z2, f2, z, x42Var.O, false);
        if (ik1Var != null) {
            ik1Var.R1();
        }
        v33 v33Var = vc3.C.b;
        nn1 nn1Var = (nn1) lf1Var.g0.c();
        int i = x42Var.Q;
        if (i == -1) {
            kf3 kf3Var = i52Var.k;
            if (kf3Var == null) {
                jn.F("Error setting app open orientation; no targeting orientation available.");
            } else {
                int i2 = kf3Var.f;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                } else {
                    jn.F("Error setting app open orientation; no targeting orientation available.");
                }
            }
        }
        d60 d60Var = this.f;
        int i3 = i;
        String str = x42Var.B;
        b52 b52Var = x42Var.s;
        v33.a(context, new AdOverlayInfoParcel(nn1Var, md1Var, i3, d60Var, str, q83Var, b52Var.b, b52Var.a, i52Var.g, ik1Var, x42Var.b() ? this.m : null, md1Var.o()), true, this.n);
    }
}
