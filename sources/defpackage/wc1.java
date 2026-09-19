package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wc1 implements d83 {
    public final ig3 a = new ig3();
    public long b = 15000000;
    public long c = 30000000;
    public long d = 2500000;
    public long e = 5000000;
    public int f;
    public boolean g;

    @Override // defpackage.d83
    public final boolean a(c83 c83Var) {
        char c;
        int i;
        long j = c83Var.d;
        boolean z = true;
        if (j > this.c) {
            c = 0;
        } else {
            c = j < this.b ? (char) 2 : (char) 1;
        }
        ig3 ig3Var = this.a;
        synchronized (ig3Var) {
            i = ig3Var.g * 65536;
        }
        int i2 = this.f;
        if (c != 2 && (c != 1 || !this.g || i >= i2)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    @Override // defpackage.d83
    public final void b(c83 c83Var, bg3[] bg3VarArr) {
        int i;
        this.f = 0;
        for (bg3 bg3Var : bg3VarArr) {
            if (bg3Var != null) {
                int i2 = this.f;
                int i3 = bg3Var.a().c;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.f = i2 + i;
            }
        }
        this.a.b(this.f);
    }

    @Override // defpackage.d83
    public final void c(la3 la3Var) {
        this.f = 0;
        this.g = false;
    }

    @Override // defpackage.d83
    public final long d() {
        return 0L;
    }

    @Override // defpackage.d83
    public final void e(la3 la3Var) {
        this.f = 0;
        this.g = false;
        ig3 ig3Var = this.a;
        synchronized (ig3Var) {
            ig3Var.b(0);
        }
    }

    @Override // defpackage.d83
    public final boolean f(c83 c83Var) {
        long j = c83Var.f ? this.e : this.d;
        return j <= 0 || c83Var.d >= j;
    }

    @Override // defpackage.d83
    public final void h(la3 la3Var) {
        this.f = 0;
        this.g = false;
        ig3 ig3Var = this.a;
        synchronized (ig3Var) {
            ig3Var.b(0);
        }
    }

    @Override // defpackage.d83
    public final fg3 i(la3 la3Var) {
        return this.a;
    }
}
