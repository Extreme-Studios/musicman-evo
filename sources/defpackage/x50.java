package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class x50 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public x50(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        y50 y50Var = new y50();
        y50Var.f = (VectorDrawable) this.a.newDrawable();
        return y50Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        y50 y50Var = new y50();
        y50Var.f = (VectorDrawable) this.a.newDrawable(resources);
        return y50Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        y50 y50Var = new y50();
        y50Var.f = (VectorDrawable) this.a.newDrawable(resources, theme);
        return y50Var;
    }
}
