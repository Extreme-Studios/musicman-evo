package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x72 extends d23 {
    private static final x72 zze;
    private static volatile b33 zzf;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        x72 x72Var = new x72();
        zze = x72Var;
        d23.t(x72.class, x72Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new x72();
        }
        if (iZ == 4) {
            return new jw0(zze);
        }
        if (iZ == 5) {
            return zze;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzf;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (x72.class) {
            try {
                c23Var = zzf;
                if (c23Var == null) {
                    c23Var = new c23(zze);
                    zzf = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
