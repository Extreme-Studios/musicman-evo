package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ud2 implements md2 {
    public static final e43 t;
    public final Context a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final gd2 d;
    public final boolean e;
    public final String f;
    public final long g;
    public final long h;
    public final double i;
    public final String j;
    public final long k;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final Object m = new Object();
    public final Object n = new Object();
    public final Object o = new Object();
    public final to0 p = uo0.z();
    public final ArrayList q = new ArrayList();
    public boolean r = false;
    public final HashMap s = new HashMap();

    static {
        a43 a43VarZ = e43.z();
        a43VarZ.b();
        ((e43) a43VarZ.g).A(17);
        t = (e43) a43VarZ.c();
    }

    public ud2(Context context, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, gd2 gd2Var, Random random, String str, long j, long j2, double d, String str2, long j3) {
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = executorService;
        this.d = gd2Var;
        this.f = str;
        this.g = j;
        this.h = j2;
        this.i = d;
        this.j = str2;
        this.k = j3;
        this.e = random.nextDouble() < d;
    }

    @Override // defpackage.md2
    public final hp a() {
        xn2 xn2Var = new xn2(Executors.callable(new td2(0, this), null));
        this.c.execute(xn2Var);
        return xn2Var;
    }

    public final void b(int i, long j, Throwable th, String str) {
        long jLongValue;
        if (this.e) {
            synchronized (this.n) {
                try {
                    ArrayList arrayList = this.q;
                    synchronized (this.o) {
                        try {
                            HashMap map = this.s;
                            Integer numValueOf = Integer.valueOf(i);
                            Long l = (Long) map.get(numValueOf);
                            if (l == null) {
                                l = 0L;
                            }
                            jLongValue = 1 + l.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    arrayList.add(new sd2(i, j, th, str, jLongValue));
                    if (!this.r) {
                        this.r = true;
                        this.b.schedule(new td2(1, this), this.h, TimeUnit.MILLISECONDS);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void c(uo0 uo0Var) {
        try {
            qd2 qd2VarZ = rd2.z();
            e43 e43Var = t;
            qd2VarZ.b();
            ((rd2) qd2VarZ.g).B(e43Var);
            od2 od2VarZ = pd2.z();
            od2VarZ.b();
            ((pd2) od2VarZ.g).A(uo0Var);
            pd2 pd2Var = (pd2) od2VarZ.c();
            qd2VarZ.b();
            ((rd2) qd2VarZ.g).A(pd2Var);
            this.d.a(this.f, true, ((rd2) qd2VarZ.c()).b(), "application/x-protobuf");
        } catch (RuntimeException unused) {
        }
    }
}
