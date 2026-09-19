package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class t10 extends v1 implements pr {
    public Context h;
    public ActionBarContextView i;
    public un1 j;
    public WeakReference k;
    public boolean l;
    public rr m;

    @Override // defpackage.v1
    public final void a() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.j.b(this);
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
        return this.m;
    }

    @Override // defpackage.v1
    public final MenuInflater d() {
        return new n20(this.i.getContext());
    }

    @Override // defpackage.v1
    public final CharSequence e() {
        return this.i.getSubtitle();
    }

    @Override // defpackage.v1
    public final CharSequence f() {
        return this.i.getTitle();
    }

    @Override // defpackage.v1
    public final void g() {
        this.j.j(this, this.m);
    }

    @Override // defpackage.v1
    public final boolean h() {
        return this.i.x;
    }

    @Override // defpackage.pr
    public final boolean i(rr rrVar, MenuItem menuItem) {
        return ((y91) this.j.g).n(this, menuItem);
    }

    @Override // defpackage.v1
    public final void j(View view) {
        this.i.setCustomView(view);
        this.k = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.v1
    public final void k(int i) {
        l(this.h.getString(i));
    }

    @Override // defpackage.v1
    public final void l(CharSequence charSequence) {
        this.i.setSubtitle(charSequence);
    }

    @Override // defpackage.pr
    public final void m(rr rrVar) {
        g();
        r1 r1Var = this.i.i;
        if (r1Var != null) {
            r1Var.l();
        }
    }

    @Override // defpackage.v1
    public final void n(int i) {
        o(this.h.getString(i));
    }

    @Override // defpackage.v1
    public final void o(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // defpackage.v1
    public final void p(boolean z) {
        this.g = z;
        this.i.setTitleOptional(z);
    }
}
