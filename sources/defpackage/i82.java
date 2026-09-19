package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i82 implements r63 {
    public final /* synthetic */ int a;
    public final q63 b;
    public final cf1 c;
    public final xe1 d;
    public final q63 e;

    public /* synthetic */ i82(q63 q63Var, cf1 cf1Var, xe1 xe1Var, q63 q63Var2, int i) {
        this.a = i;
        this.b = q63Var;
        this.c = cf1Var;
        this.d = xe1Var;
        this.e = q63Var2;
    }

    @Override // defpackage.v63
    public final /* bridge */ /* synthetic */ Object c() {
        int i = this.a;
        q63 q63Var = this.e;
        xe1 xe1Var = this.d;
        cf1 cf1Var = this.c;
        q63 q63Var2 = this.b;
        switch (i) {
            case 0:
                return new h82((u82) q63Var2.c(), cf1Var.a(), xe1Var.a(), (ae) q63Var.c());
            default:
                return new o82((u82) q63Var2.c(), cf1Var.a(), xe1Var.a(), (ae) q63Var.c());
        }
    }
}
