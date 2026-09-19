package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l83 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ n83 g;
    public final /* synthetic */ Pair h;
    public final /* synthetic */ qd3 i;
    public final /* synthetic */ vd3 j;

    public /* synthetic */ l83(n83 n83Var, Pair pair, qd3 qd3Var, vd3 vd3Var, int i) {
        this.f = i;
        this.g = n83Var;
        this.h = pair;
        this.i = qd3Var;
        this.j = vd3Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        vd3 vd3Var = this.j;
        qd3 qd3Var = this.i;
        n83 n83Var = this.g;
        Pair pair = this.h;
        switch (i) {
            case 0:
                ((z93) n83Var.g.n).r(((Integer) pair.first).intValue(), (yd3) pair.second, qd3Var, vd3Var);
                break;
            default:
                ((z93) n83Var.g.n).j(((Integer) pair.first).intValue(), (yd3) pair.second, qd3Var, vd3Var);
                break;
        }
    }
}
