package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hi0 extends ii0 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(cw1 cw1Var, byte[] bArr) {
        if (cw1Var.B() < 8) {
            return false;
        }
        int i = cw1Var.b;
        byte[] bArr2 = new byte[8];
        cw1Var.H(bArr2, 0, 8);
        cw1Var.E(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.ii0
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // defpackage.ii0
    public final long b(cw1 cw1Var) {
        byte[] bArr = cw1Var.a;
        return (((long) this.i) * na1.H(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.ii0
    public final boolean c(cw1 cw1Var, long j, z61 z61Var) {
        if (e(cw1Var, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(cw1Var.a, cw1Var.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListS = na1.s(bArrCopyOf);
            if (((de3) z61Var.g) == null) {
                uc3 uc3Var = new uc3();
                uc3Var.d("audio/ogg");
                uc3Var.e("audio/opus");
                uc3Var.D = i;
                uc3Var.E = 48000;
                uc3Var.o = arrayListS;
                z61Var.g = new de3(uc3Var);
                return true;
            }
        } else {
            if (!e(cw1Var, p)) {
                ((de3) z61Var.g).getClass();
                return false;
            }
            ((de3) z61Var.g).getClass();
            if (!this.n) {
                this.n = true;
                cw1Var.G(8);
                am0 am0VarY = ej1.y(vj2.n((String[]) ej1.u(cw1Var, false, false).g));
                if (am0VarY != null) {
                    de3 de3Var = (de3) z61Var.g;
                    de3Var.getClass();
                    uc3 uc3Var2 = new uc3(de3Var);
                    uc3Var2.j = am0VarY.b(((de3) z61Var.g).k);
                    z61Var.g = new de3(uc3Var2);
                    return true;
                }
            }
        }
        return true;
    }
}
