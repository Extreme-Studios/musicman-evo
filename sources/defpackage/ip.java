package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ip extends kp {
    public final qd a = qd.c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ip.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ip) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (ip.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
