package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ih0 implements hh0 {
    public int f;
    public int g;
    public int h;
    public int i;
    public Object j;

    @Override // defpackage.hh0
    public int a() {
        return this.f;
    }

    public long b() {
        int i = this.h;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.j;
        int i2 = this.f;
        long j = jArr[i2];
        this.f = this.i & (i2 + 1);
        this.h = i - 1;
        return j;
    }

    @Override // defpackage.hh0
    public int c() {
        return -1;
    }

    @Override // defpackage.hh0
    public int h() {
        cw1 cw1Var = (cw1) this.j;
        int i = this.g;
        if (i == 8) {
            return cw1Var.K();
        }
        if (i == 16) {
            return cw1Var.L();
        }
        int i2 = this.h;
        this.h = i2 + 1;
        if (i2 % 2 != 0) {
            return this.i & 15;
        }
        int iK = cw1Var.K();
        this.i = iK;
        return (iK & 240) >> 4;
    }
}
