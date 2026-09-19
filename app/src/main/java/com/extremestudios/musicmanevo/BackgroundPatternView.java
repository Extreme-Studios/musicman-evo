package com.extremestudios.musicmanevo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.be;

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
        // Decompiled modulo helper could produce a non-aligned endpoint and lock onDraw forever.
        for (int x = -getWidth(); x <= getWidth() * 2; x += 350) {
            for (int y = -getHeight(); y <= getHeight() * 2; y += 300) {
                Drawable drawable = this.g;
                if (drawable != null) {
                    drawable.setBounds(x - 17, y - 55, x + 17, y - 20);
                    drawable.draw(canvas);
                }
                canvas.drawText("musicman evo", x, y, this.f);
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
