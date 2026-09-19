package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class p40 {
    public final r40 a;

    public p40(r40 r40Var) {
        this.a = r40Var;
    }

    public static final p40 a(Context context) {
        o40 o40Var;
        int i = Build.VERSION.SDK_INT;
        r2 r2Var = r2.a;
        if ((i >= 30 ? r2Var.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) tq.w());
            systemService.getClass();
            o40Var = new o40(tq.l(systemService), 1);
        } else {
            if ((i >= 30 ? r2Var.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) tq.w());
                systemService2.getClass();
                o40Var = new o40(tq.l(systemService2), 0);
            } else {
                o40Var = null;
            }
        }
        if (o40Var != null) {
            return new p40(o40Var);
        }
        return null;
    }

    public hp b(tl tlVar) {
        tlVar.getClass();
        ke keVar = jf.a;
        return jn.c(rs0.b(v51.b(cq.a), new sd(this, tlVar, null, 4)));
    }
}
