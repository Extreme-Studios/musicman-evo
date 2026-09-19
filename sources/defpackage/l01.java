package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class l01 extends jt0 implements b11 {
    public l01() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                y();
                break;
            case 2:
                int i2 = parcel.readInt();
                kt0.f(parcel);
                H(i2);
                break;
            case 3:
                break;
            case 4:
                d();
                break;
            case 5:
                e();
                break;
            case 6:
                f();
                break;
            case 7:
                g();
                break;
            case 8:
                fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
                kt0.f(parcel);
                W(fu1Var);
                break;
            case 9:
                j();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
