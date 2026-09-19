package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class sk1 extends wl {
    @Override // defpackage.a8, defpackage.t3
    public final int d() {
        return 212800000;
    }

    @Override // defpackage.a8
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof ce2 ? (ce2) iInterfaceQueryLocalInterface : new ce2(iBinder);
    }

    @Override // defpackage.a8
    public final ei[] q() {
        return ar.l;
    }

    @Override // defpackage.a8
    public final String u() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // defpackage.a8
    public final String v() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // defpackage.a8
    public final boolean w() {
        return true;
    }
}
