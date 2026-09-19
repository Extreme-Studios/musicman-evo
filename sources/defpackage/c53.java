package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c53 extends d23 {
    private static final c53 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzd;

    static {
        c53 c53Var = new c53();
        zze = c53Var;
        d23.t(c53.class, c53Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            k43 k43Var = k43.i;
            return new f33(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", k43Var, "zzc", "zzd", k43Var});
        }
        if (iZ == 3) {
            return new c53();
        }
        if (iZ == 4) {
            return new r43(zze);
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
        synchronized (c53.class) {
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
