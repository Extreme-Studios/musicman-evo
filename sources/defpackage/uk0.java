package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class uk0 {
    public static final uk0 B;
    public final vj2 A;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final Integer z;

    static {
        ak0 ak0Var = new ak0();
        tj2 tj2Var = vj2.g;
        ak0Var.z = qk2.j;
        B = new uk0(ak0Var);
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(1000, 36);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public uk0(ak0 ak0Var) {
        Boolean boolValueOf = ak0Var.k;
        Integer numValueOf = ak0Var.y;
        Integer numValueOf2 = ak0Var.j;
        int i = 1;
        int i2 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf2 = -1;
            } else if (numValueOf2 == null || numValueOf2.intValue() == -1) {
                if (numValueOf != null) {
                    switch (numValueOf.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case 20:
                        default:
                            i = 0;
                            break;
                        case zw0.zzm /* 21 */:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                } else {
                    i = 0;
                }
                numValueOf2 = Integer.valueOf(i);
            }
        } else if (numValueOf2 != null) {
            boolean z = numValueOf2.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf == null) {
                switch (numValueOf2.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf = Integer.valueOf(i2);
            }
        } else {
            numValueOf2 = null;
        }
        this.a = ak0Var.a;
        this.b = ak0Var.b;
        this.c = ak0Var.c;
        this.d = ak0Var.d;
        this.e = ak0Var.e;
        this.f = ak0Var.f;
        this.g = ak0Var.g;
        this.h = ak0Var.h;
        this.i = ak0Var.i;
        this.j = numValueOf2;
        this.k = boolValueOf;
        Integer num = ak0Var.l;
        this.l = num;
        this.m = num;
        this.n = ak0Var.m;
        this.o = ak0Var.n;
        this.p = ak0Var.o;
        this.q = ak0Var.p;
        this.r = ak0Var.q;
        this.s = ak0Var.r;
        this.t = ak0Var.s;
        this.u = ak0Var.t;
        this.v = ak0Var.u;
        this.w = ak0Var.v;
        this.x = ak0Var.w;
        this.y = ak0Var.x;
        this.z = numValueOf;
        this.A = ak0Var.z;
    }

    public final ak0 a() {
        ak0 ak0Var = new ak0();
        ak0Var.a = this.a;
        ak0Var.b = this.b;
        ak0Var.c = this.c;
        ak0Var.d = this.d;
        ak0Var.e = this.e;
        ak0Var.f = this.f;
        ak0Var.g = this.g;
        ak0Var.h = this.h;
        ak0Var.i = this.i;
        ak0Var.j = this.j;
        ak0Var.k = this.k;
        ak0Var.l = this.m;
        ak0Var.m = this.n;
        ak0Var.n = this.o;
        ak0Var.o = this.p;
        ak0Var.p = this.q;
        ak0Var.q = this.r;
        ak0Var.r = this.s;
        ak0Var.s = this.t;
        ak0Var.t = this.u;
        ak0Var.u = this.v;
        ak0Var.v = this.w;
        ak0Var.w = this.x;
        ak0Var.x = this.y;
        ak0Var.y = this.z;
        ak0Var.z = this.A;
        return ak0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uk0.class == obj.getClass()) {
            uk0 uk0Var = (uk0) obj;
            if (Objects.equals(this.a, uk0Var.a) && Objects.equals(this.b, uk0Var.b) && Objects.equals(this.c, uk0Var.c) && Objects.equals(this.d, uk0Var.d) && Objects.equals(this.e, uk0Var.e) && Arrays.equals(this.f, uk0Var.f) && Objects.equals(this.g, uk0Var.g) && Objects.equals(this.h, uk0Var.h) && Objects.equals(this.i, uk0Var.i) && Objects.equals(this.j, uk0Var.j) && Objects.equals(this.k, uk0Var.k) && Objects.equals(this.m, uk0Var.m) && Objects.equals(this.n, uk0Var.n) && Objects.equals(this.o, uk0Var.o) && Objects.equals(this.p, uk0Var.p) && Objects.equals(this.q, uk0Var.q) && Objects.equals(this.r, uk0Var.r) && Objects.equals(this.s, uk0Var.s) && Objects.equals(this.t, uk0Var.t) && Objects.equals(this.u, uk0Var.u) && Objects.equals(this.v, uk0Var.v) && Objects.equals(this.w, uk0Var.w) && Objects.equals(this.x, uk0Var.x) && Objects.equals(this.y, uk0Var.y) && Objects.equals(this.z, uk0Var.z) && Objects.equals(this.A, uk0Var.A)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, null, this.y, this.z, Boolean.TRUE, this.A);
    }
}
