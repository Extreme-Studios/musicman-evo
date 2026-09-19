package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ws0 extends jt0 implements zy0 {
    public final ib0 f;

    public ws0(ib0 ib0Var) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f = ib0Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        y();
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.zy0
    public final void y() {
        this.f.B();
    }
}
