package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class oh0 implements nd0 {
    public static final byte[] L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final de3 M;
    public nh0 A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public pd0 G;
    public me0[] H;
    public me0[] I;
    public boolean J;
    public long K;
    public final pi0 a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final cw1 i;
    public final ts2 n;
    public final zy1 o;
    public qk2 p;
    public int q;
    public int r;
    public long s;
    public int t;
    public cw1 u;
    public long v;
    public int w;
    public long x;
    public long y;
    public long z;
    public final us2 j = new us2(7);
    public final cw1 k = new cw1(16);
    public final cw1 e = new cw1(ss0.m);
    public final cw1 f = new cw1(6);
    public final cw1 g = new cw1();
    public final ArrayDeque l = new ArrayDeque();
    public final ArrayDeque m = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        uc3 uc3Var = new uc3();
        uc3Var.e("application/x-emsg");
        M = new de3(uc3Var);
    }

    public oh0(pi0 pi0Var, int i, qk2 qk2Var) {
        this.a = pi0Var;
        this.b = i;
        this.c = Collections.unmodifiableList(qk2Var);
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new cw1(bArr);
        tj2 tj2Var = vj2.g;
        this.p = qk2.j;
        this.y = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.G = pd0.d;
        this.H = new me0[0];
        this.I = new me0[0];
        this.n = new ts2(new oc2(9, this));
        this.o = new zy1(9);
        this.K = -1L;
    }

    public static void h(int i) throws no0 {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw no0.a(null, sb.toString());
    }

    public static void i(cw1 cw1Var, int i, yh0 yh0Var) throws no0 {
        cw1Var.E(i + 8);
        int iB = cw1Var.b();
        byte[] bArr = jh0.a;
        if ((iB & 1) != 0) {
            throw no0.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iB & 2) != 0;
        int iH = cw1Var.h();
        if (iH == 0) {
            Arrays.fill(yh0Var.l, 0, yh0Var.e, false);
            return;
        }
        int i2 = yh0Var.e;
        cw1 cw1Var2 = yh0Var.n;
        if (iH != i2) {
            throw no0.a(null, ec.l(new StringBuilder(String.valueOf(iH).length() + 58 + String.valueOf(i2).length()), "Senc sample count ", iH, " is different from fragment sample count", i2));
        }
        Arrays.fill(yh0Var.l, 0, iH, z);
        cw1Var2.y(cw1Var.B());
        yh0Var.k = true;
        yh0Var.o = true;
        cw1Var.H(cw1Var2.a, 0, cw1Var2.c);
        cw1Var2.E(0);
        yh0Var.o = false;
    }

    public static Pair j(long j, cw1 cw1Var) throws no0 {
        long j2;
        long j3;
        cw1 cw1Var2 = cw1Var;
        cw1Var2.E(8);
        int iA = jh0.a(cw1Var2.b());
        cw1Var2.G(4);
        long jP = cw1Var2.P();
        if (iA == 0) {
            j2 = cw1Var2.P();
            j3 = cw1Var2.P();
        } else {
            j2 = cw1Var2.j();
            j3 = cw1Var2.j();
        }
        long j4 = j3 + j;
        long jT = qz1.t(j2, 1000000L, jP, RoundingMode.DOWN);
        cw1Var2.G(2);
        int iL = cw1Var2.L();
        int[] iArr = new int[iL];
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        long[] jArr3 = new long[iL];
        long j5 = j4;
        long j6 = jT;
        int i = 0;
        while (i < iL) {
            int iB = cw1Var2.b();
            if ((Integer.MIN_VALUE & iB) != 0) {
                throw no0.a(null, "Unhandled indirect reference");
            }
            long jP2 = cw1Var2.P();
            iArr[i] = iB & Integer.MAX_VALUE;
            jArr[i] = j5;
            jArr3[i] = j6;
            j2 += jP2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jT2 = qz1.t(j2, 1000000L, jP, RoundingMode.DOWN);
            jArr4[i] = jT2 - jArr5[i];
            cw1Var2.G(4);
            j5 += (long) iArr[i];
            i++;
            iL = iL;
            cw1Var2 = cw1Var;
            j6 = jT2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jT), new ed0(iArr, jArr, jArr2, jArr3));
    }

    public static va3 k(List list) {
        int i;
        UUID uuid;
        zx zxVar;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            l12 l12Var = (l12) list.get(i2);
            if (l12Var.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = l12Var.c.a;
                cw1 cw1Var = new cw1(bArr);
                if (cw1Var.c < 32) {
                    i = i2;
                    zxVar = null;
                    uuid = null;
                } else {
                    cw1Var.E(0);
                    int iB = cw1Var.B();
                    int iB2 = cw1Var.b();
                    if (iB2 != iB) {
                        s90.Q("PsshAtomUtil", ec.l(new StringBuilder(String.valueOf(iB2).length() + 52 + String.valueOf(iB).length()), "Advertised atom size (", iB2, ") does not match buffer size: ", iB));
                    } else {
                        int iB3 = cw1Var.b();
                        if (iB3 != 1886614376) {
                            ec.u(new StringBuilder(String.valueOf(iB3).length() + 23), "Atom type is not pssh: ", iB3, "PsshAtomUtil");
                        } else {
                            int iA = jh0.a(cw1Var.b());
                            if (iA > 1) {
                                ec.u(new StringBuilder(String.valueOf(iA).length() + 26), "Unsupported pssh version: ", iA, "PsshAtomUtil");
                            } else {
                                UUID uuid2 = new UUID(cw1Var.d(), cw1Var.d());
                                if (iA == 1) {
                                    int iH = cw1Var.h();
                                    UUID[] uuidArr = new UUID[iH];
                                    int i3 = 0;
                                    while (i3 < iH) {
                                        uuidArr[i3] = new UUID(cw1Var.d(), cw1Var.d());
                                        i3++;
                                        i2 = i2;
                                    }
                                }
                                i = i2;
                                uuid = null;
                                int iH2 = cw1Var.h();
                                int iB4 = cw1Var.B();
                                if (iH2 != iB4) {
                                    s90.Q("PsshAtomUtil", ec.l(new StringBuilder(String.valueOf(iH2).length() + 49 + String.valueOf(iB4).length()), "Atom data size (", iH2, ") does not match the bytes left: ", iB4));
                                    zxVar = null;
                                } else {
                                    cw1Var.H(new byte[iH2], 0, iH2);
                                    zxVar = new zx(11, uuid2);
                                }
                            }
                        }
                    }
                    i = i2;
                    zxVar = null;
                    uuid = null;
                }
                UUID uuid3 = zxVar == null ? uuid : (UUID) zxVar.g;
                if (uuid3 == null) {
                    s90.Q("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new ia3(uuid3, "video/mp4", bArr));
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new va3(null, false, (ia3[]) arrayList.toArray(new ia3[0]));
    }

    public final void a() {
        this.q = 0;
        this.t = 0;
    }

    public final void b(long j) throws no0 {
        am0 am0Var;
        int i;
        long j2;
        kh0 kh0Var;
        int i2;
        kh0 kh0Var2;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        int i7;
        boolean z;
        int i8;
        int iB;
        long[] jArr;
        long[] jArr2;
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty() || ((i12) arrayDeque.peek()).c != j) {
                break;
            }
            i12 i12Var = (i12) arrayDeque.pop();
            int i9 = i12Var.b;
            ArrayList arrayList3 = i12Var.d;
            SparseArray sparseArray = this.d;
            int i10 = 12;
            int i11 = 8;
            if (i9 == 1836019574) {
                va3 va3VarK = k(arrayList3);
                i12 i12VarC = i12Var.c(1836475768);
                i12VarC.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList4 = i12VarC.d;
                int size = arrayList4.size();
                int i12 = 0;
                long jP = -9223372036854775807L;
                while (i12 < size) {
                    l12 l12Var = (l12) arrayList4.get(i12);
                    int i13 = l12Var.b;
                    cw1 cw1Var = l12Var.c;
                    if (i13 == 1953654136) {
                        cw1Var.E(i10);
                        Pair pairCreate = Pair.create(Integer.valueOf(cw1Var.b()), new kh0(cw1Var.b() - 1, cw1Var.b(), cw1Var.b(), cw1Var.b()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (kh0) pairCreate.second);
                    } else if (i13 == 1835362404) {
                        cw1Var.E(8);
                        jP = jh0.a(cw1Var.b()) == 0 ? cw1Var.P() : cw1Var.j();
                    }
                    i12++;
                    i10 = 12;
                }
                int i14 = -1;
                i12 i12VarC2 = i12Var.c(1835365473);
                am0 am0VarE = i12VarC2 != null ? jh0.e(i12VarC2) : null;
                wd0 wd0Var = new wd0();
                l12 l12VarB = i12Var.b(1969517665);
                if (l12VarB != null) {
                    am0 am0VarC = jh0.c(l12VarB);
                    wd0Var.a(am0VarC);
                    am0Var = am0VarC;
                } else {
                    am0Var = null;
                }
                l12 l12VarB2 = i12Var.b(1836476516);
                l12VarB2.getClass();
                am0 am0Var2 = new am0(jh0.d(l12VarB2.c));
                ArrayList arrayListB = jh0.b(i12Var, wd0Var, jP, va3VarK, false, false, new lh0(0));
                int size2 = arrayListB.size();
                if (sparseArray.size() == 0) {
                    String strN = jn.n(arrayListB);
                    int i15 = 0;
                    while (i15 < size2) {
                        zh0 zh0Var = (zh0) arrayListB.get(i15);
                        wh0 wh0Var = zh0Var.a;
                        pd0 pd0Var = this.G;
                        int i16 = wh0Var.b;
                        me0 me0VarZ = pd0Var.z(i15, i16);
                        int i17 = i15;
                        long j3 = wh0Var.e;
                        de3 de3Var = wh0Var.g;
                        ArrayList arrayList5 = arrayListB;
                        uc3 uc3Var = new uc3(de3Var);
                        uc3Var.d(strN);
                        String str = strN;
                        if (i16 == 1) {
                            int i18 = wd0Var.a;
                            i = size2;
                            int i19 = i14;
                            j2 = j3;
                            if (i18 != i19 && (i2 = wd0Var.b) != i19) {
                                uc3Var.G = i18;
                                uc3Var.H = i2;
                            }
                        } else {
                            i = size2;
                            j2 = j3;
                        }
                        hn.t(i16, am0VarE, uc3Var, de3Var.k, am0Var, am0Var2);
                        int i20 = wh0Var.a;
                        if (sparseArray2.size() == 1) {
                            kh0Var = (kh0) sparseArray2.valueAt(0);
                        } else {
                            kh0Var = (kh0) sparseArray2.get(i20);
                            kh0Var.getClass();
                        }
                        sparseArray.put(i20, new nh0(me0VarZ, zh0Var, kh0Var, new de3(uc3Var)));
                        this.y = Math.max(this.y, j2);
                        i15 = i17 + 1;
                        arrayListB = arrayList5;
                        strN = str;
                        size2 = i;
                        i14 = -1;
                    }
                    this.G.s();
                } else {
                    ArrayList arrayList6 = arrayListB;
                    hn.M(sparseArray.size() == size2);
                    int i21 = 0;
                    while (i21 < size2) {
                        ArrayList arrayList7 = arrayList6;
                        zh0 zh0Var2 = (zh0) arrayList7.get(i21);
                        int i22 = zh0Var2.a.a;
                        nh0 nh0Var = (nh0) sparseArray.get(i22);
                        if (sparseArray2.size() == 1) {
                            kh0Var2 = (kh0) sparseArray2.valueAt(0);
                        } else {
                            kh0Var2 = (kh0) sparseArray2.get(i22);
                            kh0Var2.getClass();
                        }
                        nh0Var.d = zh0Var2;
                        nh0Var.e = kh0Var2;
                        nh0Var.a.d(nh0Var.j);
                        nh0Var.a();
                        i21++;
                        arrayList6 = arrayList7;
                    }
                }
            } else if (i9 == 1836019558) {
                ArrayList arrayList8 = i12Var.e;
                int size3 = arrayList8.size();
                int i23 = 0;
                while (i23 < size3) {
                    i12 i12Var2 = (i12) arrayList8.get(i23);
                    if (i12Var2.b == 1953653094) {
                        l12 l12VarB3 = i12Var2.b(1952868452);
                        l12VarB3.getClass();
                        cw1 cw1Var2 = l12VarB3.c;
                        cw1Var2.E(i11);
                        int iB2 = cw1Var2.b();
                        byte[] bArr2 = jh0.a;
                        nh0 nh0Var2 = (nh0) sparseArray.get(cw1Var2.b());
                        if (nh0Var2 == null) {
                            nh0Var2 = null;
                        } else {
                            yh0 yh0Var = nh0Var2.b;
                            if ((iB2 & 1) != 0) {
                                long j4 = cw1Var2.j();
                                yh0Var.b = j4;
                                yh0Var.c = j4;
                            }
                            kh0 kh0Var3 = nh0Var2.e;
                            yh0Var.a = new kh0((iB2 & 2) != 0 ? cw1Var2.b() - 1 : kh0Var3.a, (iB2 & 8) != 0 ? cw1Var2.b() : kh0Var3.b, (iB2 & 16) != 0 ? cw1Var2.b() : kh0Var3.c, (iB2 & 32) != 0 ? cw1Var2.b() : kh0Var3.d);
                        }
                        if (nh0Var2 == null) {
                            arrayList = arrayList8;
                            i3 = size3;
                            arrayList2 = arrayList3;
                            i4 = i23;
                            i5 = i11;
                        } else {
                            yh0 yh0Var2 = nh0Var2.b;
                            long j5 = yh0Var2.p;
                            boolean z2 = yh0Var2.q;
                            nh0Var2.a();
                            nh0Var2.m = true;
                            l12 l12VarB4 = i12Var2.b(1952867444);
                            if (l12VarB4 != null) {
                                cw1 cw1Var3 = l12VarB4.c;
                                cw1Var3.E(i11);
                                yh0Var2.p = jh0.a(cw1Var3.b()) == 1 ? cw1Var3.j() : cw1Var3.P();
                                yh0Var2.q = true;
                            } else {
                                yh0Var2.p = j5;
                                yh0Var2.q = z2;
                            }
                            ArrayList arrayList9 = i12Var2.d;
                            int size4 = arrayList9.size();
                            int i24 = 0;
                            int i25 = 0;
                            int i26 = 0;
                            while (true) {
                                i6 = 1953658222;
                                if (i24 >= size4) {
                                    break;
                                }
                                l12 l12Var2 = (l12) arrayList9.get(i24);
                                ArrayList arrayList10 = arrayList8;
                                if (l12Var2.b == 1953658222) {
                                    cw1 cw1Var4 = l12Var2.c;
                                    cw1Var4.E(12);
                                    int iH = cw1Var4.h();
                                    if (iH > 0) {
                                        i26 += iH;
                                        i25++;
                                    }
                                }
                                i24++;
                                arrayList8 = arrayList10;
                            }
                            arrayList = arrayList8;
                            nh0Var2.h = 0;
                            nh0Var2.g = 0;
                            nh0Var2.f = 0;
                            yh0Var2.d = i25;
                            yh0Var2.e = i26;
                            if (yh0Var2.g.length < i25) {
                                yh0Var2.f = new long[i25];
                                yh0Var2.g = new int[i25];
                            }
                            if (yh0Var2.h.length < i26) {
                                int i27 = (i26 * 125) / 100;
                                yh0Var2.h = new int[i27];
                                yh0Var2.i = new long[i27];
                                yh0Var2.j = new boolean[i27];
                                yh0Var2.l = new boolean[i27];
                            }
                            int i28 = 0;
                            int i29 = 0;
                            int i30 = 0;
                            while (true) {
                                long j6 = 0;
                                if (i28 >= size4) {
                                    break;
                                }
                                l12 l12Var3 = (l12) arrayList9.get(i28);
                                if (l12Var3.b == i6) {
                                    int i31 = i29 + 1;
                                    cw1 cw1Var5 = l12Var3.c;
                                    cw1Var5.E(8);
                                    int iB3 = cw1Var5.b();
                                    wh0 wh0Var2 = nh0Var2.d.a;
                                    kh0 kh0Var4 = yh0Var2.a;
                                    String str2 = qz1.a;
                                    yh0Var2.g[i29] = cw1Var5.h();
                                    long[] jArr3 = yh0Var2.f;
                                    long j7 = yh0Var2.b;
                                    jArr3[i29] = j7;
                                    if ((iB3 & 1) != 0) {
                                        jArr3[i29] = j7 + ((long) cw1Var5.b());
                                    }
                                    boolean z3 = (iB3 & 4) != 0;
                                    int i32 = kh0Var4.d;
                                    int iB4 = z3 ? cw1Var5.b() : i32;
                                    boolean z4 = z3;
                                    int i33 = iB3 & 256;
                                    int i34 = iB3 & 512;
                                    int i35 = iB3 & 1024;
                                    int i36 = iB3 & 2048;
                                    long[] jArr4 = wh0Var2.i;
                                    if (jArr4 != null) {
                                        i8 = i32;
                                        if (jArr4.length == 1 && (jArr = wh0Var2.j) != null) {
                                            long j8 = jArr4[0];
                                            if (j8 == 0) {
                                                jArr2 = jArr;
                                            } else {
                                                jArr2 = jArr;
                                                long j9 = wh0Var2.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                                if (qz1.t(j8, 1000000L, j9, roundingMode) + qz1.t(jArr2[0], 1000000L, wh0Var2.c, roundingMode) >= wh0Var2.e) {
                                                }
                                            }
                                            j6 = jArr2[0];
                                        }
                                    } else {
                                        i8 = i32;
                                    }
                                    int[] iArr = yh0Var2.h;
                                    long[] jArr5 = yh0Var2.i;
                                    boolean[] zArr = yh0Var2.j;
                                    int i37 = yh0Var2.g[i29] + i30;
                                    long j10 = wh0Var2.c;
                                    long j11 = yh0Var2.p;
                                    while (i30 < i37) {
                                        int iB5 = i33 != 0 ? cw1Var5.b() : kh0Var4.b;
                                        h(iB5);
                                        int iB6 = i34 != 0 ? cw1Var5.b() : kh0Var4.c;
                                        h(iB6);
                                        if (i35 != 0) {
                                            iB = cw1Var5.b();
                                        } else if (i30 != 0) {
                                            iB = i8;
                                        } else if (z4) {
                                            iB = iB4;
                                            i30 = 0;
                                        } else {
                                            i30 = 0;
                                            iB = i8;
                                        }
                                        int i38 = iB6;
                                        long[] jArr6 = jArr5;
                                        long jT = qz1.t((((long) (i36 != 0 ? cw1Var5.b() : 0)) + j11) - j6, 1000000L, j10, RoundingMode.DOWN);
                                        jArr6[i30] = jT;
                                        if (!yh0Var2.q) {
                                            jArr6[i30] = jT + nh0Var2.d.h;
                                        }
                                        iArr[i30] = i38;
                                        zArr[i30] = ((iB >> 16) & 1) == 0;
                                        j11 += (long) iB5;
                                        i30++;
                                        i37 = i37;
                                        kh0Var4 = kh0Var4;
                                        jArr5 = jArr6;
                                    }
                                    yh0Var2.p = j11;
                                    i29 = i31;
                                    i30 = i37;
                                }
                                i28++;
                                size3 = size3;
                                arrayList3 = arrayList3;
                                i23 = i23;
                                size4 = size4;
                                i6 = 1953658222;
                            }
                            i3 = size3;
                            arrayList2 = arrayList3;
                            i4 = i23;
                            wh0 wh0Var3 = nh0Var2.d.a;
                            kh0 kh0Var5 = yh0Var2.a;
                            kh0Var5.getClass();
                            xh0 xh0Var = wh0Var3.l[kh0Var5.a];
                            l12 l12VarB5 = i12Var2.b(1935763834);
                            if (l12VarB5 != null) {
                                xh0Var.getClass();
                                int i39 = xh0Var.d;
                                cw1 cw1Var6 = l12VarB5.c;
                                cw1Var6.E(8);
                                if ((cw1Var6.b() & 1) == 1) {
                                    cw1Var6.G(8);
                                }
                                int iK = cw1Var6.K();
                                int iH2 = cw1Var6.h();
                                int i40 = yh0Var2.e;
                                if (iH2 > i40) {
                                    throw no0.a(null, ec.l(new StringBuilder(String.valueOf(iH2).length() + 56 + String.valueOf(i40).length()), "Saiz sample count ", iH2, " is greater than fragment sample count", i40));
                                }
                                if (iK == 0) {
                                    boolean[] zArr2 = yh0Var2.l;
                                    i7 = 0;
                                    for (int i41 = 0; i41 < iH2; i41++) {
                                        int iK2 = cw1Var6.K();
                                        i7 += iK2;
                                        zArr2[i41] = iK2 > i39;
                                    }
                                    z = false;
                                } else {
                                    boolean z5 = iK > i39;
                                    i7 = iK * iH2;
                                    z = false;
                                    Arrays.fill(yh0Var2.l, 0, iH2, z5);
                                }
                                Arrays.fill(yh0Var2.l, iH2, yh0Var2.e, z);
                                if (i7 > 0) {
                                    yh0Var2.n.y(i7);
                                    yh0Var2.k = true;
                                    yh0Var2.o = true;
                                }
                            }
                            l12 l12VarB6 = i12Var2.b(1935763823);
                            if (l12VarB6 != null) {
                                cw1 cw1Var7 = l12VarB6.c;
                                cw1Var7.E(8);
                                int iB7 = cw1Var7.b();
                                if ((iB7 & 1) == 1) {
                                    cw1Var7.G(8);
                                }
                                int iH3 = cw1Var7.h();
                                if (iH3 != 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(iH3).length() + 29);
                                    sb.append("Unexpected saio entry count: ");
                                    sb.append(iH3);
                                    throw no0.a(null, sb.toString());
                                }
                                yh0Var2.c += jh0.a(iB7) == 0 ? cw1Var7.P() : cw1Var7.j();
                            }
                            l12 l12VarB7 = i12Var2.b(1936027235);
                            if (l12VarB7 != null) {
                                i(l12VarB7.c, 0, yh0Var2);
                            }
                            String str3 = xh0Var != null ? xh0Var.b : null;
                            cw1 cw1Var8 = null;
                            cw1 cw1Var9 = null;
                            for (int i42 = 0; i42 < arrayList9.size(); i42++) {
                                l12 l12Var4 = (l12) arrayList9.get(i42);
                                cw1 cw1Var10 = l12Var4.c;
                                int i43 = l12Var4.b;
                                if (i43 == 1935828848) {
                                    cw1Var10.E(12);
                                    if (cw1Var10.b() == 1936025959) {
                                        cw1Var8 = cw1Var10;
                                    }
                                } else if (i43 == 1936158820) {
                                    cw1Var10.E(12);
                                    if (cw1Var10.b() == 1936025959) {
                                        cw1Var9 = cw1Var10;
                                    }
                                }
                            }
                            if (cw1Var8 != null && cw1Var9 != null) {
                                cw1Var8.E(8);
                                int iA = jh0.a(cw1Var8.b());
                                cw1Var8.G(4);
                                if (iA == 1) {
                                    cw1Var8.G(4);
                                }
                                if (cw1Var8.b() != 1) {
                                    throw no0.b("Entry count in sbgp != 1 (unsupported).");
                                }
                                cw1Var9.E(8);
                                int iA2 = jh0.a(cw1Var9.b());
                                cw1Var9.G(4);
                                if (iA2 == 1) {
                                    if (cw1Var9.P() == 0) {
                                        throw no0.b("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (iA2 >= 2) {
                                    cw1Var9.G(4);
                                }
                                if (cw1Var9.P() != 1) {
                                    throw no0.b("Entry count in sgpd != 1 (unsupported).");
                                }
                                cw1Var9.G(1);
                                int iK3 = cw1Var9.K();
                                int i44 = (iK3 & 240) >> 4;
                                int i45 = iK3 & 15;
                                if (cw1Var9.K() == 1) {
                                    int iK4 = cw1Var9.K();
                                    byte[] bArr3 = new byte[16];
                                    cw1Var9.H(bArr3, 0, 16);
                                    if (iK4 == 0) {
                                        int iK5 = cw1Var9.K();
                                        byte[] bArr4 = new byte[iK5];
                                        cw1Var9.H(bArr4, 0, iK5);
                                        bArr = bArr4;
                                    } else {
                                        bArr = null;
                                    }
                                    yh0Var2.k = true;
                                    yh0Var2.m = new xh0(true, str3, iK4, bArr3, i44, i45, bArr);
                                }
                            }
                            int size5 = arrayList9.size();
                            for (int i46 = 0; i46 < size5; i46++) {
                                l12 l12Var5 = (l12) arrayList9.get(i46);
                                if (l12Var5.b == 1970628964) {
                                    cw1 cw1Var11 = l12Var5.c;
                                    cw1Var11.E(8);
                                    byte[] bArr5 = this.h;
                                    cw1Var11.H(bArr5, 0, 16);
                                    if (Arrays.equals(bArr5, L)) {
                                        i(cw1Var11, 16, yh0Var2);
                                    }
                                }
                            }
                            i5 = 8;
                        }
                    } else {
                        arrayList = arrayList8;
                        i3 = size3;
                        arrayList2 = arrayList3;
                        i4 = i23;
                        i5 = i11;
                    }
                    i23 = i4 + 1;
                    i11 = i5;
                    arrayList8 = arrayList;
                    size3 = i3;
                    arrayList3 = arrayList2;
                }
                va3 va3VarK2 = k(arrayList3);
                if (va3VarK2 != null) {
                    int size6 = sparseArray.size();
                    for (int i47 = 0; i47 < size6; i47++) {
                        nh0 nh0Var3 = (nh0) sparseArray.valueAt(i47);
                        wh0 wh0Var4 = nh0Var3.d.a;
                        kh0 kh0Var6 = nh0Var3.b.a;
                        String str4 = qz1.a;
                        xh0 xh0Var2 = wh0Var4.l[kh0Var6.a];
                        va3 va3VarA = va3VarK2.a(xh0Var2 != null ? xh0Var2.b : null);
                        uc3 uc3Var2 = new uc3(nh0Var3.j);
                        uc3Var2.p = va3VarA;
                        nh0Var3.a.d(new de3(uc3Var2));
                    }
                }
                if (this.x != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i48 = 0; i48 < size7; i48++) {
                        nh0 nh0Var4 = (nh0) sparseArray.valueAt(i48);
                        long j12 = this.x;
                        int i49 = nh0Var4.f;
                        while (true) {
                            yh0 yh0Var3 = nh0Var4.b;
                            if (i49 >= yh0Var3.e || yh0Var3.i[i49] > j12) {
                                break;
                            }
                            if (yh0Var3.j[i49]) {
                                nh0Var4.i = i49;
                            }
                            i49++;
                        }
                    }
                    this.x = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((i12) arrayDeque.peek()).e.add(i12Var);
            }
        }
        a();
    }

    @Override // defpackage.nd0
    public final /* synthetic */ List c() {
        return this.p;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) {
        qk2 qk2VarI;
        ie0 ie0VarC = v51.C(od0Var, true, false);
        if (ie0VarC != null) {
            qk2VarI = vj2.i(ie0VarC);
        } else {
            tj2 tj2Var = vj2.g;
            qk2VarI = qk2.j;
        }
        this.p = qk2VarI;
        return ie0VarC == null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:105:0x0203  */
    /* JADX WARN: Code duplicated, block: B:125:0x0257  */
    /* JADX WARN: Code duplicated, block: B:128:0x0266  */
    /* JADX WARN: Code duplicated, block: B:137:0x0283  */
    /* JADX WARN: Code duplicated, block: B:139:0x028a  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:144:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:151:0x02db  */
    /* JADX WARN: Code duplicated, block: B:155:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:158:0x0308  */
    /* JADX WARN: Code duplicated, block: B:159:0x030d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0322  */
    /* JADX WARN: Code duplicated, block: B:165:0x0335  */
    /* JADX WARN: Code duplicated, block: B:168:0x033e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:502:0x01ac A[EDGE_INSN: B:502:0x01ac->B:86:0x01ac BREAK  A[LOOP:9: B:83:0x019b->B:85:0x01a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x01ae A[EDGE_INSN: B:507:0x01ae->B:87:0x01ae BREAK  A[LOOP:12: B:89:0x01c2->B:134:0x0277], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code duplicated, block: B:80:0x018d  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b A[LOOP:9: B:83:0x019b->B:85:0x01a1, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a1 A[LOOP:9: B:83:0x019b->B:85:0x01a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01da  */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException, no0 {
        ts2 ts2Var;
        cw1 cw1Var;
        ArrayDeque arrayDeque;
        nh0 nh0Var;
        zh0 zh0Var;
        me0 me0Var;
        long j;
        int i;
        de3 de3Var;
        cw1 cw1Var2;
        byte[] bArr;
        int i2;
        nh0 nh0Var2;
        int i3;
        int iB;
        int i4;
        int iJ;
        int i5;
        int iB2;
        boolean z;
        ArrayDeque arrayDeque2;
        int iB3;
        xh0 xh0VarE;
        le0 le0Var;
        long j2;
        mh0 mh0Var;
        int i6;
        long j3;
        long j4;
        int i7;
        int i8;
        int i9;
        int iD;
        String strM;
        String strM2;
        long jT;
        long jP;
        long j5;
        long jT2;
        od0 od0Var2 = od0Var;
        while (true) {
            int i10 = this.q;
            zy1 zy1Var = this.o;
            ArrayDeque arrayDeque3 = this.l;
            ts2Var = this.n;
            cw1Var = this.i;
            SparseArray sparseArray = this.d;
            if (i10 != 0) {
                arrayDeque = this.m;
                if (i10 != 1) {
                    long j6 = Long.MAX_VALUE;
                    if (i10 != 2) {
                        nh0Var = this.A;
                        if (nh0Var != null) {
                            break;
                        }
                        int size = sparseArray.size();
                        nh0 nh0Var3 = null;
                        for (int i11 = 0; i11 < size; i11++) {
                            nh0 nh0Var4 = (nh0) sparseArray.valueAt(i11);
                            boolean z2 = nh0Var4.m;
                            yh0 yh0Var = nh0Var4.b;
                            if ((z2 || nh0Var4.f != nh0Var4.d.b) && (!z2 || nh0Var4.h != yh0Var.d)) {
                                long j7 = !z2 ? nh0Var4.d.c[nh0Var4.f] : yh0Var.f[nh0Var4.h];
                                if (j7 < j6) {
                                    nh0Var3 = nh0Var4;
                                    j6 = j7;
                                }
                            }
                        }
                        if (nh0Var3 != null) {
                            int i12 = (int) ((!nh0Var3.m ? nh0Var3.d.c[nh0Var3.f] : nh0Var3.b.f[nh0Var3.h]) - ((fd0) od0Var2).i);
                            if (i12 < 0) {
                                s90.Q("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                i12 = 0;
                            }
                            ((fd0) od0Var2).b(i12, false);
                            this.A = nh0Var3;
                            nh0Var = nh0Var3;
                            break;
                        }
                        int i13 = (int) (this.v - ((fd0) od0Var2).i);
                        if (i13 < 0) {
                            throw no0.a(null, "Offset to end of mdat was negative.");
                        }
                        ((fd0) od0Var2).b(i13, false);
                        a();
                    } else {
                        int size2 = sparseArray.size();
                        nh0 nh0Var5 = null;
                        for (int i14 = 0; i14 < size2; i14++) {
                            yh0 yh0Var2 = ((nh0) sparseArray.valueAt(i14)).b;
                            if (yh0Var2.o) {
                                long j8 = yh0Var2.c;
                                if (j8 < j6) {
                                    nh0Var5 = (nh0) sparseArray.valueAt(i14);
                                    j6 = j8;
                                }
                            }
                        }
                        if (nh0Var5 == null) {
                            this.q = 3;
                        } else {
                            int i15 = (int) (j6 - ((fd0) od0Var2).i);
                            if (i15 < 0) {
                                throw no0.a(null, "Offset to encryption data was negative.");
                            }
                            fd0 fd0Var = (fd0) od0Var2;
                            fd0Var.b(i15, false);
                            yh0 yh0Var3 = nh0Var5.b;
                            cw1 cw1Var3 = yh0Var3.n;
                            fd0Var.w(cw1Var3.a, 0, cw1Var3.c, false);
                            cw1Var3.E(0);
                            yh0Var3.o = false;
                        }
                    }
                } else {
                    long j9 = this.s - ((long) this.t);
                    cw1 cw1Var4 = this.u;
                    int i16 = (int) j9;
                    if (cw1Var4 != null) {
                        ((fd0) od0Var2).w(cw1Var4.a, 8, i16, false);
                        int i17 = this.r;
                        l12 l12Var = new l12(i17, cw1Var4);
                        if (!arrayDeque3.isEmpty()) {
                            ((i12) arrayDeque3.peek()).d.add(l12Var);
                        } else if (i17 == 1936286840) {
                            Pair pairJ = j(((fd0) od0Var2).i, cw1Var4);
                            zy1Var.n((ed0) pairJ.second);
                            if (!this.J) {
                                this.z = ((Long) pairJ.first).longValue();
                                this.G.v((ee0) pairJ.second);
                                this.J = true;
                            }
                        } else if (i17 == 1701671783 && this.H.length != 0) {
                            cw1Var4.E(8);
                            int iA = jh0.a(cw1Var4.b());
                            if (iA == 0) {
                                strM = cw1Var4.m();
                                strM.getClass();
                                strM2 = cw1Var4.m();
                                strM2.getClass();
                                long jP2 = cw1Var4.P();
                                long jP3 = cw1Var4.P();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jT3 = qz1.t(jP3, 1000000L, jP2, roundingMode);
                                long j10 = this.z;
                                long j11 = j10 != -9223372036854775807L ? j10 + jT3 : -9223372036854775807L;
                                jT = qz1.t(cw1Var4.P(), 1000L, jP2, roundingMode);
                                jP = cw1Var4.P();
                                long j12 = j11;
                                j5 = jT3;
                                jT2 = j12;
                            } else if (iA != 1) {
                                ec.u(new StringBuilder(String.valueOf(iA).length() + 35), "Skipping unsupported emsg version: ", iA, "FragmentedMp4Extractor");
                            } else {
                                long jP4 = cw1Var4.P();
                                long j13 = cw1Var4.j();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                jT2 = qz1.t(j13, 1000000L, jP4, roundingMode2);
                                long jT4 = qz1.t(cw1Var4.P(), 1000L, jP4, roundingMode2);
                                long jP5 = cw1Var4.P();
                                strM = cw1Var4.m();
                                strM.getClass();
                                strM2 = cw1Var4.m();
                                strM2.getClass();
                                jP = jP5;
                                jT = jT4;
                                j5 = -9223372036854775807L;
                            }
                            byte[] bArr2 = new byte[cw1Var4.B()];
                            cw1Var4.H(bArr2, 0, cw1Var4.B());
                            us2 us2Var = this.j;
                            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) us2Var.g;
                            byteArrayOutputStream.reset();
                            try {
                                DataOutputStream dataOutputStream = (DataOutputStream) us2Var.h;
                                dataOutputStream.writeBytes(strM);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(strM2);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(jT);
                                dataOutputStream.writeLong(jP);
                                dataOutputStream.write(bArr2);
                                dataOutputStream.flush();
                                cw1 cw1Var5 = new cw1(byteArrayOutputStream.toByteArray());
                                int iB4 = cw1Var5.B();
                                for (me0 me0Var2 : this.H) {
                                    cw1Var5.E(0);
                                    me0Var2.a(cw1Var5, iB4, 0);
                                }
                                if (jT2 == -9223372036854775807L) {
                                    arrayDeque.addLast(new mh0(iB4, j5, true));
                                    this.w += iB4;
                                } else if (arrayDeque.isEmpty()) {
                                    for (me0 me0Var3 : this.H) {
                                        me0Var3.c(jT2, 1, iB4, 0, null);
                                    }
                                } else {
                                    arrayDeque.addLast(new mh0(iB4, jT2, false));
                                    this.w += iB4;
                                }
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    } else {
                        ((fd0) od0Var2).b(i16, false);
                    }
                    b(((fd0) od0Var2).i);
                }
            } else {
                int i18 = this.t;
                long length = 0;
                cw1 cw1Var6 = this.k;
                if (i18 == 0) {
                    if (!((fd0) od0Var2).w(cw1Var6.a, 0, 8, true)) {
                        if (this.K == -1) {
                            ts2Var.m(0);
                            return -1;
                        }
                        rd0Var.a = 0L;
                        this.K = -1L;
                        pd0 pd0Var = this.G;
                        zy1Var.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (ed0 ed0Var : ((LinkedHashMap) zy1Var.g).values()) {
                            arrayList.add(ed0Var.b);
                            arrayList2.add(ed0Var.c);
                            arrayList3.add(ed0Var.d);
                            arrayList4.add(ed0Var.e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            length += (long) iArr2.length;
                        }
                        int i19 = (int) length;
                        hn.I(length == ((long) i19), "the total number of elements (%s) in the arrays must fit in an int", length);
                        int[] iArr3 = new int[i19];
                        int i20 = 0;
                        for (int[] iArr4 : iArr) {
                            int length2 = iArr4.length;
                            System.arraycopy(iArr4, 0, iArr3, i20, length2);
                            i20 += length2;
                        }
                        pd0Var.v(new ed0(iArr3, s90.G((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), s90.G((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), s90.G((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
                        return 1;
                    }
                    this.t = 8;
                    cw1Var6.E(0);
                    this.s = cw1Var6.P();
                    this.r = cw1Var6.b();
                }
                long j14 = this.s;
                if (j14 == 1) {
                    ((fd0) od0Var2).w(cw1Var6.a, 8, 8, false);
                    this.t += 8;
                    this.s = cw1Var6.j();
                } else if (j14 == 0) {
                    long j15 = ((fd0) od0Var2).h;
                    if (j15 == -1) {
                        j15 = !arrayDeque3.isEmpty() ? ((i12) arrayDeque3.peek()).c : -1L;
                    }
                    if (j15 != -1) {
                        this.s = (j15 - ((fd0) od0Var2).i) + ((long) this.t);
                    }
                }
                long j16 = this.s;
                int i21 = this.t;
                long j17 = i21;
                if (j16 < j17) {
                    if (this.r != 1718773093 || i21 != 8) {
                        throw no0.b("Atom size less than header length (unsupported).");
                    }
                    this.s = j17;
                    j16 = j17;
                }
                if (this.K != -1) {
                    if (this.r == 1936286840) {
                        cw1Var.y((int) j16);
                        System.arraycopy(cw1Var6.a, 0, cw1Var.a, 0, 8);
                        ((fd0) od0Var2).w(cw1Var.a, 8, (int) (this.s - ((long) this.t)), false);
                        zy1Var.n((ed0) j(((fd0) od0Var2).m(), cw1Var).second);
                    } else {
                        ((fd0) od0Var2).b((int) (j16 - j17), true);
                    }
                    a();
                } else {
                    long j18 = ((fd0) od0Var2).i - j17;
                    int i22 = this.r;
                    if ((i22 == 1836019558 || i22 == 1835295092) && !this.J) {
                        this.G.v(new sd0(this.y, j18));
                        this.J = true;
                    }
                    if (this.r == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i23 = 0; i23 < size3; i23++) {
                            yh0 yh0Var4 = ((nh0) sparseArray.valueAt(i23)).b;
                            yh0Var4.c = j18;
                            yh0Var4.b = j18;
                        }
                    }
                    int i24 = this.r;
                    if (i24 == 1835295092) {
                        this.A = null;
                        this.v = j18 + this.s;
                        this.q = 2;
                    } else if (i24 == 1836019574 || i24 == 1953653099 || i24 == 1835297121 || i24 == 1835626086 || i24 == 1937007212 || i24 == 1836019558 || i24 == 1953653094 || i24 == 1836475768 || i24 == 1701082227 || i24 == 1835365473) {
                        fd0 fd0Var2 = (fd0) od0Var2;
                        long j19 = fd0Var2.i;
                        long j20 = this.s;
                        long j21 = j19 + j20;
                        if (j20 != this.t && i24 == 1835365473) {
                            cw1Var.y(8);
                            fd0Var2.B(cw1Var.a, 0, 8, false);
                            jh0.f(cw1Var);
                            fd0Var2.b(cw1Var.b, false);
                            fd0Var2.k = 0;
                        }
                        long j22 = j21 - 8;
                        arrayDeque3.push(new i12(this.r, j22));
                        if (this.s == this.t) {
                            b(j22);
                        } else {
                            a();
                        }
                    } else if (i24 == 1751411826 || i24 == 1835296868 || i24 == 1836476516 || i24 == 1936286840 || i24 == 1937011556 || i24 == 1937011827 || i24 == 1668576371 || i24 == 1937011555 || i24 == 1937011578 || i24 == 1937013298 || i24 == 1937007471 || i24 == 1668232756 || i24 == 1937011571 || i24 == 1952867444 || i24 == 1952868452 || i24 == 1953196132 || i24 == 1953654136 || i24 == 1953658222 || i24 == 1886614376 || i24 == 1935763834 || i24 == 1935763823 || i24 == 1936027235 || i24 == 1970628964 || i24 == 1935828848 || i24 == 1936158820 || i24 == 1701606260 || i24 == 1835362404 || i24 == 1701671783 || i24 == 1969517665 || i24 == 1801812339 || i24 == 1768715124) {
                        if (this.t != 8) {
                            throw no0.b("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.s > 2147483647L) {
                            throw no0.b("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        cw1 cw1Var7 = new cw1((int) this.s);
                        System.arraycopy(cw1Var6.a, 0, cw1Var7.a, 0, 8);
                        this.u = cw1Var7;
                        this.q = 1;
                    } else {
                        if (this.s > 2147483647L) {
                            throw no0.b("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.u = null;
                        this.q = 1;
                    }
                }
            }
        }
        yh0 yh0Var5 = nh0Var.b;
        if (this.q != 3) {
            zh0Var = nh0Var.d;
            wh0 wh0Var = zh0Var.a;
            me0Var = nh0Var.a;
            if (nh0Var.m) {
                j = yh0Var5.i[nh0Var.f];
            } else {
                j = zh0Var.f[nh0Var.f];
            }
            i = wh0Var.k;
            de3Var = wh0Var.g;
            String str = de3Var.j;
            if (i == 0) {
                cw1Var2 = this.f;
                bArr = cw1Var2.a;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                i2 = 4 - i;
                nh0Var2 = nh0Var;
                while (true) {
                    i = i;
                    if (this.C < this.B) {
                        break;
                    }
                    i3 = this.D;
                    if (i3 == 0) {
                        if (this.I.length <= 0 || !this.E) {
                            iJ = ss0.J(de3Var);
                            if (i + iJ > this.B - this.C) {
                                i5 = 0;
                            } else {
                                i5 = iJ;
                            }
                        } else {
                            i5 = 0;
                        }
                        ((fd0) od0Var2).w(bArr, i2, i + i5, false);
                        cw1Var2.E(0);
                        iB2 = cw1Var2.b();
                        if (iB2 >= 0) {
                            throw no0.a(null, "Invalid NAL length");
                        }
                        this.D = iB2 - i5;
                        cw1 cw1Var8 = this.e;
                        cw1Var8.E(0);
                        me0Var.a(cw1Var8, 4, 0);
                        this.C += 4;
                        this.B += i2;
                        if (this.I.length <= 0 && i5 > 0) {
                            byte b = bArr[4];
                            String str2 = de3Var.m;
                            if ((!Objects.equals(str2, "video/avc") && !rn0.e(str, "video/avc")) || (b & 31) != 6) {
                                if ((Objects.equals(str2, "video/hevc") || rn0.e(str, "video/hevc")) && ((b & 126) >> 1) == 39) {
                                }
                                this.F = z;
                                me0Var.a(cw1Var2, i5, 0);
                                this.C += i5;
                                if (i5 > 0 && !this.E && ss0.S(bArr, i5, de3Var)) {
                                    this.E = true;
                                }
                                od0Var2 = od0Var;
                            }
                            z = true;
                            this.F = z;
                            me0Var.a(cw1Var2, i5, 0);
                            this.C += i5;
                            if (i5 > 0) {
                                this.E = true;
                            }
                            od0Var2 = od0Var;
                        }
                        this.F = z;
                        me0Var.a(cw1Var2, i5, 0);
                        this.C += i5;
                        if (i5 > 0) {
                            this.E = true;
                        }
                        od0Var2 = od0Var;
                    } else {
                        if (this.F) {
                            cw1 cw1Var9 = this.g;
                            cw1Var9.y(i3);
                            ((fd0) od0Var).w(cw1Var9.a, 0, this.D, false);
                            me0Var.a(cw1Var9, this.D, 0);
                            int i25 = this.D;
                            int iY = ss0.y(cw1Var9.c, cw1Var9.a);
                            cw1Var9.E(0);
                            cw1Var9.C(iY);
                            i4 = de3Var.o;
                            if (i4 == -1) {
                                if (ts2Var.f != 0) {
                                    ts2Var.k(0);
                                }
                            } else if (ts2Var.f != i4) {
                                ts2Var.k(i4);
                            }
                            ts2Var.l(j, cw1Var9);
                            if ((nh0Var2.b() & 4) != 0) {
                                ts2Var.m(0);
                            }
                            iB = i25;
                            od0Var2 = od0Var;
                        } else {
                            od0Var2 = od0Var;
                            iB = me0Var.b(od0Var2, i3, false);
                        }
                        this.C += iB;
                        this.D -= iB;
                        cw1Var2 = cw1Var2;
                    }
                    arrayDeque = arrayDeque;
                }
            } else {
                while (true) {
                    i8 = this.C;
                    i9 = this.B;
                    if (i8 < i9) {
                        break;
                    }
                    this.C += me0Var.b(od0Var2, i9 - i8, false);
                }
                nh0Var2 = nh0Var;
            }
            arrayDeque2 = arrayDeque;
            iB3 = nh0Var2.b();
            if (!this.E) {
                iB3 |= 67108864;
            }
            int i26 = iB3;
            xh0VarE = nh0Var2.e();
            if (xh0VarE != null) {
                le0Var = xh0VarE.c;
            } else {
                le0Var = null;
            }
            j2 = j;
            me0Var.c(j2, i26, this.B, 0, le0Var);
            while (!arrayDeque2.isEmpty()) {
                mh0Var = (mh0) arrayDeque2.removeFirst();
                int i27 = this.w;
                i6 = mh0Var.c;
                this.w = i27 - i6;
                j3 = mh0Var.a;
                if (mh0Var.b) {
                    j3 += j2;
                }
                j4 = j3;
                for (me0 me0Var4 : this.H) {
                    me0Var4.c(j4, 1, i6, this.w, null);
                }
            }
            if (!nh0Var2.c()) {
                this.A = null;
            }
        } else {
            this.B = !nh0Var.m ? nh0Var.d.d[nh0Var.f] : yh0Var5.h[nh0Var.f];
            String str3 = nh0Var.d.a.g.m;
            if (!Objects.equals(str3, "video/avc")) {
                Objects.equals(str3, "video/hevc");
            }
            this.E = true;
            if (nh0Var.f < nh0Var.i) {
                ((fd0) od0Var2).b(this.B, false);
                xh0 xh0VarE2 = nh0Var.e();
                if (xh0VarE2 != null) {
                    cw1 cw1Var10 = yh0Var5.n;
                    int i28 = xh0VarE2.d;
                    if (i28 != 0) {
                        cw1Var10.G(i28);
                    }
                    int i29 = nh0Var.f;
                    if (yh0Var5.k && yh0Var5.l[i29]) {
                        cw1Var10.G(cw1Var10.L() * 6);
                    }
                }
                if (!nh0Var.c()) {
                    this.A = null;
                }
            } else {
                if (nh0Var.d.a.h == 1) {
                    this.B -= 8;
                    ((fd0) od0Var2).b(8, false);
                }
                boolean zEquals = "audio/ac4".equals(nh0Var.d.a.g.m);
                int i30 = this.B;
                if (zEquals) {
                    this.C = nh0Var.d(i30, 7);
                    ar.C(this.B, cw1Var);
                    nh0Var.a.a(cw1Var, 7, 0);
                    iD = this.C + 7;
                    this.C = iD;
                } else {
                    iD = nh0Var.d(i30, 0);
                    this.C = iD;
                }
                this.B += iD;
                this.q = 4;
                this.D = 0;
                zh0Var = nh0Var.d;
                wh0 wh0Var2 = zh0Var.a;
                me0Var = nh0Var.a;
                if (nh0Var.m) {
                    j = zh0Var.f[nh0Var.f];
                } else {
                    j = yh0Var5.i[nh0Var.f];
                }
                i = wh0Var2.k;
                de3Var = wh0Var2.g;
                String str4 = de3Var.j;
                if (i == 0) {
                    cw1Var2 = this.f;
                    bArr = cw1Var2.a;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    i2 = 4 - i;
                    nh0Var2 = nh0Var;
                    while (true) {
                        i = i;
                        if (this.C < this.B) {
                            break;
                            break;
                        }
                        i3 = this.D;
                        if (i3 == 0) {
                            if (this.I.length <= 0) {
                                iJ = ss0.J(de3Var);
                                if (i + iJ > this.B - this.C) {
                                    i5 = 0;
                                } else {
                                    i5 = iJ;
                                }
                            } else {
                                iJ = ss0.J(de3Var);
                                if (i + iJ > this.B - this.C) {
                                    i5 = 0;
                                } else {
                                    i5 = iJ;
                                }
                            }
                            ((fd0) od0Var2).w(bArr, i2, i + i5, false);
                            cw1Var2.E(0);
                            iB2 = cw1Var2.b();
                            if (iB2 >= 0) {
                                throw no0.a(null, "Invalid NAL length");
                            }
                            this.D = iB2 - i5;
                            cw1 cw1Var11 = this.e;
                            cw1Var11.E(0);
                            me0Var.a(cw1Var11, 4, 0);
                            this.C += 4;
                            this.B += i2;
                            z = this.I.length <= 0 ? false : false;
                            this.F = z;
                            me0Var.a(cw1Var2, i5, 0);
                            this.C += i5;
                            if (i5 > 0) {
                                this.E = true;
                            }
                            od0Var2 = od0Var;
                        } else {
                            if (this.F) {
                                cw1 cw1Var12 = this.g;
                                cw1Var12.y(i3);
                                ((fd0) od0Var).w(cw1Var12.a, 0, this.D, false);
                                me0Var.a(cw1Var12, this.D, 0);
                                int i210 = this.D;
                                int iY2 = ss0.y(cw1Var12.c, cw1Var12.a);
                                cw1Var12.E(0);
                                cw1Var12.C(iY2);
                                i4 = de3Var.o;
                                if (i4 == -1) {
                                    if (ts2Var.f != 0) {
                                        ts2Var.k(0);
                                    }
                                } else if (ts2Var.f != i4) {
                                    ts2Var.k(i4);
                                }
                                ts2Var.l(j, cw1Var12);
                                if ((nh0Var2.b() & 4) != 0) {
                                    ts2Var.m(0);
                                }
                                iB = i210;
                                od0Var2 = od0Var;
                            } else {
                                od0Var2 = od0Var;
                                iB = me0Var.b(od0Var2, i3, false);
                            }
                            this.C += iB;
                            this.D -= iB;
                            cw1Var2 = cw1Var2;
                        }
                        arrayDeque = arrayDeque;
                    }
                } else {
                    while (true) {
                        i8 = this.C;
                        i9 = this.B;
                        if (i8 < i9) {
                            break;
                            break;
                        }
                        this.C += me0Var.b(od0Var2, i9 - i8, false);
                    }
                    nh0Var2 = nh0Var;
                }
                arrayDeque2 = arrayDeque;
                iB3 = nh0Var2.b();
                if (!this.E) {
                    iB3 |= 67108864;
                }
                int i211 = iB3;
                xh0VarE = nh0Var2.e();
                if (xh0VarE != null) {
                    le0Var = xh0VarE.c;
                } else {
                    le0Var = null;
                }
                j2 = j;
                me0Var.c(j2, i211, this.B, 0, le0Var);
                while (!arrayDeque2.isEmpty()) {
                    mh0Var = (mh0) arrayDeque2.removeFirst();
                    int i212 = this.w;
                    i6 = mh0Var.c;
                    this.w = i212 - i6;
                    j3 = mh0Var.a;
                    if (mh0Var.b) {
                        j3 += j2;
                    }
                    j4 = j3;
                    while (i7 < r2) {
                        me0Var4.c(j4, 1, i6, this.w, null);
                    }
                }
                if (!nh0Var2.c()) {
                    this.A = null;
                }
            }
        }
        this.q = 3;
        return 0;
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((nh0) sparseArray.valueAt(i)).a();
        }
        this.m.clear();
        this.w = 0;
        ((PriorityQueue) this.n.j).clear();
        this.x = j2;
        this.l.clear();
        a();
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        if ((this.b & 32) == 0) {
            pd0Var = new md(pd0Var, this.a);
        }
        this.G = pd0Var;
        a();
        me0[] me0VarArr = new me0[2];
        this.H = me0VarArr;
        int i = 0;
        me0[] me0VarArr2 = (me0[]) qz1.m(me0VarArr, 0);
        this.H = me0VarArr2;
        for (me0 me0Var : me0VarArr2) {
            me0Var.d(M);
        }
        List list = this.c;
        this.I = new me0[list.size()];
        int i2 = 100;
        while (i < this.I.length) {
            int i3 = i2 + 1;
            me0 me0VarZ = this.G.z(i2, 3);
            me0VarZ.d((de3) list.get(i));
            this.I[i] = me0VarZ;
            i++;
            i2 = i3;
        }
    }
}
