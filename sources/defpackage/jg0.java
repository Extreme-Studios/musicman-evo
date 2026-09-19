package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jg0 implements il0 {
    public final ArrayList a;

    public jg0(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((ig0) arrayList.get(0)).b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((ig0) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                }
                j = ((ig0) arrayList.get(i)).b;
            }
        }
        hn.v(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jg0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((jg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.a.toString());
    }
}
