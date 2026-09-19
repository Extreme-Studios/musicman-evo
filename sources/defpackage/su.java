package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class su implements w8 {
    public final qj f;
    public final /* synthetic */ uu g;

    public su(uu uuVar, qj qjVar) {
        qjVar.getClass();
        this.g = uuVar;
        this.f = qjVar;
    }

    @Override // defpackage.w8
    public final void cancel() {
        uu uuVar = this.g;
        f7 f7Var = uuVar.b;
        qj qjVar = this.f;
        f7Var.remove(qjVar);
        if (jn.b(uuVar.c, qjVar)) {
            qjVar.getClass();
            uuVar.c = null;
        }
        qjVar.getClass();
        qjVar.b.remove(this);
        rk rkVar = qjVar.c;
        if (rkVar != null) {
            rkVar.a();
        }
        qjVar.c = null;
    }
}
