package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class sd0 implements ee0 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public sd0(long j, long j2) {
        this.a = 1;
        this.b = j;
        fe0 fe0Var = j2 == 0 ? fe0.c : new fe0(0L, j2);
        this.c = new de0(fe0Var, fe0Var);
    }

    @Override // defpackage.ee0
    public final long a() {
        switch (this.a) {
            case 0:
                return ((td0) this.c).a();
            case 1:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // defpackage.ee0
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.ee0
    public final de0 g(long j) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                td0 td0Var = (td0) obj;
                vg2 vg2Var = td0Var.k;
                vg2Var.getClass();
                String str = qz1.a;
                long jMax = Math.max(0L, Math.min((((long) td0Var.e) * j) / 1000000, td0Var.j - 1));
                long[] jArr = (long[]) vg2Var.g;
                int iP = qz1.p(jArr, jMax, false);
                long j2 = iP == -1 ? 0L : jArr[iP];
                long[] jArr2 = (long[]) vg2Var.h;
                long j3 = iP != -1 ? jArr2[iP] : 0L;
                int i3 = td0Var.e;
                long j4 = (j2 * 1000000) / ((long) i3);
                long j5 = this.b;
                fe0 fe0Var = new fe0(j4, j3 + j5);
                if (j4 == j || iP == jArr.length - 1) {
                    return new de0(fe0Var, fe0Var);
                }
                int i4 = iP + 1;
                return new de0(fe0Var, new fe0((jArr[i4] * 1000000) / ((long) i3), j5 + jArr2[i4]));
            case 1:
                return (de0) obj;
            default:
                re0 re0Var = (re0) obj;
                de0 de0VarA = re0Var.i[0].a(j);
                while (true) {
                    we0[] we0VarArr = re0Var.i;
                    if (i2 >= we0VarArr.length) {
                        return de0VarA;
                    }
                    de0 de0VarA2 = we0VarArr[i2].a(j);
                    if (de0VarA2.a.b < de0VarA.a.b) {
                        de0VarA = de0VarA2;
                    }
                    i2++;
                }
                break;
        }
    }

    public /* synthetic */ sd0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
