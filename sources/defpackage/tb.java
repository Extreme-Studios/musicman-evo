package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class tb {
    public final Uri a;
    public final boolean b;

    public tb(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tb.class == obj.getClass()) {
            tb tbVar = (tb) obj;
            if (this.b == tbVar.b && this.a.equals(tbVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
    }
}
