package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class uf1 extends v90 implements ig1 {
    public uf1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 2);
    }

    @Override // defpackage.ig1
    public final void n0(String str, String str2) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        parcelU.writeString(str2);
        K0(parcelU, 1);
    }
}
