package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class ab0 extends f0 {
    public static final Parcelable.Creator<ab0> CREATOR = new a2(25);
    public final int f;
    public final Account g;
    public final int h;
    public final GoogleSignInAccount i;

    public ab0(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f = i;
        this.g = account;
        this.h = i2;
        this.i = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.p(parcel, 2, this.g, i);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.h);
        s90.p(parcel, 4, this.i, i);
        s90.J(parcel, iW);
    }
}
