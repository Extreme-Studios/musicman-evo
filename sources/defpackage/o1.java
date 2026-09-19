package defpackage;

import android.content.Context;
import android.view.View;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends bs {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ r1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(r1 r1Var, Context context, g20 g20Var, View view) {
        super(context, g20Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = r1Var;
        if ((g20Var.A.x & 32) != 32) {
            View view2 = r1Var.n;
            this.e = view2 == null ? (View) r1Var.m : view2;
        }
        kc2 kc2Var = r1Var.B;
        this.h = kc2Var;
        zr zrVar = this.i;
        if (zrVar != null) {
            zrVar.e(kc2Var);
        }
    }

    @Override // defpackage.bs
    public final void c() {
        int i = this.l;
        r1 r1Var = this.m;
        switch (i) {
            case 0:
                r1Var.y = null;
                super.c();
                break;
            default:
                rr rrVar = r1Var.h;
                if (rrVar != null) {
                    rrVar.c(true);
                }
                r1Var.x = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(r1 r1Var, Context context, rr rrVar, View view) {
        super(context, rrVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = r1Var;
        this.f = 8388613;
        kc2 kc2Var = r1Var.B;
        this.h = kc2Var;
        zr zrVar = this.i;
        if (zrVar != null) {
            zrVar.e(kc2Var);
        }
    }
}
