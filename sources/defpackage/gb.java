package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class gb {
    public final ArrayList a = new ArrayList();
    public Object b;
    public final jb c;
    public a90 d;

    public gb(jb jbVar) {
        this.c = jbVar;
    }

    public abstract boolean a(j90 j90Var);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            j90 j90Var = (j90) it.next();
            if (a(j90Var)) {
                this.a.add(j90Var.a);
            }
        }
        boolean zIsEmpty = this.a.isEmpty();
        jb jbVar = this.c;
        if (zIsEmpty) {
            jbVar.b(this);
        } else {
            synchronized (jbVar.c) {
                try {
                    if (jbVar.d.add(this)) {
                        if (jbVar.d.size() == 1) {
                            jbVar.e = jbVar.a();
                            yp.d().a(jb.f, String.format("%s: initial state = %s", jbVar.getClass().getSimpleName(), jbVar.e), new Throwable[0]);
                            jbVar.d();
                        }
                        Object obj = jbVar.e;
                        this.b = obj;
                        d(this.d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.d, this.b);
    }

    public final void d(a90 a90Var, Object obj) {
        if (this.a.isEmpty() || a90Var == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.a;
            synchronized (a90Var.c) {
                try {
                    z80 z80Var = a90Var.a;
                    if (z80Var != null) {
                        z80Var.b(arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ArrayList arrayList2 = this.a;
        synchronized (a90Var.c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (a90Var.a(str)) {
                        yp.d().a(a90.d, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                z80 z80Var2 = a90Var.a;
                if (z80Var2 != null) {
                    z80Var2.c(arrayList3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
