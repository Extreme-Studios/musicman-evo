package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lw0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final lw0 zzh;
    private static volatile b33 zzi;
    private int zzd;
    private int zze = 1000;
    private xv0 zzf;
    private sv0 zzg;

    static {
        lw0 lw0Var = new lw0();
        zzh = lw0Var;
        d23.t(lw0.class, lw0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", vo0.w, "zzf", "zzg"});
        }
        if (iZ == 3) {
            return new lw0();
        }
        if (iZ == 4) {
            return new jw0(zzh);
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
        synchronized (lw0.class) {
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
