package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class u30 {
    public static final ThreadLocal a = new ThreadLocal();

    public static xh a() {
        ThreadLocal threadLocal = a;
        xh xhVar = (xh) threadLocal.get();
        if (xhVar != null) {
            return xhVar;
        }
        e8 e8Var = new e8(Thread.currentThread());
        threadLocal.set(e8Var);
        return e8Var;
    }
}
