package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class y61 extends jt0 implements fa1 {
    public final /* synthetic */ fw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(z61 z61Var, fw fwVar) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f = fwVar;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            kt0.f(parcel);
        } else if (i == 2) {
            String string = parcel.readString();
            kt0.f(parcel);
            w(string);
        } else {
            if (i != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) kt0.b(parcel, Bundle.CREATOR);
            kt0.f(parcel);
            t3(string2, bundle, string3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.fa1
    public final void t3(String str, Bundle bundle, String str2) {
        this.f.b(new s70(7, new kp2(str, 4)));
    }

    @Override // defpackage.fa1
    public final void w(String str) {
        this.f.a(str);
    }
}
