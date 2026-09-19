package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class aj1 implements ib0 {
    public final cj1 f;
    public final i52 g;

    public aj1(cj1 cj1Var, i52 i52Var) {
        this.f = cj1Var;
        this.g = i52Var;
    }

    @Override // defpackage.ib0
    public final void B() {
        i52 i52Var = this.g;
        cj1 cj1Var = this.f;
        String str = i52Var.g;
        synchronized (cj1Var.a) {
            try {
                ConcurrentHashMap concurrentHashMap = cj1Var.b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
