package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f30 {
    public final String a;
    public final boolean b;
    public final List c;

    public f30(String str, boolean z, List list) {
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f30.class != obj.getClass()) {
            return false;
        }
        f30 f30Var = (f30) obj;
        String str = f30Var.a;
        if (this.b != f30Var.b || !this.c.equals(f30Var.c)) {
            return false;
        }
        String str2 = this.a;
        return str2.startsWith("index_") ? str.startsWith("index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + '}';
    }
}
