package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class sx implements Serializable {
    public static final Throwable a(Object obj) {
        if (obj instanceof rx) {
            return ((rx) obj).f;
        }
        return null;
    }

    public abstract Object b();

    public abstract sx c(wh2 wh2Var);
}
