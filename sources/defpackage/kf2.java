package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class kf2 implements r63 {
    public final /* synthetic */ int a;
    public final s63 b;
    public final v63 c;
    public final v63 d;
    public final v63 e;

    public /* synthetic */ kf2(int i, q63 q63Var, q63 q63Var2, s63 s63Var, s63 s63Var2) {
        this.a = i;
        this.b = s63Var;
        this.c = q63Var;
        this.d = s63Var2;
        this.e = q63Var2;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.e;
        v63 v63Var2 = this.d;
        v63 v63Var3 = this.c;
        s63 s63Var = this.b;
        switch (i) {
            case 0:
                return new jf2((hp0) s63Var.a, (cf2) v63Var3.c(), (Context) v63Var2.c(), (dh2) v63Var.c(), 0);
            case 1:
                return new lf2((hp0) s63Var.a, (cf2) v63Var3.c(), (vc2) v63Var2.c(), (dh2) v63Var.c());
            default:
                return new jf2((hp0) s63Var.a, (cf2) v63Var3.c(), (Context) v63Var2.c(), (dh2) v63Var.c(), 1);
        }
    }
}
