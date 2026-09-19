package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xz extends s {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = s.l;
        }
        if (!s.k.f(this, null, obj)) {
            return false;
        }
        s.c(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!s.k.f(this, null, new m(th))) {
            return false;
        }
        s.c(this);
        return true;
    }
}
