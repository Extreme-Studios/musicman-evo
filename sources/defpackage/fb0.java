package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fb0 {
    public final int a;
    public final Uri[] b;
    public final li0[] c;
    public final int[] d;
    public final long[] e;
    public final String[] f;
    public final ts0[] g;

    static {
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
    }

    public fb0(int i, int[] iArr, li0[] li0VarArr, long[] jArr, String[] strArr, ts0[] ts0VarArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = li0VarArr.length;
        int i2 = 0;
        hn.v(length == length2);
        hn.v(length == ts0VarArr.length);
        this.a = i;
        this.d = iArr;
        this.c = li0VarArr;
        this.e = jArr;
        this.b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.b;
            if (i2 >= uriArr.length) {
                this.f = strArr;
                this.g = ts0VarArr;
                return;
            }
            li0 li0Var = li0VarArr[i2];
            if (li0Var == null) {
                uri = null;
            } else {
                of0 of0Var = li0Var.b;
                of0Var.getClass();
                uri = of0Var.a;
            }
            uriArr[i2] = uri;
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fb0.class == obj.getClass()) {
            fb0 fb0Var = (fb0) obj;
            if (this.a == fb0Var.a && Arrays.equals(this.c, fb0Var.c) && Arrays.equals(this.d, fb0Var.d) && Arrays.equals(this.e, fb0Var.e) && Arrays.equals(this.f, fb0Var.f) && Arrays.equals(this.g, fb0Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.g) + ((((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + (((this.a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f)) * 31)) * 31;
    }
}
