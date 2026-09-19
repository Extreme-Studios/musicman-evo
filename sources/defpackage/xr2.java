package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xr2 {
    public static final xr2 b = new xr2(Collections.unmodifiableMap(new HashMap()));
    public final Map a;

    public /* synthetic */ xr2(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xr2) {
            return this.a.equals(((xr2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
