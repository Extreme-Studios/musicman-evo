package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class hg2 implements gg2 {
    public final fb2 a;
    public final ng2 b;
    public final qg2 c;
    public final File d;
    public final dh2 e;
    public final ExecutorService f;
    public final AtomicReference g = new AtomicReference("3.-1");

    public hg2(fb2 fb2Var, ng2 ng2Var, qg2 qg2Var, dh2 dh2Var, ExecutorService executorService, File file) {
        this.a = fb2Var;
        this.b = ng2Var;
        this.c = qg2Var;
        this.e = dh2Var;
        this.d = file;
        this.f = executorService;
    }

    @Override // defpackage.gg2
    public final String a() {
        return (String) this.g.get();
    }

    @Override // defpackage.gg2
    public final xn2 b(Context context, View view, Activity activity) {
        return na1.F(new wp1(this, context, view, activity, 2), this.f);
    }

    @Override // defpackage.gg2
    public final fn2 c() {
        return na1.M(na1.I(fn2.r(this.b.a()), Throwable.class, zf2.c, cn2.f), new zl0(12, this), this.f);
    }

    @Override // defpackage.gg2
    public final void d(InputEvent inputEvent) {
        db2 db2VarB = this.a.b();
        dh2 dh2Var = this.e;
        if (db2VarB == null) {
            dh2Var.b(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                db2VarB.j((MotionEvent) inputEvent);
            } catch (eb2 e) {
                dh2Var.c(15005, e);
            }
        }
    }

    @Override // defpackage.gg2
    public final int e() {
        return 3;
    }

    @Override // defpackage.gg2
    public final xn2 f(Context context, String str, View view) {
        return na1.F(new wp1(this, context, str, view, 3), this.f);
    }

    @Override // defpackage.gg2
    public final xn2 h(Context context) {
        return na1.F(new hq0(this, 14, context), this.f);
    }
}
