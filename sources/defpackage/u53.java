package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u53 extends d23 {
    private static final u53 zzh;
    private static volatile b33 zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private h23 zzd = e23.j;
    private l23 zzf = e33.j;
    private n13 zzg = n13.g;

    static {
        u53 u53Var = new u53();
        zzh = u53Var;
        d23.t(u53.class, u53Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", t53.class, "zzg"});
        }
        if (iZ == 3) {
            return new u53();
        }
        if (iZ == 4) {
            return new r43(zzh);
        }
        if (iZ == 5) {
            return zzh;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzi;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (u53.class) {
            try {
                c23Var = zzi;
                if (c23Var == null) {
                    c23Var = new c23(zzh);
                    zzi = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
