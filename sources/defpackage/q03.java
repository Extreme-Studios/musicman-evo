package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q03 extends o03 {
    public final x03 f = new x03();

    public final o03 d(String str) {
        return (o03) this.f.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof q03) && ((q03) obj).f.equals(this.f);
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
