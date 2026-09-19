package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class lj2 extends nj2 {
    public static final nj2 f(int i) {
        if (i < 0) {
            return nj2.b;
        }
        return i > 0 ? nj2.c : nj2.a;
    }

    @Override // defpackage.nj2
    public final nj2 a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.nj2
    public final nj2 b(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.nj2
    public final nj2 c(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.nj2
    public final nj2 d(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.nj2
    public final int e() {
        return 0;
    }
}
