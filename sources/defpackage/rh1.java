package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class rh1 implements r63 {
    public final q63 a;
    public final q63 b;
    public final q63 c;

    public rh1(q63 q63Var, q63 q63Var2, q63 q63Var3) {
        this.a = q63Var;
        this.b = q63Var2;
        this.c = q63Var3;
    }

    @Override // defpackage.v63
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nl1 c() {
        return new nl1((ScheduledExecutorService) this.a.c(), (ae) this.b.c(), (es1) this.c.c());
    }
}
