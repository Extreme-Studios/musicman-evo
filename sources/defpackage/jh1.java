package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class jh1 implements r63 {
    public final /* synthetic */ int a = 0;
    public final v63 b;
    public final q63 c;
    public final q63 d;
    public final q63 e;
    public final v63 f;

    public jh1(q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, q63 q63Var5) {
        this.c = q63Var;
        this.d = q63Var2;
        this.b = q63Var3;
        this.e = q63Var4;
        this.f = q63Var5;
    }

    @Override // defpackage.v63
    public final /* bridge */ /* synthetic */ Object c() {
        int i = this.a;
        v63 v63Var = this.f;
        q63 q63Var = this.e;
        q63 q63Var2 = this.d;
        q63 q63Var3 = this.c;
        v63 v63Var2 = this.b;
        switch (i) {
            case 0:
                return new ih1((d41) q63Var3.c(), (dh1) q63Var2.c(), (Executor) v63Var2.c(), (ch1) q63Var.c(), (ae) v63Var.c());
            default:
                return new fb2((Context) v63Var2.c(), (gb2) q63Var3.c(), (ga2) q63Var2.c(), (fa2) q63Var.c(), ((vc2) v63Var.c()).S());
        }
    }

    public jh1(s63 s63Var, q63 q63Var, q63 q63Var2, s63 s63Var2, q63 q63Var3) {
        this.b = s63Var;
        this.c = q63Var;
        this.d = q63Var2;
        this.e = q63Var3;
        this.f = s63Var2;
    }
}
