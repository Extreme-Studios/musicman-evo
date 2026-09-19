package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class by1 extends cy1 {
    public final /* synthetic */ int a = 2;
    public final if1 b;
    public final uj1 c;
    public final im1 d;
    public final hy1 e;
    public final yw1 f;
    public final Object g;

    public by1(if1 if1Var, uj1 uj1Var, im1 im1Var, f52 f52Var, hy1 hy1Var, yw1 yw1Var) {
        this.b = if1Var;
        this.c = uj1Var;
        this.d = im1Var;
        this.g = f52Var;
        this.e = hy1Var;
        this.f = yw1Var;
    }

    @Override // defpackage.cy1
    public final p62 c(i52 i52Var, Bundle bundle, x42 x42Var, e52 e52Var) {
        f52 f52Var;
        int i = this.a;
        if1 if1Var = this.b;
        yw1 yw1Var = this.f;
        Object obj = this.g;
        uj1 uj1Var = this.c;
        switch (i) {
            case 0:
                uj1Var.b = i52Var;
                uj1Var.c = bundle;
                uj1Var.e = new r52(e52Var, x42Var, this.e, 15, false);
                if (((Boolean) tu0.e.c.a(lx0.V3)).booleanValue()) {
                    uj1Var.f = yw1Var;
                }
                if1 if1Var2 = if1Var.b;
                uj1 uj1Var2 = new uj1(uj1Var);
                un1 un1Var = (un1) obj;
                kc2 kc2Var = new kc2(19, (Object) null);
                im1 im1Var = this.d;
                dq.F(im1Var, im1.class);
                dq.F(un1Var, un1.class);
                vi1 vi1Var = (vi1) new hf1(if1Var2, kc2Var, un1Var, new fl1(17), im1Var, uj1Var2, new zy1(29, false), null, null).n.c();
                return vi1Var.c(vi1Var.b());
            case 1:
                uj1Var.b = i52Var;
                uj1Var.c = bundle;
                uj1Var.e = new r52(e52Var, x42Var, this.e, 15, false);
                if (((Boolean) tu0.e.c.a(lx0.V3)).booleanValue()) {
                    uj1Var.f = yw1Var;
                }
                if1 if1Var3 = if1Var.b;
                uj1 uj1Var3 = new uj1(uj1Var);
                zy1 zy1Var = (zy1) obj;
                im1 im1Var2 = this.d;
                dq.F(im1Var2, im1.class);
                dq.F(zy1Var, zy1.class);
                vi1 vi1Var2 = (vi1) new sf1(if1Var3, new fl1(17), im1Var2, uj1Var3, new zy1(29, false), zy1Var, null, null).m.c();
                return vi1Var2.c(vi1Var2.b());
            default:
                uj1Var.b = i52Var;
                uj1Var.c = bundle;
                uj1Var.e = new r52(e52Var, x42Var, this.e, 15, false);
                ix0 ix0Var = lx0.U3;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && (f52Var = (f52) obj) != null) {
                    uj1Var.d = f52Var;
                }
                if (((Boolean) tu0Var.c.a(lx0.V3)).booleanValue()) {
                    uj1Var.f = yw1Var;
                }
                if1 if1Var4 = if1Var.b;
                uj1 uj1Var4 = new uj1(uj1Var);
                im1 im1Var3 = this.d;
                dq.F(im1Var3, im1.class);
                vi1 vi1VarA = new wf1(if1Var4, new fl1(17), im1Var3, uj1Var4, new zy1(29, false), null, null).a();
                return vi1VarA.c(vi1VarA.b());
        }
    }

    public by1(if1 if1Var, uj1 uj1Var, zy1 zy1Var, im1 im1Var, hy1 hy1Var, yw1 yw1Var) {
        this.b = if1Var;
        this.c = uj1Var;
        this.g = zy1Var;
        this.d = im1Var;
        this.e = hy1Var;
        this.f = yw1Var;
    }

    public by1(if1 if1Var, un1 un1Var, uj1 uj1Var, im1 im1Var, hy1 hy1Var, yw1 yw1Var) {
        this.b = if1Var;
        this.g = un1Var;
        this.c = uj1Var;
        this.d = im1Var;
        this.e = hy1Var;
        this.f = yw1Var;
    }
}
