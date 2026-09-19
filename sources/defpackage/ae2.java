package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ae2 extends db0 {
    public final /* synthetic */ a8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae2(a8 a8Var, int i) {
        super(a8Var, i, null);
        this.g = a8Var;
    }

    @Override // defpackage.db0
    public final void a(db dbVar) {
        this.g.j.j(dbVar);
        System.currentTimeMillis();
    }

    @Override // defpackage.db0
    public final boolean b() {
        this.g.j.j(db.j);
        return true;
    }
}
