package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y03 implements CharSequence {
    public char[] f;
    public String g;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.f, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.g == null) {
            this.g = new String(this.f);
        }
        return this.g;
    }
}
