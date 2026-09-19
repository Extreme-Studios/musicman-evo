package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ bc1 g;

    public /* synthetic */ xb1(bc1 bc1Var, int i) {
        this.f = i;
        this.g = bc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        bc1 bc1Var = this.g;
        switch (i) {
            case 0:
                pb1 pb1Var = bc1Var.l;
                if (pb1Var != null) {
                    pb1Var.e();
                }
                break;
            case 1:
                pb1 pb1Var2 = bc1Var.l;
                if (pb1Var2 != null) {
                    pb1Var2.k();
                }
                break;
            case 2:
                pb1 pb1Var3 = bc1Var.l;
                if (pb1Var3 != null) {
                    pb1Var3.h();
                }
                break;
            case 3:
                pb1 pb1Var4 = bc1Var.l;
                if (pb1Var4 != null) {
                    pb1Var4.f();
                }
                break;
            case 4:
                pb1 pb1Var5 = bc1Var.l;
                if (pb1Var5 != null) {
                    pb1Var5.g();
                }
                break;
            case 5:
                pb1 pb1Var6 = bc1Var.l;
                if (pb1Var6 != null) {
                    ob1 ob1Var = pb1Var6.j;
                    ob1Var.h = false;
                    e32 e32Var = zb3.l;
                    e32Var.removeCallbacks(ob1Var);
                    e32Var.postDelayed(ob1Var, 250L);
                    e32Var.post(new mb1(pb1Var6, 0));
                }
                break;
            case 6:
                pb1 pb1Var7 = bc1Var.l;
                if (pb1Var7 != null) {
                    pb1Var7.i();
                }
                break;
            default:
                wb1 wb1Var = bc1Var.g;
                float f = wb1Var.c ? wb1Var.e ? 0.0f : wb1Var.f : 0.0f;
                ed1 ed1Var = bc1Var.n;
                if (ed1Var == null) {
                    jn.T("Trying to set volume before player is initialized.");
                } else {
                    try {
                        d93 d93Var = ed1Var.l;
                        if (d93Var != null) {
                            d93Var.i.b();
                            d93Var.h.R1(f);
                        }
                    } catch (IOException e) {
                        jn.V("", e);
                        return;
                    }
                }
                break;
        }
    }
}
