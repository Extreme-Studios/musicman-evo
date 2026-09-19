package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class bf implements DialogInterface.OnDismissListener {
    public final /* synthetic */ df f;

    public bf(df dfVar) {
        this.f = dfVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        df dfVar = this.f;
        Dialog dialog = dfVar.f0;
        if (dialog != null) {
            dfVar.onDismiss(dialog);
        }
    }
}
