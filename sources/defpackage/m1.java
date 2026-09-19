package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends hj {
    public final /* synthetic */ int o = 0;
    public final /* synthetic */ View p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.p = actionMenuItemView;
    }

    @Override // defpackage.hj
    public final m00 b() {
        o1 o1Var;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                n1 n1Var = ((ActionMenuItemView) view).r;
                if (n1Var == null || (o1Var = ((p1) n1Var).a.y) == null) {
                    return null;
                }
                return o1Var.a();
            default:
                o1 o1Var2 = ((q1) view).i.x;
                if (o1Var2 == null) {
                    return null;
                }
                return o1Var2.a();
        }
    }

    @Override // defpackage.hj
    public final boolean c() {
        m00 m00VarB;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                qr qrVar = actionMenuItemView.p;
                return qrVar != null && qrVar.a(actionMenuItemView.m) && (m00VarB = b()) != null && m00VarB.a();
            default:
                ((q1) view).i.l();
                return true;
        }
    }

    @Override // defpackage.hj
    public boolean d() {
        switch (this.o) {
            case 1:
                r1 r1Var = ((q1) this.p).i;
                if (r1Var.z != null) {
                    return false;
                }
                r1Var.d();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(q1 q1Var, q1 q1Var2) {
        super(q1Var2);
        this.p = q1Var;
    }
}
