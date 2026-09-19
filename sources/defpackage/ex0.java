package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ex0 {
    public static final Object m = new Object();
    public static final li0 n;
    public Object a = m;
    public li0 b = n;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public te0 h;
    public boolean i;
    public long j;
    public int k;
    public int l;

    static {
        tj2 tj2Var = vj2.g;
        qk2 qk2Var = qk2.j;
        List list = Collections.EMPTY_LIST;
        qk2 qk2Var2 = qk2.j;
        dh0 dh0Var = dh0.a;
        Uri uri = Uri.EMPTY;
        n = new li0("androidx.media3.common.Timeline", new vc0(), uri != null ? new of0(uri, qk2Var2) : null, new te0(), uk0.B);
        String str = qz1.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(li0 li0Var, boolean z, boolean z2, te0 te0Var, long j) {
        this.a = m;
        if (li0Var == null) {
            li0Var = n;
        }
        this.b = li0Var;
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = z;
        this.g = z2;
        this.h = te0Var;
        this.j = j;
        this.k = 0;
        this.l = 0;
        this.i = false;
    }

    public final boolean b() {
        return this.h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ex0.class.equals(obj.getClass())) {
            return false;
        }
        ex0 ex0Var = (ex0) obj;
        return Objects.equals(this.a, ex0Var.a) && Objects.equals(this.b, ex0Var.b) && Objects.equals(this.h, ex0Var.h) && this.c == ex0Var.c && this.d == ex0Var.d && this.e == ex0Var.e && this.f == ex0Var.f && this.g == ex0Var.g && this.i == ex0Var.i && this.j == ex0Var.j && this.k == ex0Var.k && this.l == ex0Var.l;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() + 217) * 31) + this.b.hashCode();
        te0 te0Var = this.h;
        int iHashCode2 = ((iHashCode * 961) + (te0Var == null ? 0 : te0Var.hashCode())) * 31;
        long j = this.c;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.i ? 1 : 0);
        long j4 = this.j;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.k) * 31) + this.l) * 31;
    }
}
