package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ci0 extends ii0 {
    public td0 n;
    public gh0 o;

    @Override // defpackage.ii0
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    @Override // defpackage.ii0
    public final long b(cw1 cw1Var) {
        byte[] bArr = cw1Var.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6) {
            cw1Var.G(4);
            cw1Var.o();
        } else if (i == 7) {
            i = 7;
            cw1Var.G(4);
            cw1Var.o();
        }
        int iO = ss0.O(i, cw1Var);
        cw1Var.E(0);
        return iO;
    }

    @Override // defpackage.ii0
    public final boolean c(cw1 cw1Var, long j, z61 z61Var) {
        byte[] bArr = cw1Var.a;
        td0 td0Var = this.n;
        if (td0Var == null) {
            td0 td0Var2 = new td0(17, bArr);
            this.n = td0Var2;
            uc3 uc3Var = new uc3(td0Var2.b(Arrays.copyOfRange(bArr, 9, cw1Var.c), null));
            uc3Var.d("audio/ogg");
            z61Var.g = new de3(uc3Var);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            gh0 gh0Var = this.o;
            if (gh0Var != null) {
                gh0Var.f = j;
                z61Var.h = gh0Var;
            }
            ((de3) z61Var.g).getClass();
            return false;
        }
        vg2 vg2VarD = v51.D(cw1Var);
        td0 td0Var3 = new td0(td0Var.a, td0Var.b, td0Var.c, td0Var.d, td0Var.e, td0Var.g, td0Var.h, td0Var.j, vg2VarD, td0Var.l);
        this.n = td0Var3;
        gh0 gh0Var2 = new gh0();
        gh0Var2.h = td0Var3;
        gh0Var2.i = vg2VarD;
        gh0Var2.f = -1L;
        gh0Var2.g = -1L;
        this.o = gh0Var2;
        return true;
    }
}
