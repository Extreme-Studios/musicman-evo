package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class u91 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final Object c;
    public final v63 d;
    public final v63 e;
    public final v63 f;

    public u91(xe1 xe1Var, ef1 ef1Var, q63 q63Var, x91 x91Var, q63 q63Var2) {
        this.a = 19;
        this.c = xe1Var;
        this.e = ef1Var;
        this.b = q63Var;
        this.f = x91Var;
        this.d = q63Var2;
    }

    public zj1 a() {
        return new zj1(((ti1) this.c).a(), (String) ((ti1) this.b).b.i, (yw1) this.d.c(), ((ti1) this.e).b.v(), (String) this.f.c());
    }

    public yv1 b() {
        return new yv1(((xe1) ((v63) this.c)).a(), ((tp0) this.d).a(), (wv1) ((q63) this.b).c(), ((da1) this.e).a(), ((ve1) this.f).c());
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.f;
        v63 v63Var2 = this.e;
        v63 v63Var3 = this.d;
        v63 v63Var4 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new ns0(((xe1) obj).a(), ((Long) ((q63) v63Var4).c()).longValue(), (PackageInfo) ((q63) v63Var3).c(), (uk1) ((q63) v63Var2).c(), (ScheduledExecutorService) ((q63) v63Var).c());
            case 1:
                return new fi1(((xe1) ((v63) obj)).a(), (md1) ((wh1) v63Var3).b.j, ((ti1) v63Var2).a(), ((ef1) v63Var).a(), (pw1) ((q63) v63Var4).c());
            case 2:
                kk1 kk1Var = (kk1) ((q63) v63Var4).c();
                x42 x42VarA = ((ti1) obj).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) v63Var2.c();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new nj1(kk1Var, x42VarA, scheduledExecutorService, ya1Var, (String) ((ti1) v63Var).b.i, (kl1) ((q63) v63Var3).c());
            case 3:
                return new qj1(((ti1) obj).b(), ((ti1) v63Var4).a(), (ae) v63Var3.c(), (es1) v63Var2.c(), (ScheduledExecutorService) v63Var.c());
            case 4:
                return a();
            case 5:
                return new qn1(((xe1) ((v63) obj)).a(), (md1) ((kn1) v63Var3).b.h, ((ti1) v63Var2).a(), ((ef1) v63Var).a(), (pw1) ((q63) v63Var4).c());
            case 6:
                zh1 zh1Var = (zh1) obj;
                z91 z91Var = new z91(((xe1) zh1Var.b).a(), ((yj1) zh1Var.c).a().g);
                Context contextA = ((xe1) v63Var4).a();
                aa1 aa1Var = (aa1) v63Var3.c();
                md1 md1Var = (md1) ((kn1) v63Var2).b.h;
                return new sn1(z91Var, contextA, aa1Var, md1Var == null ? null : md1Var.t(), (dv0) v63Var.c());
            case 7:
                Map mapC = ((t63) obj).c();
                Map mapC2 = ((t63) v63Var3).c();
                Map mapC3 = ((t63) v63Var2).c();
                wo1 wo1Var = (wo1) ((wn1) v63Var).a.g;
                dq.D(wo1Var);
                return new tn1(mapC, mapC2, mapC3, (q63) v63Var4, wo1Var);
            case 8:
                Context contextA2 = ((xe1) ((v63) obj)).a();
                String packageName = ((xe1) ((eg1) v63Var3).b).a().getPackageName();
                dq.D(packageName);
                d60 d60VarA = ((ef1) v63Var2).a();
                dv0 dv0Var = (dv0) v63Var.c();
                String str = (String) ((q63) v63Var4).c();
                cv0 cv0Var = new cv0(new qk(contextA2, 4));
                tv0 tv0VarA = uv0.A();
                int i2 = d60VarA.g;
                tv0VarA.b();
                ((uv0) tv0VarA.g).B(i2);
                int i3 = d60VarA.h;
                tv0VarA.b();
                ((uv0) tv0VarA.g).C(i3);
                int i4 = true != d60VarA.i ? 2 : 0;
                tv0VarA.b();
                ((uv0) tv0VarA.g).z(i4);
                cv0Var.a(new y91(dv0Var, packageName, (uv0) tv0VarA.c(), str, 11, false));
                return cv0Var;
            case 9:
                Context contextA3 = ((xe1) ((v63) obj)).a();
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                zf0 zf0Var = new zf0(15);
                if1 if1Var = (if1) ((df1) v63Var4).a.a;
                dq.D(if1Var);
                return new pv1(contextA3, ya1Var2, zf0Var, if1Var, new oc2(28, ((gf1) ((eg1) v63Var3).b).c()), (ArrayDeque) v63Var2.c(), (e72) v63Var.c());
            case 10:
                return b();
            case 11:
                return new pw1(((xe1) ((v63) obj)).a(), ((ef1) v63Var4).a(), ((ti1) v63Var3).a(), (md1) ((r63) v63Var2).c(), (es1) v63Var.c());
            case 12:
                return new mx1((Context) ((q63) v63Var4).c(), (Executor) ((v63) obj).c(), (sf1) ((s63) v63Var3).a, (w42) v63Var2.c(), (es1) v63Var.c());
            case 13:
                return new dy1((if1) ((v63) obj).c(), ((wj1) v63Var2).b.b(), ((jm1) v63Var).b, (hy1) ((q63) v63Var4).c(), (yw1) ((q63) v63Var3).c());
            case 14:
                ae aeVar = (ae) v63Var3.c();
                jy1 jy1Var = (jy1) v63Var2;
                r52 r52Var = new r52((q52) jy1Var.b.c(), (qr1) jy1Var.c.c(), (es1) jy1Var.d.c(), 22, false);
                yw1 yw1Var = (yw1) ((q63) v63Var4).c();
                f82 f82Var = (f82) v63Var.c();
                hy1 hy1Var = (hy1) ((zy1) obj).g;
                return hy1Var != null ? hy1Var : new hy1(aeVar, r52Var, yw1Var, f82Var);
            case 15:
                return new mx1((Context) ((q63) v63Var4).c(), (pf1) ((s63) obj).a, (u62) ((q63) v63Var3).c(), (ya1) v63Var2.c(), (ux0) ((az1) v63Var).b.g);
            case 16:
                return new iz1((Context) ((v63) obj).c(), (b11) ((vn1) v63Var4).a.h, ((yj1) v63Var3).a(), ((th1) ((tz0) v63Var2).b).a(), (es1) v63Var.c());
            case 17:
                ue0 ue0Var = new ue0(17);
                Context contextA4 = ((xe1) ((v63) obj)).a();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) v63Var4.c();
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                return new w22(ue0Var, contextA4, scheduledExecutorService2, ya1Var3, ((j32) v63Var3).b.g, ((r71) ((j32) v63Var2).b.h).q, ((r71) ((j32) v63Var).b.h).p);
            case 18:
                return new o42((Context) ((s63) obj).a, (Executor) v63Var2.c(), (if1) v63Var.c(), (nz1) ((q63) v63Var4).c(), (p42) ((q63) v63Var3).c(), new h52());
            case 19:
                return new u82(((xe1) obj).a(), ((ef1) v63Var2).a(), (ScheduledExecutorService) ((q63) v63Var4).c(), r52.y(((x91) v63Var).b.a()), (ae) ((q63) v63Var3).c());
            case 20:
                Context context = (Context) ((s63) obj).a;
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) ((q63) v63Var4).c();
                ExecutorService executorService = (ExecutorService) ((s63) v63Var2).a;
                gd2 gd2Var = (gd2) ((q63) v63Var3).c();
                vc2 vc2Var = (vc2) ((s63) v63Var).a;
                return new ud2(context, scheduledExecutorService3, executorService, gd2Var, new Random(), vc2Var.F().z(), vc2Var.F().B(), vc2Var.F().C(), vc2Var.F().A(), vc2Var.D(), vc2Var.A() - 1);
            case zw0.zzm /* 21 */:
                return new ie2(q63.b((q63) v63Var4), q63.b((q63) v63Var3), q63.b((q63) v63Var2), (ExecutorService) ((s63) obj).a, (dh2) ((q63) v63Var).c());
            case 22:
                return new je2((vc2) ((s63) obj).a, (ie2) ((q63) v63Var4).c(), (ud2) ((q63) v63Var3).c(), (ExecutorService) ((s63) v63Var).a, (dh2) ((q63) v63Var2).c());
            default:
                return new ef2((hp0) ((s63) obj).a, (cf2) v63Var4.c(), (Map) ((s63) v63Var3).a, (Context) v63Var2.c(), (dh2) v63Var.c());
        }
    }

    public /* synthetic */ u91(Object obj, v63 v63Var, r63 r63Var, q63 q63Var, v63 v63Var2, int i) {
        this.a = i;
        this.c = obj;
        this.d = v63Var;
        this.e = r63Var;
        this.b = q63Var;
        this.f = v63Var2;
    }

    public /* synthetic */ u91(xe1 xe1Var, r63 r63Var, r63 r63Var2, v63 v63Var, q63 q63Var, int i) {
        this.a = i;
        this.c = xe1Var;
        this.d = r63Var;
        this.e = r63Var2;
        this.f = v63Var;
        this.b = q63Var;
    }

    public /* synthetic */ u91(q63 q63Var, Object obj, Object obj2, v63 v63Var, v63 v63Var2, int i) {
        this.a = i;
        this.b = q63Var;
        this.c = obj;
        this.d = (v63) obj2;
        this.e = v63Var;
        this.f = v63Var2;
    }

    public u91(q63 q63Var, ti1 ti1Var, q63 q63Var2, ti1 ti1Var2, q63 q63Var3) {
        this.a = 2;
        this.b = q63Var;
        this.c = ti1Var;
        this.e = q63Var2;
        this.f = ti1Var2;
        this.d = q63Var3;
    }

    public u91(q63 q63Var, q63 q63Var2, q63 q63Var3, s63 s63Var, q63 q63Var4) {
        this.a = 21;
        this.b = q63Var;
        this.d = q63Var2;
        this.e = q63Var3;
        this.c = s63Var;
        this.f = q63Var4;
    }

    public u91(s63 s63Var, q63 q63Var, q63 q63Var2, s63 s63Var2, q63 q63Var3) {
        this.a = 22;
        this.c = s63Var;
        this.b = q63Var;
        this.d = q63Var2;
        this.f = s63Var2;
        this.e = q63Var3;
    }

    public u91(s63 s63Var, q63 q63Var, s63 s63Var2, q63 q63Var2, s63 s63Var3) {
        this.a = 20;
        this.c = s63Var;
        this.b = q63Var;
        this.e = s63Var2;
        this.d = q63Var2;
        this.f = s63Var3;
    }

    public /* synthetic */ u91(s63 s63Var, v63 v63Var, r63 r63Var, q63 q63Var, q63 q63Var2, int i) {
        this.a = i;
        this.c = s63Var;
        this.e = v63Var;
        this.f = r63Var;
        this.b = q63Var;
        this.d = q63Var2;
    }

    public u91(v63 v63Var, tp0 tp0Var, q63 q63Var, da1 da1Var, v63 v63Var2) {
        this.a = 10;
        this.c = v63Var;
        this.d = tp0Var;
        this.b = q63Var;
        this.e = da1Var;
        this.f = v63Var2;
    }

    public /* synthetic */ u91(v63 v63Var, v63 v63Var2, v63 v63Var3, v63 v63Var4, v63 v63Var5, int i) {
        this.a = i;
        this.c = v63Var;
        this.b = v63Var2;
        this.d = v63Var3;
        this.e = v63Var4;
        this.f = v63Var5;
    }
}
