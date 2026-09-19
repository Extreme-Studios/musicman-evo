package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ym2 extends sm2 {
    public List u;

    public ym2(vj2 vj2Var, boolean z) {
        List arrayList;
        super(vj2Var, z, true);
        if (vj2Var.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = vj2Var.size();
            w40.k0("initialArraySize", size);
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < vj2Var.size(); i++) {
            arrayList.add(null);
        }
        this.u = arrayList;
        v();
    }

    @Override // defpackage.sm2
    public final void r(int i) {
        this.q = null;
        this.u = null;
    }

    @Override // defpackage.sm2
    public final void w(int i, Object obj) {
        List list = this.u;
        if (list != null) {
            list.set(i, new zm2(obj));
        }
    }

    @Override // defpackage.sm2
    public final void x() {
        List<zm2> list = this.u;
        if (list != null) {
            int size = list.size();
            w40.k0("initialArraySize", size);
            ArrayList arrayList = new ArrayList(size);
            for (zm2 zm2Var : list) {
                arrayList.add(zm2Var != null ? zm2Var.a : null);
            }
            d(Collections.unmodifiableList(arrayList));
        }
    }
}
