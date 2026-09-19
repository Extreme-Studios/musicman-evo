package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.extremestudios.musicmanevo.R;
import defpackage.a00;
import defpackage.kc2;
import defpackage.kg;
import defpackage.kw;
import defpackage.pq;
import defpackage.rq;
import defpackage.yd;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends yd {
    public final rq r;
    public final ColorStateList s;
    public final a00 t;
    public int u;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        new kc2(this);
        this.u = 5;
        new LinkedHashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kw.o);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.s = yd.f(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.t = a00.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            typedArrayObtainStyledAttributes.getResourceId(5, -1);
        }
        a00 a00Var = this.t;
        if (a00Var != null) {
            rq rqVar = new rq(a00Var);
            this.r = rqVar;
            rqVar.g.c = new kg(context);
            rqVar.m();
            ColorStateList colorStateList = this.s;
            if (colorStateList != null) {
                rq rqVar2 = this.r;
                pq pqVar = rqVar2.g;
                if (pqVar.d != colorStateList) {
                    pqVar.d = colorStateList;
                    rqVar2.onStateChange(rqVar2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.r.setTint(typedValue.data);
            }
        }
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new kc2(this);
        this.u = 5;
        new LinkedHashSet();
    }
}
