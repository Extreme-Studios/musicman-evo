package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class xo implements hs, AdapterView.OnItemClickListener {
    public Context f;
    public LayoutInflater g;
    public rr h;
    public ExpandedMenuView i;
    public gs j;
    public wo k;

    public xo(ContextWrapper contextWrapper) {
        this.f = contextWrapper;
        this.g = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.hs
    public final boolean b(ur urVar) {
        return false;
    }

    @Override // defpackage.hs
    public final void c(rr rrVar, boolean z) {
        gs gsVar = this.j;
        if (gsVar != null) {
            gsVar.c(rrVar, z);
        }
    }

    @Override // defpackage.hs
    public final void e(gs gsVar) {
        throw null;
    }

    @Override // defpackage.hs
    public final boolean f(ur urVar) {
        return false;
    }

    @Override // defpackage.hs
    public final void g() {
        wo woVar = this.k;
        if (woVar != null) {
            woVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.hs
    public final void i(Context context, rr rrVar) {
        if (this.f != null) {
            this.f = context;
            if (this.g == null) {
                this.g = LayoutInflater.from(context);
            }
        }
        this.h = rrVar;
        wo woVar = this.k;
        if (woVar != null) {
            woVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.hs
    public final boolean j(g20 g20Var) {
        boolean zHasVisibleItems = g20Var.hasVisibleItems();
        Context context = g20Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        sr srVar = new sr();
        srVar.f = g20Var;
        e3 e3Var = new e3(context);
        a3 a3Var = (a3) e3Var.h;
        xo xoVar = new xo(a3Var.a);
        srVar.h = xoVar;
        xoVar.j = srVar;
        g20Var.b(xoVar, context);
        xo xoVar2 = srVar.h;
        if (xoVar2.k == null) {
            xoVar2.k = new wo(xoVar2);
        }
        a3Var.g = xoVar2.k;
        a3Var.h = srVar;
        View view = g20Var.o;
        if (view != null) {
            a3Var.e = view;
        } else {
            a3Var.c = g20Var.n;
            a3Var.d = g20Var.m;
        }
        a3Var.f = srVar;
        f3 f3VarA = e3Var.a();
        srVar.g = f3VarA;
        f3VarA.setOnDismissListener(srVar);
        WindowManager.LayoutParams attributes = srVar.g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        srVar.g.show();
        gs gsVar = this.j;
        if (gsVar == null) {
            return true;
        }
        gsVar.i(g20Var);
        return true;
    }

    @Override // defpackage.hs
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.q(this.k.getItem(i), this, 0);
    }
}
