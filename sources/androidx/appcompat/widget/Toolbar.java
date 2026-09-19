package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.extremestudios.musicmanevo.R;
import defpackage.a40;
import defpackage.b40;
import defpackage.c40;
import defpackage.d40;
import defpackage.dr0;
import defpackage.e40;
import defpackage.ey;
import defpackage.f1;
import defpackage.f40;
import defpackage.g40;
import defpackage.hn;
import defpackage.i40;
import defpackage.i5;
import defpackage.j5;
import defpackage.jn;
import defpackage.lw;
import defpackage.m6;
import defpackage.m70;
import defpackage.n20;
import defpackage.q7;
import defpackage.r1;
import defpackage.r52;
import defpackage.rj;
import defpackage.rr;
import defpackage.s70;
import defpackage.ur;
import defpackage.w60;
import defpackage.zd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public final int B;
    public CharSequence C;
    public CharSequence D;
    public ColorStateList E;
    public ColorStateList F;
    public boolean G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public final int[] K;
    public final r52 L;
    public ArrayList M;
    public final s70 N;
    public i40 O;
    public r1 P;
    public c40 Q;
    public boolean R;
    public OnBackInvokedCallback S;
    public OnBackInvokedDispatcher T;
    public boolean U;
    public final q7 V;
    public ActionMenuView f;
    public m6 g;
    public m6 h;
    public i5 i;
    public j5 j;
    public final Drawable k;
    public final CharSequence l;
    public i5 m;
    public View n;
    public Context o;
    public int p;
    public int q;
    public int r;
    public final int s;
    public final int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public ey y;
    public int z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = 8388627;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new int[2];
        this.L = new r52(new a40(this, 1));
        this.M = new ArrayList();
        this.N = new s70(8, this);
        this.V = new q7(9, this);
        Context context2 = getContext();
        int[] iArr = lw.x;
        r52 r52VarR = r52.r(context2, attributeSet, iArr, i);
        w60.h(this, context, iArr, attributeSet, (TypedArray) r52VarR.h, i);
        TypedArray typedArray = (TypedArray) r52VarR.h;
        this.q = typedArray.getResourceId(28, 0);
        this.r = typedArray.getResourceId(19, 0);
        this.B = typedArray.getInteger(0, 8388627);
        this.s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.x = dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        this.u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.x = dimensionPixelOffset5;
        }
        this.t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        ey eyVar = this.y;
        eyVar.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            eyVar.e = dimensionPixelSize;
            eyVar.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            eyVar.f = dimensionPixelSize2;
            eyVar.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            eyVar.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.k = r52VarR.k(4);
        this.l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableK = r52VarR.k(16);
        if (drawableK != null) {
            setNavigationIcon(drawableK);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableK2 = r52VarR.k(11);
        if (drawableK2 != null) {
            setLogo(drawableK2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(r52VarR.j(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(r52VarR.j(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        r52VarR.x();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new n20(getContext());
    }

    public static d40 h() {
        d40 d40Var = new d40(-2, -2);
        d40Var.b = 0;
        d40Var.a = 8388627;
        return d40Var;
    }

    public static d40 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof d40;
        if (z) {
            d40 d40Var = (d40) layoutParams;
            d40 d40Var2 = new d40(d40Var);
            d40Var2.b = 0;
            d40Var2.b = d40Var.b;
            return d40Var2;
        }
        if (z) {
            d40 d40Var3 = new d40((d40) layoutParams);
            d40Var3.b = 0;
            return d40Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            d40 d40Var4 = new d40(layoutParams);
            d40Var4.b = 0;
            return d40Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        d40 d40Var5 = new d40(marginLayoutParams);
        d40Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) d40Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) d40Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) d40Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) d40Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return d40Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                d40 d40Var = (d40) childAt.getLayoutParams();
                if (d40Var.b == 0 && s(childAt)) {
                    int i3 = d40Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            d40 d40Var2 = (d40) childAt2.getLayoutParams();
            if (d40Var2.b == 0 && s(childAt2)) {
                int i5 = d40Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        d40 d40VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            d40VarI = h();
        } else {
            d40VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (d40) layoutParams;
        }
        d40VarI.b = 1;
        if (!z || this.n == null) {
            addView(view, d40VarI);
        } else {
            view.setLayoutParams(d40VarI);
            this.J.add(view);
        }
    }

    public final void c() {
        if (this.m == null) {
            i5 i5Var = new i5(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.m = i5Var;
            i5Var.setImageDrawable(this.k);
            this.m.setContentDescription(this.l);
            d40 d40VarH = h();
            d40VarH.a = (this.s & 112) | 8388611;
            d40VarH.b = 2;
            this.m.setLayoutParams(d40VarH);
            this.m.setOnClickListener(new f1(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof d40);
    }

    public final void d() {
        if (this.y == null) {
            ey eyVar = new ey();
            eyVar.a = 0;
            eyVar.b = 0;
            eyVar.c = Integer.MIN_VALUE;
            eyVar.d = Integer.MIN_VALUE;
            eyVar.e = 0;
            eyVar.f = 0;
            eyVar.g = false;
            eyVar.h = false;
            this.y = eyVar;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView.u == null) {
            rr rrVar = (rr) actionMenuView.getMenu();
            if (this.Q == null) {
                this.Q = new c40(this);
            }
            this.f.setExpandedActionViewsExclusive(true);
            rrVar.b(this.Q, this.o);
            t();
        }
    }

    public final void f() {
        if (this.f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f = actionMenuView;
            actionMenuView.setPopupTheme(this.p);
            this.f.setOnMenuItemClickListener(this.N);
            ActionMenuView actionMenuView2 = this.f;
            dr0 dr0Var = new dr0(8, this);
            actionMenuView2.getClass();
            actionMenuView2.z = dr0Var;
            d40 d40VarH = h();
            d40VarH.a = (this.s & 112) | 8388613;
            this.f.setLayoutParams(d40VarH);
            b(this.f, false);
        }
    }

    public final void g() {
        if (this.i == null) {
            this.i = new i5(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            d40 d40VarH = h();
            d40VarH.a = (this.s & 112) | 8388611;
            this.i.setLayoutParams(d40VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d40 d40Var = new d40(context, attributeSet);
        d40Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lw.b);
        d40Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        d40Var.b = 0;
        return d40Var;
    }

    public CharSequence getCollapseContentDescription() {
        i5 i5Var = this.m;
        if (i5Var != null) {
            return i5Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        i5 i5Var = this.m;
        if (i5Var != null) {
            return i5Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        ey eyVar = this.y;
        if (eyVar != null) {
            return eyVar.g ? eyVar.a : eyVar.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        ey eyVar = this.y;
        if (eyVar != null) {
            return eyVar.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        ey eyVar = this.y;
        if (eyVar != null) {
            return eyVar.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        ey eyVar = this.y;
        if (eyVar != null) {
            return eyVar.g ? eyVar.b : eyVar.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        rr rrVar;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (rrVar = actionMenuView.u) == null || !rrVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        j5 j5Var = this.j;
        if (j5Var != null) {
            return j5Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        j5 j5Var = this.j;
        if (j5Var != null) {
            return j5Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f.getMenu();
    }

    public View getNavButtonView() {
        return this.i;
    }

    public CharSequence getNavigationContentDescription() {
        i5 i5Var = this.i;
        if (i5Var != null) {
            return i5Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        i5 i5Var = this.i;
        if (i5Var != null) {
            return i5Var.getDrawable();
        }
        return null;
    }

    public r1 getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.o;
    }

    public int getPopupTheme() {
        return this.p;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    public final TextView getSubtitleTextView() {
        return this.h;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public int getTitleMarginBottom() {
        return this.x;
    }

    public int getTitleMarginEnd() {
        return this.v;
    }

    public int getTitleMarginStart() {
        return this.u;
    }

    public int getTitleMarginTop() {
        return this.w;
    }

    public final TextView getTitleTextView() {
        return this.g;
    }

    public zd getWrapper() {
        Drawable drawable;
        if (this.O == null) {
            i40 i40Var = new i40();
            i40Var.n = 0;
            i40Var.a = this;
            i40Var.h = getTitle();
            i40Var.i = getSubtitle();
            i40Var.g = i40Var.h != null;
            i40Var.f = getNavigationIcon();
            r52 r52VarR = r52.r(getContext(), null, lw.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) r52VarR.h;
            i40Var.o = r52VarR.k(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                i40Var.g = true;
                i40Var.h = text;
                if ((i40Var.b & 8) != 0) {
                    setTitle(text);
                    if (i40Var.g) {
                        w60.j(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                i40Var.i = text2;
                if ((i40Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableK = r52VarR.k(20);
            if (drawableK != null) {
                i40Var.e = drawableK;
                i40Var.c();
            }
            Drawable drawableK2 = r52VarR.k(17);
            if (drawableK2 != null) {
                i40Var.d = drawableK2;
                i40Var.c();
            }
            if (i40Var.f == null && (drawable = i40Var.o) != null) {
                i40Var.f = drawable;
                if ((i40Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            i40Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = i40Var.c;
                if (view != null && (i40Var.b & 16) != 0) {
                    removeView(view);
                }
                i40Var.c = viewInflate;
                if (viewInflate != null && (i40Var.b & 16) != 0) {
                    addView(viewInflate);
                }
                i40Var.a(i40Var.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.y.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.q = resourceId2;
                m6 m6Var = this.g;
                if (m6Var != null) {
                    m6Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.r = resourceId3;
                m6 m6Var2 = this.h;
                if (m6Var2 != null) {
                    m6Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            r52VarR.x();
            if (R.string.abc_action_bar_up_description != i40Var.n) {
                i40Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = i40Var.n;
                    i40Var.j = i != 0 ? getContext().getString(i) : null;
                    i40Var.b();
                }
            }
            i40Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new g40(i40Var));
            this.O = i40Var;
        }
        return this.O;
    }

    public final int j(View view, int i) {
        d40 d40Var = (d40) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = d40Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.B & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) d40Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) d40Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) d40Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.L.h).iterator();
        while (it.hasNext()) {
            ((rj) it.next()).a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.J.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        d40 d40Var = (d40) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) d40Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) d40Var).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.H = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zS;
        boolean zS2;
        int measuredHeight;
        m6 m6Var;
        m6 m6Var2;
        d40 d40Var;
        d40 d40Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iO2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        j5 j5Var;
        View view;
        ActionMenuView actionMenuView;
        i5 i5Var;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.K;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = w60.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (s(this.i)) {
            i5 i5Var2 = this.i;
            if (z3) {
                iP = p(i5Var2, i26, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(i5Var2, paddingLeft, iMin2, iArr);
            }
            if (s(this.m)) {
                i5Var = this.m;
                if (z3) {
                    iP = p(i5Var, iP, iMin2, iArr);
                } else {
                    iO = o(i5Var, iO, iMin2, iArr);
                }
            }
            if (s(this.f)) {
                actionMenuView = this.f;
                if (z3) {
                    iO = o(actionMenuView, iO, iMin2, iArr);
                } else {
                    iP = p(actionMenuView, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i26 - currentContentInsetRight);
            if (s(this.n)) {
                view = this.n;
                if (z3) {
                    iMin = p(view, iMin, iMin2, iArr);
                } else {
                    iMax = o(view, iMax, iMin2, iArr);
                }
            }
            if (s(this.j)) {
                j5Var = this.j;
                if (z3) {
                    iMin = p(j5Var, iMin, iMin2, iArr);
                } else {
                    iMax = o(j5Var, iMax, iMin2, iArr);
                }
            }
            zS = s(this.g);
            zS2 = s(this.h);
            if (zS) {
                d40 d40Var3 = (d40) this.g.getLayoutParams();
                measuredHeight = this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) d40Var3).topMargin + ((ViewGroup.MarginLayoutParams) d40Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zS2) {
                d40 d40Var4 = (d40) this.h.getLayoutParams();
                measuredHeight = this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) d40Var4).topMargin + ((ViewGroup.MarginLayoutParams) d40Var4).bottomMargin + measuredHeight;
            }
            if (zS || zS2) {
                if (zS) {
                    m6Var = this.g;
                } else {
                    m6Var = this.h;
                }
                if (zS2) {
                    m6Var2 = this.h;
                } else {
                    m6Var2 = this.g;
                }
                d40Var = (d40) m6Var.getLayoutParams();
                d40Var2 = (d40) m6Var2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zS && this.g.getMeasuredWidth() > 0) || (zS2 && this.h.getMeasuredWidth() > 0);
                i6 = this.B & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) d40Var).topMargin + this.w;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) d40Var).topMargin + this.w;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) d40Var).bottomMargin;
                        i17 = this.x;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) d40Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) d40Var2).bottomMargin) - this.x) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.u;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zS) {
                        d40 d40Var5 = (d40) this.g.getLayoutParams();
                        int measuredWidth2 = iMin - this.g.getMeasuredWidth();
                        int measuredHeight2 = this.g.getMeasuredHeight() + paddingTop;
                        this.g.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.v;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) d40Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zS2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d40) this.h.getLayoutParams())).topMargin;
                        this.h.layout(iMin - this.h.getMeasuredWidth(), i28, iMin, this.h.getMeasuredHeight() + i28);
                        i13 = iMin - this.v;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.u;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zS) {
                        d40 d40Var6 = (d40) this.g.getLayoutParams();
                        int measuredWidth3 = this.g.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.g.getMeasuredHeight() + paddingTop;
                        this.g.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.v;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) d40Var6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zS2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d40) this.h.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.h.getMeasuredWidth() + iMax;
                        this.h.layout(iMax, i30, measuredWidth4, this.h.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.v;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.I;
            a(3, arrayList);
            size = arrayList.size();
            iO2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                d40 d40Var7 = (d40) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) d40Var7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) d40Var7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iO2) {
                if (i25 > iMin) {
                    iO2 = i24 - (i25 - iMin);
                } else {
                    iO2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i26;
        if (s(this.m)) {
            i5Var = this.m;
            if (z3) {
                iP = p(i5Var, iP, iMin2, iArr);
            } else {
                iO = o(i5Var, iO, iMin2, iArr);
            }
        }
        if (s(this.f)) {
            actionMenuView = this.f;
            if (z3) {
                iO = o(actionMenuView, iO, iMin2, iArr);
            } else {
                iP = p(actionMenuView, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i26 - currentContentInsetRight2);
        if (s(this.n)) {
            view = this.n;
            if (z3) {
                iMin = p(view, iMin, iMin2, iArr);
            } else {
                iMax = o(view, iMax, iMin2, iArr);
            }
        }
        if (s(this.j)) {
            j5Var = this.j;
            if (z3) {
                iMin = p(j5Var, iMin, iMin2, iArr);
            } else {
                iMax = o(j5Var, iMax, iMin2, iArr);
            }
        }
        zS = s(this.g);
        zS2 = s(this.h);
        if (zS) {
            d40 d40Var8 = (d40) this.g.getLayoutParams();
            measuredHeight = this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) d40Var8).topMargin + ((ViewGroup.MarginLayoutParams) d40Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zS2) {
            d40 d40Var9 = (d40) this.h.getLayoutParams();
            measuredHeight = this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) d40Var9).topMargin + ((ViewGroup.MarginLayoutParams) d40Var9).bottomMargin + measuredHeight;
        }
        if (zS) {
            if (zS) {
                m6Var = this.g;
            } else {
                m6Var = this.h;
            }
            if (zS2) {
                m6Var2 = this.h;
            } else {
                m6Var2 = this.g;
            }
            d40Var = (d40) m6Var.getLayoutParams();
            d40Var2 = (d40) m6Var2.getLayoutParams();
            i5 = measuredHeight;
            if (zS) {
            }
            i6 = this.B & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) d40Var).topMargin + this.w;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) d40Var).topMargin + this.w;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) d40Var).bottomMargin;
                    i17 = this.x;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) d40Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) d40Var2).bottomMargin) - this.x) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.u;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zS) {
                    d40 d40Var10 = (d40) this.g.getLayoutParams();
                    int measuredWidth5 = iMin - this.g.getMeasuredWidth();
                    int measuredHeight4 = this.g.getMeasuredHeight() + paddingTop;
                    this.g.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.v;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) d40Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d40) this.h.getLayoutParams())).topMargin;
                    this.h.layout(iMin - this.h.getMeasuredWidth(), i211, iMin, this.h.getMeasuredHeight() + i211);
                    i13 = iMin - this.v;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.u;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zS) {
                    d40 d40Var11 = (d40) this.g.getLayoutParams();
                    int measuredWidth6 = this.g.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.g.getMeasuredHeight() + paddingTop;
                    this.g.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.v;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) d40Var11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zS2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d40) this.h.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.h.getMeasuredWidth() + iMax;
                    this.h.layout(iMax, i35, measuredWidth7, this.h.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.v;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zS) {
                m6Var = this.g;
            } else {
                m6Var = this.h;
            }
            if (zS2) {
                m6Var2 = this.h;
            } else {
                m6Var2 = this.g;
            }
            d40Var = (d40) m6Var.getLayoutParams();
            d40Var2 = (d40) m6Var2.getLayoutParams();
            i5 = measuredHeight;
            if (zS) {
            }
            i6 = this.B & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) d40Var).topMargin + this.w;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) d40Var).topMargin + this.w;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) d40Var).bottomMargin;
                    i17 = this.x;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) d40Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) d40Var2).bottomMargin) - this.x) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.u;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zS) {
                    d40 d40Var12 = (d40) this.g.getLayoutParams();
                    int measuredWidth8 = iMin - this.g.getMeasuredWidth();
                    int measuredHeight6 = this.g.getMeasuredHeight() + paddingTop;
                    this.g.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.v;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) d40Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zS2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d40) this.h.getLayoutParams())).topMargin;
                    this.h.layout(iMin - this.h.getMeasuredWidth(), i214, iMin, this.h.getMeasuredHeight() + i214);
                    i13 = iMin - this.v;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.u;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zS) {
                    d40 d40Var13 = (d40) this.g.getLayoutParams();
                    int measuredWidth9 = this.g.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.g.getMeasuredHeight() + paddingTop;
                    this.g.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.v;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) d40Var13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zS2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d40) this.h.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.h.getMeasuredWidth() + iMax;
                    this.h.layout(iMax, i36, measuredWidth10, this.h.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.v;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.I;
        a(3, arrayList);
        size = arrayList.size();
        iO2 = iMax;
        while (i18 < size) {
            iO2 = o((View) arrayList.get(i18), iO2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = p((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            d40 d40Var14 = (d40) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) d40Var14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) d40Var14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iO2) {
            if (i25 > iMin) {
                iO2 = i24 - (i25 - iMin);
            } else {
                iO2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iO2 = o((View) arrayList.get(i23), iO2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = m70.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.i)) {
            r(this.i, i, 0, i2, this.t);
            iK = k(this.i) + this.i.getMeasuredWidth();
            iMax = Math.max(0, l(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.i.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.m)) {
            r(this.m, i, 0, i2, this.t);
            iK = k(this.m) + this.m.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.m) + this.m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.K;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (s(this.f)) {
            r(this.f, i, iMax3, i2, this.t);
            iK2 = k(this.f) + this.f.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f) + this.f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.n)) {
            iMax5 += q(this.n, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.n) + this.n.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        }
        if (s(this.j)) {
            iMax5 += q(this.j, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.j) + this.j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((d40) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                iMax5 += q(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.w + this.x;
        int i7 = this.u + this.v;
        if (s(this.g)) {
            q(this.g, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.g) + this.g.getMeasuredWidth();
            iL = l(this.g) + this.g.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.h)) {
            iMax2 = Math.max(iMax2, q(this.h, i, i5 + i7, i2, i6 + iL, iArr));
            iL += l(this.h) + this.h.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.h.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.R) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof f40)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f40 f40Var = (f40) parcelable;
        super.onRestoreInstanceState(f40Var.f);
        ActionMenuView actionMenuView = this.f;
        rr rrVar = actionMenuView != null ? actionMenuView.u : null;
        int i = f40Var.h;
        if (i != 0 && this.Q != null && rrVar != null && (menuItemFindItem = rrVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (f40Var.i) {
            q7 q7Var = this.V;
            removeCallbacks(q7Var);
            post(q7Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        ey eyVar = this.y;
        boolean z = i == 1;
        if (z == eyVar.g) {
            return;
        }
        eyVar.g = z;
        if (!eyVar.h) {
            eyVar.a = eyVar.e;
            eyVar.b = eyVar.f;
            return;
        }
        if (z) {
            int i2 = eyVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = eyVar.e;
            }
            eyVar.a = i2;
            int i3 = eyVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = eyVar.f;
            }
            eyVar.b = i3;
            return;
        }
        int i4 = eyVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = eyVar.e;
        }
        eyVar.a = i4;
        int i5 = eyVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = eyVar.f;
        }
        eyVar.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        r1 r1Var;
        ur urVar;
        f40 f40Var = new f40(super.onSaveInstanceState());
        c40 c40Var = this.Q;
        if (c40Var != null && (urVar = c40Var.g) != null) {
            f40Var.h = urVar.a;
        }
        ActionMenuView actionMenuView = this.f;
        f40Var.i = (actionMenuView == null || (r1Var = actionMenuView.y) == null || !r1Var.h()) ? false : true;
        return f40Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.G = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        d40 d40Var = (d40) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) d40Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) d40Var).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.U != z) {
            this.U = z;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        i5 i5Var = this.m;
        if (i5Var != null) {
            i5Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.m.setImageDrawable(drawable);
        } else {
            i5 i5Var = this.m;
            if (i5Var != null) {
                i5Var.setImageDrawable(this.k);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.R = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A) {
            this.A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.z) {
            this.z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        j5 j5Var = this.j;
        if (drawable != null) {
            if (j5Var == null) {
                this.j = new j5(getContext(), null, 0);
            }
            if (!n(this.j)) {
                b(this.j, true);
            }
        } else if (j5Var != null && n(j5Var)) {
            removeView(this.j);
            this.J.remove(this.j);
        }
        j5 j5Var2 = this.j;
        if (j5Var2 != null) {
            j5Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.j == null) {
            this.j = new j5(getContext(), null, 0);
        }
        j5 j5Var = this.j;
        if (j5Var != null) {
            j5Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        i5 i5Var = this.i;
        if (i5Var != null) {
            i5Var.setContentDescription(charSequence);
            hn.p(this.i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.i)) {
                b(this.i, true);
            }
        } else {
            i5 i5Var = this.i;
            if (i5Var != null && n(i5Var)) {
                removeView(this.i);
                this.J.remove(this.i);
            }
        }
        i5 i5Var2 = this.i;
        if (i5Var2 != null) {
            i5Var2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.i.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.p != i) {
            this.p = i;
            if (i == 0) {
                this.o = getContext();
            } else {
                this.o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        m6 m6Var = this.h;
        if (!zIsEmpty) {
            if (m6Var == null) {
                Context context = getContext();
                m6 m6Var2 = new m6(context, null);
                this.h = m6Var2;
                m6Var2.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.r;
                if (i != 0) {
                    this.h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.h.setTextColor(colorStateList);
                }
            }
            if (!n(this.h)) {
                b(this.h, true);
            }
        } else if (m6Var != null && n(m6Var)) {
            removeView(this.h);
            this.J.remove(this.h);
        }
        m6 m6Var3 = this.h;
        if (m6Var3 != null) {
            m6Var3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        m6 m6Var = this.h;
        if (m6Var != null) {
            m6Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        m6 m6Var = this.g;
        if (!zIsEmpty) {
            if (m6Var == null) {
                Context context = getContext();
                m6 m6Var2 = new m6(context, null);
                this.g = m6Var2;
                m6Var2.setSingleLine();
                this.g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.q;
                if (i != 0) {
                    this.g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.g.setTextColor(colorStateList);
                }
            }
            if (!n(this.g)) {
                b(this.g, true);
            }
        } else if (m6Var != null && n(m6Var)) {
            removeView(this.g);
            this.J.remove(this.g);
        }
        m6 m6Var3 = this.g;
        if (m6Var3 != null) {
            m6Var3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.w = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        m6 m6Var = this.g;
        if (m6Var != null) {
            m6Var.setTextColor(colorStateList);
        }
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = b40.a(this);
            c40 c40Var = this.Q;
            int i = 0;
            boolean z = (c40Var == null || c40Var.g == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.U) ? false : true;
            if (z && this.T == null) {
                if (this.S == null) {
                    this.S = b40.b(new a40(this, i));
                }
                b40.c(onBackInvokedDispatcherA, this.S);
                this.T = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.T) == null) {
                return;
            }
            b40.d(onBackInvokedDispatcher, this.S);
            this.T = null;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(jn.f(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setOnMenuItemClickListener(e40 e40Var) {
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(jn.f(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(jn.f(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
