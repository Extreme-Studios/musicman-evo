package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class fx implements Executor {
    public final /* synthetic */ int f;
    public final Handler g;

    public fx(s70 s70Var, Handler handler) {
        this.f = 2;
        this.g = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f;
        Handler handler = this.g;
        switch (i) {
            case 0:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                handler.post(runnable);
                return;
            case 2:
                handler.post(runnable);
                return;
            case 3:
                handler.post(runnable);
                return;
            default:
                handler.post(runnable);
                return;
        }
    }

    public /* synthetic */ fx(Handler handler, int i) {
        this.f = i;
        this.g = handler;
    }
}
