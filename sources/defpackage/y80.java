package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y80 {
    public static final y80 b;
    public final v80 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = u80.s;
        } else if (i >= 30) {
            b = s80.r;
        } else {
            b = v80.b;
        }
    }

    public y80(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new u80(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new t80(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new s80(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new r80(this, windowInsets);
        } else if (i >= 28) {
            this.a = new q80(this, windowInsets);
        } else {
            this.a = new p80(this, windowInsets);
        }
    }

    public static gn a(gn gnVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, gnVar.a - i);
        int iMax2 = Math.max(0, gnVar.b - i2);
        int iMax3 = Math.max(0, gnVar.c - i3);
        int iMax4 = Math.max(0, gnVar.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? gnVar : gn.a(iMax, iMax2, iMax3, iMax4);
    }

    public static y80 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        y80 y80Var = new y80(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = w60.a;
            y80 y80VarA = q60.a(view);
            v80 v80Var = y80Var.a;
            v80Var.p(y80VarA);
            v80Var.d(view.getRootView());
            v80Var.r(view.getWindowSystemUiVisibility());
        }
        return y80Var;
    }

    public final WindowInsets b() {
        v80 v80Var = this.a;
        if (v80Var instanceof o80) {
            return ((o80) v80Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y80) {
            return Objects.equals(this.a, ((y80) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        v80 v80Var = this.a;
        if (v80Var == null) {
            return 0;
        }
        return v80Var.hashCode();
    }

    public y80() {
        this.a = new v80(this);
    }
}
