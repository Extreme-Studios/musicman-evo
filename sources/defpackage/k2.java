package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class k2 {
    public final Context a;
    public final s31 b;

    public k2(Context context, s31 s31Var) {
        this.a = context;
        this.b = s31Var;
    }

    public final void a(q2 q2Var) {
        xx1 xx1Var = q2Var.a;
        Context context = this.a;
        lx0.a(context);
        if (((Boolean) py0.c.u()).booleanValue()) {
            if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                xs0.b.execute(new in2(this, 13, xx1Var));
                return;
            }
        }
        try {
            this.b.Z(gm.j(context, xx1Var));
        } catch (RemoteException e) {
            jn.P("Failed to load ad.", e);
        }
    }
}
