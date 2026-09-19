package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yc0 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public yc0(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static yc0 a(cw1 cw1Var) throws no0 {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            cw1Var.G(4);
            int iK = (cw1Var.K() & 3) + 1;
            if (iK == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iK2 = cw1Var.K() & 31;
            for (int i9 = 0; i9 < iK2; i9++) {
                int iL = cw1Var.L();
                int i10 = cw1Var.b;
                cw1Var.G(iL);
                byte[] bArr = cw1Var.a;
                byte[] bArr2 = rl1.a;
                byte[] bArr3 = new byte[iL + 4];
                System.arraycopy(rl1.a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i10, bArr3, 4, iL);
                arrayList.add(bArr3);
            }
            int iK3 = cw1Var.K();
            for (int i11 = 0; i11 < iK3; i11++) {
                int iL2 = cw1Var.L();
                int i12 = cw1Var.b;
                cw1Var.G(iL2);
                byte[] bArr4 = cw1Var.a;
                byte[] bArr5 = rl1.a;
                byte[] bArr6 = new byte[iL2 + 4];
                System.arraycopy(rl1.a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i12, bArr6, 4, iL2);
                arrayList.add(bArr6);
            }
            if (iK2 > 0) {
                x62 x62VarT = ss0.T((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i13 = x62VarT.e;
                int i14 = x62VarT.f;
                int i15 = x62VarT.h + 8;
                int i16 = x62VarT.i + 8;
                int i17 = x62VarT.j;
                int i18 = x62VarT.k;
                int i19 = x62VarT.l;
                int i20 = x62VarT.m;
                float f2 = x62VarT.g;
                int i21 = x62VarT.a;
                int i22 = x62VarT.b;
                int i23 = x62VarT.c;
                byte[] bArr7 = rl1.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new yc0(arrayList, iK, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw no0.a(e, "Error parsing AVC config");
        }
    }
}
