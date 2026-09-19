package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class yn1 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final v63 c;
    public final v63 d;
    public final v63 e;
    public final v63 f;
    public final v63 g;

    public yn1(xe1 xe1Var, q63 q63Var, v63 v63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4) {
        this.a = 10;
        this.c = xe1Var;
        this.d = q63Var;
        this.b = v63Var;
        this.e = q63Var2;
        this.f = q63Var3;
        this.g = q63Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        v63 v63Var = this.d;
        v63 v63Var2 = this.g;
        v63 v63Var3 = this.f;
        v63 v63Var4 = this.e;
        v63 v63Var5 = this.c;
        v63 v63Var6 = this.b;
        switch (i) {
            case 0:
                if1 if1Var = (if1) v63Var6.c();
                uj1 uj1VarB = ((wj1) v63Var4).b.b();
                im1 im1Var = ((jm1) v63Var3).b;
                un1 un1Var = (un1) ((tz0) v63Var2).b;
                nl1 nl1VarC = ((rh1) v63Var5).c();
                hy1 hy1Var = (hy1) ((q63) v63Var).c();
                if1 if1Var2 = if1Var.b;
                uj1 uj1Var = new uj1(uj1VarB);
                zy1 zy1Var = null;
                zy1 zy1Var2 = new zy1(i2, zy1Var);
                un1 un1Var2 = new un1(nl1VarC, 13, zy1Var);
                kc2 kc2Var = new kc2(19, zy1Var);
                int i3 = 29;
                if (((Boolean) tu0.e.c.a(lx0.Y3)).booleanValue()) {
                    zy1Var = new zy1(i3, (boolean) (objArr2 == true ? 1 : 0));
                    zy1Var.g = hy1Var;
                }
                dq.F(im1Var, im1.class);
                if (zy1Var == null) {
                    zy1Var = new zy1(i3, (boolean) (objArr == true ? 1 : 0));
                }
                dq.F(un1Var, un1.class);
                oi1 oi1Var = (oi1) new pf1(if1Var2, kc2Var, un1Var, new fl1(17), im1Var, uj1Var, zy1Var, zy1Var2, un1Var2, null, null).q.c();
                dq.D(oi1Var);
                return oi1Var;
            case 1:
                Context contextA = ((xe1) v63Var6).a();
                i52 i52VarA = ((yj1) v63Var4).a();
                da1 da1Var = (da1) v63Var3;
                ya1 ya1Var = za1.b;
                dq.D(ya1Var);
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                u40 u40Var = new u40(ya1Var, ya1Var2, new su1((Context) ((jt1) da1Var.b).b.c(), ya1Var2, 0), q63.b((u91) da1Var.c), 12, false);
                dq.D(ya1Var2);
                return new qu1(contextA, i52VarA, u40Var, ya1Var2, (ScheduledExecutorService) v63Var5.c(), (wv1) ((q63) v63Var).c(), (d72) ((q63) v63Var2).c());
            case 2:
                return new by1((if1) v63Var6.c(), (un1) ((tz0) v63Var2).b, ((wj1) v63Var4).b.b(), ((jm1) v63Var3).b, (hy1) ((q63) v63Var).c(), (yw1) ((q63) v63Var5).c());
            case 3:
                return new by1((if1) v63Var6.c(), ((wj1) v63Var4).b.b(), ((az1) v63Var5).b, ((jm1) v63Var3).b, (hy1) ((q63) v63Var).c(), (yw1) ((q63) v63Var2).c());
            case 4:
                return new by1((if1) v63Var6.c(), ((wj1) v63Var4).b.b(), ((jm1) v63Var3).b, (f52) ((wj1) v63Var5).b.d, (hy1) ((q63) v63Var).c(), (yw1) ((q63) v63Var2).c());
            case 5:
                h73 h73VarA = ((ve1) v63Var6).c();
                Context contextA2 = ((xe1) v63Var5).a();
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                return new u22(h73VarA, contextA2, ya1Var3, (ScheduledExecutorService) v63Var4.c(), new sw1(((xe1) ((eg1) v63Var3).b).a()), ((yj1) v63Var2).a(), ((ef1) v63Var).a());
            case 6:
                sa1 sa1Var = (sa1) v63Var6.c();
                boolean z = ((r71) ((j32) v63Var4).b.h).p;
                ya1 ya1Var4 = za1.a;
                dq.D(ya1Var4);
                dq.D(((r71) ((j32) v63Var3).b.h).i);
                return new k32(sa1Var, z, ya1Var4, (ScheduledExecutorService) v63Var5.c(), ((j32) v63Var2).a().intValue(), ((r71) ((j32) v63Var).b.h).t);
            case 7:
                return new p32((Context) ((s63) v63Var4).a, (Executor) v63Var6.c(), (if1) v63Var5.c(), ((j42) v63Var3).a(), (o32) ((q63) v63Var).c(), new h52(), ((ef1) v63Var2).a());
            case 8:
                return new s42((Context) ((s63) v63Var4).a, (Executor) v63Var6.c(), (if1) v63Var5.c(), ((j42) v63Var3).a(), (p42) ((q63) v63Var).c(), new h52(), (f52) ((q63) v63Var2).c());
            case 9:
                return new o52((f82) v63Var6.c(), (c82) v63Var5.c(), ((ti1) v63Var4).a(), ((ti1) v63Var3).b.v(), (sg1) ((q63) v63Var).c(), (d72) v63Var2.c());
            case 10:
                Context contextA3 = ((xe1) v63Var5).a();
                ya1 ya1Var5 = za1.a;
                dq.D(ya1Var5);
                return new f82(contextA3, ya1Var5, (rn2) ((q63) v63Var).c(), (id3) v63Var6.c(), (c82) ((q63) v63Var4).c(), (e72) ((q63) v63Var3).c(), (se1) ((q63) v63Var2).c());
            case 11:
                return new tc2((nd2) ((q63) v63Var).c(), (je2) ((q63) v63Var6).c(), (tg2) ((q63) v63Var5).c(), (dh2) ((q63) v63Var4).c(), q63.b((q63) v63Var3), (vc2) ((s63) v63Var2).a);
            case 12:
                return new nf2((hp0) ((s63) v63Var4).a, (cf2) v63Var6.c(), (dd2) ((s63) v63Var3).a, (Context) ((s63) v63Var2).a, (Map) ((s63) v63Var).a, (dh2) v63Var5.c());
            case 13:
                return new hg2((fb2) ((q63) v63Var).c(), (ng2) ((q63) v63Var4).c(), (qg2) ((q63) v63Var3).c(), (dh2) v63Var6.c(), (ExecutorService) v63Var5.c(), (File) ((q63) v63Var2).c());
            default:
                return new lg2((Context) v63Var6.c(), (ExecutorService) v63Var5.c(), (vc2) v63Var4.c(), (gd2) v63Var3.c(), (dh2) v63Var2.c(), (mg2) ((q63) v63Var).c());
        }
    }

    public yn1(q63 q63Var, j32 j32Var, j32 j32Var2, q63 q63Var2, j32 j32Var3, j32 j32Var4) {
        this.a = 6;
        this.b = q63Var;
        this.e = j32Var;
        this.f = j32Var2;
        this.c = q63Var2;
        this.g = j32Var3;
        this.d = j32Var4;
    }

    public yn1(q63 q63Var, q63 q63Var2, ti1 ti1Var, ti1 ti1Var2, q63 q63Var3, q63 q63Var4) {
        this.a = 9;
        this.b = q63Var;
        this.c = q63Var2;
        this.e = ti1Var;
        this.f = ti1Var2;
        this.d = q63Var3;
        this.g = q63Var4;
    }

    public yn1(q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, q63 q63Var5, s63 s63Var) {
        this.a = 11;
        this.d = q63Var;
        this.b = q63Var2;
        this.c = q63Var3;
        this.e = q63Var4;
        this.f = q63Var5;
        this.g = s63Var;
    }

    public yn1(q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, s63 s63Var, q63 q63Var5) {
        this.a = 13;
        this.d = q63Var;
        this.e = q63Var2;
        this.f = q63Var3;
        this.b = q63Var4;
        this.c = s63Var;
        this.g = q63Var5;
    }

    public yn1(s63 s63Var, wj1 wj1Var, az1 az1Var, jm1 jm1Var, q63 q63Var, q63 q63Var2) {
        this.a = 3;
        this.b = s63Var;
        this.e = wj1Var;
        this.c = az1Var;
        this.f = jm1Var;
        this.d = q63Var;
        this.g = q63Var2;
    }

    public /* synthetic */ yn1(s63 s63Var, q63 q63Var, s63 s63Var2, r63 r63Var, q63 q63Var2, v63 v63Var, int i) {
        this.a = i;
        this.e = s63Var;
        this.b = q63Var;
        this.c = s63Var2;
        this.f = r63Var;
        this.d = q63Var2;
        this.g = v63Var;
    }

    public yn1(s63 s63Var, q63 q63Var, s63 s63Var2, s63 s63Var3, s63 s63Var4, q63 q63Var2) {
        this.a = 12;
        this.e = s63Var;
        this.b = q63Var;
        this.f = s63Var2;
        this.g = s63Var3;
        this.d = s63Var4;
        this.c = q63Var2;
    }

    public yn1(v63 v63Var, tz0 tz0Var, wj1 wj1Var, jm1 jm1Var, q63 q63Var, q63 q63Var2) {
        this.a = 2;
        this.b = v63Var;
        this.g = tz0Var;
        this.e = wj1Var;
        this.f = jm1Var;
        this.d = q63Var;
        this.c = q63Var2;
    }

    public yn1(v63 v63Var, wj1 wj1Var, jm1 jm1Var, tz0 tz0Var, v63 v63Var2, q63 q63Var) {
        this.a = 0;
        this.b = v63Var;
        this.e = wj1Var;
        this.f = jm1Var;
        this.g = tz0Var;
        this.c = v63Var2;
        this.d = q63Var;
    }

    public /* synthetic */ yn1(v63 v63Var, r63 r63Var, r63 r63Var2, v63 v63Var2, q63 q63Var, q63 q63Var2, int i) {
        this.a = i;
        this.b = v63Var;
        this.e = r63Var;
        this.f = r63Var2;
        this.c = v63Var2;
        this.d = q63Var;
        this.g = q63Var2;
    }

    public /* synthetic */ yn1(v63 v63Var, v63 v63Var2, v63 v63Var3, v63 v63Var4, v63 v63Var5, v63 v63Var6, int i) {
        this.a = i;
        this.b = v63Var;
        this.c = v63Var2;
        this.e = v63Var3;
        this.f = v63Var4;
        this.g = v63Var5;
        this.d = v63Var6;
    }
}
