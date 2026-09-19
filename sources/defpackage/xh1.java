package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class xh1 implements r63 {
    public final /* synthetic */ int a = 1;
    public final v63 b;
    public final v63 c;
    public final ti1 d;
    public final v63 e;

    public xh1(y91 y91Var, q63 q63Var, ef1 ef1Var, ti1 ti1Var, yj1 yj1Var) {
        this.b = q63Var;
        this.c = ef1Var;
        this.d = ti1Var;
        this.e = yj1Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.e;
        ti1 ti1Var = this.d;
        v63 v63Var2 = this.c;
        v63 v63Var3 = this.b;
        switch (i) {
            case 0:
                return new wm1(new vh1((Context) v63Var3.c(), ((ef1) v63Var2).a(), ti1Var.a(), ((yj1) v63Var).a(), 0), za1.g);
            default:
                return new wm1(new vh1((Context) v63Var3.c(), ((ef1) v63Var2).a(), ti1Var.a(), ((yj1) v63Var).a(), 1), za1.g);
        }
    }

    public xh1(q63 q63Var, ef1 ef1Var, ti1 ti1Var, yj1 yj1Var) {
        this.b = q63Var;
        this.c = ef1Var;
        this.d = ti1Var;
        this.e = yj1Var;
    }
}
