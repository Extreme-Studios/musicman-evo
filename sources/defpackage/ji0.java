package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ji0 extends ii0 {
    public dg3 n;
    public int o;
    public boolean p;
    public zd0 q;
    public oc2 r;

    @Override // defpackage.ii0
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    @Override // defpackage.ii0
    public final long b(cw1 cw1Var) {
        byte b = cw1Var.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        dg3 dg3Var = this.n;
        dg3Var.getClass();
        boolean z = ((ph0[]) dg3Var.j)[(b >> 1) & (255 >>> (8 - dg3Var.f))].g;
        zd0 zd0Var = (zd0) dg3Var.g;
        int i = !z ? zd0Var.e : zd0Var.f;
        int i2 = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = cw1Var.a;
        int length = bArr.length;
        int i3 = cw1Var.c + 4;
        if (length < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
            cw1Var.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            cw1Var.C(i3);
        }
        long j = i2;
        byte[] bArr2 = cw1Var.a;
        int i4 = cw1Var.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x03eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x03ee  */
    /* JADX WARN: Type inference failed for: r1v53, types: [byte[], java.io.Serializable] */
    @Override // defpackage.ii0
    public final boolean c(cw1 cw1Var, long j, z61 z61Var) throws no0 {
        dg3 dg3Var;
        int i;
        if (this.n != null) {
            ((de3) z61Var.g).getClass();
            return false;
        }
        zd0 zd0Var = this.q;
        int i2 = 4;
        if (zd0Var != null) {
            oc2 oc2Var = this.r;
            if (oc2Var == null) {
                this.r = ej1.u(cw1Var, true, true);
            } else {
                int i3 = cw1Var.c;
                byte[] bArr = new byte[i3];
                System.arraycopy(cw1Var.a, 0, bArr, 0, i3);
                int i4 = zd0Var.a;
                int i5 = 5;
                ej1.D(5, cw1Var, false);
                int iK = cw1Var.K() + 1;
                byte[] bArr2 = cw1Var.a;
                oe0 oe0Var = new oe0();
                oe0Var.a = bArr2;
                oe0Var.b = bArr2.length;
                int i6 = 8;
                oe0Var.g(cw1Var.b * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = i6;
                    int i10 = 16;
                    if (i7 >= iK) {
                        zd0 zd0Var2 = zd0Var;
                        int i11 = 6;
                        int iD = oe0Var.d(6) + 1;
                        for (int i12 = 0; i12 < iD; i12++) {
                            if (oe0Var.d(16) != 0) {
                                throw no0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i13 = 1;
                        int iD2 = oe0Var.d(6) + 1;
                        int i14 = 0;
                        while (true) {
                            int i15 = 3;
                            if (i14 >= iD2) {
                                int iD3 = oe0Var.d(i11) + 1;
                                int i16 = 0;
                                while (i16 < iD3) {
                                    if (oe0Var.d(16) > 2) {
                                        throw no0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    oe0Var.g(24);
                                    oe0Var.g(24);
                                    oe0Var.g(24);
                                    int iD4 = oe0Var.d(i11) + 1;
                                    int i17 = 8;
                                    oe0Var.g(8);
                                    int[] iArr = new int[iD4];
                                    for (int i18 = 0; i18 < iD4; i18++) {
                                        iArr[i18] = ((oe0Var.c() ? oe0Var.d(5) : 0) * 8) + oe0Var.d(3);
                                    }
                                    int i19 = 0;
                                    while (i19 < iD4) {
                                        int i20 = 0;
                                        while (i20 < i17) {
                                            if ((iArr[i19] & (1 << i20)) != 0) {
                                                oe0Var.g(i17);
                                            }
                                            i20++;
                                            i17 = 8;
                                        }
                                        i19++;
                                        i17 = 8;
                                    }
                                    i16++;
                                    i11 = 6;
                                }
                                int iD5 = oe0Var.d(i11) + 1;
                                for (int i21 = 0; i21 < iD5; i21++) {
                                    int iD6 = oe0Var.d(16);
                                    if (iD6 != 0) {
                                        StringBuilder sb = new StringBuilder(g72.a(iD6, 41));
                                        sb.append("mapping type other than 0 not supported: ");
                                        sb.append(iD6);
                                        s90.Y("VorbisUtil", sb.toString());
                                    } else {
                                        int iD7 = oe0Var.c() ? oe0Var.d(4) + 1 : 1;
                                        if (oe0Var.c()) {
                                            int iD8 = oe0Var.d(8) + 1;
                                            for (int i22 = 0; i22 < iD8; i22++) {
                                                int i23 = i4 - 1;
                                                int i24 = i23;
                                                int i25 = 0;
                                                while (i24 > 0) {
                                                    i24 >>>= 1;
                                                    i25++;
                                                }
                                                oe0Var.g(i25);
                                                int i26 = 0;
                                                while (i23 > 0) {
                                                    i23 >>>= 1;
                                                    i26++;
                                                }
                                                oe0Var.g(i26);
                                            }
                                        }
                                        if (oe0Var.d(2) != 0) {
                                            throw no0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iD7 > 1) {
                                            for (int i27 = 0; i27 < i4; i27++) {
                                                oe0Var.g(4);
                                            }
                                        }
                                        for (int i28 = 0; i28 < iD7; i28++) {
                                            oe0Var.g(8);
                                            oe0Var.g(8);
                                            oe0Var.g(8);
                                        }
                                    }
                                }
                                int iD9 = oe0Var.d(6);
                                int i29 = iD9 + 1;
                                ph0[] ph0VarArr = new ph0[i29];
                                for (int i30 = 0; i30 < i29; i30++) {
                                    boolean zC = oe0Var.c();
                                    oe0Var.d(16);
                                    oe0Var.d(16);
                                    oe0Var.d(8);
                                    ph0VarArr[i30] = new ph0(1, zC);
                                }
                                if (!oe0Var.c()) {
                                    throw no0.a(null, "framing bit after modes not set as expected");
                                }
                                int i31 = 0;
                                while (iD9 > 0) {
                                    iD9 >>>= 1;
                                    i31++;
                                }
                                dg3Var = new dg3(zd0Var2, oc2Var, bArr, ph0VarArr, i31);
                                break;
                            }
                            int iD10 = oe0Var.d(i10);
                            if (iD10 == 0) {
                                int i32 = i9;
                                oe0Var.g(i32);
                                oe0Var.g(16);
                                oe0Var.g(16);
                                oe0Var.g(6);
                                oe0Var.g(i32);
                                int iD11 = oe0Var.d(4) + 1;
                                int i33 = 0;
                                while (i33 < iD11) {
                                    oe0Var.g(i32);
                                    i33++;
                                    i32 = 8;
                                }
                            } else {
                                if (iD10 != i13) {
                                    StringBuilder sb2 = new StringBuilder(g72.a(iD10, 41));
                                    sb2.append("floor type greater than 1 not decodable: ");
                                    sb2.append(iD10);
                                    throw no0.a(null, sb2.toString());
                                }
                                int iD12 = oe0Var.d(5);
                                int[] iArr2 = new int[iD12];
                                int i34 = -1;
                                for (int i35 = 0; i35 < iD12; i35++) {
                                    int iD13 = oe0Var.d(4);
                                    iArr2[i35] = iD13;
                                    if (iD13 > i34) {
                                        i34 = iD13;
                                    }
                                }
                                int i36 = i34 + 1;
                                int[] iArr3 = new int[i36];
                                int i37 = 0;
                                while (i37 < i36) {
                                    iArr3[i37] = oe0Var.d(i15) + 1;
                                    int iD14 = oe0Var.d(2);
                                    if (iD14 > 0) {
                                        i = i9;
                                        oe0Var.g(i);
                                    } else {
                                        i = i9;
                                    }
                                    int i38 = i36;
                                    int i39 = 0;
                                    for (int i40 = 1; i39 < (i40 << iD14); i40 = 1) {
                                        oe0Var.g(i);
                                        i39++;
                                        i = 8;
                                    }
                                    i37++;
                                    i36 = i38;
                                    i9 = 8;
                                    i15 = 3;
                                }
                                oe0Var.g(2);
                                int iD15 = oe0Var.d(4);
                                int i41 = 0;
                                int i42 = 0;
                                for (int i43 = 0; i43 < iD12; i43++) {
                                    i41 += iArr3[iArr2[i43]];
                                    while (i42 < i41) {
                                        oe0Var.g(iD15);
                                        i42++;
                                    }
                                }
                            }
                            i14++;
                            i9 = 8;
                            i11 = 6;
                            i13 = 1;
                            i10 = 16;
                        }
                    } else {
                        if (oe0Var.d(24) != 5653314) {
                            int i44 = (oe0Var.c * 8) + oe0Var.d;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i44).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(i44);
                            throw no0.a(null, sb3.toString());
                        }
                        int iD16 = oe0Var.d(16);
                        int iD17 = oe0Var.d(24);
                        if (oe0Var.c()) {
                            oe0Var.g(i5);
                            int iD18 = 0;
                            while (iD18 < iD17) {
                                int i45 = iD17 - iD18;
                                int i46 = 0;
                                while (i45 > 0) {
                                    i45 >>>= 1;
                                    i46++;
                                }
                                iD18 += oe0Var.d(i46);
                            }
                        } else {
                            boolean zC2 = oe0Var.c();
                            for (int i47 = 0; i47 < iD17; i47++) {
                                if (!zC2) {
                                    oe0Var.g(i5);
                                } else if (oe0Var.c()) {
                                    oe0Var.g(i5);
                                }
                            }
                        }
                        int iD19 = oe0Var.d(i2);
                        if (iD19 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iD19).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(iD19);
                            throw no0.a(null, sb4.toString());
                        }
                        if (iD19 != 1) {
                            if (iD19 != 2) {
                                zd0Var = zd0Var;
                            }
                            i7++;
                            i6 = i9;
                            zd0Var = zd0Var;
                            i2 = 4;
                            i5 = 5;
                        } else {
                            i8 = iD19;
                        }
                        oe0Var.g(32);
                        oe0Var.g(32);
                        int iD20 = oe0Var.d(i2) + 1;
                        oe0Var.g(1);
                        oe0Var.g((int) ((i8 == 1 ? iD16 != 0 ? (long) Math.floor(Math.pow(iD17, 1.0d / ((double) iD16))) : 0L : ((long) iD17) * ((long) iD16)) * ((long) iD20)));
                        i7++;
                        i6 = i9;
                        zd0Var = zd0Var;
                        i2 = 4;
                        i5 = 5;
                    }
                }
            }
            this.n = dg3Var;
            if (dg3Var == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zd0 zd0Var3 = (zd0) dg3Var.g;
            arrayList.add((byte[]) zd0Var3.g);
            arrayList.add((byte[]) dg3Var.i);
            am0 am0VarY = ej1.y(vj2.n((String[]) ((oc2) dg3Var.h).g));
            uc3 uc3Var = new uc3();
            uc3Var.d("audio/ogg");
            uc3Var.e("audio/vorbis");
            uc3Var.g = zd0Var3.d;
            uc3Var.h = zd0Var3.c;
            uc3Var.D = zd0Var3.a;
            uc3Var.E = zd0Var3.b;
            uc3Var.o = arrayList;
            uc3Var.j = am0VarY;
            z61Var.g = new de3(uc3Var);
            return true;
        }
        ej1.D(1, cw1Var, false);
        cw1Var.i();
        int iK2 = cw1Var.K();
        int i48 = cw1Var.i();
        int iC = cw1Var.c();
        if (iC <= 0) {
            iC = -1;
        }
        int iC2 = cw1Var.c();
        int i49 = iC2 <= 0 ? -1 : iC2;
        cw1Var.c();
        int iK3 = cw1Var.K();
        int iPow = (int) Math.pow(2.0d, iK3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iK3 & 240) >> 4);
        cw1Var.K();
        ?? CopyOf = Arrays.copyOf(cw1Var.a, cw1Var.c);
        zd0 zd0Var4 = new zd0();
        zd0Var4.a = iK2;
        zd0Var4.b = i48;
        zd0Var4.c = iC;
        zd0Var4.d = i49;
        zd0Var4.e = iPow;
        zd0Var4.f = iPow2;
        zd0Var4.g = CopyOf;
        this.q = zd0Var4;
        dg3Var = null;
        this.n = dg3Var;
        if (dg3Var == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zd0 zd0Var5 = (zd0) dg3Var.g;
        arrayList2.add((byte[]) zd0Var5.g);
        arrayList2.add((byte[]) dg3Var.i);
        am0 am0VarY2 = ej1.y(vj2.n((String[]) ((oc2) dg3Var.h).g));
        uc3 uc3Var2 = new uc3();
        uc3Var2.d("audio/ogg");
        uc3Var2.e("audio/vorbis");
        uc3Var2.g = zd0Var5.d;
        uc3Var2.h = zd0Var5.c;
        uc3Var2.D = zd0Var5.a;
        uc3Var2.E = zd0Var5.b;
        uc3Var2.o = arrayList2;
        uc3Var2.j = am0VarY2;
        z61Var.g = new de3(uc3Var2);
        return true;
    }

    @Override // defpackage.ii0
    public final void d(long j) {
        this.g = j;
        this.p = j != 0;
        zd0 zd0Var = this.q;
        this.o = zd0Var != null ? zd0Var.e : 0;
    }
}
