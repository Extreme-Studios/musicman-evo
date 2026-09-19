package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class j80 extends n80 {
    public final WindowInsets.Builder a;

    public j80(y80 y80Var) {
        super(y80Var);
        WindowInsets windowInsetsB = y80Var.b();
        this.a = windowInsetsB != null ? i80.g(windowInsetsB) : i80.f();
    }

    @Override // defpackage.n80
    public y80 b() {
        a();
        y80 y80VarC = y80.c(this.a.build(), null);
        y80VarC.a.o(null);
        return y80VarC;
    }

    @Override // defpackage.n80
    public void c(gn gnVar) {
        this.a.setStableInsets(gnVar.c());
    }

    @Override // defpackage.n80
    public void d(gn gnVar) {
        this.a.setSystemWindowInsets(gnVar.c());
    }

    public j80() {
        this.a = i80.f();
    }
}
