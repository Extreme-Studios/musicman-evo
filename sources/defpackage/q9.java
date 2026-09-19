package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q9 implements p9 {
    public static final Map b;
    public final Class a;

    static {
        List listAsList = Arrays.asList(rk.class, cl.class, gl.class, hl.class, il.class, jl.class, kl.class, ll.class, ml.class, nl.class, sk.class, tk.class, uk.class, vk.class, wk.class, xk.class, yk.class, zk.class, al.class, bl.class, dl.class, el.class, fl.class);
        listAsList.getClass();
        ArrayList arrayList = new ArrayList(listAsList.size());
        int i = 0;
        for (Object obj : listAsList) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new lv((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = dq.q(arrayList);
    }

    public q9(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.p9
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q9) && ss0.l(this).equals(ss0.l((q9) obj));
    }

    public final int hashCode() {
        return ss0.l(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
