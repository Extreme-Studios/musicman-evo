package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class id0 implements me0 {
    public final byte[] a = new byte[4096];

    @Override // defpackage.me0
    public final void a(cw1 cw1Var, int i, int i2) {
        cw1Var.G(i);
    }

    @Override // defpackage.me0
    public final int b(k73 k73Var, int i, boolean z) throws EOFException {
        int iD = k73Var.d(this.a, 0, Math.min(4096, i));
        if (iD != -1) {
            return iD;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.me0
    public final void d(de3 de3Var) {
    }

    @Override // defpackage.me0
    public final void c(long j, int i, int i2, int i3, le0 le0Var) {
    }
}
