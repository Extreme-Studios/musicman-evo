package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bp1 implements r63 {
    public final /* synthetic */ int a = 1;
    public final q63 b;
    public final v63 c;
    public final v63 d;
    public final v63 e;
    public final v63 f;
    public final v63 g;
    public final v63 h;
    public final v63 i;

    public bp1(ve1 ve1Var, yj1 yj1Var, v63 v63Var, tz0 tz0Var, r63 r63Var, r63 r63Var2, q63 q63Var, q63 q63Var2) {
        this.c = ve1Var;
        this.f = yj1Var;
        this.d = v63Var;
        this.g = tz0Var;
        this.h = r63Var;
        this.i = r63Var2;
        this.e = q63Var;
        this.b = q63Var2;
    }

    public ap1 a() {
        h73 h73VarC = ((ve1) this.c).c();
        i52 i52VarA = ((yj1) this.f).a();
        to1 to1Var = (to1) this.d.c();
        ro1 ro1VarA = ((tz0) this.g).a();
        jp1 jp1Var = (jp1) ((r63) this.h).c();
        mp1 mp1Var = (mp1) ((r63) this.i).c();
        Executor executor = (Executor) this.e.c();
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        return new ap1(h73VarC, i52VarA, to1Var, ro1VarA, jp1Var, mp1Var, executor, ya1Var, (po1) this.b.c());
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.e;
        v63 v63Var2 = this.d;
        v63 v63Var3 = this.c;
        v63 v63Var4 = this.i;
        v63 v63Var5 = this.h;
        v63 v63Var6 = this.g;
        q63 q63Var = this.b;
        v63 v63Var7 = this.f;
        switch (i) {
            case 0:
                return a();
            case 1:
                return new sq1((ak1) q63Var.c(), (ok1) ((q63) v63Var).c(), (bl1) v63Var3.c(), (gl1) ((q63) v63Var7).c(), (zl1) v63Var2.c(), ((ti1) v63Var6).a(), ((ti1) v63Var5).b.v(), (sg1) ((q63) v63Var4).c());
            case 2:
                return new qt1((rt1) q63Var.c(), (yt1) ((q63) v63Var3).c(), (gt1) ((q63) v63Var2).c(), ((xe1) v63Var).a(), ((ef1) v63Var7).a(), (mt1) ((q63) v63Var6).c(), (xt1) ((q63) v63Var5).c(), new a71(), new a71(), ((af1) v63Var4).c());
            default:
                return new u42((String) ((s63) v63Var7).a, (s42) q63Var.c(), (Context) ((s63) v63Var6).a, (p42) ((q63) v63Var5).c(), (f52) ((q63) v63Var4).c(), ((ef1) v63Var3).a(), (zq0) v63Var2.c(), (es1) v63Var.c());
        }
    }

    public bp1(q63 q63Var, q63 q63Var2, q63 q63Var3, xe1 xe1Var, ef1 ef1Var, q63 q63Var4, q63 q63Var5, af1 af1Var) {
        this.b = q63Var;
        this.c = q63Var2;
        this.d = q63Var3;
        this.e = xe1Var;
        this.f = ef1Var;
        this.g = q63Var4;
        this.h = q63Var5;
        this.i = af1Var;
    }

    public bp1(q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, q63 q63Var5, ti1 ti1Var, ti1 ti1Var2, q63 q63Var6) {
        this.b = q63Var;
        this.e = q63Var2;
        this.c = q63Var3;
        this.f = q63Var4;
        this.d = q63Var5;
        this.g = ti1Var;
        this.h = ti1Var2;
        this.i = q63Var6;
    }

    public bp1(s63 s63Var, q63 q63Var, s63 s63Var2, q63 q63Var2, q63 q63Var3, ef1 ef1Var, q63 q63Var4, q63 q63Var5) {
        this.f = s63Var;
        this.b = q63Var;
        this.g = s63Var2;
        this.h = q63Var2;
        this.i = q63Var3;
        this.c = ef1Var;
        this.d = q63Var4;
        this.e = q63Var5;
    }
}
