package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class yy1 {
    public final j41 a;
    public final gm b;
    public final h60 c;
    public final tt1 d;
    public ib0 e;
    public i2 f;
    public s2[] g;
    public v6 h;
    public n71 i;
    public j60 j;
    public String k;
    public final w7 l;
    public boolean m;
    public final AtomicLong n;

    public yy1(w7 w7Var, AttributeSet attributeSet, int i) {
        kb3 kb3Var;
        gm gmVar = gm.o;
        this.a = new j41();
        this.c = new h60();
        this.d = new tt1(this);
        this.n = new AtomicLong();
        this.l = w7Var;
        this.b = gmVar;
        this.i = null;
        new AtomicBoolean(false);
        if (attributeSet != null) {
            Context context = w7Var.getContext();
            try {
                vg2 vg2Var = new vg2(context, attributeSet);
                s2[] s2VarArr = (s2[]) vg2Var.g;
                if (s2VarArr.length != 1) {
                    throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
                }
                this.g = s2VarArr;
                this.k = (String) vg2Var.h;
                if (w7Var.isInEditMode()) {
                    f32 f32Var = ut0.f.a;
                    s2 s2Var = this.g[0];
                    if (s2Var.equals(s2.p)) {
                        kb3Var = new kb3("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        kb3Var = new kb3(context, s2Var);
                        kb3Var.o = false;
                    }
                    f32Var.getClass();
                    f32.h(w7Var, kb3Var, "Ads by Google", -16777216, -1);
                }
            } catch (IllegalArgumentException e) {
                f32 f32Var2 = ut0.f.a;
                kb3 kb3Var2 = new kb3(context, s2.h);
                String message = e.getMessage();
                String message2 = e.getMessage();
                f32Var2.getClass();
                if (message2 != null) {
                    jn.T(message2);
                }
                f32.h(w7Var, kb3Var2, message, -65536, -16777216);
            }
        }
    }

    public static kb3 a(Context context, s2[] s2VarArr) {
        for (s2 s2Var : s2VarArr) {
            if (s2Var.equals(s2.p)) {
                return new kb3("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        kb3 kb3Var = new kb3(context, s2VarArr);
        kb3Var.o = false;
        return kb3Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d3 A[Catch: RemoteException -> 0x00d1, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d1, blocks: (B:28:0x009e, B:30:0x00a4, B:32:0x00b2, B:34:0x00c4, B:37:0x00d3), top: B:54:0x009e, outer: #1 }] */
    public final void b(xx1 xx1Var) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            n71 n71Var = this.i;
            w7 w7Var = this.l;
            if (n71Var == null) {
                if (this.g == null || this.k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = w7Var.getContext();
                kb3 kb3VarA = a(context, this.g);
                boolean z = false;
                n71 n71Var2 = "search_v2".equals(kb3VarA.f) ? (n71) new vk0(ut0.f.b, context, kb3VarA, this.k).d(context, false) : (n71) new fj0(ut0.f.b, context, kb3VarA, this.k, this.a).d(context, false);
                this.i = n71Var2;
                n71Var2.X2(new zd2(this.d));
                ib0 ib0Var = this.e;
                if (ib0Var != null) {
                    this.i.I2(new ws0(ib0Var));
                }
                v6 v6Var = this.h;
                if (v6Var != null) {
                    this.i.J0(new vt0(v6Var));
                }
                j60 j60Var = this.j;
                if (j60Var != null) {
                    this.i.K2(new ee2(j60Var));
                }
                this.i.a2(new ka2());
                this.i.i1(this.m);
                n71 n71Var3 = this.i;
                if (n71Var3 != null) {
                    try {
                        rm rmVarC = n71Var3.c();
                        if (rmVarC != null) {
                            if (((Boolean) py0.f.u()).booleanValue()) {
                                if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                                    f32.b.post(new hb1(this, rmVarC, 25, z));
                                } else {
                                    w7Var.addView((View) ju.Z0(rmVarC));
                                }
                            } else {
                                w7Var.addView((View) ju.Z0(rmVarC));
                            }
                        }
                    } catch (RemoteException e) {
                        jn.Z("#007 Could not call remote method.", e);
                    }
                }
            }
            xx1Var.m = jCurrentTimeMillis;
            n71 n71Var4 = this.i;
            if (n71Var4 == null) {
                throw null;
            }
            AtomicLong atomicLong = this.n;
            if (atomicLong.get() != 0) {
                n71Var4.t1(atomicLong.get());
            }
            gm gmVar = this.b;
            Context context2 = w7Var.getContext();
            gmVar.getClass();
            n71Var4.Z(gm.j(context2, xx1Var));
        } catch (RemoteException e2) {
            jn.Z("#007 Could not call remote method.", e2);
        }
    }

    public final void c(ib0 ib0Var) {
        try {
            this.e = ib0Var;
            n71 n71Var = this.i;
            if (n71Var != null) {
                n71Var.I2(ib0Var != null ? new ws0(ib0Var) : null);
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public final void d(s2... s2VarArr) {
        w7 w7Var = this.l;
        this.g = s2VarArr;
        try {
            n71 n71Var = this.i;
            if (n71Var != null) {
                n71Var.P0(a(w7Var.getContext(), this.g));
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
        w7Var.requestLayout();
    }

    public final void e(v6 v6Var) {
        try {
            this.h = v6Var;
            n71 n71Var = this.i;
            if (n71Var != null) {
                n71Var.J0(v6Var != null ? new vt0(v6Var) : null);
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }
}
