package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class u42 extends k81 {
    public final s42 g;
    public final p42 h;
    public final String i;
    public final f52 j;
    public final Context k;
    public final d60 l;
    public final zq0 m;
    public final es1 n;
    public cr1 o;
    public boolean p = ((Boolean) tu0.e.c.a(lx0.M0)).booleanValue();

    public u42(String str, s42 s42Var, Context context, p42 p42Var, f52 f52Var, d60 d60Var, zq0 zq0Var, es1 es1Var) {
        this.i = str;
        this.g = s42Var;
        this.h = p42Var;
        this.j = f52Var;
        this.k = context;
        this.l = d60Var;
        this.m = zq0Var;
        this.n = es1Var;
    }

    @Override // defpackage.l81
    public final void B2(t81 t81Var) {
        dq.d("#008 Must be called on the main UI thread.");
        this.h.k.set(t81Var);
    }

    public final synchronized void B3(f93 f93Var, s81 s81Var, int i) {
        try {
            if (!f93Var.b()) {
                boolean z = false;
                if (((Boolean) py0.k.u()).booleanValue()) {
                    if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                        z = true;
                    }
                }
                if (this.l.h < ((Integer) tu0.e.c.a(lx0.Xb)).intValue() || !z) {
                    dq.d("#008 Must be called on the main UI thread.");
                }
            }
            p42 p42Var = this.h;
            p42Var.h.set(s81Var);
            zb3 zb3Var = vc3.C.c;
            if (zb3.h(this.k) && f93Var.x == null) {
                jn.M("Failed to load the ad because app ID is missing.");
                p42Var.Z(a23.E(4, null, null));
                return;
            }
            if (this.o != null) {
                return;
            }
            q42 q42Var = new q42(20);
            s42 s42Var = this.g;
            s42Var.h.o.g = i;
            s42Var.a(f93Var, this.i, q42Var, new kc2(29, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.l81
    public final synchronized void C2(z81 z81Var) {
        dq.d("#008 Must be called on the main UI thread.");
        f52 f52Var = this.j;
        f52Var.a = z81Var.f;
        f52Var.b = z81Var.g;
    }

    @Override // defpackage.l81
    public final synchronized void D1(rm rmVar, boolean z) {
        dq.d("#008 Must be called on the main UI thread.");
        if (this.o == null) {
            jn.T("Rewarded can not be shown before loaded");
            this.h.s(a23.E(9, null, null));
            return;
        }
        if (((Boolean) tu0.e.c.a(lx0.b3)).booleanValue()) {
            this.m.b.c(new Throwable().getStackTrace());
        }
        this.o.c((Activity) ju.Z0(rmVar), z);
    }

    @Override // defpackage.l81
    public final synchronized void L1(f93 f93Var, s81 s81Var) {
        B3(f93Var, s81Var, 3);
    }

    @Override // defpackage.l81
    public final Bundle e() {
        Bundle bundle;
        dq.d("#008 Must be called on the main UI thread.");
        cr1 cr1Var = this.o;
        if (cr1Var == null) {
            return new Bundle();
        }
        bl1 bl1Var = cr1Var.q;
        synchronized (bl1Var) {
            bundle = new Bundle(bl1Var.h);
        }
        return bundle;
    }

    @Override // defpackage.l81
    public final void e1(o81 o81Var) {
        dq.d("#008 Must be called on the main UI thread.");
        this.h.i.set(o81Var);
    }

    @Override // defpackage.l81
    public final void e2(sp1 sp1Var) {
        p42 p42Var = this.h;
        if (sp1Var == null) {
            p42Var.g.set(null);
        } else {
            p42Var.g.set(new t42(this, sp1Var, 0));
        }
    }

    @Override // defpackage.l81
    public final void f1(sr1 sr1Var) {
        dq.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!sr1Var.d()) {
                this.n.b();
            }
        } catch (RemoteException e) {
            jn.H("Error in making CSI ping for reporting paid event callback", e);
        }
        this.h.m.set(sr1Var);
    }

    @Override // defpackage.l81
    public final synchronized String g() {
        cr1 cr1Var = this.o;
        if (cr1Var == null) {
            return null;
        }
        return cr1Var.f.f;
    }

    @Override // defpackage.l81
    public final i81 i() {
        dq.d("#008 Must be called on the main UI thread.");
        cr1 cr1Var = this.o;
        if (cr1Var != null) {
            return cr1Var.s;
        }
        return null;
    }

    @Override // defpackage.l81
    public final boolean j() {
        dq.d("#008 Must be called on the main UI thread.");
        cr1 cr1Var = this.o;
        return (cr1Var == null || cr1Var.w) ? false : true;
    }

    @Override // defpackage.l81
    public final synchronized void j1(long j) {
        oj1 oj1Var;
        cr1 cr1Var = this.o;
        if (cr1Var == null || (oj1Var = cr1Var.j) == null) {
            return;
        }
        oj1Var.a(j);
    }

    @Override // defpackage.l81
    public final lu1 m() {
        cr1 cr1Var;
        if (((Boolean) tu0.e.c.a(lx0.d7)).booleanValue() && (cr1Var = this.o) != null) {
            return cr1Var.f;
        }
        return null;
    }

    @Override // defpackage.l81
    public final synchronized long n() {
        oj1 oj1Var;
        cr1 cr1Var = this.o;
        if (cr1Var == null || (oj1Var = cr1Var.j) == null) {
            return 0L;
        }
        return oj1Var.a.get();
    }

    @Override // defpackage.l81
    public final String o() {
        return this.i;
    }

    @Override // defpackage.l81
    public final synchronized void r2(f93 f93Var, s81 s81Var) {
        B3(f93Var, s81Var, 2);
    }

    @Override // defpackage.l81
    public final synchronized void u3(boolean z) {
        dq.d("setImmersiveMode must be called on the main UI thread.");
        this.p = z;
    }

    @Override // defpackage.l81
    public final synchronized void x2(rm rmVar) {
        D1(rmVar, this.p);
    }
}
