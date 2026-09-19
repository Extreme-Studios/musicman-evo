package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iv2 extends d23 {
    private static final iv2 zza;
    private static volatile b33 zzb;

    static {
        iv2 iv2Var = new iv2();
        zza = iv2Var;
        d23.t(iv2.class, iv2Var);
    }

    public static iv2 A() {
        return zza;
    }

    public static void z(n13 n13Var, v13 v13Var) {
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zza, "\u0000\u0000", null);
        }
        if (iZ == 3) {
            return new iv2();
        }
        if (iZ == 4) {
            return new jw0(zza);
        }
        if (iZ == 5) {
            return zza;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzb;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (iv2.class) {
            try {
                c23Var = zzb;
                if (c23Var == null) {
                    c23Var = new c23(zza);
                    zzb = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
