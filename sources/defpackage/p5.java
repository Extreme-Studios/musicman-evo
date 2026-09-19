package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public final class p5 extends SeekBar {
    public final q5 f;

    public p5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        t30.a(getContext(), this);
        q5 q5Var = new q5(this);
        this.f = q5Var;
        q5Var.v(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q5 q5Var = this.f;
        p5 p5Var = q5Var.l;
        Drawable drawable = q5Var.m;
        if (drawable != null && drawable.isStateful() && drawable.setState(p5Var.getDrawableState())) {
            p5Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f.m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f.M(canvas);
    }
}
