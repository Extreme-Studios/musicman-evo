package defpackage;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ac3 extends LinkedHashMap {
    public final /* synthetic */ ce3 f;

    public ac3(ce3 ce3Var) {
        this.f = ce3Var;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        ce3 ce3Var = this.f;
        synchronized (ce3Var) {
            try {
                if (size() <= ce3Var.a) {
                    return false;
                }
                ce3Var.f.add(new Pair((String) entry.getKey(), ((tc3) entry.getValue()).b));
                return size() > ce3Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
