package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d10 extends ac {
    public i10 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ i10 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(i10 i10Var, ac acVar) {
        super(acVar);
        this.k = i10Var;
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(this);
    }
}
