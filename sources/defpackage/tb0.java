package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class tb0 {
    public final /* synthetic */ nc3 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ub0 c;

    public tb0(ub0 ub0Var, nc3 nc3Var, int i, long j) {
        this.a = nc3Var;
        this.b = i;
        this.c = ub0Var;
    }

    public final void a() {
        ub0 ub0Var = this.c;
        ub0Var.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.a.H(this.b);
        Trace.endSection();
        ub0Var.u0(0, 1);
    }
}
