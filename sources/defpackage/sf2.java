package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class sf2 implements r63 {
    public final /* synthetic */ int a;
    public final s63 b;
    public final q63 c;
    public final s63 d;
    public final q63 e;

    public sf2(s63 s63Var, q63 q63Var, s63 s63Var2, q63 q63Var2) {
        this.a = 1;
        this.b = s63Var;
        this.c = q63Var;
        this.d = s63Var2;
        this.e = q63Var2;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        s63 s63Var = this.d;
        q63 q63Var = this.e;
        q63 q63Var2 = this.c;
        s63 s63Var2 = this.b;
        switch (i) {
            case 0:
                return new rf2((Context) s63Var2.a, (dh2) q63Var2.c(), (re2) q63Var.c(), (vc2) s63Var.a);
            case 1:
                return new wg2((Context) s63Var2.a, (dh2) q63Var2.c(), (vc2) s63Var.a, (ya1) q63Var.c());
            default:
                return new wg2((Context) s63Var2.a, (dh2) q63Var2.c(), (ya1) q63Var.c(), (vc2) s63Var.a);
        }
    }

    public /* synthetic */ sf2(int i, q63 q63Var, q63 q63Var2, s63 s63Var, s63 s63Var2) {
        this.a = i;
        this.b = s63Var;
        this.c = q63Var;
        this.e = q63Var2;
        this.d = s63Var2;
    }
}
