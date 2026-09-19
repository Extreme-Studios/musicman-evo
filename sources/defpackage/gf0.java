package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gf0 implements nd0 {
    public final cw1 a = new cw1(4);
    public final cw1 b = new cw1(9);
    public final cw1 c = new cw1(11);
    public final cw1 d = new cw1();
    public final hf0 e;
    public pd0 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public ff0 o;
    public jf0 p;

    static {
        int i = a23.G;
    }

    public gf0() {
        hf0 hf0Var = new hf0(new id0());
        hf0Var.h = -9223372036854775807L;
        hf0Var.i = new long[0];
        hf0Var.j = new long[0];
        this.e = hf0Var;
        this.g = 1;
    }

    public final cw1 a(od0 od0Var) {
        int i = this.l;
        cw1 cw1Var = this.d;
        byte[] bArr = cw1Var.a;
        if (i > bArr.length) {
            int length = bArr.length;
            cw1Var.z(0, new byte[Math.max(length + length, i)]);
        } else {
            cw1Var.E(0);
        }
        cw1Var.C(this.l);
        od0Var.x(cw1Var.a, 0, this.l);
        return cw1Var;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) throws EOFException, InterruptedIOException {
        cw1 cw1Var = this.a;
        fd0 fd0Var = (fd0) od0Var;
        fd0Var.B(cw1Var.a, 0, 3, false);
        cw1Var.E(0);
        if (cw1Var.O() == 4607062) {
            fd0Var.B(cw1Var.a, 0, 2, false);
            cw1Var.E(0);
            if ((cw1Var.L() & 250) == 0) {
                fd0Var.B(cw1Var.a, 0, 4, false);
                cw1Var.E(0);
                int iB = cw1Var.b();
                fd0Var.k = 0;
                fd0Var.e(iB, false);
                fd0Var.B(cw1Var.a, 0, 4, false);
                cw1Var.E(0);
                if (cw1Var.b() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0296  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:105:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:179:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0176  */
    /* JADX WARN: Code duplicated, block: B:64:0x017a  */
    /* JADX WARN: Code duplicated, block: B:66:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x018d  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x022e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0294  */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws EOFException, InterruptedIOException, no0 {
        int i;
        long j;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        jf0 jf0Var;
        cw1 cw1VarA;
        int i2;
        int i3;
        boolean z3;
        me0 me0Var;
        int iK;
        int i4;
        boolean z4;
        this.f.getClass();
        while (true) {
            int i5 = this.g;
            if (i5 == 1) {
                cw1 cw1Var = this.b;
                if (!((fd0) od0Var).w(cw1Var.a, 0, 9, true)) {
                    return -1;
                }
                cw1Var.E(0);
                cw1Var.G(4);
                int iK2 = cw1Var.K();
                int i6 = iK2 & 4;
                int i7 = iK2 & 1;
                if (i6 != 0 && this.o == null) {
                    this.o = new ff0(this.f.z(8, 1));
                }
                if (i7 != 0 && this.p == null) {
                    this.p = new jf0(this.f.z(9, 2));
                }
                this.f.s();
                this.j = cw1Var.b() - 5;
                this.g = 2;
            } else if (i5 == 2) {
                ((fd0) od0Var).b(this.j, false);
                this.j = 0;
                this.g = 3;
            } else if (i5 == 3) {
                cw1 cw1Var2 = this.c;
                if (!((fd0) od0Var).w(cw1Var2.a, 0, 11, true)) {
                    return -1;
                }
                cw1Var2.E(0);
                this.k = cw1Var2.K();
                this.l = cw1Var2.O();
                this.m = cw1Var2.O();
                this.m = (((long) (cw1Var2.K() << 24)) | this.m) * 1000;
                cw1Var2.G(3);
                this.g = 4;
            } else {
                if (i5 != 4) {
                    j7.a();
                    return 0;
                }
                boolean z5 = this.h;
                hf0 hf0Var = this.e;
                if (z5) {
                    j = 1000;
                    i = 3;
                    j2 = this.i + this.m;
                } else {
                    i = 3;
                    j = 1000;
                    j2 = hf0Var.h == -9223372036854775807L ? 0L : this.m;
                }
                long j4 = j2;
                int i8 = this.k;
                if (i8 != 8) {
                    int i9 = 4;
                    if (i8 == 9) {
                        j3 = -9223372036854775807L;
                        if (i8 == 18 || this.n) {
                            ((fd0) od0Var).b(this.l, false);
                            z = false;
                            z2 = false;
                        } else {
                            cw1 cw1VarA2 = a(od0Var);
                            hf0Var.getClass();
                            if (cw1VarA2.K() == 2 && "onMetaData".equals(hf0.R1(cw1VarA2)) && cw1VarA2.B() != 0 && cw1VarA2.K() == 8) {
                                HashMap mapS1 = hf0.S1(cw1VarA2);
                                Object obj = mapS1.get("duration");
                                if (obj instanceof Double) {
                                    double dDoubleValue = ((Double) obj).doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        hf0Var.h = (long) (dDoubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = mapS1.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        hf0Var.i = new long[size];
                                        hf0Var.j = new long[size];
                                        for (int i10 = 0; i10 < size; i10++) {
                                            Object obj5 = list.get(i10);
                                            Object obj6 = list2.get(i10);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                hf0Var.i = new long[0];
                                                hf0Var.j = new long[0];
                                                break;
                                            }
                                            hf0Var.i[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            hf0Var.j[i10] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j5 = hf0Var.h;
                            if (j5 != -9223372036854775807L) {
                                this.f.v(new yd0(j5, hf0Var.j, hf0Var.i));
                                this.n = true;
                            }
                            z2 = true;
                        }
                    } else if (this.p != null) {
                        if (!this.n) {
                            this.f.v(new sd0(-9223372036854775807L, 0L));
                            this.n = true;
                        }
                        jf0Var = this.p;
                        cw1VarA = a(od0Var);
                        jf0Var.getClass();
                        int iK3 = cw1VarA.K();
                        i2 = iK3 >> 4;
                        i3 = iK3 & 15;
                        if (i3 == 7) {
                            throw new if0(ec.j(new StringBuilder(String.valueOf(i3).length() + 28), "Video format not supported: ", i3));
                        }
                        jf0Var.m = i2;
                        if (i2 != 5) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            me0Var = (me0) jf0Var.f;
                            iK = cw1VarA.K();
                            cw1VarA.v(i);
                            byte[] bArr = cw1VarA.a;
                            int i11 = cw1VarA.b;
                            int i12 = i11 + 1;
                            cw1VarA.b = i12;
                            j3 = -9223372036854775807L;
                            int i13 = bArr[i11] & 255;
                            int i14 = i11 + 2;
                            cw1VarA.b = i14;
                            int i15 = bArr[i12] & 255;
                            cw1VarA.b = i11 + 3;
                            long j6 = (i15 << 8) | ((i13 << 24) >> 8) | (bArr[i14] & 255);
                            if (iK == 0) {
                                if (iK != 1 && jf0Var.k) {
                                    int i16 = jf0Var.m == 1 ? 1 : 0;
                                    if (jf0Var.l) {
                                        i4 = i16;
                                    } else if (i16 != 0) {
                                        i4 = 1;
                                    }
                                    cw1 cw1Var3 = jf0Var.i;
                                    byte[] bArr2 = cw1Var3.a;
                                    bArr2[0] = 0;
                                    bArr2[1] = 0;
                                    bArr2[2] = 0;
                                    int i17 = 4 - jf0Var.j;
                                    int i18 = 0;
                                    while (cw1VarA.B() > 0) {
                                        cw1VarA.H(cw1Var3.a, i17, jf0Var.j);
                                        cw1Var3.E(0);
                                        cw1 cw1Var4 = jf0Var.h;
                                        int iH = cw1Var3.h();
                                        cw1Var4.E(0);
                                        me0Var.a(cw1Var4, i9, 0);
                                        me0Var.a(cw1VarA, iH, 0);
                                        i18 = i18 + 4 + iH;
                                        i9 = 4;
                                    }
                                    ((me0) jf0Var.f).c((j6 * j) + j4, i4, i18, 0, null);
                                    jf0Var.l = true;
                                    z4 = true;
                                }
                                z = z4;
                                z2 = true;
                            } else if (!jf0Var.k) {
                                byte[] bArr3 = new byte[cw1VarA.B()];
                                cw1 cw1Var5 = new cw1(bArr3);
                                cw1VarA.H(bArr3, 0, cw1VarA.B());
                                yc0 yc0VarA = yc0.a(cw1Var5);
                                jf0Var.j = yc0VarA.b;
                                uc3 uc3Var = new uc3();
                                uc3Var.d("video/x-flv");
                                uc3Var.e("video/avc");
                                uc3Var.i = yc0VarA.l;
                                uc3Var.s = yc0VarA.c;
                                uc3Var.t = yc0VarA.d;
                                uc3Var.y = yc0VarA.k;
                                uc3Var.o = yc0VarA.a;
                                me0Var.d(new de3(uc3Var));
                                jf0Var.k = true;
                            }
                            z4 = false;
                            if (z4) {
                            }
                            z2 = true;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        z2 = true;
                    } else {
                        j3 = -9223372036854775807L;
                        ((fd0) od0Var).b(this.l, false);
                        z = false;
                        z2 = false;
                    }
                } else if (this.o != null) {
                    if (!this.n) {
                        this.f.v(new sd0(-9223372036854775807L, 0L));
                        this.n = true;
                    }
                    ff0 ff0Var = this.o;
                    cw1 cw1VarA3 = a(od0Var);
                    me0 me0Var2 = (me0) ff0Var.f;
                    if (ff0Var.h) {
                        cw1VarA3.G(1);
                    } else {
                        int iK4 = cw1VarA3.K();
                        int i19 = iK4 >> 4;
                        ff0Var.j = i19;
                        if (i19 == 2) {
                            int i20 = ff0.k[(iK4 >> 2) & 3];
                            uc3 uc3Var2 = new uc3();
                            uc3Var2.d("video/x-flv");
                            uc3Var2.e("audio/mpeg");
                            uc3Var2.D = 1;
                            uc3Var2.E = i20;
                            me0Var2.d(new de3(uc3Var2));
                            ff0Var.i = true;
                        } else if (i19 == 7 || i19 == 8) {
                            uc3 uc3Var3 = new uc3();
                            uc3Var3.d("video/x-flv");
                            uc3Var3.e(i19 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                            uc3Var3.D = 1;
                            uc3Var3.E = 8000;
                            me0Var2.d(new de3(uc3Var3));
                            ff0Var.i = true;
                        } else if (i19 != 10) {
                            throw new if0(ec.j(new StringBuilder(String.valueOf(i19).length() + 28), "Audio format not supported: ", i19));
                        }
                        ff0Var.h = true;
                    }
                    me0 me0Var3 = (me0) ff0Var.f;
                    if (ff0Var.j == 2) {
                        int iB = cw1VarA3.B();
                        me0Var3.a(cw1VarA3, iB, 0);
                        me0Var3.c(j4, 1, iB, 0, null);
                    } else {
                        int iK5 = cw1VarA3.K();
                        if (iK5 != 0 || ff0Var.i) {
                            if (ff0Var.j != 10 || iK5 == 1) {
                                int iB2 = cw1VarA3.B();
                                me0Var3.a(cw1VarA3, iB2, 0);
                                me0Var3.c(j4, 1, iB2, 0, null);
                            }
                            z2 = true;
                            j3 = -9223372036854775807L;
                        } else {
                            int iB3 = cw1VarA3.B();
                            byte[] bArr4 = new byte[iB3];
                            cw1VarA3.H(bArr4, 0, iB3);
                            tc0 tc0VarA = hn.A(new oe0(iB3, bArr4), false);
                            uc3 uc3Var4 = new uc3();
                            uc3Var4.d("video/x-flv");
                            uc3Var4.e("audio/mp4a-latm");
                            uc3Var4.i = tc0VarA.a;
                            uc3Var4.D = tc0VarA.c;
                            uc3Var4.E = tc0VarA.b;
                            uc3Var4.o = Collections.singletonList(bArr4);
                            me0Var3.d(new de3(uc3Var4));
                            ff0Var.i = true;
                        }
                        z = false;
                        z2 = true;
                        j3 = -9223372036854775807L;
                    }
                    z = true;
                    z2 = true;
                    j3 = -9223372036854775807L;
                } else {
                    i8 = 8;
                    int i21 = 4;
                    if (i8 == 9) {
                        j3 = -9223372036854775807L;
                        if (i8 == 18) {
                        }
                        ((fd0) od0Var).b(this.l, false);
                        z = false;
                        z2 = false;
                    } else if (this.p != null) {
                        if (!this.n) {
                            this.f.v(new sd0(-9223372036854775807L, 0L));
                            this.n = true;
                        }
                        jf0Var = this.p;
                        cw1VarA = a(od0Var);
                        jf0Var.getClass();
                        int iK6 = cw1VarA.K();
                        i2 = iK6 >> 4;
                        i3 = iK6 & 15;
                        if (i3 == 7) {
                            throw new if0(ec.j(new StringBuilder(String.valueOf(i3).length() + 28), "Video format not supported: ", i3));
                        }
                        jf0Var.m = i2;
                        if (i2 != 5) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            me0Var = (me0) jf0Var.f;
                            iK = cw1VarA.K();
                            cw1VarA.v(i);
                            byte[] bArr5 = cw1VarA.a;
                            int i110 = cw1VarA.b;
                            int i111 = i110 + 1;
                            cw1VarA.b = i111;
                            j3 = -9223372036854775807L;
                            int i112 = bArr5[i110] & 255;
                            int i113 = i110 + 2;
                            cw1VarA.b = i113;
                            int i114 = bArr5[i111] & 255;
                            cw1VarA.b = i110 + 3;
                            long j7 = (i114 << 8) | ((i112 << 24) >> 8) | (bArr5[i113] & 255);
                            if (iK == 0) {
                                if (iK != 1) {
                                }
                                if (z4) {
                                }
                                z2 = true;
                            } else if (!jf0Var.k) {
                                byte[] bArr6 = new byte[cw1VarA.B()];
                                cw1 cw1Var6 = new cw1(bArr6);
                                cw1VarA.H(bArr6, 0, cw1VarA.B());
                                yc0 yc0VarA2 = yc0.a(cw1Var6);
                                jf0Var.j = yc0VarA2.b;
                                uc3 uc3Var5 = new uc3();
                                uc3Var5.d("video/x-flv");
                                uc3Var5.e("video/avc");
                                uc3Var5.i = yc0VarA2.l;
                                uc3Var5.s = yc0VarA2.c;
                                uc3Var5.t = yc0VarA2.d;
                                uc3Var5.y = yc0VarA2.k;
                                uc3Var5.o = yc0VarA2.a;
                                me0Var.d(new de3(uc3Var5));
                                jf0Var.k = true;
                            }
                            z4 = false;
                            if (z4) {
                            }
                            z2 = true;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        z2 = true;
                    } else {
                        j3 = -9223372036854775807L;
                        ((fd0) od0Var).b(this.l, false);
                        z = false;
                        z2 = false;
                    }
                }
                if (!this.h && z) {
                    this.h = true;
                    this.i = hf0Var.h == j3 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = 2;
                if (z2) {
                    return 0;
                }
            }
        }
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.f = pd0Var;
    }
}
