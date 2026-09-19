package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class oj1 {
    public final AtomicLong a;

    public oj1(e52 e52Var) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        atomicLong.set(((i52) e52Var.a.g).u.get());
    }

    public final void a(long j) {
        this.a.set(j);
    }
}
