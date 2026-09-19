package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class al0 implements nl0 {
    public final jk0 a;
    public final oe0 b = new oe0(10, new byte[10]);
    public int c = 0;
    public int d;
    public ry1 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public al0(jk0 jk0Var) {
        this.a = jk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [oe0] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [jk0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.nl0
    public final void a(int i, cw1 cw1Var) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        ?? r10;
        long jC;
        this.e.getClass();
        int i6 = i & 1;
        ?? r3 = this.a;
        int i7 = -1;
        int i8 = 2;
        ?? r7 = 0;
        int i9 = 1;
        if (i6 != 0) {
            int i10 = this.c;
            if (i10 != 0 && i10 != 1) {
                if (i10 != 2) {
                    int i11 = this.j;
                    if (i11 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i11);
                        sb.append(" more bytes");
                        s90.Q("PesReader", sb.toString());
                    }
                    r3.c(cw1Var.c == 0);
                } else {
                    s90.Q("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i12 = i;
        while (cw1Var.B() > 0) {
            int i13 = this.c;
            if (i13 != 0) {
                ?? r11 = this.b;
                if (i13 != i9) {
                    if (i13 != i8) {
                        int iB = cw1Var.B();
                        int i14 = this.j;
                        if (i14 == i7) {
                            r10 = r7;
                        } else {
                            i5 = iB - i14;
                        }
                        if (r10 > 0) {
                            r10 = i5;
                            iB -= r10;
                            cw1Var.C(cw1Var.b + iB);
                        }
                        r10 = i5;
                        r3.b(cw1Var);
                        int i15 = this.j;
                        if (i15 != i7) {
                            int i16 = i15 - iB;
                            this.j = i16;
                            if (i16 == 0) {
                                r3.c(r7);
                                this.c = i9;
                                this.d = r7;
                            }
                        }
                    } else {
                        if (b(cw1Var, r11.a, Math.min(10, this.i)) && b(cw1Var, null, this.i)) {
                            r11.l(r7);
                            if (this.f) {
                                r11.o(4);
                                long jR = r11.r(3);
                                r11.o(i9);
                                int iR = r11.r(15) << 15;
                                r11.o(i9);
                                long jR2 = r11.r(15);
                                r11.o(i9);
                                if (!this.h && this.g) {
                                    r11.o(4);
                                    long jR3 = ((long) r11.r(3)) << 30;
                                    r11.o(i9);
                                    int iR2 = r11.r(15) << 15;
                                    r11.o(i9);
                                    long jR4 = r11.r(15);
                                    r11.o(i9);
                                    this.e.c(jR3 | ((long) iR2) | jR4);
                                    this.h = true;
                                }
                                jC = this.e.c(jR2 | (jR << 30) | ((long) iR));
                            } else {
                                jC = -9223372036854775807L;
                            }
                            i12 |= true != this.k ? 0 : 4;
                            r3.d(i12, jC);
                            this.c = 3;
                            this.d = 0;
                            r7 = 0;
                            i7 = -1;
                            i8 = 2;
                            i9 = 1;
                        }
                    }
                    ?? r14 = r7;
                    i2 = i8;
                    z = r14 == true ? 1 : 0;
                    i3 = i9;
                } else {
                    ?? r5 = r7;
                    if (b(cw1Var, r11.a, 9)) {
                        r11.l(r5 == true ? 1 : 0);
                        int iR3 = r11.r(24);
                        i3 = 1;
                        if (iR3 != 1) {
                            ec.u(new StringBuilder(String.valueOf(iR3).length() + 30), "Unexpected start code prefix: ", iR3, "PesReader");
                            i7 = -1;
                            this.j = -1;
                            i4 = 0;
                            i2 = 2;
                        } else {
                            r11.o(8);
                            int iR4 = r11.r(16);
                            r11.o(5);
                            this.k = r11.q();
                            i2 = 2;
                            r11.o(2);
                            this.f = r11.q();
                            this.g = r11.q();
                            r11.o(6);
                            int iR5 = r11.r(8);
                            this.i = iR5;
                            if (iR4 == 0) {
                                this.j = -1;
                                i4 = 2;
                                i7 = -1;
                            } else {
                                int i17 = (iR4 - 3) - iR5;
                                this.j = i17;
                                if (i17 < 0) {
                                    ec.u(new StringBuilder(String.valueOf(i17).length() + 36), "Found negative packet payload size: ", i17, "PesReader");
                                    i7 = -1;
                                    this.j = -1;
                                } else {
                                    i7 = -1;
                                }
                                i4 = 2;
                            }
                        }
                        this.c = i4;
                        z = false;
                        this.d = 0;
                    } else {
                        z = r5 == true ? 1 : 0;
                        i7 = -1;
                        i2 = 2;
                        i3 = 1;
                    }
                }
            } else {
                ?? r15 = r7;
                i2 = i8;
                z = r15 == true ? 1 : 0;
                i3 = i9;
                cw1Var.G(cw1Var.B());
            }
            int i18 = i2;
            r7 = z;
            i8 = i18;
            i9 = i3;
        }
    }

    public final boolean b(cw1 cw1Var, byte[] bArr, int i) {
        int iMin = Math.min(cw1Var.B(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            cw1Var.G(iMin);
        } else {
            cw1Var.H(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.nl0
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // defpackage.nl0
    public final void d(ry1 ry1Var, pd0 pd0Var, ml0 ml0Var) {
        this.e = ry1Var;
        this.a.e(pd0Var, ml0Var);
    }
}
