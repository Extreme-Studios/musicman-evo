package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.extremestudios.musicmanevo.R;
import defpackage.b;
import defpackage.f1;
import defpackage.h70;
import defpackage.j7;
import defpackage.jn;
import defpackage.js;
import defpackage.lw;
import defpackage.m70;
import defpackage.o1;
import defpackage.r1;
import defpackage.rr;
import defpackage.v1;
import defpackage.w60;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final b f;
    public final Context g;
    public ActionMenuView h;
    public r1 i;
    public int j;
    public h70 k;
    public boolean l;
    public boolean m;
    public CharSequence n;
    public CharSequence o;
    public View p;
    public View q;
    public View r;
    public LinearLayout s;
    public TextView t;
    public TextView u;
    public final int v;
    public final int w;
    public boolean x;
    public final int y;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        this.f = new b(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.g = context;
        } else {
            this.g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lw.d, i, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : jn.f(context, resourceId));
        this.v = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.w = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.j = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.y = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(v1 v1Var) {
        View view = this.p;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.y, (ViewGroup) this, false);
            this.p = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.p);
        }
        View viewFindViewById = this.p.findViewById(R.id.action_mode_close_button);
        this.q = viewFindViewById;
        viewFindViewById.setOnClickListener(new f1(i, v1Var));
        rr rrVarC = v1Var.c();
        r1 r1Var = this.i;
        if (r1Var != null) {
            r1Var.d();
            o1 o1Var = r1Var.y;
            if (o1Var != null && o1Var.b()) {
                o1Var.i.dismiss();
            }
        }
        r1 r1Var2 = new r1(getContext());
        this.i = r1Var2;
        r1Var2.q = true;
        r1Var2.r = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        rrVarC.b(this.i, this.g);
        r1 r1Var3 = this.i;
        js jsVar = r1Var3.m;
        if (jsVar == null) {
            js jsVar2 = (js) r1Var3.i.inflate(r1Var3.k, (ViewGroup) this, false);
            r1Var3.m = jsVar2;
            jsVar2.b(r1Var3.h);
            r1Var3.g();
        }
        js jsVar3 = r1Var3.m;
        if (jsVar != jsVar3) {
            ((ActionMenuView) jsVar3).setPresenter(r1Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) jsVar3;
        this.h = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.h, layoutParams);
    }

    public final void d() {
        if (this.s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.s = linearLayout;
            this.t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.u = (TextView) this.s.findViewById(R.id.action_bar_subtitle);
            int i = this.v;
            if (i != 0) {
                this.t.setTextAppearance(getContext(), i);
            }
            int i2 = this.w;
            if (i2 != 0) {
                this.u.setTextAppearance(getContext(), i2);
            }
        }
        this.t.setText(this.n);
        this.u.setText(this.o);
        boolean zIsEmpty = TextUtils.isEmpty(this.n);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.o);
        this.u.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.s.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.s.getParent() == null) {
            addView(this.s);
        }
    }

    public final void e() {
        removeAllViews();
        this.r = null;
        this.h = null;
        this.i = null;
        View view = this.q;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.k != null ? this.f.b : getVisibility();
    }

    public int getContentHeight() {
        return this.j;
    }

    public CharSequence getSubtitle() {
        return this.o;
    }

    public CharSequence getTitle() {
        return this.n;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            h70 h70Var = this.k;
            if (h70Var != null) {
                h70Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final h70 i(int i, long j) {
        h70 h70Var = this.k;
        if (h70Var != null) {
            h70Var.b();
        }
        b bVar = this.f;
        if (i != 0) {
            h70 h70VarA = w60.a(this);
            h70VarA.a(0.0f);
            h70VarA.c(j);
            bVar.c.k = h70VarA;
            bVar.b = i;
            h70VarA.d(bVar);
            return h70VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        h70 h70VarA2 = w60.a(this);
        h70VarA2.a(1.0f);
        h70VarA2.c(j);
        bVar.c.k = h70VarA2;
        bVar.b = i;
        h70VarA2.d(bVar);
        return h70VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, lw.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        r1 r1Var = this.i;
        if (r1Var != null) {
            Configuration configuration2 = r1Var.g.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            r1Var.u = i;
            rr rrVar = r1Var.h;
            if (rrVar != null) {
                rrVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r1 r1Var = this.i;
        if (r1Var != null) {
            r1Var.d();
            o1 o1Var = this.i.y;
            if (o1Var == null || !o1Var.b()) {
                return;
            }
            o1Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.m = false;
        }
        if (!this.m) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.m = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.m = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = m70.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iG = g(this.p, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.s;
        if (linearLayout != null && this.r == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.s, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.r;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            j7.e(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            j7.e(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.j;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.p;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.h, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.s;
        if (linearLayout != null && this.r == null) {
            if (this.x) {
                this.s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.s.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.s.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.r;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.j > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.l = false;
        }
        if (!this.l) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.l = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.r;
        if (view2 != null) {
            removeView(view2);
        }
        this.r = view;
        if (view != null && (linearLayout = this.s) != null) {
            removeView(linearLayout);
            this.s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.o = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.n = charSequence;
        d();
        w60.j(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.x) {
            requestLayout();
        }
        this.x = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
