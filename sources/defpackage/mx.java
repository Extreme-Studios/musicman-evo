package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mx {
    public final Resources a;
    public final Resources.Theme b;

    public mx(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mx.class == obj.getClass()) {
            mx mxVar = (mx) obj;
            if (this.a.equals(mxVar.a) && Objects.equals(this.b, mxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
