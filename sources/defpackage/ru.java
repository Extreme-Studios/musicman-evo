package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ru implements jo, w8 {
    public final oo f;
    public final qj g;
    public su h;
    public final /* synthetic */ uu i;

    public ru(uu uuVar, oo ooVar, qj qjVar) {
        qjVar.getClass();
        this.i = uuVar;
        this.f = ooVar;
        this.g = qjVar;
        ooVar.a(this);
    }

    @Override // defpackage.w8
    public final void cancel() {
        this.f.f(this);
        qj qjVar = this.g;
        qjVar.getClass();
        qjVar.b.remove(this);
        su suVar = this.h;
        if (suVar != null) {
            suVar.cancel();
        }
        this.h = null;
    }

    @Override // defpackage.jo
    public final void g(mo moVar, eo eoVar) {
        if (eoVar == eo.ON_START) {
            qj qjVar = this.g;
            qjVar.getClass();
            uu uuVar = this.i;
            uuVar.b.addLast(qjVar);
            su suVar = new su(uuVar, qjVar);
            qjVar.b.add(suVar);
            uuVar.c();
            qjVar.c = new tu(0, uuVar, uu.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
            this.h = suVar;
            return;
        }
        if (eoVar != eo.ON_STOP) {
            if (eoVar == eo.ON_DESTROY) {
                cancel();
            }
        } else {
            su suVar2 = this.h;
            if (suVar2 != null) {
                suVar2.cancel();
            }
        }
    }
}
