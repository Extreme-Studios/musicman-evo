package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bb0 extends f0 {
    public static final Parcelable.Creator<bb0> CREATOR = new a2(26);
    public final int f;
    public final IBinder g;
    public final db h;
    public final boolean i;
    public final boolean j;

    public bb0(int i, IBinder iBinder, db dbVar, boolean z, boolean z2) {
        this.f = i;
        this.g = iBinder;
        this.h = dbVar;
        this.i = z;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        Object ue3Var;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof bb0)) {
                return false;
            }
            bb0 bb0Var = (bb0) obj;
            if (!this.h.equals(bb0Var.h)) {
                return false;
            }
            Object ue3Var2 = null;
            IBinder iBinder = this.g;
            if (iBinder == null) {
                ue3Var = null;
            } else {
                int i = d1.g;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                ue3Var = iInterfaceQueryLocalInterface instanceof lm ? (lm) iInterfaceQueryLocalInterface : new ue3(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = bb0Var.g;
            if (iBinder2 != null) {
                int i2 = d1.g;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                ue3Var2 = iInterfaceQueryLocalInterface2 instanceof lm ? (lm) iInterfaceQueryLocalInterface2 : new ue3(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!s90.d(ue3Var, ue3Var2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.o(parcel, 2, this.g);
        s90.p(parcel, 3, this.h, i);
        s90.P(parcel, 4, 4);
        parcel.writeInt(this.i ? 1 : 0);
        s90.P(parcel, 5, 4);
        parcel.writeInt(this.j ? 1 : 0);
        s90.J(parcel, iW);
    }
}
