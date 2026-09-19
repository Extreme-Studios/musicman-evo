package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class dx extends Thread {
    public final int f;

    public dx(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f);
        super.run();
    }
}
