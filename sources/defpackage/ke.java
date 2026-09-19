package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ke extends zh {
    public static final ke i;
    public pc h;

    static {
        int i2 = o30.c;
        int i3 = o30.d;
        long j = o30.e;
        String str = o30.a;
        ke keVar = new ke();
        keVar.h = new pc(i2, i3, j, str);
        i = keVar;
    }

    @Override // defpackage.lc
    public final void a(ic icVar, Runnable runnable) {
        this.h.b(runnable, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.lc
    public final String toString() {
        return "Dispatchers.Default";
    }
}
