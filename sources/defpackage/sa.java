package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class sa implements jo {
    public final /* synthetic */ int f;
    public final /* synthetic */ c4 g;

    public /* synthetic */ sa(c4 c4Var, int i) {
        this.f = i;
        this.g = c4Var;
    }

    @Override // defpackage.jo
    public final void g(mo moVar, eo eoVar) {
        switch (this.f) {
            case 0:
                if (eoVar == eo.ON_STOP) {
                    Window window = this.g.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
                break;
            case 1:
                if (eoVar == eo.ON_DESTROY) {
                    this.g.g.f = null;
                    if (!this.g.isChangingConfigurations()) {
                        this.g.d().a();
                    }
                    va vaVar = this.g.m;
                    c4 c4Var = vaVar.i;
                    c4Var.getWindow().getDecorView().removeCallbacks(vaVar);
                    c4Var.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(vaVar);
                }
                break;
            default:
                c4 c4Var2 = this.g;
                if (c4Var2.k == null) {
                    ua uaVar = (ua) c4Var2.getLastNonConfigurationInstance();
                    if (uaVar != null) {
                        c4Var2.k = uaVar.a;
                    }
                    if (c4Var2.k == null) {
                        c4Var2.k = new c70();
                    }
                }
                c4Var2.i.f(this);
                break;
        }
    }
}
