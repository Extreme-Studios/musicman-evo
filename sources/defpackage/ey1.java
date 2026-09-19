package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ey1 extends cy1 {
    public final if1 a;
    public final uj1 b;
    public final zy1 c;
    public final im1 d;
    public final un1 e;
    public final nl1 f;
    public final ViewGroup g;
    public final am1 h;
    public final hy1 i;
    public final yw1 j;

    public ey1(if1 if1Var, uj1 uj1Var, zy1 zy1Var, im1 im1Var, un1 un1Var, nl1 nl1Var, ViewGroup viewGroup, am1 am1Var, hy1 hy1Var, yw1 yw1Var) {
        this.a = if1Var;
        this.b = uj1Var;
        this.c = zy1Var;
        this.d = im1Var;
        this.e = un1Var;
        this.f = nl1Var;
        this.g = viewGroup;
        this.h = am1Var;
        this.i = hy1Var;
        this.j = yw1Var;
    }

    @Override // defpackage.cy1
    public final p62 c(i52 i52Var, Bundle bundle, x42 x42Var, e52 e52Var) {
        uj1 uj1Var = this.b;
        uj1Var.b = i52Var;
        uj1Var.c = bundle;
        uj1Var.e = new r52(e52Var, x42Var, this.i, 15, false);
        if (((Boolean) tu0.e.c.a(lx0.V3)).booleanValue()) {
            uj1Var.f = this.j;
        }
        if1 if1Var = this.a.b;
        uj1 uj1Var2 = new uj1(uj1Var);
        un1 un1Var = new un1(this.f, 13, this.h);
        kc2 kc2Var = new kc2(19, this.g);
        im1 im1Var = this.d;
        dq.F(im1Var, im1.class);
        zy1 zy1Var = this.c;
        dq.F(zy1Var, zy1.class);
        zy1 zy1Var2 = new zy1(29, false);
        un1 un1Var2 = this.e;
        dq.F(un1Var2, un1.class);
        vi1 vi1Var = (vi1) new pf1(if1Var, kc2Var, un1Var2, new fl1(17), im1Var, uj1Var2, zy1Var2, zy1Var, un1Var, null, null).r.c();
        return vi1Var.c(vi1Var.b());
    }
}
