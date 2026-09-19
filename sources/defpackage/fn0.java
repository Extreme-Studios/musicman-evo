package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class fn0 extends j63 {
    public int n;
    public Date o;
    public Date p;
    public long q;
    public long r;
    public double s;
    public float t;
    public n63 u;
    public long v;

    @Override // defpackage.j63
    public final void c(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.n = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.g) {
            d();
        }
        if (this.n == 1) {
            this.o = v51.s(s90.S(byteBuffer));
            this.p = v51.s(s90.S(byteBuffer));
            this.q = s90.x(byteBuffer);
            this.r = s90.S(byteBuffer);
        } else {
            this.o = v51.s(s90.x(byteBuffer));
            this.p = v51.s(s90.x(byteBuffer));
            this.q = s90.x(byteBuffer);
            this.r = s90.x(byteBuffer);
        }
        this.s = s90.V(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.t = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        s90.x(byteBuffer);
        s90.x(byteBuffer);
        this.u = new n63(s90.V(byteBuffer), s90.V(byteBuffer), s90.V(byteBuffer), s90.V(byteBuffer), s90.a0(byteBuffer), s90.a0(byteBuffer), s90.a0(byteBuffer), s90.V(byteBuffer), s90.V(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.v = s90.x(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.o + ";modificationTime=" + this.p + ";timescale=" + this.q + ";duration=" + this.r + ";rate=" + this.s + ";volume=" + this.t + ";matrix=" + this.u + ";nextTrackId=" + this.v + "]";
    }
}
