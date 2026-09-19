package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ne0 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(od0 od0Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        od0Var.u(bArr, 0, 10);
        od0Var.i();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }

    public final void b(me0 me0Var, long j, int i, int i2, int i3, le0 le0Var) {
        hn.N("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                c(me0Var, le0Var);
            }
        }
    }

    public final void c(me0 me0Var, le0 le0Var) {
        if (this.c > 0) {
            me0Var.c(this.d, this.e, this.f, this.g, le0Var);
            this.c = 0;
        }
    }
}
