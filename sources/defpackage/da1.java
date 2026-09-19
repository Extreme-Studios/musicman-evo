package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class da1 implements r63 {
    public final /* synthetic */ int a;
    public final Object b;
    public final v63 c;

    public /* synthetic */ da1(Object obj, v63 v63Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = v63Var;
    }

    public us2 a() {
        return new us2(new uv1(((xe1) ((eg1) this.b).b).a()), (ya1) this.c.c(), 19, false);
    }

    @Override // defpackage.v63
    public final Object c() {
        View view;
        switch (this.a) {
            case 0:
                Context context = (Context) ((s63) this.b).a;
                j91 j91Var = (j91) this.c;
                return new ca1(context, new z61((ae) j91Var.c.a, 13, (h91) j91Var.b.c()));
            case 1:
                return new vg2(((t63) this.b).c(), 12, ((t63) this.c).c());
            case 2:
                return ((y91) this.b).E(((w63) this.c).c());
            case 3:
                return new t12(((i91) this.b).d(), ((Integer) tu0.e.c.a(lx0.kd)).intValue(), (ScheduledExecutorService) this.c.c());
            case 4:
                return new t12(new xz1(2, ((er1) this.b).b.a()), ((Integer) tu0.e.c.a(lx0.pd)).intValue(), (ScheduledExecutorService) this.c.c());
            case 5:
                return new t12(((i91) this.b).e(), ((Integer) tu0.e.c.a(lx0.ld)).intValue(), (ScheduledExecutorService) this.c.c());
            case 6:
                Boolean bool = (Boolean) tu0.e.c.a(lx0.a6);
                bool.booleanValue();
                return true == bool.booleanValue() ? ((th1) this.b).d() : ((dy0) this.c).b();
            case 7:
                return new bi1((md1) ((wh1) this.b).b.j, (Executor) this.c.c());
            case 8:
                String str = (String) ((q63) this.c).c();
                yw1 yw1Var = (yw1) ((uj1) this.b).f;
                return yw1Var != null ? yw1Var : new yw1(str);
            case 9:
                ((xe1) this.c).a();
                Context context2 = ((uj1) this.b).a;
                dq.D(context2);
                return context2;
            case 10:
                Set setC = ((w63) this.c).c();
                im1 im1Var = (im1) this.b;
                if (im1Var.p == null) {
                    im1Var.p = new dk1(setC);
                }
                dk1 dk1Var = im1Var.p;
                dq.D(dk1Var);
                return dk1Var;
            case 11:
                return new hn1((nr1) ((v63) this.b).c(), ((ti1) this.c).b.v());
            case 12:
                Set setU = ((us2) this.b).u((nj1) ((q63) this.c).c());
                dq.D(setU);
                return setU;
            case 13:
                return new wm1(new uh1(1, (md1) ((us2) this.b).h), (Executor) this.c.c());
            case 14:
                x42 x42VarA = ((ti1) this.b).a();
                JSONObject jSONObject = (JSONObject) ((do1) this.c).b.g;
                dq.D(jSONObject);
                return new so1(x42VarA, jSONObject);
            case 15:
                return new wm1(new ar1(((ho1) this.b).b.a()), (Executor) this.c.c());
            case 16:
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new p83(ya1Var, ((bq1) this.b).c(), (cs1) ((q63) this.c).c(), 15);
            case 17:
                no1 no1Var = (no1) ((q12) this.b).c();
                ro1 ro1VarA = ((tz0) this.c).a();
                kq1 kq1Var = new kq1("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                synchronized (ro1VarA) {
                    view = ro1VarA.o;
                }
                kq1Var.f = view;
                kq1Var.g = ro1VarA.r();
                kq1Var.h = no1Var;
                kq1Var.i = false;
                kq1Var.j = false;
                if (ro1VarA.h() != null) {
                    ro1VarA.h().S0(kq1Var);
                }
                return kq1Var;
            case 18:
                return new br1((ok1) ((q63) this.b).c(), ((ti1) this.c).a());
            case 19:
                return new rr1(r52.y(((x91) this.b).b.a()), (qr1) ((q63) this.c).c());
            case 20:
                return new yr1((cv0) ((q63) this.b).c(), ((t63) this.c).c());
            case zw0.zzm /* 21 */:
                return new ss1((qf1) ((s63) this.b).a, new kc2(24, (j21) ((rs1) this.c).b.a));
            case 22:
                ya1 ya1Var2 = za1.b;
                dq.D(ya1Var2);
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                return new u40(ya1Var2, ya1Var3, new su1((Context) ((jt1) this.b).b.c(), ya1Var3, 0), q63.b((u91) this.c), 12, false);
            case 23:
                Map map = ((u63) this.b).a;
                ya1 ya1Var4 = za1.a;
                dq.D(ya1Var4);
                return new bv1(map, ya1Var4, new ol1(((bk1) this.c).b.c()));
            case 24:
                ya1 ya1Var5 = za1.a;
                dq.D(ya1Var5);
                return new r52(ya1Var5, ((eg1) this.b).a(), q63.b((u91) this.c), 18, false);
            case 25:
                return a();
            case 26:
                return new vv1(((u91) this.b).b(), ((ve1) this.c).c());
            case 27:
                return new xv1(((da1) this.b).a(), ((ve1) this.c).c());
            case 28:
                wv1 wv1Var = (wv1) ((q63) this.b).c();
                da1 da1Var = (da1) this.c;
                return new yr1(wv1Var, new xv1(((da1) da1Var.b).a(), ((ve1) da1Var.c).c()));
            default:
                return new t12(((mj1) this.b).a(), ((Integer) tu0.e.c.a(lx0.hd)).intValue(), (ScheduledExecutorService) this.c.c());
        }
    }
}
