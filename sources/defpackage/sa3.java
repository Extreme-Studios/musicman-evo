package defpackage;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class sa3 implements Callable {
    public final long a;

    public sa3(long j) {
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.E.remove(Long.valueOf(this.a)) == null) {
            return null;
        }
        vc3.C.h.d("AdOverlayObjectsCleanupTask", new Exception("Key was non-null in AdOverlayObjectsCleanupTask"));
        return null;
    }
}
