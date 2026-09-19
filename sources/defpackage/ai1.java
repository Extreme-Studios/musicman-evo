package defpackage;

import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class ai1 implements lk1 {
    public final md1 f;
    public final es1 g;
    public final x42 h;

    public ai1(md1 md1Var, es1 es1Var, x42 x42Var) {
        this.f = md1Var;
        this.g = es1Var;
        this.h = x42Var;
    }

    @Override // defpackage.lk1
    public final void B0() {
        md1 md1Var;
        String str;
        if (!((Boolean) tu0.e.c.a(lx0.Jd)).booleanValue() || (md1Var = this.f) == null) {
            return;
        }
        for (ViewParent parent = md1Var.p0().getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                str = "1";
                us2 us2VarA = this.g.a();
                us2VarA.s("action", "hcp");
                us2VarA.s("hcp", str);
                us2VarA.r(this.h);
                us2VarA.t();
            }
        }
        str = "0";
        us2 us2VarA2 = this.g.a();
        us2VarA2.s("action", "hcp");
        us2VarA2.s("hcp", str);
        us2VarA2.r(this.h);
        us2VarA2.t();
    }
}
