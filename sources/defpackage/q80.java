package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class q80 extends p80 {
    public q80(y80 y80Var, WindowInsets windowInsets) {
        super(y80Var, windowInsets);
    }

    @Override // defpackage.v80
    public y80 a() {
        return y80.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.v80
    public kf e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new kf(displayCutout);
    }

    @Override // defpackage.o80, defpackage.v80
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q80)) {
            return false;
        }
        q80 q80Var = (q80) obj;
        return Objects.equals(this.c, q80Var.c) && Objects.equals(this.g, q80Var.g) && o80.y(this.h, q80Var.h);
    }

    @Override // defpackage.v80
    public int hashCode() {
        return this.c.hashCode();
    }
}
