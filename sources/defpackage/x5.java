package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class x5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ s5 f;
    public final /* synthetic */ y5 g;

    public x5(y5 y5Var, s5 s5Var) {
        this.g = y5Var;
        this.f = s5Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.g.L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f);
        }
    }
}
