package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class wr1 extends v90 implements ls1 {
    public wr1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 2);
    }

    @Override // defpackage.ls1
    public final void A2(String str, rm rmVar, rm rmVar2) {
        Parcel parcelU = U();
        parcelU.writeString(str);
        kt0.e(parcelU, rmVar);
        kt0.e(parcelU, rmVar2);
        K0(parcelU, 1);
    }
}
