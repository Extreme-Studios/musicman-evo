package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public final class nk2 extends cj2 implements Serializable {
    public final transient Map i;
    public transient int j;
    public final transient o8 k;

    public nk2(Map map, o8 o8Var) {
        hn.v(map.isEmpty());
        this.i = map;
        this.k = o8Var;
    }

    @Override // defpackage.cj2
    public final Collection a() {
        return new bj2(0, this);
    }

    @Override // defpackage.cj2
    public final Map b() {
        Map map = this.i;
        if (map instanceof NavigableMap) {
            return new ui2(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new xi2(this, (SortedMap) map) : new si2(this, map);
    }

    public final void e() {
        Map map = this.i;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.j = 0;
    }
}
