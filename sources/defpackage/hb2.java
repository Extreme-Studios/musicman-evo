package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class hb2 {
    public final jb2 a;
    public final boolean b = true;

    public hb2(jb2 jb2Var) {
        this.a = jb2Var;
    }

    public static hb2 a(Context context, String str) {
        jb2 ib2Var;
        try {
            try {
                try {
                    IBinder iBinderB = fg.c(context, fg.b).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        ib2Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        ib2Var = iInterfaceQueryLocalInterface instanceof jb2 ? (jb2) iInterfaceQueryLocalInterface : new ib2(iBinderB, "com.google.android.gms.gass.internal.clearcut.IGassClearcut", 2);
                    }
                    ib2Var.K1(new ju(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new hb2(ib2Var);
                } catch (Exception e) {
                    throw new ta2(e);
                }
            } catch (RemoteException | NullPointerException | SecurityException | ta2 unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new hb2(new kb2());
            }
        } catch (Exception e2) {
            throw new ta2(e2);
        }
    }
}
