package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class dn implements en {
    public final InputContentInfo f;

    public dn(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.en
    public final ClipDescription getDescription() {
        return this.f.getDescription();
    }

    @Override // defpackage.en
    public final Object i() {
        return this.f;
    }

    @Override // defpackage.en
    public final Uri j() {
        return this.f.getContentUri();
    }

    @Override // defpackage.en
    public final void k() {
        this.f.requestPermission();
    }

    @Override // defpackage.en
    public final Uri n() {
        return this.f.getLinkUri();
    }

    public dn(Object obj) {
        this.f = (InputContentInfo) obj;
    }
}
