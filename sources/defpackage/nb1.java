package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nb1 {
    public static final nb1 e = new nb1(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public nb1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = qz1.a(i3) ? qz1.d(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb1)) {
            return false;
        }
        nb1 nb1Var = (nb1) obj;
        return this.a == nb1Var.a && this.b == nb1Var.b && this.c == nb1Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i3).length() + 1);
        ec.v(sb, "AudioFormat[sampleRate=", i, ", channelCount=", i2);
        return ec.k(sb, ", encoding=", i3, "]");
    }
}
