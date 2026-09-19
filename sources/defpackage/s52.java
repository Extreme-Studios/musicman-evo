package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s52 {
    public final n41 a;

    public s52(n41 n41Var) {
        this.a = n41Var;
    }

    public final boolean a() throws l52 {
        try {
            return this.a.n();
        } catch (Throwable th) {
            throw new l52(th);
        }
    }

    public final void b(boolean z) {
        try {
            this.a.j3(z);
        } catch (Throwable th) {
            throw new l52(th);
        }
    }
}
