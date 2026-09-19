package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ng3 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public ng3(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String strConcat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        super(ec.n(new StringBuilder(strConcat.length() + simpleName.length() + 11), "Unexpected ", simpleName, strConcat), th);
    }
}
