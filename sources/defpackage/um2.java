package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class um2 extends v51 {
    @Override // defpackage.v51
    public final void w(sm2 sm2Var, Set set) {
        synchronized (sm2Var) {
            try {
                if (sm2Var.m == null) {
                    sm2Var.m = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v51
    public final int y(sm2 sm2Var) {
        int i;
        synchronized (sm2Var) {
            i = sm2Var.n - 1;
            sm2Var.n = i;
        }
        return i;
    }
}
