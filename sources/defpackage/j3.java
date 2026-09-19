package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class j3 extends Animatable2.AnimationCallback {
    public final /* synthetic */ lq a;

    public j3(lq lqVar) {
        this.a = lqVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.a.b.t;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        nq nqVar = this.a.b;
        ColorStateList colorStateList = nqVar.t;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(nqVar.x, colorStateList.getDefaultColor()));
        }
    }
}
