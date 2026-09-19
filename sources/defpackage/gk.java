package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class gk {
    public static final fk a = fk.a;

    public static fk a(kj kjVar) {
        while (kjVar != null) {
            if (kjVar.x != null && kjVar.p) {
                kjVar.i();
            }
            kjVar = kjVar.z;
        }
        return a;
    }

    public static void b(o70 o70Var) {
        if (xj.E(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(o70Var.f.getClass().getName()), o70Var);
        }
    }

    public static final void c(kj kjVar, String str) {
        str.getClass();
        b(new ck(kjVar, "Attempting to reuse fragment " + kjVar + " with previous ID " + str));
        a(kjVar).getClass();
    }
}
