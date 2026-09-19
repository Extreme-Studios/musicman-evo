package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ no1 g;

    public /* synthetic */ ko1(no1 no1Var, int i) {
        this.f = i;
        this.g = no1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        t01 t01Var = null;
        no1 no1Var = this.g;
        switch (i) {
            case 0:
                no1Var.n.K();
                ro1 ro1Var = no1Var.m;
                synchronized (ro1Var) {
                    try {
                        md1 md1Var = ro1Var.i;
                        if (md1Var != null) {
                            md1Var.destroy();
                            ro1Var.i = null;
                        }
                        md1 md1Var2 = ro1Var.j;
                        if (md1Var2 != null) {
                            md1Var2.destroy();
                            ro1Var.j = null;
                        }
                        md1 md1Var3 = ro1Var.k;
                        if (md1Var3 != null) {
                            md1Var3.destroy();
                            ro1Var.k = null;
                        }
                        hp hpVar = ro1Var.m;
                        if (hpVar != null) {
                            hpVar.cancel(false);
                            ro1Var.m = null;
                        }
                        cb1 cb1Var = ro1Var.n;
                        if (cb1Var != null) {
                            cb1Var.cancel(false);
                            ro1Var.n = null;
                        }
                        ro1Var.l = null;
                        ro1Var.v.clear();
                        ro1Var.w.clear();
                        ro1Var.b = null;
                        ro1Var.c = null;
                        ro1Var.d = null;
                        ro1Var.e = null;
                        ro1Var.h = null;
                        ro1Var.o = null;
                        ro1Var.p = null;
                        ro1Var.q = null;
                        ro1Var.s = null;
                        ro1Var.t = null;
                        ro1Var.u = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                wo1 wo1Var = no1Var.q;
                try {
                    ro1 ro1Var2 = no1Var.m;
                    int iQ = ro1Var2.q();
                    if (iQ == 1) {
                        p01 p01Var = wo1Var.a;
                        if (p01Var != null) {
                            no1Var.l();
                            nq1 nq1Var = (nq1) no1Var.r.c();
                            Parcel parcelU = p01Var.U();
                            kt0.e(parcelU, nq1Var);
                            p01Var.K0(parcelU, 1);
                            return;
                        }
                        return;
                    }
                    if (iQ == 2) {
                        o01 o01Var = wo1Var.b;
                        if (o01Var != null) {
                            no1Var.l();
                            lq1 lq1Var = (lq1) no1Var.s.c();
                            Parcel parcelU2 = o01Var.U();
                            kt0.e(parcelU2, lq1Var);
                            o01Var.K0(parcelU2, 1);
                            return;
                        }
                        return;
                    }
                    if (iQ == 3) {
                        String strG = ro1Var2.g();
                        if (strG != null) {
                            t01Var = (t01) wo1Var.f.get(strG);
                        }
                        if (t01Var != null) {
                            if (ro1Var2.h() != null) {
                                no1Var.e("Google", true);
                            }
                            t01Var.h3((n01) no1Var.v.c());
                            return;
                        }
                        return;
                    }
                    if (iQ == 6) {
                        x01 x01Var = wo1Var.c;
                        if (x01Var != null) {
                            no1Var.l();
                            x01Var.b2((d11) no1Var.t.c());
                            return;
                        }
                        return;
                    }
                    if (iQ != 7) {
                        jn.M("Wrong native template id!");
                        return;
                    }
                    d31 d31Var = wo1Var.e;
                    if (d31Var != null) {
                        kq1 kq1Var = (kq1) no1Var.u.c();
                        Parcel parcelU3 = d31Var.U();
                        kt0.e(parcelU3, kq1Var);
                        d31Var.K0(parcelU3, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e) {
                    jn.P("RemoteException when notifyAdLoad is called", e);
                    return;
                }
        }
    }
}
