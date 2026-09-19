package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements hp {
    public static final boolean i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger j = Logger.getLogger(s.class.getName());
    public static final ss0 k;
    public static final Object l;
    public volatile Object f;
    public volatile n g;
    public volatile r h;

    static {
        ss0 qVar;
        try {
            qVar = new o(AtomicReferenceFieldUpdater.newUpdater(r.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(r.class, r.class, "b"), AtomicReferenceFieldUpdater.newUpdater(s.class, r.class, "h"), AtomicReferenceFieldUpdater.newUpdater(s.class, n.class, "g"), AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            qVar = new q();
        }
        k = qVar;
        if (th != null) {
            j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        l = new Object();
    }

    public static void c(s sVar) {
        r rVar;
        n nVar;
        do {
            rVar = sVar.h;
        } while (!k.g(sVar, rVar, r.c));
        while (rVar != null) {
            Thread thread = rVar.a;
            if (thread != null) {
                rVar.a = null;
                LockSupport.unpark(thread);
            }
            rVar = rVar.b;
        }
        do {
            nVar = sVar.g;
        } while (!k.e(sVar, nVar, n.d));
        n nVar2 = null;
        while (nVar != null) {
            n nVar3 = nVar.c;
            nVar.c = nVar2;
            nVar2 = nVar;
            nVar = nVar3;
        }
        while (nVar2 != null) {
            n nVar4 = nVar2.c;
            Runnable runnable = nVar2.a;
            if (runnable instanceof p) {
                throw null;
            }
            d(runnable, nVar2.b);
            nVar2 = nVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            j.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof k) {
            Throwable th = ((k) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof m) {
            throw new ExecutionException(((m) obj).a);
        }
        if (obj == l) {
            return null;
        }
        return obj;
    }

    public static Object f(hp hpVar) {
        Object obj;
        if (hpVar instanceof s) {
            Object obj2 = ((s) hpVar).f;
            if (!(obj2 instanceof k)) {
                return obj2;
            }
            k kVar = (k) obj2;
            if (kVar.a) {
                return kVar.b != null ? new k(kVar.b, false) : k.d;
            }
            return obj2;
        }
        boolean zIsCancelled = hpVar.isCancelled();
        boolean z = true;
        if ((!i) && zIsCancelled) {
            return k.d;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = hpVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (zIsCancelled) {
                    return new k(e, false);
                }
                return new m(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + hpVar, e));
            } catch (ExecutionException e2) {
                return new m(e2.getCause());
            } catch (Throwable th2) {
                return new m(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? l : obj;
    }

    @Override // defpackage.hp
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        n nVar = this.g;
        n nVar2 = n.d;
        if (nVar != nVar2) {
            n nVar3 = new n(runnable, executor);
            do {
                nVar3.c = nVar;
                if (k.e(this, nVar, nVar3)) {
                    return;
                } else {
                    nVar = this.g;
                }
            } while (nVar != nVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
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
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        k kVar;
        Object obj = this.f;
        if ((obj == null) | (obj instanceof p)) {
            if (i) {
                kVar = new k(new CancellationException("Future.cancel() was called."), z);
            } else {
                kVar = z ? k.c : k.d;
            }
            while (!k.f(this, obj, kVar)) {
                obj = this.f;
                if (!(obj instanceof p)) {
                }
            }
            c(this);
            if (obj instanceof p) {
                throw null;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        if (this.f instanceof p) {
            return ec.m(new StringBuilder("setFuture=["), String.valueOf((Object) null), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        r rVar = r.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f;
        if ((obj != null) && (!(obj instanceof p))) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            r rVar2 = this.h;
            if (rVar2 != rVar) {
                r rVar3 = new r();
                z = true;
                while (true) {
                    ss0 ss0Var = k;
                    ss0Var.r(rVar3, rVar2);
                    if (ss0Var.g(this, rVar2, rVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(rVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f;
                            if ((obj2 != null) && (!(obj2 instanceof p))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(rVar3);
                        break;
                    }
                    rVar2 = this.h;
                    if (rVar2 == rVar) {
                    }
                }
            }
            return e(this.f);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.f;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof p))) {
                return e(obj3);
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
        String strConcat = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z2) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    public final void h(r rVar) {
        rVar.a = null;
        while (true) {
            r rVar2 = this.h;
            if (rVar2 == r.c) {
                return;
            }
            r rVar3 = null;
            while (rVar2 != null) {
                r rVar4 = rVar2.b;
                if (rVar2.a != null) {
                    rVar3 = rVar2;
                } else if (rVar3 != null) {
                    rVar3.b = rVar4;
                    if (rVar3.a == null) {
                    }
                } else if (!k.g(this, rVar2, rVar4)) {
                }
                rVar2 = rVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f instanceof k;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f;
        return (!(obj instanceof p)) & (obj != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f instanceof k) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e) {
                strG = "Exception thrown from implementation: " + e.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        r rVar = r.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f;
            if ((obj2 != null) & (!(obj2 instanceof p))) {
                return e(obj2);
            }
            r rVar2 = this.h;
            if (rVar2 != rVar) {
                r rVar3 = new r();
                do {
                    ss0 ss0Var = k;
                    ss0Var.r(rVar3, rVar2);
                    if (ss0Var.g(this, rVar2, rVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f;
                            } else {
                                h(rVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof p))));
                        return e(obj);
                    }
                    rVar2 = this.h;
                } while (rVar2 != rVar);
            }
            return e(this.f);
        }
        throw new InterruptedException();
    }
}
