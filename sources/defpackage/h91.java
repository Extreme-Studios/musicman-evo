package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h91 {
    public final h73 a;

    public h91(h73 h73Var) {
        this.a = h73Var;
    }

    public final void a(int i, long j) {
        long j2;
        ix0 ix0Var = lx0.C0;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            return;
        }
        h73 h73Var = this.a;
        h73Var.h();
        synchronized (h73Var.a) {
            j2 = h73Var.D;
        }
        if (j - j2 < 0) {
            jn.p("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) tu0Var.c.a(lx0.D0)).booleanValue()) {
            h73Var.c(i);
            h73Var.d(j);
        } else {
            h73Var.c(-1);
            h73Var.d(j);
        }
    }
}
