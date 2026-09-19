package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class rx implements Serializable {
    public final Throwable f;

    public rx(Throwable th) {
        th.getClass();
        this.f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rx) {
            return jn.b(this.f, ((rx) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f + ')';
    }
}
