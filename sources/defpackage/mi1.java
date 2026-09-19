package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mi1 implements iy1 {
    public final e52 a;
    public final x42 b;
    public final nk1 c;
    public final xk1 d;
    public final f42 e;
    public final zj1 f;
    public final tl1 g;
    public final zk1 h;
    public final um1 i;
    public final oj1 j;
    public final os1 k;

    public mi1(nm0 nm0Var) {
        this.a = (e52) nm0Var.a;
        this.b = (x42) nm0Var.b;
        this.c = (nk1) nm0Var.c;
        this.d = (xk1) nm0Var.d;
        this.e = (f42) nm0Var.e;
        this.f = (zj1) nm0Var.f;
        this.g = (tl1) nm0Var.g;
        this.h = (zk1) nm0Var.h;
        this.i = (um1) nm0Var.i;
        this.j = (oj1) nm0Var.j;
        this.k = (os1) nm0Var.k;
    }

    public void a() {
        this.d.e();
        this.h.G0(this);
    }

    public final void b() {
        os1 os1Var;
        qk2 qk2Var = this.b.C0;
        if (qk2Var == null || qk2Var.isEmpty() || (os1Var = this.k) == null) {
            return;
        }
        if (!((Boolean) tu0.e.c.a(lx0.m8)).booleanValue() || qk2Var.isEmpty()) {
            return;
        }
        tj2 tj2VarListIterator = qk2Var.listIterator(0);
        while (tj2VarListIterator.hasNext()) {
            ps1 ps1Var = (ps1) tj2VarListIterator.next();
            for (int i : ps1Var.b) {
                if (i == 1) {
                    long j = ps1Var.a;
                    vc3.C.k.getClass();
                    os1Var.a(1, j, System.currentTimeMillis());
                    break;
                }
            }
        }
    }

    @Override // defpackage.iy1
    public final void m() {
        this.i.j();
    }
}
