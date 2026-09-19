package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qn2 extends em2 implements Runnable {
    public final Runnable m;

    public qn2(Runnable runnable) {
        runnable.getClass();
        this.m = runnable;
    }

    @Override // defpackage.fm2
    public final String g() {
        String string = this.m.toString();
        return ec.n(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.m.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
