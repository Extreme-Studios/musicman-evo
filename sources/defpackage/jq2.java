package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jq2 extends oo2 {
    public final kp2 a;

    public jq2(kp2 kp2Var) {
        this.a = kp2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.a != kp2.m;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jq2) && ((jq2) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(jq2.class, this.a);
    }

    public final String toString() {
        String str = this.a.g;
        return ec.n(new StringBuilder(str.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
