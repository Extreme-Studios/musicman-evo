package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p23 extends InputStream {
    public Iterator f;
    public ByteBuffer g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public byte[] l;
    public int m;
    public long n;

    public final boolean a() {
        ByteBuffer byteBuffer;
        Iterator it = this.f;
        do {
            this.i++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.g = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.j = this.g.position();
        if (this.g.hasArray()) {
            this.k = true;
            this.l = this.g.array();
            this.m = this.g.arrayOffset();
        } else {
            this.k = false;
            this.n = u33.n(this.g);
            this.l = null;
        }
        return true;
    }

    public final void b(int i) {
        int i2 = this.j + i;
        this.j = i2;
        if (i2 == this.g.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.i == this.h) {
            return -1;
        }
        int iLimit = this.g.limit();
        int i3 = this.j;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.k) {
            System.arraycopy(this.l, i3 + this.m, bArr, i, i2);
            b(i2);
            return i2;
        }
        int iPosition = this.g.position();
        this.g.position(this.j);
        this.g.get(bArr, i, i2);
        this.g.position(iPosition);
        b(i2);
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.i == this.h) {
            return -1;
        }
        if (this.k) {
            int i = this.l[this.j + this.m] & 255;
            b(1);
            return i;
        }
        int iX1 = u33.c.x1(((long) this.j) + this.n) & 255;
        b(1);
        return iX1;
    }
}
