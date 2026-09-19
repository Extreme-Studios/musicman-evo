package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class fm2 extends nm2 {
    public static Object h(hp hpVar) {
        Object obj;
        Throwable thC;
        if (hpVar instanceof dm2) {
            Object yl2Var = ((fm2) hpVar).f;
            if (yl2Var instanceof yl2) {
                yl2 yl2Var2 = (yl2) yl2Var;
                if (yl2Var2.a) {
                    Throwable th = yl2Var2.b;
                    yl2Var = th != null ? new yl2(th, false) : yl2.d;
                }
            }
            Objects.requireNonNull(yl2Var);
            return yl2Var;
        }
        if ((hpVar instanceof nm2) && (thC = ((nm2) hpVar).c()) != null) {
            return new bm2(thC);
        }
        boolean zIsCancelled = hpVar.isCancelled();
        boolean z = true;
        if ((!nm2.k) && zIsCancelled) {
            yl2 yl2Var3 = yl2.d;
            Objects.requireNonNull(yl2Var3);
            return yl2Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = hpVar.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new bm2(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new bm2(e);
            } catch (CancellationException e3) {
                return !zIsCancelled ? new bm2(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(hpVar)), e3)) : new yl2(e3, false);
            } catch (ExecutionException e4) {
                return zIsCancelled ? new yl2(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(hpVar)), e4), false) : new bm2(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? nm2.i : obj;
        }
        String strValueOf = String.valueOf(hpVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
        sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb.append(strValueOf);
        return new yl2(new IllegalArgumentException(sb.toString()), false);
    }

    public static Object i(Object obj) throws ExecutionException {
        if (obj instanceof yl2) {
            Throwable th = ((yl2) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof bm2) {
            throw new ExecutionException(((bm2) obj).a);
        }
        if (obj == nm2.i) {
            return null;
        }
        return obj;
    }

    public static boolean j(Object obj) {
        return !(obj instanceof zl2);
    }

    public static void o(fm2 fm2Var, boolean z) {
        cm2 cm2Var = null;
        while (true) {
            for (mm2 mm2VarY = nm2.l.Y(fm2Var); mm2VarY != null; mm2VarY = mm2VarY.b) {
                Thread thread = mm2VarY.a;
                if (thread != null) {
                    mm2VarY.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                fm2Var.k();
            }
            fm2Var.f();
            cm2 cm2Var2 = cm2Var;
            cm2 cm2VarC0 = nm2.l.c0(fm2Var);
            cm2 cm2Var3 = cm2Var2;
            while (cm2VarC0 != null) {
                cm2 cm2Var4 = cm2VarC0.c;
                cm2VarC0.c = cm2Var3;
                cm2Var3 = cm2VarC0;
                cm2VarC0 = cm2Var4;
            }
            while (cm2Var3 != null) {
                Runnable runnable = cm2Var3.a;
                cm2Var = cm2Var3.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof zl2) {
                    zl2 zl2Var = (zl2) runnable;
                    fm2Var = zl2Var.f;
                    if (fm2Var.f == zl2Var) {
                        if (nm2.l.f0(fm2Var, zl2Var, h(zl2Var.g))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = cm2Var3.b;
                    Objects.requireNonNull(executor);
                    q(runnable, executor);
                }
                cm2Var3 = cm2Var;
            }
            return;
        }
    }

    public static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger loggerA = nm2.j.a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", ec.o(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
        }
    }

    @Override // defpackage.hp
    public void a(Runnable runnable, Executor executor) {
        cm2 cm2Var;
        cm2 cm2Var2 = cm2.d;
        hn.O(runnable, "Runnable was null.");
        hn.O(executor, "Executor was null.");
        if (!isDone() && (cm2Var = this.g) != cm2Var2) {
            cm2 cm2Var3 = new cm2(runnable, executor);
            do {
                cm2Var3.c = cm2Var;
                if (nm2.l.W(this, cm2Var, cm2Var3)) {
                    return;
                } else {
                    cm2Var = this.g;
                }
            } while (cm2Var != cm2Var2);
        }
        q(runnable, executor);
    }

    @Override // defpackage.nm2
    public final Throwable c() {
        if (!(this instanceof dm2)) {
            return null;
        }
        Object obj = this.f;
        if (obj instanceof bm2) {
            return ((bm2) obj).a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        yl2 yl2Var;
        Object obj = this.f;
        if (!(obj instanceof zl2) && !(obj == null)) {
            return false;
        }
        if (nm2.k) {
            yl2Var = new yl2(new CancellationException("Future.cancel() was called."), z);
        } else {
            yl2Var = z ? yl2.c : yl2.d;
            Objects.requireNonNull(yl2Var);
        }
        boolean z2 = false;
        while (true) {
            if (nm2.l.f0(this, obj, yl2Var)) {
                o(this, z);
                if (obj instanceof zl2) {
                    hp hpVar = ((zl2) obj).g;
                    if (hpVar instanceof dm2) {
                        this = (fm2) hpVar;
                        obj = this.f;
                        if (!(obj == null) && !(obj instanceof zl2)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        hpVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f;
            if (j(obj)) {
                return z2;
            }
        }
    }

    public boolean d(Object obj) {
        if (obj == null) {
            obj = nm2.i;
        }
        if (!nm2.l.f0(this, null, obj)) {
            return false;
        }
        o(this, false);
        return true;
    }

    public boolean e(Throwable th) {
        th.getClass();
        if (!nm2.l.f0(this, null, new bm2(th))) {
            return false;
        }
        o(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        boolean z;
        mm2 mm2Var = mm2.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f;
        if ((obj != null) && j(obj)) {
            return i(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            mm2 mm2Var2 = this.h;
            if (mm2Var2 != mm2Var) {
                mm2 mm2Var3 = new mm2();
                z = true;
                while (true) {
                    ss0 ss0Var = nm2.l;
                    ss0Var.L(mm2Var3, mm2Var2);
                    if (ss0Var.R(this, mm2Var2, mm2Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(mm2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f;
                            if ((obj2 != null) && j(obj2)) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(mm2Var3);
                        break;
                    }
                    long j4 = j3;
                    mm2Var2 = this.h;
                    if (mm2Var2 != mm2Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.f;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        j2 = 0;
        z = true;
        while (nanos > j2) {
            Object obj4 = this.f;
            if ((obj4 != null ? z : false) && j(obj4)) {
                return i(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        ec.w(sb, "Waited ", j, " ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                ec.w(sb2, strConcat, jConvert, " ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z2) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z2) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                sb3.append(strConcat);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(ec.n(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f instanceof yl2;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f;
        return (obj != null) & j(obj);
    }

    public final boolean l() {
        Object obj = this.f;
        return (obj instanceof yl2) && ((yl2) obj).a;
    }

    public final void m(hp hpVar) {
        bm2 bm2Var;
        hpVar.getClass();
        Object obj = this.f;
        if (obj == null) {
            if (hpVar.isDone()) {
                if (nm2.l.f0(this, null, h(hpVar))) {
                    o(this, false);
                    return;
                }
                return;
            }
            zl2 zl2Var = new zl2(this, hpVar);
            if (nm2.l.f0(this, null, zl2Var)) {
                try {
                    hpVar.a(zl2Var, cn2.f);
                    return;
                } catch (Throwable th) {
                    try {
                        bm2Var = new bm2(th);
                    } catch (Error | Exception unused) {
                        bm2Var = bm2.b;
                    }
                    nm2.l.f0(this, zl2Var, bm2Var);
                    return;
                }
            }
            obj = this.f;
        }
        if (obj instanceof yl2) {
            hpVar.cancel(((yl2) obj).a);
        }
    }

    public final void n(Future future) {
        if ((future != null) && (this.f instanceof yl2)) {
            future.cancel(l());
        }
    }

    public final void p(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            p(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f;
            if (obj instanceof zl2) {
                sb.append(", setFuture=[");
                hp hpVar = ((zl2) obj).g;
                try {
                    if (hpVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(hpVar);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = g();
                    if (yd.v(strConcat)) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                p(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void f() {
    }

    public void k() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        mm2 mm2Var = mm2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f;
            if ((obj2 != null) & j(obj2)) {
                return i(obj2);
            }
            mm2 mm2Var2 = this.h;
            if (mm2Var2 != mm2Var) {
                mm2 mm2Var3 = new mm2();
                do {
                    ss0 ss0Var = nm2.l;
                    ss0Var.L(mm2Var3, mm2Var2);
                    if (ss0Var.R(this, mm2Var2, mm2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f;
                            } else {
                                b(mm2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & j(obj)));
                        return i(obj);
                    }
                    mm2Var2 = this.h;
                } while (mm2Var2 != mm2Var);
            }
            Object obj3 = this.f;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        throw new InterruptedException();
    }
}
