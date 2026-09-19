package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zh0 {
    public final wh0 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public zh0(wh0 wh0Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j, int i2) {
        int length = iArr.length;
        int length2 = jArr2.length;
        hn.v(length == length2);
        hn.v(jArr.length == length2);
        int length3 = iArr2.length;
        hn.v(length3 == length2);
        this.a = wh0Var;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = i2;
        if (length3 > 0) {
            int i3 = length3 - 1;
            iArr2[i3] = iArr2[i3] | 536870912;
        }
    }

    public final int a(long j) {
        int i;
        String str = qz1.a;
        long[] jArr = this.f;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            while (true) {
                int i2 = iBinarySearch + 1;
                if (i2 >= jArr.length || jArr[i2] != j) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        while (i < jArr.length) {
            if ((this.g[i] & 1) != 0) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
