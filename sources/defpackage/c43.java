package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c43 {
    public static final c43 h;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        int i = -1;
        h = new c43(1, 2, 3, null, i, i);
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ c43(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static boolean a(c43 c43Var) {
        if (c43Var == null) {
            return true;
        }
        int i = c43Var.a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = c43Var.b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = c43Var.c;
        if ((i3 != -1 && i3 != 3) || c43Var.d != null) {
            return false;
        }
        int i4 = c43Var.f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = c43Var.e;
        return i5 == -1 || i5 == 8;
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String e(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? ec.j(new StringBuilder(String.valueOf(i).length() + 22), "Undefined color space ", i) : "BT601";
        }
        return "BT709";
    }

    public static String f(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? ec.j(new StringBuilder(String.valueOf(i).length() + 25), "Undefined color transfer ", i) : "HLG";
        }
        return "ST2084 PQ";
    }

    public static String g(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? ec.j(new StringBuilder(String.valueOf(i).length() + 22), "Undefined color range ", i) : "Limited range";
        }
        return "Full range";
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c43.class == obj.getClass()) {
            c43 c43Var = (c43) obj;
            if (this.a == c43Var.a && this.b == c43Var.b && this.c == c43Var.c && Arrays.equals(this.d, c43Var.d) && this.e == c43Var.e && this.f == c43Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Arrays.hashCode(this.d) + ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        this.g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string;
        String strE = e(this.a);
        String strG = g(this.b);
        String strF = f(this.c);
        String string2 = "NA";
        int i = this.e;
        if (i != -1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 8);
            sb.append(i);
            sb.append("bit Luma");
            string = sb.toString();
        } else {
            string = "NA";
        }
        int i2 = this.f;
        if (i2 != -1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 10);
            sb2.append(i2);
            sb2.append("bit Chroma");
            string2 = sb2.toString();
        }
        boolean z = this.d != null;
        StringBuilder sb3 = new StringBuilder(ec.f(string2, ec.f(string, ec.f(String.valueOf(z), ec.f(strG, strE.length() + 12, 2) + strF.length() + 2, 2), 2), 1));
        sb3.append("ColorInfo(");
        sb3.append(strE);
        sb3.append(", ");
        sb3.append(strG);
        sb3.append(", ");
        sb3.append(strF);
        sb3.append(", ");
        sb3.append(z);
        ec.x(sb3, ", ", string, ", ", string2);
        sb3.append(")");
        return sb3.toString();
    }
}
