package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class sg1 {
    public final Context a;
    public final h73 b;
    public final rw1 c;
    public final mr1 d;
    public final ya1 e;
    public final ya1 f;
    public final ScheduledExecutorService g;

    public sg1(Context context, h73 h73Var, rw1 rw1Var, mr1 mr1Var, ya1 ya1Var, ya1 ya1Var2, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.b = h73Var;
        this.c = rw1Var;
        this.d = mr1Var;
        this.e = ya1Var;
        this.f = ya1Var2;
        this.g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) tu0.e.c.a(lx0.Wa));
    }

    public final hp a(String str, Random random) {
        return TextUtils.isEmpty(str) ? na1.t(str) : na1.J(c(str, this.d.a, random), Throwable.class, new t11(this, str, 1), this.e);
    }

    public final hp c(String str, MotionEvent motionEvent, Random random) {
        hp hpVarC;
        try {
            ix0 ix0Var = lx0.Wa;
            tu0 tu0Var = tu0.e;
            kx0 kx0Var = tu0Var.c;
            kx0 kx0Var2 = tu0Var.c;
            if (!str.contains((CharSequence) kx0Var.a(ix0Var)) || this.b.s()) {
                return na1.t(str);
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) kx0Var2.a(lx0.Xa), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent == null) {
                builderBuildUpon.appendQueryParameter((String) kx0Var2.a(lx0.Ya), "11");
                return na1.t(builderBuildUpon.toString());
            }
            rw1 rw1Var = this.c;
            rw1Var.getClass();
            try {
                wq wqVarB = wq.b(rw1Var.b);
                rw1Var.a = wqVarB;
                hpVarC = wqVarB == null ? na1.C(new IllegalStateException("MeasurementManagerFutures is null")) : wqVarB.c();
            } catch (Exception e) {
                hpVarC = na1.C(e);
            }
            return na1.J(na1.L(fn2.r(hpVarC), new c41(this, builderBuildUpon, str, motionEvent), this.f), Throwable.class, new yy0(this, 3, builderBuildUpon), this.e);
        } catch (Exception e2) {
            return na1.C(e2);
        }
    }
}
