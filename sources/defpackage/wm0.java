package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class wm0 extends FilterInputStream {
    public final /* synthetic */ int f = 0;
    public long g;
    public long h;

    public wm0(InputStream inputStream, long j) {
        super(inputStream);
        this.h = -1L;
        inputStream.getClass();
        hn.B("limit must be non-negative", j >= 0);
        this.g = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.g);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f) {
            case 1:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.h = this.g;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f) {
            case 0:
                int i3 = super.read(bArr, i, i2);
                if (i3 != -1) {
                    this.h += (long) i3;
                }
                return i3;
            default:
                long j = this.g;
                if (j == 0) {
                    return -1;
                }
                int i4 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (i4 != -1) {
                    this.g -= (long) i4;
                }
                return i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f) {
            case 1:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.h == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.g = this.h;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        switch (this.f) {
            case 1:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.g));
                this.g -= jSkip;
                return jSkip;
            default:
                return super.skip(j);
        }
    }

    public wm0(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.g = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f) {
            case 0:
                int i = super.read();
                if (i != -1) {
                    this.h++;
                }
                return i;
            default:
                if (this.g == 0) {
                    return -1;
                }
                int i2 = ((FilterInputStream) this).in.read();
                if (i2 != -1) {
                    this.g--;
                }
                return i2;
        }
    }
}
