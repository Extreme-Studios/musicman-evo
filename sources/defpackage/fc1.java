package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fc1 extends t33 {
    public final md1 h;
    public final pc1 i;
    public final String j;
    public final String[] k;

    public fc1(md1 md1Var, pc1 pc1Var, String str, String[] strArr) {
        super(4);
        this.h = md1Var;
        this.i = pc1Var;
        this.j = str;
        this.k = strArr;
        vc3.C.A.f.add(this);
    }

    @Override // defpackage.t33
    public final void m1() {
        try {
            this.i.d(this.j, this.k);
        } finally {
            zb3.l.post(new va1(3, this));
        }
    }

    @Override // defpackage.t33
    public final hp o1() {
        return (((Boolean) tu0.e.c.a(lx0.e2)).booleanValue() && (this.i instanceof tc1)) ? za1.f.b(new br0(3, this)) : super.o1();
    }
}
