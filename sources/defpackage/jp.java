package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jp extends kp {
    public final qd a;

    public jp(qd qdVar) {
        this.a = qdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jp.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((jp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (jp.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
