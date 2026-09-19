package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class ns {
    public final SparseArray a;
    public e50 b;

    public ns(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(e50 e50Var, int i, int i2) {
        int iA = e50Var.a(i);
        SparseArray sparseArray = this.a;
        ns nsVar = sparseArray == null ? null : (ns) sparseArray.get(iA);
        if (nsVar == null) {
            nsVar = new ns(1);
            sparseArray.put(e50Var.a(i), nsVar);
        }
        if (i2 > i) {
            nsVar.a(e50Var, i + 1, i2);
        } else {
            nsVar.b = e50Var;
        }
    }
}
