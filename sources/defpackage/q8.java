package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q8 {
    public Object a;
    public s8 b;
    public ix c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        s8 s8Var = this.b;
        if (s8Var != null) {
            r8 r8Var = s8Var.g;
            r8Var.getClass();
            if (obj == null) {
                obj = e0.l;
            }
            if (e0.k.g(r8Var, null, obj)) {
                e0.c(r8Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void b(Throwable th) {
        this.d = true;
        s8 s8Var = this.b;
        if (s8Var == null || !s8Var.g.i(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        ix ixVar;
        s8 s8Var = this.b;
        if (s8Var != null) {
            r8 r8Var = s8Var.g;
            if (!r8Var.isDone()) {
                r8Var.i(new l("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 2));
            }
        }
        if (this.d || (ixVar = this.c) == null) {
            return;
        }
        ixVar.j(null);
    }
}
