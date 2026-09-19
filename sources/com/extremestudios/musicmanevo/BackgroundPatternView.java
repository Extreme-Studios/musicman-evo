package com.extremestudios.musicmanevo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.be;
import defpackage.i8;

/* JADX INFO: loaded from: classes.dex */
public final class BackgroundPatternView extends View {
    public final Paint f;
    public final Drawable g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPatternView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(32.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(context.getColor(R.color.neon_purple));
        paint.setAlpha(45);
        this.f = paint;
        Drawable drawable = context.getDrawable(R.drawable.logo_wave_evo);
        if (drawable != null) {
            drawable.setTint(context.getColor(R.color.neon_purple));
            drawable.setAlpha(45);
        } else {
            drawable = null;
        }
        this.g = drawable;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        canvas.save();
        canvas.rotate(-25.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        int i = -getWidth();
        int iJ = i8.j(i, getWidth() * 2, 350);
        if (i <= iJ) {
            while (true) {
                int i2 = -getHeight();
                int iJ2 = i8.j(i2, getHeight() * 2, 300);
                if (i2 <= iJ2) {
                    while (true) {
                        Drawable drawable = this.g;
                        if (drawable != null) {
                            drawable.setBounds(i - 17, i2 - 55, i + 17, i2 - 20);
                            drawable.draw(canvas);
                        }
                        canvas.drawText("musicman evo", i, i2, this.f);
                        if (i2 == iJ2) {
                            break;
                        } else {
                            i2 += 300;
                        }
                    }
                }
                if (i == iJ) {
                    break;
                } else {
                    i += 350;
                }
            }
        }
        canvas.restore();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundPatternView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ BackgroundPatternView(Context context, AttributeSet attributeSet, int i, int i2, be beVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundPatternView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
