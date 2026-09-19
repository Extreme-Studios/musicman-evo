package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hc2 extends ac {
    public dt i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gr1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc2(gr1 gr1Var, ac acVar) {
        super(acVar);
        this.k = gr1Var;
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(this);
    }
}
