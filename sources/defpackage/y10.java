package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class y10 implements hi {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(y10.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public z10[] f;
    public int g;
    public int h;
    public int i;

    public y10(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ce A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003b, B:53:0x00c6, B:55:0x00ce, B:58:0x00d5, B:59:0x00d9, B:61:0x00dc, B:71:0x00fd, B:74:0x010d, B:75:0x0129, B:81:0x0139, B:78:0x0130, B:80:0x0136, B:63:0x00e2, B:67:0x00e9, B:21:0x0054), top: B:103:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003b, B:53:0x00c6, B:55:0x00ce, B:58:0x00d5, B:59:0x00d9, B:61:0x00dc, B:71:0x00fd, B:74:0x010d, B:75:0x0129, B:81:0x0139, B:78:0x0130, B:80:0x0136, B:63:0x00e2, B:67:0x00e9, B:21:0x0054), top: B:103:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc A[PHI: r1 r4 r5 r10 r11 r12
  0x00fc: PHI (r1v5 java.lang.Object) = (r1v11 java.lang.Object), (r1v14 java.lang.Object) binds: [B:68:0x00f9, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r4v14 wn) = (r4v16 wn), (r4v19 wn) binds: [B:68:0x00f9, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r5v1 int) = (r5v6 int), (r5v0 int) binds: [B:68:0x00f9, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r10v7 z10) = (r10v9 z10), (r10v12 z10) binds: [B:68:0x00f9, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r11v4 hi) = (r11v6 hi), (r11v8 hi) binds: [B:68:0x00f9, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r12v5 y10) = (r12v7 y10), (r12v10 y10) binds: [B:68:0x00f9, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x010c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x010c -> B:53:0x00c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object a(defpackage.hi r18, defpackage.yb r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y10.a(hi, yb):java.lang.Object");
    }

    public final Object b() {
        xo2 xo2Var = jn.b;
        Object obj = j.get(this);
        if (obj == xo2Var) {
            return null;
        }
        return obj;
    }

    public final void c(Object obj) {
        int i;
        z10[] z10VarArr;
        xo2 xo2Var;
        if (obj == null) {
            obj = jn.b;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            if (jn.b(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.i;
            if ((i2 & 1) != 0) {
                this.i = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.i = i3;
            z10[] z10VarArr2 = this.f;
            while (true) {
                if (z10VarArr2 != null) {
                    for (z10 z10Var : z10VarArr2) {
                        if (z10Var != null) {
                            AtomicReference atomicReference = z10Var.a;
                            while (true) {
                                Object obj2 = atomicReference.get();
                                if (obj2 == null || obj2 == (xo2Var = na1.i)) {
                                    break;
                                }
                                xo2 xo2Var2 = na1.h;
                                if (obj2 != xo2Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj2, xo2Var2)) {
                                            ((z8) obj2).d(k50.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj2);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj2, xo2Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj2);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.i;
                    if (i == i3) {
                        this.i = i3 + 1;
                        return;
                    }
                    z10VarArr = this.f;
                }
                z10VarArr2 = z10VarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.hi
    public final Object i(Object obj, yb ybVar) {
        c(obj);
        return k50.a;
    }
}
