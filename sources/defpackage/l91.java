package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l91 {
    public static final l91 b = new l91(new fb0[0]);
    public static final fb0 c;
    public final fb0[] a;

    static {
        fb0 fb0Var = new fb0(-1, new int[0], new li0[0], new long[0], new String[0], new ts0[0]);
        int[] iArr = fb0Var.d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = fb0Var.e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        li0[] li0VarArr = (li0[]) Arrays.copyOf(fb0Var.c, 0);
        String[] strArr = (String[]) Arrays.copyOf(fb0Var.f, 0);
        ts0[] ts0VarArr = fb0Var.g;
        c = new fb0(0, iArrCopyOf, li0VarArr, jArrCopyOf, strArr, (ts0[]) Arrays.copyOf(ts0VarArr, Math.max(0, ts0VarArr.length)));
        String str = qz1.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public l91(fb0[] fb0VarArr) {
        this.a = fb0VarArr;
    }

    public final fb0 a(int i) {
        return i < 0 ? c : this.a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l91.class == obj.getClass() && Arrays.equals(this.a, ((l91) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 961;
    }

    public final String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }
}
