package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d42 implements wh2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u40 b;

    public /* synthetic */ d42(u40 u40Var, int i) {
        this.a = i;
        this.b = u40Var;
    }

    @Override // defpackage.wh2
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        u40 u40Var = this.b;
        switch (i) {
            case 0:
                jn.P("", (dv1) obj);
                jn.p("Failed to get a cache key, reverting to legacy flow.");
                e42 e42Var = new e42(null, u40Var.x());
                u40Var.j = e42Var;
                return e42Var;
            default:
                r71 r71Var = (r71) obj;
                e42 e42Var2 = new e42(r71Var, new g62(r71Var.o));
                u40Var.j = e42Var2;
                return e42Var2;
        }
    }
}
