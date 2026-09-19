package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g53 extends d23 {
    private static final g53 zzf;
    private static volatile b33 zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        g53 g53Var = new g53();
        zzf = g53Var;
        d23.t(g53.class, g53Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", k43.k, "zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new g53();
        }
        if (iZ == 4) {
            return new r43(zzf);
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
        synchronized (g53.class) {
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
