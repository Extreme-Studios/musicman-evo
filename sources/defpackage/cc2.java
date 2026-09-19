package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class cc2 extends za2 {
    public final bz1 j;
    public Uri k;
    public byte[] l;
    public int m;
    public int n;
    public boolean o;

    public cc2(byte[] bArr) {
        bz1 bz1Var = new bz1(bArr);
        super(false);
        this.j = bz1Var;
        hn.v(bArr.length > 0);
    }

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) throws ze2 {
        b(eg2Var);
        this.k = eg2Var.a;
        byte[] bArr = (byte[]) this.j.f;
        this.l = bArr;
        long j = eg2Var.c;
        int length = bArr.length;
        if (j > length) {
            throw new ze2();
        }
        int i = (int) j;
        this.m = i;
        int i2 = length - i;
        this.n = i2;
        long j2 = eg2Var.d;
        if (j2 != -1) {
            this.n = (int) Math.min(i2, j2);
        }
        this.o = true;
        e(eg2Var);
        return j2 != -1 ? j2 : this.n;
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.n;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.l;
        bArr2.getClass();
        System.arraycopy(bArr2, this.m, bArr, i, iMin);
        this.m += iMin;
        this.n -= iMin;
        f(iMin);
        return iMin;
    }

    @Override // defpackage.oe2
    public final Uri h() {
        return this.k;
    }

    @Override // defpackage.oe2
    public final void l() {
        if (this.o) {
            this.o = false;
            j();
        }
        this.k = null;
        this.l = null;
    }
}
