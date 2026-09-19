package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface d83 {
    boolean a(c83 c83Var);

    void b(c83 c83Var, bg3[] bg3VarArr);

    void c(la3 la3Var);

    long d();

    void e(la3 la3Var);

    boolean f(c83 c83Var);

    default boolean g() {
        s90.Q("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    void h(la3 la3Var);

    fg3 i(la3 la3Var);
}
