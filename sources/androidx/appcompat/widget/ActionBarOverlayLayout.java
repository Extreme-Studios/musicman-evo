package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import com.extremestudios.musicmanevo.R;
import defpackage.c40;
import defpackage.g1;
import defpackage.g80;
import defpackage.gn;
import defpackage.gs;
import defpackage.h1;
import defpackage.h80;
import defpackage.i1;
import defpackage.i40;
import defpackage.i70;
import defpackage.j1;
import defpackage.j7;
import defpackage.j80;
import defpackage.jn;
import defpackage.k1;
import defpackage.k80;
import defpackage.l80;
import defpackage.m80;
import defpackage.n60;
import defpackage.n80;
import defpackage.nt;
import defpackage.ot;
import defpackage.p60;
import defpackage.pt;
import defpackage.r1;
import defpackage.rr;
import defpackage.v80;
import defpackage.w60;
import defpackage.y80;
import defpackage.zd;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements nt, ot {
    public static final int[] H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final y80 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final g1 C;
    public final h1 D;
    public final h1 E;
    public final pt F;
    public final k1 G;
    public int f;
    public int g;
    public ContentFrameLayout h;
    public ActionBarContainer i;
    public zd j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public y80 v;
    public y80 w;
    public y80 x;
    public y80 y;
    public i1 z;

    static {
        n80 j80Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            j80Var = new m80();
        } else if (i >= 31) {
            j80Var = new l80();
        } else if (i >= 30) {
            j80Var = new k80();
        } else {
            j80Var = i >= 29 ? new j80() : new h80();
        }
        j80Var.d(gn.a(0, 1, 0, 1));
        I = j80Var.b();
        J = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        y80 y80Var = y80.b;
        this.v = y80Var;
        this.w = y80Var;
        this.x = y80Var;
        this.y = y80Var;
        this.C = new g1(0, this);
        this.D = new h1(this, 0);
        this.E = new h1(this, 1);
        i(context);
        this.F = new pt();
        k1 k1Var = new k1(context);
        k1Var.setWillNotDraw(true);
        this.G = k1Var;
        addView(k1Var);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        j1 j1Var = (j1) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) j1Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) j1Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) j1Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) j1Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) j1Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) j1Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.nt
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.nt
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.ot
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(nestedScrollView, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof j1;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.k != null) {
            if (this.i.getVisibility() == 0) {
                translationY = (int) (this.i.getTranslationY() + this.i.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.k.setBounds(0, translationY, getWidth(), this.k.getIntrinsicHeight() + translationY);
            this.k.draw(canvas);
        }
    }

    @Override // defpackage.nt
    public final void e(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    @Override // defpackage.nt
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new j1(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new j1(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        pt ptVar = this.F;
        return ptVar.b | ptVar.a;
    }

    public CharSequence getTitle() {
        k();
        return ((i40) this.j).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(H);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.k = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.A = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((i40) this.j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((i40) this.j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        zd wrapper;
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof zd) {
                wrapper = (zd) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    j7.e("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.j = wrapper;
        }
    }

    public final void l(Menu menu, gs gsVar) {
        k();
        i40 i40Var = (i40) this.j;
        Toolbar toolbar = i40Var.a;
        if (i40Var.m == null) {
            i40Var.m = new r1(toolbar.getContext());
        }
        r1 r1Var = i40Var.m;
        r1Var.j = gsVar;
        rr rrVar = (rr) menu;
        if (rrVar == null && toolbar.f == null) {
            return;
        }
        toolbar.f();
        rr rrVar2 = toolbar.f.u;
        if (rrVar2 == rrVar) {
            return;
        }
        if (rrVar2 != null) {
            rrVar2.r(toolbar.P);
            rrVar2.r(toolbar.Q);
        }
        if (toolbar.Q == null) {
            toolbar.Q = new c40(toolbar);
        }
        r1Var.v = true;
        Context context = toolbar.o;
        if (rrVar != null) {
            rrVar.b(r1Var, context);
            rrVar.b(toolbar.Q, toolbar.o);
        } else {
            r1Var.i(context, null);
            toolbar.Q.i(toolbar.o, null);
            r1Var.g();
            toolbar.Q.g();
        }
        toolbar.f.setPopupTheme(toolbar.p);
        toolbar.f.setPresenter(r1Var);
        toolbar.P = r1Var;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        y80 y80VarC = y80.c(windowInsets, this);
        v80 v80Var = y80VarC.a;
        boolean zG = g(this.i, new Rect(v80Var.j().a, v80Var.j().b, v80Var.j().c, v80Var.j().d), false);
        WeakHashMap weakHashMap = w60.a;
        Rect rect = this.r;
        p60.b(this, y80VarC, rect);
        y80 y80VarL = v80Var.l(rect.left, rect.top, rect.right, rect.bottom);
        this.v = y80VarL;
        boolean z = true;
        if (!this.w.equals(y80VarL)) {
            this.w = this.v;
            zG = true;
        }
        Rect rect2 = this.s;
        if (rect2.equals(rect)) {
            z = zG;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return v80Var.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = w60.a;
        n60.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                j1 j1Var = (j1) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) j1Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) j1Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00df  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:34:0x0103  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        y80 y80Var;
        int i3;
        n80 h80Var;
        k();
        measureChildWithMargins(this.i, i, 0, i2, 0);
        j1 j1Var = (j1) this.i.getLayoutParams();
        int iMax = Math.max(0, this.i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) j1Var).leftMargin + ((ViewGroup.MarginLayoutParams) j1Var).rightMargin);
        int iMax2 = Math.max(0, this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) j1Var).topMargin + ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.i.getMeasuredState());
        WeakHashMap weakHashMap = w60.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f;
            if (this.m && this.i.getTabContainer() != null) {
                measuredHeight += this.f;
            }
        } else {
            measuredHeight = this.i.getVisibility() != 8 ? this.i.getMeasuredHeight() : 0;
        }
        Rect rect = this.r;
        Rect rect2 = this.t;
        rect2.set(rect);
        this.x = this.v;
        if (this.l || z) {
            gn gnVarA = gn.a(this.x.a.j().a, this.x.a.j().b + measuredHeight, this.x.a.j().c, this.x.a.j().d);
            y80Var = this.x;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                h80Var = new m80(y80Var);
            } else if (i3 >= 31) {
                h80Var = new l80(y80Var);
            } else if (i3 >= 30) {
                h80Var = new k80(y80Var);
            } else if (i3 >= 29) {
                h80Var = new j80(y80Var);
            } else {
                h80Var = new h80(y80Var);
            }
            h80Var.d(gnVarA);
            this.x = h80Var.b();
        } else {
            k1 k1Var = this.G;
            y80 y80Var2 = I;
            Rect rect3 = this.u;
            p60.b(k1Var, y80Var2, rect3);
            if (rect3.equals(J)) {
                gn gnVarA2 = gn.a(this.x.a.j().a, this.x.a.j().b + measuredHeight, this.x.a.j().c, this.x.a.j().d);
                y80Var = this.x;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 34) {
                    h80Var = new m80(y80Var);
                } else if (i3 >= 31) {
                    h80Var = new l80(y80Var);
                } else if (i3 >= 30) {
                    h80Var = new k80(y80Var);
                } else if (i3 >= 29) {
                    h80Var = new j80(y80Var);
                } else {
                    h80Var = new h80(y80Var);
                }
                h80Var.d(gnVarA2);
                this.x = h80Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.x = this.x.a.l(0, measuredHeight, 0, 0);
            }
        }
        g(this.h, rect2, true);
        if (!this.y.equals(this.x)) {
            y80 y80Var3 = this.x;
            this.y = y80Var3;
            w60.b(this.h, y80Var3);
        }
        measureChildWithMargins(this.h, i, 0, i2, 0);
        j1 j1Var2 = (j1) this.h.getLayoutParams();
        int iMax3 = Math.max(iMax, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) j1Var2).leftMargin + ((ViewGroup.MarginLayoutParams) j1Var2).rightMargin);
        int iMax4 = Math.max(iMax2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) j1Var2).topMargin + ((ViewGroup.MarginLayoutParams) j1Var2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A.getFinalY() > this.i.getHeight()) {
            h();
            this.E.run();
        } else {
            h();
            this.D.run();
        }
        this.o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.p + i2;
        this.p = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        g80 g80Var;
        i70 i70Var;
        this.F.a = i;
        this.p = getActionBarHideOffset();
        h();
        i1 i1Var = this.z;
        if (i1Var == null || (i70Var = (g80Var = (g80) i1Var).s) == null) {
            return;
        }
        i70Var.a();
        g80Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.i.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.n || this.o) {
            return;
        }
        if (this.p <= this.i.getHeight()) {
            h();
            postDelayed(this.D, 600L);
        } else {
            h();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.q ^ i;
        this.q = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        i1 i1Var = this.z;
        if (i1Var != null) {
            g80 g80Var = (g80) i1Var;
            g80Var.o = !z2;
            if (z || !z2) {
                if (g80Var.p) {
                    g80Var.p = false;
                    g80Var.f(true);
                }
            } else if (!g80Var.p) {
                g80Var.p = true;
                g80Var.f(true);
            }
        }
        if ((i2 & 256) == 0 || this.z == null) {
            return;
        }
        WeakHashMap weakHashMap = w60.a;
        n60.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g = i;
        i1 i1Var = this.z;
        if (i1Var != null) {
            ((g80) i1Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.i.setTranslationY(-Math.max(0, Math.min(i, this.i.getHeight())));
    }

    public void setActionBarVisibilityCallback(i1 i1Var) {
        this.z = i1Var;
        if (getWindowToken() != null) {
            ((g80) this.z).n = this.g;
            int i = this.q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = w60.a;
                n60.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        i40 i40Var = (i40) this.j;
        i40Var.d = i != 0 ? jn.f(i40Var.a.getContext(), i) : null;
        i40Var.c();
    }

    public void setLogo(int i) {
        k();
        i40 i40Var = (i40) this.j;
        i40Var.e = i != 0 ? jn.f(i40Var.a.getContext(), i) : null;
        i40Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((i40) this.j).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        i40 i40Var = (i40) this.j;
        if (i40Var.g) {
            return;
        }
        Toolbar toolbar = i40Var.a;
        i40Var.h = charSequence;
        if ((i40Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (i40Var.g) {
                w60.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new j1(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        i40 i40Var = (i40) this.j;
        i40Var.d = drawable;
        i40Var.c();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.nt
    public final void d(int i, int i2, int[] iArr, int i3) {
    }
}
