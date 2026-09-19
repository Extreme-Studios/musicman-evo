package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class lc3 extends lt2 {
    public long i;
    public int j;
    public int k;

    @Override // defpackage.lt2
    public final void a() {
        super.a();
        this.j = 0;
    }

    public final int h() {
        return this.j;
    }

    public final boolean i() {
        return this.j > 0;
    }

    public final boolean j(lt2 lt2Var) {
        ByteBuffer byteBuffer;
        hn.v(!lt2Var.c(1073741824));
        hn.v(!lt2Var.c(268435456));
        hn.v(!lt2Var.c(4));
        if (i()) {
            if (this.j >= this.k) {
                return false;
            }
            ByteBuffer byteBuffer2 = lt2Var.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.j;
        this.j = i + 1;
        if (i == 0) {
            this.f = lt2Var.f;
            if (lt2Var.c(1)) {
                this.a = 1;
            }
        }
        ByteBuffer byteBuffer3 = lt2Var.d;
        if (byteBuffer3 != null) {
            d(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.i = lt2Var.f;
        return true;
    }
}
