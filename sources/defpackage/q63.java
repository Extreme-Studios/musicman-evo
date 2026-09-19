package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q63 implements v63, o63 {
    public static final Object c = new Object();
    public volatile v63 a;
    public volatile Object b = c;

    public q63(v63 v63Var) {
        this.a = v63Var;
    }

    public static q63 a(v63 v63Var) {
        return v63Var instanceof q63 ? (q63) v63Var : new q63(v63Var);
    }

    public static o63 b(v63 v63Var) {
        if (v63Var instanceof o63) {
            return (o63) v63Var;
        }
        v63Var.getClass();
        return new q63(v63Var);
    }

    @Override // defpackage.v63
    public final Object c() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objC = this.a.c();
                Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != objC) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objC + ". This is likely due to a circular dependency.");
                }
                this.b = objC;
                this.a = null;
                return objC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
