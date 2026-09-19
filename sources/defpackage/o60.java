package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class o60 implements View.OnApplyWindowInsetsListener {
    public y80 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ lu c;

    public o60(View view, lu luVar) {
        this.b = view;
        this.c = luVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        y80 y80VarC = y80.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        lu luVar = this.c;
        if (i < 30) {
            p60.a(windowInsets, this.b);
            if (y80VarC.equals(this.a)) {
                return ((s70) luVar).I(view, y80VarC).b();
            }
        }
        this.a = y80VarC;
        y80 y80VarI = ((s70) luVar).I(view, y80VarC);
        if (i >= 30) {
            return y80VarI.b();
        }
        n60.c(view);
        return y80VarI.b();
    }
}
