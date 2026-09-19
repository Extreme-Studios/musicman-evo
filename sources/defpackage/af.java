package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes.dex */
public final class af implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ af(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                df dfVar = (df) obj;
                Dialog dialog = dfVar.f0;
                if (dialog != null) {
                    dfVar.onCancel(dialog);
                }
                break;
            case 1:
                ((oo0) obj).b();
                break;
            case 2:
                ((JsResult) obj).cancel();
                break;
            case 3:
                ((JsPromptResult) obj).cancel();
                break;
            default:
                nf0 nf0Var = (nf0) obj;
                if (nf0Var != null) {
                    nf0Var.y();
                }
                break;
        }
    }
}
