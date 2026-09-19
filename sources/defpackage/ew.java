package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ew extends f0 {
    public static final Parcelable.Creator<ew> CREATOR = new os0(28);
    public final boolean f;
    public final ig1 g;
    public final IBinder h;

    public ew(boolean z, IBinder iBinder, IBinder iBinder2) {
        ig1 uf1Var;
        this.f = z;
        if (iBinder != null) {
            int i = vt0.g;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            uf1Var = iInterfaceQueryLocalInterface instanceof ig1 ? (ig1) iInterfaceQueryLocalInterface : new uf1(iBinder);
        } else {
            uf1Var = null;
        }
        this.g = uf1Var;
        this.h = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ig1 ig1Var = this.g;
        s90.o(parcel, 2, ig1Var == null ? null : ig1Var.asBinder());
        s90.o(parcel, 3, this.h);
        s90.J(parcel, iW);
    }
}
