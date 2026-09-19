package defpackage;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class co1 implements r63 {
    public final v63 a;
    public final v63 b;
    public final do1 c;
    public final do1 d;
    public final tz0 e;
    public final v63 f;
    public final q63 g;
    public final q63 h;
    public final q63 i;
    public final ti1 j;
    public final v63 k;
    public final yj1 l;
    public final q63 m;
    public final q63 n;
    public final v63 o;
    public final q63 p;
    public final v63 q;
    public final v63 r;
    public final v63 s;
    public final q63 t;
    public final v63 u;
    public final q63 v;
    public final q63 w;
    public final q63 x;
    public final q63 y;

    public co1(q63 q63Var, wn1 wn1Var, do1 do1Var, do1 do1Var2, tz0 tz0Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, q63 q63Var5, ti1 ti1Var, ef1 ef1Var, yj1 yj1Var, q63 q63Var6, q63 q63Var7, q63 q63Var8, q63 q63Var9, q63 q63Var10, q63 q63Var11, q63 q63Var12, q63 q63Var13, q63 q63Var14, q63 q63Var15, q63 q63Var16, q63 q63Var17, q63 q63Var18) {
        this.a = q63Var;
        this.b = wn1Var;
        this.c = do1Var;
        this.d = do1Var2;
        this.e = tz0Var;
        this.f = q63Var2;
        this.g = q63Var3;
        this.h = q63Var4;
        this.i = q63Var5;
        this.j = ti1Var;
        this.k = ef1Var;
        this.l = yj1Var;
        this.m = q63Var6;
        this.n = q63Var7;
        this.o = q63Var8;
        this.p = q63Var9;
        this.q = q63Var10;
        this.r = q63Var11;
        this.s = q63Var12;
        this.t = q63Var13;
        this.u = q63Var14;
        this.v = q63Var15;
        this.w = q63Var16;
        this.x = q63Var17;
        this.y = q63Var18;
    }

    @Override // defpackage.v63
    public final Object c() {
        Context context = (Context) this.a.c();
        wo1 wo1Var = (wo1) ((wn1) this.b).a.g;
        dq.D(wo1Var);
        JSONObject jSONObject = (JSONObject) this.c.b.g;
        dq.D(jSONObject);
        uq1 uq1Var = (uq1) this.d.b.h;
        dq.D(uq1Var);
        ro1 ro1VarA = this.e.a();
        zq0 zq0Var = (zq0) this.f.c();
        kk1 kk1Var = (kk1) this.g.c();
        ak1 ak1Var = (ak1) this.h.c();
        ym1 ym1Var = (ym1) this.i.c();
        x42 x42VarA = this.j.a();
        d60 d60VarA = ((ef1) this.k).a();
        i52 i52VarA = this.l.a();
        ih1 ih1Var = (ih1) this.m.c();
        ep1 ep1Var = (ep1) this.n.c();
        ae aeVar = (ae) this.o.c();
        xm1 xm1Var = (xm1) this.p.c();
        f82 f82Var = (f82) this.q.c();
        d72 d72Var = (d72) this.r.c();
        hw1 hw1Var = (hw1) this.s.c();
        mr1 mr1Var = (mr1) this.t.c();
        cp1 cp1Var = (cp1) this.u.c();
        il1 il1Var = (il1) this.v.c();
        vs0 vs0Var = (vs0) this.w.c();
        return new bo1(context, wo1Var, jSONObject, uq1Var, ro1VarA, zq0Var, kk1Var, ak1Var, ym1Var, x42VarA, d60VarA, i52VarA, ih1Var, ep1Var, aeVar, xm1Var, f82Var, d72Var, hw1Var, mr1Var, cp1Var, il1Var, vs0Var, (oj1) this.y.c());
    }
}
