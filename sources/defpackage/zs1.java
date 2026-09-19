package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class zs1 implements qs1 {
    public final long a;
    public final kc2 b;
    public final u42 c;

    public zs1(long j, Context context, kc2 kc2Var, if1 if1Var, String str) {
        this.a = j;
        this.b = kc2Var;
        this.c = (u42) ((q63) new un1(if1Var.b, context, str).h).c();
    }

    @Override // defpackage.qs1
    public final void a(f93 f93Var) {
        try {
            this.c.r2(f93Var, new xs1(this));
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qs1
    public final void c() {
        try {
            u42 u42Var = this.c;
            u42Var.e1(new ys1(this));
            u42Var.x2(new ju(null));
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qs1
    public final void h() {
    }
}
