package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n83 implements ge3, yb3 {
    public final s83 f;
    public final /* synthetic */ c00 g;

    public n83(c00 c00Var, s83 s83Var) {
        this.g = c00Var;
        this.f = s83Var;
    }

    public final Pair a(yd3 yd3Var) {
        yd3 yd3VarA;
        s83 s83Var = this.f;
        yd3 yd3Var2 = null;
        if (yd3Var != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = s83Var.c;
                if (i >= arrayList.size()) {
                    yd3VarA = null;
                    break;
                }
                if (((yd3) arrayList.get(i)).d == yd3Var.d) {
                    Object obj = yd3Var.a;
                    Object obj2 = s83Var.b;
                    int i2 = y83.k;
                    yd3VarA = yd3Var.a(Pair.create(obj2, obj));
                    break;
                }
                i++;
            }
            if (yd3VarA == null) {
                return null;
            }
            yd3Var2 = yd3VarA;
        }
        return Pair.create(Integer.valueOf(s83Var.d), yd3Var2);
    }

    @Override // defpackage.ge3
    public final void j(int i, yd3 yd3Var, qd3 qd3Var, vd3 vd3Var) {
        Pair pairA = a(yd3Var);
        if (pairA != null) {
            ((wx1) this.g.o).d(new l83(this, pairA, qd3Var, vd3Var, 1));
        }
    }

    @Override // defpackage.ge3
    public final void m(int i, yd3 yd3Var, final qd3 qd3Var, final vd3 vd3Var, final int i2) {
        final Pair pairA = a(yd3Var);
        if (pairA != null) {
            ((wx1) this.g.o).d(new Runnable() { // from class: m83
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairA;
                    int iIntValue = ((Integer) pair.first).intValue();
                    yd3 yd3Var2 = (yd3) pair.second;
                    ((z93) this.f.g.n).m(iIntValue, yd3Var2, qd3Var, vd3Var, i2);
                }
            });
        }
    }

    @Override // defpackage.ge3
    public final void o(int i, yd3 yd3Var, qd3 qd3Var, vd3 vd3Var, IOException iOException, boolean z) {
        Pair pairA = a(yd3Var);
        if (pairA != null) {
            ((wx1) this.g.o).d(new ed2(this, pairA, qd3Var, vd3Var, iOException, z));
        }
    }

    @Override // defpackage.ge3
    public final void p(int i, yd3 yd3Var, vd3 vd3Var) {
        Pair pairA = a(yd3Var);
        if (pairA != null) {
            ((wx1) this.g.o).d(new ib(this, pairA, vd3Var, 21));
        }
    }

    @Override // defpackage.ge3
    public final void r(int i, yd3 yd3Var, qd3 qd3Var, vd3 vd3Var) {
        Pair pairA = a(yd3Var);
        if (pairA != null) {
            ((wx1) this.g.o).d(new l83(this, pairA, qd3Var, vd3Var, 0));
        }
    }
}
