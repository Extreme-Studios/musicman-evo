package defpackage;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class ko0 {
    public final e3 a;
    public final zy1 b = new zy1(12);
    public final g2 c;

    public ko0(e3 e3Var, g2 g2Var) {
        this.a = e3Var;
        this.c = g2Var;
    }

    public final Optional a() {
        jn0 jn0Var;
        try {
            try {
                try {
                    ArrayDeque arrayDeque = (ArrayDeque) this.b.g;
                    if (arrayDeque.isEmpty()) {
                        throw new fo0();
                    }
                    do0 do0Var = (do0) arrayDeque.pop();
                    long j = do0Var.a;
                    long j2 = do0Var.b;
                    long j3 = do0Var.c;
                    e3 e3Var = this.a;
                    if (e3Var.g < j2) {
                        return Optional.of(jn0.M);
                    }
                    this.c.e(j);
                    if (j3 == 0) {
                        while (e3Var.g > j2) {
                            e3Var.n();
                        }
                    }
                    return Optional.empty();
                } catch (bo0 e) {
                    e = e;
                    throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (ao0 | bo0 e2) {
                e = e2;
            }
        } catch (fo0 unused) {
            jn0Var = jn0.C;
            return Optional.of(jn0Var);
        } catch (go0 unused2) {
            jn0Var = jn0.M;
            return Optional.of(jn0Var);
        }
    }
}
