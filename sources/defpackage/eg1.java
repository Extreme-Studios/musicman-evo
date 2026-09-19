package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class eg1 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;

    public /* synthetic */ eg1(v63 v63Var, int i) {
        this.a = i;
        this.b = v63Var;
    }

    public zu1 a() {
        Context contextA = ((xe1) this.b).a();
        zu1 zu1Var = new zu1();
        zu1Var.m = 1;
        zu1Var.k = new vu0(contextA, vc3.C.t.c(), zu1Var, zu1Var, 2);
        return zu1Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        Object ck2Var;
        int i = this.a;
        int i2 = 1;
        v63 v63Var = this.b;
        switch (i) {
            case 0:
                return new n11(((xe1) v63Var).a());
            case 1:
                return new gg1(((ve1) v63Var).c(), 0);
            case 2:
                return new gg1(((ve1) v63Var).c(), 1);
            case 3:
                return new jg1((qt1) v63Var.c(), 0);
            case 4:
                return new lg1(0, (qt1) v63Var.c());
            case 5:
                return new ng1(((xe1) v63Var).a());
            case 6:
                return new kg1(i2, (w42) v63Var.c());
            case 7:
                y91 y91VarV = y91.v(((dg1) v63Var).a.a());
                return new lg1(1, new z61((ae) y91VarV.g, 13, (h91) ((q63) y91VarV.i).c()));
            case 8:
                return new jg1((qt1) v63Var.c(), 1);
            case 9:
                return new d41(((a41) v63Var.c()).a);
            case 10:
                return new wm1(new uh1(0, (nl1) ((ji1) v63Var).a.g), za1.g);
            case 11:
                return new wm1((dj1) v63Var.c(), za1.g);
            case 12:
                return new wm1((dj1) v63Var.c(), za1.g);
            case 13:
                return ((rh1) v63Var).c();
            case 14:
                d60 d60VarA = ((ef1) v63Var).a();
                zb3 zb3Var = vc3.C.c;
                return new ot0(UUID.randomUUID().toString(), d60VarA, "native", new JSONObject(), true);
            case 15:
                String packageName = ((xe1) v63Var).a().getPackageName();
                dq.D(packageName);
                return packageName;
            case 16:
                Context contextA = ((xe1) v63Var).a();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new su1(contextA, ya1Var, 1);
            case 17:
                return a();
            case 18:
                return new oc2(28, ((gf1) v63Var).c());
            case 19:
                return new uv1(((xe1) v63Var).a());
            case 20:
                return new rw1(((xe1) v63Var).a());
            case zw0.zzm /* 21 */:
                return new sw1(((xe1) v63Var).a());
            case 22:
                return new cz1((rr1) v63Var.c());
            case 23:
                return new nz1((es1) v63Var.c());
            case 24:
                return new xz1(1, (Set) v63Var.c());
            case 25:
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                return new k02(ya1Var2, ((xe1) v63Var).a(), 0);
            case 26:
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                c12 c12Var = new c12(ya1Var3, 0);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) v63Var.c();
                ix0 ix0Var = lx0.x4;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    t12 t12Var = new t12(c12Var, ((Integer) tu0Var.c.a(lx0.y4)).intValue(), scheduledExecutorService);
                    int i3 = bk2.h;
                    ck2Var = new ck2(t12Var);
                } else {
                    int i4 = bk2.h;
                    ck2Var = wk2.o;
                }
                dq.D(ck2Var);
                return ck2Var;
            case 27:
                ya1 ya1Var4 = za1.a;
                dq.D(ya1Var4);
                return new t12(new c12(ya1Var4, 1), ((Integer) tu0.e.c.a(lx0.Zc)).intValue(), (ScheduledExecutorService) v63Var.c());
            case 28:
                Context contextA2 = ((xe1) v63Var).a();
                ya1 ya1Var5 = za1.a;
                dq.D(ya1Var5);
                return new k02(contextA2, ya1Var5, 3);
            default:
                ya1 ya1Var6 = za1.a;
                dq.D(ya1Var6);
                return new k02(ya1Var6, ((xe1) v63Var).a(), 4);
        }
    }
}
