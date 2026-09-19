package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug1 implements ck1 {
    public final x42 f;
    public final ua1 g;

    public ug1(x42 x42Var, ua1 ua1Var) {
        this.f = x42Var;
        this.g = ua1Var;
    }

    @Override // defpackage.ck1
    public final void U() {
        if (this.f.r0) {
            ua1 ua1Var = this.g;
            synchronized (ua1Var.f) {
                ta1 ta1Var = ua1Var.i;
                synchronized (ta1Var.f) {
                    ta1Var.k++;
                }
            }
        }
    }

    @Override // defpackage.ck1
    public final void a() {
    }

    @Override // defpackage.ck1
    public final void b() {
    }

    @Override // defpackage.ck1
    public final void d() {
    }

    @Override // defpackage.ck1
    public final void r() {
    }

    @Override // defpackage.ck1
    public final void I(w71 w71Var, String str, String str2) {
    }
}
