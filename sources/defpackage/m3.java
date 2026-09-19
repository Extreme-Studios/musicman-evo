package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public m3(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        n3 n3Var = new n3(null);
        Drawable drawableNewDrawable = this.a.newDrawable();
        n3Var.f = drawableNewDrawable;
        drawableNewDrawable.setCallback(n3Var.k);
        return n3Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        n3 n3Var = new n3(null);
        Drawable drawableNewDrawable = this.a.newDrawable(resources);
        n3Var.f = drawableNewDrawable;
        drawableNewDrawable.setCallback(n3Var.k);
        return n3Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        n3 n3Var = new n3(null);
        Drawable drawableNewDrawable = this.a.newDrawable(resources, theme);
        n3Var.f = drawableNewDrawable;
        drawableNewDrawable.setCallback(n3Var.k);
        return n3Var;
    }
}
