package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q10 {
    public static final zf m = new zf(1);
    public static final zf n = new zf(2);
    public static final zf o = new zf(3);
    public static final zf p = new zf(4);
    public static final zf q = new zf(5);
    public static final zf r = new zf(0);
    public final rq c;
    public final ej1 d;
    public final float g;
    public r10 j;
    public float k;
    public boolean l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean e = false;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public q10(rq rqVar, ej1 ej1Var) {
        this.c = rqVar;
        this.d = ej1Var;
        if (ej1Var == o || ej1Var == p || ej1Var == q) {
            this.g = 0.1f;
        } else if (ej1Var == r) {
            this.g = 0.00390625f;
        } else if (ej1Var == m || ej1Var == n) {
            this.g = 0.002f;
        } else {
            this.g = 1.0f;
        }
        this.j = null;
        this.k = Float.MAX_VALUE;
        this.l = false;
    }

    public static q3 a() {
        ThreadLocal threadLocal = q3.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new q3(new us2(1)));
        }
        return (q3) threadLocal.get();
    }

    public final void b(float f) {
        this.d.n(this.c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                j7.j();
                return;
            }
            i++;
        }
    }
}
