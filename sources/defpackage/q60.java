package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class q60 {
    public static y80 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        y80 y80VarC = y80.c(rootWindowInsets, null);
        v80 v80Var = y80VarC.a;
        v80Var.p(y80VarC);
        v80Var.d(view.getRootView());
        return y80VarC;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
