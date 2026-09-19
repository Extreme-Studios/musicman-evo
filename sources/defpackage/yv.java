package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yv implements yh {
    public static final String n = yp.f("Processor");
    public final Context f;
    public final r52 g;
    public final WorkDatabase h;
    public final HashMap j = new HashMap();
    public final HashMap i = new HashMap();
    public final HashSet k = new HashSet();
    public final ArrayList l = new ArrayList();
    public final Object m = new Object();

    public yv(Context context, g2 g2Var, r52 r52Var, WorkDatabase workDatabase, List list) {
        this.f = context;
        this.g = r52Var;
        this.h = workDatabase;
    }

    @Override // defpackage.yh
    public final void a(String str, boolean z) {
        synchronized (this.m) {
            try {
                this.j.remove(str);
                int i = 0;
                yp.d().a(n, yv.class.getSimpleName() + " " + str + " executed; reschedule = " + z, new Throwable[0]);
                ArrayList arrayList = this.l;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((yh) obj).a(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(yh yhVar) {
        synchronized (this.m) {
            this.l.add(yhVar);
        }
    }

    public final boolean c(String str) {
        boolean z;
        synchronized (this.m) {
            try {
                z = this.j.containsKey(str) || this.i.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void d(yh yhVar) {
        synchronized (this.m) {
            this.l.remove(yhVar);
        }
    }

    public final boolean e(String str, ig igVar) {
        synchronized (this.m) {
            try {
                if (c(str)) {
                    yp.d().a(n, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f;
                WorkDatabase workDatabase = this.h;
                List list = Collections.EMPTY_LIST;
                context.getApplicationContext();
                p90 p90Var = new p90();
                new ip();
                xz xzVar = new xz();
                p90Var.f = str;
                p90Var.g = workDatabase;
                workDatabase.h();
                workDatabase.d();
                workDatabase.i();
                ib ibVar = new ib(1);
                ibVar.g = this;
                ibVar.h = str;
                ibVar.i = xzVar;
                xzVar.a(ibVar, (h90) this.g.i);
                this.j.put(str, p90Var);
                ((vz) this.g.g).execute(p90Var);
                yp.d().a(n, yv.class.getSimpleName() + ": processing " + str, new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
