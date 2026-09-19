package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g20 extends rr implements SubMenu {
    public final ur A;
    public final rr z;

    public g20(Context context, rr rrVar, ur urVar) {
        super(context);
        this.z = rrVar;
        this.A = urVar;
    }

    @Override // defpackage.rr
    public final boolean d(ur urVar) {
        return this.z.d(urVar);
    }

    @Override // defpackage.rr
    public final boolean e(rr rrVar, MenuItem menuItem) {
        return super.e(rrVar, menuItem) || this.z.e(rrVar, menuItem);
    }

    @Override // defpackage.rr
    public final boolean f(ur urVar) {
        return this.z.f(urVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.rr
    public final String j() {
        ur urVar = this.A;
        int i = urVar != null ? urVar.a : 0;
        if (i == 0) {
            return null;
        }
        return ec.h("android:menu:actionviewstates:", i);
    }

    @Override // defpackage.rr
    public final rr k() {
        return this.z.k();
    }

    @Override // defpackage.rr
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.rr
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.rr
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.rr, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.rr, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
