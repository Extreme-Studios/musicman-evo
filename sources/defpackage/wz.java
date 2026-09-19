package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wz implements Runnable {
    public final oo f;
    public final eo g;
    public boolean h;

    public wz(oo ooVar, eo eoVar) {
        ooVar.getClass();
        eoVar.getClass();
        this.f = ooVar;
        this.g = eoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h) {
            return;
        }
        this.f.d(this.g);
        this.h = true;
    }
}
