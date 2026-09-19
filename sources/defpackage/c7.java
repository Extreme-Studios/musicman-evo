package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c7 implements Executor {
    public final /* synthetic */ int f;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f) {
            case 0:
                d7.Q().C.D.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
