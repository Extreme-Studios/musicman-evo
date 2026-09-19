package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class nm0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public nm0(ym0 ym0Var, z61 z61Var) {
        s70 s70Var = new s70(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.e = ym0Var;
        this.f = z61Var;
        this.g = new im0[4];
        this.k = s70Var;
    }

    public void a() {
        em0 em0Var = (em0) this.h;
        if (em0Var != null) {
            em0Var.i = true;
            em0Var.interrupt();
        }
        im0[] im0VarArr = (im0[]) this.g;
        for (int i = 0; i < 4; i++) {
            im0 im0Var = im0VarArr[i];
            if (im0Var != null) {
                im0Var.i = true;
                im0Var.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = (PriorityBlockingQueue) this.c;
        PriorityBlockingQueue priorityBlockingQueue2 = (PriorityBlockingQueue) this.d;
        ym0 ym0Var = (ym0) this.e;
        s70 s70Var = (s70) this.k;
        em0 em0Var2 = new em0(priorityBlockingQueue, priorityBlockingQueue2, ym0Var, s70Var);
        this.h = em0Var2;
        em0Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            im0 im0Var2 = new im0(priorityBlockingQueue2, (z61) this.f, ym0Var, s70Var);
            im0VarArr[i2] = im0Var2;
            im0Var2.start();
        }
    }

    public void b(mm0 mm0Var) {
        mm0Var.m = this;
        HashSet hashSet = (HashSet) this.b;
        synchronized (hashSet) {
            hashSet.add(mm0Var);
        }
        mm0Var.l = Integer.valueOf(((AtomicInteger) this.a).incrementAndGet());
        mm0Var.a("add-to-queue");
        c();
        ((PriorityBlockingQueue) this.c).add(mm0Var);
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.j;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public nm0(e52 e52Var, x42 x42Var, nk1 nk1Var, xk1 xk1Var, o32 o32Var, zj1 zj1Var, tl1 tl1Var, zk1 zk1Var, um1 um1Var, oj1 oj1Var, os1 os1Var) {
        this.a = e52Var;
        this.b = x42Var;
        this.c = nk1Var;
        this.d = xk1Var;
        this.e = o32Var;
        this.f = zj1Var;
        this.g = tl1Var;
        this.h = zk1Var;
        this.i = um1Var;
        this.j = oj1Var;
        this.k = os1Var;
    }
}
