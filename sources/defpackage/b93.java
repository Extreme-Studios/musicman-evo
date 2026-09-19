package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b93 {
    public static final b93 b = new b93(new bz1());
    public final bk2 a;

    public b93(bz1 bz1Var) {
        this.a = (bk2) bz1Var.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b93) && this.a.equals(((b93) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
