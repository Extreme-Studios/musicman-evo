package defpackage;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class vg1 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final ti1 c;

    public /* synthetic */ vg1(ti1 ti1Var, v63 v63Var, int i) {
        this.a = i;
        this.c = ti1Var;
        this.b = v63Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        ti1 ti1Var = this.c;
        v63 v63Var = this.b;
        switch (i) {
            case 0:
                return new ug1(ti1Var.a(), ((ff1) v63Var).c());
            case 1:
                return new pj1(ti1Var.a());
            case 2:
                return new bn1(ti1Var.a(), (f82) v63Var.c());
            default:
                return new xm1((Context) v63Var.c(), new HashSet(), ti1Var.a());
        }
    }

    public /* synthetic */ vg1(q63 q63Var, ti1 ti1Var, int i) {
        this.a = i;
        this.b = q63Var;
        this.c = ti1Var;
    }
}
