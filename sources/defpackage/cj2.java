package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class cj2 {
    public transient Set f;
    public transient Collection g;
    public transient Map h;

    public abstract Collection a();

    public abstract Map b();

    public boolean c(Object obj) {
        Iterator it = d().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Map d() {
        Map map = this.h;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.h = mapB;
        return mapB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cj2) {
            return d().equals(((cj2) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final String toString() {
        return d().toString();
    }
}
