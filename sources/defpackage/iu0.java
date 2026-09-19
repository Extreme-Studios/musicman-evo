package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class iu0 extends jt0 implements pu0 {
    public zs f;

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            r();
        } else if (i == 2) {
            l();
        } else if (i == 3) {
            fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
            kt0.f(parcel);
            g0(fu1Var);
        } else if (i != 4 && i != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.pu0
    public final void g0(fu1 fu1Var) {
        zs zsVar = this.f;
        if (zsVar != null) {
            fu1Var.a();
            g92 g92Var = (g92) zsVar.s;
            g92Var.c = null;
            g92Var.b = false;
            g92Var.a();
        }
    }

    @Override // defpackage.pu0
    public final void l() {
        zs zsVar = this.f;
        if (zsVar != null) {
            zsVar.H();
        }
    }

    @Override // defpackage.pu0
    public final void r() {
        zs zsVar = this.f;
        if (zsVar != null) {
            zsVar.I();
        }
    }

    @Override // defpackage.pu0
    public final void d() {
    }

    @Override // defpackage.pu0
    public final void e() {
    }
}
