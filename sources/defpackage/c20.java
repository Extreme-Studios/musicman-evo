package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class c20 implements Runnable {
    public final g90 f;

    static {
        yp.f("StopWorkRunnable");
    }

    public c20(g90 g90Var, String str, boolean z) {
        this.f = g90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WorkDatabase workDatabase = this.f.c;
        workDatabase.h();
        workDatabase.b();
        throw null;
    }
}
