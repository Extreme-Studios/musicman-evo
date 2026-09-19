package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class jm2 {
    public static /* synthetic */ boolean a(Unsafe unsafe, fm2 fm2Var, long j, cm2 cm2Var, cm2 cm2Var2) {
        while (!unsafe.compareAndSwapObject(fm2Var, j, cm2Var, cm2Var2)) {
            if (unsafe.getObject(fm2Var, j) != cm2Var) {
                return false;
            }
        }
        return true;
    }
}
