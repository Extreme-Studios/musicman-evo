package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mu1 implements xm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r71 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mu1(Object obj, r71 r71Var, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = r71Var;
        this.c = i;
    }

    @Override // defpackage.xm2
    public final /* synthetic */ hp b(Object obj) {
        Bundle bundle;
        Bundle bundle2;
        int i = this.a;
        int i2 = this.c;
        r71 r71Var = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                u40 u40Var = (u40) obj2;
                if (r71Var != null && (bundle = r71Var.r) != null) {
                    bundle.putBoolean("ls", true);
                }
                return na1.L(((pv1) ((o63) u40Var.j).c()).B3(r71Var, i2), new by0(r71Var, 1), (ya1) u40Var.h);
            default:
                kd0 kd0Var = (kd0) obj2;
                if (r71Var != null && (bundle2 = r71Var.r) != null) {
                    bundle2.putBoolean("ls", true);
                }
                return na1.L(((pv1) ((o63) kd0Var.k).c()).E3(r71Var, i2), new by0(r71Var, 2), (ya1) kd0Var.h);
        }
    }
}
