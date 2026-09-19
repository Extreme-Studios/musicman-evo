package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m9 extends sn implements l9 {
    public final wn e;

    public m9(wn wnVar) {
        this.e = wnVar;
    }

    @Override // defpackage.l9
    public final boolean c(Throwable th) {
        return j().o(th);
    }

    @Override // defpackage.sn
    public final boolean k() {
        return true;
    }

    @Override // defpackage.sn
    public final void l(Throwable th) {
        this.e.l(j());
    }
}
