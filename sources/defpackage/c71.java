package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c71 extends f0 {
    public static final Parcelable.Creator<c71> CREATOR = new os0(14);
    public final View f;
    public final Map g;

    public c71(IBinder iBinder, IBinder iBinder2) {
        this.f = (View) ju.Z0(ju.O0(iBinder));
        this.g = (Map) ju.Z0(ju.O0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.o(parcel, 1, new ju(this.f));
        s90.o(parcel, 2, new ju(this.g));
        s90.J(parcel, iW);
    }
}
