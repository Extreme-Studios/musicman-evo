package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class as implements PopupWindow.OnDismissListener {
    public final /* synthetic */ bs f;

    public as(bs bsVar) {
        this.f = bsVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f.c();
    }
}
