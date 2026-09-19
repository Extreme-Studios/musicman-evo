package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class vm2 extends em2 {
    public static final v51 o;
    public static final nn2 p = new nn2(vm2.class);
    public volatile Set m;
    public volatile int n;

    static {
        Throwable th;
        v51 um2Var;
        try {
            um2Var = new tm2(23);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            um2Var = new um2(23);
        }
        o = um2Var;
        if (th != null) {
            p.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
