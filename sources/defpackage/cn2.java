package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cn2 implements Executor {
    public static final cn2 f;
    public static final /* synthetic */ cn2[] g;

    static {
        cn2 cn2Var = new cn2("INSTANCE", 0);
        f = cn2Var;
        g = new cn2[]{cn2Var};
    }

    public static cn2[] values() {
        return (cn2[]) g.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
