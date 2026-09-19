package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e30 implements Comparable {
    public final int f;
    public final int g;
    public final String h;
    public final String i;

    public e30(int i, int i2, String str, String str2) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e30 e30Var = (e30) obj;
        int i = this.f - e30Var.f;
        return i == 0 ? this.g - e30Var.g : i;
    }
}
