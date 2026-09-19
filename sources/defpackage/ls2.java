package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ls2 implements Iterable {
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;

    public ls2(ns2 ns2Var, List list, List list2) {
        this.f = list;
        this.g = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ms2(this.f.iterator(), this.g.iterator());
    }
}
