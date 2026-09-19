package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z72 extends d23 {
    private static final z72 zzd;
    private static volatile b33 zze;
    private long zza;
    private long zzb;
    private l23 zzc = e33.j;

    static {
        z72 z72Var = new z72();
        zzd = z72Var;
        d23.t(z72.class, z72Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ț", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new z72();
        }
        if (iZ == 4) {
            return new jw0(zzd);
        }
        if (iZ == 5) {
            return zzd;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zze;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (z72.class) {
            try {
                c23Var = zze;
                if (c23Var == null) {
                    c23Var = new c23(zzd);
                    zze = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
