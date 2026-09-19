package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g80 implements i1 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public zd e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public f80 i;
    public f80 j;
    public un1 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public i70 s;
    public boolean t;
    public boolean u;
    public final e80 v;
    public final e80 w;
    public final s70 x;

    public g80(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new e80(this, 0);
        this.w = new e80(this, 1);
        this.x = new s70(9, this);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z2) {
        h70 h70VarI;
        h70 h70VarI2;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        zd zdVar = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                ((i40) zdVar).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((i40) zdVar).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            i40 i40Var = (i40) zdVar;
            h70VarI = w60.a(i40Var.a);
            h70VarI.a(0.0f);
            h70VarI.c(100L);
            h70VarI.d(new h40(i40Var, 4));
            h70VarI2 = this.f.i(0, 200L);
        } else {
            i40 i40Var2 = (i40) zdVar;
            h70 h70VarA = w60.a(i40Var2.a);
            h70VarA.a(1.0f);
            h70VarA.c(200L);
            h70VarA.d(new h40(i40Var2, 0));
            h70VarI = this.f.i(8, 100L);
            h70VarI2 = h70VarA;
        }
        i70 i70Var = new i70();
        ArrayList arrayList = i70Var.a;
        arrayList.add(h70VarI);
        View view = (View) h70VarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) h70VarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(h70VarI2);
        i70Var.b();
    }

    public final Context b() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.extremestudios.musicmanevo.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public final void c(View view) {
        zd wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.extremestudios.musicmanevo.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.extremestudios.musicmanevo.R.id.action_bar);
        if (callbackFindViewById instanceof zd) {
            wrapper = (zd) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.extremestudios.musicmanevo.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.extremestudios.musicmanevo.R.id.action_bar_container);
        this.d = actionBarContainer;
        zd zdVar = this.e;
        if (zdVar == null || this.f == null || actionBarContainer == null) {
            j7.e(g80.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((i40) zdVar).a.getContext();
        this.a = context;
        if ((((i40) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        e(context.getResources().getBoolean(com.extremestudios.musicmanevo.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, lw.a, com.extremestudios.musicmanevo.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.l) {
                j7.e("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = w60.a;
            p60.g(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        i40 i40Var = (i40) this.e;
        int i2 = i40Var.b;
        this.h = true;
        i40Var.a((i & 4) | (i2 & (-5)));
    }

    public final void e(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((i40) this.e).getClass();
        } else {
            ((i40) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((i40) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        final s70 s70Var = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                i70 i70Var = this.s;
                if (i70Var != null) {
                    i70Var.a();
                }
                int i = this.n;
                e80 e80Var = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    e80Var.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                i70 i70Var2 = new i70();
                float f = -this.d.getHeight();
                if (z2) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                h70 h70VarA = w60.a(this.d);
                h70VarA.e(f);
                final View view2 = (View) h70VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(s70Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: f70
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((g80) s70Var.g).d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = i70Var2.e;
                ArrayList arrayList = i70Var2.a;
                if (!z5) {
                    arrayList.add(h70VarA);
                }
                if (this.o && view != null) {
                    h70 h70VarA2 = w60.a(view);
                    h70VarA2.e(f);
                    if (!i70Var2.e) {
                        arrayList.add(h70VarA2);
                    }
                }
                boolean z6 = i70Var2.e;
                if (!z6) {
                    i70Var2.c = y;
                }
                if (!z6) {
                    i70Var2.b = 250L;
                }
                if (!z6) {
                    i70Var2.d = e80Var;
                }
                this.s = i70Var2;
                i70Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        i70 i70Var3 = this.s;
        if (i70Var3 != null) {
            i70Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        e80 e80Var2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.d.setTranslationY(f2);
            i70 i70Var4 = new i70();
            h70 h70VarA3 = w60.a(this.d);
            h70VarA3.e(0.0f);
            final View view3 = (View) h70VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(s70Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: f70
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((g80) s70Var.g).d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = i70Var4.e;
            ArrayList arrayList2 = i70Var4.a;
            if (!z7) {
                arrayList2.add(h70VarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                h70 h70VarA4 = w60.a(view);
                h70VarA4.e(0.0f);
                if (!i70Var4.e) {
                    arrayList2.add(h70VarA4);
                }
            }
            boolean z8 = i70Var4.e;
            if (!z8) {
                i70Var4.c = z;
            }
            if (!z8) {
                i70Var4.b = 250L;
            }
            if (!z8) {
                i70Var4.d = e80Var2;
            }
            this.s = i70Var4;
            i70Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            e80Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = w60.a;
            n60.c(actionBarOverlayLayout);
        }
    }

    public g80(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new e80(this, 0);
        this.w = new e80(this, 1);
        this.x = new s70(9, this);
        c(dialog.getWindow().getDecorView());
    }
}
