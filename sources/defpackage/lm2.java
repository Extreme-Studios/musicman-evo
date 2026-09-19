package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class lm2 extends ss0 {
    public static final Unsafe q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final long v;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(om2.a);
            }
            try {
                s = unsafe.objectFieldOffset(nm2.class.getDeclaredField("h"));
                r = unsafe.objectFieldOffset(nm2.class.getDeclaredField("g"));
                t = unsafe.objectFieldOffset(nm2.class.getDeclaredField("f"));
                u = unsafe.objectFieldOffset(mm2.class.getDeclaredField("a"));
                v = unsafe.objectFieldOffset(mm2.class.getDeclaredField("b"));
                q = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            j7.h("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // defpackage.ss0
    public final void C(mm2 mm2Var, Thread thread) {
        q.putObject(mm2Var, u, thread);
    }

    @Override // defpackage.ss0
    public final void L(mm2 mm2Var, mm2 mm2Var2) {
        q.putObject(mm2Var, v, mm2Var2);
    }

    @Override // defpackage.ss0
    public final boolean R(nm2 nm2Var, mm2 mm2Var, mm2 mm2Var2) {
        return im2.a(q, nm2Var, s, mm2Var, mm2Var2);
    }

    @Override // defpackage.ss0
    public final boolean W(fm2 fm2Var, cm2 cm2Var, cm2 cm2Var2) {
        return jm2.a(q, fm2Var, r, cm2Var, cm2Var2);
    }

    @Override // defpackage.ss0
    public final mm2 Y(fm2 fm2Var) {
        mm2 mm2Var;
        mm2 mm2Var2 = mm2.c;
        do {
            mm2Var = fm2Var.h;
            if (mm2Var2 == mm2Var) {
                break;
            }
        } while (!R(fm2Var, mm2Var, mm2Var2));
        return mm2Var;
    }

    @Override // defpackage.ss0
    public final cm2 c0(fm2 fm2Var) {
        cm2 cm2Var;
        cm2 cm2Var2 = cm2.d;
        do {
            cm2Var = fm2Var.g;
            if (cm2Var2 == cm2Var) {
                break;
            }
        } while (!W(fm2Var, cm2Var, cm2Var2));
        return cm2Var;
    }

    @Override // defpackage.ss0
    public final boolean f0(nm2 nm2Var, Object obj, Object obj2) {
        return km2.a(q, nm2Var, t, obj, obj2);
    }
}
