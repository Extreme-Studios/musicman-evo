package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class u80 extends t80 {
    public static final y80 s = y80.c(WindowInsets.CONSUMED, null);

    public u80(y80 y80Var, WindowInsets windowInsets) {
        super(y80Var, windowInsets);
    }

    @Override // defpackage.s80, defpackage.o80, defpackage.v80
    public gn f(int i) {
        return gn.b(this.c.getInsets(x80.a(i)));
    }
}
