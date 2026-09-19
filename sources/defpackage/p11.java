package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class p11 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final vj2 i;
    public final vj2 j;
    public final vj2 k;
    public final vj2 l;
    public final vj2 m;
    public final int n;
    public final int o;
    public final vj2 p;
    public final k01 q;
    public final vj2 r;
    public final vj2 s;
    public final boolean t;
    public final vk2 u;
    public final bk2 v;

    static {
        new p11(new a11());
        String str = qz1.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
        Integer.toString(37, 36);
        Integer.toString(38, 36);
    }

    public p11(a11 a11Var) {
        this.a = a11Var.a;
        this.b = a11Var.b;
        this.c = a11Var.c;
        this.d = a11Var.d;
        this.e = a11Var.e;
        this.f = a11Var.f;
        this.g = a11Var.g;
        this.h = a11Var.h;
        this.i = a11Var.i;
        this.j = a11Var.j;
        this.k = a11Var.k;
        this.l = a11Var.l;
        this.n = a11Var.n;
        this.m = a11Var.m;
        this.o = a11Var.o;
        this.p = a11Var.p;
        this.q = a11Var.q;
        this.r = a11Var.r;
        this.t = a11Var.s;
        this.s = a11Var.t;
        this.u = vk2.a(a11Var.u);
        this.v = bk2.j(a11Var.v);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p11 p11Var = (p11) obj;
        if (this.a != p11Var.a || this.b != p11Var.b || this.c != p11Var.c || this.d != p11Var.d || this.h != p11Var.h || this.e != p11Var.e || this.f != p11Var.f || this.g != p11Var.g || !this.i.equals(p11Var.i) || !this.j.equals(p11Var.j) || !this.k.equals(p11Var.k) || !this.l.equals(p11Var.l) || this.n != p11Var.n || !this.m.equals(p11Var.m) || this.o != p11Var.o || !this.p.equals(p11Var.p) || !this.q.equals(p11Var.q) || !this.s.equals(p11Var.s) || !this.r.equals(p11Var.r) || this.t != p11Var.t) {
            return false;
        }
        vk2 vk2Var = p11Var.u;
        vk2 vk2Var2 = this.u;
        vk2Var2.getClass();
        return ej1.w(vk2Var, vk2Var2) && this.v.equals(p11Var.v);
    }

    public int hashCode() {
        return this.v.hashCode() + ((this.u.hashCode() + ((this.s.hashCode() + ((((this.r.hashCode() + ((((this.p.hashCode() + ((((this.m.hashCode() + ((((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.n) * 31)) * 31) + this.o) * 31)) * 31) + 29791) * 961)) * 961) + (this.t ? 1 : 0)) * 31)) * 887503681)) * 31);
    }
}
