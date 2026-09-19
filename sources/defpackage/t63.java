package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t63 extends p63 {
    public static final /* synthetic */ int b = 0;

    static {
        s63.a(Collections.EMPTY_MAP);
    }

    public static gv1 a(int i) {
        return new gv1(i);
    }

    @Override // defpackage.v63
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map c() {
        Map map = this.a;
        LinkedHashMap linkedHashMapX = ej1.x(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapX.put(entry.getKey(), ((v63) entry.getValue()).c());
        }
        return Collections.unmodifiableMap(linkedHashMapX);
    }
}
