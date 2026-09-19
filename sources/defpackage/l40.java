package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.extremestudios.musicmanevo.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l40 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static l40 p;
    public static l40 q;
    public final View f;
    public final CharSequence g;
    public final int h;
    public final k40 i;
    public final k40 j;
    public int k;
    public int l;
    public m40 m;
    public boolean n;
    public boolean o;

    /* JADX WARN: Type inference failed for: r0v0, types: [k40] */
    /* JADX WARN: Type inference failed for: r0v1, types: [k40] */
    public l40(View view, CharSequence charSequence) {
        final int i = 0;
        this.i = new Runnable(this) { // from class: k40
            public final /* synthetic */ l40 g;

            {
                this.g = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                l40 l40Var = this.g;
                switch (i2) {
                    case 0:
                        l40Var.c(false);
                        break;
                    default:
                        l40Var.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.j = new Runnable(this) { // from class: k40
            public final /* synthetic */ l40 g;

            {
                this.g = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                l40 l40Var = this.g;
                switch (i3) {
                    case 0:
                        l40Var.c(false);
                        break;
                    default:
                        l40Var.a();
                        break;
                }
            }
        };
        this.f = view;
        this.g = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        int i3 = x60.a;
        this.h = Build.VERSION.SDK_INT >= 28 ? pe.j(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.o = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(l40 l40Var) {
        l40 l40Var2 = p;
        if (l40Var2 != null) {
            l40Var2.f.removeCallbacks(l40Var2.i);
        }
        p = l40Var;
        if (l40Var != null) {
            l40Var.f.postDelayed(l40Var.i, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        l40 l40Var = q;
        View view = this.f;
        if (l40Var == this) {
            q = null;
            m40 m40Var = this.m;
            if (m40Var != null) {
                View view2 = (View) m40Var.g;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) m40Var.f).getSystemService("window")).removeView(view2);
                }
                this.m = null;
                this.o = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (p == this) {
            b(null);
        }
        view.removeCallbacks(this.j);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.f;
        if (view.isAttachedToWindow()) {
            b(null);
            l40 l40Var = q;
            if (l40Var != null) {
                l40Var.a();
            }
            q = this;
            this.n = z;
            Context context = view.getContext();
            m40 m40Var = new m40();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            m40Var.i = layoutParams;
            m40Var.j = new Rect();
            m40Var.k = new int[2];
            m40Var.l = new int[2];
            m40Var.f = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            m40Var.g = viewInflate;
            m40Var.h = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(m40.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) m40Var.g;
            Context context2 = (Context) m40Var.f;
            this.m = m40Var;
            int width = this.k;
            int i4 = this.l;
            boolean z2 = this.n;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) m40Var.i;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) m40Var.h).setText(this.g);
            int[] iArr = (int[]) m40Var.l;
            int[] iArr2 = (int[]) m40Var.k;
            Rect rect = (Rect) m40Var.j;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i5 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i3 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i6;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams2.x = (i6 + i5) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i3];
                int i8 = ((i7 + i) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams2.y = i8;
                    } else {
                        layoutParams2.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams2.y = i9;
                } else {
                    layoutParams2.y = i8;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.n) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = w60.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            k40 k40Var = this.j;
            view.removeCallbacks(k40Var);
            view.postDelayed(k40Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.m == null || !this.n) {
            View view2 = this.f;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.o = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.m == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.o) {
                        this.k = x;
                        this.l = y;
                        this.o = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.k);
                        int i = this.h;
                        if (iAbs > i || Math.abs(y - this.l) > i) {
                            this.k = x;
                            this.l = y;
                            this.o = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.k = view.getWidth() / 2;
        this.l = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
