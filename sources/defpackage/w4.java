package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.extremestudios.musicmanevo.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w4 implements Window.Callback {
    public final Window.Callback f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final /* synthetic */ c5 j;

    public w4(c5 c5Var, Window.Callback callback) {
        this.j = c5Var;
        if (callback != null) {
            this.f = callback;
        } else {
            j7.p("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.g = true;
            callback.onContentChanged();
        } finally {
            this.g = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        c80.a(this.f, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.h;
        Window.Callback callback = this.f;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.j.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        b5 b5Var;
        boolean z;
        boolean zE;
        rr rrVar;
        boolean zPerformShortcut;
        if (!this.f.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            c5 c5Var = this.j;
            c5Var.z();
            g80 g80Var = c5Var.s;
            if (g80Var == null) {
                b5Var = c5Var.Q;
                if (b5Var == null && c5Var.E(b5Var, keyEvent.getKeyCode(), keyEvent)) {
                    b5 b5Var2 = c5Var.Q;
                    if (b5Var2 != null) {
                        b5Var2.l = true;
                    }
                } else {
                    if (c5Var.Q == null) {
                        b5 b5VarY = c5Var.y(0);
                        c5Var.F(b5VarY, keyEvent);
                        zE = c5Var.E(b5VarY, keyEvent.getKeyCode(), keyEvent);
                        b5VarY.k = false;
                        if (zE) {
                        }
                    }
                    z = false;
                }
                z = true;
            } else {
                f80 f80Var = g80Var.i;
                if (f80Var == null || (rrVar = f80Var.i) == null) {
                    zPerformShortcut = false;
                } else {
                    rrVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = rrVar.performShortcut(keyCode, keyEvent, 0);
                }
                if (zPerformShortcut) {
                    z = true;
                } else {
                    b5Var = c5Var.Q;
                    if (b5Var == null) {
                        if (c5Var.Q == null) {
                            b5 b5VarY2 = c5Var.y(0);
                            c5Var.F(b5VarY2, keyEvent);
                            zE = c5Var.E(b5VarY2, keyEvent.getKeyCode(), keyEvent);
                            b5VarY2.k = false;
                            if (zE) {
                                z = true;
                            }
                        }
                        z = false;
                    } else {
                        if (c5Var.Q == null) {
                            b5 b5VarY3 = c5Var.y(0);
                            c5Var.F(b5VarY3, keyEvent);
                            zE = c5Var.E(b5VarY3, keyEvent.getKeyCode(), keyEvent);
                            b5VarY3.k = false;
                            if (zE) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.g) {
            this.f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof rr)) {
            return this.f.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            c5 c5Var = this.j;
            c5Var.z();
            g80 g80Var = c5Var.s;
            if (g80Var != null) {
                ArrayList arrayList = g80Var.m;
                if (true != g80Var.l) {
                    g80Var.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        j7.j();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.i) {
            this.f.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        c5 c5Var = this.j;
        if (i != 108) {
            if (i == 0) {
                b5 b5VarY = c5Var.y(i);
                if (b5VarY.m) {
                    c5Var.r(b5VarY, false);
                    return;
                }
                return;
            }
            return;
        }
        c5Var.z();
        g80 g80Var = c5Var.s;
        if (g80Var != null) {
            ArrayList arrayList = g80Var.m;
            if (g80Var.l) {
                g80Var.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                j7.j();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        d80.a(this.f, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        rr rrVar = menu instanceof rr ? (rr) menu : null;
        if (i == 0 && rrVar == null) {
            return false;
        }
        if (rrVar != null) {
            rrVar.x = true;
        }
        boolean zOnPreparePanel = this.f.onPreparePanel(i, view, menu);
        if (rrVar != null) {
            rrVar.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        rr rrVar = this.j.y(0).h;
        if (rrVar != null) {
            d(list, rrVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return b80.a(this.f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        c5 c5Var = this.j;
        Context context = c5Var.p;
        if (i != 0) {
            return b80.b(this.f, callback, i);
        }
        y91 y91Var = new y91(context, callback);
        v1 v1Var = c5Var.y;
        if (v1Var != null) {
            v1Var.a();
        }
        un1 un1Var = new un1((Object) c5Var, (Object) y91Var, 2, false);
        c5Var.z();
        g80 g80Var = c5Var.s;
        int i2 = 1;
        if (g80Var != null) {
            f80 f80Var = g80Var.i;
            if (f80Var != null) {
                f80Var.a();
            }
            g80Var.c.setHideOnContentScrollEnabled(false);
            g80Var.f.e();
            f80 f80Var2 = new f80(g80Var, g80Var.f.getContext(), un1Var);
            rr rrVar = f80Var2.i;
            rrVar.w();
            try {
                boolean zP = ((y91) f80Var2.j.g).p(f80Var2, rrVar);
                rrVar.v();
                if (zP) {
                    g80Var.i = f80Var2;
                    f80Var2.g();
                    g80Var.f.c(f80Var2);
                    g80Var.a(true);
                } else {
                    f80Var2 = null;
                }
                c5Var.y = f80Var2;
            } catch (Throwable th) {
                rrVar.v();
                throw th;
            }
        }
        if (c5Var.y == null) {
            h70 h70Var = c5Var.C;
            if (h70Var != null) {
                h70Var.b();
            }
            v1 v1Var2 = c5Var.y;
            if (v1Var2 != null) {
                v1Var2.a();
            }
            if (c5Var.z == null) {
                if (c5Var.M) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        xb xbVar = new xb(context, 0);
                        xbVar.getTheme().setTo(themeNewTheme);
                        context = xbVar;
                    }
                    c5Var.z = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    c5Var.A = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    c5Var.A.setContentView(c5Var.z);
                    c5Var.A.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    c5Var.z.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    c5Var.A.setHeight(-2);
                    c5Var.B = new q4(c5Var, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) c5Var.E.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        c5Var.z();
                        g80 g80Var2 = c5Var.s;
                        Context contextB = g80Var2 != null ? g80Var2.b() : null;
                        if (contextB != null) {
                            context = contextB;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        c5Var.z = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (c5Var.z != null) {
                h70 h70Var2 = c5Var.C;
                if (h70Var2 != null) {
                    h70Var2.b();
                }
                c5Var.z.e();
                Context context2 = c5Var.z.getContext();
                ActionBarContextView actionBarContextView = c5Var.z;
                t10 t10Var = new t10();
                t10Var.h = context2;
                t10Var.i = actionBarContextView;
                t10Var.j = un1Var;
                rr rrVar2 = new rr(actionBarContextView.getContext());
                rrVar2.l = 1;
                t10Var.m = rrVar2;
                rrVar2.e = t10Var;
                if (((y91) un1Var.g).p(t10Var, rrVar2)) {
                    t10Var.g();
                    c5Var.z.c(t10Var);
                    c5Var.y = t10Var;
                    boolean z = c5Var.D && (viewGroup = c5Var.E) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = c5Var.z;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        h70 h70VarA = w60.a(c5Var.z);
                        h70VarA.a(1.0f);
                        c5Var.C = h70VarA;
                        h70VarA.d(new r4(i2, c5Var));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        c5Var.z.setVisibility(0);
                        if (c5Var.z.getParent() instanceof View) {
                            View view = (View) c5Var.z.getParent();
                            WeakHashMap weakHashMap = w60.a;
                            n60.c(view);
                        }
                    }
                    if (c5Var.A != null) {
                        c5Var.q.getDecorView().post(c5Var.B);
                    }
                } else {
                    c5Var.y = null;
                }
            }
            c5Var.H();
            c5Var.y = c5Var.y;
        }
        c5Var.H();
        v1 v1Var3 = c5Var.y;
        if (v1Var3 != null) {
            return y91Var.h(v1Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
