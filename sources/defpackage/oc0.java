package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc0 implements Runnable {
    public final /* synthetic */ int f = 2;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ oc0(z61 z61Var, Object obj, long j) {
        this.h = z61Var;
        this.i = obj;
        this.g = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        long j = this.g;
        Object obj = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                String str = qz1.a;
                p73 p73Var = ((d73) ((z61) obj).h).f;
                z93 z93Var = p73Var.x;
                q93 q93VarY = z93Var.y();
                z93Var.s(q93VarY, 26, new w32(q93VarY, obj2, j));
                if (p73Var.Q == obj2) {
                    gr1 gr1Var = p73Var.s;
                    gr1Var.c(26, r53.h);
                    gr1Var.d();
                }
                break;
            case 1:
                mm0 mm0Var = (mm0) obj2;
                mm0Var.f.a((String) obj, j);
                mm0Var.f.b(mm0Var.toString());
                break;
            default:
                k82 k82Var = (k82) obj2;
                bz1 bz1Var = k82Var.p;
                if (bz1Var != null) {
                    lu1 lu1Var = (lu1) obj;
                    q82 q82Var = k82Var.r;
                    bz1Var.q("paa", "pano_ts", this.g, k82Var.e.i, k82Var.m(), !(lu1Var instanceof zj1) ? null : ((zj1) lu1Var).i, q82Var, k82Var.e());
                }
                break;
        }
    }

    public oc0(mm0 mm0Var, String str, long j) {
        this.h = str;
        this.g = j;
        this.i = mm0Var;
    }

    public oc0(k82 k82Var, long j, lu1 lu1Var) {
        this.g = j;
        this.h = lu1Var;
        this.i = k82Var;
    }
}
