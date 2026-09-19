package defpackage;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class qu1 implements cv1 {
    public static final Pattern h = Pattern.compile("Received error HTTP response code: (.*)");
    public final u40 a;
    public final ya1 b;
    public final i52 c;
    public final ScheduledExecutorService d;
    public final wv1 e;
    public final d72 f;
    public final Context g;

    public qu1(Context context, i52 i52Var, u40 u40Var, ya1 ya1Var, ScheduledExecutorService scheduledExecutorService, wv1 wv1Var, d72 d72Var) {
        this.g = context;
        this.c = i52Var;
        this.a = u40Var;
        this.b = ya1Var;
        this.d = scheduledExecutorService;
        this.e = wv1Var;
        this.f = d72Var;
    }

    @Override // defpackage.cv1
    public final hp d(r71 r71Var) {
        u40 u40Var = this.a;
        ya1 ya1Var = (ya1) u40Var.h;
        String str = r71Var.i;
        zb3 zb3Var = vc3.C.c;
        vl2 vl2VarJ = na1.J(zb3.e(str) ? na1.C(new dv1(1)) : na1.J(((ya1) u40Var.g).b(new hq0(u40Var, 7, r71Var)), ExecutionException.class, kg0.d, ya1Var), dv1.class, new mu1(u40Var, r71Var, Binder.getCallingUid(), 0), ya1Var);
        a72 a72VarJ = a72.j(this.g, 11);
        i8.z(vl2VarJ, a72VarJ);
        hp hpVarL = na1.L(vl2VarJ, new r21(6, this), this.b);
        ix0 ix0Var = lx0.Y5;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            hpVarL = na1.J(na1.K(hpVarL, ((Integer) tu0Var.c.a(lx0.Z5)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, kg0.e, za1.g);
        }
        i8.M(hpVarL, this.f, a72VarJ, false);
        hpVarL.a(new in2(hpVarL, 0, new dr0(24, this)), za1.g);
        return hpVarL;
    }
}
