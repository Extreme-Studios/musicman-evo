package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class bn2 extends sm2 {
    public an2 u;

    @Override // defpackage.fm2
    public final void k() {
        an2 an2Var = this.u;
        if (an2Var != null) {
            an2Var.g();
        }
    }

    @Override // defpackage.sm2
    public final void r(int i) {
        this.q = null;
        if (i == 1) {
            this.u = null;
        }
    }

    @Override // defpackage.sm2
    public final void x() {
        an2 an2Var = this.u;
        if (an2Var != null) {
            try {
                an2Var.h.execute(an2Var);
            } catch (RejectedExecutionException e) {
                an2Var.i.e(e);
            }
        }
    }

    @Override // defpackage.sm2
    public final void w(int i, Object obj) {
    }
}
