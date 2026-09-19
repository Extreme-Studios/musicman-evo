package defpackage;

import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class v31 implements g31, u31 {
    public final u31 f;
    public final HashSet g = new HashSet();

    public v31(k31 k31Var) {
        this.f = k31Var;
    }

    @Override // defpackage.u31
    public final void h(String str, v11 v11Var) {
        this.f.h(str, v11Var);
        this.g.remove(new AbstractMap.SimpleEntry(str, v11Var));
    }

    @Override // defpackage.g31, defpackage.l31
    public final void l(String str) {
        this.f.l(str);
    }

    @Override // defpackage.u31
    public final void p(String str, v11 v11Var) {
        this.f.p(str, v11Var);
        this.g.add(new AbstractMap.SimpleEntry(str, v11Var));
    }
}
