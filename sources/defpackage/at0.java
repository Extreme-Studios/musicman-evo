package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class at0 {
    public final Object a;
    public final int b;
    public final li0 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public at0(Object obj, int i, li0 li0Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = li0Var;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && at0.class == obj.getClass()) {
            at0 at0Var = (at0) obj;
            if (this.b == at0Var.b && this.e == at0Var.e && this.f == at0Var.f && this.g == at0Var.g && this.h == at0Var.h && this.i == at0Var.i && Objects.equals(this.c, at0Var.c) && Objects.equals(this.a, at0Var.a) && Objects.equals(this.d, at0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        int i = this.b;
        int length = String.valueOf(i).length();
        int i2 = this.e;
        int length2 = String.valueOf(i2).length();
        long j = this.f;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j).length());
        ec.v(sb, "mediaItem=", i, ", period=", i2);
        sb.append(", pos=");
        sb.append(j);
        String string = sb.toString();
        int i3 = this.h;
        if (i3 == -1) {
            return string;
        }
        int length3 = string.length();
        long j2 = this.g;
        int length4 = String.valueOf(i3).length() + length3 + 13 + String.valueOf(j2).length() + 10;
        int i4 = this.i;
        StringBuilder sb2 = new StringBuilder(length4 + 5 + String.valueOf(i4).length());
        sb2.append(string);
        sb2.append(", contentPos=");
        sb2.append(j2);
        return ec.l(sb2, ", adGroup=", i3, ", ad=", i4);
    }
}
