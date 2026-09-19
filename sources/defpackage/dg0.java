package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dg0 extends bg0 {
    public final String b;
    public final String c;
    public final String d;

    public dg0(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dg0.class != obj.getClass()) {
            return false;
        }
        dg0 dg0Var = (dg0) obj;
        return this.c.equals(dg0Var.c) && this.b.equals(dg0Var.b) && this.d.equals(dg0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + 527) * 31)) * 31);
    }

    @Override // defpackage.bg0
    public final String toString() {
        String str = this.a;
        int length = str.length() + 9;
        String str2 = this.b;
        int length2 = str2.length() + length + 14;
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(str3.length() + length2);
        ec.x(sb, str, ": domain=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
