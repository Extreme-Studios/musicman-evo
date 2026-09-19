package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ct implements x8, p70 {
    public final z8 f;
    public final /* synthetic */ dt g;

    public ct(dt dtVar, z8 z8Var) {
        this.g = dtVar;
        this.f = z8Var;
    }

    @Override // defpackage.p70
    public final void a(lz lzVar, int i) {
        this.f.a(lzVar, i);
    }

    @Override // defpackage.yb
    public final void d(Object obj) {
        this.f.d(obj);
    }

    @Override // defpackage.x8
    public final xo2 g(Object obj, hl hlVar) {
        dt dtVar = this.g;
        y8 y8Var = new y8(dtVar, this);
        xo2 xo2VarG = this.f.g((k50) obj, y8Var);
        if (xo2VarG != null) {
            dt.g.set(dtVar, null);
        }
        return xo2VarG;
    }

    @Override // defpackage.yb
    public final ic getContext() {
        return this.f.j;
    }

    @Override // defpackage.x8
    public final void j(Object obj) {
        this.f.j(obj);
    }
}
