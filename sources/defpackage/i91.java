package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i91 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final v63 c;
    public final v63 d;

    public i91(s63 s63Var, q63 q63Var, s63 s63Var2) {
        this.a = 29;
        this.b = s63Var;
        this.d = q63Var;
        this.c = s63Var2;
    }

    public kd0 a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.c();
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        ya1 ya1Var2 = za1.b;
        dq.D(ya1Var2);
        Context contextA = ((xe1) ((eg1) this.c).b).a();
        dq.D(ya1Var);
        return new kd0(scheduledExecutorService, ya1Var, ya1Var2, new su1(contextA, ya1Var, 1), q63.b((u91) this.d), 5);
    }

    public y91 b() {
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        aq1 aq1VarA = ((bq1) this.b).c();
        da1 da1Var = (da1) this.c;
        dq.D(ya1Var);
        return new y91(ya1Var, aq1VarA, new p83(ya1Var, ((bq1) da1Var.b).c(), (cs1) ((q63) da1Var.c).c(), 15), (cs1) ((q63) this.d).c(), 10, false);
    }

    @Override // defpackage.v63
    public final Object c() {
        Set setSingleton;
        switch (this.a) {
            case 0:
                h73 h73Var = (h73) ((s63) this.c).a;
                return new h91(h73Var);
            case 1:
                d60 d60VarA = ((ef1) this.b).a();
                JSONObject jSONObject = (JSONObject) ((q63) this.c).c();
                String str = (String) ((r63) this.d).c();
                boolean zEquals = "native".equals(str);
                zb3 zb3Var = vc3.C.c;
                return new ot0(UUID.randomUUID().toString(), d60VarA, str, jSONObject, zEquals);
            case 2:
                return new ai1((md1) ((wh1) this.b).b.j, (es1) this.c.c(), ((ti1) this.d).a());
            case 3:
                Context context = (Context) this.b.c();
                d60 d60VarA2 = ((ef1) this.c).a();
                x42 x42VarA = ((ti1) this.d).a();
                e91 e91Var = x42VarA.A;
                if (e91Var == null) {
                    return null;
                }
                b52 b52Var = x42VarA.s;
                return new d91(context, d60VarA2, e91Var, b52Var != null ? b52Var.b : null);
            case 4:
                gk1 gk1Var = new gk1(((bk1) this.b).b.c());
                Set setC = ((w63) this.c).c();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new ik1(gk1Var, setC, ya1Var, (ScheduledExecutorService) this.d.c());
            case 5:
                return new il1(((w63) this.b).c(), ((ti1) this.c).a(), ((ti1) this.d).b());
            case 6:
                return new xm1((Context) this.b.c(), ((w63) this.c).c(), ((ti1) this.d).a());
            case 7:
                ro1 ro1VarA = ((tz0) this.b).a();
                so1 so1Var = (so1) ((hj1) this.c).b.c();
                dq.D(so1Var);
                Executor executor = (Executor) this.d.c();
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                return new op1(ro1VarA, so1Var, executor, ya1Var2);
            case 8:
                return b();
            case 9:
                int i = ((yj1) this.d).a().p.g;
                if (i != 0) {
                    return i + (-1) != 0 ? ((dy0) this.c).b() : ((dy0) this.b).b();
                }
                throw null;
            case 10:
                String str2 = ((r71) ((j32) this.b).b.h).m;
                dq.D(str2);
                Context contextA = ((xe1) this.c).a();
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                Map mapC = ((t63) this.d).c();
                if (((Boolean) tu0.e.c.a(lx0.A5)).booleanValue()) {
                    cv0 cv0Var = new cv0(new qk(contextA, 4));
                    synchronized (cv0Var) {
                        if (cv0Var.c) {
                            try {
                                yw0 yw0Var = cv0Var.b;
                                yw0Var.b();
                                ((zw0) yw0Var.g).A(str2);
                            } catch (NullPointerException e) {
                                vc3.C.h.d("AdMobClearcutLogger.modify", e);
                            }
                        }
                        break;
                    }
                    setSingleton = Collections.singleton(new wm1(new yr1(cv0Var, mapC), ya1Var3));
                } else {
                    setSingleton = Collections.EMPTY_SET;
                }
                dq.D(setSingleton);
                return setSingleton;
            case 11:
                return new gs1((cs1) ((q63) this.b).c(), ((w63) this.c).c(), (ae) this.d.c());
            case 12:
                ya1 ya1Var4 = za1.a;
                dq.D(ya1Var4);
                id3 id3Var = (id3) this.b.c();
                yc ycVar = (yc) this.c;
                return new hs1(ya1Var4, id3Var, new xc((Context) ycVar.b.c(), (d60) ycVar.c.c()), new wo2(), ((xe1) this.d).a());
            case 13:
                Context contextA2 = ((xe1) this.b).a();
                WeakReference weakReference = ((we1) this.c).b.d;
                dq.D(weakReference);
                rt1 rt1Var = (rt1) ((q63) this.d).c();
                ya1 ya1Var5 = za1.a;
                dq.D(ya1Var5);
                return new xt1(contextA2, weakReference, rt1Var, ya1Var5);
            case 14:
                return a();
            case 15:
                return d();
            case 16:
                x91 x91Var = (x91) this.b;
                ya1 ya1Var6 = za1.a;
                dq.D(ya1Var6);
                k02 k02Var = new k02(ya1Var6, x91Var.b.a(), 2);
                ae aeVar = (ae) ((q63) this.c).c();
                dq.D(ya1Var6);
                return new b12(k02Var, ((Long) jy0.c.u()).longValue(), aeVar, ya1Var6, (es1) ((q63) this.d).c());
            case 17:
                Context contextA3 = ((x91) this.b).b.a();
                ya1 ya1Var7 = za1.a;
                dq.D(ya1Var7);
                k02 k02Var2 = new k02(contextA3, ya1Var7, 6);
                ae aeVar2 = (ae) ((q63) this.c).c();
                dq.D(ya1Var7);
                return new b12(k02Var2, 2147483647L, aeVar2, ya1Var7, (es1) ((q63) this.d).c());
            case 18:
                cf1 cf1Var = (cf1) this.b;
                ya1 ya1Var8 = za1.a;
                dq.D(ya1Var8);
                g02 g02Var = new g02(ya1Var8, cf1Var.b.a(), (zt1) cf1Var.c.c(), 4);
                ae aeVar3 = (ae) ((q63) this.c).c();
                dq.D(ya1Var8);
                return new b12(g02Var, ((Long) jy0.d.u()).longValue(), aeVar3, ya1Var8, (es1) ((q63) this.d).c());
            case 19:
                xz1 xz1Var = new xz1(0, ((xe1) ((zz1) this.b).a).a());
                ae aeVar4 = (ae) ((q63) this.c).c();
                ya1 ya1Var9 = za1.a;
                dq.D(ya1Var9);
                return new b12(xz1Var, 2147483647L, aeVar4, ya1Var9, (es1) ((q63) this.d).c());
            case 20:
                c02 c02VarA = ((n02) this.b).c();
                ae aeVar5 = (ae) ((q63) this.c).c();
                ya1 ya1Var10 = za1.a;
                dq.D(ya1Var10);
                return new b12(c02VarA, ((Long) jy0.a.u()).longValue(), aeVar5, ya1Var10, (es1) ((q63) this.d).c());
            case zw0.zzm /* 21 */:
                c02 c02VarC = ((t02) this.b).c();
                ae aeVar6 = (ae) ((q63) this.c).c();
                ya1 ya1Var11 = za1.a;
                dq.D(ya1Var11);
                return new b12(c02VarC, 2147483647L, aeVar6, ya1Var11, (es1) ((q63) this.d).c());
            case 22:
                k02 k02VarC = ((x02) this.b).c();
                ae aeVar7 = (ae) ((q63) this.c).c();
                ya1 ya1Var12 = za1.a;
                dq.D(ya1Var12);
                return new b12(k02VarC, ((Long) jy0.b.u()).longValue(), aeVar7, ya1Var12, (es1) ((q63) this.d).c());
            case 23:
                c02 c02VarC2 = ((o12) this.b).c();
                ae aeVar8 = (ae) ((q63) this.c).c();
                ya1 ya1Var13 = za1.a;
                dq.D(ya1Var13);
                return new b12(c02VarC2, ((Long) jy0.e.u()).longValue(), aeVar8, ya1Var13, (es1) ((q63) this.d).c());
            case 24:
                g02 g02VarC = ((v12) this.b).c();
                ae aeVar9 = (ae) ((q63) this.c).c();
                ya1 ya1Var14 = za1.a;
                dq.D(ya1Var14);
                return new b12(g02VarC, 2147483647L, aeVar9, ya1Var14, (es1) ((q63) this.d).c());
            case 25:
                a02 a02VarC = ((h22) this.b).c();
                ae aeVar10 = (ae) ((q63) this.c).c();
                ya1 ya1Var15 = za1.a;
                dq.D(ya1Var15);
                return new b12(a02VarC, ((Long) jy0.g.u()).longValue(), aeVar10, ya1Var15, (es1) ((q63) this.d).c());
            case 26:
                k02 k02VarC2 = ((t22) this.b).c();
                ae aeVar11 = (ae) ((q63) this.c).c();
                ya1 ya1Var16 = za1.a;
                dq.D(ya1Var16);
                return new b12(k02VarC2, ((Long) jy0.h.u()).longValue(), aeVar11, ya1Var16, (es1) ((q63) this.d).c());
            case 27:
                return e();
            case 28:
                dq.D(((r71) ((j32) this.b).b.h).i);
                sa1 sa1Var = (sa1) this.c.c();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.c();
                ya1 ya1Var17 = za1.a;
                dq.D(ya1Var17);
                return new g02(sa1Var, scheduledExecutorService, ya1Var17);
            default:
                Context context2 = (Context) ((s63) this.b).a;
                return new bh2(context2, (ExecutorService) ((s63) this.c).a, bh2.g);
        }
    }

    public a02 d() {
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        return new a02(ya1Var, ((xe1) this.b).a(), ((yj1) this.c).a(), (ViewGroup) ((kc2) ((tz0) this.d).b).g, 0);
    }

    public a02 e() {
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        return new a02(ya1Var, (ViewGroup) ((kc2) ((tz0) this.b).b).g, (Context) ((q63) this.c).c(), ((w63) this.d).c());
    }

    public /* synthetic */ i91(v63 v63Var, v63 v63Var2, v63 v63Var3, int i) {
        this.a = i;
        this.b = v63Var;
        this.c = v63Var2;
        this.d = v63Var3;
    }
}
