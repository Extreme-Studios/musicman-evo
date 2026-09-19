package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o50 extends UnsupportedOperationException {
    public final ei f;

    public o50(ei eiVar) {
        this.f = eiVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f));
    }
}
