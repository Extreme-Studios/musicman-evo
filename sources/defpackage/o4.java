package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o4 implements Executor {
    public static final /* synthetic */ o4 g = new o4(2);
    public final /* synthetic */ int f;

    public /* synthetic */ o4(int i) {
        this.f = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
                runnable.run();
                break;
        }
    }

    private final /* synthetic */ void a(Runnable runnable) {
    }
}
