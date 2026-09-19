package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rk2 extends vj2 {
    public final /* synthetic */ sk2 h;

    public rk2(sk2 sk2Var) {
        this.h = sk2Var;
    }

    @Override // defpackage.rj2
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        sk2 sk2Var = this.h;
        hn.P(i, sk2Var.k);
        Object[] objArr = sk2Var.j;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.k;
    }
}
