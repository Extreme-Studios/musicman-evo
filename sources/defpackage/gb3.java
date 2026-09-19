package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gb3 {
    public final de3 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final ab1 i;

    public gb3(de3 de3Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, ab1 ab1Var) {
        this.a = de3Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = ab1Var;
    }

    public final ya3 a() {
        return new ya3(this.c == 1, this.g, this.e, this.f, this.h);
    }
}
