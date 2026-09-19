package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cy0 {
    public final int a;
    public final String b;
    public final int c;
    public final de3[] d;
    public int e;

    static {
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public cy0(String str, de3... de3VarArr) {
        int length = de3VarArr.length;
        int i = 1;
        hn.v(length > 0);
        this.b = str;
        this.d = de3VarArr;
        this.a = length;
        int iG = rn0.g(de3VarArr[0].m);
        this.c = iG == -1 ? rn0.g(de3VarArr[0].l) : iG;
        String str2 = de3VarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = de3VarArr[0].f | 16384;
        while (true) {
            de3[] de3VarArr2 = this.d;
            if (i >= de3VarArr2.length) {
                return;
            }
            String str3 = de3VarArr2[i].d;
            boolean zEquals = str2.equals((str3 == null || str3.equals("und")) ? "" : str3);
            de3[] de3VarArr3 = this.d;
            if (!zEquals) {
                a("languages", de3VarArr3[0].d, de3VarArr3[i].d, i);
                return;
            } else {
                if (i2 != (de3VarArr3[i].f | 16384)) {
                    a("role flags", Integer.toBinaryString(de3VarArr3[0].f), Integer.toBinaryString(this.d[i].f), i);
                    return;
                }
                i++;
            }
        }
    }

    public static void a(String str, String str2, String str3, int i) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i).length() + 1);
        ec.x(sb, "Different ", str, " combined in one TrackGroup: '", str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        s90.b0("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cy0.class == obj.getClass()) {
            cy0 cy0Var = (cy0) obj;
            if (this.b.equals(cy0Var.b) && Arrays.equals(this.d, cy0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.d) + ((this.b.hashCode() + 527) * 31);
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.d);
        String str = this.b;
        return ec.n(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length()), str, ": ", string);
    }
}
