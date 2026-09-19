package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yc1 implements oe2 {
    public final cc2 f;
    public final long g;
    public final oe2 h;
    public long i;
    public Uri j;

    public yc1(cc2 cc2Var, int i, oe2 oe2Var) {
        this.f = cc2Var;
        this.g = i;
        this.h = oe2Var;
    }

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) {
        eg2 eg2Var2;
        eg2 eg2Var3;
        Uri uri = eg2Var.a;
        long j = eg2Var.d;
        this.j = uri;
        long j2 = eg2Var.c;
        long j3 = this.g;
        if (j2 >= j3) {
            eg2Var2 = null;
        } else {
            long jMin = j3 - j2;
            if (j != -1) {
                jMin = Math.min(j, jMin);
            }
            eg2Var2 = new eg2(uri, j2, jMin);
        }
        if (j == -1 || j2 + j > j3) {
            eg2Var3 = new eg2(uri, Math.max(j3, j2), j != -1 ? Math.min(j, (j2 + j) - j3) : -1L);
        } else {
            eg2Var3 = null;
        }
        long jA = eg2Var2 != 0 ? this.f.a(eg2Var2) : 0L;
        long jA2 = eg2Var3 != null ? this.h.a(eg2Var3) : 0L;
        this.i = j2;
        if (jA == -1 || jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.i;
        long j2 = this.g;
        if (j < j2) {
            int iD = this.f.d(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.i + ((long) iD);
            this.i = j3;
            i3 = iD;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int iD2 = this.h.d(bArr, i + i3, i2 - i3);
        int i4 = i3 + iD2;
        this.i += (long) iD2;
        return i4;
    }

    @Override // defpackage.oe2
    public final Map g() {
        return vk2.l;
    }

    @Override // defpackage.oe2
    public final Uri h() {
        return this.j;
    }

    @Override // defpackage.oe2
    public final void l() {
        this.f.l();
        this.h.l();
    }

    @Override // defpackage.oe2
    public final void c(qp2 qp2Var) {
    }
}
