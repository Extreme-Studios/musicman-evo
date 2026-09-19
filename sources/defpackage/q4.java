package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class q4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ c5 g;

    public /* synthetic */ q4(c5 c5Var, int i) {
        this.f = i;
        this.g = c5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f;
        c5 c5Var = this.g;
        switch (i) {
            case 0:
                if ((c5Var.d0 & 1) != 0) {
                    c5Var.u(0);
                }
                if ((c5Var.d0 & 4096) != 0) {
                    c5Var.u(108);
                }
                c5Var.c0 = false;
                c5Var.d0 = 0;
                break;
            default:
                c5Var.A.showAtLocation(c5Var.z, 55, 0, 0);
                h70 h70Var = c5Var.C;
                if (h70Var != null) {
                    h70Var.b();
                }
                if (c5Var.D && (viewGroup = c5Var.E) != null && viewGroup.isLaidOut()) {
                    c5Var.z.setAlpha(0.0f);
                    h70 h70VarA = w60.a(c5Var.z);
                    h70VarA.a(1.0f);
                    c5Var.C = h70VarA;
                    h70VarA.d(new r4(0, this));
                } else {
                    c5Var.z.setAlpha(1.0f);
                    c5Var.z.setVisibility(0);
                }
                break;
        }
    }
}
