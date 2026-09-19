package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class wg0 implements nd0 {
    public pd0 e;
    public me0 f;
    public int h;
    public am0 i;
    public long k;
    public long l;
    public int n;
    public yg0 o;
    public boolean p;
    public final cw1 a = new cw1(10);
    public final zd0 b = new zd0();
    public final wd0 c = new wd0();
    public long j = -9223372036854775807L;
    public final kc2 d = new kc2(10);
    public me0 g = new id0();
    public long m = -1;

    static {
        int i = yd.p;
    }

    public final boolean a(od0 od0Var, boolean z) throws EOFException {
        int iM;
        int i;
        int iV;
        od0Var.i();
        long jO = od0Var.o();
        int i2 = true != z ? 131072 : 32768;
        if (jO == 0) {
            am0 am0VarL = this.d.l(od0Var, null, i2);
            this.i = am0VarL;
            if (am0VarL != null) {
                this.c.a(am0VarL);
            }
            iM = (int) od0Var.m();
            if (!z) {
                od0Var.t(iM);
            }
            i = 0;
        } else {
            iM = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (b(od0Var)) {
                if (i3 > 0) {
                    break;
                }
                h();
                throw new EOFException();
            }
            cw1 cw1Var = this.a;
            cw1Var.E(0);
            int iB = cw1Var.b();
            if ((i == 0 || ((-128000) & iB) == (((long) i) & (-128000))) && (iV = s90.v(iB)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.b.a(iB);
                    i = iB;
                }
                od0Var.A(iV - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    h();
                    throw new EOFException();
                }
                if (z) {
                    od0Var.i();
                    od0Var.A(iM + i5);
                } else {
                    od0Var.t(1);
                }
                i3 = 0;
                i4 = i5;
                i = 0;
            }
        }
        if (z) {
            od0Var.t(iM + i4);
        } else {
            od0Var.i();
        }
        this.h = i;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final boolean b(od0 od0Var) {
        yg0 yg0Var = this.o;
        if (yg0Var != null) {
            long jD = yg0Var.d();
            if (jD == -1 || od0Var.m() <= jD - 4) {
                try {
                    if (!od0Var.B(this.a.a, 0, 4, true)) {
                        return false;
                    }
                } catch (EOFException unused) {
                }
            }
        } else if (!od0Var.B(this.a.a, 0, 4, true)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) {
        return a(od0Var, true);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x027c  */
    /* JADX WARN: Code duplicated, block: B:108:0x028c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0290  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:133:0x02df  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:139:0x0315  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:147:0x033b  */
    /* JADX WARN: Code duplicated, block: B:162:0x036e  */
    /* JADX WARN: Code duplicated, block: B:198:0x047d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0488 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:201:0x048a  */
    /* JADX WARN: Code duplicated, block: B:216:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:219:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[PHI: r14 r22
  0x008d: PHI (r14v8 wd0) = (r14v5 wd0), (r14v5 wd0), (r14v5 wd0), (r14v18 wd0) binds: [B:127:0x02cd, B:134:0x02e1, B:116:0x02a6, B:33:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r22v2 cw1) = (r22v0 cw1), (r22v0 cw1), (r22v0 cw1), (r22v4 cw1) binds: [B:127:0x02cd, B:134:0x02e1, B:116:0x02a6, B:33:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dc A[LOOP:4: B:77:0x01da->B:78:0x01dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0207  */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException {
        cw1 cw1Var;
        int i;
        int i2;
        int iB;
        int i3;
        int iB2;
        int i4;
        int iB3;
        cw1 cw1Var2;
        int iB4;
        int iH;
        long jP;
        long[] jArr;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        wd0 wd0Var;
        long j2;
        long j3;
        long j4;
        int i9;
        long jS;
        long j5;
        yg0 ug0Var;
        long jS2;
        long[] jArr2;
        int i10;
        il0 il0Var;
        il0 il0Var2;
        char c;
        long jR;
        vg0 vg0Var;
        yg0 ug0Var2;
        wd0 wd0Var2;
        int iK;
        this.f.getClass();
        String str = qz1.a;
        if (this.h == 0) {
            try {
                a(od0Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        yg0 yg0Var = this.o;
        cw1 cw1Var3 = this.a;
        zd0 zd0Var = this.b;
        if (yg0Var != null) {
            cw1Var = cw1Var3;
            long j6 = this.l;
            if (j6 != 0) {
                long j7 = ((fd0) od0Var).i;
                if (j7 < j6) {
                    i = 0;
                    ((fd0) od0Var).b((int) (j6 - j7), false);
                }
            }
            i2 = this.n;
            if (i2 == 0) {
                ((fd0) od0Var).k = i;
                if (b(od0Var)) {
                    return -1;
                }
                cw1Var.E(i);
                iB2 = cw1Var.b();
                if (((-128000) & iB2) == (((long) this.h) & (-128000)) || s90.v(iB2) == -1) {
                    ((fd0) od0Var).b(1, false);
                    this.h = 0;
                    return 0;
                }
                zd0Var.a(iB2);
                if (this.j == -9223372036854775807L) {
                    this.j = this.o.f(((fd0) od0Var).i);
                }
                i2 = zd0Var.b;
                this.n = i2;
                this.m = ((fd0) od0Var).i + ((long) i2);
                i = 0;
            }
            iB = this.g.b(od0Var, i2, true);
            if (iB == -1) {
                return -1;
            }
            i3 = this.n - iB;
            this.n = i3;
            if (i3 > 0) {
                return i;
            }
            this.g.c(((this.k * 1000000) / ((long) zd0Var.c)) + this.j, 1, zd0Var.b, 0, null);
            this.k += (long) zd0Var.f;
            this.n = 0;
            return 0;
        }
        cw1 cw1Var4 = new cw1(zd0Var.b);
        ((fd0) od0Var).B(cw1Var4.a, 0, zd0Var.b, false);
        int i11 = zd0Var.a & 1;
        int i12 = zd0Var.d;
        if (i11 != 0) {
            if (i12 != 1) {
                i4 = 36;
            } else {
                i4 = 21;
            }
        } else if (i12 != 1) {
            i4 = 21;
        } else {
            i4 = 13;
        }
        if (cw1Var4.c >= i4 + 4) {
            cw1Var4.E(i4);
            iB3 = cw1Var4.b();
            if (iB3 != 1483304551) {
                if (iB3 == 1231971951) {
                    iB3 = 1231971951;
                } else if (cw1Var4.c >= 40) {
                    cw1Var4.E(36);
                    if (cw1Var4.b() == 1447187017) {
                        iB3 = 1447187017;
                    } else {
                        iB3 = 0;
                    }
                } else {
                    iB3 = 0;
                }
            }
        } else if (cw1Var4.c >= 40) {
            cw1Var4.E(36);
            if (cw1Var4.b() == 1447187017) {
                iB3 = 1447187017;
            } else {
                iB3 = 0;
            }
        } else {
            iB3 = 0;
        }
        wd0 wd0Var3 = this.c;
        if (iB3 == 1231971951) {
            cw1Var2 = cw1Var3;
            iB4 = cw1Var4.b();
            if ((iB4 & 1) != 0) {
                iH = cw1Var4.h();
            } else {
                iH = -1;
            }
            if ((iB4 & 2) != 0) {
                jP = cw1Var4.P();
            } else {
                jP = -1;
            }
            if ((iB4 & 4) == 4) {
                jArr2 = new long[100];
                for (i10 = 0; i10 < 100; i10++) {
                    jArr2[i10] = cw1Var4.K();
                }
                jArr = jArr2;
            } else {
                jArr = null;
            }
            if ((iB4 & 8) != 0) {
                cw1Var4.G(4);
            }
            if (cw1Var4.B() >= 24) {
                cw1Var4.G(21);
                int iO = cw1Var4.O();
                i6 = iO >> 12;
                i5 = iO & 4095;
            } else {
                i5 = -1;
                i6 = -1;
            }
            j = iH;
            i7 = zd0Var.b;
            int i13 = zd0Var.c;
            i8 = zd0Var.e;
            int i14 = zd0Var.f;
            wd0Var = wd0Var3;
            if ((wd0Var.a != -1 || wd0Var.b == -1) && i6 != -1 && i5 != -1) {
                wd0Var.a = i6;
                wd0Var.b = i5;
            }
            fd0 fd0Var = (fd0) od0Var;
            j2 = fd0Var.h;
            j3 = fd0Var.i;
            if (j2 != -1 || jP == -1) {
                j4 = j3;
            } else {
                j4 = j3;
                long j8 = j4 + jP;
                if (j2 != j8) {
                    i7 = i7;
                    StringBuilder sb = new StringBuilder(String.valueOf(j8).length() + String.valueOf(j2).length() + 53 + 20);
                    ec.w(sb, "Data size mismatch between stream (", j2, ") and Xing frame (");
                    sb.append(j8);
                    sb.append("), using Xing value.");
                    s90.K("Mp3Extractor", sb.toString());
                }
                fd0Var.b(zd0Var.b, false);
                if (iB3 == 1483304551) {
                    if (j != -1 || j == 0) {
                        jS2 = -9223372036854775807L;
                    } else {
                        jS2 = qz1.s(i13, (j * ((long) i14)) - 1);
                    }
                    if (jS2 != -9223372036854775807L) {
                        ug0Var = null;
                    } else {
                        ug0Var = new ah0(j4, i7, jS2, i8, jP, jArr);
                    }
                } else {
                    i9 = i7;
                    if (j != -1 || j == 0) {
                        jS = -9223372036854775807L;
                    } else {
                        jS = qz1.s(i13, (((long) i14) * j) - 1);
                    }
                    if (jS != -9223372036854775807L) {
                        if (jP != -1) {
                            j2 = j4 + jP;
                            j5 = jP - ((long) i9);
                        } else if (j2 != -1) {
                            j5 = (j2 - j4) - ((long) i9);
                        } else {
                            ug0Var = null;
                        }
                        long j9 = j2;
                        long j10 = j5;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        ug0Var = new ug0(w40.V(qz1.t(j10, 8000000L, jS, roundingMode)), w40.V(jn.l(j10, j, roundingMode)), j9, j4 + ((long) i9));
                    } else {
                        ug0Var = null;
                    }
                }
            }
            fd0Var.b(zd0Var.b, false);
            if (iB3 == 1483304551) {
                if (j != -1) {
                    jS2 = -9223372036854775807L;
                } else {
                    jS2 = -9223372036854775807L;
                }
                if (jS2 != -9223372036854775807L) {
                    ug0Var = null;
                } else {
                    ug0Var = new ah0(j4, i7, jS2, i8, jP, jArr);
                }
            } else {
                i9 = i7;
                if (j != -1) {
                    jS = -9223372036854775807L;
                } else {
                    jS = -9223372036854775807L;
                }
                if (jS != -9223372036854775807L) {
                    if (jP != -1) {
                        j2 = j4 + jP;
                        j5 = jP - ((long) i9);
                    } else if (j2 != -1) {
                        j5 = (j2 - j4) - ((long) i9);
                    } else {
                        ug0Var = null;
                    }
                    long j11 = j2;
                    long j12 = j5;
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    ug0Var = new ug0(w40.V(qz1.t(j12, 8000000L, jS, roundingMode2)), w40.V(jn.l(j12, j, roundingMode2)), j11, j4 + ((long) i9));
                } else {
                    ug0Var = null;
                }
            }
        } else if (iB3 != 1447187017) {
            if (iB3 != 1483304551) {
                ((fd0) od0Var).k = 0;
                cw1Var2 = cw1Var3;
                wd0Var = wd0Var3;
            } else {
                cw1Var2 = cw1Var3;
                iB4 = cw1Var4.b();
                if ((iB4 & 1) != 0) {
                    iH = cw1Var4.h();
                } else {
                    iH = -1;
                }
                if ((iB4 & 2) != 0) {
                    jP = cw1Var4.P();
                } else {
                    jP = -1;
                }
                if ((iB4 & 4) == 4) {
                    jArr2 = new long[100];
                    while (i10 < 100) {
                        jArr2[i10] = cw1Var4.K();
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iB4 & 8) != 0) {
                    cw1Var4.G(4);
                }
                if (cw1Var4.B() >= 24) {
                    cw1Var4.G(21);
                    int iO2 = cw1Var4.O();
                    i6 = iO2 >> 12;
                    i5 = iO2 & 4095;
                } else {
                    i5 = -1;
                    i6 = -1;
                }
                j = iH;
                i7 = zd0Var.b;
                int i15 = zd0Var.c;
                i8 = zd0Var.e;
                int i16 = zd0Var.f;
                wd0Var = wd0Var3;
                if (wd0Var.a != -1) {
                    wd0Var.a = i6;
                    wd0Var.b = i5;
                } else {
                    wd0Var.a = i6;
                    wd0Var.b = i5;
                }
                fd0 fd0Var2 = (fd0) od0Var;
                j2 = fd0Var2.h;
                j3 = fd0Var2.i;
                if (j2 != -1) {
                    j4 = j3;
                } else {
                    j4 = j3;
                }
                fd0Var2.b(zd0Var.b, false);
                if (iB3 == 1483304551) {
                    if (j != -1) {
                        jS2 = -9223372036854775807L;
                    } else {
                        jS2 = -9223372036854775807L;
                    }
                    if (jS2 != -9223372036854775807L) {
                        ug0Var = new ah0(j4, i7, jS2, i8, jP, jArr);
                    }
                } else {
                    i9 = i7;
                    if (j != -1) {
                        jS = -9223372036854775807L;
                    } else {
                        jS = -9223372036854775807L;
                    }
                    if (jS != -9223372036854775807L) {
                        if (jP != -1) {
                            j2 = j4 + jP;
                            j5 = jP - ((long) i9);
                        } else if (j2 != -1) {
                            j5 = (j2 - j4) - ((long) i9);
                        }
                        long j13 = j2;
                        long j14 = j5;
                        RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                        ug0Var = new ug0(w40.V(qz1.t(j14, 8000000L, jS, roundingMode3)), w40.V(jn.l(j14, j, roundingMode3)), j13, j4 + ((long) i9));
                    }
                }
            }
            ug0Var = null;
        } else {
            fd0 fd0Var3 = (fd0) od0Var;
            long j15 = fd0Var3.h;
            long j16 = fd0Var3.i;
            cw1Var4.G(6);
            int iB5 = cw1Var4.b();
            cw1Var2 = cw1Var3;
            long j17 = zd0Var.b;
            long j18 = iB5;
            int iB6 = cw1Var4.b();
            if (iB6 <= 0) {
                wd0Var2 = wd0Var3;
            } else {
                wd0Var2 = wd0Var3;
                long jS3 = qz1.s(zd0Var.c, (((long) iB6) * ((long) zd0Var.f)) - 1);
                int iL = cw1Var4.L();
                int iL2 = cw1Var4.L();
                int iL3 = cw1Var4.L();
                cw1Var4.G(2);
                long j19 = j16 + ((long) zd0Var.b);
                long[] jArr3 = new long[iL];
                long[] jArr4 = new long[iL];
                int i17 = 0;
                while (true) {
                    if (i17 >= iL) {
                        long[] jArr5 = jArr4;
                        long jMax = j16 + j17 + j18;
                        if (j15 != -1 && j15 != jMax) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j15).length() + 27 + String.valueOf(jMax).length());
                            ec.w(sb2, "VBRI data size mismatch: ", j15, ", ");
                            sb2.append(jMax);
                            s90.Q("VbriSeeker", sb2.toString());
                        }
                        if (jMax != j19) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j19).length() + String.valueOf(jMax).length() + 43 + 28);
                            ec.w(sb3, "VBRI bytes and ToC mismatch (using max): ", jMax, ", ");
                            sb3.append(j19);
                            sb3.append("\nSeeking will be inaccurate.");
                            s90.Q("VbriSeeker", sb3.toString());
                            jMax = Math.max(jMax, j19);
                        }
                        ug0Var = new zg0(jArr3, jArr5, jS3, jMax, zd0Var.e);
                        break;
                    }
                    long j20 = j18;
                    jArr3[i17] = (((long) i17) * jS3) / ((long) iL);
                    jArr4[i17] = j19;
                    if (iL3 == 1) {
                        iK = cw1Var4.K();
                    } else if (iL3 == 2) {
                        iK = cw1Var4.L();
                    } else if (iL3 == 3) {
                        iK = cw1Var4.O();
                    } else if (iL3 == 4) {
                        iK = cw1Var4.h();
                    }
                    j19 += ((long) iK) * ((long) iL2);
                    i17++;
                    jArr4 = jArr4;
                    j18 = j20;
                    iL = iL;
                }
                fd0Var3.b(zd0Var.b, false);
                wd0Var = wd0Var2;
            }
            ug0Var = null;
            fd0Var3.b(zd0Var.b, false);
            wd0Var = wd0Var2;
        }
        am0 am0Var = this.i;
        fd0 fd0Var4 = (fd0) od0Var;
        long j21 = fd0Var4.i;
        if (am0Var == null) {
            vg0Var = null;
        } else {
            il0[] il0VarArr = am0Var.a;
            int length = il0VarArr.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    il0Var = null;
                    break;
                }
                il0 il0Var3 = il0VarArr[i18];
                if (eg0.class.isAssignableFrom(il0Var3.getClass())) {
                    il0Var = (il0) eg0.class.cast(il0Var3);
                    if (!bi2.f.b(il0Var)) {
                        il0Var = null;
                    }
                } else {
                    il0Var = null;
                }
                if (il0Var != null) {
                    break;
                }
                i18++;
            }
            eg0 eg0Var = (eg0) il0Var;
            if (eg0Var == null) {
                vg0Var = null;
            } else {
                int length2 = il0VarArr.length;
                int i19 = 0;
                while (true) {
                    if (i19 >= length2) {
                        il0Var2 = null;
                        break;
                    }
                    il0 il0Var4 = il0VarArr[i19];
                    if (gg0.class.isAssignableFrom(il0Var4.getClass())) {
                        il0Var2 = (il0) gg0.class.cast(il0Var4);
                        if (!((gg0) il0Var2).a.equals("TLEN")) {
                            il0Var2 = null;
                        }
                    } else {
                        il0Var2 = null;
                    }
                    if (il0Var2 != null) {
                        break;
                    }
                    i19++;
                }
                gg0 gg0Var = (gg0) il0Var2;
                if (gg0Var == null) {
                    jR = -9223372036854775807L;
                    c = 0;
                } else {
                    vj2 vj2Var = gg0Var.c;
                    c = 0;
                    jR = qz1.r(Long.parseLong((String) vj2Var.get(0)));
                }
                int[] iArr = eg0Var.e;
                int length3 = iArr.length;
                int i20 = length3 + 1;
                long[] jArr6 = new long[i20];
                long[] jArr7 = new long[i20];
                jArr6[c] = j21;
                jArr7[c] = 0;
                long j22 = 0;
                int i21 = 1;
                while (i21 <= length3) {
                    int i22 = i21 - 1;
                    long j23 = j21 + ((long) (eg0Var.c + iArr[i22]));
                    j22 += (long) (eg0Var.d + eg0Var.f[i22]);
                    jArr6[i21] = j23;
                    jArr7[i21] = j22;
                    i21++;
                    iArr = iArr;
                    j21 = j23;
                }
                vg0Var = new vg0(jR, jArr6, jArr7);
            }
        }
        if (this.p) {
            ug0Var2 = new xg0(-9223372036854775807L, 0L);
            cw1Var = cw1Var2;
        } else {
            if (vg0Var != null) {
                ug0Var = vg0Var;
            } else if (ug0Var == null) {
                ug0Var = null;
            }
            cw1Var = cw1Var2;
            if (ug0Var == null) {
                fd0Var4.B(cw1Var.a, 0, 4, false);
                cw1Var.E(0);
                zd0Var.a(cw1Var.b());
                ug0Var2 = new ug0(zd0Var.e, zd0Var.b, fd0Var4.h, fd0Var4.i);
            } else {
                ug0Var2 = ug0Var;
            }
        }
        this.o = ug0Var2;
        this.e.v(ug0Var2);
        uc3 uc3Var = new uc3();
        uc3Var.d("audio/mpeg");
        uc3Var.e((String) zd0Var.g);
        uc3Var.m = 4096;
        uc3Var.D = zd0Var.d;
        uc3Var.E = zd0Var.c;
        uc3Var.G = wd0Var.a;
        uc3Var.H = wd0Var.b;
        uc3Var.j = this.i;
        if (this.o.e() != -2147483647) {
            uc3Var.g = this.o.e();
        }
        this.g.d(new de3(uc3Var));
        this.l = fd0Var4.i;
        i = 0;
        i2 = this.n;
        if (i2 == 0) {
            ((fd0) od0Var).k = i;
            if (b(od0Var)) {
                return -1;
            }
            cw1Var.E(i);
            iB2 = cw1Var.b();
            if (((-128000) & iB2) == (((long) this.h) & (-128000))) {
            }
            ((fd0) od0Var).b(1, false);
            this.h = 0;
            return 0;
        }
        iB = this.g.b(od0Var, i2, true);
        if (iB == -1) {
            return -1;
        }
        i3 = this.n - iB;
        this.n = i3;
        if (i3 > 0) {
            return i;
        }
        this.g.c(((this.k * 1000000) / ((long) zd0Var.c)) + this.j, 1, zd0Var.b, 0, null);
        this.k += (long) zd0Var.f;
        this.n = 0;
        return 0;
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        this.h = 0;
        this.j = -9223372036854775807L;
        this.k = 0L;
        this.n = 0;
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.e = pd0Var;
        me0 me0VarZ = pd0Var.z(0, 1);
        this.f = me0VarZ;
        this.g = me0VarZ;
        this.e.s();
    }

    public final void h() {
        yg0 yg0Var = this.o;
        if ((yg0Var instanceof ug0) && ((ug0) yg0Var).c()) {
            long j = this.m;
            if (j == -1 || j == this.o.d()) {
                return;
            }
            ug0 ug0Var = (ug0) this.o;
            this.o = new ug0(ug0Var.h, ug0Var.i, this.m, ug0Var.g);
            pd0 pd0Var = this.e;
            pd0Var.getClass();
            pd0Var.v(this.o);
            this.f.getClass();
            this.o.a();
        }
    }
}
