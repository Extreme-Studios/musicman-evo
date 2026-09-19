package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cm2 {
    public static final cm2 d = new cm2();
    public final Runnable a;
    public final Executor b;
    public cm2 c;

    public cm2() {
        this.a = null;
        this.b = null;
    }

    public cm2(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
