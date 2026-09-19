package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uj2 extends vj2 {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ vj2 j;

    public uj2(vj2 vj2Var, int i, int i2) {
        this.j = vj2Var;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.rj2
    public final Object[] b() {
        return this.j.b();
    }

    @Override // defpackage.rj2
    public final int c() {
        return this.j.c() + this.h;
    }

    @Override // defpackage.rj2
    public final int d() {
        return this.j.c() + this.h + this.i;
    }

    @Override // defpackage.rj2
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hn.P(i, this.i);
        return this.j.get(i + this.h);
    }

    @Override // defpackage.vj2, java.util.List
    /* JADX INFO: renamed from: h */
    public final vj2 subList(int i, int i2) {
        hn.R(i, i2, this.i);
        int i3 = this.h;
        return this.j.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
