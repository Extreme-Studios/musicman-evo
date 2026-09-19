package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rf3 extends a11 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public rf3(sf3 sf3Var) {
        a(sf3Var);
        this.w = sf3Var.w;
        this.x = sf3Var.x;
        this.y = sf3Var.y;
        this.z = sf3Var.z;
        this.A = sf3Var.A;
        this.B = sf3Var.B;
        this.C = sf3Var.C;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = sf3Var.D;
            if (i >= sparseArray2.size()) {
                this.D = sparseArray;
                this.E = sf3Var.E.clone();
                return;
            } else {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            }
        }
    }

    public rf3() {
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }
}
