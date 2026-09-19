package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface b70 {
    default z60 b(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default z60 c(Class cls, at atVar) {
        return b(cls);
    }

    default z60 d(q9 q9Var, at atVar) {
        return c(ss0.k(q9Var), atVar);
    }
}
