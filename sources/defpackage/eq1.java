package defpackage;

import android.graphics.Rect;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eq1 implements qt0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ md1 g;

    public /* synthetic */ eq1(md1 md1Var, int i) {
        this.f = i;
        this.g = md1Var;
    }

    @Override // defpackage.qt0
    public final /* synthetic */ void Q0(pt0 pt0Var) {
        int i = this.f;
        md1 md1Var = this.g;
        switch (i) {
            case 0:
                HashMap map = new HashMap();
                map.put("isVisible", true != pt0Var.j ? "0" : "1");
                md1Var.a("onAdVisibilityChanged", map);
                break;
            case 1:
                Rect rect = pt0Var.d;
                md1Var.e0().r(rect.left, rect.top);
                break;
            default:
                Rect rect2 = pt0Var.d;
                md1Var.e0().r(rect2.left, rect2.top);
                break;
        }
    }
}
