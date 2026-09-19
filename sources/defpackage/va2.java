package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class va2 extends p91 {
    public final int y;

    public va2(Context context, Looper looper, x7 x7Var, y7 y7Var, int i) {
        super(context, looper, 116, x7Var, y7Var);
        this.y = i;
    }

    @Override // defpackage.a8, defpackage.t3
    public final int d() {
        return this.y;
    }

    @Override // defpackage.a8
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof ya2 ? (ya2) iInterfaceQueryLocalInterface : new ya2(iBinder, "com.google.android.gms.gass.internal.IGassService", 2);
    }

    @Override // defpackage.a8
    public final String u() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // defpackage.a8
    public final String v() {
        return "com.google.android.gms.gass.START";
    }
}
