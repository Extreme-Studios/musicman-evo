package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rt0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long t = ((Long) tu0.e.c.a(lx0.v1)).longValue();
    public final Context f;
    public final Application g;
    public final PowerManager h;
    public final KeyguardManager i;
    public y4 j;
    public WeakReference k;
    public final WeakReference l;
    public final gr0 m;
    public final vl0 n;
    public boolean o;
    public int p;
    public final HashSet q;
    public final DisplayMetrics r;
    public final Rect s;

    public rt0(Context context, View view) {
        vl0 vl0Var = new vl0();
        vl0Var.g = Long.MIN_VALUE;
        vl0Var.h = new Object();
        vl0Var.f = t;
        this.n = vl0Var;
        this.o = false;
        this.p = -1;
        this.q = new HashSet();
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.h = (PowerManager) applicationContext.getSystemService("power");
        this.i = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.g = (Application) applicationContext;
            this.m = new gr0((Application) applicationContext, this);
        }
        this.r = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.s = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.l;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.l = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f = rect.left;
        float f2 = this.r.density;
        return new Rect((int) (f / f2), (int) (rect.top / f2), (int) (rect.right / f2), (int) (rect.bottom / f2));
    }

    public final void b() {
        zb3.l.post(new q7(22, this));
    }

    public final void c(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.l;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.p = i;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x013d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0141  */
    /* JADX WARN: Code duplicated, block: B:58:0x0145  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r24v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    public final void d(int i) {
        WeakReference weakReference;
        int i2;
        View view;
        boolean z;
        boolean localVisibleRect;
        ?? arrayList;
        int i3;
        int i4;
        int i5;
        boolean z2;
        KeyguardManager keyguardManager = this.i;
        PowerManager powerManager = this.h;
        HashSet hashSet = this.q;
        if (hashSet.isEmpty() || (weakReference = this.l) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            boolean globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
                i2 = 0;
            } catch (Exception e) {
                i2 = 0;
                jn.P("Failure getting view location.", e);
            }
            if (((Boolean) tu0.e.c.a(lx0.y5)).booleanValue()) {
                rect.left = iArr2[i2];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[i2];
                rect.top = iArr[1];
            }
            rect.right = view2.getWidth() + rect.left;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
            z = globalVisibleRect;
        } else {
            i2 = 0;
            view = null;
            z = false;
            localVisibleRect = false;
        }
        if (!((Boolean) tu0.e.c.a(lx0.y1)).booleanValue() || view == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            try {
                arrayList = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        arrayList.add(a(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e2) {
                vc3.C.h.d("PositionWatcher.getParentScrollViewRects", e2);
                arrayList = Collections.EMPTY_LIST;
            }
        }
        ?? r29 = arrayList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i6 = this.p;
        if (i6 != -1) {
            windowVisibility = i6;
        }
        vc3 vc3Var = vc3.C;
        zb3 zb3Var = vc3Var.c;
        long jA = zb3.a(view);
        ix0 ix0Var = lx0.qb;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            if (view2 == null || !zb3.r(view, powerManager, keyguardManager)) {
                i3 = localVisibleRect;
                i4 = i2;
                i5 = z;
            } else if (z) {
                if (!localVisibleRect) {
                    i3 = i2;
                    i4 = i3;
                } else if (jA < ((Integer) tu0Var.c.a(lx0.tb)).intValue() || windowVisibility != 0) {
                    i4 = i2;
                    i3 = 1;
                } else {
                    windowVisibility = i2;
                    i3 = 1;
                    i4 = 1;
                }
                i5 = 1;
            } else {
                i3 = localVisibleRect;
                i4 = i2;
                i5 = i4;
            }
        } else if (view2 == null || !zb3.r(view, powerManager, keyguardManager)) {
            i3 = localVisibleRect;
            i4 = i2;
            i5 = z;
        } else if (z) {
            if (!localVisibleRect) {
                i3 = i2;
                i4 = i3;
            } else if (windowVisibility == 0) {
                windowVisibility = i2;
                i3 = 1;
                i4 = 1;
            } else {
                i4 = i2;
                i3 = 1;
            }
            i5 = 1;
        } else {
            i3 = localVisibleRect;
            i4 = i2;
            i5 = i4;
        }
        int i7 = windowVisibility;
        if (((Boolean) tu0Var.c.a(lx0.vb)).booleanValue()) {
            int i8 = true != zb3.r(view, powerManager, keyguardManager) ? i2 : 64;
            int i9 = 1 != i5 ? i2 : 8;
            zb3.j(view, (jA >= ((long) ((Integer) tu0Var.c.a(lx0.tb)).intValue()) ? 32 : i2) | i8 | i9 | (1 != i3 ? i2 : 16) | (i7 == 0 ? 128 : i2) | i4);
        }
        if (i == 1) {
            vl0 vl0Var = this.n;
            synchronized (vl0Var.h) {
                vc3Var.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (vl0Var.g + vl0Var.f <= jElapsedRealtime) {
                    vl0Var.g = jElapsedRealtime;
                } else if (i4 == this.o) {
                    return;
                }
            }
        }
        if (i4 != 0 || this.o) {
            z2 = true;
        } else {
            z2 = true;
            if (i == 1) {
                return;
            }
        }
        vc3Var.k.getClass();
        SystemClock.elapsedRealtime();
        powerManager.isScreenOn();
        ?? r19 = (view == 0 || !view.isAttachedToWindow()) ? i2 : z2;
        int windowVisibility2 = view != 0 ? view.getWindowVisibility() : 8;
        Rect rectA = a(this.s);
        Rect rectA2 = a(rect);
        Rect rectA3 = a(rect2);
        Rect rectA4 = a(rect3);
        Rect rectA5 = a(rect4);
        float f = this.r.density;
        ?? r28 = i4;
        pt0 pt0Var = new pt0(r19, windowVisibility2, rectA, rectA2, rectA3, i5, rectA4, i3, rectA5, r28, r29);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((qt0) it.next()).Q0(pt0Var);
        }
        this.o = r28;
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.k = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.j == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            y4 y4Var = new y4(3, this);
            this.j = y4Var;
            Context context = this.f;
            dd1 dd1Var = vc3.C.z;
            synchronized (dd1Var) {
                if (dd1Var.g) {
                    ((WeakHashMap) dd1Var.i).put(y4Var, intentFilter);
                } else {
                    lx0.a(context);
                    if (!((Boolean) tu0.e.c.a(lx0.Nb)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                        context.registerReceiver(y4Var, intentFilter);
                    } else {
                        context.registerReceiver(y4Var, intentFilter, 4);
                    }
                }
            }
        }
        Application application = this.g;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.m);
            } catch (Exception e) {
                jn.P("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.k;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.k = null;
            }
        } catch (Exception e) {
            jn.P("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            jn.P("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        y4 y4Var = this.j;
        if (y4Var != null) {
            try {
                vc3.C.z.c(this.f, y4Var);
            } catch (IllegalStateException e3) {
                jn.P("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                vc3.C.h.d("ActiveViewUnit.stopScreenStatusMonitoring", e4);
            }
            this.j = null;
        }
        Application application = this.g;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.m);
            } catch (Exception e5) {
                jn.P("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity, 4);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d(3);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d(2);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.p = -1;
        e(view);
        d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.p = -1;
        d(3);
        b();
        f(view);
    }
}
