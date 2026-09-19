package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class g40 implements View.OnClickListener {
    public final l1 f;
    public final /* synthetic */ i40 g;

    public g40(i40 i40Var) {
        this.g = i40Var;
        Context context = i40Var.a.getContext();
        CharSequence charSequence = i40Var.h;
        l1 l1Var = new l1();
        l1Var.e = 4096;
        l1Var.g = 4096;
        l1Var.l = null;
        l1Var.m = null;
        l1Var.n = false;
        l1Var.o = false;
        l1Var.p = 16;
        l1Var.i = context;
        l1Var.a = charSequence;
        this.f = l1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i40 i40Var = this.g;
        Window.Callback callback = i40Var.k;
        if (callback == null || !i40Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f);
    }
}
