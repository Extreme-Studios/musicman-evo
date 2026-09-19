package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f10 extends ac {
    public i10 i;
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ i10 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f10(i10 i10Var, ac acVar) {
        super(acVar);
        this.l = i10Var;
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(this);
    }
}
