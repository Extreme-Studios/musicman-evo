package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends p4 implements pr, LayoutInflater.Factory2 {
    public static final q00 l0 = new q00(0);
    public static final int[] m0 = {R.attr.windowBackground};
    public static final boolean n0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow A;
    public q4 B;
    public boolean D;
    public ViewGroup E;
    public TextView F;
    public View G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public b5[] P;
    public b5 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Configuration V;
    public final int W;
    public int X;
    public int Y;
    public boolean Z;
    public x4 a0;
    public x4 b0;
    public boolean c0;
    public int d0;
    public boolean f0;
    public Rect g0;
    public Rect h0;
    public u6 i0;
    public OnBackInvokedDispatcher j0;
    public OnBackInvokedCallback k0;
    public final Object o;
    public final Context p;
    public Window q;
    public w4 r;
    public g80 s;
    public n20 t;
    public CharSequence u;
    public ActionBarOverlayLayout v;
    public zy1 w;
    public kc2 x;
    public v1 y;
    public ActionBarContextView z;
    public h70 C = null;
    public final q4 e0 = new q4(this, 0);

    public c5(Context context, Window window, f4 f4Var, Object obj) {
        c4 c4Var = null;
        this.W = -100;
        this.p = context;
        this.o = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof c4)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    c4Var = (c4) context;
                    break;
                }
            }
            if (c4Var != null) {
                this.W = ((c5) c4Var.k()).W;
            }
        }
        if (this.W == -100) {
            String name = this.o.getClass().getName();
            q00 q00Var = l0;
            Integer num = (Integer) q00Var.get(name);
            if (num != null) {
                this.W = num.intValue();
                q00Var.remove(this.o.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        e5.c();
    }

    public static qp o(Context context) {
        qp qpVar;
        qp qpVar2;
        if (Build.VERSION.SDK_INT >= 33 || (qpVar = p4.h) == null) {
            return null;
        }
        rp rpVar = qpVar.a;
        qp qpVarB = t4.b(context.getApplicationContext().getResources().getConfiguration());
        if (rpVar.a.isEmpty()) {
            qpVar2 = qp.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < qpVarB.a.a.size() + rpVar.a.size()) {
                Locale locale = i < rpVar.a.size() ? rpVar.a.get(i) : qpVarB.a.a.get(i - rpVar.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            qpVar2 = new qp(new rp(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return qpVar2.a.a.isEmpty() ? qpVarB : qpVar2;
    }

    public static Configuration s(Context context, int i, qp qpVar, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (qpVar != null) {
            t4.d(configuration2, qpVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.d0 = (1 << i) | this.d0;
        if (this.c0) {
            return;
        }
        View decorView = this.q.getDecorView();
        WeakHashMap weakHashMap = w60.a;
        decorView.postOnAnimation(this.e0);
        this.c0 = true;
    }

    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            j7.e("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.b0 == null) {
                            this.b0 = new x4(this, context);
                        }
                        return this.b0.e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).e();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean C() {
        zd zdVar;
        c40 c40Var;
        boolean z = this.R;
        this.R = false;
        b5 b5VarY = y(0);
        if (!b5VarY.m) {
            v1 v1Var = this.y;
            if (v1Var != null) {
                v1Var.a();
                return true;
            }
            z();
            g80 g80Var = this.s;
            if (g80Var == null || (zdVar = g80Var.e) == null || (c40Var = ((i40) zdVar).a.Q) == null || c40Var.g == null) {
                return false;
            }
            c40 c40Var2 = ((i40) zdVar).a.Q;
            ur urVar = c40Var2 == null ? null : c40Var2.g;
            if (urVar != null) {
                urVar.collapseActionView();
            }
        } else if (!z) {
            r(b5VarY, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.k.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(defpackage.b5 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5.D(b5, android.view.KeyEvent):void");
    }

    public final boolean E(b5 b5Var, int i, KeyEvent keyEvent) {
        rr rrVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((b5Var.k || F(b5Var, keyEvent)) && (rrVar = b5Var.h) != null) {
            return rrVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x010e  */
    public final boolean F(b5 b5Var, KeyEvent keyEvent) {
        rr rrVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.U) {
            boolean z = b5Var.k;
            int i = b5Var.a;
            if (z) {
                return true;
            }
            b5 b5Var2 = this.Q;
            if (b5Var2 != null && b5Var2 != b5Var) {
                r(b5Var2, false);
            }
            Window.Callback callback = this.q.getCallback();
            if (callback != null) {
                b5Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.v) != null) {
                actionBarOverlayLayout4.k();
                ((i40) actionBarOverlayLayout4.j).l = true;
            }
            if (b5Var.g == null) {
                rr rrVar2 = b5Var.h;
                if (rrVar2 == null || b5Var.o) {
                    if (rrVar2 == null) {
                        Context context = this.p;
                        if ((i == 0 || i == 108) && this.v != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.extremestudios.musicmanevo.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.extremestudios.musicmanevo.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.extremestudios.musicmanevo.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                xb xbVar = new xb(context, 0);
                                xbVar.getTheme().setTo(themeNewTheme);
                                context = xbVar;
                            }
                        }
                        rr rrVar3 = new rr(context);
                        rrVar3.e = this;
                        rr rrVar4 = b5Var.h;
                        if (rrVar3 != rrVar4) {
                            if (rrVar4 != null) {
                                rrVar4.r(b5Var.i);
                            }
                            b5Var.h = rrVar3;
                            xo xoVar = b5Var.i;
                            if (xoVar != null) {
                                rrVar3.b(xoVar, rrVar3.a);
                            }
                        }
                        if (b5Var.h != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.v) != null) {
                                if (this.w == null) {
                                    this.w = new zy1(3, this);
                                }
                                actionBarOverlayLayout2.l(b5Var.h, this.w);
                            }
                            b5Var.h.w();
                            if (callback.onCreatePanelMenu(i, b5Var.h)) {
                                b5Var.o = false;
                            } else {
                                rrVar = b5Var.h;
                                if (rrVar != null) {
                                    if (rrVar != null) {
                                        rrVar.r(b5Var.i);
                                    }
                                    b5Var.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.v) != null) {
                                    actionBarOverlayLayout.l(null, this.w);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.w == null) {
                                this.w = new zy1(3, this);
                            }
                            actionBarOverlayLayout2.l(b5Var.h, this.w);
                        }
                        b5Var.h.w();
                        if (callback.onCreatePanelMenu(i, b5Var.h)) {
                            rrVar = b5Var.h;
                            if (rrVar != null) {
                                if (rrVar != null) {
                                    rrVar.r(b5Var.i);
                                }
                                b5Var.h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.l(null, this.w);
                            }
                        } else {
                            b5Var.o = false;
                        }
                    }
                }
                b5Var.h.w();
                Bundle bundle = b5Var.p;
                if (bundle != null) {
                    b5Var.h.s(bundle);
                    b5Var.p = null;
                }
                if (!callback.onPreparePanel(0, b5Var.g, b5Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.v) != null) {
                        actionBarOverlayLayout3.l(null, this.w);
                    }
                    b5Var.h.v();
                    return false;
                }
                b5Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                b5Var.h.v();
            }
            b5Var.k = true;
            b5Var.l = false;
            this.Q = b5Var;
            return true;
        }
        return false;
    }

    public final void G() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.j0 != null && (y(0).m || this.y != null)) {
                z = true;
            }
            if (z && this.k0 == null) {
                this.k0 = v4.b(this.j0, this);
            } else {
                if (z || (onBackInvokedCallback = this.k0) == null) {
                    return;
                }
                v4.c(this.j0, onBackInvokedCallback);
                this.k0 = null;
            }
        }
    }

    @Override // defpackage.p4
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof c5) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.p4
    public final void c() {
        String strV;
        this.S = true;
        l(false, true);
        w();
        Object obj = this.o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strV = w40.v(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strV = null;
            }
            if (strV != null) {
                g80 g80Var = this.s;
                if (g80Var == null) {
                    this.f0 = true;
                } else {
                    g80Var.d(true);
                }
            }
            synchronized (p4.m) {
                p4.e(this);
                p4.l.add(new WeakReference(this));
            }
        }
        this.V = new Configuration(this.p.getResources().getConfiguration());
        this.T = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.p4
    public final void d() {
        if (this.o instanceof Activity) {
            synchronized (p4.m) {
                p4.e(this);
            }
        }
        if (this.c0) {
            this.q.getDecorView().removeCallbacks(this.e0);
        }
        this.U = true;
        if (this.W != -100) {
            Object obj = this.o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                l0.put(this.o.getClass().getName(), Integer.valueOf(this.W));
            } else {
                l0.remove(this.o.getClass().getName());
            }
        } else {
            l0.remove(this.o.getClass().getName());
        }
        x4 x4Var = this.a0;
        if (x4Var != null) {
            x4Var.c();
        }
        x4 x4Var2 = this.b0;
        if (x4Var2 != null) {
            x4Var2.c();
        }
    }

    @Override // defpackage.p4
    public final boolean f(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.N && i == 108) {
            return false;
        }
        if (this.J && i == 1) {
            this.J = false;
        }
        if (i == 1) {
            G();
            this.N = true;
            return true;
        }
        if (i == 2) {
            G();
            this.H = true;
            return true;
        }
        if (i == 5) {
            G();
            this.I = true;
            return true;
        }
        if (i == 10) {
            G();
            this.L = true;
            return true;
        }
        if (i == 108) {
            G();
            this.J = true;
            return true;
        }
        if (i != 109) {
            return this.q.requestFeature(i);
        }
        G();
        this.K = true;
        return true;
    }

    @Override // defpackage.p4
    public final void g(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.p).inflate(i, viewGroup);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.p4
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.r.a(this.q.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.pr
    public final boolean i(rr rrVar, MenuItem menuItem) {
        b5 b5Var;
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.U) {
            rr rrVarK = rrVar.k();
            b5[] b5VarArr = this.P;
            int length = b5VarArr != null ? b5VarArr.length : 0;
            for (int i = 0; i < length; i++) {
                b5Var = b5VarArr[i];
                if (b5Var != null && b5Var.h == rrVarK) {
                    if (b5Var != null) {
                        return callback.onMenuItemSelected(b5Var.a, menuItem);
                    }
                }
            }
            b5Var = null;
            if (b5Var != null) {
                return callback.onMenuItemSelected(b5Var.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.p4
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.p4
    public final void k(CharSequence charSequence) {
        this.u = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        g80 g80Var = this.s;
        if (g80Var == null) {
            TextView textView = this.F;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        i40 i40Var = (i40) g80Var.e;
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

    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(boolean z, boolean z2) {
        int i;
        boolean z3;
        Object obj;
        Object obj2;
        int i2 = 0;
        if (this.U) {
            return false;
        }
        int i3 = this.W;
        if (i3 == -100) {
            i3 = p4.g;
        }
        Context context = this.p;
        int iB = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        qp qpVarO = i4 < 33 ? o(context) : null;
        if (!z2 && qpVarO != null) {
            qpVarO = t4.b(context.getResources().getConfiguration());
        }
        Configuration configurationS = s(context, iB, qpVarO, null, false);
        boolean z4 = this.Z;
        boolean z5 = true;
        Object obj3 = this.o;
        if (z4 || !(obj3 instanceof Activity)) {
            this.Z = true;
            i = this.Y;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i4 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.Y = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.Y = 0;
                }
                this.Z = true;
                i = this.Y;
            }
        }
        Configuration configuration = this.V;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i5 = configuration.uiMode & 48;
        int i6 = configurationS.uiMode & 48;
        qp qpVarB = t4.b(configuration);
        qp qpVarB2 = qpVarO == null ? null : t4.b(configurationS);
        int i7 = i5 != i6 ? 512 : 0;
        if (qpVarB2 != null && !qpVarB.equals(qpVarB2)) {
            i7 |= 8196;
        }
        if (((~i) & i7) != 0 && z && this.S && ((n0 || this.T) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 31 && (i7 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationS.getLayoutDirection());
                }
                if (i8 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new x1(i2, activity));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i7 == 0) {
            z5 = z3;
        } else {
            i2 = (i7 & i) == i7 ? 1 : 0;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
            if (qpVarB2 != null) {
                t4.d(configuration2, qpVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 26 && i9 < 28) {
                if (!jn.B) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        jn.A = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e2) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                    }
                    jn.B = true;
                }
                Field field = jn.A;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!jn.v) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                jn.u = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e4) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                            }
                            jn.v = true;
                        }
                        Field field2 = jn.u;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e5) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!jn.x) {
                                try {
                                    jn.w = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e6) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e6);
                                }
                                jn.x = true;
                            }
                            Class cls = jn.w;
                            if (cls != null) {
                                if (!jn.z) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        jn.y = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e7) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e7);
                                    }
                                    jn.z = true;
                                }
                                Field field3 = jn.y;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e8) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e8);
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i10 = this.X;
            if (i10 != 0) {
                context.setTheme(i10);
                context.getTheme().applyStyle(this.X, true);
            }
            if (i2 != 0 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof mo) {
                    if (((mo) activity2).e().c.compareTo(fo.h) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.T && !this.U) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (qpVarB2 != null) {
            t4.c(t4.b(context.getResources().getConfiguration()));
        }
        if (i3 == 0) {
            x(context).j();
        } else {
            x4 x4Var = this.a0;
            if (x4Var != null) {
                x4Var.c();
            }
        }
        x4 x4Var2 = this.b0;
        if (i3 == 3) {
            if (x4Var2 == null) {
                this.b0 = new x4(this, context);
            }
            this.b0.j();
        } else if (x4Var2 != null) {
            x4Var2.c();
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // defpackage.pr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.rr r6) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5.m(rr):void");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void n(Window window) {
        Drawable drawableE;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.q != null) {
            j7.e("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof w4) {
            j7.e("AppCompat has already installed itself into the Window");
            return;
        }
        w4 w4Var = new w4(this, callback);
        this.r = w4Var;
        window.setCallback(w4Var);
        Context context = this.p;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, m0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableE = null;
        } else {
            e5 e5VarA = e5.a();
            synchronized (e5VarA) {
                drawableE = e5VarA.a.e(context, resourceId, true);
            }
        }
        if (drawableE != null) {
            window.setBackgroundDrawable(drawableE);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.j0) != null) {
            return;
        }
        Object obj = this.o;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.k0) != null) {
            v4.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.k0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.j0 = v4.a(activity);
            } else {
                this.j0 = null;
            }
        } else {
            this.j0 = null;
        }
        H();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View n5Var;
        View view2 = null;
        if (this.i0 == null) {
            int[] iArr = lw.j;
            Context context2 = this.p;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.i0 = new u6();
            } else {
                try {
                    this.i0 = (u6) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.i0 = new u6();
                }
            }
        }
        u6 u6Var = this.i0;
        int i = z50.a;
        u6Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, lw.y, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context xbVar = (resourceId == 0 || ((context instanceof xb) && ((xb) context).a == resourceId)) ? context : new xb(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                n5Var = new n5(xbVar, attributeSet);
                break;
            case 1:
                n5Var = new h4(xbVar, attributeSet);
                break;
            case 2:
                n5Var = new k5(xbVar, attributeSet);
                break;
            case 3:
                n5Var = u6Var.e(xbVar, attributeSet);
                break;
            case 4:
                n5Var = new i5(xbVar, attributeSet, com.extremestudios.musicmanevo.R.attr.imageButtonStyle);
                break;
            case 5:
                n5Var = new p5(xbVar, attributeSet);
                break;
            case 6:
                n5Var = new b6(xbVar, attributeSet);
                break;
            case 7:
                n5Var = u6Var.d(xbVar, attributeSet);
                break;
            case 8:
                n5Var = new s6(xbVar, attributeSet);
                break;
            case 9:
                n5Var = new j5(xbVar, attributeSet, 0);
                break;
            case 10:
                n5Var = u6Var.a(xbVar, attributeSet);
                break;
            case 11:
                n5Var = u6Var.c(xbVar, attributeSet);
                break;
            case 12:
                n5Var = new g5(xbVar, attributeSet);
                break;
            case 13:
                n5Var = u6Var.b(xbVar, attributeSet);
                break;
            default:
                n5Var = null;
                break;
        }
        if (n5Var == null && context != xbVar) {
            Object[] objArr = u6Var.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = xbVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = u6.g;
                        if (i2 < 3) {
                            View viewF = u6Var.f(xbVar, str, strArr[i2]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = u6Var.f(xbVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            n5Var = view2;
        }
        if (n5Var != null) {
            Context context3 = n5Var.getContext();
            if ((context3 instanceof ContextWrapper) && n5Var.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, u6.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    n5Var.setOnClickListener(new t6(n5Var, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = xbVar.obtainStyledAttributes(attributeSet, u6.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = w60.a;
                    new l60(com.extremestudios.musicmanevo.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).d(n5Var, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = xbVar.obtainStyledAttributes(attributeSet, u6.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    w60.j(n5Var, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = xbVar.obtainStyledAttributes(attributeSet, u6.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = w60.a;
                    new l60(com.extremestudios.musicmanevo.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).d(n5Var, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return n5Var;
    }

    public final void p(int i, b5 b5Var, rr rrVar) {
        if (rrVar == null) {
            if (b5Var == null && i >= 0) {
                b5[] b5VarArr = this.P;
                if (i < b5VarArr.length) {
                    b5Var = b5VarArr[i];
                }
            }
            if (b5Var != null) {
                rrVar = b5Var.h;
            }
        }
        if ((b5Var == null || b5Var.m) && !this.U) {
            w4 w4Var = this.r;
            Window.Callback callback = this.q.getCallback();
            w4Var.getClass();
            try {
                w4Var.i = true;
                callback.onPanelClosed(i, rrVar);
            } finally {
                w4Var.i = false;
            }
        }
    }

    public final void q(rr rrVar) {
        r1 r1Var;
        if (this.O) {
            return;
        }
        this.O = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((i40) actionBarOverlayLayout.j).a.f;
        if (actionMenuView != null && (r1Var = actionMenuView.y) != null) {
            r1Var.d();
            o1 o1Var = r1Var.y;
            if (o1Var != null && o1Var.b()) {
                o1Var.i.dismiss();
            }
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.U) {
            callback.onPanelClosed(108, rrVar);
        }
        this.O = false;
    }

    public final void r(b5 b5Var, boolean z) {
        a5 a5Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        r1 r1Var;
        if (z && b5Var.a == 0 && (actionBarOverlayLayout = this.v) != null) {
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((i40) actionBarOverlayLayout.j).a.f;
            if (actionMenuView != null && (r1Var = actionMenuView.y) != null && r1Var.h()) {
                q(b5Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.p.getSystemService("window");
        if (windowManager != null && b5Var.m && (a5Var = b5Var.e) != null) {
            windowManager.removeView(a5Var);
            if (z) {
                p(b5Var.a, b5Var, null);
            }
        }
        b5Var.k = false;
        b5Var.l = false;
        b5Var.m = false;
        b5Var.f = null;
        b5Var.n = true;
        if (this.Q == b5Var) {
            this.Q = null;
        }
        if (b5Var.a == 0) {
            H();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        b5 b5VarY;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean z2;
        boolean zF;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        r1 r1Var;
        r1 r1Var2;
        r1 r1Var3;
        b5 b5VarY2;
        Object obj = this.o;
        if ((!(obj instanceof yn) && !(obj instanceof f3)) || (decorView = this.q.getDecorView()) == null || !v51.g(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                w4 w4Var = this.r;
                Window.Callback callback = this.q.getCallback();
                w4Var.getClass();
                try {
                    w4Var.h = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    w4Var.h = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.R = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    b5VarY2 = y(0);
                                    if (!b5VarY2.m) {
                                        F(b5VarY2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.y == null) {
                                    b5VarY = y(0);
                                    actionBarOverlayLayout = this.v;
                                    context = this.p;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.k();
                                        toolbar = ((i40) actionBarOverlayLayout.j).a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f) == null || !actionMenuView.x || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = b5VarY.m;
                                            if (!z || b5VarY.l) {
                                                r(b5VarY, true);
                                                z2 = z;
                                            } else {
                                                if (b5VarY.k) {
                                                    if (b5VarY.o) {
                                                        b5VarY.k = false;
                                                        zF = F(b5VarY, keyEvent);
                                                    } else {
                                                        zF = true;
                                                    }
                                                    if (zF) {
                                                        D(b5VarY, keyEvent);
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                                            actionBarOverlayLayout2.k();
                                            ActionMenuView actionMenuView2 = ((i40) actionBarOverlayLayout2.j).a.f;
                                            if (actionMenuView2 == null || (r1Var2 = actionMenuView2.y) == null || !r1Var2.h()) {
                                                if (!this.U && F(b5VarY, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                                                    actionBarOverlayLayout3.k();
                                                    ActionMenuView actionMenuView3 = ((i40) actionBarOverlayLayout3.j).a.f;
                                                    if (actionMenuView3 != null && (r1Var = actionMenuView3.y) != null && r1Var.l()) {
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                                                actionBarOverlayLayout4.k();
                                                ActionMenuView actionMenuView4 = ((i40) actionBarOverlayLayout4.j).a.f;
                                                if (actionMenuView4 == null || (r1Var3 = actionMenuView4.y) == null || !r1Var3.d()) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z = b5VarY.m;
                                        if (z) {
                                        }
                                        r(b5VarY, true);
                                        z2 = z;
                                    }
                                    if (z2) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (C()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    w4Var.h = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.R = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            b5VarY2 = y(0);
                            if (!b5VarY2.m) {
                                F(b5VarY2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.y == null) {
                            b5VarY = y(0);
                            actionBarOverlayLayout = this.v;
                            context = this.p;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.k();
                                toolbar = ((i40) actionBarOverlayLayout.j).a;
                                if (toolbar.getVisibility() == 0) {
                                    z = b5VarY.m;
                                    if (z) {
                                    }
                                    r(b5VarY, true);
                                    z2 = z;
                                } else {
                                    z = b5VarY.m;
                                    if (z) {
                                    }
                                    r(b5VarY, true);
                                    z2 = z;
                                }
                            } else {
                                z = b5VarY.m;
                                if (z) {
                                }
                                r(b5VarY, true);
                                z2 = z;
                            }
                            if (z2) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (C()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void u(int i) {
        b5 b5VarY = y(i);
        if (b5VarY.h != null) {
            Bundle bundle = new Bundle();
            b5VarY.h.t(bundle);
            if (bundle.size() > 0) {
                b5VarY.p = bundle;
            }
            b5VarY.h.w();
            b5VarY.h.clear();
        }
        b5VarY.o = true;
        b5VarY.n = true;
        if ((i == 108 || i == 0) && this.v != null) {
            b5 b5VarY2 = y(0);
            b5VarY2.k = false;
            F(b5VarY2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.D) {
            return;
        }
        Context context = this.p;
        int[] iArr = lw.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            j7.e("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            f(10);
        }
        this.M = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        w();
        this.q.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = 2;
        if (this.N) {
            viewGroup = this.L ? (ViewGroup) layoutInflaterFrom.inflate(com.extremestudios.musicmanevo.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.extremestudios.musicmanevo.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.M) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.extremestudios.musicmanevo.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.K = false;
            this.J = false;
        } else if (this.J) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.extremestudios.musicmanevo.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new xb(context, typedValue.resourceId) : context).inflate(com.extremestudios.musicmanevo.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.extremestudios.musicmanevo.R.id.decor_content_parent);
            this.v = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.q.getCallback());
            if (this.K) {
                this.v.j(109);
            }
            if (this.H) {
                this.v.j(2);
            }
            if (this.I) {
                this.v.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.J + ", windowActionBarOverlay: " + this.K + ", android:windowIsFloating: " + this.M + ", windowActionModeOverlay: " + this.L + ", windowNoTitle: " + this.N + " }");
        }
        s70 s70Var = new s70(i, this);
        WeakHashMap weakHashMap = w60.a;
        p60.h(viewGroup, s70Var);
        if (this.v == null) {
            this.F = (TextView) viewGroup.findViewById(com.extremestudios.musicmanevo.R.id.title);
        }
        boolean z = m70.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.extremestudios.musicmanevo.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.q.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new dr0(i, this));
        this.E = viewGroup;
        Object obj = this.o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.u;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                g80 g80Var = this.s;
                if (g80Var != null) {
                    i40 i40Var = (i40) g80Var.e;
                    if (!i40Var.g) {
                        Toolbar toolbar = i40Var.a;
                        i40Var.h = title;
                        if ((i40Var.b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (i40Var.g) {
                                w60.j(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.F;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.E.findViewById(R.id.content);
        View decorView = this.q.getDecorView();
        contentFrameLayout2.l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.D = true;
        b5 b5VarY = y(0);
        if (this.U || b5VarY.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.q == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.q != null) {
            return;
        }
        j7.e("We have not been given a Window");
    }

    public final z4 x(Context context) {
        if (this.a0 == null) {
            if (p83.m == null) {
                Context applicationContext = context.getApplicationContext();
                p83.m = new p83(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.a0 = new x4(this, p83.m);
        }
        return this.a0;
    }

    public final b5 y(int i) {
        b5[] b5VarArr = this.P;
        if (b5VarArr == null || b5VarArr.length <= i) {
            b5[] b5VarArr2 = new b5[i + 1];
            if (b5VarArr != null) {
                System.arraycopy(b5VarArr, 0, b5VarArr2, 0, b5VarArr.length);
            }
            this.P = b5VarArr2;
            b5VarArr = b5VarArr2;
        }
        b5 b5Var = b5VarArr[i];
        if (b5Var != null) {
            return b5Var;
        }
        b5 b5Var2 = new b5();
        b5Var2.a = i;
        b5Var2.n = false;
        b5VarArr[i] = b5Var2;
        return b5Var2;
    }

    public final void z() {
        v();
        if (this.J && this.s == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                this.s = new g80((Activity) obj, this.K);
            } else if (obj instanceof Dialog) {
                this.s = new g80((Dialog) obj);
            }
            g80 g80Var = this.s;
            if (g80Var != null) {
                g80Var.d(this.f0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
