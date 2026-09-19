package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hm implements dz, z80, yh {
    public static final String j = yp.f("GreedyScheduler");
    public final g90 f;
    public final a90 g;
    public final HashSet h = new HashSet();
    public final Object i;

    public hm(Context context, g2 g2Var, r52 r52Var, g90 g90Var) {
        this.f = g90Var;
        this.g = new a90(context, r52Var, this);
        Object obj = g2Var.j;
        new HashMap();
        this.i = new Object();
    }

    @Override // defpackage.yh
    public final void a(String str, boolean z) {
        synchronized (this.i) {
            try {
                for (j90 j90Var : this.h) {
                    if (j90Var.a.equals(str)) {
                        yp.d().a(j, "Stopping tracking for " + str, new Throwable[0]);
                        this.h.remove(j90Var);
                        this.g.b(this.h);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z80
    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            yp.d().a(j, "Constraints not met: Cancelling work ID " + str, new Throwable[0]);
            this.f.f(str);
        }
    }

    @Override // defpackage.z80
    public final void c(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            yp.d().a(j, "Constraints met: Scheduling work ID " + str, new Throwable[0]);
            this.f.e(str, null);
        }
    }
}
