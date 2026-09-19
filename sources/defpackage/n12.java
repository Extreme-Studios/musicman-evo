package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class n12 implements j22 {
    public final /* synthetic */ int a;
    public final Boolean b;

    public /* synthetic */ n12(Boolean bool, int i) {
        this.a = i;
        this.b = bool;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i = this.a;
        Boolean bool = this.b;
        switch (i) {
            case 0:
                rj1 rj1Var = (rj1) obj;
                if (bool != null) {
                    rj1Var.a.putBoolean("hw_accel", bool.booleanValue());
                }
                break;
            default:
                Bundle bundle = ((rj1) obj).a;
                if (bool == null) {
                    bundle.putInt("lft", -1);
                } else if (!bool.booleanValue()) {
                    bundle.putInt("lft", 0);
                } else {
                    bundle.putInt("lft", 1);
                }
                break;
        }
    }
}
