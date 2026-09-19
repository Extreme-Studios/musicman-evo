package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class vt0 extends jt0 implements ig1 {
    public static final /* synthetic */ int g = 0;
    public final v6 f;

    public vt0(v6 v6Var) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f = v6Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        kt0.f(parcel);
        n0(string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.ig1
    public final void n0(String str, String str2) {
        this.f.N(str, str2);
    }
}
