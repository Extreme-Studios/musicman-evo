package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cv extends rs0 {
    public final Throwable v;

    public cv(Throwable th) {
        super(13);
        this.v = th;
    }

    @Override // defpackage.rs0
    public final String toString() {
        return ec.i("FAILURE (", this.v.getMessage(), ")");
    }
}
