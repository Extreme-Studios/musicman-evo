package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m13 extends OutputStream {
    public static final byte[] k = new byte[0];
    public int h;
    public int j;
    public final int f = 128;
    public final ArrayList g = new ArrayList();
    public byte[] i = new byte[128];

    public final synchronized n13 a() {
        try {
            int i = this.j;
            byte[] bArr = this.i;
            if (i >= bArr.length) {
                this.g.add(new l13(this.i));
                this.i = k;
            } else if (i > 0) {
                this.g.add(new l13(Arrays.copyOf(bArr, i)));
            }
            this.h += this.j;
            this.j = 0;
        } catch (Throwable th) {
            throw th;
        }
        return n13.o(this.g);
    }

    public final void b(int i) {
        this.g.add(new l13(this.i));
        int length = this.h + this.i.length;
        this.h = length;
        this.i = new byte[Math.max(this.f, Math.max(i, length >>> 1))];
        this.j = 0;
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.h + this.j;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.i;
        int length = bArr2.length;
        int i3 = this.j;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.j += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        b(i5);
        System.arraycopy(bArr, i + i4, this.i, 0, i5);
        this.j = i5;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.j == this.i.length) {
                b(1);
            }
            byte[] bArr = this.i;
            int i2 = this.j;
            this.j = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
