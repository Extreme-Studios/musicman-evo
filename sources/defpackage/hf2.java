package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hf2 implements r63 {
    public final /* synthetic */ int a = 1;
    public final s63 b;
    public final v63 c;
    public final s63 d;
    public final v63 e;

    public hf2(s63 s63Var, q63 q63Var, s63 s63Var2, q63 q63Var2) {
        this.b = s63Var;
        this.c = q63Var;
        this.d = s63Var2;
        this.e = q63Var2;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.e;
        s63 s63Var = this.d;
        v63 v63Var2 = this.c;
        s63 s63Var2 = this.b;
        switch (i) {
            case 0:
                return new gf2((hp0) s63Var2.a, (Map) s63Var.a, (vc2) v63Var2.c(), (dh2) v63Var.c());
            default:
                return new lf2((hp0) s63Var2.a, (cf2) v63Var2.c(), (Map) s63Var.a, (dh2) v63Var.c());
        }
    }

    public hf2(s63 s63Var, s63 s63Var2, s63 s63Var3, q63 q63Var) {
        this.b = s63Var;
        this.d = s63Var2;
        this.c = s63Var3;
        this.e = q63Var;
    }
}
