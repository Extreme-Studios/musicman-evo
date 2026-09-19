package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xb2 extends ac {
    public long i;
    public dt j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gr1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(gr1 gr1Var, ac acVar) {
        super(acVar);
        this.l = gr1Var;
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.p(0L, this);
    }
}
