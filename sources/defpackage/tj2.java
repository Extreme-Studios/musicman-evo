package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tj2 extends oi2 {
    public final vj2 i;

    public tj2(vj2 vj2Var, int i) {
        super(vj2Var.size(), i);
        this.i = vj2Var;
    }

    @Override // defpackage.oi2
    public final Object b(int i) {
        return this.i.get(i);
    }
}
