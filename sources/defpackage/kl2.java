package defpackage;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class kl2 extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        hn.R(i, i2 + i, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }
}
