package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public class k20 extends df {
    public Dialog k0;
    public DialogInterface.OnCancelListener l0;
    public AlertDialog m0;

    @Override // defpackage.df
    public final Dialog A() {
        Dialog dialog = this.k0;
        if (dialog != null) {
            return dialog;
        }
        this.b0 = false;
        if (this.m0 == null) {
            mj mjVar = this.x;
            c4 c4Var = mjVar == null ? null : mjVar.D;
            dq.f(c4Var);
            this.m0 = new AlertDialog.Builder(c4Var).create();
        }
        return this.m0;
    }

    @Override // defpackage.df, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.l0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
