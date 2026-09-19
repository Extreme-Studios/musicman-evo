package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wb implements qc {
    public final ic f;

    public wb(ic icVar) {
        this.f = icVar;
    }

    @Override // defpackage.qc
    public final ic a() {
        return this.f;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f + ')';
    }
}
