package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class z60 {
    public final a70 a = new a70();

    public final void a() {
        a70 a70Var = this.a;
        if (a70Var != null && !a70Var.d) {
            a70Var.d = true;
            synchronized (a70Var.a) {
                try {
                    Iterator it = a70Var.b.values().iterator();
                    while (it.hasNext()) {
                        a70.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = a70Var.c.iterator();
                    while (it2.hasNext()) {
                        a70.a((AutoCloseable) it2.next());
                    }
                    a70Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
