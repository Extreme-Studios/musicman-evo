package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sh0 implements nd0 {
    public static final /* synthetic */ int z = 0;
    public final pi0 a;
    public final int b;
    public final cw1 c;
    public final cw1 d;
    public final cw1 e;
    public final cw1 f;
    public final ArrayDeque g;
    public final vh0 h;
    public final ArrayList i;
    public qk2 j;
    public int k;
    public int l;
    public long m;
    public int n;
    public cw1 o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public pd0 v;
    public rh0[] w;
    public long[][] x;
    public int y;

    static {
        int i = ar.o;
    }

    public sh0(pi0 pi0Var, int i) {
        this.a = pi0Var;
        this.b = i;
        tj2 tj2Var = vj2.g;
        this.j = qk2.j;
        this.k = 0;
        this.h = new vh0();
        this.i = new ArrayList();
        this.f = new cw1(16);
        this.g = new ArrayDeque();
        this.c = new cw1(ss0.m);
        this.d = new cw1(6);
        this.e = new cw1();
        this.p = -1;
        this.v = pd0.d;
        this.w = new rh0[0];
    }

    public final void a() {
        this.k = 0;
        this.n = 0;
    }

    public final void b(long j) {
        am0 am0VarC;
        int i;
        am0 am0Var;
        long j2;
        rh0 rh0Var;
        int i2;
        while (true) {
            ArrayDeque arrayDeque = this.g;
            if (arrayDeque.isEmpty() || ((i12) arrayDeque.peek()).c != j) {
                break;
            }
            i12 i12Var = (i12) arrayDeque.pop();
            if (i12Var.b == 1836019574) {
                i12 i12VarC = i12Var.c(1835365473);
                new ArrayList();
                am0 am0VarE = i12VarC != null ? jh0.e(i12VarC) : null;
                ArrayList arrayList = new ArrayList();
                boolean z2 = this.y == 1;
                wd0 wd0Var = new wd0();
                l12 l12VarB = i12Var.b(1969517665);
                if (l12VarB != null) {
                    am0VarC = jh0.c(l12VarB);
                    wd0Var.a(am0VarC);
                } else {
                    am0VarC = null;
                }
                l12 l12VarB2 = i12Var.b(1836476516);
                l12VarB2.getClass();
                am0 am0Var2 = new am0(jh0.d(l12VarB2.c));
                am0 am0Var3 = am0VarC;
                ArrayList arrayListB = jh0.b(i12Var, wd0Var, -9223372036854775807L, null, false, z2, lh0.b);
                String strN = jn.n(arrayListB);
                long j3 = -9223372036854775807L;
                int i3 = 0;
                int i4 = 0;
                int size = -1;
                while (i3 < arrayListB.size()) {
                    zh0 zh0Var = (zh0) arrayListB.get(i3);
                    if (zh0Var.b == 0) {
                        i = i4;
                        am0Var = am0VarE;
                    } else {
                        wh0 wh0Var = zh0Var.a;
                        pd0 pd0Var = this.v;
                        i = i4 + 1;
                        int i5 = wh0Var.b;
                        me0 me0VarZ = pd0Var.z(i4, i5);
                        rh0 rh0Var2 = new rh0(wh0Var, zh0Var, me0VarZ);
                        am0Var = am0VarE;
                        long j4 = wh0Var.e;
                        if (j4 == -9223372036854775807L) {
                            j4 = zh0Var.h;
                        }
                        long jMax = Math.max(j3, j4);
                        de3 de3Var = wh0Var.g;
                        String str = de3Var.m;
                        boolean zEquals = "audio/true-hd".equals(str);
                        int i6 = zh0Var.e;
                        int i7 = zEquals ? i6 * 16 : i6 + 30;
                        uc3 uc3Var = new uc3(de3Var);
                        uc3Var.m = i7;
                        if (i5 == 2) {
                            int i8 = de3Var.f;
                            if ((this.b & 8) != 0) {
                                i8 |= size == -1 ? 1 : 2;
                            }
                            uc3Var.f = i8;
                            i5 = 2;
                        }
                        if (i5 == 1) {
                            int i9 = wd0Var.a;
                            j2 = jMax;
                            if (i9 != -1 && (i2 = wd0Var.b) != -1) {
                                uc3Var.G = i9;
                                uc3Var.H = i2;
                            }
                        } else {
                            j2 = jMax;
                        }
                        am0 am0Var4 = de3Var.k;
                        ArrayList arrayList2 = this.i;
                        hn.t(i5, am0Var, uc3Var, am0Var4, arrayList2.isEmpty() ? null : new am0(arrayList2), am0Var3, am0Var2);
                        uc3Var.d(strN);
                        if (Objects.equals(str, "audio/mpeg")) {
                            rh0Var = rh0Var2;
                            rh0Var.f = new de3(uc3Var);
                        } else {
                            rh0Var = rh0Var2;
                            me0VarZ.d(new de3(uc3Var));
                        }
                        if (i5 == 2 && size == -1) {
                            size = arrayList.size();
                        }
                        arrayList.add(rh0Var);
                        j3 = j2;
                    }
                    i3++;
                    am0VarE = am0Var;
                    arrayDeque = arrayDeque;
                    arrayListB = arrayListB;
                    i4 = i;
                }
                ArrayDeque arrayDeque2 = arrayDeque;
                int i10 = -1;
                rh0[] rh0VarArr = (rh0[]) arrayList.toArray(new rh0[0]);
                this.w = rh0VarArr;
                int length = rh0VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < rh0VarArr.length; i11++) {
                    jArr[i11] = new long[rh0VarArr[i11].b.b];
                    jArr2[i11] = rh0VarArr[i11].b.f[0];
                }
                long j5 = 0;
                int i12 = 0;
                while (i12 < rh0VarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i13 = i10;
                    for (int i14 = 0; i14 < rh0VarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j7 = jArr2[i14];
                            if (j7 <= j6) {
                                i13 = i14;
                                j6 = j7;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j5;
                    zh0 zh0Var2 = rh0VarArr[i13].b;
                    rh0[] rh0VarArr2 = rh0VarArr;
                    boolean[] zArr2 = zArr;
                    j5 += (long) zh0Var2.d[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = zh0Var2.f[i16];
                    } else {
                        zArr2[i13] = true;
                        i12++;
                    }
                    rh0VarArr = rh0VarArr2;
                    zArr = zArr2;
                    i10 = -1;
                }
                this.x = jArr;
                this.v.s();
                this.v.v(new qh0(j3, this.w, size));
                arrayDeque2.clear();
                this.k = 2;
            } else if (!arrayDeque.isEmpty()) {
                ((i12) arrayDeque.peek()).e.add(i12Var);
            }
        }
        if (this.k != 2) {
            a();
        }
    }

    @Override // defpackage.nd0
    public final /* synthetic */ List c() {
        return this.j;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) {
        qk2 qk2VarI;
        ie0 ie0VarC = v51.C(od0Var, false, false);
        if (ie0VarC != null) {
            qk2VarI = vj2.i(ie0VarC);
        } else {
            tj2 tj2Var = vj2.g;
            qk2VarI = qk2.j;
        }
        this.j = qk2VarI;
        return ie0VarC == null;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:158:0x0367  */
    /* JADX WARN: Code duplicated, block: B:160:0x037c  */
    /* JADX WARN: Code duplicated, block: B:162:0x038a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:406:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0143 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x038d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x038d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws no0 {
        int i;
        int[] iArr;
        int i2;
        int iJ;
        int iB;
        int i3;
        char c;
        int i4;
        ArrayList arrayList;
        List listM;
        int i5;
        List listM2;
        boolean z2;
        while (true) {
            int i6 = this.k;
            ArrayDeque arrayDeque = this.g;
            cw1 cw1Var = this.e;
            int i7 = 0;
            if (i6 != 0) {
                int i8 = 4;
                if (i6 != 1) {
                    if (i6 == 2) {
                        long jO = od0Var.o();
                        int i9 = this.p;
                        if (i9 == -1) {
                            i9 = -1;
                            int i10 = -1;
                            boolean z3 = true;
                            boolean z4 = true;
                            int i11 = 0;
                            long j = Long.MAX_VALUE;
                            long j2 = Long.MAX_VALUE;
                            long j3 = Long.MAX_VALUE;
                            while (true) {
                                rh0[] rh0VarArr = this.w;
                                if (i11 >= rh0VarArr.length) {
                                    break;
                                }
                                rh0 rh0Var = rh0VarArr[i11];
                                int i12 = rh0Var.e;
                                zh0 zh0Var = rh0Var.b;
                                if (i12 != zh0Var.b) {
                                    long j4 = zh0Var.c[i12];
                                    long[][] jArr = this.x;
                                    jArr.getClass();
                                    long j5 = jArr[i11][i12];
                                    long j6 = j4 - jO;
                                    boolean z5 = j6 < 0 || j6 >= 262144;
                                    if (z5) {
                                        if (z5 == z4 && j6 < j3) {
                                            z4 = z5;
                                            i10 = i11;
                                            j3 = j6;
                                            j2 = j5;
                                        }
                                    } else if (z4) {
                                        z4 = z5;
                                        i10 = i11;
                                        j3 = j6;
                                        j2 = j5;
                                    } else {
                                        z4 = false;
                                        if (z5 == z4) {
                                            z4 = z5;
                                            i10 = i11;
                                            j3 = j6;
                                            j2 = j5;
                                        }
                                    }
                                    if (j5 < j) {
                                        z3 = z5;
                                        i9 = i11;
                                        j = j5;
                                    }
                                }
                                i11++;
                            }
                            if (j == Long.MAX_VALUE || !z3 || j2 < j + 10485760) {
                                i9 = i10;
                            }
                            this.p = i9;
                            if (i9 == -1) {
                                return -1;
                            }
                        }
                        rh0 rh0Var2 = this.w[i9];
                        me0 me0Var = rh0Var2.c;
                        int i13 = rh0Var2.e;
                        zh0 zh0Var2 = rh0Var2.b;
                        long j7 = zh0Var2.c[i13];
                        int[] iArr2 = zh0Var2.d;
                        int i14 = iArr2[i13];
                        ne0 ne0Var = rh0Var2.d;
                        long j8 = (j7 - jO) + ((long) this.q);
                        if (j8 < 0 || j8 >= 262144) {
                            rd0Var.a = j7;
                            return 1;
                        }
                        wh0 wh0Var = rh0Var2.a;
                        if (wh0Var.h == 1) {
                            j8 += 8;
                            i14 -= 8;
                        }
                        od0Var.t((int) j8);
                        de3 de3Var = wh0Var.g;
                        String str = de3Var.m;
                        if (!Objects.equals(str, "video/avc")) {
                            Objects.equals(str, "video/hevc");
                        }
                        this.t = true;
                        int i15 = wh0Var.k;
                        if (i15 == 0) {
                            if ("audio/ac4".equals(str)) {
                                if (this.r == 0) {
                                    ar.C(i14, cw1Var);
                                    me0Var.a(cw1Var, 7, 0);
                                    this.r += 7;
                                }
                                i14 += 7;
                            } else if (rh0Var2.f != null && Objects.equals(str, "audio/mpeg")) {
                                de3 de3Var2 = rh0Var2.f;
                                cw1Var.y(4);
                                od0Var.u(cw1Var.a, 0, 4);
                                od0Var.i();
                                zd0 zd0Var = new zd0();
                                if (zd0Var.a(cw1Var.b()) && !Objects.equals(de3Var2.m, (String) zd0Var.g)) {
                                    uc3 uc3Var = new uc3(de3Var2);
                                    String str2 = (String) zd0Var.g;
                                    str2.getClass();
                                    uc3Var.e(str2);
                                    de3Var2 = new de3(uc3Var);
                                }
                                me0Var.d(de3Var2);
                                rh0Var2.f = null;
                            } else if (ne0Var != null) {
                                ne0Var.a(od0Var);
                            }
                            while (true) {
                                int i16 = this.r;
                                if (i16 >= i14) {
                                    break;
                                }
                                int iB2 = me0Var.b(od0Var, i14 - i16, false);
                                this.q += iB2;
                                this.r += iB2;
                                this.s -= iB2;
                            }
                        } else {
                            cw1 cw1Var2 = this.d;
                            byte[] bArr = cw1Var2.a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i17 = 4 - i15;
                            i14 += i17;
                            while (this.r < i14) {
                                int i18 = this.s;
                                if (i18 == 0) {
                                    if (this.t) {
                                        i = i15;
                                    } else {
                                        i = i15;
                                        if (ss0.J(de3Var) + i15 <= iArr2[i13] - this.q) {
                                            iJ = ss0.J(de3Var);
                                            i2 = i + iJ;
                                        }
                                        od0Var.x(bArr, i17, i2);
                                        this.q += i2;
                                        cw1Var2.E(0);
                                        iB = cw1Var2.b();
                                        if (iB >= 0) {
                                            throw no0.a(null, "Invalid NAL length");
                                        }
                                        this.s = iB - iJ;
                                        cw1 cw1Var3 = this.c;
                                        cw1Var3.E(0);
                                        iArr = iArr2;
                                        me0Var.a(cw1Var3, 4, 0);
                                        this.r += 4;
                                        if (iJ > 0) {
                                            me0Var.a(cw1Var2, iJ, 0);
                                            this.r += iJ;
                                            if (ss0.S(bArr, iJ, de3Var)) {
                                                this.t = true;
                                            }
                                        }
                                    }
                                    i2 = i;
                                    iJ = 0;
                                    od0Var.x(bArr, i17, i2);
                                    this.q += i2;
                                    cw1Var2.E(0);
                                    iB = cw1Var2.b();
                                    if (iB >= 0) {
                                        throw no0.a(null, "Invalid NAL length");
                                    }
                                    this.s = iB - iJ;
                                    cw1 cw1Var4 = this.c;
                                    cw1Var4.E(0);
                                    iArr = iArr2;
                                    me0Var.a(cw1Var4, 4, 0);
                                    this.r += 4;
                                    if (iJ > 0) {
                                        me0Var.a(cw1Var2, iJ, 0);
                                        this.r += iJ;
                                        if (ss0.S(bArr, iJ, de3Var)) {
                                            this.t = true;
                                        }
                                    }
                                } else {
                                    i = i15;
                                    iArr = iArr2;
                                    int iB3 = me0Var.b(od0Var, i18, false);
                                    this.q += iB3;
                                    this.r += iB3;
                                    this.s -= iB3;
                                }
                                i15 = i;
                                iArr2 = iArr;
                            }
                        }
                        int i19 = i14;
                        long j9 = zh0Var2.f[i13];
                        int i20 = zh0Var2.g[i13];
                        if (!this.t) {
                            i20 |= 67108864;
                        }
                        if (ne0Var != null) {
                            ne0Var.b(me0Var, j9, i20, i19, 0, null);
                            if (i13 + 1 == zh0Var2.b) {
                                ne0Var.c(me0Var, null);
                            }
                        } else {
                            me0Var.c(j9, i20, i19, 0, null);
                        }
                        rh0Var2.e++;
                        this.p = -1;
                        this.q = 0;
                        this.r = 0;
                        this.s = 0;
                        this.t = false;
                        return 0;
                    }
                    vh0 vh0Var = this.h;
                    ArrayList arrayList2 = vh0Var.a;
                    int i21 = vh0Var.b;
                    if (i21 != 0) {
                        if (i21 != 1) {
                            short s = 2192;
                            int i22 = 8;
                            short s2 = 2816;
                            short s3 = 2817;
                            if (i21 != 2) {
                                long jO2 = od0Var.o();
                                int iP = (int) ((od0Var.p() - od0Var.o()) - ((long) vh0Var.c));
                                cw1 cw1Var5 = new cw1(iP);
                                od0Var.x(cw1Var5.a, 0, iP);
                                int i23 = 0;
                                while (i23 < arrayList2.size()) {
                                    uh0 uh0Var = (uh0) arrayList2.get(i23);
                                    int i24 = i7;
                                    cw1Var5.E((int) (uh0Var.a - jO2));
                                    cw1Var5.G(i8);
                                    int iC = cw1Var5.c();
                                    Charset charset = StandardCharsets.UTF_8;
                                    String strK = cw1Var5.k(iC, charset);
                                    switch (strK.hashCode()) {
                                        case -1711564334:
                                            if (strK.equals("SlowMotion_Data")) {
                                                c = 2192;
                                                i4 = uh0Var.b - (iC + 8);
                                                if (c == 2192) {
                                                    arrayList = new ArrayList();
                                                    listM = vh0.e.m(cw1Var5.k(i4, charset));
                                                    i5 = i24;
                                                    while (i5 < listM.size()) {
                                                        listM2 = vh0.d.m((CharSequence) listM.get(i5));
                                                        if (listM2.size() != 3) {
                                                            throw no0.a(null, null);
                                                        }
                                                        try {
                                                            arrayList.add(new ig0(1 << (Integer.parseInt((String) listM2.get(2)) - 1), Long.parseLong((String) listM2.get(i24)), Long.parseLong((String) listM2.get(1))));
                                                            i5++;
                                                            i24 = 0;
                                                        } catch (NumberFormatException e) {
                                                            throw no0.a(e, null);
                                                        }
                                                    }
                                                    this.i.add(new jg0(arrayList));
                                                } else if (c == 2816 && c != 2817 && c != 2819 && c != 2820) {
                                                    j7.a();
                                                    return i24;
                                                }
                                                i23++;
                                                i8 = 4;
                                                i7 = 0;
                                            }
                                            break;
                                        case -1332107749:
                                            if (strK.equals("Super_SlowMotion_Edit_Data")) {
                                                c = 2819;
                                                i4 = uh0Var.b - (iC + 8);
                                                if (c == 2192) {
                                                    arrayList = new ArrayList();
                                                    listM = vh0.e.m(cw1Var5.k(i4, charset));
                                                    i5 = i24;
                                                    while (i5 < listM.size()) {
                                                        listM2 = vh0.d.m((CharSequence) listM.get(i5));
                                                        if (listM2.size() != 3) {
                                                            throw no0.a(null, null);
                                                        }
                                                        arrayList.add(new ig0(1 << (Integer.parseInt((String) listM2.get(2)) - 1), Long.parseLong((String) listM2.get(i24)), Long.parseLong((String) listM2.get(1))));
                                                        i5++;
                                                        i24 = 0;
                                                    }
                                                    this.i.add(new jg0(arrayList));
                                                } else if (c == 2816) {
                                                    continue;
                                                }
                                                i23++;
                                                i8 = 4;
                                                i7 = 0;
                                            }
                                            break;
                                        case -1251387154:
                                            if (strK.equals("Super_SlowMotion_Data")) {
                                                c = 2816;
                                                i4 = uh0Var.b - (iC + 8);
                                                if (c == 2192) {
                                                    arrayList = new ArrayList();
                                                    listM = vh0.e.m(cw1Var5.k(i4, charset));
                                                    i5 = i24;
                                                    while (i5 < listM.size()) {
                                                        listM2 = vh0.d.m((CharSequence) listM.get(i5));
                                                        if (listM2.size() != 3) {
                                                            throw no0.a(null, null);
                                                        }
                                                        arrayList.add(new ig0(1 << (Integer.parseInt((String) listM2.get(2)) - 1), Long.parseLong((String) listM2.get(i24)), Long.parseLong((String) listM2.get(1))));
                                                        i5++;
                                                        i24 = 0;
                                                    }
                                                    this.i.add(new jg0(arrayList));
                                                } else if (c == 2816) {
                                                    continue;
                                                }
                                                i23++;
                                                i8 = 4;
                                                i7 = 0;
                                            }
                                            break;
                                        case -830665521:
                                            if (strK.equals("Super_SlowMotion_Deflickering_On")) {
                                                c = 2820;
                                                i4 = uh0Var.b - (iC + 8);
                                                if (c == 2192) {
                                                    arrayList = new ArrayList();
                                                    listM = vh0.e.m(cw1Var5.k(i4, charset));
                                                    i5 = i24;
                                                    while (i5 < listM.size()) {
                                                        listM2 = vh0.d.m((CharSequence) listM.get(i5));
                                                        if (listM2.size() != 3) {
                                                            throw no0.a(null, null);
                                                        }
                                                        arrayList.add(new ig0(1 << (Integer.parseInt((String) listM2.get(2)) - 1), Long.parseLong((String) listM2.get(i24)), Long.parseLong((String) listM2.get(1))));
                                                        i5++;
                                                        i24 = 0;
                                                    }
                                                    this.i.add(new jg0(arrayList));
                                                } else if (c == 2816) {
                                                    continue;
                                                }
                                                i23++;
                                                i8 = 4;
                                                i7 = 0;
                                            }
                                            break;
                                        case 1760745220:
                                            if (strK.equals("Super_SlowMotion_BGM")) {
                                                c = 2817;
                                                i4 = uh0Var.b - (iC + 8);
                                                if (c == 2192) {
                                                    arrayList = new ArrayList();
                                                    listM = vh0.e.m(cw1Var5.k(i4, charset));
                                                    i5 = i24;
                                                    while (i5 < listM.size()) {
                                                        listM2 = vh0.d.m((CharSequence) listM.get(i5));
                                                        if (listM2.size() != 3) {
                                                            throw no0.a(null, null);
                                                        }
                                                        arrayList.add(new ig0(1 << (Integer.parseInt((String) listM2.get(2)) - 1), Long.parseLong((String) listM2.get(i24)), Long.parseLong((String) listM2.get(1))));
                                                        i5++;
                                                        i24 = 0;
                                                    }
                                                    this.i.add(new jg0(arrayList));
                                                } else if (c == 2816) {
                                                    continue;
                                                }
                                                i23++;
                                                i8 = 4;
                                                i7 = 0;
                                            }
                                            break;
                                    }
                                    throw no0.a(null, "Invalid SEF name");
                                }
                                rd0Var.a = 0L;
                            } else {
                                long jP = od0Var.p();
                                int i25 = vh0Var.c - 20;
                                cw1 cw1Var6 = new cw1(i25);
                                od0Var.x(cw1Var6.a, 0, i25);
                                int i26 = 0;
                                while (i26 < i25 / 12) {
                                    cw1Var6.G(2);
                                    cw1Var6.v(2);
                                    byte[] bArr2 = cw1Var6.a;
                                    int i27 = cw1Var6.b;
                                    int i28 = i27 + 1;
                                    cw1Var6.b = i28;
                                    int i29 = bArr2[i27] & 255;
                                    cw1Var6.b = i27 + 2;
                                    short s4 = (short) (((bArr2[i28] & 255) << 8) | i29);
                                    if (s4 != s && s4 != s2 && s4 != s3) {
                                        if (s4 != 2819 && s4 != 2820) {
                                            cw1Var6.G(i22);
                                        }
                                        i26++;
                                        s2 = 2816;
                                        s3 = 2817;
                                        s = 2192;
                                        i22 = 8;
                                    }
                                    arrayList2.add(new uh0(cw1Var6.c(), (jP - ((long) vh0Var.c)) - ((long) cw1Var6.c())));
                                    i26++;
                                    s2 = 2816;
                                    s3 = 2817;
                                    s = 2192;
                                    i22 = 8;
                                }
                                if (arrayList2.isEmpty()) {
                                    rd0Var.a = 0L;
                                } else {
                                    vh0Var.b = 3;
                                    rd0Var.a = ((uh0) arrayList2.get(0)).a;
                                }
                            }
                        } else {
                            cw1 cw1Var7 = new cw1(8);
                            od0Var.x(cw1Var7.a, 0, 8);
                            vh0Var.c = cw1Var7.c() + 8;
                            if (cw1Var7.b() != 1397048916) {
                                rd0Var.a = 0L;
                            } else {
                                rd0Var.a = od0Var.o() - ((long) (vh0Var.c - 12));
                                vh0Var.b = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        long jP2 = od0Var.p();
                        rd0Var.a = (jP2 == -1 || jP2 < 8) ? 0L : jP2 - 8;
                        i3 = 1;
                        vh0Var.b = 1;
                    }
                    if (rd0Var.a != 0) {
                        return i3;
                    }
                    a();
                    return i3;
                }
                long j10 = this.m - ((long) this.n);
                long jO3 = od0Var.o() + j10;
                cw1 cw1Var8 = this.o;
                if (cw1Var8 != null) {
                    od0Var.x(cw1Var8.a, this.n, (int) j10);
                    if (this.l == 1718909296) {
                        this.u = true;
                        cw1Var8.E(8);
                        int iB4 = cw1Var8.b();
                        int i30 = iB4 != 1751476579 ? iB4 != 1903435808 ? 0 : 1 : 2;
                        if (i30 == 0) {
                            cw1Var8.G(4);
                            do {
                                if (cw1Var8.B() <= 0) {
                                    i30 = 0;
                                    break;
                                }
                                int iB5 = cw1Var8.b();
                                i30 = iB5 != 1751476579 ? iB5 != 1903435808 ? 0 : 1 : 2;
                            } while (i30 == 0);
                        }
                        this.y = i30;
                    } else if (!arrayDeque.isEmpty()) {
                        ((i12) arrayDeque.peek()).d.add(new l12(this.l, cw1Var8));
                    }
                } else {
                    if (!this.u && this.l == 1835295092) {
                        this.y = 1;
                    }
                    if (j10 < 262144) {
                        od0Var.t((int) j10);
                    } else {
                        rd0Var.a = od0Var.o() + j10;
                        z2 = true;
                    }
                    b(jO3);
                    if (z2 && this.k != 2) {
                        return 1;
                    }
                }
                z2 = false;
                b(jO3);
                if (z2) {
                    continue;
                }
            } else {
                int i31 = this.n;
                cw1 cw1Var9 = this.f;
                if (i31 == 0) {
                    if (!od0Var.w(cw1Var9.a, 0, 8, true)) {
                        return -1;
                    }
                    this.n = 8;
                    cw1Var9.E(0);
                    this.m = cw1Var9.P();
                    this.l = cw1Var9.b();
                }
                long j11 = this.m;
                if (j11 == 1) {
                    od0Var.x(cw1Var9.a, 8, 8);
                    this.n += 8;
                    this.m = cw1Var9.j();
                } else if (j11 == 0) {
                    long jP3 = od0Var.p();
                    if (jP3 == -1) {
                        i12 i12Var = (i12) arrayDeque.peek();
                        jP3 = i12Var != null ? i12Var.c : -1L;
                    }
                    if (jP3 != -1) {
                        this.m = (jP3 - od0Var.o()) + ((long) this.n);
                    }
                }
                long j12 = this.m;
                int i32 = this.n;
                long j13 = i32;
                if (j12 < j13) {
                    if (this.l != 1718773093 || i32 != 8) {
                        throw no0.b("Atom size less than header length (unsupported).");
                    }
                    this.m = j13;
                    i32 = 8;
                }
                int i33 = this.l;
                if (i33 == 1836019574 || i33 == 1953653099 || i33 == 1835297121 || i33 == 1835626086 || i33 == 1937007212 || i33 == 1701082227 || i33 == 1835365473 || i33 == 1635284069) {
                    long jO4 = od0Var.o();
                    long j14 = this.m;
                    long j15 = jO4 + j14;
                    long j16 = this.n;
                    if (j14 != j16 && this.l == 1835365473) {
                        cw1Var.y(8);
                        od0Var.u(cw1Var.a, 0, 8);
                        jh0.f(cw1Var);
                        od0Var.t(cw1Var.b);
                        od0Var.i();
                    }
                    long j17 = j15 - j16;
                    arrayDeque.push(new i12(this.l, j17));
                    if (this.m == this.n) {
                        b(j17);
                    } else {
                        a();
                    }
                } else if (i33 == 1835296868 || i33 == 1836476516 || i33 == 1751411826 || i33 == 1937011556 || i33 == 1937011827 || i33 == 1937011571 || i33 == 1668576371 || i33 == 1701606260 || i33 == 1937011555 || i33 == 1937011578 || i33 == 1937013298 || i33 == 1937007471 || i33 == 1668232756 || i33 == 1953196132 || i33 == 1718909296 || i33 == 1969517665 || i33 == 1801812339 || i33 == 1768715124) {
                    hn.M(i32 == 8);
                    hn.M(this.m <= 2147483647L);
                    cw1 cw1Var10 = new cw1((int) this.m);
                    System.arraycopy(cw1Var9.a, 0, cw1Var10.a, 0, 8);
                    this.o = cw1Var10;
                    this.k = 1;
                } else {
                    od0Var.o();
                    this.o = null;
                    this.k = 1;
                }
            }
        }
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (j == 0) {
            if (this.k != 3) {
                a();
                return;
            }
            vh0 vh0Var = this.h;
            vh0Var.a.clear();
            vh0Var.b = 0;
            this.i.clear();
            return;
        }
        for (rh0 rh0Var : this.w) {
            zh0 zh0Var = rh0Var.b;
            int iP = qz1.p(zh0Var.f, j2, false);
            while (true) {
                if (iP < 0) {
                    iP = -1;
                    break;
                } else if ((zh0Var.g[iP] & 1) != 0) {
                    break;
                } else {
                    iP--;
                }
            }
            if (iP == -1) {
                iP = zh0Var.a(j2);
            }
            rh0Var.e = iP;
            ne0 ne0Var = rh0Var.d;
            if (ne0Var != null) {
                ne0Var.b = false;
                ne0Var.c = 0;
            }
        }
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        if ((this.b & 16) == 0) {
            pd0Var = new md(pd0Var, this.a);
        }
        this.v = pd0Var;
    }

    public sh0() {
        this(pi0.e, 16);
    }
}
