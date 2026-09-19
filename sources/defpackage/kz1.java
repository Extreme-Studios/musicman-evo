package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class kz1 extends j31 {
    public final p83 f;

    public kz1(Context context, if1 if1Var, h52 h52Var, wo1 wo1Var, b11 b11Var) {
        r52 r52Var = new r52(wo1Var, (es1) if1Var.j.c());
        ((nz1) r52Var.h).f.set(b11Var);
        es0 es0Var = new es0();
        es0Var.g = if1Var;
        es0Var.h = context;
        es0Var.i = r52Var;
        es0Var.f = h52Var;
        es0Var.j = if1Var.c();
        h52Var.r = (nz1) r52Var.h;
        this.f = new p83(es0Var, 20, h52Var.c);
    }

    @Override // defpackage.s31
    public final synchronized void Q2(f93 f93Var, int i) {
        this.f.u(f93Var, i);
    }

    @Override // defpackage.s31
    public final void Z(f93 f93Var) {
        this.f.u(f93Var, 1);
    }

    @Override // defpackage.s31
    public final synchronized String d() {
        String str;
        p83 p83Var = this.f;
        synchronized (p83Var) {
            str = null;
            try {
                zj1 zj1Var = (zj1) p83Var.i;
                str = zj1Var != null ? zj1Var.f : null;
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            }
        }
        return str;
    }

    @Override // defpackage.s31
    public final synchronized boolean e() {
        boolean z;
        p83 p83Var = this.f;
        synchronized (p83Var) {
            try {
                si1 si1Var = (si1) ((es0) p83Var.g).k;
                z = si1Var != null && si1Var.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.s31
    public final synchronized String f() {
        String str;
        p83 p83Var = this.f;
        synchronized (p83Var) {
            str = null;
            try {
                zj1 zj1Var = (zj1) p83Var.i;
                str = zj1Var != null ? zj1Var.f : null;
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            }
        }
        return str;
    }
}
