package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aa3 {
    public final String a;
    public int b;
    public long c;
    public final yd3 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ ba3 g;

    public aa3(ba3 ba3Var, String str, int i, yd3 yd3Var) {
        this.g = ba3Var;
        this.a = str;
        this.b = i;
        this.c = yd3Var == null ? -1L : yd3Var.d;
        if (yd3Var == null || !yd3Var.b()) {
            return;
        }
        this.d = yd3Var;
    }

    public final boolean a(ox0 ox0Var, ox0 ox0Var2) {
        yd3 yd3Var;
        int i = this.b;
        if (i < ox0Var.a()) {
            ba3 ba3Var = this.g;
            ex0 ex0Var = ba3Var.a;
            ox0Var.b(i, ex0Var, 0L);
            int i2 = ex0Var.k;
            while (true) {
                if (i2 > ex0Var.l) {
                    i = -1;
                    break;
                }
                int iE = ox0Var2.e(ox0Var.f(i2));
                if (iE != -1) {
                    i = ox0Var2.d(iE, ba3Var.b, false).c;
                    break;
                }
                i2++;
            }
        } else if (i >= ox0Var2.a()) {
            i = -1;
            break;
        }
        this.b = i;
        return i != -1 && ((yd3Var = this.d) == null || ox0Var2.e(yd3Var.a) != -1);
    }

    public final boolean b(q93 q93Var) {
        yd3 yd3Var = q93Var.d;
        if (yd3Var == null) {
            return this.b != q93Var.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        long j2 = yd3Var.d;
        if (j2 > j) {
            return true;
        }
        yd3 yd3Var2 = this.d;
        if (yd3Var2 == null) {
            return false;
        }
        ox0 ox0Var = q93Var.b;
        int iE = ox0Var.e(yd3Var.a);
        int iE2 = ox0Var.e(yd3Var2.a);
        long j3 = yd3Var2.d;
        int i = yd3Var2.b;
        if (j2 < j3 || iE < iE2) {
            return false;
        }
        if (iE > iE2) {
            return true;
        }
        if (!yd3Var.b()) {
            int i2 = yd3Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = yd3Var.b;
        int i4 = yd3Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > yd3Var2.c;
        }
        return true;
    }
}
