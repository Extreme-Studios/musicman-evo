package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ih1 implements qt0, mk1, lb3, lk1 {
    public final ch1 f;
    public final dh1 g;
    public final g41 i;
    public final Executor j;
    public final ae k;
    public final HashSet h = new HashSet();
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final hh1 m = new hh1();
    public boolean n = false;
    public WeakReference o = new WeakReference(this);

    public ih1(d41 d41Var, dh1 dh1Var, Executor executor, ch1 ch1Var, ae aeVar) {
        this.f = ch1Var;
        Charset charset = z31.a;
        d41Var.a();
        this.i = new g41(0, d41Var.b);
        this.g = dh1Var;
        this.j = executor;
        this.k = aeVar;
    }

    @Override // defpackage.lk1
    public final synchronized void B0() {
        int i = 1;
        if (this.l.compareAndSet(false, true)) {
            ch1 ch1Var = this.f;
            d41 d41Var = ch1Var.b;
            bh1 bh1Var = ch1Var.e;
            d41Var.a();
            hp hpVar = d41Var.b;
            yy0 yy0Var = new yy0("/updateActiveView", i, bh1Var);
            ya1 ya1Var = za1.g;
            d41Var.b = na1.L(hpVar, yy0Var, ya1Var);
            bh1 bh1Var2 = ch1Var.f;
            d41Var.a();
            d41Var.b = na1.L(d41Var.b, new yy0("/untrackActiveViewUnit", i, bh1Var2), ya1Var);
            ch1Var.d = this;
            i();
        }
    }

    @Override // defpackage.lb3
    public final synchronized void C1() {
        this.m.b = false;
        i();
    }

    @Override // defpackage.qt0
    public final synchronized void Q0(pt0 pt0Var) {
        hh1 hh1Var = this.m;
        hh1Var.a = pt0Var.j;
        hh1Var.e = pt0Var;
        i();
    }

    @Override // defpackage.lb3
    public final synchronized void Y() {
        this.m.b = true;
        i();
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            ch1 ch1Var = this.f;
            if (!zHasNext) {
                d41 d41Var = ch1Var.b;
                bh1 bh1Var = ch1Var.e;
                hp hpVar = d41Var.b;
                int i = 1;
                hl0 hl0Var = new hl0(str2, i, bh1Var);
                ya1 ya1Var = za1.g;
                qm2 qm2VarM = na1.M(hpVar, hl0Var, ya1Var);
                d41Var.b = qm2VarM;
                d41Var.b = na1.M(qm2VarM, new hl0(str, i, ch1Var.f), ya1Var);
                return;
            }
            md1 md1Var = (md1) it.next();
            md1Var.d1("/updateActiveView", ch1Var.e);
            md1Var.d1("/untrackActiveViewUnit", ch1Var.f);
        }
    }

    @Override // defpackage.mk1
    public final synchronized void h(Context context) {
        this.m.d = "u";
        i();
        a();
        this.n = true;
    }

    public final synchronized void i() {
        try {
            if (this.o.get() == null) {
                synchronized (this) {
                    a();
                    this.n = true;
                }
                return;
            }
            if (this.n || !this.l.get()) {
                return;
            }
            try {
                hh1 hh1Var = this.m;
                this.k.getClass();
                hh1Var.c = SystemClock.elapsedRealtime();
                JSONObject jSONObjectE = this.g.e(hh1Var);
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    this.j.execute(new fh1(jSONObjectE, (md1) it.next()));
                }
                g41 g41Var = this.i;
                g41Var.getClass();
                yy0 yy0Var = new yy0(g41Var, 2, jSONObjectE);
                hp hpVar = g41Var.b;
                ya1 ya1Var = za1.g;
                pm2 pm2VarL = na1.L(hpVar, yy0Var, ya1Var);
                pm2VarL.a(new in2(pm2VarL, 0, new gp2("ActiveViewListener.callActiveViewJs", 2)), ya1Var);
                return;
            } catch (Exception e) {
                jn.w("Failed to call ActiveViewJS", e);
                return;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // defpackage.mk1
    public final synchronized void l(Context context) {
        this.m.b = true;
        i();
    }

    @Override // defpackage.mk1
    public final synchronized void p(Context context) {
        this.m.b = false;
        i();
    }

    @Override // defpackage.lb3
    public final void F1() {
    }

    @Override // defpackage.lb3
    public final void K0() {
    }

    @Override // defpackage.lb3
    public final void N1() {
    }

    @Override // defpackage.lb3
    public final void S2() {
    }

    @Override // defpackage.lb3
    public final void f() {
    }

    @Override // defpackage.lb3
    public final void g3() {
    }

    @Override // defpackage.lb3
    public final void i3() {
    }

    @Override // defpackage.lb3
    public final void n2() {
    }

    @Override // defpackage.lb3
    public final void H1(int i) {
    }
}
