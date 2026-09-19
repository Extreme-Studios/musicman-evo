package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vm0 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public vm0(String str, dm0 dm0Var) {
        String str2 = dm0Var.b;
        long j = dm0Var.c;
        long j2 = dm0Var.d;
        long j3 = dm0Var.e;
        long j4 = dm0Var.f;
        ?? arrayList = dm0Var.h;
        if (arrayList == 0) {
            Map map = dm0Var.g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new gm0((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static vm0 a(wm0 wm0Var) throws IOException {
        if (ym0.g(wm0Var) != 538247942) {
            throw new IOException();
        }
        String strK = ym0.k(wm0Var);
        String strK2 = ym0.k(wm0Var);
        long jI = ym0.i(wm0Var);
        long jI2 = ym0.i(wm0Var);
        long jI3 = ym0.i(wm0Var);
        long jI4 = ym0.i(wm0Var);
        int iG = ym0.g(wm0Var);
        if (iG < 0) {
            throw new IOException(ec.j(new StringBuilder(String.valueOf(iG).length() + 20), "readHeaderList size=", iG));
        }
        List arrayList = iG == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iG; i++) {
            arrayList.add(new gm0(ym0.k(wm0Var).intern(), ym0.k(wm0Var).intern()));
        }
        return new vm0(strK, strK2, jI, jI2, jI3, jI4, arrayList);
    }

    public vm0(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }
}
