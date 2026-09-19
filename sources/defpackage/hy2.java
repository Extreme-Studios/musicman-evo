package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hy2 extends st2 {
    public final gy2 a;

    public hy2(gy2 gy2Var) {
        this.a = gy2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.a != gy2.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hy2) && ((hy2) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(hy2.class, this.a);
    }

    public final String toString() {
        String str = this.a.a;
        return ec.n(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
