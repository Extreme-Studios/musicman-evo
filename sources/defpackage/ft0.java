package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ft0 extends d23 {
    private static final ft0 zzf;
    private static volatile b33 zzg;
    private int zza;
    private it0 zzb;
    private n13 zzc = n13.g;
    private long zzd;
    private long zze;

    static {
        ft0 ft0Var = new ft0();
        zzf = ft0Var;
        d23.t(ft0.class, ft0Var);
    }

    public static ft0 B() {
        return zzf;
    }

    public final long A() {
        return this.zze;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new ft0();
        }
        if (iZ == 4) {
            return new xo0(zzf);
        }
        if (iZ == 5) {
            return zzf;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzg;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (ft0.class) {
            try {
                c23Var = zzg;
                if (c23Var == null) {
                    c23Var = new c23(zzf);
                    zzg = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final n13 z() {
        return this.zzc;
    }
}
