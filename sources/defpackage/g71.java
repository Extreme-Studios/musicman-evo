package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class g71 extends jt0 {
    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        vc3.C.h.d("FlagsAccessedBeforeInitialized", new w31("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
