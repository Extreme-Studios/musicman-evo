package defpackage;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public class xi2 extends si2 implements SortedMap {
    public SortedSet j;
    public final /* synthetic */ nk2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi2(nk2 nk2Var, SortedMap sortedMap) {
        super(nk2Var, sortedMap);
        Objects.requireNonNull(nk2Var);
        this.k = nk2Var;
    }

    public SortedSet b() {
        return new yi2(this.k, d());
    }

    @Override // defpackage.si2, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.j;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.j = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.h;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new xi2(this.k, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new xi2(this.k, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new xi2(this.k, d().tailMap(obj));
    }
}
