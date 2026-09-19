package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r4 extends ss0 {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    public /* synthetic */ r4(int i, Object obj) {
        this.q = i;
        this.r = obj;
    }

    @Override // defpackage.j70
    public final void a() {
        int i = this.q;
        Object obj = this.r;
        switch (i) {
            case 0:
                c5 c5Var = ((q4) obj).g;
                c5Var.z.setAlpha(1.0f);
                c5Var.C.d(null);
                c5Var.C = null;
                break;
            case 1:
                c5 c5Var2 = (c5) obj;
                c5Var2.z.setAlpha(1.0f);
                c5Var2.C.d(null);
                c5Var2.C = null;
                break;
            default:
                c5 c5Var3 = (c5) ((un1) obj).h;
                c5Var3.z.setVisibility(8);
                PopupWindow popupWindow = c5Var3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (c5Var3.z.getParent() instanceof View) {
                    View view = (View) c5Var3.z.getParent();
                    WeakHashMap weakHashMap = w60.a;
                    n60.c(view);
                }
                c5Var3.z.e();
                c5Var3.C.d(null);
                c5Var3.C = null;
                ViewGroup viewGroup = c5Var3.E;
                WeakHashMap weakHashMap2 = w60.a;
                n60.c(viewGroup);
                break;
        }
    }

    @Override // defpackage.ss0, defpackage.j70
    public void c() {
        int i = this.q;
        Object obj = this.r;
        switch (i) {
            case 0:
                ((q4) obj).g.z.setVisibility(0);
                break;
            case 1:
                c5 c5Var = (c5) obj;
                c5Var.z.setVisibility(0);
                if (c5Var.z.getParent() instanceof View) {
                    View view = (View) c5Var.z.getParent();
                    WeakHashMap weakHashMap = w60.a;
                    n60.c(view);
                }
                break;
        }
    }
}
