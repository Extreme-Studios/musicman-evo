package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class jq1 extends jt0 implements c31 {
    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            kt0.f(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.c31
    public final void b() {
    }

    @Override // defpackage.c31
    public final void t(int i) {
    }
}
