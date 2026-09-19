package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c40 implements hs {
    public rr f;
    public ur g;
    public final /* synthetic */ Toolbar h;

    public c40(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // defpackage.hs
    public final boolean b(ur urVar) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof w9) {
            ((wr) ((w9) callback)).f.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.n);
        toolbar.removeView(toolbar.m);
        toolbar.n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.g = null;
        toolbar.requestLayout();
        urVar.C = false;
        urVar.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // defpackage.hs
    public final boolean f(ur urVar) {
        Toolbar toolbar = this.h;
        toolbar.c();
        ViewParent parent = toolbar.m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.m);
            }
            toolbar.addView(toolbar.m);
        }
        View actionView = urVar.getActionView();
        toolbar.n = actionView;
        this.g = urVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.n);
            }
            d40 d40VarH = Toolbar.h();
            d40VarH.a = (toolbar.s & 112) | 8388611;
            d40VarH.b = 2;
            toolbar.n.setLayoutParams(d40VarH);
            toolbar.addView(toolbar.n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((d40) childAt.getLayoutParams()).b != 2 && childAt != toolbar.f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        urVar.C = true;
        urVar.n.p(false);
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof w9) {
            ((wr) ((w9) callback)).f.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.hs
    public final void g() {
        if (this.g != null) {
            rr rrVar = this.f;
            if (rrVar != null) {
                int size = rrVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f.getItem(i) == this.g) {
                        return;
                    }
                }
            }
            b(this.g);
        }
    }

    @Override // defpackage.hs
    public final void i(Context context, rr rrVar) {
        ur urVar;
        rr rrVar2 = this.f;
        if (rrVar2 != null && (urVar = this.g) != null) {
            rrVar2.d(urVar);
        }
        this.f = rrVar;
    }

    @Override // defpackage.hs
    public final boolean j(g20 g20Var) {
        return false;
    }

    @Override // defpackage.hs
    public final boolean k() {
        return false;
    }

    @Override // defpackage.hs
    public final void c(rr rrVar, boolean z) {
    }
}
