package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pj1 implements yk1, mk1 {
    public final x42 f;

    public pj1(x42 x42Var) {
        this.f = x42Var;
    }

    @Override // defpackage.yk1
    public final void e() {
        u61 u61Var = this.f.d0;
        if (u61Var == null || !u61Var.a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = u61Var.b;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // defpackage.mk1
    public final void h(Context context) {
    }

    @Override // defpackage.mk1
    public final void l(Context context) {
    }

    @Override // defpackage.mk1
    public final void p(Context context) {
    }
}
