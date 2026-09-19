package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qk0 implements jk0 {
    public final p83 a;
    public long e;
    public String g;
    public me0 h;
    public pk0 i;
    public boolean j;
    public boolean l;
    public final boolean[] f = new boolean[3];
    public final zk0 b = new zk0(7);
    public final zk0 c = new zk0(8);
    public final zk0 d = new zk0(6);
    public long k = -9223372036854775807L;
    public final cw1 m = new cw1();

    public qk0(p83 p83Var) {
        this.a = p83Var;
    }

    @Override // defpackage.jk0
    public final void a() {
        this.e = 0L;
        this.l = false;
        this.k = -9223372036854775807L;
        ss0.h0(this.f);
        this.b.a();
        this.c.a();
        this.d.a();
        ((ts2) this.a.i).m(0);
        pk0 pk0Var = this.i;
        if (pk0Var != null) {
            pk0Var.g = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    @Override // defpackage.jk0
    public final void b(cw1 cw1Var) {
        zk0 zk0Var;
        zk0 zk0Var2;
        zk0 zk0Var3;
        int i;
        this.h.getClass();
        String str = qz1.a;
        int i2 = cw1Var.b;
        int i3 = cw1Var.c;
        byte[] bArr = cw1Var.a;
        this.e += (long) cw1Var.B();
        this.h.a(cw1Var, cw1Var.B(), 0);
        while (true) {
            int iG0 = ss0.g0(bArr, i2, i3, this.f);
            zk0Var = this.d;
            zk0Var2 = this.c;
            zk0Var3 = this.b;
            if (iG0 == i3) {
                break;
            }
            int i4 = bArr[iG0 + 3] & 31;
            int i5 = 3;
            if (iG0 > 0) {
                i = iG0 - 1;
                if (bArr[i] == 0) {
                    i5 = 4;
                } else {
                    i = iG0;
                }
            } else {
                i = iG0;
            }
            int i6 = i5;
            int i7 = i - i2;
            if (i7 > 0) {
                if (!this.j) {
                    zk0Var3.d(bArr, i2, i);
                    zk0Var2.d(bArr, i2, i);
                }
                zk0Var.d(bArr, i2, i);
            }
            int i8 = i3 - i;
            long j = this.e - ((long) i8);
            g(i8, i7 < 0 ? -i7 : 0, j, this.k);
            f(i4, j, this.k);
            i2 = i + i6;
        }
        if (!this.j) {
            zk0Var3.d(bArr, i2, i3);
            zk0Var2.d(bArr, i2, i3);
        }
        zk0Var.d(bArr, i2, i3);
    }

    @Override // defpackage.jk0
    public final void c(boolean z) {
        this.h.getClass();
        String str = qz1.a;
        if (z) {
            ((ts2) this.a.i).m(0);
            g(0, 0, this.e, this.k);
            f(9, this.e, this.k);
            g(0, 0, this.e, this.k);
        }
    }

    @Override // defpackage.jk0
    public final void d(int i, long j) {
        this.k = j;
        int i2 = i & 2;
        this.l = (i2 != 0) | this.l;
    }

    @Override // defpackage.jk0
    public final void e(pd0 pd0Var, ml0 ml0Var) {
        ml0Var.a();
        ml0Var.b();
        this.g = ml0Var.e;
        ml0Var.b();
        me0 me0VarZ = pd0Var.z(ml0Var.d, 2);
        this.h = me0VarZ;
        this.i = new pk0(me0VarZ);
        this.a.t(pd0Var, ml0Var);
    }

    public final void f(int i, long j, long j2) {
        if (!this.j) {
            this.b.c(i);
            this.c.c(i);
        }
        this.d.c(i);
        pk0 pk0Var = this.i;
        boolean z = this.l;
        pk0Var.d = i;
        pk0Var.f = j2;
        pk0Var.e = j;
        pk0Var.k = z;
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
    public final void g(int i, int i2, long j, long j2) {
        ts2 ts2Var = (ts2) this.a.i;
        boolean z = true;
        if (!this.j) {
            zk0 zk0Var = this.b;
            zk0Var.e(i2);
            zk0 zk0Var2 = this.c;
            zk0Var2.e(i2);
            boolean z2 = this.j;
            boolean z3 = zk0Var.c;
            if (z2) {
                if (z3) {
                    x62 x62VarT = ss0.T((byte[]) zk0Var.e, 4, zk0Var.d);
                    ts2Var.k(x62VarT.m);
                    this.i.b.append(x62VarT.d, x62VarT);
                    zk0Var.a();
                } else if (zk0Var2.c) {
                    oe0 oe0Var = new oe0((byte[]) zk0Var2.e, 4, zk0Var2.d);
                    int iP = oe0Var.p();
                    oe0Var.p();
                    oe0Var.a();
                    oe0Var.j();
                    this.i.c.append(iP, new el1(iP));
                    zk0Var2.a();
                }
            } else if (z3 && zk0Var2.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) zk0Var.e, zk0Var.d));
                arrayList.add(Arrays.copyOf((byte[]) zk0Var2.e, zk0Var2.d));
                x62 x62VarT2 = ss0.T((byte[]) zk0Var.e, 4, zk0Var.d);
                oe0 oe0Var2 = new oe0((byte[]) zk0Var2.e, 4, zk0Var2.d);
                int iP2 = oe0Var2.p();
                oe0Var2.p();
                oe0Var2.a();
                oe0Var2.j();
                el1 el1Var = new el1(iP2);
                int i3 = x62VarT2.a;
                int i4 = x62VarT2.b;
                int i5 = x62VarT2.c;
                byte[] bArr = rl1.a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
                me0 me0Var = this.h;
                uc3 uc3Var = new uc3();
                uc3Var.a = this.g;
                uc3Var.d("video/mp2t");
                uc3Var.e("video/avc");
                uc3Var.i = str;
                uc3Var.s = x62VarT2.e;
                uc3Var.t = x62VarT2.f;
                uc3Var.B = new c43(x62VarT2.j, x62VarT2.k, x62VarT2.l, null, x62VarT2.h + 8, x62VarT2.i + 8);
                uc3Var.y = x62VarT2.g;
                uc3Var.o = arrayList;
                int i6 = x62VarT2.m;
                uc3Var.n = i6;
                me0Var.d(new de3(uc3Var));
                this.j = true;
                ts2Var.k(i6);
                this.i.b.append(x62VarT2.d, x62VarT2);
                this.i.c.append(iP2, el1Var);
                zk0Var.a();
                zk0Var2.a();
            }
        }
        zk0 zk0Var3 = this.d;
        if (zk0Var3.e(i2)) {
            int iY = ss0.y(zk0Var3.d, (byte[]) zk0Var3.e);
            byte[] bArr2 = (byte[]) zk0Var3.e;
            cw1 cw1Var = this.m;
            cw1Var.z(iY, bArr2);
            cw1Var.E(4);
            ts2Var.l(j2, cw1Var);
        }
        pk0 pk0Var = this.i;
        boolean z4 = this.j;
        if (pk0Var.d == 9) {
            if (z4 && pk0Var.g) {
                long j3 = pk0Var.e;
                int i7 = i + ((int) (j - j3));
                long j4 = pk0Var.i;
                if (j4 != -9223372036854775807L) {
                    long j5 = pk0Var.h;
                    if (j3 != j5) {
                        pk0Var.a.c(j4, pk0Var.j ? 1 : 0, (int) (j3 - j5), i7, null);
                    }
                }
            }
            pk0Var.h = pk0Var.e;
            pk0Var.i = pk0Var.f;
            pk0Var.j = false;
            pk0Var.g = true;
        }
        boolean z5 = pk0Var.k;
        boolean z6 = pk0Var.j;
        int i8 = pk0Var.d;
        if (i8 != 5 && (!z5 || i8 != 1)) {
            z = false;
        }
        boolean z7 = z6 | z;
        pk0Var.j = z7;
        pk0Var.d = 24;
        if (z7) {
            this.l = false;
        }
    }
}
