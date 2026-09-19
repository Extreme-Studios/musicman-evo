package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class u81 {
    public final l81 a;
    public final Context b;
    public final b91 c;
    public final long d;

    public u81(Context context, String str) {
        es0 es0Var = ut0.f.b;
        j41 j41Var = new j41();
        es0Var.getClass();
        l81 l81Var = (l81) new nb0(es0Var, context, str, j41Var).d(context, false);
        this.d = System.currentTimeMillis();
        new AtomicLong();
        this.b = context.getApplicationContext();
        new AtomicReference(str);
        this.a = l81Var;
        this.c = new b91();
    }

    public static void a(Context context, String str, q2 q2Var, vt1 vt1Var) {
        dq.g(context, "Context cannot be null.");
        dq.g(str, "AdUnitId cannot be null.");
        dq.d("#008 Must be called on the main UI thread.");
        lx0.a(context);
        if (((Boolean) py0.k.u()).booleanValue()) {
            if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                xs0.b.execute(new e9(context, str, q2Var, vt1Var, 6));
                return;
            }
        }
        jn.F("Loading on UI thread");
        new u81(context, str).b(q2Var.a, vt1Var);
    }

    public final void b(xx1 xx1Var, vt1 vt1Var) {
        try {
            l81 l81Var = this.a;
            if (l81Var != null) {
                xx1Var.m = this.d;
                l81Var.r2(gm.j(this.b, xx1Var), new y81(vt1Var, this, 0));
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }
}
