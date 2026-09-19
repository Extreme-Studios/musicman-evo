package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class nv1 {
    public static nv1 f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public nv1(Context context) {
        Executor executorR = ej1.r();
        this.a = executorR;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        executorR.execute(new hb1(this, context, 20, false));
    }

    public static synchronized nv1 a(Context context) {
        try {
            if (f == null) {
                f = new nv1(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<ku1> copyOnWriteArrayList = this.b;
        for (ku1 ku1Var : copyOnWriteArrayList) {
            if (ku1Var.a.get() == null) {
                copyOnWriteArrayList.remove(ku1Var);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (ku1 ku1Var2 : this.b) {
                    ku1Var2.getClass();
                    ku1Var2.b.execute(new va1(23, ku1Var2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
