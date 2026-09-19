package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class og0 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final tg0 c = new tg0(0);
    public dr0 d;
    public int e;
    public int f;
    public long g;

    public final long a(od0 od0Var, int i) {
        byte[] bArr = this.a;
        od0Var.x(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
