package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class wp {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(wp.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(wp.class, "_state$volatile");
    public static final xo2 g = new xo2("REMOVE_FROZEN", 3);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public wp(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            j7.e("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        j7.e("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                wp wpVar = this;
                if (f.compareAndSet(wpVar, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    wp wpVarC = wpVar;
                    while ((atomicLongFieldUpdater.get(wpVarC) & 1152921504606846976L) != 0) {
                        wpVarC = wpVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = wpVarC.d;
                        int i4 = wpVarC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof vp) && ((vp) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            wpVarC = null;
                        }
                        if (wpVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = wpVar;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            wp wpVar = this;
            if (atomicLongFieldUpdater.compareAndSet(wpVar, j, 2305843009213693952L | j)) {
                return true;
            }
            this = wpVar;
        }
    }

    public final wp c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        wp wpVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                wpVar = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            wpVar = this;
            if (atomicLongFieldUpdater.compareAndSet(wpVar, j, j2)) {
                j = j2;
                break;
            }
            this = wpVar;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            wp wpVar2 = (wp) atomicReferenceFieldUpdater.get(wpVar);
            if (wpVar2 != null) {
                return wpVar2;
            }
            wp wpVar3 = new wp(wpVar.a * 2, wpVar.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = wpVar.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object vpVar = wpVar.d.get(i4);
                if (vpVar == null) {
                    vpVar = new vp(i);
                }
                wpVar3.d.set(wpVar3.c & i, vpVar);
                i++;
            }
            atomicLongFieldUpdater.set(wpVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(wpVar, null, wpVar3) && atomicReferenceFieldUpdater.get(wpVar) == null) {
            }
        }
    }

    public final Object d() {
        wp wpVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(wpVarC);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = wpVarC.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = wpVarC.d;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = wpVarC.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof vp)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f.compareAndSet(wpVarC, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    wpVarC = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(wpVarC);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                wpVarC = wpVarC.c();
                            } else {
                                wp wpVar = wpVarC;
                                if (f.compareAndSet(wpVar, j3, (j3 & (-1073741824)) | j2)) {
                                    wpVar.d.set(i4 & wpVar.c, null);
                                    wpVarC = null;
                                } else {
                                    wpVarC = wpVar;
                                }
                            }
                            if (wpVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
