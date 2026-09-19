package defpackage;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class sm2 extends vm2 {
    public static final nn2 t = new nn2(sm2.class);
    public rj2 q;
    public final boolean r;
    public final boolean s;

    public sm2(rj2 rj2Var, boolean z, boolean z2) {
        int size = rj2Var.size();
        this.m = null;
        this.n = size;
        this.q = rj2Var;
        this.r = z;
        this.s = z2;
    }

    @Override // defpackage.fm2
    public final void f() {
        rj2 rj2Var = this.q;
        r(1);
        if ((rj2Var != null) && (this.f instanceof yl2)) {
            boolean zL = l();
            dl2 dl2VarA = rj2Var.a();
            while (dl2VarA.hasNext()) {
                ((Future) dl2VarA.next()).cancel(zL);
            }
        }
    }

    @Override // defpackage.fm2
    public final String g() {
        rj2 rj2Var = this.q;
        return rj2Var != null ? "futures=".concat(rj2Var.toString()) : super.g();
    }

    public abstract void r(int i);

    public final void s(int i, hp hpVar) {
        try {
            if (hpVar.isCancelled()) {
                this.q = null;
                cancel(false);
            } else {
                try {
                    w(i, dq.u(hpVar));
                } catch (ExecutionException e) {
                    t(e.getCause());
                } catch (Throwable th) {
                    t(th);
                }
            }
        } finally {
            u(null);
        }
    }

    public final void t(Throwable th) {
        th.getClass();
        if (this.r && !e(th)) {
            Set set = this.m;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f instanceof yl2)) {
                    Throwable thC = c();
                    Objects.requireNonNull(thC);
                    while (thC != null && setNewSetFromMap.add(thC)) {
                        thC = thC.getCause();
                    }
                }
                vm2.o.w(this, setNewSetFromMap);
                set = this.m;
                Objects.requireNonNull(set);
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    t.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        if (th instanceof Error) {
            t.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", "Input Future failed with Error", th);
        }
    }

    public final void u(rj2 rj2Var) {
        int iY = vm2.o.y(this);
        int i = 0;
        hn.N("Less than 0 remaining futures", iY >= 0);
        if (iY == 0) {
            if (rj2Var != null) {
                dl2 dl2VarA = rj2Var.a();
                while (dl2VarA.hasNext()) {
                    Future future = (Future) dl2VarA.next();
                    if (!future.isCancelled()) {
                        try {
                            w(i, dq.u(future));
                        } catch (ExecutionException e) {
                            t(e.getCause());
                        } catch (Throwable th) {
                            t(th);
                        }
                    }
                    i++;
                }
            }
            this.m = null;
            x();
            r(2);
        }
    }

    public final void v() {
        Objects.requireNonNull(this.q);
        if (this.q.isEmpty()) {
            x();
            return;
        }
        rj2 rj2Var = this.q;
        cn2 cn2Var = cn2.f;
        if (!this.r) {
            rj2 rj2Var2 = true != this.s ? null : rj2Var;
            u52 u52Var = new u52(this, 8, rj2Var2);
            dl2 dl2VarA = rj2Var.a();
            while (dl2VarA.hasNext()) {
                hp hpVar = (hp) dl2VarA.next();
                if (hpVar.isDone()) {
                    u(rj2Var2);
                } else {
                    hpVar.a(u52Var, cn2Var);
                }
            }
            return;
        }
        dl2 dl2VarA2 = rj2Var.a();
        int i = 0;
        while (dl2VarA2.hasNext()) {
            hp hpVar2 = (hp) dl2VarA2.next();
            int i2 = i + 1;
            if (hpVar2.isDone()) {
                s(i, hpVar2);
            } else {
                hpVar2.a(new e6(this, i, hpVar2, 5), cn2Var);
            }
            i = i2;
        }
    }

    public abstract void w(int i, Object obj);

    public abstract void x();
}
