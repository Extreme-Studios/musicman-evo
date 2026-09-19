package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cx1 implements r63 {
    public final /* synthetic */ int a;
    public final q63 b;
    public final v63 c;
    public final yj1 d;
    public final v63 e;
    public final s63 f;
    public final q63 g;
    public final v63 h;
    public final q63 i;
    public final v63 j;

    public cx1(s63 s63Var, q63 q63Var, q63 q63Var2, q63 q63Var3, yj1 yj1Var, ef1 ef1Var, q63 q63Var4, q63 q63Var5, q63 q63Var6) {
        this.a = 0;
        this.f = s63Var;
        this.b = q63Var;
        this.c = q63Var2;
        this.g = q63Var3;
        this.d = yj1Var;
        this.e = ef1Var;
        this.h = q63Var4;
        this.i = q63Var5;
        this.j = q63Var6;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.j;
        q63 q63Var = this.i;
        v63 v63Var2 = this.h;
        q63 q63Var2 = this.g;
        s63 s63Var = this.f;
        v63 v63Var3 = this.e;
        yj1 yj1Var = this.d;
        v63 v63Var4 = this.c;
        q63 q63Var3 = this.b;
        switch (i) {
            case 0:
                nf1 nf1Var = (nf1) s63Var.a;
                return new bx1(nf1Var, (Executor) v63Var4.c(), (jr1) q63Var2.c(), yj1Var.a(), ((ef1) v63Var3).a(), new b21(), (hw1) v63Var2.c(), (cs1) q63Var.c(), (es1) v63Var.c());
            case 1:
                return new rx1((Context) q63Var3.c(), ((ef1) v63Var4).a(), yj1Var.a(), (Executor) v63Var3.c(), (sf1) s63Var.a, (jr1) q63Var2.c(), new b21(), (hw1) v63Var2.c(), (cs1) q63Var.c(), (es1) v63Var.c());
            default:
                return new rx1((Context) q63Var3.c(), ((ef1) v63Var4).a(), yj1Var.a(), (Executor) v63Var3.c(), (wf1) s63Var.a, (jr1) q63Var2.c(), new b21(), (hw1) v63Var2.c(), (cs1) q63Var.c(), (es1) v63Var.c());
        }
    }

    public /* synthetic */ cx1(q63 q63Var, ef1 ef1Var, yj1 yj1Var, q63 q63Var2, s63 s63Var, q63 q63Var3, q63 q63Var4, q63 q63Var5, q63 q63Var6, int i) {
        this.a = i;
        this.b = q63Var;
        this.c = ef1Var;
        this.d = yj1Var;
        this.e = q63Var2;
        this.f = s63Var;
        this.g = q63Var3;
        this.h = q63Var4;
        this.i = q63Var5;
        this.j = q63Var6;
    }
}
