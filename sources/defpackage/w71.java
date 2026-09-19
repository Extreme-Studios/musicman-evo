package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class w71 extends jt0 {
    public final String f;
    public final int g;

    public w71(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f = str;
        this.g = i;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.g);
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w71)) {
            return false;
        }
        w71 w71Var = (w71) obj;
        if (s90.d(this.f, w71Var.f)) {
            if (s90.d(Integer.valueOf(this.g), Integer.valueOf(w71Var.g))) {
                return true;
            }
        }
        return false;
    }
}
