package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class jb {
    public static final String f = yp.f("ConstraintTracker");
    public final l30 a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public Object e;

    public jb(Context context, l30 l30Var) {
        this.b = context.getApplicationContext();
        this.a = l30Var;
    }

    public abstract Object a();

    public final void b(gb gbVar) {
        synchronized (this.c) {
            try {
                if (this.d.remove(gbVar) && this.d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.c) {
            try {
                Object obj2 = this.e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.e = obj;
                    ((h90) ((r52) this.a).i).execute(new in2(this, new ArrayList(this.d), 6, false));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
