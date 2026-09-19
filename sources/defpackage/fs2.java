package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class fs2 {
    public static final fs2 b;
    public final AtomicReference a = new AtomicReference(new bt2(new y91(20)));

    static {
        try {
            fs2 fs2Var = new fs2();
            fs2Var.a(new pr2(vr2.class, fi2.I));
            b = fs2Var;
        } catch (Exception e) {
            j7.i(e);
        }
    }

    public final synchronized void a(pr2 pr2Var) {
        AtomicReference atomicReference = this.a;
        y91 y91Var = new y91((bt2) atomicReference.get());
        y91Var.u(pr2Var);
        atomicReference.set(new bt2(y91Var));
    }

    public final synchronized void b(mr2 mr2Var) {
        AtomicReference atomicReference = this.a;
        y91 y91Var = new y91((bt2) atomicReference.get());
        y91Var.z(mr2Var);
        atomicReference.set(new bt2(y91Var));
    }

    public final synchronized void c(js2 js2Var) {
        AtomicReference atomicReference = this.a;
        y91 y91Var = new y91((bt2) atomicReference.get());
        y91Var.B(js2Var);
        atomicReference.set(new bt2(y91Var));
    }

    public final synchronized void d(hs2 hs2Var) {
        AtomicReference atomicReference = this.a;
        y91 y91Var = new y91((bt2) atomicReference.get());
        y91Var.D(hs2Var);
        atomicReference.set(new bt2(y91Var));
    }

    public final a23 e(ts2 ts2Var) throws GeneralSecurityException {
        bt2 bt2Var = (bt2) this.a.get();
        bt2Var.getClass();
        zs2 zs2Var = new zs2(ts2.class, (j03) ts2Var.h);
        HashMap map = bt2Var.b;
        if (map.containsKey(zs2Var)) {
            return ((mr2) map.get(zs2Var)).b.e(ts2Var);
        }
        String string = zs2Var.toString();
        throw new GeneralSecurityException(ec.n(new StringBuilder(string.length() + 47), "No Key Parser for requested key type ", string, " available"));
    }

    public final ys2 f(a23 a23Var) throws GeneralSecurityException {
        bt2 bt2Var = (bt2) this.a.get();
        bt2Var.getClass();
        at2 at2Var = new at2(a23Var.getClass(), ts2.class);
        HashMap map = bt2Var.a;
        if (map.containsKey(at2Var)) {
            return ((pr2) map.get(at2Var)).b.b(a23Var);
        }
        String string = at2Var.toString();
        throw new GeneralSecurityException(ec.n(new StringBuilder(string.length() + 32), "No Key serializer for ", string, " available"));
    }

    public final ho2 g(us2 us2Var) throws GeneralSecurityException {
        bt2 bt2Var = (bt2) this.a.get();
        bt2Var.getClass();
        zs2 zs2Var = new zs2(us2.class, (j03) us2Var.g);
        HashMap map = bt2Var.d;
        if (map.containsKey(zs2Var)) {
            return ((hs2) map.get(zs2Var)).b.c(us2Var);
        }
        String string = zs2Var.toString();
        throw new GeneralSecurityException(ec.n(new StringBuilder(string.length() + 54), "No Parameters Parser for requested key type ", string, " available"));
    }

    public final ys2 h(ho2 ho2Var) throws GeneralSecurityException {
        bt2 bt2Var = (bt2) this.a.get();
        bt2Var.getClass();
        at2 at2Var = new at2(ho2Var.getClass(), us2.class);
        HashMap map = bt2Var.c;
        if (map.containsKey(at2Var)) {
            return ((js2) map.get(at2Var)).b.d(ho2Var);
        }
        String string = at2Var.toString();
        throw new GeneralSecurityException(ec.n(new StringBuilder(string.length() + 39), "No Key Format serializer for ", string, " available"));
    }
}
