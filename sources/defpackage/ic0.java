package defpackage;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes.dex */
public final class ic0 implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    public final /* synthetic */ kc0 b;

    public ic0(kc0 kc0Var, DisplayManager displayManager) {
        this.b = kc0Var;
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.b.a(this.a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
