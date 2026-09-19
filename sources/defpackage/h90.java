package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h90 implements Executor {
    public final /* synthetic */ int f;
    public final Object g;

    public h90(int i) {
        this.f = i;
        switch (i) {
            case 2:
                za0 za0Var = new za0(Looper.getMainLooper(), 1, false);
                Looper.getMainLooper();
                this.g = za0Var;
                break;
            default:
                this.g = new e32(Looper.getMainLooper(), 2);
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((Handler) ((r52) obj).h).post(runnable);
                return;
            case 1:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((e32) obj).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    zb3 zb3Var = vc3.C.c;
                    Context context = vc3.C.h.e;
                    if (context != null) {
                        try {
                            if (((Boolean) dz0.b.u()).booleanValue()) {
                                na1.c(context, th);
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    throw th;
                }
            case 2:
                ((za0) obj).post(runnable);
                return;
            default:
                ((Executor) obj).execute(runnable);
                return;
        }
    }

    public /* synthetic */ h90(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
