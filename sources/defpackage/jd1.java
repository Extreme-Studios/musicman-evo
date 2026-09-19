package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes.dex */
public final class jd1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ JsResult g;

    public /* synthetic */ jd1(JsResult jsResult, int i) {
        this.f = i;
        this.g = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f) {
            case 0:
                this.g.cancel();
                break;
            default:
                this.g.confirm();
                break;
        }
    }
}
