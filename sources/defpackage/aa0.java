package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class aa0 {
    public final z3 a;
    public final ei b;

    public /* synthetic */ aa0(z3 z3Var, ei eiVar) {
        this.a = z3Var;
        this.b = eiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aa0)) {
            return false;
        }
        aa0 aa0Var = (aa0) obj;
        return s90.d(this.a, aa0Var.a) && s90.d(this.b, aa0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        vg2 vg2Var = new vg2(this);
        vg2Var.b(this.a, "key");
        vg2Var.b(this.b, "feature");
        return vg2Var.toString();
    }
}
