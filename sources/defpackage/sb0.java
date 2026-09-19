package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class sb0 implements qc0 {
    public final /* synthetic */ ub0 b;

    public sb0(ub0 ub0Var) {
        this.b = ub0Var;
    }

    @Override // defpackage.qc0
    public final void a() {
        q73 q73Var = this.b.L;
        if (q73Var != null) {
            q73Var.a();
        }
    }

    @Override // defpackage.qc0
    public final void c() {
        ub0 ub0Var = this.b;
        Surface surface = ub0Var.T0;
        if (surface != null) {
            z61 z61Var = ub0Var.G0;
            Handler handler = (Handler) z61Var.g;
            if (handler != null) {
                handler.post(new oc0(z61Var, surface, SystemClock.elapsedRealtime()));
            }
            ub0Var.W0 = true;
        }
    }

    @Override // defpackage.qc0
    public final void h() {
        ub0 ub0Var = this.b;
        if (ub0Var.T0 != null) {
            ub0Var.u0(0, 1);
        }
    }
}
