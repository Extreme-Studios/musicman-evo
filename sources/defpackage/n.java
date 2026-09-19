package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final n d = new n(null, null);
    public final Runnable a;
    public final Executor b;
    public n c;

    public n(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
