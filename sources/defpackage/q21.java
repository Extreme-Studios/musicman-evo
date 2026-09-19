package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class q21 extends jt0 {
    public final /* synthetic */ cb1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q21(r21 r21Var, cb1 cb1Var) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f = cb1Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) kt0.b(parcel, ParcelFileDescriptor.CREATOR);
        kt0.f(parcel);
        this.f.b(parcelFileDescriptor);
        return true;
    }
}
