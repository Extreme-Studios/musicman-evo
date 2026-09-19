package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class tk1 implements wa3, xu {
    public final /* synthetic */ int f;
    public final Executor g;
    public final Object h;
    public final Object i;

    public tk1(Executor executor, vu vuVar) {
        this.f = 2;
        this.i = new Object();
        this.g = executor;
        this.h = vuVar;
    }

    @Override // defpackage.wa3
    public final void a(ve3 ve3Var) {
        boolean z = false;
        switch (this.f) {
            case 0:
                this.g.execute(new in2(this, ve3Var, 27, z));
                return;
            case 1:
                this.g.execute(new hb1(this, 18, ve3Var));
                return;
            case 2:
                synchronized (this.i) {
                    break;
                }
                this.g.execute(new u52(this, ve3Var, 11, z));
                return;
            default:
                if (ve3Var.c() || ve3Var.d) {
                    return;
                }
                synchronized (this.i) {
                    break;
                }
                this.g.execute(new u52(this, ve3Var, 14, z));
                return;
        }
    }

    @Override // defpackage.xu
    public void c(Exception exc) {
        ((ve3) this.h).d(exc);
    }

    public /* synthetic */ tk1(Executor executor, zb zbVar, ve3 ve3Var, int i) {
        this.f = i;
        this.g = executor;
        this.i = zbVar;
        this.h = ve3Var;
    }

    public tk1(Executor executor, xu xuVar) {
        this.f = 3;
        this.i = new Object();
        this.g = executor;
        this.h = xuVar;
    }
}
