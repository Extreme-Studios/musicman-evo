package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class im2 {
    public static /* synthetic */ boolean a(Unsafe unsafe, nm2 nm2Var, long j, mm2 mm2Var, mm2 mm2Var2) {
        while (!unsafe.compareAndSwapObject(nm2Var, j, mm2Var, mm2Var2)) {
            if (unsafe.getObject(nm2Var, j) != mm2Var) {
                return false;
            }
        }
        return true;
    }
}
