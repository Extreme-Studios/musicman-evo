package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class d9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ zr g;

    public /* synthetic */ d9(zr zrVar, int i) {
        this.f = i;
        this.g = zrVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f;
        zr zrVar = this.g;
        switch (i) {
            case 0:
                g9 g9Var = (g9) zrVar;
                ViewTreeObserver viewTreeObserver = g9Var.C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        g9Var.C = view.getViewTreeObserver();
                    }
                    g9Var.C.removeGlobalOnLayoutListener(g9Var.n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                u10 u10Var = (u10) zrVar;
                ViewTreeObserver viewTreeObserver2 = u10Var.t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        u10Var.t = view.getViewTreeObserver();
                    }
                    u10Var.t.removeGlobalOnLayoutListener(u10Var.n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
