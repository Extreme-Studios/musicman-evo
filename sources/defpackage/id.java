package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class id extends Binder implements mm {
    public final Handler f;
    public final /* synthetic */ dd g;

    public id(dd ddVar) {
        this.g = ddVar;
        attachInterface(this, mm.a);
        this.f = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = mm.a;
        int i3 = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        boolean z = false;
        Handler handler = this.f;
        dd ddVar = this.g;
        switch (i) {
            case 2:
                int i4 = parcel.readInt();
                Bundle bundle = (Bundle) hn.b(parcel, Bundle.CREATOR);
                if (ddVar != null) {
                    handler.post(new e6((Object) this, i4, (Parcelable) bundle, i3));
                    return true;
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) hn.b(parcel, Bundle.CREATOR);
                if (ddVar != null) {
                    handler.post(new fd(this, string, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) hn.b(parcel, Bundle.CREATOR);
                if (ddVar != null) {
                    handler.post(new in2(this, bundle3, 7, z));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) hn.b(parcel, Bundle.CREATOR);
                if (ddVar != null) {
                    handler.post(new fd(this, string2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i5 = parcel.readInt();
                Uri uri = (Uri) hn.b(parcel, Uri.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) hn.b(parcel, Bundle.CREATOR);
                if (ddVar != null) {
                    handler.post(new gd(this, i5, uri, z2, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle bundleB = ddVar == null ? null : ddVar.b(parcel.readString(), (Bundle) hn.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (bundleB == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleB.writeToParcel(parcel2, 1);
                return true;
            case 8:
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                Bundle bundle6 = (Bundle) hn.b(parcel, Bundle.CREATOR);
                if (ddVar != null) {
                    handler.post(new hd(this, i6, i7, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) hn.b(parcel, Bundle.CREATOR);
                if (ddVar != null) {
                    handler.post(new ed(this, bundle7, 1));
                    return true;
                }
                return true;
            case 10:
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                Bundle bundle8 = (Bundle) hn.b(parcel, Bundle.CREATOR);
                if (ddVar != null) {
                    handler.post(new ed(this, i8, i9, i10, i11, i12, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) hn.b(parcel, Bundle.CREATOR);
                if (ddVar != null) {
                    handler.post(new ed(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) hn.b(parcel, Bundle.CREATOR);
                if (ddVar != null) {
                    handler.post(new ed(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
