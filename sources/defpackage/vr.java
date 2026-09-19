package defpackage;

import android.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class vr implements ActionProvider.VisibilityListener {
    public s70 a;
    public final ActionProvider b;

    public vr(yr yrVar, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        s70 s70Var = this.a;
        if (s70Var != null) {
            rr rrVar = ((ur) s70Var.g).n;
            rrVar.h = true;
            rrVar.p(true);
        }
    }
}
