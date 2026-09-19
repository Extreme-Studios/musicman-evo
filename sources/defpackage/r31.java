package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r31 extends z4 {
    public final Object c = new Object();
    public final t31 d;
    public boolean e;

    public r31(t31 t31Var) {
        this.d = t31Var;
    }

    public final void p() {
        jn.p("release: Trying to acquire lock");
        synchronized (this.c) {
            try {
                jn.p("release: Lock acquired");
                if (this.e) {
                    jn.p("release: Lock already released");
                    return;
                }
                this.e = true;
                m(new ue0(10), new ue0(18));
                m(new s70(this), new dr0(this));
                jn.p("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
