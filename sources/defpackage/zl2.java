package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zl2 implements Runnable {
    public final fm2 f;
    public final hp g;

    public zl2(fm2 fm2Var, hp hpVar) {
        this.f = fm2Var;
        this.g = hpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f.f != this) {
            return;
        }
        hp hpVar = this.g;
        if (nm2.l.f0(this.f, this, fm2.h(hpVar))) {
            fm2.o(this.f, false);
        }
    }
}
