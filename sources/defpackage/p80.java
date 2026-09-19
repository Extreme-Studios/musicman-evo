package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class p80 extends o80 {
    public gn n;

    public p80(y80 y80Var, WindowInsets windowInsets) {
        super(y80Var, windowInsets);
        this.n = null;
    }

    @Override // defpackage.v80
    public y80 b() {
        return y80.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.v80
    public y80 c() {
        return y80.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.v80
    public final gn h() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = gn.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // defpackage.v80
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.v80
    public void q(gn gnVar) {
        this.n = gnVar;
    }
}
