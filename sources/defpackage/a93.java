package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a93 {
    public final yc3 a;
    public final int b;
    public final yc3 c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public a93(yc3 yc3Var, yc3 yc3Var2, int i) {
        this.a = yc3Var;
        this.b = i;
        this.c = yc3Var2;
    }

    public static boolean l(yc3 yc3Var) {
        return yc3Var.m != 0;
    }

    public static final void n(yc3 yc3Var) {
        int i = yc3Var.m;
        if (i == 2) {
            hn.M(i == 2);
            yc3Var.m = 1;
            yc3Var.h();
        }
    }

    public final boolean A(h83 h83Var) {
        return h(h83Var, this.a) && h(h83Var, this.c);
    }

    public final void B(long j, long j2) throws Throwable {
        yc3 yc3Var = this.a;
        if (l(yc3Var)) {
            yc3Var.s(j, j2);
        }
        yc3 yc3Var2 = this.c;
        if (yc3Var2 == null || yc3Var2.m == 0) {
            return;
        }
        yc3Var2.s(j, j2);
    }

    public final boolean C(h83 h83Var) {
        yc3 yc3VarM = m(h83Var);
        return yc3VarM == null || yc3VarM.n0() || yc3VarM.t() || yc3VarM.u();
    }

    public final void D() {
        int i;
        yc3 yc3Var = this.a;
        int i2 = yc3Var.m;
        if (i2 == 1 && this.d != 4) {
            hn.M(i2 == 1);
            yc3Var.m = 2;
            yc3Var.d();
            return;
        }
        yc3 yc3Var2 = this.c;
        if (yc3Var2 == null || (i = yc3Var2.m) != 1 || this.d == 3) {
            return;
        }
        hn.M(i == 1);
        yc3Var2.m = 2;
        yc3Var2.d();
    }

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
    public final void a() {
        int i = this.d;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.d = 0;
                return;
            }
            return;
        }
        boolean z = i == 4;
        yc3 yc3Var = this.a;
        yc3 yc3Var2 = this.c;
        if (z) {
            yc3Var2.getClass();
            yc3Var2.a(17, yc3Var);
        } else {
            yc3Var2.getClass();
            yc3Var.a(17, yc3Var2);
        }
        this.d = this.d != 4 ? 1 : 0;
    }

    public final void b() {
        if (!l(this.a)) {
            j(true);
        }
        yc3 yc3Var = this.c;
        if (yc3Var == null || yc3Var.m != 0) {
            return;
        }
        j(false);
    }

    public final int c(h83 h83Var, dg3 dg3Var, c22 c22Var) {
        int iK = k(this.a, h83Var, dg3Var, c22Var);
        return iK == 1 ? k(this.c, h83Var, dg3Var, c22Var) : iK;
    }

    public final void d() {
        yc3 yc3Var = this.a;
        hn.M(yc3Var.m == 0);
        yc3Var.k();
        this.e = false;
        yc3 yc3Var2 = this.c;
        if (yc3Var2 != null) {
            hn.M(yc3Var2.m == 0);
            yc3Var2.k();
            this.f = false;
        }
    }

    public final void e(Object obj) {
        yc3 yc3Var = this.a;
        if (yc3Var.g != 2) {
            return;
        }
        int i = this.d;
        if (i != 4 && i != 1) {
            yc3Var.a(1, obj);
            return;
        }
        yc3 yc3Var2 = this.c;
        yc3Var2.getClass();
        yc3Var2.a(1, obj);
    }

    public final void f(dc0 dc0Var) {
        yc3 yc3Var = this.a;
        if (yc3Var.g == 2) {
            yc3Var.a(7, dc0Var);
            yc3 yc3Var2 = this.c;
            if (yc3Var2 != null) {
                yc3Var2.a(7, dc0Var);
            }
        }
    }

    public final boolean g() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return l(this.a);
        }
        yc3 yc3Var = this.c;
        yc3Var.getClass();
        return yc3Var.m != 0;
    }

    public final boolean h(h83 h83Var, yc3 yc3Var) {
        if (yc3Var == null) {
            return true;
        }
        af3[] af3VarArr = h83Var.c;
        int i = this.b;
        af3 af3Var = af3VarArr[i];
        af3 af3Var2 = yc3Var.n;
        if (af3Var2 == null) {
            return true;
        }
        if (af3Var2 == af3Var && (af3Var == null || yc3Var.n0())) {
            return true;
        }
        h83 h83Var2 = h83Var.m;
        return h83Var2 != null && h83Var2.c[i] == yc3Var.n;
    }

    public final void i(yc3 yc3Var, c22 c22Var) {
        hn.M(this.a == yc3Var || this.c == yc3Var);
        if (l(yc3Var)) {
            if (yc3Var == ((yc3) c22Var.j)) {
                c22Var.k = null;
                c22Var.j = null;
                c22Var.f = true;
            }
            n(yc3Var);
            hn.M(yc3Var.m == 1);
            us2 us2Var = yc3Var.h;
            us2Var.g = null;
            us2Var.h = null;
            yc3Var.m = 0;
            yc3Var.n = null;
            yc3Var.o = null;
            yc3Var.s = false;
            yc3Var.i();
            yc3Var.v = null;
        }
    }

    public final void j(boolean z) {
        if (z) {
            if (this.e) {
                yc3 yc3Var = this.a;
                hn.M(yc3Var.m == 0);
                us2 us2Var = yc3Var.h;
                us2Var.g = null;
                us2Var.h = null;
                yc3Var.j();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            yc3 yc3Var2 = this.c;
            yc3Var2.getClass();
            hn.M(yc3Var2.m == 0);
            us2 us2Var2 = yc3Var2.h;
            us2Var2.g = null;
            us2Var2.h = null;
            yc3Var2.j();
            this.f = false;
        }
    }

    public final int k(yc3 yc3Var, h83 h83Var, dg3 dg3Var, c22 c22Var) {
        int i;
        if (yc3Var != null && yc3Var.m != 0) {
            yc3 yc3Var2 = this.a;
            boolean z = yc3Var != yc3Var2;
            if (yc3Var == yc3Var2 && ((i = this.d) == 2 || i == 4)) {
                return 1;
            }
            if (yc3Var == this.c && this.d == 3) {
                return 1;
            }
            af3 af3Var = yc3Var.n;
            af3[] af3VarArr = h83Var.c;
            int i2 = this.b;
            af3 af3Var2 = af3VarArr[i2];
            boolean zA = dg3Var.a(i2);
            if (!zA || af3Var != af3Var2) {
                if (!yc3Var.s) {
                    bg3 bg3Var = ((bg3[]) dg3Var.h)[i2];
                    int iB = bg3Var != null ? bg3Var.b() : 0;
                    de3[] de3VarArr = new de3[iB];
                    for (int i3 = 0; i3 < iB; i3++) {
                        bg3Var.getClass();
                        de3VarArr[i3] = bg3Var.d(i3);
                    }
                    af3 af3Var3 = af3VarArr[i2];
                    af3Var3.getClass();
                    yc3Var.l0(de3VarArr, af3Var3, h83Var.a(), h83Var.p, h83Var.g.a);
                    return 3;
                }
                if (!yc3Var.u()) {
                    return 0;
                }
                i(yc3Var, c22Var);
                if (!zA || q()) {
                    j(!z);
                    return 1;
                }
            }
        }
        return 1;
    }

    public final yc3 m(h83 h83Var) {
        if (h83Var != null) {
            af3 af3Var = h83Var.c[this.b];
            if (af3Var != null) {
                yc3 yc3Var = this.a;
                if (yc3Var.n == af3Var) {
                    return yc3Var;
                }
                yc3 yc3Var2 = this.c;
                if (yc3Var2 != null && yc3Var2.n == af3Var) {
                    return yc3Var2;
                }
            }
        }
        return null;
    }

    public final boolean o() {
        return this.c != null;
    }

    public final void p() {
        int i;
        hn.M(!q());
        if (l(this.a)) {
            i = 3;
        } else {
            i = 2;
            yc3 yc3Var = this.c;
            if (yc3Var != null && yc3Var.m != 0) {
                i = 4;
            }
        }
        this.d = i;
    }

    public final boolean q() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public final int r() {
        boolean zL = l(this.a);
        int i = 0;
        yc3 yc3Var = this.c;
        if (yc3Var != null && yc3Var.m != 0) {
            i = 1;
        }
        return (zL ? 1 : 0) + i;
    }

    public final void s() {
        int i = this.a.g;
    }

    public final boolean t(h83 h83Var) {
        yc3 yc3VarM = m(h83Var);
        yc3VarM.getClass();
        return yc3VarM.n0();
    }

    public final void u(h83 h83Var) {
        yc3 yc3VarM = m(h83Var);
        yc3VarM.getClass();
        yc3VarM.s = true;
    }

    public final void v(dg3 dg3Var, dg3 dg3Var2) {
        int i;
        int i2 = this.b;
        boolean zA = dg3Var.a(i2);
        boolean zA2 = dg3Var2.a(i2);
        yc3 yc3Var = this.a;
        yc3 yc3Var2 = this.c;
        if (yc3Var2 == null || (i = this.d) == 3 || (i == 0 && l(yc3Var))) {
            yc3Var2 = yc3Var;
        }
        if (!zA || yc3Var2.s) {
            return;
        }
        int i3 = yc3Var.g;
        z83 z83Var = ((z83[]) dg3Var.g)[i2];
        z83 z83Var2 = ((z83[]) dg3Var2.g)[i2];
        if (zA2 && Objects.equals(z83Var2, z83Var) && !q()) {
            return;
        }
        yc3Var2.s = true;
    }

    public final void w() {
        int i;
        yc3 yc3Var = this.a;
        if (l(yc3Var) && (i = this.d) != 4 && i != 2) {
            yc3Var.s = true;
        }
        yc3 yc3Var2 = this.c;
        if (yc3Var2 == null || yc3Var2.m == 0 || this.d == 3) {
            return;
        }
        yc3Var2.s = true;
    }

    public final void x() {
        yc3 yc3Var = this.a;
        if (l(yc3Var)) {
            yc3Var.r();
            return;
        }
        yc3 yc3Var2 = this.c;
        if (yc3Var2 == null || yc3Var2.m == 0) {
            return;
        }
        yc3Var2.r();
    }

    public final boolean y() {
        yc3 yc3Var = this.a;
        boolean zU = l(yc3Var) ? yc3Var.u() : true;
        yc3 yc3Var2 = this.c;
        return (yc3Var2 == null || yc3Var2.m == 0) ? zU : yc3Var2.u() & zU;
    }

    public final boolean z(h83 h83Var) {
        int i = this.d;
        return ((i == 2 || i == 4) && m(h83Var) == this.a) || (this.d == 3 && m(h83Var) == this.c);
    }
}
