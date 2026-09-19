package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yx2 extends d23 {
    private static final yx2 zzb;
    private static volatile b33 zzc;
    private int zza;

    static {
        yx2 yx2Var = new yx2();
        zzb = yx2Var;
        d23.t(yx2.class, yx2Var);
    }

    public static yx2 A(n13 n13Var, v13 v13Var) {
        return (yx2) d23.m(zzb, n13Var, v13Var);
    }

    public static yx2 B() {
        return zzb;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iZ == 3) {
            return new yx2();
        }
        if (iZ == 4) {
            return new jw0(zzb);
        }
        if (iZ == 5) {
            return zzb;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzc;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (yx2.class) {
            try {
                c23Var = zzc;
                if (c23Var == null) {
                    c23Var = new c23(zzb);
                    zzc = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final int z() {
        return this.zza;
    }
}
