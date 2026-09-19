package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.ar;
import defpackage.ux;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends ux {
    @Override // defpackage.ux
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = ar.o(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
