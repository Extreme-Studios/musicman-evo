package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l21 {
    public static final l21 b;
    public final vj2 a;

    static {
        tj2 tj2Var = vj2.g;
        b = new l21(qk2.j);
        String str = qz1.a;
        Integer.toString(0, 36);
    }

    public l21(qk2 qk2Var) {
        this.a = vj2.m(qk2Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            vj2 vj2Var = this.a;
            if (i2 >= vj2Var.size()) {
                return false;
            }
            z11 z11Var = (z11) vj2Var.get(i2);
            for (boolean z : z11Var.e) {
                if (z) {
                    if (z11Var.b.c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l21.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((l21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
