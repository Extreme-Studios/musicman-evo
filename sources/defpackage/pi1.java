package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pi1 implements iy1 {
    public final List a;

    public pi1(mi1 mi1Var) {
        this.a = Collections.singletonList(na1.t(mi1Var));
    }

    @Override // defpackage.iy1
    public final void m() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            na1.N((hp) it.next(), new ue0(22), cn2.f);
        }
    }

    public pi1(List list) {
        this.a = list;
    }
}
