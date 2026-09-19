package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class fs extends fp implements tr {
    public static final Method I;
    public dr0 H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.tr
    public final void g(rr rrVar, MenuItem menuItem) {
        dr0 dr0Var = this.H;
        if (dr0Var != null) {
            dr0Var.g(rrVar, menuItem);
        }
    }

    @Override // defpackage.tr
    public final void j(rr rrVar, ur urVar) {
        dr0 dr0Var = this.H;
        if (dr0Var != null) {
            dr0Var.j(rrVar, urVar);
        }
    }

    @Override // defpackage.fp
    public final yf q(Context context, boolean z) {
        es esVar = new es(context, z);
        esVar.setHoverListener(this);
        return esVar;
    }
}
