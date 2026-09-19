package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sa0 extends ea0 {
    public final j30 b;
    public final k30 c;
    public final gm d;

    public sa0(int i, j30 j30Var, k30 k30Var, gm gmVar) {
        super(i);
        this.c = k30Var;
        this.b = j30Var;
        this.d = gmVar;
        if (i == 2 && j30Var.b) {
            j7.p("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.ea0
    public final boolean a(z90 z90Var) {
        return this.b.b;
    }

    @Override // defpackage.ea0
    public final ei[] b(z90 z90Var) {
        return this.b.a;
    }

    @Override // defpackage.ea0
    public final void c(Status status) {
        this.d.getClass();
        this.c.a(status.h != null ? new hx(status) : new v3(status));
    }

    @Override // defpackage.ea0
    public final void d(Exception exc) {
        this.c.a(exc);
    }

    @Override // defpackage.ea0
    public final void e(z90 z90Var) throws DeadObjectException {
        k30 k30Var = this.c;
        try {
            j30 j30Var = this.b;
            ((ww) ((j30) j30Var.d).d).accept(z90Var.g, k30Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(ea0.g(e2));
        } catch (RuntimeException e3) {
            k30Var.a(e3);
        }
    }

    @Override // defpackage.ea0
    public final void f(us2 us2Var, boolean z) {
        Map map = (Map) us2Var.h;
        Boolean boolValueOf = Boolean.valueOf(z);
        k30 k30Var = this.c;
        map.put(k30Var, boolValueOf);
        ve3 ve3Var = k30Var.a;
        vg2 vg2Var = new vg2((Object) us2Var, (Object) k30Var, 5, false);
        ve3Var.getClass();
        ve3Var.b.b(new tk1(m30.a, vg2Var));
        ve3Var.h();
    }
}
