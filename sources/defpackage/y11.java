package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class y11 implements r63 {
    public final /* synthetic */ int a;
    public final q63 b;
    public final v63 c;
    public final q63 d;

    public y11(q63 q63Var, q63 q63Var2, q63 q63Var3, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = q63Var;
                this.c = q63Var2;
                this.d = q63Var3;
                break;
            case 2:
                this.b = q63Var;
                this.d = q63Var2;
                this.c = q63Var3;
                break;
            default:
                this.c = q63Var;
                this.b = q63Var2;
                this.d = q63Var3;
                break;
        }
    }

    @Override // defpackage.v63
    public final /* bridge */ /* synthetic */ Object c() {
        int i = this.a;
        v63 v63Var = this.c;
        q63 q63Var = this.d;
        q63 q63Var2 = this.b;
        switch (i) {
            case 0:
                return new o11((ns0) v63Var.c(), ((Integer) q63Var2.c()).intValue(), (String) q63Var.c());
            case 1:
                return new as1((cs1) q63Var2.c(), (hs1) v63Var.c(), ((Integer) q63Var.c()).intValue());
            default:
                return new fg2((File) q63Var2.c(), (fa2) q63Var.c(), (dh2) v63Var.c());
        }
    }
}
