package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u72 extends d23 {
    private static final u72 zzg;
    private static volatile b33 zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        u72 u72Var = new u72();
        zzg = u72Var;
        d23.t(u72.class, u72Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iZ == 3) {
            return new u72();
        }
        if (iZ == 4) {
            return new jw0(zzg);
        }
        if (iZ == 5) {
            return zzg;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzh;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (u72.class) {
            try {
                c23Var = zzh;
                if (c23Var == null) {
                    c23Var = new c23(zzg);
                    zzh = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
