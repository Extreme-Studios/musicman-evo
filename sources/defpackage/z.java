package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public final Throwable a;

    static {
        new z(new l("Failure occurred while trying to finish a future.", 1));
    }

    public z(Throwable th) {
        boolean z = e0.i;
        th.getClass();
        this.a = th;
    }
}
