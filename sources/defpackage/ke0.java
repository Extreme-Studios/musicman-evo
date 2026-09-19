package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ke0 extends ud0 {
    public final /* synthetic */ ee0 b;
    public final /* synthetic */ je0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(je0 je0Var, ee0 ee0Var, ee0 ee0Var2) {
        super(ee0Var);
        this.b = ee0Var2;
        this.c = je0Var;
    }

    @Override // defpackage.ud0, defpackage.ee0
    public final de0 g(long j) {
        de0 de0VarG = this.b.g(j);
        fe0 fe0Var = de0VarG.a;
        long j2 = fe0Var.a;
        long j3 = fe0Var.b;
        long j4 = this.c.f;
        fe0 fe0Var2 = new fe0(j2, j3 + j4);
        fe0 fe0Var3 = de0VarG.b;
        return new de0(fe0Var2, new fe0(fe0Var3.a, fe0Var3.b + j4));
    }
}
