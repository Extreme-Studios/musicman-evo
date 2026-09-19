package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class y22 extends jt0 implements mn1 {
    public final String f;
    public final String g;

    public y22(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f = str;
        this.g = str2;
    }

    public static mn1 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof mn1 ? (mn1) iInterfaceQueryLocalInterface : new cn1(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 2);
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.g);
        return true;
    }

    @Override // defpackage.mn1
    public final String b() {
        return this.f;
    }

    @Override // defpackage.mn1
    public final String d() {
        return this.g;
    }
}
