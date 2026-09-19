package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class j63 implements dn0 {
    public static final na1 m = na1.y(j63.class);
    public final String f;
    public ByteBuffer i;
    public long j;
    public lk l;
    public long k = -1;
    public boolean h = true;
    public boolean g = true;

    public j63(String str) {
        this.f = str;
    }

    @Override // defpackage.dn0
    public final void a(lk lkVar, ByteBuffer byteBuffer, long j, bn0 bn0Var) {
        this.j = lkVar.g();
        byteBuffer.remaining();
        this.k = j;
        this.l = lkVar;
        ((ByteBuffer) lkVar.g).position((int) (lkVar.g() + j));
        this.h = false;
        this.g = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.h) {
                return;
            }
            try {
                na1 na1Var = m;
                String str = this.f;
                na1Var.v(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                lk lkVar = this.l;
                long j = this.j;
                long j2 = this.k;
                ByteBuffer byteBuffer = (ByteBuffer) lkVar.g;
                int iPosition = byteBuffer.position();
                byteBuffer.position((int) j);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit((int) j2);
                byteBuffer.position(iPosition);
                this.i = byteBufferSlice;
                this.h = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            na1 na1Var = m;
            String str = this.f;
            na1Var.v(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.i;
            if (byteBuffer != null) {
                this.g = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.i = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
