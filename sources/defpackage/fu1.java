package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class fu1 extends f0 {
    public static final Parcelable.Creator<fu1> CREATOR = new os0(29);
    public final int f;
    public final String g;
    public final String h;
    public fu1 i;
    public IBinder j;

    public fu1(int i, String str, String str2, fu1 fu1Var, IBinder iBinder) {
        this.f = i;
        this.g = str;
        this.h = str2;
        this.i = fu1Var;
        this.j = iBinder;
    }

    public final g2 a() {
        fu1 fu1Var = this.i;
        g2 g2Var = null;
        if (fu1Var != null) {
            String str = fu1Var.h;
            g2Var = new g2(fu1Var.f, fu1Var.g, str, (g2) null);
        }
        return new g2(this.f, this.g, this.h, g2Var);
    }

    public final np b() {
        g2 g2Var;
        lu1 ft1Var;
        fu1 fu1Var = this.i;
        if (fu1Var == null) {
            g2Var = null;
        } else {
            g2Var = new g2(fu1Var.f, fu1Var.g, fu1Var.h, (g2) null);
        }
        IBinder iBinder = this.j;
        if (iBinder == null) {
            ft1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            ft1Var = iInterfaceQueryLocalInterface instanceof lu1 ? (lu1) iInterfaceQueryLocalInterface : new ft1(iBinder);
        }
        return new np(this.f, this.g, this.h, g2Var, ft1Var != null ? new qx(ft1Var) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.q(parcel, 2, this.g);
        s90.q(parcel, 3, this.h);
        s90.p(parcel, 4, this.i, i);
        s90.o(parcel, 5, this.j);
        s90.J(parcel, iW);
    }
}
