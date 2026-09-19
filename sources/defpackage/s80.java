package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class s80 extends r80 {
    public static final y80 r = y80.c(WindowInsets.CONSUMED, null);

    public s80(y80 y80Var, WindowInsets windowInsets) {
        super(y80Var, windowInsets);
    }

    @Override // defpackage.o80, defpackage.v80
    public gn f(int i) {
        return gn.b(this.c.getInsets(w80.a(i)));
    }

    @Override // defpackage.o80, defpackage.v80
    public final void d(View view) {
    }
}
