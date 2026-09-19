package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class si1 {
    public final Executor a;
    public final ScheduledExecutorService b;
    public volatile boolean c = true;

    public si1(ya1 ya1Var, ScheduledExecutorService scheduledExecutorService, p62 p62Var) {
        this.a = ya1Var;
        this.b = scheduledExecutorService;
    }
}
