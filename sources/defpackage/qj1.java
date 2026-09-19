package defpackage;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class qj1 implements lb3 {
    public final e52 g;
    public final x42 h;
    public final ae i;
    public final es1 j;
    public final ScheduledExecutorService k;
    public final Object f = new Object();
    public final s72 l = t72.z();
    public boolean m = false;
    public boolean n = false;

    public qj1(e52 e52Var, x42 x42Var, ae aeVar, es1 es1Var, ScheduledExecutorService scheduledExecutorService) {
        this.g = e52Var;
        this.h = x42Var;
        this.i = aeVar;
        this.j = es1Var;
        this.k = scheduledExecutorService;
    }

    @Override // defpackage.lb3
    public final void C1() {
        b(6);
    }

    @Override // defpackage.lb3
    public final void F1() {
        b(4);
    }

    @Override // defpackage.lb3
    public final void K0() {
        b(5);
    }

    @Override // defpackage.lb3
    public final void S2() {
        b(7);
    }

    @Override // defpackage.lb3
    public final void Y() {
        b(8);
    }

    public final void a() {
        synchronized (this.f) {
            try {
                es1 es1Var = this.j;
                String str = ((z42) this.g.b.h).b;
                String strEncodeToString = Base64.encodeToString(((t72) this.l.c()).b(), 1);
                if (((Boolean) tu0.e.c.a(lx0.Gd)).booleanValue()) {
                    us2 us2VarA = es1Var.a();
                    us2VarA.s("action", "pclma");
                    us2VarA.s("pclmd", strEncodeToString);
                    us2VarA.s("gqi", str);
                    us2VarA.y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.f) {
            try {
                if (!this.n && this.m) {
                    s72 s72Var = this.l;
                    y62 y62VarZ = z62.z();
                    y62VarZ.b();
                    ((z62) y62VarZ.g).B(i);
                    this.i.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    y62VarZ.b();
                    ((z62) y62VarZ.g).A(jCurrentTimeMillis);
                    z62 z62Var = (z62) y62VarZ.c();
                    s72Var.b();
                    ((t72) s72Var.g).A(z62Var);
                    if (i == 10) {
                        a();
                        this.n = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lb3
    public final void g3() {
        b(3);
    }

    @Override // defpackage.lb3
    public final void i3() {
        b(10);
    }

    @Override // defpackage.lb3
    public final void n2() {
        b(9);
    }

    @Override // defpackage.lb3
    public final void N1() {
    }

    @Override // defpackage.lb3
    public final void f() {
    }

    @Override // defpackage.lb3
    public final void H1(int i) {
    }
}
