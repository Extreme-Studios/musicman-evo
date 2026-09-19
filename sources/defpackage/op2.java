package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class op2 extends oo2 {
    public final ao2 a;

    public op2(ao2 ao2Var) {
        this.a = ao2Var;
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return this.a != ao2.m;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof op2) && ((op2) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(op2.class, this.a);
    }

    public final String toString() {
        String str = this.a.g;
        return ec.n(new StringBuilder(str.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
