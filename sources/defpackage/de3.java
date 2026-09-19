package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class de3 {
    public static final /* synthetic */ int N = 0;
    public final byte[] A;
    public final int B;
    public final c43 C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public int M;
    public final String a;
    public final String b;
    public final vj2 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final am0 k;
    public final String l;
    public final String m;
    public final int n;
    public final int o;
    public final List p;
    public final va3 q;
    public final long r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final float x;
    public final int y;
    public final float z;

    static {
        new de3(new uc3());
        String str = qz1.a;
        Integer.toString(0, 36);
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
        Integer.toString(35, 36);
        Integer.toString(36, 36);
    }

    public de3(uc3 uc3Var) {
        boolean z;
        String str;
        this.a = uc3Var.a;
        String strN = qz1.n(uc3Var.d);
        this.d = strN;
        if (uc3Var.c.isEmpty() && uc3Var.b != null) {
            this.c = vj2.i(new jf3(strN, uc3Var.b));
            this.b = uc3Var.b;
        } else if (uc3Var.c.isEmpty() || uc3Var.b != null) {
            if (!uc3Var.c.isEmpty() || uc3Var.b != null) {
                int i = 0;
                while (true) {
                    if (i >= uc3Var.c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((jf3) uc3Var.c.get(i)).b.equals(uc3Var.b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            hn.M(z);
            this.c = uc3Var.c;
            this.b = uc3Var.b;
        } else {
            vj2 vj2Var = uc3Var.c;
            this.c = vj2Var;
            Iterator it = vj2Var.iterator();
            while (true) {
                oi2 oi2Var = (oi2) it;
                if (!oi2Var.hasNext()) {
                    str = ((jf3) vj2Var.get(0)).b;
                    break;
                }
                jf3 jf3Var = (jf3) oi2Var.next();
                if (TextUtils.equals(jf3Var.a, strN)) {
                    str = jf3Var.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = uc3Var.e;
        this.f = uc3Var.f;
        int i2 = uc3Var.g;
        this.g = i2;
        int i3 = uc3Var.h;
        this.h = i3;
        this.i = i3 != -1 ? i3 : i2;
        this.j = uc3Var.i;
        this.k = uc3Var.j;
        this.l = uc3Var.k;
        this.m = uc3Var.l;
        this.n = uc3Var.m;
        this.o = uc3Var.n;
        List list = uc3Var.o;
        this.p = list == null ? Collections.EMPTY_LIST : list;
        va3 va3Var = uc3Var.p;
        this.q = va3Var;
        this.r = uc3Var.q;
        this.s = uc3Var.r;
        this.t = uc3Var.s;
        this.u = uc3Var.t;
        this.v = uc3Var.u;
        this.w = uc3Var.v;
        this.x = uc3Var.w;
        int i4 = uc3Var.x;
        this.y = i4 == -1 ? 0 : i4;
        float f = uc3Var.y;
        this.z = f == -1.0f ? 1.0f : f;
        this.A = uc3Var.z;
        this.B = uc3Var.A;
        this.C = uc3Var.B;
        this.D = uc3Var.C;
        this.E = uc3Var.D;
        this.F = uc3Var.E;
        this.G = uc3Var.F;
        int i5 = uc3Var.G;
        this.H = i5 == -1 ? 0 : i5;
        int i6 = uc3Var.H;
        this.I = i6 != -1 ? i6 : 0;
        this.J = uc3Var.I;
        this.K = uc3Var.J;
        int i7 = uc3Var.K;
        if (i7 != 0 || va3Var == null) {
            this.L = i7;
        } else {
            this.L = 1;
        }
    }

    public static String c(de3 de3Var) {
        String str;
        String string;
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(de3Var.a);
        sb.append(", mimeType=");
        sb.append(de3Var.m);
        String str2 = de3Var.l;
        if (str2 != null) {
            sb.append(", container=");
            sb.append(str2);
        }
        int i3 = de3Var.i;
        if (i3 != -1) {
            sb.append(", bitrate=");
            sb.append(i3);
        }
        String str3 = de3Var.j;
        if (str3 != null) {
            sb.append(", codecs=");
            sb.append(str3);
        }
        va3 va3Var = de3Var.q;
        if (va3Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < va3Var.i; i4++) {
                UUID uuid = va3Var.f[i4].g;
                if (uuid.equals(be2.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(be2.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(be2.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(be2.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(be2.a)) {
                    linkedHashSet.add("universal");
                } else {
                    String string2 = uuid.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 10);
                    sb2.append("unknown (");
                    sb2.append(string2);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sb.append(", drm=[");
            i8.D(sb, linkedHashSet.iterator(), ",");
            sb.append(']');
        }
        int i5 = de3Var.t;
        if (i5 != -1 && (i2 = de3Var.u) != -1) {
            ec.v(sb, ", res=", i5, "x", i2);
        }
        int i6 = de3Var.v;
        if (i6 != -1 && (i = de3Var.w) != -1) {
            ec.v(sb, ", decRes=", i6, "x", i);
        }
        float f = de3Var.z;
        int i7 = pl2.a;
        double d = f;
        if (Math.copySign((-1.0d) + d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f)};
            String str4 = qz1.a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        c43 c43Var = de3Var.C;
        if (c43Var != null) {
            int i8 = c43Var.f;
            int i9 = c43Var.e;
            if ((i9 != -1 && i8 != -1) || c43Var.d()) {
                sb.append(", color=");
                if (c43Var.d()) {
                    String strE = c43.e(c43Var.a);
                    String strG = c43.g(c43Var.b);
                    String strF = c43.f(c43Var.c);
                    String str5 = qz1.a;
                    Locale locale = Locale.US;
                    str = strE + "/" + strG + "/" + strF;
                } else {
                    str = "NA/NA/NA";
                }
                if (i9 == -1 || i8 == -1) {
                    string = "NA/NA";
                } else {
                    StringBuilder sb3 = new StringBuilder(g72.a(i9, 1) + String.valueOf(i8).length());
                    sb3.append(i9);
                    sb3.append("/");
                    sb3.append(i8);
                    string = sb3.toString();
                }
                StringBuilder sb4 = new StringBuilder(string.length() + str.length() + 1);
                sb4.append(str);
                sb4.append("/");
                sb4.append(string);
                sb.append(sb4.toString());
            }
        }
        float f2 = de3Var.x;
        if (f2 != -1.0f) {
            sb.append(", fps=");
            sb.append(f2);
        }
        int i10 = de3Var.D;
        if (i10 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i10);
        }
        int i11 = de3Var.E;
        if (i11 != -1) {
            sb.append(", channels=");
            sb.append(i11);
        }
        int i12 = de3Var.F;
        if (i12 != -1) {
            sb.append(", sample_rate=");
            sb.append(i12);
        }
        String str6 = de3Var.d;
        if (str6 != null) {
            sb.append(", language=");
            sb.append(str6);
        }
        vj2 vj2Var = de3Var.c;
        if (!vj2Var.isEmpty()) {
            sb.append(", labels=[");
            i8.D(sb, na1.B(vj2Var, zf2.g).iterator(), ",");
            sb.append("]");
        }
        int i13 = de3Var.e;
        if (i13 != 0) {
            sb.append(", selectionFlags=[");
            String str7 = qz1.a;
            ArrayList arrayList = new ArrayList();
            if ((i13 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i13 & 2) != 0) {
                arrayList.add("forced");
            }
            i8.D(sb, arrayList.iterator(), ",");
            sb.append("]");
        }
        int i14 = de3Var.f;
        if (i14 != 0) {
            sb.append(", roleFlags=[");
            int i15 = i14 & 32768;
            String str8 = qz1.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i14 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i14 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i14 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i14 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i14 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i14 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i14 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i14 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i14 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i14 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i14 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i14 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i14 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i14 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i14 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i15 != 0) {
                arrayList2.add("auxiliary");
            }
            i8.D(sb, arrayList2.iterator(), ",");
            sb.append("]");
        }
        if ((i14 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            String str9 = qz1.a;
            sb.append("undefined");
        }
        return sb.toString();
    }

    public final uc3 a() {
        return new uc3(this);
    }

    public final boolean b(de3 de3Var) {
        List list = this.p;
        int size = list.size();
        List list2 = de3Var.p;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || de3.class != obj.getClass()) {
            return false;
        }
        de3 de3Var = (de3) obj;
        int i2 = this.M;
        return (i2 == 0 || (i = de3Var.M) == 0 || i2 == i) && this.e == de3Var.e && this.f == de3Var.f && this.g == de3Var.g && this.h == de3Var.h && this.n == de3Var.n && this.r == de3Var.r && this.t == de3Var.t && this.u == de3Var.u && this.v == de3Var.v && this.w == de3Var.w && this.y == de3Var.y && this.B == de3Var.B && this.D == de3Var.D && this.E == de3Var.E && this.F == de3Var.F && this.G == de3Var.G && this.H == de3Var.H && this.I == de3Var.I && this.J == de3Var.J && this.L == de3Var.L && Float.compare(this.x, de3Var.x) == 0 && Float.compare(this.z, de3Var.z) == 0 && Objects.equals(this.a, de3Var.a) && Objects.equals(this.b, de3Var.b) && this.c.equals(de3Var.c) && Objects.equals(this.j, de3Var.j) && Objects.equals(this.l, de3Var.l) && Objects.equals(this.m, de3Var.m) && Objects.equals(this.d, de3Var.d) && Arrays.equals(this.A, de3Var.A) && Objects.equals(this.k, de3Var.k) && Objects.equals(this.C, de3Var.C) && Objects.equals(this.q, de3Var.q) && b(de3Var);
    }

    public final int hashCode() {
        int i = this.M;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = this.c.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.d;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 961) + this.g) * 31) + this.h) * 31;
        String str4 = this.j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        am0 am0Var = this.k;
        int iHashCode5 = iHashCode4 + (am0Var == null ? 0 : am0Var.hashCode());
        String str5 = this.l;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int iFloatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.z) + ((((Float.floatToIntBits(this.x) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.n) * 31) + ((int) this.r)) * 31) + this.t) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31)) * 31) + this.y) * 31)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) - 1) * 31) - 1) * 31) + this.L;
        this.M = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.C);
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.l;
        int length3 = String.valueOf(str3).length();
        String str4 = this.m;
        int length4 = String.valueOf(str4).length();
        String str5 = this.j;
        int length5 = String.valueOf(str5).length();
        int i = this.i;
        int length6 = String.valueOf(i).length();
        String str6 = this.d;
        int length7 = String.valueOf(str6).length();
        int i2 = this.t;
        int length8 = String.valueOf(i2).length();
        int i3 = this.u;
        int length9 = String.valueOf(i3).length();
        float f = this.x;
        int length10 = String.valueOf(f).length();
        int length11 = strValueOf.length();
        int i4 = this.E;
        int length12 = String.valueOf(i4).length();
        int i5 = this.F;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + String.valueOf(i5).length() + 2);
        ec.x(sb, "Format(", str, ", ", str2);
        ec.x(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append("], [");
        sb.append(i4);
        return ec.k(sb, ", ", i5, "])");
    }
}
