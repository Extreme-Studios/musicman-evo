package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final y b;
    public static final y c;
    public final Throwable a;

    static {
        if (e0.i) {
            c = null;
            b = null;
        } else {
            c = new y(null, false);
            b = new y(null, true);
        }
    }

    public y(Throwable th, boolean z) {
        this.a = th;
    }
}
