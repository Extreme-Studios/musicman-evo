package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class oz0 extends jt0 implements a01 {
    public final Drawable f;
    public final Uri g;
    public final double h;
    public final int i;
    public final int j;
    public final Map k;

    public oz0(Drawable drawable, Uri uri, double d, int i, int i2, HashMap map) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f = drawable;
        this.g = uri;
        this.h = d;
        this.i = i;
        this.j = i2;
        this.k = map;
    }

    public static a01 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof a01 ? (a01) iInterfaceQueryLocalInterface : new zz0(iBinder);
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                rm rmVarC = c();
                parcel2.writeNoException();
                kt0.e(parcel2, rmVarC);
                return true;
            case 2:
                parcel2.writeNoException();
                kt0.d(parcel2, this.g);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(this.h);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(this.i);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(this.j);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(this.k);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.a01
    public final int b() {
        return this.i;
    }

    @Override // defpackage.a01
    public final rm c() {
        return new ju(this.f);
    }

    @Override // defpackage.a01
    public final int d() {
        return this.j;
    }

    @Override // defpackage.a01
    public final Map e() {
        return this.k;
    }

    @Override // defpackage.a01
    public final Uri h() {
        return this.g;
    }

    @Override // defpackage.a01
    public final double l() {
        return this.h;
    }
}
