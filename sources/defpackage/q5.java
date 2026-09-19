package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public final class q5 extends z61 {
    public final p5 l;
    public Drawable m;
    public ColorStateList n;
    public PorterDuff.Mode o;
    public boolean p;
    public boolean q;

    public q5(p5 p5Var) {
        super(1, p5Var);
        this.n = null;
        this.o = null;
        this.p = false;
        this.q = false;
        this.l = p5Var;
    }

    public final void L() {
        Drawable drawable = this.m;
        if (drawable != null) {
            if (this.p || this.q) {
                Drawable drawableMutate = drawable.mutate();
                this.m = drawableMutate;
                if (this.p) {
                    drawableMutate.setTintList(this.n);
                }
                if (this.q) {
                    this.m.setTintMode(this.o);
                }
                if (this.m.isStateful()) {
                    this.m.setState(this.l.getDrawableState());
                }
            }
        }
    }

    public final void M(Canvas canvas) {
        if (this.m != null) {
            p5 p5Var = this.l;
            int max = p5Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.m.getIntrinsicWidth();
                int intrinsicHeight = this.m.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.m.setBounds(-i, -i2, i, i2);
                float width = ((p5Var.getWidth() - p5Var.getPaddingLeft()) - p5Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(p5Var.getPaddingLeft(), p5Var.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.m.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // defpackage.z61
    public final void v(AttributeSet attributeSet, int i) {
        super.v(attributeSet, R.attr.seekBarStyle);
        p5 p5Var = this.l;
        Context context = p5Var.getContext();
        int[] iArr = lw.g;
        r52 r52VarR = r52.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) r52VarR.h;
        w60.h(p5Var, p5Var.getContext(), iArr, attributeSet, (TypedArray) r52VarR.h, R.attr.seekBarStyle);
        Drawable drawableL = r52VarR.l(0);
        if (drawableL != null) {
            p5Var.setThumb(drawableL);
        }
        Drawable drawableK = r52VarR.k(1);
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.m = drawableK;
        if (drawableK != null) {
            drawableK.setCallback(p5Var);
            drawableK.setLayoutDirection(p5Var.getLayoutDirection());
            if (drawableK.isStateful()) {
                drawableK.setState(p5Var.getDrawableState());
            }
            L();
        }
        p5Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.o = sf.c(typedArray.getInt(3, -1), this.o);
            this.q = true;
        }
        if (typedArray.hasValue(2)) {
            this.n = r52VarR.j(2);
            this.p = true;
        }
        r52VarR.x();
        L();
    }
}
