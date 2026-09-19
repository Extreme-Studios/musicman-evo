package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hg1 {
    public static final fj2 a = new fj2();

    static {
        tj2 tj2Var = vj2.g;
        new hg1(qk2.j);
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public hg1(qk2 qk2Var) {
        tj2 tj2Var = vj2.g;
        Object[] array = (qk2Var == null ? na1.r(qk2Var.listIterator(0)) : qk2Var).toArray();
        int length = array.length;
        dq.y(array, length);
        Arrays.sort(array, a);
        vj2.o(array, length);
    }
}
