package defpackage;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q92 {
    public static final q92 d;
    public WeakReference a;
    public boolean b;
    public boolean c;

    static {
        q92 q92Var = new q92();
        q92Var.b = false;
        q92Var.c = false;
        d = q92Var;
    }

    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(i92.c.a).iterator();
        while (it.hasNext()) {
            r92 r92Var = ((x82) it.next()).d;
            boolean z3 = z2 || z;
            if (r92Var.b.get() != 0) {
                gm.m.p(r92Var.c(), "setDeviceLockState", true != z3 ? "unlocked" : "locked");
            }
        }
    }
}
