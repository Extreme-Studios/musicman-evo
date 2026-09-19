package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xd0 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final y91 o;

    public xd0(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, y91 y91Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = y91Var;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0253  */
    /* JADX WARN: Code duplicated, block: B:121:0x0293  */
    /* JADX WARN: Code duplicated, block: B:122:0x0296  */
    public static xd0 a(cw1 cw1Var, boolean z, y91 y91Var) {
        boolean z2;
        boolean z3;
        String str;
        char c;
        char c2;
        yp ypVar;
        int i;
        int i2;
        int i3 = 4;
        boolean z4 = true;
        if (z) {
            try {
                cw1Var.G(4);
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                z3 = true;
                if (z3 != z) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw no0.a(e, "Error parsing".concat(str));
            }
        } else {
            try {
                cw1Var.G(21);
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                z2 = z4;
                z3 = z2;
                if (z3 != z) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw no0.a(e, "Error parsing".concat(str));
            }
        }
        char c3 = 3;
        int iK = cw1Var.K() & 3;
        int iK2 = cw1Var.K();
        int i4 = cw1Var.b;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iK2; i7++) {
            cw1Var.G(1);
            int iL = cw1Var.L();
            for (int i8 = 0; i8 < iL; i8++) {
                int iL2 = cw1Var.L();
                i6 += iL2 + 4;
                cw1Var.G(iL2);
            }
        }
        cw1Var.E(i4);
        byte[] bArr = new byte[i6];
        y91 y91Var2 = y91Var;
        int i9 = 0;
        float f = 1.0f;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        String strA = null;
        int i20 = 0;
        while (i20 < iK2) {
            int iK3 = cw1Var.K() & 63;
            int iL3 = cw1Var.L();
            z2 = z4;
            int i21 = i5;
            y91 y91VarX = y91Var2;
            while (i21 < iL3) {
                try {
                    int iL4 = cw1Var.L();
                    System.arraycopy(ss0.m, i5, bArr, i9, i3);
                    int i22 = i9 + 4;
                    System.arraycopy(cw1Var.a, cw1Var.b, bArr, i22, iL4);
                    int i23 = 32;
                    if (iK3 == 32) {
                        if (i21 == 0) {
                            y91VarX = ss0.X(bArr, i22, i22 + iL4);
                            i2 = 0;
                            i = 0;
                        }
                        c = '?';
                        c2 = 3;
                        int i24 = i22 + iL4;
                        cw1Var.G(iL4);
                        i21 = i2 + 1;
                        c3 = c2;
                        i9 = i24;
                        i5 = i;
                        iK = iK;
                        i3 = 4;
                    } else {
                        i23 = iK3;
                    }
                    int i25 = i21;
                    if (i23 != 33) {
                        int i26 = 8;
                        if (i23 == 39 && i25 == 0) {
                            int i27 = i9 + 6;
                            int i28 = (i22 + iL4) - 1;
                            while (true) {
                                byte b = bArr[i28];
                                if (b != 0) {
                                    if (b == 0) {
                                        iK = iK;
                                        c = '?';
                                        c2 = 3;
                                        ypVar = null;
                                    } else if (i28 > i27) {
                                        oe0 oe0Var = new oe0(bArr, i27, i28 + 1);
                                        while (true) {
                                            if (oe0Var.h(16)) {
                                                int iK4 = oe0Var.k(i26);
                                                int i29 = 0;
                                                while (iK4 == 255) {
                                                    i29 += 255;
                                                    iK4 = oe0Var.k(8);
                                                }
                                                int i30 = i29 + iK4;
                                                int iK5 = oe0Var.k(8);
                                                iK = iK;
                                                int i31 = 0;
                                                while (iK5 == 255) {
                                                    i31 += 255;
                                                    iK5 = oe0Var.k(8);
                                                }
                                                i26 = 8;
                                                int i32 = i31 + iK5;
                                                if (i32 == 0) {
                                                    c = '?';
                                                    c2 = 3;
                                                    ypVar = null;
                                                } else if (!oe0Var.h(i32)) {
                                                    ypVar = null;
                                                    c = '?';
                                                    c2 = 3;
                                                } else if (i30 == 176) {
                                                    int iP = oe0Var.p();
                                                    boolean zJ = oe0Var.j();
                                                    int iP2 = zJ ? oe0Var.p() : 0;
                                                    int iP3 = oe0Var.p();
                                                    int i33 = -1;
                                                    int i34 = 0;
                                                    while (true) {
                                                        if (i34 <= iP3) {
                                                            int iP4 = oe0Var.p();
                                                            oe0Var.p();
                                                            int i35 = i34;
                                                            int iK6 = oe0Var.k(6);
                                                            if (iK6 == 63) {
                                                                c = '?';
                                                            } else {
                                                                oe0Var.k(iK6 == 0 ? Math.max(0, iP - 30) : Math.max(0, (iK6 + iP) - 31));
                                                                if (zJ) {
                                                                    int iK7 = oe0Var.k(6);
                                                                    if (iK7 == 63) {
                                                                        c = '?';
                                                                    } else {
                                                                        oe0Var.k(iK7 == 0 ? Math.max(0, iP2 - 30) : Math.max(0, (iK7 + iP2) - 31));
                                                                    }
                                                                }
                                                                if (oe0Var.j()) {
                                                                    oe0Var.e(10);
                                                                }
                                                                i34 = i35 + 1;
                                                                i33 = iP4;
                                                            }
                                                            ypVar = null;
                                                            c2 = 3;
                                                        } else {
                                                            c = '?';
                                                            c2 = 3;
                                                            ypVar = new yp(i33, 3);
                                                        }
                                                    }
                                                } else {
                                                    oe0Var.e(i32 * 8);
                                                    iK = iK;
                                                }
                                            } else {
                                                iK = iK;
                                                c = '?';
                                                c2 = 3;
                                                ypVar = null;
                                            }
                                        }
                                    }
                                    if (ypVar != null || y91VarX == null) {
                                        i = 0;
                                    } else {
                                        i = 0;
                                        if (ypVar.g == ((x22) ((vj2) y91VarX.g).get(0)).b) {
                                            i2 = i25;
                                            i18 = 4;
                                        } else {
                                            i18 = 5;
                                        }
                                        int i210 = i22 + iL4;
                                        cw1Var.G(iL4);
                                        i21 = i2 + 1;
                                        c3 = c2;
                                        i9 = i210;
                                        i5 = i;
                                        iK = iK;
                                        i3 = 4;
                                    }
                                } else if (i28 > i27) {
                                    i28--;
                                }
                                iK = iK;
                                ypVar = null;
                                c = '?';
                                c2 = 3;
                                if (ypVar != null) {
                                    i = 0;
                                } else {
                                    i = 0;
                                }
                                int i211 = i22 + iL4;
                                cw1Var.G(iL4);
                                i21 = i2 + 1;
                                c3 = c2;
                                i9 = i211;
                                i5 = i;
                                iK = iK;
                                i3 = 4;
                            }
                        }
                        i2 = i25;
                        int i212 = i22 + iL4;
                        cw1Var.G(iL4);
                        i21 = i2 + 1;
                        c3 = c2;
                        i9 = i212;
                        i5 = i;
                        iK = iK;
                        i3 = 4;
                    } else if (i25 == 0) {
                        c52 c52VarB0 = ss0.b0(bArr, i22, i22 + iL4, y91VarX);
                        int i36 = c52VarB0.a + 1;
                        int i37 = c52VarB0.g;
                        int i38 = c52VarB0.h;
                        int i39 = c52VarB0.c + 8;
                        int i40 = c52VarB0.d + 8;
                        int i41 = c52VarB0.k;
                        int i42 = c52VarB0.l;
                        int i43 = c52VarB0.m;
                        float f2 = c52VarB0.i;
                        int i44 = c52VarB0.j;
                        m32 m32Var = c52VarB0.b;
                        if (m32Var != null) {
                            strA = rl1.a(m32Var.a, m32Var.b, m32Var.c, m32Var.d, m32Var.e, m32Var.f);
                        }
                        f = f2;
                        i19 = i44;
                        i2 = i25;
                        i = 0;
                        i16 = i42;
                        i17 = i43;
                        i14 = i40;
                        i15 = i41;
                        i12 = i38;
                        i13 = i39;
                        i10 = i36;
                        i11 = i37;
                        c = '?';
                        c2 = 3;
                        int i213 = i22 + iL4;
                        cw1Var.G(iL4);
                        i21 = i2 + 1;
                        c3 = c2;
                        i9 = i213;
                        i5 = i;
                        iK = iK;
                        i3 = 4;
                    }
                    iK = iK;
                    i = 0;
                    c = '?';
                    c2 = 3;
                    i2 = i25;
                    int i214 = i22 + iL4;
                    cw1Var.G(iL4);
                    i21 = i2 + 1;
                    c3 = c2;
                    i9 = i214;
                    i5 = i;
                    iK = iK;
                    i3 = 4;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    e = e3;
                    z3 = z2;
                    if (z3 != z) {
                        str = "HEVC config";
                    } else {
                        str = "L-HEVC config";
                    }
                    throw no0.a(e, "Error parsing".concat(str));
                }
            }
            i20++;
            y91Var2 = y91VarX;
            z4 = z2;
            iK = iK;
            i3 = 4;
        }
        z2 = z4;
        return new xd0(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iK + 1, i10, i11, i12, i13, i14, i15, i16, i17, i18, f, i19, strA, y91Var2);
    }
}
