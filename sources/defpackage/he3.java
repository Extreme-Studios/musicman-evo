package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class he3 implements bg3 {
    public final bg3 a;
    public final cy0 b;

    public he3(bg3 bg3Var, cy0 cy0Var) {
        this.a = bg3Var;
        this.b = cy0Var;
    }

    @Override // defpackage.bg3
    public final cy0 a() {
        return this.b;
    }

    @Override // defpackage.bg3
    public final int b() {
        return this.a.b();
    }

    public final boolean c(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof he3) {
            return this.a.equals(((he3) obj).a);
        }
        return false;
    }

    @Override // defpackage.bg3
    public final de3 d(int i) {
        return this.b.d[this.a.t(i)];
    }

    public final boolean equals(Object obj) {
        if (c(obj) && (obj instanceof he3)) {
            return this.b.equals(((he3) obj).b);
        }
        return false;
    }

    @Override // defpackage.bg3
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.bg3
    public final de3 h() {
        return this.b.d[this.a.f()];
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.bg3
    public final int m0(int i) {
        return this.a.m0(i);
    }

    @Override // defpackage.bg3
    public final int t(int i) {
        return this.a.t(i);
    }
}
