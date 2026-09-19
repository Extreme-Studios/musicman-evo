package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class th1 implements r63 {
    public final /* synthetic */ int a = 2;
    public final v63 b;
    public final v63 c;
    public final v63 d;
    public final v63 e;
    public final v63 f;
    public final v63 g;
    public final v63 h;
    public final v63 i;
    public final v63 j;
    public final v63 k;

    public th1(wi1 wi1Var, q63 q63Var, wh1 wh1Var, wh1 wh1Var2, wh1 wh1Var3, wh1 wh1Var4, wn1 wn1Var, q63 q63Var2, q12 q12Var, q63 q63Var3) {
        this.f = wi1Var;
        this.b = q63Var;
        this.g = wh1Var;
        this.h = wh1Var2;
        this.i = wh1Var3;
        this.j = wh1Var4;
        this.d = wn1Var;
        this.c = q63Var2;
        this.k = q12Var;
        this.e = q63Var3;
    }

    public sh1 a() {
        nm0 nm0VarA = ((wi1) this.f).a();
        Context context = (Context) this.b.c();
        y42 y42Var = (y42) ((wh1) this.g).b.i;
        dq.D(y42Var);
        View view = (View) ((wh1) this.h).b.h;
        dq.D(view);
        md1 md1Var = (md1) ((wh1) this.i).b.j;
        li1 li1Var = (li1) ((wh1) this.j).b.g;
        wo1 wo1Var = (wo1) ((wn1) this.d).a.g;
        dq.D(wo1Var);
        return new sh1(nm0VarA, context, y42Var, view, md1Var, li1Var, wo1Var, (an1) ((q63) this.c).c(), q63.b((q12) this.k), (Executor) this.e.c());
    }

    public ru1 b() {
        if1 if1Var = (if1) this.b.c();
        Context contextA = ((xe1) this.d).a();
        d60 d60VarA = ((ef1) this.e).a();
        i52 i52VarA = ((yj1) this.f).a();
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        return new ru1(if1Var, contextA, d60VarA, i52VarA, ya1Var, (String) ((r63) this.g).c(), (d72) ((q63) this.c).c(), (cs1) ((q63) this.h).c(), new zf0(15), (ScheduledExecutorService) this.i.c(), (f82) this.j.c(), new ol1(((bk1) this.k).b.c()));
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.c;
        v63 v63Var2 = this.j;
        v63 v63Var3 = this.i;
        v63 v63Var4 = this.k;
        v63 v63Var5 = this.h;
        v63 v63Var6 = this.g;
        v63 v63Var7 = this.f;
        v63 v63Var8 = this.e;
        v63 v63Var9 = this.d;
        v63 v63Var10 = this.b;
        switch (i) {
            case 0:
                return a();
            case 1:
                return new hq1(((yj1) v63Var7).a(), (Executor) v63Var10.c(), (jr1) ((q63) v63Var).c(), (Context) ((q63) v63Var6).c(), (es1) v63Var9.c(), (f82) v63Var8.c(), (bw1) v63Var5.c(), (xq1) ((q63) v63Var3).c(), (cs1) ((q63) v63Var2).c(), (os1) v63Var4.c());
            case 2:
                return new wq1((ak1) ((q63) v63Var).c(), (ok1) ((q63) v63Var7).c(), (bl1) v63Var10.c(), (gl1) ((q63) v63Var6).c(), (zl1) v63Var9.c(), (ym1) ((q63) v63Var5).c(), (es1) v63Var8.c(), (f82) v63Var3.c(), (bw1) v63Var2.c(), (sg1) ((q63) v63Var4).c());
            case 3:
                return b();
            case 4:
                return d();
            default:
                return new qe2((ya1) v63Var10.c(), (re2) v63Var9.c(), (cf2) v63Var8.c(), (dd2) ((s63) v63Var7).a, (String) ((s63) v63Var6).a, (hp0) ((s63) v63Var5).a, (w63) v63Var3, (w63) v63Var2, (w63) v63Var, (dh2) v63Var4.c());
        }
    }

    public ey1 d() {
        return new ey1((if1) this.b.c(), ((wj1) this.f).b.b(), ((az1) this.d).b, ((jm1) this.e).b, (un1) ((tz0) this.g).b, (nl1) ((ji1) this.h).a.g, (ViewGroup) ((kc2) ((tz0) this.i).b).g, (am1) ((q63) this.c).c(), (hy1) ((q63) this.j).c(), (yw1) ((q63) this.k).c());
    }

    public th1(yj1 yj1Var, v63 v63Var, q63 q63Var, q63 q63Var2, v63 v63Var2, v63 v63Var3, v63 v63Var4, q63 q63Var3, q63 q63Var4, v63 v63Var5) {
        this.f = yj1Var;
        this.b = v63Var;
        this.c = q63Var;
        this.g = q63Var2;
        this.d = v63Var2;
        this.e = v63Var3;
        this.h = v63Var4;
        this.i = q63Var3;
        this.j = q63Var4;
        this.k = v63Var5;
    }

    public th1(q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, q63 q63Var5, q63 q63Var6, q63 q63Var7, q63 q63Var8, q63 q63Var9, q63 q63Var10) {
        this.c = q63Var;
        this.f = q63Var2;
        this.b = q63Var3;
        this.g = q63Var4;
        this.d = q63Var5;
        this.h = q63Var6;
        this.e = q63Var7;
        this.i = q63Var8;
        this.j = q63Var9;
        this.k = q63Var10;
    }

    public th1(q63 q63Var, q63 q63Var2, q63 q63Var3, s63 s63Var, s63 s63Var2, s63 s63Var3, w63 w63Var, w63 w63Var2, w63 w63Var3, q63 q63Var4) {
        this.b = q63Var;
        this.d = q63Var2;
        this.e = q63Var3;
        this.f = s63Var;
        this.g = s63Var2;
        this.h = s63Var3;
        this.i = w63Var;
        this.j = w63Var2;
        this.c = w63Var3;
        this.k = q63Var4;
    }

    public th1(v63 v63Var, wj1 wj1Var, az1 az1Var, jm1 jm1Var, tz0 tz0Var, ji1 ji1Var, tz0 tz0Var2, q63 q63Var, q63 q63Var2, q63 q63Var3) {
        this.b = v63Var;
        this.f = wj1Var;
        this.d = az1Var;
        this.e = jm1Var;
        this.g = tz0Var;
        this.h = ji1Var;
        this.i = tz0Var2;
        this.c = q63Var;
        this.j = q63Var2;
        this.k = q63Var3;
    }

    public th1(v63 v63Var, v63 v63Var2, v63 v63Var3, yj1 yj1Var, r63 r63Var, q63 q63Var, q63 q63Var2, v63 v63Var4, v63 v63Var5, bk1 bk1Var) {
        this.b = v63Var;
        this.d = v63Var2;
        this.e = v63Var3;
        this.f = yj1Var;
        this.g = r63Var;
        this.c = q63Var;
        this.h = q63Var2;
        this.i = v63Var4;
        this.j = v63Var5;
        this.k = bk1Var;
    }
}
