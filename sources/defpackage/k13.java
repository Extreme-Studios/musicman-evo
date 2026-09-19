package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k13 extends l13 {
    public final int i;
    public final int j;

    public k13(byte[] bArr, int i, int i2) {
        super(bArr);
        n13.a(i, i + i2, bArr.length);
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.l13, defpackage.n13
    public final byte b(int i) {
        n13.q(i, this.j);
        return this.h[this.i + i];
    }

    @Override // defpackage.l13, defpackage.n13
    public final byte c(int i) {
        return this.h[this.i + i];
    }

    @Override // defpackage.l13, defpackage.n13
    public final int d() {
        return this.j;
    }

    @Override // defpackage.l13, defpackage.n13
    public final void f(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.h, this.i + i, bArr, i2, i3);
    }

    @Override // defpackage.l13
    public final int r() {
        return this.i;
    }
}
