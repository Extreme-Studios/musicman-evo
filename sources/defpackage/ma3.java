package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ma3 {
    public static final ma3 d;
    public final int a;
    public final int b;
    public final bk2 c;

    static {
        ma3 ma3Var;
        if (Build.VERSION.SDK_INT >= 33) {
            ak2 ak2Var = new ak2(4);
            for (int i = 1; i <= 10; i++) {
                ak2Var.f(Integer.valueOf(qz1.b(i)));
            }
            ma3Var = new ma3(2, ak2Var.h());
        } else {
            ma3Var = new ma3(2, 10);
        }
        d = ma3Var;
    }

    public ma3(int i, Set set) {
        this.a = i;
        bk2 bk2VarJ = bk2.j(set);
        this.c = bk2VarJ;
        dl2 dl2VarA = bk2VarJ.a();
        int iMax = 0;
        while (dl2VarA.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) dl2VarA.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma3)) {
            return false;
        }
        ma3 ma3Var = (ma3) obj;
        return this.a == ma3Var.a && this.b == ma3Var.b && Objects.equals(this.c, ma3Var.c);
    }

    public final int hashCode() {
        bk2 bk2Var = this.c;
        return (((this.a * 31) + this.b) * 31) + (bk2Var == null ? 0 : bk2Var.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i2).length() + 15 + strValueOf.length() + 1);
        ec.v(sb, "AudioProfile[format=", i, ", maxChannelCount=", i2);
        return ec.n(sb, ", channelMasks=", strValueOf, "]");
    }

    public ma3(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
