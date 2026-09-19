package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class si0 implements me0 {
    public final me0 a;
    public final pi0 b;
    public qi0 g;
    public de3 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = qz1.b;
    public final cw1 c = new cw1();

    public si0(me0 me0Var, pi0 pi0Var) {
        this.a = me0Var;
        this.b = pi0Var;
    }

    @Override // defpackage.me0
    public final void a(cw1 cw1Var, int i, int i2) {
        if (this.g == null) {
            this.a.a(cw1Var, i, i2);
            return;
        }
        e(i);
        cw1Var.H(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.me0
    public final int b(k73 k73Var, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.b(k73Var, i, z);
        }
        e(i);
        int iD = k73Var.d(this.f, this.e, i);
        if (iD != -1) {
            this.e += iD;
            return iD;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.me0
    public final void c(long j, int i, int i2, int i3, le0 le0Var) {
        if (this.g == null) {
            this.a.c(j, i, i2, i3, le0Var);
            return;
        }
        hn.B("DRM on subtitles is not supported", le0Var == null);
        int i4 = (this.e - i3) - i2;
        try {
            this.g.s(this.f, i4, i2, new ri0(this, j, i));
        } catch (RuntimeException e) {
            if (!this.i) {
                throw e;
            }
            s90.T("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.d = i5;
        if (i5 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.me0
    public final void d(de3 de3Var) {
        String str = de3Var.m;
        str.getClass();
        hn.v(rn0.g(str) == 3);
        boolean zEquals = de3Var.equals(this.h);
        pi0 pi0Var = this.b;
        if (!zEquals) {
            this.h = de3Var;
            this.g = pi0Var.f(de3Var) ? pi0Var.m(de3Var) : null;
        }
        qi0 qi0Var = this.g;
        me0 me0Var = this.a;
        if (qi0Var == null) {
            me0Var.d(de3Var);
            return;
        }
        uc3 uc3Var = new uc3(de3Var);
        uc3Var.e("application/x-media3-cues");
        uc3Var.i = str;
        uc3Var.q = Long.MAX_VALUE;
        uc3Var.J = pi0Var.i(de3Var);
        me0Var.d(new de3(uc3Var));
    }

    public final void e(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
