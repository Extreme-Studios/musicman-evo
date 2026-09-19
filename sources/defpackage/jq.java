package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class jq extends e4 implements Checkable, l00 {
    public static final int[] F = {R.attr.state_checkable};
    public static final int[] G = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public final kq i;
    public final LinkedHashSet j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public Drawable m;
    public String n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public boolean z;

    /* JADX WARN: Code duplicated, block: B:12:0x009f  */
    public jq(Context context, AttributeSet attributeSet) {
        a20 a20Var;
        int next;
        int resourceId;
        Drawable drawableF;
        super(i8.s(context, attributeSet, com.extremestudios.musicmanevo.R.attr.materialButtonStyle, com.extremestudios.musicmanevo.R.style.Widget_MaterialComponents_Button, new int[]{com.extremestudios.musicmanevo.R.attr.materialSizeOverlay}), attributeSet, com.extremestudios.musicmanevo.R.attr.materialButtonStyle);
        this.j = new LinkedHashSet();
        this.s = false;
        this.t = false;
        this.v = -1;
        this.w = -1.0f;
        this.x = -1;
        this.y = -1;
        this.B = -1;
        Context context2 = getContext();
        ej1.c(context2, attributeSet, com.extremestudios.musicmanevo.R.attr.materialButtonStyle, com.extremestudios.musicmanevo.R.style.Widget_MaterialComponents_Button);
        int[] iArr = kw.f;
        ej1.e(context2, attributeSet, iArr, com.extremestudios.musicmanevo.R.attr.materialButtonStyle, com.extremestudios.musicmanevo.R.style.Widget_MaterialComponents_Button, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.extremestudios.musicmanevo.R.attr.materialButtonStyle, com.extremestudios.musicmanevo.R.style.Widget_MaterialComponents_Button);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        int i = typedArrayObtainStyledAttributes.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.k = v51.j(i);
        this.l = yd.f(getContext(), typedArrayObtainStyledAttributes, 15);
        this.m = (!typedArrayObtainStyledAttributes.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(11, 0)) == 0 || (drawableF = jn.f(getContext(), resourceId)) == null) ? typedArrayObtainStyledAttributes.getDrawable(11) : drawableF;
        this.u = typedArrayObtainStyledAttributes.getInteger(12, 1);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(19, 0);
        if (resourceId2 != 0 && Objects.equals(context2.getResources().getResourceTypeName(resourceId2), "xml")) {
            g2 g2Var = new g2(2);
            g2Var.a();
            try {
                XmlResourceParser xml = context2.getResources().getXml(resourceId2);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (xml.getName().equals("selector")) {
                        a20.a(g2Var, context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    if (g2Var.g == 0) {
                        a20Var = null;
                    } else {
                        a20Var = new a20(g2Var);
                    }
                } catch (Throwable th) {
                    if (xml == null) {
                        throw th;
                    }
                    try {
                        xml.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                g2Var.a();
            }
        } else {
            a20Var = null;
        }
        a00 a00VarA = a20Var != null ? a20Var.b : a00.b(context2, attributeSet, com.extremestudios.musicmanevo.R.attr.materialButtonStyle, com.extremestudios.musicmanevo.R.style.Widget_MaterialComponents_Button).a();
        boolean z = typedArrayObtainStyledAttributes.getBoolean(17, false);
        kq kqVar = new kq(this, a00VarA);
        this.i = kqVar;
        kqVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        kqVar.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        kqVar.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
        kqVar.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1);
            kqVar.j = dimensionPixelSize;
            float f = dimensionPixelSize;
            zz zzVarF = kqVar.b.f();
            zzVarF.e = new f(f);
            zzVarF.f = new f(f);
            zzVarF.g = new f(f);
            zzVarF.h = new f(f);
            kqVar.b = zzVarF.a();
            kqVar.c = null;
            kqVar.d();
            kqVar.s = true;
        }
        kqVar.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(8, -1);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        kqVar.l = v51.j(i2);
        kqVar.m = yd.f(getContext(), typedArrayObtainStyledAttributes, 7);
        kqVar.n = yd.f(getContext(), typedArrayObtainStyledAttributes, 21);
        kqVar.o = yd.f(getContext(), typedArrayObtainStyledAttributes, 18);
        kqVar.t = typedArrayObtainStyledAttributes.getBoolean(6, false);
        kqVar.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        kqVar.u = typedArrayObtainStyledAttributes.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            kqVar.r = true;
            setSupportBackgroundTintList(kqVar.m);
            setSupportBackgroundTintMode(kqVar.l);
        } else {
            kqVar.c();
        }
        setPaddingRelative(paddingStart + kqVar.f, paddingTop + kqVar.h, paddingEnd + kqVar.g, paddingBottom + kqVar.i);
        setCheckedInternal(typedArrayObtainStyledAttributes.getBoolean(1, false));
        if (a20Var != null) {
            kqVar.d = c();
            if (kqVar.c != null) {
                kqVar.d();
            }
            kqVar.c = a20Var;
            kqVar.d();
        }
        setOpticalCenterEnabled(z);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.r);
        f(this.m != null);
    }

    public static /* synthetic */ void a(jq jqVar) {
        jqVar.A = jqVar.getOpticalCenterShift();
        jqVar.h();
        jqVar.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.D;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        kq kqVar = this.i;
        if (kqVar == null || !kqVar.t || this.s == z) {
            return;
        }
        this.s = z;
        refreshDrawableState();
        getParent();
        if (this.t) {
            return;
        }
        this.t = true;
        Iterator it = this.j.iterator();
        if (!it.hasNext()) {
            this.t = false;
        } else {
            it.next().getClass();
            j7.j();
        }
    }

    private void setDisplayedWidthIncrease(float f) {
        if (this.D != f) {
            this.D = f;
            h();
            invalidate();
            getParent();
        }
    }

    public final r10 c() {
        Context context = getContext();
        TypedValue typedValueM = a23.m(context, com.extremestudios.musicmanevo.R.attr.motionSpringFastSpatial);
        int[] iArr = kw.j;
        TypedArray typedArrayObtainStyledAttributes = typedValueM == null ? context.obtainStyledAttributes(null, iArr, 0, com.extremestudios.musicmanevo.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueM.resourceId, iArr);
        r10 r10Var = new r10();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            r10Var.a = Math.sqrt(f);
            r10Var.c = false;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            r10Var.b = f2;
            r10Var.c = false;
            typedArrayObtainStyledAttributes.recycle();
            return r10Var;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean d() {
        kq kqVar = this.i;
        return (kqVar == null || kqVar.r) ? false : true;
    }

    public final void e() {
        int i = this.u;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.m, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.m, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.m, null, null);
        }
    }

    public final void f(boolean z) {
        Drawable drawable = this.m;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.m = drawableMutate;
            drawableMutate.setTintList(this.l);
            PorterDuff.Mode mode = this.k;
            if (mode != null) {
                this.m.setTintMode(mode);
            }
            int intrinsicWidth = this.o;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.m.getIntrinsicWidth();
            }
            int intrinsicHeight = this.o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.m;
            int i = this.p;
            int i2 = this.q;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.m.setVisible(true, z);
        }
        if (z) {
            e();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.u;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.m) || (((i3 == 3 || i3 == 4) && drawable5 != this.m) || ((i3 == 16 || i3 == 32) && drawable4 != this.m))) {
            e();
        }
    }

    public final void g(int i, int i2) {
        if (this.m == null || getLayout() == null) {
            return;
        }
        int i3 = this.u;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.p = 0;
                if (i3 == 16) {
                    this.q = 0;
                    f(false);
                    return;
                }
                int intrinsicHeight = this.o;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.m.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.r) - getPaddingBottom()) / 2);
                if (this.q != iMax) {
                    this.q = iMax;
                    f(false);
                    return;
                }
                return;
            }
            return;
        }
        this.q = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.u;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.p = 0;
            f(false);
            return;
        }
        int intrinsicWidth = this.o;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.m.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.r) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.u == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.p != textLayoutWidth) {
            this.p = textLayoutWidth;
            f(false);
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.n)) {
            return this.n;
        }
        kq kqVar = this.i;
        return ((kqVar == null || !kqVar.t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.B;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (d()) {
            return this.i.j;
        }
        return 0;
    }

    public r10 getCornerSpringForce() {
        return this.i.d;
    }

    public Drawable getIcon() {
        return this.m;
    }

    public int getIconGravity() {
        return this.u;
    }

    public int getIconPadding() {
        return this.r;
    }

    public int getIconSize() {
        return this.o;
    }

    public ColorStateList getIconTint() {
        return this.l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.k;
    }

    public int getInsetBottom() {
        return this.i.i;
    }

    public int getInsetTop() {
        return this.i.h;
    }

    public ColorStateList getRippleColor() {
        if (d()) {
            return this.i.o;
        }
        return null;
    }

    public a00 getShapeAppearanceModel() {
        if (d()) {
            return this.i.b;
        }
        j7.e("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public a20 getStateListShapeAppearanceModel() {
        if (d()) {
            return this.i.c;
        }
        j7.e("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (d()) {
            return this.i.n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (d()) {
            return this.i.k;
        }
        return 0;
    }

    @Override // defpackage.e4
    public ColorStateList getSupportBackgroundTintList() {
        return d() ? this.i.m : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.e4
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return d() ? this.i.l : super.getSupportBackgroundTintMode();
    }

    public final void h() {
        int i = (int) (this.D - this.E);
        int i2 = (i / 2) + this.A;
        getLayoutParams().width = (int) (this.w + i);
        setPaddingRelative(this.x + i2, getPaddingTop(), (this.y + i) - i2, getPaddingBottom());
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.s;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (d()) {
            rq rqVarA = this.i.a(false);
            kg kgVar = rqVarA.g.c;
            if (kgVar == null || !kgVar.a) {
                return;
            }
            float elevation = 0.0f;
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                elevation += ((View) parent).getElevation();
            }
            pq pqVar = rqVarA.g;
            if (pqVar.m != elevation) {
                pqVar.m = elevation;
                rqVarA.m();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        kq kqVar = this.i;
        if (kqVar != null && kqVar.t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        if (this.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.e4, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.s);
    }

    @Override // defpackage.e4, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        kq kqVar = this.i;
        accessibilityNodeInfo.setCheckable(kqVar != null && kqVar.t);
        accessibilityNodeInfo.setChecked(this.s);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.e4, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        g(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.v != i6) {
            this.v = i6;
            this.w = -1.0f;
        }
        if (this.w == -1.0f) {
            this.w = getMeasuredWidth();
            getParent();
        }
        if (this.B == -1) {
            if (this.m == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.o;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.m.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.B = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.x == -1) {
            this.x = getPaddingStart();
        }
        if (this.y == -1) {
            this.y = getPaddingEnd();
        }
        getParent();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof iq)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        iq iqVar = (iq) parcelable;
        super.onRestoreInstanceState(iqVar.f);
        setChecked(iqVar.h);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        iq iqVar = new iq(super.onSaveInstanceState());
        iqVar.h = this.s;
        return iqVar;
    }

    @Override // defpackage.e4, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        g(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.i.u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.m != null) {
            if (this.m.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.n = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!d()) {
            super.setBackgroundColor(i);
            return;
        }
        kq kqVar = this.i;
        if (kqVar.a(false) != null) {
            kqVar.a(false).setTint(i);
        }
    }

    @Override // defpackage.e4, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!d()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        kq kqVar = this.i;
        kqVar.r = true;
        jq jqVar = kqVar.a;
        jqVar.setSupportBackgroundTintList(kqVar.m);
        jqVar.setSupportBackgroundTintMode(kqVar.l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.e4, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? jn.f(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (d()) {
            this.i.t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (d()) {
            kq kqVar = this.i;
            if (kqVar.s && kqVar.j == i) {
                return;
            }
            kqVar.j = i;
            kqVar.s = true;
            float f = i;
            zz zzVarF = kqVar.b.f();
            zzVarF.e = new f(f);
            zzVarF.f = new f(f);
            zzVarF.g = new f(f);
            zzVarF.h = new f(f);
            kqVar.b = zzVarF.a();
            kqVar.c = null;
            kqVar.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (d()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(r10 r10Var) {
        kq kqVar = this.i;
        kqVar.d = r10Var;
        if (kqVar.c != null) {
            kqVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.E = Math.min(i, this.B);
        h();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (d()) {
            rq rqVarA = this.i.a(false);
            pq pqVar = rqVarA.g;
            if (pqVar.n != f) {
                pqVar.n = f;
                rqVarA.m();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.m != drawable) {
            this.m = drawable;
            f(true);
            g(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.u != i) {
            this.u = i;
            g(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.r != i) {
            this.r = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? jn.f(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            j7.p("iconSize cannot be less than 0");
        } else if (this.o != i) {
            this.o = i;
            f(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            f(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.k != mode) {
            this.k = mode;
            f(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(jn.e(getContext(), i));
    }

    public void setInsetBottom(int i) {
        kq kqVar = this.i;
        kqVar.b(kqVar.h, i);
    }

    public void setInsetTop(int i) {
        kq kqVar = this.i;
        kqVar.b(i, kqVar.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.z != z) {
            this.z = z;
            kq kqVar = this.i;
            if (z) {
                an anVar = new an(this);
                kqVar.e = anVar;
                rq rqVarA = kqVar.a(false);
                if (rqVarA != null) {
                    rqVarA.I = anVar;
                }
            } else {
                kqVar.e = null;
                rq rqVarA2 = kqVar.a(false);
                if (rqVarA2 != null) {
                    rqVarA2.I = null;
                }
            }
            post(new x1(6, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (d()) {
            kq kqVar = this.i;
            jq jqVar = kqVar.a;
            if (kqVar.o != colorStateList) {
                kqVar.o = colorStateList;
                if (jqVar.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) jqVar.getBackground()).setColor(vx.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (d()) {
            setRippleColor(jn.e(getContext(), i));
        }
    }

    @Override // defpackage.l00
    public void setShapeAppearanceModel(a00 a00Var) {
        if (!d()) {
            j7.e("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        kq kqVar = this.i;
        kqVar.b = a00Var;
        kqVar.c = null;
        kqVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (d()) {
            kq kqVar = this.i;
            kqVar.q = z;
            kqVar.e();
        }
    }

    public void setStateListShapeAppearanceModel(a20 a20Var) {
        if (!d()) {
            j7.e("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        kq kqVar = this.i;
        if (kqVar.d == null && a20Var.a > 1) {
            kqVar.d = c();
            if (kqVar.c != null) {
                kqVar.d();
            }
        }
        kqVar.c = a20Var;
        kqVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (d()) {
            kq kqVar = this.i;
            if (kqVar.n != colorStateList) {
                kqVar.n = colorStateList;
                kqVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (d()) {
            setStrokeColor(jn.e(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (d()) {
            kq kqVar = this.i;
            if (kqVar.k != i) {
                kqVar.k = i;
                kqVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (d()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.e4
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!d()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        kq kqVar = this.i;
        if (kqVar.m != colorStateList) {
            kqVar.m = colorStateList;
            if (kqVar.a(false) != null) {
                kqVar.a(false).setTintList(kqVar.m);
            }
        }
    }

    @Override // defpackage.e4
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!d()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        kq kqVar = this.i;
        if (kqVar.l != mode) {
            kqVar.l = mode;
            if (kqVar.a(false) == null || kqVar.l == null) {
                return;
            }
            kqVar.a(false).setTintMode(kqVar.l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        g(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.i.u = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.w = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.C != i) {
            this.C = i;
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.s);
    }

    public void setOnPressedChangeListenerInternal(hq hqVar) {
    }

    public void setSizeChange(b20 b20Var) {
    }
}
