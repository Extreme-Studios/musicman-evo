package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class v90 implements IInterface {
    public final /* synthetic */ int f;
    public final IBinder g;
    public final String h;

    public /* synthetic */ v90(IBinder iBinder, String str, int i) {
        this.f = i;
        this.g = iBinder;
        this.h = str;
    }

    public void K0(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.g.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void O0(Parcel parcel, int i) {
        try {
            this.g.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel T(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.g.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public Parcel U() {
        int i = this.f;
        String str = this.h;
        switch (i) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(str);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(str);
                return parcelObtain2;
        }
    }

    public Parcel Y(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.g.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.g;
    }
}
