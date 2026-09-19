package defpackage;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public class yi2 extends ti2 implements SortedSet {
    public final /* synthetic */ nk2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi2(nk2 nk2Var, SortedMap sortedMap) {
        super(nk2Var, sortedMap);
        Objects.requireNonNull(nk2Var);
        this.h = nk2Var;
    }

    public SortedMap a() {
        return (SortedMap) this.f;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new yi2(this.h, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new yi2(this.h, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new yi2(this.h, a().tailMap(obj));
    }
}
