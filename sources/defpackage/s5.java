package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s5(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                b6 b6Var = (b6) obj;
                if (!b6Var.getInternalPopup().a()) {
                    b6Var.k.m(b6Var.getTextDirection(), b6Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = b6Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                y5 y5Var = (y5) obj;
                b6 b6Var2 = y5Var.L;
                if (b6Var2.isAttachedToWindow() && b6Var2.getGlobalVisibleRect(y5Var.J)) {
                    y5Var.s();
                    y5Var.d();
                } else {
                    y5Var.dismiss();
                }
                break;
            case 2:
                g9 g9Var = (g9) obj;
                ArrayList arrayList = g9Var.m;
                if (g9Var.a() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((f9) arrayList.get(0)).a.D) {
                        View view = g9Var.t;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((f9) obj2).a.d();
                            }
                        } else {
                            g9Var.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                u10 u10Var = (u10) obj;
                fs fsVar = u10Var.m;
                if (u10Var.a() && !fsVar.D) {
                    View view2 = u10Var.r;
                    if (view2 != null && view2.isShown()) {
                        fsVar.d();
                    } else {
                        u10Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
