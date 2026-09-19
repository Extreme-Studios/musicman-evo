package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yk0 implements jk0 {
    public String e;
    public me0 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final cw1 a = new cw1(2, new byte[15]);
    public final oe0 b = new oe0();
    public final cw1 c = new cw1();
    public final bh0 p = new bh0();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override // defpackage.jk0
    public final void a() {
        this.d = 0;
        this.l = 0;
        this.a.y(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:156:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:160:0x030d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0317  */
    /* JADX WARN: Instruction removed from duplicated block: B:156:0x02f2, please report this as an issue */
    @Override // defpackage.jk0
    public final void b(cw1 cw1Var) throws no0 {
        int i;
        int i2;
        int iR;
        int iR2;
        int i3;
        char c;
        byte[] bArr;
        long j;
        long j2;
        qk2 qk2VarJ;
        char c2;
        int iR3;
        char c3;
        long j3;
        this.f.getClass();
        while (cw1Var.B() > 0) {
            int i4 = this.d;
            int i5 = 8;
            int i6 = 1;
            if (i4 == 0) {
                int i7 = this.k;
                if ((i7 & 2) != 0) {
                    if ((i7 & 4) == 0) {
                        while (cw1Var.B() > 0) {
                            int i8 = this.l << 8;
                            this.l = i8;
                            int iK = i8 | cw1Var.K();
                            this.l = iK;
                            if ((iK & 16777215) == 12583333) {
                                cw1Var.E(cw1Var.b - 3);
                                this.l = 0;
                            }
                        }
                    }
                    this.d = 1;
                    break;
                }
                cw1Var.E(cw1Var.c);
            } else {
                bh0 bh0Var = this.p;
                cw1 cw1Var2 = this.c;
                if (i4 != 1) {
                    int i9 = bh0Var.g;
                    if (i9 == 1 || i9 == 17) {
                        int i10 = cw1Var.b;
                        int iMin = Math.min(cw1Var.B(), cw1Var2.B());
                        cw1Var.H(cw1Var2.a, cw1Var2.b, iMin);
                        cw1Var2.G(iMin);
                        cw1Var.E(i10);
                    }
                    int iMin2 = Math.min(cw1Var.B(), bh0Var.i - this.n);
                    this.f.a(cw1Var, iMin2, 0);
                    int i11 = this.n + iMin2;
                    this.n = i11;
                    if (i11 != bh0Var.i) {
                        continue;
                    } else {
                        int i12 = bh0Var.g;
                        if (i12 == 1) {
                            byte[] bArr2 = cw1Var2.a;
                            oe0 oe0Var = new oe0(bArr2.length, bArr2);
                            int iR4 = oe0Var.r(8);
                            char c4 = 5;
                            int iR5 = oe0Var.r(5);
                            if (iR5 != 31) {
                                switch (iR5) {
                                    case 0:
                                        iR2 = 96000;
                                        break;
                                    case 1:
                                        iR2 = 88200;
                                        break;
                                    case 2:
                                        iR2 = 64000;
                                        break;
                                    case 3:
                                        iR2 = 48000;
                                        break;
                                    case 4:
                                        iR2 = 44100;
                                        break;
                                    case 5:
                                        iR2 = 32000;
                                        break;
                                    case 6:
                                        iR2 = 24000;
                                        break;
                                    case 7:
                                        iR2 = 22050;
                                        break;
                                    case 8:
                                        iR2 = 16000;
                                        break;
                                    case 9:
                                        iR2 = 12000;
                                        break;
                                    case 10:
                                        iR2 = 11025;
                                        break;
                                    case 11:
                                        iR2 = 8000;
                                        break;
                                    case 12:
                                        iR2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        StringBuilder sb = new StringBuilder(String.valueOf(iR5).length() + 32);
                                        sb.append("Unsupported sampling rate index ");
                                        sb.append(iR5);
                                        throw no0.b(sb.toString());
                                    case 15:
                                        iR2 = 57600;
                                        break;
                                    case 16:
                                        iR2 = 51200;
                                        break;
                                    case 17:
                                        iR2 = 40000;
                                        break;
                                    case 18:
                                        iR2 = 38400;
                                        break;
                                    case 19:
                                        iR2 = 34150;
                                        break;
                                    case 20:
                                        iR2 = 28800;
                                        break;
                                    case zw0.zzm /* 21 */:
                                        iR2 = 25600;
                                        break;
                                    case 22:
                                        iR2 = 20000;
                                        break;
                                    case 23:
                                        iR2 = 19200;
                                        break;
                                    case 24:
                                        iR2 = 17075;
                                        break;
                                    case 25:
                                        iR2 = 14400;
                                        break;
                                    case 26:
                                        iR2 = 12800;
                                        break;
                                    case 27:
                                        iR2 = 9600;
                                        break;
                                }
                            } else {
                                iR2 = oe0Var.r(24);
                            }
                            int iR6 = oe0Var.r(3);
                            int i13 = 4;
                            if (iR6 == 0) {
                                i3 = 768;
                            } else if (iR6 == 1) {
                                i3 = 1024;
                            } else if (iR6 == 2 || iR6 == 3) {
                                i3 = 2048;
                            } else {
                                if (iR6 != 4) {
                                    StringBuilder sb2 = new StringBuilder(g72.a(iR6, 36));
                                    sb2.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb2.append(iR6);
                                    throw no0.b(sb2.toString());
                                }
                                i3 = 4096;
                            }
                            int i14 = i3;
                            if (iR6 == 0 || iR6 == 1) {
                                c = 0;
                            } else if (iR6 == 2) {
                                c = 2;
                            } else if (iR6 == 3) {
                                c = 3;
                            } else {
                                if (iR6 != 4) {
                                    StringBuilder sb3 = new StringBuilder(g72.a(iR6, 36));
                                    sb3.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb3.append(iR6);
                                    throw no0.b(sb3.toString());
                                }
                                c = 1;
                            }
                            oe0Var.o(2);
                            dq.G(oe0Var);
                            int iR7 = oe0Var.r(5);
                            int i15 = 0;
                            int iK2 = 0;
                            while (true) {
                                int i16 = i6;
                                int i17 = 16;
                                if (i15 < iR7 + 1) {
                                    int iR8 = oe0Var.r(3);
                                    iK2 = dq.K(oe0Var, 5, 8, 16) + 1 + iK2;
                                    if ((iR8 == 0 || iR8 == 2) && oe0Var.q()) {
                                        dq.G(oe0Var);
                                    }
                                    i15++;
                                    i6 = i16;
                                } else {
                                    int iK3 = dq.K(oe0Var, 4, 8, 16) + 1;
                                    oe0Var.m();
                                    int i18 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i18 < iK3) {
                                            int iR9 = oe0Var.r(2);
                                            if (iR9 == 0) {
                                                c2 = c4;
                                                oe0Var.o(3);
                                                if (oe0Var.q()) {
                                                    oe0Var.o(13);
                                                }
                                                if (c > 0) {
                                                    dq.I(oe0Var);
                                                }
                                            } else if (iR9 != i16) {
                                                if (iR9 == 3) {
                                                    dq.K(oe0Var, i13, i5, i17);
                                                    int iK4 = dq.K(oe0Var, i13, i5, i17);
                                                    if (oe0Var.q()) {
                                                        dq.K(oe0Var, i5, i17, 0);
                                                    }
                                                    oe0Var.m();
                                                    if (iK4 > 0) {
                                                        oe0Var.o(iK4 * 8);
                                                    }
                                                }
                                                c2 = 5;
                                            } else {
                                                oe0Var.o(3);
                                                boolean zQ = oe0Var.q();
                                                if (zQ) {
                                                    oe0Var.o(13);
                                                }
                                                if (zQ) {
                                                    oe0Var.m();
                                                }
                                                if (c > 0) {
                                                    dq.I(oe0Var);
                                                    iR3 = oe0Var.r(2);
                                                    c3 = c;
                                                } else {
                                                    iR3 = 0;
                                                    c3 = 0;
                                                }
                                                if (iR3 > 0) {
                                                    oe0Var.o(6);
                                                    int iR10 = oe0Var.r(2);
                                                    oe0Var.o(i13);
                                                    c2 = 5;
                                                    if (oe0Var.q()) {
                                                        oe0Var.o(5);
                                                    }
                                                    if (iR3 == 2 || iR3 == 3) {
                                                        oe0Var.o(6);
                                                    }
                                                    if (iR10 == 2) {
                                                        oe0Var.m();
                                                    }
                                                } else {
                                                    c2 = 5;
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iK2 - 1) / Math.log(2.0d))) + 1;
                                                int iR11 = oe0Var.r(2);
                                                if (iR11 > 0 && oe0Var.q()) {
                                                    oe0Var.o(iFloor);
                                                }
                                                if (oe0Var.q()) {
                                                    oe0Var.o(iFloor);
                                                }
                                                if (c3 == 0 && iR11 == 0) {
                                                    oe0Var.m();
                                                }
                                            }
                                            i18++;
                                            c4 = c2;
                                            i5 = 8;
                                            i17 = 16;
                                            i13 = 4;
                                            i16 = 1;
                                        } else {
                                            if (oe0Var.q()) {
                                                int i19 = 8;
                                                int iK5 = dq.K(oe0Var, 2, 4, 8) + 1;
                                                int i20 = 0;
                                                bArr = null;
                                                while (i20 < iK5) {
                                                    int iK6 = dq.K(oe0Var, 4, i19, 16);
                                                    int iK7 = dq.K(oe0Var, 4, i19, 16);
                                                    if (iK6 == 7) {
                                                        int iR12 = oe0Var.r(4) + 1;
                                                        oe0Var.o(4);
                                                        byte[] bArr3 = new byte[iR12];
                                                        for (int i21 = 0; i21 < iR12; i21++) {
                                                            bArr3[i21] = (byte) oe0Var.r(i19);
                                                        }
                                                        bArr = bArr3;
                                                    } else {
                                                        oe0Var.o(iK7 * i19);
                                                    }
                                                    i20++;
                                                    i19 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iR2) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (((double) iR2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = bh0Var.h;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String strConcat = iR4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iR4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            qk2VarJ = null;
                                                        } else {
                                                            qk2VarJ = vj2.j(qz1.b, bArr);
                                                        }
                                                        uc3 uc3Var = new uc3();
                                                        uc3Var.a = this.e;
                                                        uc3Var.d("video/mp2t");
                                                        uc3Var.e("audio/mhm1");
                                                        uc3Var.E = this.q;
                                                        uc3Var.i = strConcat;
                                                        uc3Var.o = qk2VarJ;
                                                        this.f.d(new de3(uc3Var));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (((double) iR2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = bh0Var.h;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iR4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            qk2VarJ = null;
                                                        } else {
                                                            qk2VarJ = null;
                                                        }
                                                        uc3 uc3Var2 = new uc3();
                                                        uc3Var2.a = this.e;
                                                        uc3Var2.d("video/mp2t");
                                                        uc3Var2.e("audio/mhm1");
                                                        uc3Var2.E = this.q;
                                                        uc3Var2.i = strConcat;
                                                        uc3Var2.o = qk2VarJ;
                                                        this.f.d(new de3(uc3Var2));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (((double) iR2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = bh0Var.h;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iR4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            qk2VarJ = null;
                                                        } else {
                                                            qk2VarJ = null;
                                                        }
                                                        uc3 uc3Var3 = new uc3();
                                                        uc3Var3.a = this.e;
                                                        uc3Var3.d("video/mp2t");
                                                        uc3Var3.e("audio/mhm1");
                                                        uc3Var3.E = this.q;
                                                        uc3Var3.i = strConcat;
                                                        uc3Var3.o = qk2VarJ;
                                                        this.f.d(new de3(uc3Var3));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (((double) iR2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = bh0Var.h;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iR4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            qk2VarJ = null;
                                                        } else {
                                                            qk2VarJ = null;
                                                        }
                                                        uc3 uc3Var4 = new uc3();
                                                        uc3Var4.a = this.e;
                                                        uc3Var4.d("video/mp2t");
                                                        uc3Var4.e("audio/mhm1");
                                                        uc3Var4.E = this.q;
                                                        uc3Var4.i = strConcat;
                                                        uc3Var4.o = qk2VarJ;
                                                        this.f.d(new de3(uc3Var4));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iR2).length() + 26);
                                                    sb4.append("Unsupported sampling rate ");
                                                    sb4.append(iR2);
                                                    throw no0.b(sb4.toString());
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i12 == 17) {
                                byte[] bArr4 = cw1Var2.a;
                                oe0 oe0Var2 = new oe0(bArr4.length, bArr4);
                                if (oe0Var2.q()) {
                                    oe0Var2.o(2);
                                    iR = oe0Var2.r(13);
                                } else {
                                    iR = 0;
                                }
                                this.s = iR;
                            } else if (i12 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                int i22 = this.r - this.s;
                                double d2 = this.q;
                                long jRound = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += (((double) i22) * 1000000.0d) / d2;
                                }
                                this.f.c(jRound, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                } else {
                    int iB = cw1Var.B();
                    cw1 cw1Var3 = this.a;
                    int iMin3 = Math.min(iB, cw1Var3.B());
                    cw1Var.H(cw1Var3.a, cw1Var3.b, iMin3);
                    cw1Var3.G(iMin3);
                    if (cw1Var3.B() == 0) {
                        int i23 = cw1Var3.c;
                        byte[] bArr5 = cw1Var3.a;
                        oe0 oe0Var3 = this.b;
                        oe0Var3.a = bArr5;
                        oe0Var3.b = 0;
                        oe0Var3.c = 0;
                        oe0Var3.d = i23;
                        oe0Var3.i();
                        int iK8 = dq.K(oe0Var3, 3, 8, 8);
                        bh0Var.g = iK8;
                        if (iK8 != -1) {
                            hn.v(Math.max(Math.max(2, 8), 32) <= 63);
                            Math.addExact(Math.addExact(3L, 255L), 4294967296L);
                            if (oe0Var3.f() < 2) {
                                j3 = -1;
                            } else {
                                long jT = oe0Var3.t(2);
                                if (jT == 3) {
                                    if (oe0Var3.f() >= 8) {
                                        long jT2 = oe0Var3.t(8);
                                        long j4 = jT2 + 3;
                                        if (jT2 != 255) {
                                            jT = j4;
                                        } else if (oe0Var3.f() >= 32) {
                                            jT = oe0Var3.t(32) + j4;
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jT;
                            }
                            bh0Var.h = j3;
                            if (j3 != -1) {
                                if (j3 > 16) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(j3).length() + 49);
                                    sb5.append("Contains sub-stream with an invalid packet label ");
                                    sb5.append(j3);
                                    throw no0.b(sb5.toString());
                                }
                                if (j3 == 0) {
                                    int i24 = bh0Var.g;
                                    if (i24 == 1) {
                                        throw no0.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i24 == 2) {
                                        throw no0.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i24 == 17) {
                                        throw no0.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iK9 = dq.K(oe0Var3, 11, 24, 24);
                                bh0Var.i = iK9;
                                if (iK9 != -1) {
                                    this.n = 0;
                                    this.o = iK9 + i23 + this.o;
                                    cw1Var3.E(0);
                                    this.f.a(cw1Var3, cw1Var3.c, 0);
                                    cw1Var3.y(2);
                                    cw1Var2.y(bh0Var.i);
                                    this.m = true;
                                    this.d = 2;
                                }
                            }
                        }
                        int i25 = cw1Var3.c;
                        if (i25 < 15) {
                            cw1Var3.C(i25 + 1);
                        }
                    }
                    this.m = false;
                }
            }
        }
    }

    @Override // defpackage.jk0
    public final void d(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.i) {
                this.h = d;
            } else {
                this.g = d;
            }
        }
    }

    @Override // defpackage.jk0
    public final void e(pd0 pd0Var, ml0 ml0Var) {
        ml0Var.a();
        ml0Var.b();
        this.e = ml0Var.e;
        ml0Var.b();
        this.f = pd0Var.z(ml0Var.d, 1);
    }

    @Override // defpackage.jk0
    public final void c(boolean z) {
    }
}
