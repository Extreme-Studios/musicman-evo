package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n30 extends i30 {
    public final Runnable h;

    public n30(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.h;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(yd.g(runnable));
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
