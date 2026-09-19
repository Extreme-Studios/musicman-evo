package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qa3 {
    public static final qa3 d = new i60().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ qa3(i60 i60Var) {
        this.a = i60Var.a;
        this.b = i60Var.b;
        this.c = i60Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qa3.class != obj.getClass()) {
            return false;
        }
        qa3 qa3Var = (qa3) obj;
        return this.a == qa3Var.a && this.b == qa3Var.b && this.c == qa3Var.c;
    }

    public final int hashCode() {
        int i = (this.a ? 1 : 0) << 2;
        boolean z = this.b;
        return (z ? 1 : 0) + (z ? 1 : 0) + i + (this.c ? 1 : 0);
    }
}
