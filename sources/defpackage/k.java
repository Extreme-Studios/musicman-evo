package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final k c;
    public static final k d;
    public final boolean a;
    public final Throwable b;

    static {
        if (s.i) {
            d = null;
            c = null;
        } else {
            d = new k(null, false);
            c = new k(null, true);
        }
    }

    public k(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
