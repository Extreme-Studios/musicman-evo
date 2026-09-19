package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class an0 extends ByteArrayOutputStream {
    public final um0 f;

    public an0(um0 um0Var, int i) {
        this.f = um0Var;
        ((ByteArrayOutputStream) this).buf = um0Var.o(Math.max(i, 256));
    }

    public final void a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        um0 um0Var = this.f;
        byte[] bArrO = um0Var.o(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrO, 0, ((ByteArrayOutputStream) this).count);
        um0Var.r(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrO;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.r(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f.r(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
