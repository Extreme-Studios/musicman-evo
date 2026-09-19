package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class fp implements m00 {
    public static final Method F;
    public static final Method G;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final l5 E;
    public final Context f;
    public ListAdapter g;
    public yf h;
    public int k;
    public int l;
    public boolean n;
    public boolean o;
    public boolean p;
    public cp s;
    public View t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public final int i = -2;
    public int j = -2;
    public final int m = 1002;
    public int q = 0;
    public final int r = Integer.MAX_VALUE;
    public final bp w = new bp(this, 1);
    public final ep x = new ep(0, this);
    public final dp y = new dp(this);
    public final bp z = new bp(this, 0);
    public final Rect B = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                G = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public fp(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lw.o, i, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        l5 l5Var = new l5(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, lw.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            l5Var.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        l5Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : jn.f(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.E = l5Var;
        l5Var.setInputMethodMode(1);
    }

    @Override // defpackage.m00
    public final boolean a() {
        return this.E.isShowing();
    }

    public final int b() {
        return this.k;
    }

    public final Drawable c() {
        return this.E.getBackground();
    }

    @Override // defpackage.m00
    public final void d() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        yf yfVar;
        yf yfVar2 = this.h;
        Context context = this.f;
        l5 l5Var = this.E;
        int i2 = 0;
        if (yfVar2 == null) {
            yf yfVarQ = q(context, !this.D);
            this.h = yfVarQ;
            yfVarQ.setAdapter(this.g);
            this.h.setOnItemClickListener(this.u);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new yo(i2, this));
            this.h.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.h.setOnItemSelectedListener(onItemSelectedListener);
            }
            l5Var.setContentView(this.h);
        }
        Drawable background = l5Var.getBackground();
        Rect rect = this.B;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.n) {
                this.l = -i3;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = zo.a(l5Var, this.t, this.l, l5Var.getInputMethodMode() == 2);
        int i4 = this.i;
        if (i4 == -1) {
            paddingBottom = iA + i;
        } else {
            int i5 = this.j;
            if (i5 != -2) {
                iMakeMeasureSpec = i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.h.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.h.getPaddingBottom() + this.h.getPaddingTop() + i : 0);
        }
        boolean z = l5Var.getInputMethodMode() == 2;
        l5Var.setWindowLayoutType(this.m);
        if (l5Var.isShowing()) {
            if (this.t.isAttachedToWindow()) {
                int width = this.j;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.t.getWidth();
                }
                if (i4 == -1) {
                    i4 = z ? paddingBottom : -1;
                    int i6 = this.j;
                    if (z) {
                        l5Var.setWidth(i6 == -1 ? -1 : 0);
                        l5Var.setHeight(0);
                    } else {
                        l5Var.setWidth(i6 == -1 ? -1 : 0);
                        l5Var.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                l5Var.setOutsideTouchable(true);
                View view = this.t;
                int i7 = width;
                int i8 = this.k;
                int i9 = this.l;
                int i10 = i7 < 0 ? -1 : i7;
                if (i4 < 0) {
                    i4 = -1;
                }
                l5Var.update(view, i8, i9, i10, i4);
                return;
            }
            return;
        }
        int width2 = this.j;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.t.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        l5Var.setWidth(width2);
        l5Var.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(l5Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            ap.b(l5Var, true);
        }
        l5Var.setOutsideTouchable(true);
        l5Var.setTouchInterceptor(this.x);
        if (this.p) {
            l5Var.setOverlapAnchor(this.o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(l5Var, this.C);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            ap.a(l5Var, this.C);
        }
        l5Var.showAsDropDown(this.t, this.k, this.l, this.q);
        this.h.setSelection(-1);
        if ((!this.D || this.h.isInTouchMode()) && (yfVar = this.h) != null) {
            yfVar.setListSelectionHidden(true);
            yfVar.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.z);
    }

    @Override // defpackage.m00
    public final void dismiss() {
        l5 l5Var = this.E;
        l5Var.dismiss();
        l5Var.setContentView(null);
        this.h = null;
        this.A.removeCallbacks(this.w);
    }

    public final void f(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.m00
    public final yf h() {
        return this.h;
    }

    public final void i(int i) {
        this.l = i;
        this.n = true;
    }

    public final void l(int i) {
        this.k = i;
    }

    public final int n() {
        if (this.n) {
            return this.l;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        cp cpVar = this.s;
        if (cpVar == null) {
            this.s = new cp(this);
        } else {
            ListAdapter listAdapter2 = this.g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(cpVar);
            }
        }
        this.g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        yf yfVar = this.h;
        if (yfVar != null) {
            yfVar.setAdapter(this.g);
        }
    }

    public yf q(Context context, boolean z) {
        return new yf(context, z);
    }

    public final void r(int i) {
        Drawable background = this.E.getBackground();
        if (background == null) {
            this.j = i;
            return;
        }
        Rect rect = this.B;
        background.getPadding(rect);
        this.j = rect.left + rect.right + i;
    }
}
