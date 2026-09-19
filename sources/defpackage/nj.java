package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.extremestudios.musicmanevo.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nj extends FrameLayout {
    public final ArrayList f;
    public final ArrayList g;
    public View.OnApplyWindowInsetsListener h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(Context context, AttributeSet attributeSet, xj xjVar) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hw.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        kj kjVarZ = xjVar.z(id);
        if (classAttribute != null && kjVarZ == null) {
            if (id == -1) {
                j7.e(ec.i("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            sj sjVarB = xjVar.B();
            context.getClassLoader();
            kj kjVarA = sjVarB.a(classAttribute);
            kjVarA.getClass();
            kjVarA.H = true;
            mj mjVar = kjVarA.x;
            if ((mjVar == null ? null : mjVar.C) != null) {
                kjVarA.H = true;
            }
            s7 s7Var = new s7(xjVar);
            s7Var.o = true;
            kjVarA.I = this;
            s7Var.e(getId(), kjVarA, string);
            if (s7Var.g) {
                j7.e("This transaction is already being added to the back stack");
                throw null;
            }
            xj xjVar2 = s7Var.p;
            if (xjVar2.t != null && !xjVar2.G) {
                xjVar2.w(true);
                s7Var.a(xjVar2.I, xjVar2.J);
                xjVar2.b = true;
                try {
                    xjVar2.O(xjVar2.I, xjVar2.J);
                    xjVar2.d();
                    xjVar2.Z();
                    if (xjVar2.H) {
                        xjVar2.H = false;
                        xjVar2.X();
                    }
                    ((HashMap) xjVar2.c.h).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    xjVar2.d();
                    throw th;
                }
            }
        }
        ArrayList arrayListI = xjVar.c.i();
        int size = arrayListI.size();
        while (i < size) {
            Object obj = arrayListI.get(i);
            i++;
            int i2 = ((ek) obj).c.B;
            getId();
        }
    }

    public final void a(View view) {
        if (this.g.contains(view)) {
            this.f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof kj ? (kj) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        y80 y80VarC;
        windowInsets.getClass();
        y80 y80VarC2 = y80.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            y80VarC = y80.c(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = w60.a;
            WindowInsets windowInsetsB = y80VarC2.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsB2 = n60.b(this, windowInsetsB);
                if (!windowInsetsB2.equals(windowInsetsB)) {
                    y80VarC2 = y80.c(windowInsetsB2, this);
                }
            }
            y80VarC = y80VarC2;
        }
        if (!y80VarC.a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                w60.b(getChildAt(i), y80VarC);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.i) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.i) {
            ArrayList arrayList = this.f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.g.remove(view);
        if (this.f.remove(view)) {
            this.i = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends kj> F getFragment() {
        kj kjVar;
        c4 c4Var;
        xj xjVarG;
        View view = this;
        while (true) {
            if (view == null) {
                kjVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            kjVar = tag instanceof kj ? (kj) tag : null;
            if (kjVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (kjVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    c4Var = null;
                    break;
                }
                if (context instanceof c4) {
                    c4Var = (c4) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (c4Var == null) {
                j7.c(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            xjVarG = ((mj) c4Var.w.g).F;
        } else {
            if (kjVar.x == null || !kjVar.p) {
                throw new IllegalStateException("The Fragment " + kjVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            xjVarG = kjVar.g();
        }
        return (F) xjVarG.z(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.i = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.g.add(view);
        }
        super.startViewTransition(view);
    }
}
