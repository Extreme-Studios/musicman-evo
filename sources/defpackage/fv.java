package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class fv {
    public static final dv c = new dv(13);
    public final bt a = new bt();
    public final xz b = new xz();

    public fv() {
        a(c);
    }

    public final void a(rs0 rs0Var) {
        boolean z;
        bt btVar = this.a;
        synchronized (btVar.a) {
            z = btVar.f == bt.k;
            btVar.f = rs0Var;
        }
        if (z) {
            d7 d7VarQ = d7.Q();
            q7 q7Var = btVar.j;
            qe qeVar = d7VarQ.C;
            if (qeVar.E == null) {
                synchronized (qeVar.C) {
                    try {
                        if (qeVar.E == null) {
                            qeVar.E = qe.Q(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            qeVar.E.post(q7Var);
        }
        if (rs0Var instanceof ev) {
            this.b.i((ev) rs0Var);
        } else if (rs0Var instanceof cv) {
            this.b.j(((cv) rs0Var).v);
        }
    }
}
