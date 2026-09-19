package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class r80 extends q80 {
    public gn o;
    public gn p;
    public gn q;

    public r80(y80 y80Var, WindowInsets windowInsets) {
        super(y80Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.v80
    public gn g() {
        if (this.p == null) {
            this.p = gn.b(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // defpackage.v80
    public gn i() {
        if (this.o == null) {
            this.o = gn.b(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.v80
    public gn k() {
        if (this.q == null) {
            this.q = gn.b(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // defpackage.o80, defpackage.v80
    public y80 l(int i, int i2, int i3, int i4) {
        return y80.c(this.c.inset(i, i2, i3, i4), null);
    }

    @Override // defpackage.p80, defpackage.v80
    public void q(gn gnVar) {
    }
}
