package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class vx0 extends dd {
    public final /* synthetic */ wx0 a;

    public vx0(wx0 wx0Var) {
        this.a = wx0Var;
    }

    @Override // defpackage.dd
    public final void e(int i, Bundle bundle) {
        wx0 wx0Var = this.a;
        wx0Var.getClass();
        if (!((Boolean) tu0.e.c.a(lx0.Y4)).booleanValue() || wx0Var.d == null) {
            return;
        }
        za1.a.execute(new og(i, 4, wx0Var));
    }
}
