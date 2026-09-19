package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ef3 implements af3 {
    public final af3 a;
    public final long b;

    public ef3(af3 af3Var, long j) {
        this.a = af3Var;
        this.b = j;
    }

    @Override // defpackage.af3
    public final int a(us2 us2Var, lt2 lt2Var, int i) {
        int iA = this.a.a(us2Var, lt2Var, i);
        if (iA != -4) {
            return iA;
        }
        lt2Var.f += this.b;
        return -4;
    }

    @Override // defpackage.af3
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.af3
    public final int f(long j) {
        return this.a.f(j - this.b);
    }

    @Override // defpackage.af3
    public final void h() {
        this.a.h();
    }
}
