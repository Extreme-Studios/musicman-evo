package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class vo1 extends jt0 implements ip1 {
    public vo1() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
        kt0.f(parcel);
        g0(fu1Var);
        parcel2.writeNoException();
        return true;
    }
}
