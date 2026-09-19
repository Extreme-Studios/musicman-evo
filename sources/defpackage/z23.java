package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z23 implements j33 {
    public final f13 a;
    public final ig b;

    public z23(ig igVar, f13 f13Var) {
        kt2 kt2Var = x13.a;
        this.b = igVar;
        this.a = f13Var;
    }

    @Override // defpackage.j33
    public final d23 a() {
        f13 f13Var = this.a;
        if (f13Var instanceof d23) {
            return ((d23) f13Var).p();
        }
        b23 b23Var = (b23) ((d23) f13Var).v(5, null);
        boolean zH = b23Var.g.h();
        d23 d23Var = b23Var.g;
        if (!zH) {
            return d23Var;
        }
        d23Var.getClass();
        d33.c.a(d23Var.getClass()).h(d23Var);
        d23Var.i();
        return b23Var.g;
    }

    @Override // defpackage.j33
    public final int b(d23 d23Var) {
        return d23Var.zzt.hashCode();
    }

    @Override // defpackage.j33
    public final void c(Object obj, Object obj2) {
        k33.d(obj, obj2);
    }

    @Override // defpackage.j33
    public final boolean d(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.j33
    public final int e(d23 d23Var) {
        p33 p33Var = d23Var.zzt;
        int i = p33Var.d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < p33Var.a; i2++) {
            int i3 = p33Var.b[i2] >>> 3;
            n13 n13Var = (n13) p33Var.c[i2];
            int iA = u13.a(8);
            int iA2 = u13.a(i3) + u13.a(16);
            int iA3 = u13.a(24);
            int iD = n13Var.d();
            iB += iA + iA + iA2 + g72.b(iD, iD, iA3);
        }
        p33Var.d = iB;
        return iB;
    }

    @Override // defpackage.j33
    public final void f(Object obj, j52 j52Var) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.j33
    public final void g(Object obj, n9 n9Var, v13 v13Var) {
        this.b.getClass();
        ig.j(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.j33
    public final void h(Object obj) {
        this.b.getClass();
        p33 p33Var = ((d23) obj).zzt;
        if (p33Var.e) {
            p33Var.e = false;
        }
        kt2 kt2Var = x13.a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.j33
    public final void i(Object obj, byte[] bArr, int i, int i2, i13 i13Var) {
        d23 d23Var = (d23) obj;
        if (d23Var.zzt == p33.f) {
            d23Var.zzt = p33.a();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.j33
    public final boolean j(d23 d23Var, d23 d23Var2) {
        return d23Var.zzt.equals(d23Var2.zzt);
    }
}
