package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class e31 extends in {
    public final Context a;
    public final gm b;
    public final n71 c;
    public final long d;

    public e31(Context context, String str) {
        j41 j41Var = new j41();
        this.d = System.currentTimeMillis();
        new AtomicLong();
        this.a = context;
        new AtomicReference(str);
        this.b = gm.o;
        es0 es0Var = ut0.f.b;
        kb3 kb3Var = new kb3();
        es0Var.getClass();
        this.c = (n71) new jl0(es0Var, context, kb3Var, str, j41Var).d(context, false);
    }

    @Override // defpackage.in
    public final void b(Activity activity) {
        if (activity == null) {
            jn.T("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            n71 n71Var = this.c;
            if (n71Var != null) {
                n71Var.k3(new ju(activity));
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public final void c(xx1 xx1Var, i8 i8Var) {
        try {
            n71 n71Var = this.c;
            if (n71Var != null) {
                xx1Var.m = this.d;
                gm gmVar = this.b;
                Context context = this.a;
                gmVar.getClass();
                n71Var.c1(gm.j(context, xx1Var), new yp2(i8Var, this));
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
            i8Var.n(new np(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
