package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class jq0 implements Runnable {
    public final /* synthetic */ Context f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    public jq0(yq0 yq0Var, Context context, String str, boolean z, boolean z2) {
        this.f = context;
        this.g = str;
        this.h = z;
        this.i = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zb3 zb3Var = vc3.C.c;
        Context context = this.f;
        AlertDialog.Builder builderK = zb3.k(context);
        builderK.setMessage(this.g);
        if (this.h) {
            builderK.setTitle("Error");
        } else {
            builderK.setTitle("Info");
        }
        if (this.i) {
            builderK.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderK.setPositiveButton("Learn More", new th0(this, context));
            builderK.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderK.create().show();
    }
}
