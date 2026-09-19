package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class uu0 extends f0 {
    public static final Parcelable.Creator<uu0> CREATOR = new os0(5);
    public ParcelFileDescriptor f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final boolean j;

    public uu0(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.f = parcelFileDescriptor;
        this.g = z;
        this.h = z2;
        this.i = j;
        this.j = z3;
    }

    public final synchronized boolean a() {
        return this.f != null;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream b() {
        if (this.f == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f);
        this.f = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean c() {
        return this.h;
    }

    public final synchronized boolean d() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z;
        long j;
        int iW = s90.w(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f;
        }
        s90.p(parcel, 2, parcelFileDescriptor, i);
        synchronized (this) {
            z = this.g;
        }
        s90.P(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean zC = c();
        s90.P(parcel, 4, 4);
        parcel.writeInt(zC ? 1 : 0);
        synchronized (this) {
            j = this.i;
        }
        s90.P(parcel, 5, 8);
        parcel.writeLong(j);
        boolean zD = d();
        s90.P(parcel, 6, 4);
        parcel.writeInt(zD ? 1 : 0);
        s90.J(parcel, iW);
    }

    public uu0() {
        this(null, false, false, 0L, false);
    }
}
