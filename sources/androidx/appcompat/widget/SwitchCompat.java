package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.eh;
import defpackage.g3;
import defpackage.h5;
import defpackage.i6;
import defpackage.jn;
import defpackage.l60;
import defpackage.lw;
import defpackage.m70;
import defpackage.qg;
import defpackage.r52;
import defpackage.sf;
import defpackage.ss0;
import defpackage.t20;
import defpackage.t30;
import defpackage.w60;
import defpackage.yd;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final t20 W = new t20(Float.class, "thumbPos");
    public static final int[] a0 = {R.attr.state_checked};
    public float A;
    public float B;
    public final VelocityTracker C;
    public final int D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final TextPaint N;
    public final ColorStateList O;
    public StaticLayout P;
    public StaticLayout Q;
    public final g3 R;
    public ObjectAnimator S;
    public h5 T;
    public eh U;
    public final Rect V;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public CharSequence t;
    public CharSequence u;
    public CharSequence v;
    public CharSequence w;
    public boolean x;
    public int y;
    public final int z;

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, i);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.C = VelocityTracker.obtain();
        this.M = true;
        this.V = new Rect();
        t30.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.N = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = lw.v;
        r52 r52VarR = r52.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r52VarR.h;
        w60.h(this, context, iArr, attributeSet, typedArray, i);
        Drawable drawableK = r52VarR.k(2);
        this.f = drawableK;
        if (drawableK != null) {
            drawableK.setCallback(this);
        }
        Drawable drawableK2 = r52VarR.k(11);
        this.k = drawableK2;
        if (drawableK2 != null) {
            drawableK2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.x = typedArray.getBoolean(3, true);
        this.p = typedArray.getDimensionPixelSize(8, 0);
        this.q = typedArray.getDimensionPixelSize(5, 0);
        this.r = typedArray.getDimensionPixelSize(6, 0);
        this.s = typedArray.getBoolean(4, false);
        ColorStateList colorStateListJ = r52VarR.j(9);
        if (colorStateListJ != null) {
            this.g = colorStateListJ;
            this.i = true;
        }
        PorterDuff.Mode modeC = sf.c(typedArray.getInt(10, -1), null);
        if (this.h != modeC) {
            this.h = modeC;
            this.j = true;
        }
        if (this.i || this.j) {
            a();
        }
        ColorStateList colorStateListJ2 = r52VarR.j(12);
        if (colorStateListJ2 != null) {
            this.l = colorStateListJ2;
            this.n = true;
        }
        PorterDuff.Mode modeC2 = sf.c(typedArray.getInt(13, -1), null);
        if (this.m != modeC2) {
            this.m = modeC2;
            this.o = true;
        }
        if (this.n || this.o) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, lw.w);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = jn.e(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.O = colorStateList;
            } else {
                this.O = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                g3 g3Var = new g3();
                g3Var.f = context2.getResources().getConfiguration().locale;
                this.R = g3Var;
            } else {
                this.R = null;
            }
            setTextOnInternal(this.t);
            setTextOffInternal(this.v);
            typedArrayObtainStyledAttributes.recycle();
        }
        new i6(this).f(attributeSet, i);
        r52VarR.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.z = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private h5 getEmojiTextViewHelper() {
        if (this.T == null) {
            this.T = new h5(this);
        }
        return this.T;
    }

    private boolean getTargetCheckedState() {
        return this.E > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = m70.a;
        int layoutDirection = getLayoutDirection();
        float f = this.E;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.k;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.V;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f;
        Rect rectB = drawable2 != null ? sf.b(drawable2) : sf.c;
        return ((((this.F - this.H) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.v = charSequence;
        TransformationMethod transformationMethodW = ((ss0) getEmojiTextViewHelper().b.g).w(this.R);
        if (transformationMethodW != null) {
            charSequence = transformationMethodW.getTransformation(charSequence, this);
        }
        this.w = charSequence;
        this.Q = null;
        if (this.x) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.t = charSequence;
        TransformationMethod transformationMethodW = ((ss0) getEmojiTextViewHelper().b.g).w(this.R);
        if (transformationMethodW != null) {
            charSequence = transformationMethodW.getTransformation(charSequence, this);
        }
        this.u = charSequence;
        this.P = null;
        if (this.x) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.i) {
                    drawableMutate.setTintList(this.g);
                }
                if (this.j) {
                    this.f.setTintMode(this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable drawableMutate = drawable.mutate();
                this.k = drawableMutate;
                if (this.n) {
                    drawableMutate.setTintList(this.l);
                }
                if (this.o) {
                    this.k.setTintMode(this.m);
                }
                if (this.k.isStateful()) {
                    this.k.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.t);
        setTextOffInternal(this.v);
        requestLayout();
    }

    public final void d() {
        if (this.U == null && ((ss0) this.T.b.g).q() && qg.k != null) {
            qg qgVarA = qg.a();
            int iB = qgVarA.b();
            if (iB == 3 || iB == 0) {
                eh ehVar = new eh(this);
                this.U = ehVar;
                qgVarA.f(ehVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.I;
        int i4 = this.J;
        int i5 = this.K;
        int i6 = this.L;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f;
        Rect rectB = drawable != null ? sf.b(drawable) : sf.c;
        Drawable drawable2 = this.k;
        Rect rect = this.V;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.k.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.k.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.H + rect.right;
            this.f.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.k;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = m70.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.r : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = m70.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.r : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return yd.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.x;
    }

    public boolean getSplitTrack() {
        return this.s;
    }

    public int getSwitchMinWidth() {
        return this.q;
    }

    public int getSwitchPadding() {
        return this.r;
    }

    public CharSequence getTextOff() {
        return this.v;
    }

    public CharSequence getTextOn() {
        return this.t;
    }

    public Drawable getThumbDrawable() {
        return this.f;
    }

    public final float getThumbPosition() {
        return this.E;
    }

    public int getThumbTextPadding() {
        return this.p;
    }

    public ColorStateList getThumbTintList() {
        return this.g;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.h;
    }

    public Drawable getTrackDrawable() {
        return this.k;
    }

    public ColorStateList getTrackTintList() {
        return this.l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.m;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.S;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.S.end();
        this.S = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, a0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.k;
        Rect rect = this.V;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.J;
        int i2 = this.L;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f;
        if (drawable != null) {
            if (!this.s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = sf.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.P : this.Q;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.N;
            ColorStateList colorStateList = this.O;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.t : this.v;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f != null) {
            Drawable drawable = this.k;
            Rect rect = this.V;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = sf.b(this.f);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = m70.a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.F + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.F) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.G;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.G + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.G;
        }
        this.I = paddingLeft;
        this.J = paddingTop;
        this.L = height;
        this.K = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.x) {
            StaticLayout staticLayout = this.P;
            TextPaint textPaint = this.N;
            if (staticLayout == null) {
                CharSequence charSequence = this.u;
                this.P = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.Q == null) {
                CharSequence charSequence2 = this.w;
                this.Q = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f;
        Rect rect = this.V;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.x) {
            iMax = (this.p * 2) + Math.max(this.P.getWidth(), this.Q.getWidth());
        } else {
            iMax = 0;
        }
        this.H = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            Rect rectB = sf.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        boolean z = this.M;
        int iMax4 = this.q;
        if (z) {
            iMax4 = Math.max(iMax4, (this.H * 2) + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.F = iMax4;
        this.G = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.t : this.v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.C;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.z;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.y == 2) {
                    this.y = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.D) {
                            boolean z2 = m70.a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.y = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.y;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.A) > f3 || Math.abs(y - this.B) > f3) {
                        this.y = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.A = x;
                        this.B = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.A;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z3 = m70.a;
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this.E;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.A = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.y == 2) {
                    this.y = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.D) {
                            boolean z4 = m70.a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.y = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f;
                Rect rect = this.V;
                drawable.getPadding(rect);
                int i3 = this.J - i;
                int i4 = (this.I + thumbOffset) - i;
                int i5 = this.H + i4 + rect.left + rect.right + i;
                int i6 = this.L + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.y = 1;
                    this.A = x3;
                    this.B = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.t;
                if (string == null) {
                    string = getResources().getString(com.extremestudios.musicmanevo.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = w60.a;
                new l60(com.extremestudios.musicmanevo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.v;
            if (string2 == null) {
                string2 = getResources().getString(com.extremestudios.musicmanevo.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = w60.a;
            new l60(com.extremestudios.musicmanevo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.S;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, W, zIsChecked ? 1.0f : 0.0f);
        this.S = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.S.setAutoCancel(true);
        this.S.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yd.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.t);
        setTextOffInternal(this.v);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.M = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.x != z) {
            this.x = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.s = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.q = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.r = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.N;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.v;
        if (string == null) {
            string = getResources().getString(com.extremestudios.musicmanevo.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = w60.a;
        new l60(com.extremestudios.musicmanevo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.t;
        if (string == null) {
            string = getResources().getString(com.extremestudios.musicmanevo.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = w60.a;
        new l60(com.extremestudios.musicmanevo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.E = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(jn.f(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.p = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(jn.f(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f || drawable == this.k;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.extremestudios.musicmanevo.R.attr.switchStyle);
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}
