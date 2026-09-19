package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class oo1 implements r63 {
    public final wi1 a;
    public final v63 b;
    public final tz0 c;
    public final r63 d;
    public final bp1 e;
    public final v63 f;
    public final v63 g;
    public final q63 h;
    public final q63 i;
    public final q63 j;
    public final q63 k;
    public final q63 l;
    public final xo1 m;
    public final v63 n;
    public final v63 o;
    public final v63 p;
    public final q63 q;
    public final q63 r;
    public final v63 s;

    public oo1(wi1 wi1Var, q63 q63Var, tz0 tz0Var, r63 r63Var, bp1 bp1Var, v63 v63Var, wn1 wn1Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, q63 q63Var5, q63 q63Var6, xo1 xo1Var, q63 q63Var7, ef1 ef1Var, xe1 xe1Var, q63 q63Var8, q63 q63Var9, q63 q63Var10) {
        this.a = wi1Var;
        this.b = q63Var;
        this.c = tz0Var;
        this.d = r63Var;
        this.e = bp1Var;
        this.f = v63Var;
        this.g = wn1Var;
        this.h = q63Var2;
        this.i = q63Var3;
        this.j = q63Var4;
        this.k = q63Var5;
        this.l = q63Var6;
        this.m = xo1Var;
        this.n = q63Var7;
        this.o = ef1Var;
        this.p = xe1Var;
        this.q = q63Var8;
        this.r = q63Var9;
        this.s = q63Var10;
    }

    @Override // defpackage.v63
    public final Object c() {
        nm0 nm0VarA = this.a.a();
        Executor executor = (Executor) this.b.c();
        ro1 ro1VarA = this.c.a();
        uo1 uo1Var = (uo1) this.d.c();
        ap1 ap1VarA = this.e.a();
        to1 to1Var = (to1) this.f.c();
        wo1 wo1Var = (wo1) ((wn1) this.g).a.g;
        dq.D(wo1Var);
        o63 o63VarB = q63.b(this.h);
        o63 o63VarB2 = q63.b(this.i);
        o63 o63VarB3 = q63.b(this.j);
        o63 o63VarB4 = q63.b(this.k);
        o63 o63VarB5 = q63.b(this.l);
        xo1 xo1Var = this.m;
        z91 z91Var = new z91(((xe1) xo1Var.b).a(), xo1Var.c.a().g);
        zq0 zq0Var = (zq0) this.n.c();
        d60 d60VarA = ((ef1) this.o).a();
        Context contextA = ((xe1) this.p).a();
        po1 po1Var = (po1) this.q.c();
        oz1 oz1Var = (oz1) this.r.c();
        return new no1(nm0VarA, executor, ro1VarA, uo1Var, ap1VarA, to1Var, wo1Var, o63VarB, o63VarB2, o63VarB3, o63VarB4, o63VarB5, z91Var, zq0Var, d60VarA, contextA, po1Var, oz1Var);
    }
}
