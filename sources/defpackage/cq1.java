package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cq1 {
    public final Object a;
    public mn0 b = new mn0(3);
    public boolean c;
    public boolean d;

    public cq1(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cq1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((cq1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
