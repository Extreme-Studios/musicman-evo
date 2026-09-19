package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hg0 extends bg0 {
    public final String b;
    public final String c;

    public hg0(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hg0.class != obj.getClass()) {
            return false;
        }
        hg0 hg0Var = (hg0) obj;
        return this.a.equals(hg0Var.a) && Objects.equals(this.b, hg0Var.b) && this.c.equals(hg0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + 527;
        String str = this.b;
        return this.c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.bg0
    public final String toString() {
        String str = this.a;
        int length = str.length() + 6;
        String str2 = this.c;
        return ec.n(new StringBuilder(str2.length() + length), str, ": url=", str2);
    }
}
