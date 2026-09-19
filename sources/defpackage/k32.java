package defpackage;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k32 implements m22 {
    public final sa1 a;
    public final boolean b;
    public final ScheduledExecutorService c;
    public final ya1 d;
    public final int e;
    public final int f;

    public k32(sa1 sa1Var, boolean z, ya1 ya1Var, ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.a = sa1Var;
        this.b = z;
        this.d = ya1Var;
        this.c = scheduledExecutorService;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.m22
    public final hp a() {
        ix0 ix0Var = lx0.r7;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && this.b) {
            return na1.t(new f02(null, 5));
        }
        if (this.f == 2) {
            return na1.t(new f02(null, 5));
        }
        if (!Arrays.asList(((String) tu0Var.c.a(lx0.t7)).split(",")).contains(String.valueOf(this.e))) {
            return na1.t(new f02(null, 5));
        }
        kn2 kn2Var = kn2.g;
        lh0 lh0Var = lh0.r;
        ya1 ya1Var = this.d;
        return na1.I(na1.K(na1.M(kn2Var, lh0Var, ya1Var), ((Long) iz0.b.u()).longValue(), TimeUnit.MILLISECONDS, this.c), Exception.class, new zl0(7, this), ya1Var);
    }

    @Override // defpackage.m22
    public final int c() {
        return 50;
    }
}
