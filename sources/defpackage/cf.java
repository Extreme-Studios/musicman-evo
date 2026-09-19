package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class cf extends i8 {
    public final /* synthetic */ int C = 0;
    public final /* synthetic */ kj D;

    public cf(df dfVar, cf cfVar) {
        this.D = dfVar;
    }

    @Override // defpackage.i8
    public final View p(int i) {
        int i2 = this.C;
        kj kjVar = this.D;
        switch (i2) {
            case 0:
                Dialog dialog = ((df) kjVar).f0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + kjVar + " does not have a view");
        }
    }

    @Override // defpackage.i8
    public final boolean q() {
        switch (this.C) {
            case 0:
                return ((df) this.D).j0;
            default:
                return false;
        }
    }

    public cf(kj kjVar) {
        this.D = kjVar;
    }
}
