package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class ei0 {
    public final fi0 a = new fi0();
    public final cw1 b = new cw1(0, new byte[65025]);
    public int c = -1;
    public int d;
    public boolean e;

    public final boolean a(od0 od0Var) {
        int i;
        boolean z = this.e;
        cw1 cw1Var = this.b;
        if (z) {
            this.e = false;
            cw1Var.y(0);
        }
        while (true) {
            if (this.e) {
                return true;
            }
            int i2 = this.c;
            fi0 fi0Var = this.a;
            if (i2 < 0) {
                if (fi0Var.a(od0Var, -1L) && fi0Var.b(od0Var, true)) {
                    int iB = fi0Var.d;
                    if ((fi0Var.a & 1) == 1 && cw1Var.c == 0) {
                        iB += b(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        od0Var.t(iB);
                        this.c = i;
                        i2 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iB2 = b(i2);
            int i3 = this.c + this.d;
            if (iB2 > 0) {
                cw1Var.A(cw1Var.c + iB2);
                try {
                    od0Var.x(cw1Var.a, cw1Var.c, iB2);
                    cw1Var.C(cw1Var.c + iB2);
                    this.e = fi0Var.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == fi0Var.c) {
                i3 = -1;
            }
            this.c = i3;
        }
    }

    public final int b(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            fi0 fi0Var = this.a;
            if (i5 >= fi0Var.c) {
                break;
            }
            this.d = i4 + 1;
            i2 = fi0Var.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
