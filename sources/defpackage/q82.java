package defpackage;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q82 {
    public final String a;
    public final h2 b;
    public final String c;

    public /* synthetic */ q82(p83 p83Var) {
        this.a = (String) p83Var.g;
        this.b = (h2) p83Var.h;
        this.c = (String) p83Var.i;
    }

    public final String a() {
        h2 h2Var = this.b;
        return h2Var == null ? "unknown" : h2Var.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        h2 h2Var;
        h2 h2Var2;
        if (obj instanceof q82) {
            q82 q82Var = (q82) obj;
            if (this.a.equals(q82Var.a) && (h2Var = this.b) != null && (h2Var2 = q82Var.b) != null && h2Var.equals(h2Var2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
