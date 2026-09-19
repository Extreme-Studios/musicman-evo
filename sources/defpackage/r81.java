package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class r81 extends jt0 implements s81 {
    public r81() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b();
        } else if (i == 2) {
            int i2 = parcel.readInt();
            kt0.f(parcel);
            t(i2);
        } else {
            if (i != 3) {
                return false;
            }
            fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
            kt0.f(parcel);
            a(fu1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
