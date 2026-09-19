package defpackage;

import android.os.Parcel;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class tx0 extends jt0 {
    public final yd2 f;
    public final String g;
    public final String h;

    public tx0(yd2 yd2Var, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f = yd2Var;
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.g);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.h);
            return true;
        }
        yd2 yd2Var = this.f;
        if (i == 3) {
            rm rmVarO0 = ju.O0(parcel.readStrongBinder());
            kt0.f(parcel);
            if (rmVarO0 != null) {
                yd2Var.k((View) ju.Z0(rmVarO0));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            yd2Var.c();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        yd2Var.h();
        parcel2.writeNoException();
        return true;
    }
}
