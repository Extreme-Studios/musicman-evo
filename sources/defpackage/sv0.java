package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sv0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final sv0 zzf;
    private static volatile b33 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        sv0 sv0Var = new sv0();
        zzf = sv0Var;
        d23.t(sv0.class, sv0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new sv0();
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
        synchronized (sv0.class) {
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
}
