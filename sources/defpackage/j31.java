package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class j31 extends jt0 implements s31 {
    public j31() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            f93 f93Var = (f93) kt0.b(parcel, f93.CREATOR);
            kt0.f(parcel);
            Z(f93Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String strD = d();
            parcel2.writeNoException();
            parcel2.writeString(strD);
            return true;
        }
        if (i == 3) {
            boolean zE = e();
            parcel2.writeNoException();
            ClassLoader classLoader = kt0.a;
            parcel2.writeInt(zE ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String strF = f();
            parcel2.writeNoException();
            parcel2.writeString(strF);
            return true;
        }
        if (i != 5) {
            return false;
        }
        f93 f93Var2 = (f93) kt0.b(parcel, f93.CREATOR);
        int i2 = parcel.readInt();
        kt0.f(parcel);
        Q2(f93Var2, i2);
        parcel2.writeNoException();
        return true;
    }
}
