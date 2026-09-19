package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class va implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable g;
    public final /* synthetic */ c4 i;
    public final long f = SystemClock.uptimeMillis() + 10000;
    public boolean h = false;

    public va(c4 c4Var) {
        this.i = c4Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.g = runnable;
        View decorView = this.i.getWindow().getDecorView();
        if (!this.h) {
            decorView.postOnAnimation(new x1(3, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.g;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f) {
                this.h = false;
                this.i.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.g = null;
        qk qkVar = this.i.n;
        synchronized (qkVar.g) {
            z = qkVar.f;
        }
        if (z) {
            this.h = false;
            this.i.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
