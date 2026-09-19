package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.extremestudios.musicmanevo.R;
import defpackage.a23;
import defpackage.d4;
import defpackage.e4;
import defpackage.ej1;
import defpackage.fq;
import defpackage.g4;
import defpackage.i8;
import defpackage.jq;
import defpackage.kw;
import defpackage.m5;
import defpackage.m6;
import defpackage.nq;
import defpackage.oq;
import defpackage.sq;
import defpackage.u6;
import defpackage.yd;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends u6 {
    @Override // defpackage.u6
    public final d4 a(Context context, AttributeSet attributeSet) {
        return new fq(context, attributeSet);
    }

    @Override // defpackage.u6
    public final e4 b(Context context, AttributeSet attributeSet) {
        return new jq(context, attributeSet);
    }

    @Override // defpackage.u6
    public final g4 c(Context context, AttributeSet attributeSet) {
        return new nq(context, attributeSet);
    }

    @Override // defpackage.u6
    public final m5 d(Context context, AttributeSet attributeSet) {
        oq oqVar = new oq(i8.s(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]), attributeSet);
        Context context2 = oqVar.getContext();
        ej1.c(context2, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
        int[] iArr = kw.h;
        ej1.e(context2, attributeSet, iArr, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            oqVar.setButtonTintList(yd.f(context2, typedArrayObtainStyledAttributes, 0));
        }
        oqVar.k = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        return oqVar;
    }

    @Override // defpackage.u6
    public final m6 e(Context context, AttributeSet attributeSet) {
        sq sqVar = new sq(i8.s(context, attributeSet, android.R.attr.textViewStyle, 0, new int[0]), attributeSet, android.R.attr.textViewStyle);
        Context context2 = sqVar.getContext();
        if (a23.n(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = kw.l;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iJ = sq.j(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iJ == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, kw.k);
                    int iJ2 = sq.j(sqVar.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iJ2 >= 0) {
                        sqVar.setLineHeight(iJ2);
                    }
                }
            }
        }
        return sqVar;
    }
}
