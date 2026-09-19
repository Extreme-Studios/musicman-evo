package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class ox0 {
    public static final cu0 a = new cu0();

    static {
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a();

    public abstract ex0 b(int i, ex0 ex0Var, long j);

    public abstract int c();

    public abstract su0 d(int i, su0 su0Var, boolean z);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int iJ;
        if (this != obj) {
            if (obj instanceof ox0) {
                ox0 ox0Var = (ox0) obj;
                if (ox0Var.a() == a() && ox0Var.c() == c()) {
                    ex0 ex0Var = new ex0();
                    su0 su0Var = new su0();
                    ex0 ex0Var2 = new ex0();
                    su0 su0Var2 = new su0();
                    for (int i = 0; i < a(); i++) {
                        if (b(i, ex0Var, 0L).equals(ox0Var.b(i, ex0Var2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < c(); i2++) {
                        if (d(i2, su0Var, true).equals(ox0Var.d(i2, su0Var2, true))) {
                        }
                    }
                    int iK = k(true);
                    if (iK == ox0Var.k(true) && (iJ = j(true)) == ox0Var.j(true)) {
                        while (iK != iJ) {
                            int iH = h(iK, 0, true);
                            if (iH == ox0Var.h(iK, 0, true)) {
                                iK = iH;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object f(int i);

    public final boolean g() {
        return a() == 0;
    }

    public int h(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == j(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == j(z) ? k(z) : i + 1;
        }
        j7.a();
        return 0;
    }

    public final int hashCode() {
        int i;
        ex0 ex0Var = new ex0();
        su0 su0Var = new su0();
        int iA = a() + 217;
        int i2 = 0;
        while (true) {
            i = iA * 31;
            if (i2 >= a()) {
                break;
            }
            iA = i + b(i2, ex0Var, 0L).hashCode();
            i2++;
        }
        int iC = c() + i;
        for (int i3 = 0; i3 < c(); i3++) {
            iC = (iC * 31) + d(i3, su0Var, true).hashCode();
        }
        int iK = k(true);
        while (iK != -1) {
            iC = (iC * 31) + iK;
            iK = h(iK, 0, true);
        }
        return iC;
    }

    public int i(int i) {
        if (i == k(false)) {
            return -1;
        }
        return i - 1;
    }

    public int j(boolean z) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z) {
        return g() ? -1 : 0;
    }

    public final int l(int i, su0 su0Var, ex0 ex0Var, int i2, boolean z) {
        int i3 = d(i, su0Var, false).c;
        if (b(i3, ex0Var, 0L).l != i) {
            return i + 1;
        }
        int iH = h(i3, i2, z);
        if (iH == -1) {
            return -1;
        }
        return b(iH, ex0Var, 0L).k;
    }

    public final Pair m(ex0 ex0Var, su0 su0Var, int i, long j) {
        Pair pairN = n(ex0Var, su0Var, i, j, 0L);
        pairN.getClass();
        return pairN;
    }

    public final Pair n(ex0 ex0Var, su0 su0Var, int i, long j, long j2) {
        hn.P(i, a());
        b(i, ex0Var, j2);
        if (j == -9223372036854775807L) {
            ex0Var.getClass();
            j = 0;
        }
        int i2 = ex0Var.k;
        d(i2, su0Var, false);
        while (i2 < ex0Var.l) {
            su0Var.getClass();
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            d(i3, su0Var, false).getClass();
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        d(i2, su0Var, true);
        su0Var.getClass();
        long j3 = su0Var.d;
        if (j3 != -9223372036854775807L) {
            j = Math.min(j, j3 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = su0Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public su0 o(Object obj, su0 su0Var) {
        return d(e(obj), su0Var, true);
    }
}
