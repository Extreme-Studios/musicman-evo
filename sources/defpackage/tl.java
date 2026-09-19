package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tl {
    public final boolean a;

    public tl(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tl) && this.a == ((tl) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + 1169068184;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.a;
    }
}
