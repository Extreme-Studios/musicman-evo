package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dh2 {
    public final ud2 a;

    public dh2(rc2 rc2Var, ud2 ud2Var) {
        this.a = ud2Var;
    }

    public final ch2 a(int i) {
        return new ch2(i, this.a);
    }

    public final void b(int i) {
        this.a.b(i - 1, -1L, null, null);
    }

    public final void c(int i, Throwable th) {
        this.a.b(i - 1, -1L, th, null);
    }

    public final void d(int i, hp hpVar) {
        ch2 ch2VarA = a(i);
        ch2VarA.a();
        hpVar.a(new in2(hpVar, 0, new bz1(this, ch2VarA)), cn2.f);
    }

    public final void e(int i, Runnable runnable) {
        ch2 ch2VarA = a(i);
        try {
            ch2VarA.a();
            runnable.run();
            ch2VarA.c();
        } catch (Throwable th) {
            try {
                ch2VarA.b(th);
                throw th;
            } catch (Throwable th2) {
                ch2VarA.c();
                throw th2;
            }
        }
    }
}
