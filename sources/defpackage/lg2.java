package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class lg2 {
    public final /* synthetic */ int a = 1;
    public final Context b;
    public final ExecutorService c;
    public final dh2 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public lg2(Context context, ExecutorService executorService, vc2 vc2Var, gd2 gd2Var, dh2 dh2Var, mg2 mg2Var) {
        this.b = context;
        this.c = executorService;
        this.e = gd2Var;
        this.d = dh2Var;
        this.h = mg2Var;
        this.f = vc2Var.D();
        this.g = vc2Var.J().B();
    }

    public static wd2 a(int i) {
        vd2 vd2VarC = wd2.C();
        vd2VarC.b();
        ((wd2) vd2VarC.g).H(i);
        return (wd2) vd2VarC.c();
    }

    public static wd2 b(int i) {
        vd2 vd2VarC = wd2.C();
        vd2VarC.b();
        ((wd2) vd2VarC.g).H(i);
        return (wd2) vd2VarC.c();
    }

    public lg2(Context context, o63 o63Var, ng2 ng2Var, dh2 dh2Var, ExecutorService executorService, fg2 fg2Var, ga2 ga2Var) {
        this.b = context;
        this.e = o63Var;
        this.f = ng2Var;
        this.d = dh2Var;
        this.c = executorService;
        this.g = fg2Var;
        this.h = ga2Var;
    }
}
