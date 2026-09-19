package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dx0 implements r63 {
    public final /* synthetic */ int a;
    public final q63 b;
    public final q63 c;
    public final q63 d;

    public /* synthetic */ dx0(q63 q63Var, q63 q63Var2, q63 q63Var3, int i) {
        this.a = i;
        this.b = q63Var;
        this.c = q63Var2;
        this.d = q63Var3;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        q63 q63Var = this.d;
        q63 q63Var2 = this.c;
        q63 q63Var3 = this.b;
        switch (i) {
            case 0:
                Object obj = (te3) q63Var3.c();
                o11 o11Var = (o11) q63Var2.c();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                if (((Integer) q63Var.c()).intValue() == 2) {
                    obj = o11Var;
                }
                return new wm1(obj, ya1Var);
            default:
                return new v42((s42) q63Var3.c(), (p42) q63Var2.c(), (f52) q63Var.c());
        }
    }
}
