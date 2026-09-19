package defpackage;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class lk0 implements jk0 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public me0 b;
    public final r52 c;
    public final String d;
    public final cw1 e;
    public final zk0 f;
    public final boolean[] g = new boolean[4];
    public final kk0 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public lk0(r52 r52Var, String str) {
        cw1 cw1Var;
        this.c = r52Var;
        this.d = str;
        kk0 kk0Var = new kk0();
        kk0Var.d = new byte[128];
        this.h = kk0Var;
        if (r52Var != null) {
            this.f = new zk0(178);
            cw1Var = new cw1();
        } else {
            cw1Var = null;
            this.f = null;
        }
        this.e = cw1Var;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.jk0
    public final void a() {
        ss0.h0(this.g);
        kk0 kk0Var = this.h;
        kk0Var.a = false;
        kk0Var.b = 0;
        kk0Var.c = 0;
        zk0 zk0Var = this.f;
        if (zk0Var != null) {
            zk0Var.a();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
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
    public final void b(cw1 cw1Var) {
        zk0 zk0Var;
        kk0 kk0Var;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        long j;
        double d;
        int i6;
        int i7;
        this.b.getClass();
        int i8 = cw1Var.b;
        int i9 = cw1Var.c;
        byte[] bArr = cw1Var.a;
        this.i += (long) cw1Var.B();
        boolean z2 = false;
        this.b.a(cw1Var, cw1Var.B(), 0);
        while (true) {
            int iG0 = ss0.g0(bArr, i8, i9, this.g);
            zk0Var = this.f;
            kk0Var = this.h;
            if (iG0 == i9) {
                break;
            }
            int i10 = iG0 + 3;
            int i11 = cw1Var.a[i10] & 255;
            int i12 = iG0 - i8;
            if (this.k) {
                i = i9;
            } else {
                if (i12 > 0) {
                    kk0Var.a(bArr, i8, iG0);
                }
                ?? r12 = i12 < 0 ? -i12 : z2;
                if (kk0Var.a) {
                    ?? r15 = kk0Var.b - r12;
                    kk0Var.b = r15;
                    if (kk0Var.c == 0 && i11 == 181) {
                        kk0Var.c = r15;
                        i = i9;
                    } else {
                        kk0Var.a = z2;
                        String str = this.a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(kk0Var.d, kk0Var.b);
                        int i13 = bArrCopyOf[4] & 255;
                        byte b = bArrCopyOf[5];
                        i = i9;
                        int i14 = bArrCopyOf[6] & 255;
                        int i15 = ((b & 255) >> 4) | (i13 << 4);
                        int i16 = (bArrCopyOf[7] & 240) >> 4;
                        int i17 = ((b & 15) << 8) | i14;
                        if (i16 == 2) {
                            i3 = i17 * 4;
                            i4 = i15 * 3;
                        } else if (i16 != 3) {
                            if (i16 != 4) {
                                f = 1.0f;
                            } else {
                                i3 = i17 * 121;
                                i4 = i15 * 100;
                            }
                            uc3 uc3Var = new uc3();
                            uc3Var.a = str;
                            uc3Var.d(this.d);
                            uc3Var.e("video/mpeg2");
                            uc3Var.s = i15;
                            uc3Var.t = i17;
                            uc3Var.y = f;
                            uc3Var.o = Collections.singletonList(bArrCopyOf);
                            de3 de3Var = new de3(uc3Var);
                            i5 = (bArrCopyOf[7] & 15) - 1;
                            j = 0;
                            if (i5 >= 0 && i5 < 8) {
                                d = r[i5];
                                byte b2 = bArrCopyOf[kk0Var.c + 9];
                                i6 = (b2 & 96) >> 5;
                                i7 = b2 & 31;
                                if (i6 != i7) {
                                    d *= (((double) i6) + 1.0d) / ((double) (i7 + 1));
                                }
                                j = (long) (1000000.0d / d);
                            }
                            Pair pairCreate = Pair.create(de3Var, Long.valueOf(j));
                            this.b.d((de3) pairCreate.first);
                            this.l = ((Long) pairCreate.second).longValue();
                            this.k = true;
                        } else {
                            i3 = i17 * 16;
                            i4 = i15 * 9;
                        }
                        f = i3 / i4;
                        uc3 uc3Var2 = new uc3();
                        uc3Var2.a = str;
                        uc3Var2.d(this.d);
                        uc3Var2.e("video/mpeg2");
                        uc3Var2.s = i15;
                        uc3Var2.t = i17;
                        uc3Var2.y = f;
                        uc3Var2.o = Collections.singletonList(bArrCopyOf);
                        de3 de3Var2 = new de3(uc3Var2);
                        i5 = (bArrCopyOf[7] & 15) - 1;
                        j = 0;
                        if (i5 >= 0) {
                            d = r[i5];
                            byte b3 = bArrCopyOf[kk0Var.c + 9];
                            i6 = (b3 & 96) >> 5;
                            i7 = b3 & 31;
                            if (i6 != i7) {
                                d *= (((double) i6) + 1.0d) / ((double) (i7 + 1));
                            }
                            j = (long) (1000000.0d / d);
                        }
                        Pair pairCreate2 = Pair.create(de3Var2, Long.valueOf(j));
                        this.b.d((de3) pairCreate2.first);
                        this.l = ((Long) pairCreate2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i = i9;
                    if (i11 == 179) {
                        kk0Var.a = true;
                    }
                }
                kk0Var.a(kk0.e, 0, 3);
            }
            if (zk0Var != null) {
                if (i12 > 0) {
                    zk0Var.d(bArr, i8, iG0);
                    i2 = 0;
                } else {
                    i2 = -i12;
                }
                if (zk0Var.e(i2)) {
                    int iY = ss0.y(zk0Var.d, (byte[]) zk0Var.e);
                    String str2 = qz1.a;
                    byte[] bArr2 = (byte[]) zk0Var.e;
                    cw1 cw1Var2 = this.e;
                    cw1Var2.z(iY, bArr2);
                    this.c.G(this.o, cw1Var2);
                }
                if (i11 == 178) {
                    if (cw1Var.a[iG0 + 2] == 1) {
                        zk0Var.c(178);
                    }
                    i11 = 178;
                }
            }
            if (i11 == 0 || i11 == 179) {
                int i18 = i - iG0;
                if (this.q && this.k) {
                    long j2 = this.o;
                    if (j2 != -9223372036854775807L) {
                        this.b.c(j2, this.p ? 1 : 0, ((int) (this.i - this.n)) - i18, i18, null);
                    }
                }
                if (!this.j || this.q) {
                    this.n = this.i - ((long) i18);
                    long j3 = this.m;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.o;
                        j3 = j4 != -9223372036854775807L ? j4 + this.l : -9223372036854775807L;
                    }
                    this.o = j3;
                    z2 = false;
                    this.p = false;
                    this.m = -9223372036854775807L;
                    z = true;
                    this.j = true;
                } else {
                    z = true;
                    z2 = false;
                }
                this.q = i11 == 0 ? z : z2;
            } else {
                if (i11 == 184) {
                    this.p = true;
                }
                z2 = false;
            }
            i8 = i10;
            i9 = i;
        }
        if (!this.k) {
            kk0Var.a(bArr, i8, i9);
        }
        if (zk0Var != null) {
            zk0Var.d(bArr, i8, i9);
        }
    }

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
    public final void c(boolean z) {
        me0 me0Var = this.b;
        me0Var.getClass();
        if (z) {
            boolean z2 = this.p;
            long j = this.i - this.n;
            me0Var.c(this.o, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // defpackage.jk0
    public final void d(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.jk0
    public final void e(pd0 pd0Var, ml0 ml0Var) {
        ml0Var.a();
        ml0Var.b();
        this.a = ml0Var.e;
        ml0Var.b();
        this.b = pd0Var.z(ml0Var.d, 2);
        r52 r52Var = this.c;
        if (r52Var != null) {
            r52Var.B(pd0Var, ml0Var);
        }
    }
}
