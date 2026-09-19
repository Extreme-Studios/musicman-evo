package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t31 extends z4 {
    public final Object c = new Object();
    public boolean d = false;
    public int e = 0;

    public final r31 p() {
        r31 r31Var = new r31(this);
        jn.p("createNewReference: Trying to acquire lock");
        synchronized (this.c) {
            jn.p("createNewReference: Lock acquired");
            m(new zy1(this, r31Var), new kc2(this, r31Var));
            int i = this.e;
            if (i < 0) {
                throw new IllegalStateException();
            }
            this.e = i + 1;
        }
        jn.p("createNewReference: Lock released");
        return r31Var;
    }

    public final void q() {
        jn.p("releaseOneReference: Trying to acquire lock");
        synchronized (this.c) {
            jn.p("releaseOneReference: Lock acquired");
            if (this.e <= 0) {
                throw new IllegalStateException();
            }
            jn.p("Releasing 1 reference for JS Engine");
            this.e--;
            s();
        }
        jn.p("releaseOneReference: Lock released");
    }

    public final void r() {
        jn.p("markAsDestroyable: Trying to acquire lock");
        synchronized (this.c) {
            jn.p("markAsDestroyable: Lock acquired");
            if (this.e < 0) {
                throw new IllegalStateException();
            }
            jn.p("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.d = true;
            s();
        }
        jn.p("markAsDestroyable: Lock released");
    }

    public final void s() {
        jn.p("maybeDestroy: Trying to acquire lock");
        synchronized (this.c) {
            try {
                jn.p("maybeDestroy: Lock acquired");
                int i = this.e;
                if (i < 0) {
                    throw new IllegalStateException();
                }
                if (this.d && i == 0) {
                    jn.p("No reference is left (including root). Cleaning up engine.");
                    m(new zf0(10), new ue0(18));
                } else {
                    jn.p("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jn.p("maybeDestroy: Lock released");
    }
}
