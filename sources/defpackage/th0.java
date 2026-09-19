package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.webkit.JsPromptResult;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public th0(jq0 jq0Var, Context context) {
        this.f = 2;
        this.g = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                ((AtomicInteger) obj).set(i);
                break;
            case 1:
                ((oo0) obj).b();
                break;
            case 2:
                zb3 zb3Var = vc3.C.c;
                zb3.u((Context) obj, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
            case 3:
                ((e61) obj).z("User canceled the download.");
                break;
            default:
                ((JsPromptResult) obj).cancel();
                break;
        }
    }

    public /* synthetic */ th0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
