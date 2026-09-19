package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class tf2 implements ge2 {
    public final o63 a;
    public final o63 b;
    public final o63 c;
    public final boolean d;
    public final long e;

    public tf2(o63 o63Var, o63 o63Var2, o63 o63Var3, boolean z, long j) {
        this.a = o63Var;
        this.b = o63Var2;
        this.c = o63Var3;
        this.d = z;
        this.e = j;
    }

    @Override // defpackage.ge2
    public final String a() {
        return ((gg2) this.b.c()).a();
    }

    @Override // defpackage.ge2
    public final hp b(Context context, View view, Activity activity) {
        return ((gg2) this.b.c()).b(context, view, activity);
    }

    @Override // defpackage.ge2
    public final hp c() {
        boolean z = this.d;
        o63 o63Var = this.a;
        if (z) {
            fn2 fn2VarR = fn2.r(((bg2) o63Var.c()).a());
            lh0 lh0Var = lh0.x;
            cn2 cn2Var = cn2.f;
            return na1.L(na1.I(fn2VarR, Throwable.class, lh0Var, cn2Var), new r21(16, this), cn2Var);
        }
        fn2 fn2VarC = ((gg2) this.b.c()).c();
        long j = this.e;
        if (j > 0) {
            ((ScheduledExecutorService) this.c.c()).schedule(new s22(7, this), j, TimeUnit.MILLISECONDS);
            return fn2VarC;
        }
        ((bg2) o63Var.c()).a();
        return fn2VarC;
    }

    @Override // defpackage.ge2
    public final void d(InputEvent inputEvent) {
        ((gg2) this.b.c()).d(inputEvent);
    }

    @Override // defpackage.ge2
    public final int e() {
        return ((gg2) this.b.c()).e();
    }

    @Override // defpackage.ge2
    public final hp f(Context context, String str, View view) {
        return ((gg2) this.b.c()).f(context, str, view);
    }

    @Override // defpackage.ge2
    public final hp h(Context context) {
        return ((gg2) this.b.c()).h(context);
    }
}
