package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class hu0 {
    public final ku0 a;
    public final iu0 b = new iu0("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    public hu0(ku0 ku0Var, String str) {
        new AtomicLong();
        this.a = ku0Var;
        new AtomicReference(str);
    }

    public static void a(Context context, String str, q2 q2Var, y6 y6Var) {
        dq.g(context, "Context cannot be null.");
        dq.g(str, "adUnitId cannot be null.");
        dq.d("#008 Must be called on the main UI thread.");
        lx0.a(context);
        if (((Boolean) py0.d.u()).booleanValue()) {
            if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                xs0.b.execute(new e9(context, str, q2Var, y6Var, 3));
                return;
            }
        }
        new m40(context, str, q2Var.a, y6Var).a();
    }

    public final void b(Activity activity) {
        try {
            this.a.I1(new ju(activity), this.b);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }
}
