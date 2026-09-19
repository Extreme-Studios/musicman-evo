package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class uc0 extends p61 implements yt0 {
    public final AdOverlayInfoParcel g;
    public final Activity h;
    public final boolean l;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean m = false;
    public boolean n = false;

    public uc0(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        r91 r91Var;
        boolean z = false;
        this.g = adOverlayInfoParcel;
        this.h = activity;
        ix0 ix0Var = lx0.g5;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if ((((Boolean) kx0Var.a(ix0Var)).booleanValue() || ((Boolean) kx0Var2.a(lx0.h5)).booleanValue() || ((Boolean) kx0Var2.a(lx0.l5)).booleanValue()) && (r91Var = adOverlayInfoParcel.f) != null && r91Var.o && Build.MANUFACTURER.matches((String) kx0Var2.a(lx0.j5)) && Build.MODEL.matches((String) kx0Var2.a(lx0.k5))) {
            z = true;
        }
        this.l = z;
    }

    public final synchronized void B3() {
        try {
            if (!this.j) {
                lb3 lb3Var = this.g.h;
                if (lb3Var != null) {
                    lb3Var.H1(4);
                }
                this.j = true;
                if (this.l) {
                    if (((Boolean) tu0.e.c.a(lx0.l5)).booleanValue()) {
                        vc3.C.g.h(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.q61
    public final void S() {
        if (this.h.isFinishing()) {
            B3();
        }
    }

    @Override // defpackage.yt0
    public final void T(boolean z) {
        if (!z) {
            this.n = true;
        } else if (this.n) {
            jn.F("Foregrounded: finishing activity from LauncherOverlay");
            this.h.finish();
        }
    }

    @Override // defpackage.q61
    public final void Y2(Bundle bundle) {
        lb3 lb3Var;
        ix0 ix0Var = lx0.G9;
        tu0 tu0Var = tu0.e;
        boolean zBooleanValue = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue();
        Activity activity = this.h;
        if (zBooleanValue && !this.k) {
            activity.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.g;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            ib0 ib0Var = adOverlayInfoParcel.g;
            if (ib0Var != null) {
                ib0Var.B();
            }
            zm1 zm1Var = adOverlayInfoParcel.z;
            if (zm1Var != null) {
                zm1Var.q0();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (lb3Var = adOverlayInfoParcel.h) != null) {
                lb3Var.f();
            }
        }
        if (this.l) {
            if (((Boolean) tu0Var.c.a(lx0.l5)).booleanValue()) {
                vc3.C.g.f(this);
            }
        }
        r91 r91Var = adOverlayInfoParcel.f;
        md0 md0Var = adOverlayInfoParcel.n;
        ig igVar = vc3.C.a;
        lb0 lb0Var = r91Var.n;
        Activity activity2 = this.h;
        if (ig.h(activity2, r91Var, md0Var, lb0Var, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // defpackage.q61
    public final void c0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.i);
    }

    @Override // defpackage.q61
    public final void d() {
        lb3 lb3Var = this.g.h;
        if (lb3Var != null) {
            lb3Var.S2();
        }
    }

    @Override // defpackage.q61
    public final boolean e() {
        return ((Boolean) tu0.e.c.a(lx0.h5)).booleanValue() && this.l && this.m;
    }

    @Override // defpackage.q61
    public final void i() {
        this.m = false;
        lb3 lb3Var = this.g.h;
        if (lb3Var != null) {
            lb3Var.Y();
        }
        if (this.h.isFinishing()) {
            B3();
        }
    }

    @Override // defpackage.q61
    public final void k() {
        if (this.i) {
            jn.p("LauncherOverlay finishing activity");
            this.h.finish();
            return;
        }
        this.i = true;
        this.m = true;
        lb3 lb3Var = this.g.h;
        if (lb3Var != null) {
            lb3Var.C1();
        }
        if (this.l) {
            ix0 ix0Var = lx0.g5;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                zb3.l.postDelayed(new q7(17, this), ((Integer) tu0Var.c.a(lx0.i5)).intValue());
            }
        }
    }

    @Override // defpackage.q61
    public final void u() {
        this.k = true;
    }

    @Override // defpackage.q61
    public final void x() {
        if (this.h.isFinishing()) {
            B3();
        }
    }

    @Override // defpackage.q61
    public final void b() {
    }

    @Override // defpackage.q61
    public final void g() {
    }

    @Override // defpackage.q61
    public final void j() {
    }

    @Override // defpackage.q61
    public final void C(rm rmVar) {
    }

    @Override // defpackage.q61
    public final void P1(int i, String[] strArr, int[] iArr) {
    }

    @Override // defpackage.q61
    public final void W1(int i, int i2, Intent intent) {
    }
}
