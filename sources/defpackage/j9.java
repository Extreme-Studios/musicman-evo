package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class j9 extends lz {
    public final k8 e;
    public final /* synthetic */ AtomicReferenceArray f;

    public j9(long j, j9 j9Var, k8 k8Var, int i) {
        super(j, j9Var, i);
        this.e = k8Var;
        this.f = new AtomicReferenceArray(m8.b * 2);
    }

    @Override // defpackage.lz
    public final int f() {
        return m8.b;
    }

    @Override // defpackage.lz
    public final void g(int i, ic icVar) {
        k8 k8Var;
        int i2 = m8.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f.get(i * 2);
        while (true) {
            Object objK = k(i);
            boolean z2 = objK instanceof p70;
            k8Var = this.e;
            if (z2 || (objK instanceof q70)) {
                if (j(objK, i, z ? m8.j : m8.k)) {
                    m(i, null);
                    l(i, !z);
                    if (z) {
                        k8Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objK == m8.j || objK == m8.k) {
                    break;
                }
                if (objK != m8.g && objK != m8.f) {
                    if (objK == m8.i || objK == m8.d || objK == m8.l) {
                        return;
                    }
                    j7.k(objK, "unexpected state: ");
                    return;
                }
            }
        }
        m(i, null);
        if (z) {
            k8Var.getClass();
        }
    }

    public final boolean j(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            k8 k8Var = this.e;
            k8Var.getClass();
            k8Var.q((this.c * ((long) m8.b)) + ((long) i));
        }
        h();
    }

    public final void m(int i, t00 t00Var) {
        this.f.set(i * 2, t00Var);
    }

    public final void n(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}
