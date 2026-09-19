package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class vh extends DialogFragment {
    public Dialog f;
    public DialogInterface.OnCancelListener g;
    public AlertDialog h;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.h == null) {
            Activity activity = getActivity();
            dq.f(activity);
            this.h = new AlertDialog.Builder(activity).create();
        }
        return this.h;
    }
}
