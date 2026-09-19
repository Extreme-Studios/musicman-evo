package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import defpackage.b9;
import defpackage.c9;
import defpackage.ec;
import defpackage.hn;
import defpackage.j7;
import defpackage.kw;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends hn {
    public c9 u;

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kw.b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            T(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void T(int i) {
        b9 b9Var;
        if (i != 0 && i != 1) {
            j7.p(ec.h("invalid orientation:", i));
            return;
        }
        c9 c9Var = this.u;
        if (c9Var == null || i != c9Var.b) {
            if (i == 0) {
                b9Var = new b9(0, 0);
            } else {
                if (i != 1) {
                    j7.p("invalid orientation");
                    return;
                }
                b9Var = new b9(1, 0);
            }
            this.u = b9Var;
        }
    }

    public CarouselLayoutManager() {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        T(0);
    }
}
