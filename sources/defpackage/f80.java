package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class f80 extends v1 implements pr {
    public final Context h;
    public final rr i;
    public un1 j;
    public WeakReference k;
    public final /* synthetic */ g80 l;

    public f80(g80 g80Var, Context context, un1 un1Var) {
        this.l = g80Var;
        this.h = context;
        this.j = un1Var;
        rr rrVar = new rr(context);
        rrVar.l = 1;
        this.i = rrVar;
        rrVar.e = this;
    }

    @Override // defpackage.v1
    public final void a() {
        g80 g80Var = this.l;
        if (g80Var.i != this) {
            return;
        }
        if (g80Var.p) {
            g80Var.j = this;
            g80Var.k = this.j;
        } else {
            this.j.b(this);
        }
        this.j = null;
        g80Var.a(false);
        ActionBarContextView actionBarContextView = g80Var.f;
        if (actionBarContextView.p == null) {
            actionBarContextView.e();
        }
        g80Var.c.setHideOnContentScrollEnabled(g80Var.u);
        g80Var.i = null;
    }

    @Override // defpackage.v1
    public final View b() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.v1
    public final rr c() {
        return this.i;
    }

    @Override // defpackage.v1
    public final MenuInflater d() {
        return new n20(this.h);
    }

    @Override // defpackage.v1
    public final CharSequence e() {
        return this.l.f.getSubtitle();
    }

    @Override // defpackage.v1
    public final CharSequence f() {
        return this.l.f.getTitle();
    }

    @Override // defpackage.v1
    public final void g() {
        if (this.l.i != this) {
            return;
        }
        rr rrVar = this.i;
        rrVar.w();
        try {
            this.j.j(this, rrVar);
        } finally {
            rrVar.v();
        }
    }

    @Override // defpackage.v1
    public final boolean h() {
        return this.l.f.x;
    }

    @Override // defpackage.pr
    public final boolean i(rr rrVar, MenuItem menuItem) {
        un1 un1Var = this.j;
        if (un1Var != null) {
            return ((y91) un1Var.g).n(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.v1
    public final void j(View view) {
        this.l.f.setCustomView(view);
        this.k = new WeakReference(view);
    }

    @Override // defpackage.v1
    public final void k(int i) {
        l(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.v1
    public final void l(CharSequence charSequence) {
        this.l.f.setSubtitle(charSequence);
    }

    @Override // defpackage.pr
    public final void m(rr rrVar) {
        if (this.j == null) {
            return;
        }
        g();
        r1 r1Var = this.l.f.i;
        if (r1Var != null) {
            r1Var.l();
        }
    }

    @Override // defpackage.v1
    public final void n(int i) {
        o(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.v1
    public final void o(CharSequence charSequence) {
        this.l.f.setTitle(charSequence);
    }

    @Override // defpackage.v1
    public final void p(boolean z) {
        this.g = z;
        this.l.f.setTitleOptional(z);
    }
}
