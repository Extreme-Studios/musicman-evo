package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class wj1 implements r63 {
    public final /* synthetic */ int a;
    public final uj1 b;

    public /* synthetic */ wj1(uj1 uj1Var, int i) {
        this.a = i;
        this.b = uj1Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        uj1 uj1Var = this.b;
        switch (i) {
            case 0:
                return (Bundle) uj1Var.c;
            case 1:
                return Integer.valueOf(uj1Var.g);
            case 2:
                return (f52) uj1Var.d;
            default:
                return uj1Var.b();
        }
    }
}
