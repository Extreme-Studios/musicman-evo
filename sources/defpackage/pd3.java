package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pd3 implements oe2 {
    public final oe2 f;
    public final int g;
    public final me3 h;
    public final byte[] i;
    public int j;

    public pd3(oe2 oe2Var, int i, me3 me3Var) {
        hn.v(i > 0);
        this.f = oe2Var;
        this.g = i;
        this.h = me3Var;
        this.i = new byte[1];
        this.j = i;
    }

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.oe2
    public final void c(qp2 qp2Var) {
        qp2Var.getClass();
        this.f.c(qp2Var);
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) {
        int i3 = this.j;
        oe2 oe2Var = this.f;
        if (i3 == 0) {
            byte[] bArr2 = this.i;
            if (oe2Var.d(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int iD = oe2Var.d(bArr3, i6, i5);
                        if (iD != -1) {
                            i6 += iD;
                            i5 -= iD;
                        }
                    }
                    while (i4 > 0) {
                        int i7 = i4 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i4 = i7;
                    }
                    if (i4 > 0) {
                        cw1 cw1Var = new cw1(i4, bArr3);
                        me3 me3Var = this.h;
                        long jMax = !me3Var.l ? me3Var.i : Math.max(me3Var.m.y(true), me3Var.i);
                        int iB = cw1Var.B();
                        me0 me0Var = me3Var.k;
                        me0Var.getClass();
                        me0Var.a(cw1Var, iB, 0);
                        me0Var.c(jMax, 1, iB, 0, null);
                        me3Var.l = true;
                    }
                }
                i3 = this.g;
                this.j = i3;
            }
            return -1;
        }
        int iD2 = oe2Var.d(bArr, i, Math.min(i3, i2));
        if (iD2 != -1) {
            this.j -= iD2;
        }
        return iD2;
    }

    @Override // defpackage.oe2
    public final Map g() {
        return this.f.g();
    }

    @Override // defpackage.oe2
    public final Uri h() {
        return this.f.h();
    }

    @Override // defpackage.oe2
    public final void l() {
        throw new UnsupportedOperationException();
    }
}
