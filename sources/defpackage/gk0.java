package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class gk0 implements jk0 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public me0 h;
    public me0 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public me0 v;
    public long w;
    public final oe0 b = new oe0(7, new byte[7]);
    public final cw1 c = new cw1(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public gk0(String str, int i, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    @Override // defpackage.jk0
    public final void a() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.jk0
    public final void b(cw1 cw1Var) throws no0 {
        byte b;
        int i;
        int i2;
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        this.h.getClass();
        String str = qz1.a;
        while (cw1Var.B() > 0) {
            int i10 = this.j;
            cw1 cw1Var2 = this.c;
            oe0 oe0Var = this.b;
            int i11 = 4;
            int i12 = 3;
            byte b2 = -1;
            int i13 = 0;
            int i14 = 1;
            if (i10 == 0) {
                byte[] bArr = cw1Var.a;
                int i15 = cw1Var.b;
                int i16 = cw1Var.c;
                while (true) {
                    if (i15 < i16) {
                        int i17 = i15 + 1;
                        int i18 = i12;
                        byte b3 = bArr[i15];
                        int i19 = b3 & 255;
                        if (this.l == 512 && (((((byte) i19) & 255 ? 1 : 0) | 65280 ? 1 : 0) & 65526) == 65520) {
                            if (!this.n) {
                                int i20 = i15 - 1;
                                cw1Var.E(i15);
                                byte[] bArr2 = oe0Var.a;
                                if (cw1Var.B() < i14) {
                                    i14 = i14;
                                } else {
                                    cw1Var.H(bArr2, i13, i14);
                                    oe0Var.l(i11);
                                    int iR = oe0Var.r(i14);
                                    int i21 = this.o;
                                    if (i21 == -1 || iR == i21) {
                                        if (this.p != -1) {
                                            byte[] bArr3 = oe0Var.a;
                                            if (cw1Var.B() >= i14) {
                                                cw1Var.H(bArr3, i13, i14);
                                                oe0Var.l(2);
                                                i7 = 4;
                                                i5 = i14;
                                                if (oe0Var.r(4) == this.p) {
                                                    cw1Var.E(i17);
                                                } else {
                                                    i14 = i5;
                                                }
                                            }
                                        } else {
                                            i5 = i14;
                                            i7 = 4;
                                        }
                                        byte[] bArr4 = oe0Var.a;
                                        if (cw1Var.B() >= i7) {
                                            cw1Var.H(bArr4, i13, i7);
                                            oe0Var.l(14);
                                            int iR2 = oe0Var.r(13);
                                            if (iR2 >= 7) {
                                                byte[] bArr5 = cw1Var.a;
                                                int i22 = cw1Var.c;
                                                int i23 = i20 + iR2;
                                                if (i23 < i22) {
                                                    byte b4 = bArr5[i23];
                                                    b = -1;
                                                    if (b4 == -1) {
                                                        int i24 = i23 + 1;
                                                        if (i24 != i22) {
                                                            byte b5 = bArr5[i24];
                                                            if ((((b5 & 255 ? 1 : 0) | 65280 ? 1 : 0) & 65526) == 65520 && ((b5 & 8) >> 3) == iR) {
                                                            }
                                                        }
                                                    } else if (b4 == 73 && ((i8 = i23 + 1) == i22 || (bArr5[i8] == 68 && ((i9 = i23 + 2) == i22 || bArr5[i9] == 51)))) {
                                                    }
                                                }
                                            } else {
                                                b = -1;
                                            }
                                            i14 = i5;
                                        }
                                        this.q = (b3 & 8) >> 3;
                                        i6 = i5;
                                        if (i6 != ((b3 & 1) ^ 1)) {
                                            z = 0;
                                        } else {
                                            z = i6;
                                        }
                                        this.m = z;
                                        if (this.n) {
                                            this.j = i18;
                                            this.k = 0;
                                        } else {
                                            this.j = i6;
                                            this.k = 0;
                                        }
                                        cw1Var.E(i17);
                                    } else {
                                        b = -1;
                                    }
                                    i = this.l;
                                    i2 = i19 | i;
                                    if (i2 == 329) {
                                        c = 256;
                                        c2 = 2;
                                        i12 = 3;
                                        i3 = 0;
                                        i4 = 768;
                                    } else if (i2 == 511) {
                                        c = 256;
                                        c2 = 2;
                                        i12 = 3;
                                        i3 = 0;
                                        i4 = 512;
                                    } else if (i2 == 836) {
                                        c = 256;
                                        c2 = 2;
                                        i12 = 3;
                                        i3 = 0;
                                        i4 = 1024;
                                    } else if (i2 != 1075) {
                                        c = 256;
                                        if (i != 256) {
                                            this.l = 256;
                                            b2 = b;
                                            i11 = 4;
                                            i12 = 3;
                                            i13 = 0;
                                        } else {
                                            c2 = 2;
                                            i12 = 3;
                                            i3 = 0;
                                            byte b6 = b;
                                            i13 = i3;
                                            b2 = b6;
                                            i15 = i17;
                                            i11 = 4;
                                        }
                                    } else {
                                        this.j = 2;
                                        this.k = 3;
                                        this.t = 0;
                                        cw1Var2.E(0);
                                        cw1Var.E(i17);
                                    }
                                    this.l = i4;
                                    byte b7 = b;
                                    i13 = i3;
                                    b2 = b7;
                                    i15 = i17;
                                    i11 = 4;
                                }
                                b = -1;
                                i = this.l;
                                i2 = i19 | i;
                                if (i2 == 329) {
                                    c = 256;
                                    c2 = 2;
                                    i12 = 3;
                                    i3 = 0;
                                    i4 = 768;
                                } else if (i2 == 511) {
                                    c = 256;
                                    c2 = 2;
                                    i12 = 3;
                                    i3 = 0;
                                    i4 = 512;
                                } else if (i2 == 836) {
                                    c = 256;
                                    c2 = 2;
                                    i12 = 3;
                                    i3 = 0;
                                    i4 = 1024;
                                } else if (i2 != 1075) {
                                    c = 256;
                                    if (i != 256) {
                                        this.l = 256;
                                        b2 = b;
                                        i11 = 4;
                                        i12 = 3;
                                        i13 = 0;
                                    } else {
                                        c2 = 2;
                                        i12 = 3;
                                        i3 = 0;
                                        byte b8 = b;
                                        i13 = i3;
                                        b2 = b8;
                                        i15 = i17;
                                        i11 = 4;
                                    }
                                } else {
                                    this.j = 2;
                                    this.k = 3;
                                    this.t = 0;
                                    cw1Var2.E(0);
                                    cw1Var.E(i17);
                                }
                                this.l = i4;
                                byte b9 = b;
                                i13 = i3;
                                b2 = b9;
                                i15 = i17;
                                i11 = 4;
                            }
                            i5 = i14;
                            this.q = (b3 & 8) >> 3;
                            i6 = i5;
                            if (i6 != ((b3 & 1) ^ 1)) {
                                z = 0;
                            } else {
                                z = i6;
                            }
                            this.m = z;
                            if (this.n) {
                                this.j = i6;
                                this.k = 0;
                            } else {
                                this.j = i18;
                                this.k = 0;
                            }
                            cw1Var.E(i17);
                        } else {
                            b = b2;
                        }
                        i14 = i14;
                        i = this.l;
                        i2 = i19 | i;
                        if (i2 == 329) {
                            c = 256;
                            c2 = 2;
                            i12 = 3;
                            i3 = 0;
                            i4 = 768;
                        } else if (i2 == 511) {
                            c = 256;
                            c2 = 2;
                            i12 = 3;
                            i3 = 0;
                            i4 = 512;
                        } else if (i2 == 836) {
                            c = 256;
                            c2 = 2;
                            i12 = 3;
                            i3 = 0;
                            i4 = 1024;
                        } else if (i2 != 1075) {
                            c = 256;
                            if (i != 256) {
                                this.l = 256;
                                b2 = b;
                                i11 = 4;
                                i12 = 3;
                                i13 = 0;
                            } else {
                                c2 = 2;
                                i12 = 3;
                                i3 = 0;
                                byte b10 = b;
                                i13 = i3;
                                b2 = b10;
                                i15 = i17;
                                i11 = 4;
                            }
                        } else {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            cw1Var2.E(0);
                            cw1Var.E(i17);
                        }
                        this.l = i4;
                        byte b11 = b;
                        i13 = i3;
                        b2 = b11;
                        i15 = i17;
                        i11 = 4;
                    } else {
                        cw1Var.E(i15);
                    }
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    byte[] bArr6 = cw1Var2.a;
                    int iMin = Math.min(cw1Var.B(), 10 - this.k);
                    cw1Var.H(bArr6, this.k, iMin);
                    int i25 = this.k + iMin;
                    this.k = i25;
                    if (i25 == 10) {
                        this.i.a(cw1Var2, 10, 0);
                        cw1Var2.E(6);
                        me0 me0Var = this.i;
                        int iG = cw1Var2.g() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = me0Var;
                        this.w = 0L;
                        this.t = iG;
                    }
                } else if (i10 != 3) {
                    int iMin2 = Math.min(cw1Var.B(), this.t - this.k);
                    this.v.a(cw1Var, iMin2, 0);
                    int i26 = this.k + iMin2;
                    this.k = i26;
                    if (i26 == this.t) {
                        hn.M(this.u != -9223372036854775807L);
                        this.v.c(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                } else {
                    int i27 = true != this.m ? 5 : 7;
                    byte[] bArr7 = oe0Var.a;
                    int iMin3 = Math.min(cw1Var.B(), i27 - this.k);
                    cw1Var.H(bArr7, this.k, iMin3);
                    int i28 = this.k + iMin3;
                    this.k = i28;
                    if (i28 == i27) {
                        oe0Var.l(0);
                        if (this.r) {
                            oe0Var.o(10);
                        } else {
                            int iR3 = oe0Var.r(2) + 1;
                            if (iR3 != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(iR3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(iR3);
                                sb.append(", but assuming AAC LC.");
                                s90.Q("AdtsReader", sb.toString());
                            }
                            oe0Var.o(5);
                            int iR4 = oe0Var.r(3);
                            int i29 = this.p;
                            byte[] bArr8 = {(byte) (((i29 >> 1) & 7) | 16), (byte) (((iR4 << 3) & 120) | ((i29 << 7) & 128))};
                            tc0 tc0VarA = hn.A(new oe0(2, bArr8), false);
                            uc3 uc3Var = new uc3();
                            uc3Var.a = this.g;
                            uc3Var.d(this.f);
                            uc3Var.e("audio/mp4a-latm");
                            uc3Var.i = tc0VarA.a;
                            uc3Var.D = tc0VarA.c;
                            uc3Var.E = tc0VarA.b;
                            uc3Var.o = Collections.singletonList(bArr8);
                            uc3Var.d = this.d;
                            uc3Var.f = this.e;
                            de3 de3Var = new de3(uc3Var);
                            this.s = 1024000000 / ((long) de3Var.F);
                            this.h.d(de3Var);
                            this.r = true;
                        }
                        oe0Var.o(4);
                        int iR5 = oe0Var.r(13);
                        int i30 = iR5 - 7;
                        if (this.m) {
                            i30 = iR5 - 9;
                        }
                        me0 me0Var2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = me0Var2;
                        this.w = j;
                        this.t = i30;
                    }
                }
            } else if (cw1Var.B() != 0) {
                oe0Var.a[0] = cw1Var.a[cw1Var.b];
                oe0Var.l(2);
                int iR6 = oe0Var.r(4);
                int i31 = this.p;
                if (i31 == -1 || iR6 == i31) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = iR6;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = 256;
                }
            }
        }
    }

    @Override // defpackage.jk0
    public final void d(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.jk0
    public final void e(pd0 pd0Var, ml0 ml0Var) {
        ml0Var.a();
        ml0Var.b();
        this.g = ml0Var.e;
        ml0Var.b();
        me0 me0VarZ = pd0Var.z(ml0Var.d, 1);
        this.h = me0VarZ;
        this.v = me0VarZ;
        if (!this.a) {
            this.i = new id0();
            return;
        }
        ml0Var.a();
        ml0Var.b();
        me0 me0VarZ2 = pd0Var.z(ml0Var.d, 5);
        this.i = me0VarZ2;
        uc3 uc3Var = new uc3();
        ml0Var.b();
        uc3Var.a = ml0Var.e;
        uc3Var.d(this.f);
        uc3Var.e("application/id3");
        me0VarZ2.d(new de3(uc3Var));
    }

    @Override // defpackage.jk0
    public final void c(boolean z) {
    }
}
