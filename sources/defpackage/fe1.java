package defpackage;

import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fe1 extends yu1 {
    public final md1 f;
    public final boolean h;
    public final boolean i;
    public int j;
    public ov1 k;
    public boolean l;
    public float n;
    public float o;
    public float p;
    public boolean q;
    public boolean r;
    public u01 s;
    public final Object g = new Object();
    public boolean m = true;

    public fe1(md1 md1Var, float f, boolean z, boolean z2) {
        this.f = md1Var;
        this.n = f;
        this.h = z;
        this.i = z2;
    }

    public final void C3(ee2 ee2Var) {
        Object obj = this.g;
        boolean z = ee2Var.g;
        boolean z2 = ee2Var.h;
        synchronized (obj) {
            this.q = z;
            this.r = z2;
        }
        boolean z3 = ee2Var.f;
        String str = true != z ? "0" : "1";
        String str2 = true != z2 ? "0" : "1";
        String str3 = true != z3 ? "0" : "1";
        m7 m7Var = new m7(3);
        m7Var.put("muteStart", str3);
        m7Var.put("customControlsRequested", str);
        m7Var.put("clickToExpandRequested", str2);
        E3("initialState", Collections.unmodifiableMap(m7Var));
    }

    public final void D3(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.g) {
            try {
                z2 = true;
                if (f2 == this.n && f3 == this.p) {
                    z2 = false;
                }
                this.n = f2;
                if (!((Boolean) tu0.e.c.a(lx0.Cd)).booleanValue()) {
                    this.o = f;
                }
                z3 = this.m;
                this.m = z;
                i2 = this.j;
                this.j = i;
                float f4 = this.p;
                this.p = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.f.p0().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            try {
                u01 u01Var = this.s;
                if (u01Var != null) {
                    u01Var.K0(u01Var.U(), 2);
                }
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            }
        }
        za1.f.execute(new ee1(this, i2, i, z3, z));
    }

    public final void E3(String str, Map map) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        za1.f.execute(new hb1(this, map2, 4, false));
    }

    @Override // defpackage.hv1
    public final void b() {
        E3("play", null);
    }

    @Override // defpackage.hv1
    public final void b1(ov1 ov1Var) {
        synchronized (this.g) {
            this.k = ov1Var;
        }
    }

    @Override // defpackage.hv1
    public final void d() {
        E3("pause", null);
    }

    @Override // defpackage.hv1
    public final boolean f() {
        boolean z;
        synchronized (this.g) {
            z = this.m;
        }
        return z;
    }

    @Override // defpackage.hv1
    public final float g() {
        float f;
        synchronized (this.g) {
            f = this.n;
        }
        return f;
    }

    @Override // defpackage.hv1
    public final int j() {
        int i;
        synchronized (this.g) {
            i = this.j;
        }
        return i;
    }

    @Override // defpackage.hv1
    public final float k() {
        float f;
        synchronized (this.g) {
            f = this.o;
        }
        return f;
    }

    @Override // defpackage.hv1
    public final float m() {
        float f;
        synchronized (this.g) {
            f = this.p;
        }
        return f;
    }

    @Override // defpackage.hv1
    public final boolean o() {
        boolean z;
        synchronized (this.g) {
            try {
                z = false;
                if (this.h && this.q) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.hv1
    public final void o0(boolean z) {
        E3(true != z ? "unmute" : "mute", null);
    }

    @Override // defpackage.hv1
    public final ov1 p() {
        ov1 ov1Var;
        synchronized (this.g) {
            ov1Var = this.k;
        }
        return ov1Var;
    }

    @Override // defpackage.hv1
    public final boolean q() {
        boolean z;
        Object obj = this.g;
        boolean zO = o();
        synchronized (obj) {
            z = false;
            if (!zO) {
                try {
                    if (this.r && this.i) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    @Override // defpackage.hv1
    public final void x() {
        E3("stop", null);
    }
}
