package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h92 extends k92 {
    public static final h92 i = new h92();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k92
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(i92.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((x82) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k92
    public final void b(boolean z) {
        Iterator it = Collections.unmodifiableCollection(i92.c.a).iterator();
        while (it.hasNext()) {
            r92 r92Var = ((x82) it.next()).d;
            if (r92Var.b.get() != 0) {
                gm.m.p(r92Var.c(), "setState", true != z ? "backgrounded" : "foregrounded", r92Var.a);
            }
        }
    }
}
