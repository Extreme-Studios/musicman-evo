package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e80 extends ss0 {
    public final /* synthetic */ int q;
    public final /* synthetic */ g80 r;

    public /* synthetic */ e80(g80 g80Var, int i) {
        this.q = i;
        this.r = g80Var;
    }

    @Override // defpackage.j70
    public final void a() {
        View view;
        int i = this.q;
        g80 g80Var = this.r;
        switch (i) {
            case 0:
                if (g80Var.o && (view = g80Var.g) != null) {
                    view.setTranslationY(0.0f);
                    g80Var.d.setTranslationY(0.0f);
                }
                g80Var.d.setVisibility(8);
                g80Var.d.setTransitioning(false);
                g80Var.s = null;
                un1 un1Var = g80Var.k;
                if (un1Var != null) {
                    un1Var.b(g80Var.j);
                    g80Var.j = null;
                    g80Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = g80Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = w60.a;
                    n60.c(actionBarOverlayLayout);
                }
                break;
            default:
                g80Var.s = null;
                g80Var.d.requestLayout();
                break;
        }
    }
}
