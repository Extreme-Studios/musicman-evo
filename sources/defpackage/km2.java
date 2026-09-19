package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class km2 {
    public static /* synthetic */ boolean a(Unsafe unsafe, nm2 nm2Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(nm2Var, j, obj, obj2)) {
            if (unsafe.getObject(nm2Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
