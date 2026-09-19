package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.extremestudios.musicmanevo.R;
import defpackage.a00;
import defpackage.g8;
import defpackage.j7;
import defpackage.kg;
import defpackage.kw;
import defpackage.pq;
import defpackage.rq;
import defpackage.s70;
import defpackage.yd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends yd {
    public final int A;
    public final boolean B;
    public int C;
    public final boolean r;
    public int s;
    public boolean t;
    public final rq u;
    public final ColorStateList v;
    public final boolean w;
    public final a00 x;
    public boolean y;
    public final ValueAnimator z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.r = true;
        new s70(this);
        this.C = 4;
        new ArrayList();
        new SparseIntArray();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kw.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.v = yd.f(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.x = a00.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        a00 a00Var = this.x;
        if (a00Var != null) {
            rq rqVar = new rq(a00Var);
            this.u = rqVar;
            rqVar.g.c = new kg(context);
            rqVar.m();
            ColorStateList colorStateList = this.v;
            if (colorStateList != null) {
                rq rqVar2 = this.u;
                pq pqVar = rqVar2.g;
                if (pqVar.d != colorStateList) {
                    pqVar.d = colorStateList;
                    rqVar2.onStateChange(rqVar2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.u.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.z.addUpdateListener(new g8(this));
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            H(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        } else {
            H(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.B != z) {
            this.B = z;
            if (!z && this.C == 5 && this.C != 4) {
                this.C = 4;
            }
        }
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.r != z2) {
            this.r = z2;
            int i2 = (z2 && this.C == 6) ? 3 : this.C;
            if (this.C != i2) {
                this.C = i2;
            }
            I(this.C);
        }
        typedArrayObtainStyledAttributes.getBoolean(13, false);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.getBoolean(5, true);
        typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            j7.p("ratio must be a float value between 0 and 1");
            throw null;
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            if (dimensionPixelOffset < 0) {
                j7.p("offset must be greater than or equal to 0");
                throw null;
            }
            this.A = dimensionPixelOffset;
            I(this.C);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                j7.p("offset must be greater than or equal to 0");
                throw null;
            }
            this.A = i3;
            I(this.C);
        }
        typedArrayObtainStyledAttributes.getInt(12, 500);
        typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.getBoolean(19, false);
        typedArrayObtainStyledAttributes.getBoolean(20, false);
        typedArrayObtainStyledAttributes.getBoolean(21, true);
        typedArrayObtainStyledAttributes.getBoolean(15, false);
        typedArrayObtainStyledAttributes.getBoolean(16, false);
        typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.w = typedArrayObtainStyledAttributes.getBoolean(24, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void H(int i) {
        boolean z = this.t;
        if (i == -1) {
            if (z) {
                return;
            }
            this.t = true;
        } else if (z || this.s != i) {
            this.t = false;
            this.s = Math.max(0, i);
        }
    }

    public final void I(int i) {
        rq rqVar;
        if (i == 2) {
            return;
        }
        boolean z = this.C == 3 && this.w;
        if (this.y == z || (rqVar = this.u) == null) {
            return;
        }
        this.y = z;
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(rqVar.g.j, z ? 0.0f : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float f = this.y ? 0.0f : 1.0f;
        pq pqVar = rqVar.g;
        if (pqVar.j != f) {
            pqVar.j = f;
            rqVar.k = true;
            rqVar.l = true;
            rqVar.invalidateSelf();
        }
    }

    public BottomSheetBehavior() {
        this.r = true;
        new s70(this);
        this.C = 4;
        new ArrayList();
        new SparseIntArray();
    }
}
