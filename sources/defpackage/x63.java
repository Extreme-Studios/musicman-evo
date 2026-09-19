package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x63 implements v63 {
    public static final Object c = new Object();
    public volatile r63 a;
    public volatile Object b;

    public static v63 a(r63 r63Var) {
        if ((r63Var instanceof x63) || (r63Var instanceof q63)) {
            return r63Var;
        }
        x63 x63Var = new x63();
        x63Var.b = c;
        x63Var.a = r63Var;
        return x63Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        r63 r63Var = this.a;
        if (r63Var == null) {
            return this.b;
        }
        Object objC = r63Var.c();
        this.b = objC;
        this.a = null;
        return objC;
    }
}
