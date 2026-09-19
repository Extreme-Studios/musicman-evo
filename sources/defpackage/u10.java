package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public final class u10 extends zr implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context g;
    public final rr h;
    public final or i;
    public final boolean j;
    public final int k;
    public final int l;
    public final fs m;
    public PopupWindow.OnDismissListener p;
    public View q;
    public View r;
    public gs s;
    public ViewTreeObserver t;
    public boolean u;
    public boolean v;
    public int w;
    public boolean y;
    public final s5 n = new s5(3, this);
    public final d9 o = new d9(this, 1);
    public int x = 0;

    public u10(Context context, rr rrVar, View view, int i, boolean z) {
        this.g = context;
        this.h = rrVar;
        this.j = z;
        this.i = new or(rrVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.l = i;
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.q = view;
        this.m = new fs(context, null, i, 0);
        rrVar.b(this, context);
    }

    @Override // defpackage.m00
    public final boolean a() {
        return !this.u && this.m.E.isShowing();
    }

    @Override // defpackage.hs
    public final void c(rr rrVar, boolean z) {
        if (rrVar != this.h) {
            return;
        }
        dismiss();
        gs gsVar = this.s;
        if (gsVar != null) {
            gsVar.c(rrVar, z);
        }
    }

    @Override // defpackage.m00
    public final void d() {
        View view;
        if (a()) {
            return;
        }
        if (this.u || (view = this.q) == null) {
            j7.e("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.r = view;
        fs fsVar = this.m;
        l5 l5Var = fsVar.E;
        l5 l5Var2 = fsVar.E;
        l5Var.setOnDismissListener(this);
        fsVar.u = this;
        fsVar.D = true;
        l5Var2.setFocusable(true);
        View view2 = this.r;
        boolean z = this.t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.t = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.n);
        }
        view2.addOnAttachStateChangeListener(this.o);
        fsVar.t = view2;
        fsVar.q = this.x;
        boolean z2 = this.v;
        Context context = this.g;
        or orVar = this.i;
        if (!z2) {
            this.w = zr.m(orVar, context, this.k);
            this.v = true;
        }
        fsVar.r(this.w);
        l5Var2.setInputMethodMode(2);
        Rect rect = this.f;
        fsVar.C = rect != null ? new Rect(rect) : null;
        fsVar.d();
        yf yfVar = fsVar.h;
        yfVar.setOnKeyListener(this);
        if (this.y) {
            rr rrVar = this.h;
            if (rrVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) yfVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(rrVar.m);
                }
                frameLayout.setEnabled(false);
                yfVar.addHeaderView(frameLayout, null, false);
            }
        }
        fsVar.p(orVar);
        fsVar.d();
    }

    @Override // defpackage.m00
    public final void dismiss() {
        if (a()) {
            this.m.dismiss();
        }
    }

    @Override // defpackage.hs
    public final void e(gs gsVar) {
        this.s = gsVar;
    }

    @Override // defpackage.hs
    public final void g() {
        this.v = false;
        or orVar = this.i;
        if (orVar != null) {
            orVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.m00
    public final yf h() {
        return this.m.h;
    }

    @Override // defpackage.hs
    public final boolean j(g20 g20Var) {
        boolean z;
        if (g20Var.hasVisibleItems()) {
            bs bsVar = new bs(this.g, g20Var, this.r, this.j, this.l, 0);
            gs gsVar = this.s;
            bsVar.h = gsVar;
            zr zrVar = bsVar.i;
            if (zrVar != null) {
                zrVar.e(gsVar);
            }
            int size = g20Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = g20Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            bsVar.g = z;
            zr zrVar2 = bsVar.i;
            if (zrVar2 != null) {
                zrVar2.o(z);
            }
            bsVar.j = this.p;
            this.p = null;
            this.h.c(false);
            fs fsVar = this.m;
            int width = fsVar.k;
            int iN = fsVar.n();
            if ((Gravity.getAbsoluteGravity(this.x, this.q.getLayoutDirection()) & 7) == 5) {
                width += this.q.getWidth();
            }
            if (!bsVar.b()) {
                if (bsVar.e != null) {
                    bsVar.d(width, iN, true, true);
                }
            }
            gs gsVar2 = this.s;
            if (gsVar2 != null) {
                gsVar2.i(g20Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.hs
    public final boolean k() {
        return false;
    }

    @Override // defpackage.zr
    public final void n(View view) {
        this.q = view;
    }

    @Override // defpackage.zr
    public final void o(boolean z) {
        this.i.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.u = true;
        this.h.c(true);
        ViewTreeObserver viewTreeObserver = this.t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.t = this.r.getViewTreeObserver();
            }
            this.t.removeGlobalOnLayoutListener(this.n);
            this.t = null;
        }
        this.r.removeOnAttachStateChangeListener(this.o);
        PopupWindow.OnDismissListener onDismissListener = this.p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.zr
    public final void p(int i) {
        this.x = i;
    }

    @Override // defpackage.zr
    public final void q(int i) {
        this.m.k = i;
    }

    @Override // defpackage.zr
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.p = onDismissListener;
    }

    @Override // defpackage.zr
    public final void s(boolean z) {
        this.y = z;
    }

    @Override // defpackage.zr
    public final void t(int i) {
        this.m.i(i);
    }

    @Override // defpackage.zr
    public final void l(rr rrVar) {
    }
}
