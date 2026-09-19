package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x00 extends ac {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ ki k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x00(ki kiVar, yb ybVar) {
        super(ybVar);
        this.k = kiVar;
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.i(null, this);
    }
}
