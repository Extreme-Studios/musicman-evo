package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class la3 {
    public static final la3 d;
    public final String a;
    public final rz1 b;
    public final Object c;

    static {
        new la3("");
        d = new la3("preload");
    }

    public la3(String str) {
        rz1 rz1Var;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            rz1Var = new rz1();
            rz1Var.g = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            rz1Var = null;
        }
        this.b = rz1Var;
        this.c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la3)) {
            return false;
        }
        la3 la3Var = (la3) obj;
        return Objects.equals(this.a, la3Var.a) && Objects.equals(this.b, la3Var.b) && Objects.equals(this.c, la3Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
