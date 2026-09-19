package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ed3 implements af3 {
    public final af3 a;
    public boolean b;
    public final /* synthetic */ fd3 c;

    public ed3(fd3 fd3Var, af3 af3Var) {
        this.c = fd3Var;
        this.a = af3Var;
    }

    @Override // defpackage.af3
    public final int a(us2 us2Var, lt2 lt2Var, int i) {
        fd3 fd3Var = this.c;
        if (fd3Var.n()) {
            return -3;
        }
        if (this.b) {
            lt2Var.a = 4;
            return -4;
        }
        long j = fd3Var.j();
        int iA = this.a.a(us2Var, lt2Var, i);
        if (iA != -5) {
            long j2 = fd3Var.j;
            if (j2 == Long.MIN_VALUE || ((iA != -4 || lt2Var.f < j2) && !(iA == -3 && j == Long.MIN_VALUE && !lt2Var.e))) {
                return iA;
            }
            lt2Var.a();
            lt2Var.a = 4;
            this.b = true;
            return -4;
        }
        de3 de3Var = (de3) us2Var.h;
        de3Var.getClass();
        int i2 = de3Var.I;
        int i3 = de3Var.H;
        if (i3 == 0) {
            if (i2 == 0) {
                return -5;
            }
            i3 = 0;
        }
        if (fd3Var.j != Long.MIN_VALUE) {
            i2 = 0;
        }
        uc3 uc3Var = new uc3(de3Var);
        uc3Var.G = i3;
        uc3Var.H = i2;
        us2Var.h = new de3(uc3Var);
        return -5;
    }

    @Override // defpackage.af3
    public final boolean c() {
        return !this.c.n() && this.a.c();
    }

    @Override // defpackage.af3
    public final int f(long j) {
        if (this.c.n()) {
            return -3;
        }
        return this.a.f(j);
    }

    @Override // defpackage.af3
    public final void h() {
        this.a.h();
    }
}
