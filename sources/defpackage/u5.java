package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public final class u5 implements a6, DialogInterface.OnClickListener {
    public f3 f;
    public v5 g;
    public CharSequence h;
    public final /* synthetic */ b6 i;

    public u5(b6 b6Var) {
        this.i = b6Var;
    }

    @Override // defpackage.a6
    public final boolean a() {
        f3 f3Var = this.f;
        if (f3Var != null) {
            return f3Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.a6
    public final int b() {
        return 0;
    }

    @Override // defpackage.a6
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.a6
    public final void dismiss() {
        f3 f3Var = this.f;
        if (f3Var != null) {
            f3Var.dismiss();
            this.f = null;
        }
    }

    @Override // defpackage.a6
    public final void e(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // defpackage.a6
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.a6
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.a6
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.a6
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.a6
    public final void m(int i, int i2) {
        if (this.g == null) {
            return;
        }
        b6 b6Var = this.i;
        e3 e3Var = new e3(b6Var.getPopupContext());
        a3 a3Var = (a3) e3Var.h;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            a3Var.d = charSequence;
        }
        v5 v5Var = this.g;
        int selectedItemPosition = b6Var.getSelectedItemPosition();
        a3Var.g = v5Var;
        a3Var.h = this;
        a3Var.j = selectedItemPosition;
        a3Var.i = true;
        f3 f3VarA = e3Var.a();
        this.f = f3VarA;
        AlertController$RecycleListView alertController$RecycleListView = f3VarA.k.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f.show();
    }

    @Override // defpackage.a6
    public final int n() {
        return 0;
    }

    @Override // defpackage.a6
    public final CharSequence o() {
        return this.h;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        b6 b6Var = this.i;
        b6Var.setSelection(i);
        if (b6Var.getOnItemClickListener() != null) {
            b6Var.performItemClick(null, i, this.g.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.a6
    public final void p(ListAdapter listAdapter) {
        this.g = (v5) listAdapter;
    }
}
