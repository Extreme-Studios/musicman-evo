package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ec;
import defpackage.hn;
import defpackage.j7;
import defpackage.qw;
import defpackage.ss0;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends hn {
    public final int u;
    public final ss0 v;
    public final boolean w;
    public boolean x = false;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.u = 1;
        this.w = false;
        qw qwVarF = hn.f(context, attributeSet, i, i2);
        int i3 = qwVarF.a;
        if (i3 != 0 && i3 != 1) {
            j7.p(ec.h("invalid orientation:", i3));
            throw null;
        }
        if (i3 != this.u || this.v == null) {
            this.v = ss0.h(this, i3);
            this.u = i3;
        }
        boolean z = qwVarF.c;
        if (z != this.w) {
            this.w = z;
        }
        T(qwVarF.d);
    }

    public void T(boolean z) {
        if (this.x == z) {
            return;
        }
        this.x = z;
    }
}
