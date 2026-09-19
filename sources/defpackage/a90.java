package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class a90 {
    public static final String d = yp.f("WorkConstraintsTracker");
    public final z80 a;
    public final gb[] b;
    public final Object c;

    public a90(Context context, l30 l30Var, z80 z80Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = z80Var;
        this.b = new gb[]{new b8((c8) u40.d(applicationContext, l30Var).g, 0), new b8((d8) u40.d(applicationContext, l30Var).h, 1), new b8((e20) u40.d(applicationContext, l30Var).j, 4), new b8((ut) u40.d(applicationContext, l30Var).i, 2), new b8((ut) u40.d(applicationContext, l30Var).i, 3), new rt((ut) u40.d(applicationContext, l30Var).i), new qt((ut) u40.d(applicationContext, l30Var).i)};
        this.c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.c) {
            try {
                for (gb gbVar : this.b) {
                    Object obj = gbVar.b;
                    if (obj != null && gbVar.b(obj) && gbVar.a.contains(str)) {
                        yp.d().a(d, "Work " + str + " constrained by " + gbVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.c) {
            try {
                for (gb gbVar : this.b) {
                    if (gbVar.d != null) {
                        gbVar.d = null;
                        gbVar.d(null, gbVar.b);
                    }
                }
                for (gb gbVar2 : this.b) {
                    gbVar2.c(collection);
                }
                for (gb gbVar3 : this.b) {
                    if (gbVar3.d != this) {
                        gbVar3.d = this;
                        gbVar3.d(this, gbVar3.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.c) {
            try {
                for (gb gbVar : this.b) {
                    ArrayList arrayList = gbVar.a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        gbVar.c.b(gbVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
