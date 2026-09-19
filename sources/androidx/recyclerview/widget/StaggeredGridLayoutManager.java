package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import defpackage.gm;
import defpackage.hn;
import defpackage.j7;
import defpackage.qw;
import defpackage.ss0;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends hn {
    public final int u;
    public final gm[] v;
    public final ss0 w;
    public final ss0 x;
    public final int y;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.u = -1;
        new Rect();
        qw qwVarF = hn.f(context, attributeSet, i, i2);
        int i3 = qwVarF.a;
        if (i3 != 0 && i3 != 1) {
            j7.p("invalid orientation.");
            throw null;
        }
        if (i3 != this.y) {
            this.y = i3;
            ss0 ss0Var = this.w;
            this.w = this.x;
            this.x = ss0Var;
        }
        int i4 = qwVarF.b;
        if (i4 != this.u) {
            this.u = i4;
            new BitSet(this.u);
            this.v = new gm[this.u];
            for (int i5 = 0; i5 < this.u; i5++) {
                gm[] gmVarArr = this.v;
                gm gmVar = new gm();
                new ArrayList();
                gmVarArr[i5] = gmVar;
            }
        }
        this.w = ss0.h(this, this.y);
        this.x = ss0.h(this, 1 - this.y);
    }
}
