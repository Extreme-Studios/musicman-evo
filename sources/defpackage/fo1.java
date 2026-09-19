package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fo1 implements r63 {
    public final /* synthetic */ int a;
    public final q63 b;
    public final v63 c;
    public final v63 d;
    public final v63 e;

    public /* synthetic */ fo1(q63 q63Var, q63 q63Var2, q63 q63Var3, Object obj, int i) {
        this.a = i;
        this.b = q63Var;
        this.c = q63Var2;
        this.d = q63Var3;
        this.e = (v63) obj;
    }

    @Override // defpackage.v63
    public final /* bridge */ /* synthetic */ Object c() {
        int i = this.a;
        v63 v63Var = this.e;
        v63 v63Var2 = this.d;
        q63 q63Var = this.b;
        v63 v63Var3 = this.c;
        switch (i) {
            case 0:
                ot0 ot0Var = (ot0) q63Var.c();
                Executor executor = (Executor) v63Var3.c();
                Context context = (Context) v63Var2.c();
                return new kh1(executor, new dh1(context, ot0Var), (ae) v63Var.c());
            default:
                o63 o63VarB = q63.b(q63Var);
                dh2 dh2Var = (dh2) v63Var3.c();
                return new rg2(o63VarB, dh2Var, ((vc2) v63Var.c()).J().A());
        }
    }
}
