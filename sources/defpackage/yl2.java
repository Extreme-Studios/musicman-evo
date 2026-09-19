package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yl2 {
    public static final yl2 c;
    public static final yl2 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (nm2.k) {
            d = null;
            c = null;
        } else {
            d = new yl2(null, false);
            c = new yl2(null, true);
        }
    }

    public yl2(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
