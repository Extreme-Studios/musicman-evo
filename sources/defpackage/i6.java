package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class i6 {
    public int a;
    public boolean b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public i6() {
        this.d = new HashSet();
        this.e = new Bundle();
        this.f = new HashMap();
        this.g = new HashSet();
        this.h = new Bundle();
        this.i = new HashSet();
        this.k = new ArrayList();
        this.a = -1;
        this.c = 60000;
    }

    public static g92 c(Context context, e5 e5Var, int i) {
        ColorStateList colorStateListG;
        synchronized (e5Var) {
            colorStateListG = e5Var.a.g(context, i);
        }
        if (colorStateListG == null) {
            return null;
        }
        g92 g92Var = new g92();
        g92Var.b = true;
        g92Var.c = colorStateListG;
        return g92Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            q0.f(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            q0.f(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            v51.o(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            v51.o(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            v51.o(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        v51.o(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public void a(Drawable drawable, g92 g92Var) {
        if (drawable == null || g92Var == null) {
            return;
        }
        e5.d(drawable, g92Var, ((TextView) this.d).getDrawableState());
    }

    public void b() {
        TextView textView = (TextView) this.d;
        if (((g92) this.e) != null || ((g92) this.f) != null || ((g92) this.g) != null || ((g92) this.h) != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], (g92) this.e);
            a(compoundDrawables[1], (g92) this.f);
            a(compoundDrawables[2], (g92) this.g);
            a(compoundDrawables[3], (g92) this.h);
        }
        if (((g92) this.i) == null && ((g92) this.j) == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], (g92) this.i);
        a(compoundDrawablesRelative[2], (g92) this.j);
    }

    public ColorStateList d() {
        g92 g92Var = (g92) this.k;
        if (g92Var != null) {
            return (ColorStateList) g92Var.c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        g92 g92Var = (g92) this.k;
        if (g92Var != null) {
            return (PorterDuff.Mode) g92Var.d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:229:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:231:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:234:0x03b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:235:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:237:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:239:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:241:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    public void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        float dimensionPixelSize;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        r6 r6Var = (r6) this.l;
        TextView textView = (TextView) this.d;
        Context context = textView.getContext();
        e5 e5VarA = e5.a();
        int[] iArr = lw.h;
        r52 r52VarR = r52.r(context, attributeSet, iArr, i);
        w60.h(textView, textView.getContext(), iArr, attributeSet, (TypedArray) r52VarR.h, i);
        TypedArray typedArray = (TypedArray) r52VarR.h;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.e = c(context, e5VarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f = c(context, e5VarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.g = c(context, e5VarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.h = c(context, e5VarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.i = c(context, e5VarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.j = c(context, e5VarA, typedArray.getResourceId(6, 0));
        }
        r52VarR.x();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = lw.w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            r52 r52Var = new r52(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            n(context, r52Var);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (Build.VERSION.SDK_INT < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            r52Var.x();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        r52 r52Var2 = new r52(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i4 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, r52Var2);
        r52Var2.x();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = (Typeface) this.m;
        if (typeface != null) {
            if (this.c == -1) {
                textView.setTypeface(typeface, this.a);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            g6.d(textView, string);
        }
        if (string2 != null) {
            f6.b(textView, f6.a(string2));
        }
        Context context2 = r6Var.j;
        int[] iArr3 = lw.i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = r6Var.i;
        w60.h(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            r6Var.a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                r6Var.f = r6.b(iArr4);
                r6Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!r6Var.j()) {
            r6Var.a = 0;
        } else if (r6Var.a == 1) {
            if (!r6Var.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                r6Var.k(dimension2, f, dimension);
            }
            r6Var.h();
        }
        if (m70.c && r6Var.a != 0) {
            int[] iArr5 = r6Var.f;
            if (iArr5.length > 0) {
                if (g6.a(textView) != -1.0f) {
                    g6.b(textView, Math.round(r6Var.d), Math.round(r6Var.e), Math.round(r6Var.c), 0);
                } else {
                    g6.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? e5VarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? e5VarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? e5VarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? e5VarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? e5VarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? e5VarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = jn.e(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(sf.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i6 = typedValuePeekValue.data;
                int i7 = i6 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i6);
                i3 = i7;
                i2 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i2) {
                yd.m(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i2) {
                yd.n(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i3 == i2) {
                    yd.o(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    s0.h(textView, i3, dimensionPixelSize);
                } else {
                    yd.o(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i2 = -1;
        dimensionPixelSize = -1.0f;
        i3 = i2;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i2) {
            yd.m(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            yd.n(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == i2) {
                yd.o(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                s0.h(textView, i3, dimensionPixelSize);
            } else {
                yd.o(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public void g(Context context, int i) {
        String string;
        TextView textView = (TextView) this.d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, lw.w);
        r52 r52Var = new r52(context, typedArrayObtainStyledAttributes);
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, r52Var);
        if (Build.VERSION.SDK_INT >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            g6.d(textView, string);
        }
        r52Var.x();
        Typeface typeface = (Typeface) this.m;
        if (typeface != null) {
            textView.setTypeface(typeface, this.a);
        }
    }

    public void i(int i, int i2, int i3, int i4) {
        r6 r6Var = (r6) this.l;
        if (r6Var.j()) {
            DisplayMetrics displayMetrics = r6Var.j.getResources().getDisplayMetrics();
            r6Var.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (r6Var.h()) {
                r6Var.a();
            }
        }
    }

    public void j(int[] iArr, int i) {
        r6 r6Var = (r6) this.l;
        if (r6Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = r6Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                r6Var.f = r6.b(iArrCopyOf);
                if (!r6Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                r6Var.g = false;
            }
            if (r6Var.h()) {
                r6Var.a();
            }
        }
    }

    public void k(int i) {
        r6 r6Var = (r6) this.l;
        if (r6Var.j()) {
            if (i == 0) {
                r6Var.a = 0;
                r6Var.d = -1.0f;
                r6Var.e = -1.0f;
                r6Var.c = -1.0f;
                r6Var.f = new int[0];
                r6Var.b = false;
                return;
            }
            if (i != 1) {
                j7.p(ec.h("Unknown auto-size text type: ", i));
                return;
            }
            DisplayMetrics displayMetrics = r6Var.j.getResources().getDisplayMetrics();
            r6Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (r6Var.h()) {
                r6Var.a();
            }
        }
    }

    public void l(ColorStateList colorStateList) {
        if (((g92) this.k) == null) {
            this.k = new g92();
        }
        g92 g92Var = (g92) this.k;
        g92Var.c = colorStateList;
        g92Var.b = colorStateList != null;
        this.e = g92Var;
        this.f = g92Var;
        this.g = g92Var;
        this.h = g92Var;
        this.i = g92Var;
        this.j = g92Var;
    }

    public void m(PorterDuff.Mode mode) {
        if (((g92) this.k) == null) {
            this.k = new g92();
        }
        g92 g92Var = (g92) this.k;
        g92Var.d = mode;
        g92Var.a = mode != null;
        this.e = g92Var;
        this.f = g92Var;
        this.g = g92Var;
        this.h = g92Var;
        this.i = g92Var;
        this.j = g92Var;
    }

    public void n(Context context, r52 r52Var) {
        String string;
        int i = this.a;
        TypedArray typedArray = (TypedArray) r52Var.h;
        this.a = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.c = i3;
            if (i3 != -1) {
                this.a &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.b = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.m = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.m = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.m = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.m = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.c;
        int i7 = this.a;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference((TextView) this.d);
            d6 d6Var = new d6();
            d6Var.d = this;
            d6Var.a = i6;
            d6Var.b = i7;
            d6Var.c = weakReference;
            try {
                Typeface typefaceM = r52Var.m(i5, this.a, d6Var);
                if (typefaceM != null) {
                    if (i2 < 28 || this.c == -1) {
                        this.m = typefaceM;
                    } else {
                        this.m = h6.a(Typeface.create(typefaceM, 0), this.c, (this.a & 2) != 0);
                    }
                }
                this.b = ((Typeface) this.m) == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (((Typeface) this.m) != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.c == -1) {
            this.m = Typeface.create(string, this.a);
        } else {
            this.m = h6.a(Typeface.create(string, 0), this.c, (this.a & 2) != 0);
        }
    }

    public i6(TextView textView) {
        this.a = 0;
        this.c = -1;
        this.d = textView;
        this.l = new r6(textView);
    }
}
