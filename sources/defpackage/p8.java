package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class p8 implements xn, Serializable {
    public transient xn f;
    public final Object g;
    public final Class h;
    public final String i;
    public final String j;
    public final boolean k;

    public p8(Object obj, Class cls, String str, String str2, boolean z) {
        this.g = obj;
        this.h = cls;
        this.i = str;
        this.j = str2;
        this.k = z;
    }

    public final p9 c() {
        boolean z = this.k;
        Class cls = this.h;
        if (!z) {
            return tw.a(cls);
        }
        tw.a.getClass();
        return new jv(cls);
    }
}
