package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class a00 {
    public hn a;
    public hn b;
    public hn c;
    public hn d;
    public dc e;
    public dc f;
    public dc g;
    public dc h;
    public ig i;
    public ig j;
    public ig k;
    public ig l;

    public static zz a(Context context, int i, int i2, f fVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(kw.n);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            dc dcVarC = c(typedArrayObtainStyledAttributes, 5, fVar);
            dc dcVarC2 = c(typedArrayObtainStyledAttributes, 8, dcVarC);
            dc dcVarC3 = c(typedArrayObtainStyledAttributes, 9, dcVarC);
            dc dcVarC4 = c(typedArrayObtainStyledAttributes, 7, dcVarC);
            dc dcVarC5 = c(typedArrayObtainStyledAttributes, 6, dcVarC);
            zz zzVar = new zz();
            zzVar.a = hn.d(i4);
            zzVar.e = dcVarC2;
            zzVar.b = hn.d(i5);
            zzVar.f = dcVarC3;
            zzVar.c = hn.d(i6);
            zzVar.g = dcVarC4;
            zzVar.d = hn.d(i7);
            zzVar.h = dcVarC5;
            return zzVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static zz b(Context context, AttributeSet attributeSet, int i, int i2) {
        f fVar = new f(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kw.i, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, fVar);
    }

    public static dc c(TypedArray typedArray, int i, dc dcVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new f(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new vw(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dcVar;
    }

    public final boolean d() {
        return (this.b instanceof cy) && (this.a instanceof cy) && (this.c instanceof cy) && (this.d instanceof cy);
    }

    public final boolean e(RectF rectF) {
        boolean z = this.l.getClass().equals(ig.class) && this.j.getClass().equals(ig.class) && this.i.getClass().equals(ig.class) && this.k.getClass().equals(ig.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && d();
    }

    public final zz f() {
        zz zzVar = new zz();
        zzVar.a = this.a;
        zzVar.b = this.b;
        zzVar.c = this.c;
        zzVar.d = this.d;
        zzVar.e = this.e;
        zzVar.f = this.f;
        zzVar.g = this.g;
        zzVar.h = this.h;
        zzVar.i = this.i;
        zzVar.j = this.j;
        zzVar.k = this.k;
        zzVar.l = this.l;
        return zzVar;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
