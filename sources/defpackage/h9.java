package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h9 extends i9 {
    public final Throwable a;

    public h9(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h9) {
            return jn.b(this.a, ((h9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.i9
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
