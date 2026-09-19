package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ze extends RuntimeException {
    public final transient ic f;

    public ze(ic icVar) {
        this.f = icVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f.toString();
    }
}
