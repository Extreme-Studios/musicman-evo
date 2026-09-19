package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class dy1 extends cy1 {
    public final if1 a;
    public final uj1 b;
    public final im1 c;
    public final hy1 d;
    public final yw1 e;

    public dy1(if1 if1Var, uj1 uj1Var, im1 im1Var, hy1 hy1Var, yw1 yw1Var) {
        this.a = if1Var;
        this.b = uj1Var;
        this.c = im1Var;
        this.d = hy1Var;
        this.e = yw1Var;
    }

    @Override // defpackage.cy1
    public final p62 c(i52 i52Var, Bundle bundle, x42 x42Var, e52 e52Var) {
        uj1 uj1Var = this.b;
        uj1Var.b = i52Var;
        uj1Var.c = bundle;
        uj1Var.e = new r52(e52Var, x42Var, this.d, 15, false);
        if (((Boolean) tu0.e.c.a(lx0.V3)).booleanValue()) {
            uj1Var.f = this.e;
        }
        if1 if1Var = this.a.b;
        uj1 uj1Var2 = new uj1(uj1Var);
        im1 im1Var = this.c;
        dq.F(im1Var, im1.class);
        vi1 vi1VarA = new nf1(if1Var, new fl1(17), im1Var, uj1Var2, new zy1(29, false), null, null).a();
        return vi1VarA.c(vi1VarA.b());
    }
}
