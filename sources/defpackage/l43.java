package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l43 extends d23 {
    private static final l43 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private n13 zzd = n13.g;

    static {
        l43 l43Var = new l43();
        zze = l43Var;
        d23.t(l43.class, l43Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", k43.b, "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new l43();
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
        synchronized (l43.class) {
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
