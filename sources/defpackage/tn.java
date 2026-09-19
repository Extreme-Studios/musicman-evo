package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tn extends z8 {
    public final ja n;

    public tn(yb ybVar, ja jaVar) {
        super(1, ybVar);
        this.n = jaVar;
    }

    @Override // defpackage.z8
    public final Throwable r(wn wnVar) {
        Throwable thC;
        ja jaVar = this.n;
        jaVar.getClass();
        Object obj = wn.f.get(jaVar);
        if (!(obj instanceof vn) || (thC = ((vn) obj).c()) == null) {
            return obj instanceof ma ? ((ma) obj).a : wnVar.s();
        }
        return thC;
    }

    @Override // defpackage.z8
    public final String y() {
        return "AwaitContinuation";
    }
}
