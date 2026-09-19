package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class w61 extends jt0 implements x61 {
    public static x61 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof x61 ? (x61) iInterfaceQueryLocalInterface : new v61(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback", 2);
    }
}
