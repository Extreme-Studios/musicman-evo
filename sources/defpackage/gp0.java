package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gp0 extends d23 {
    public static final /* synthetic */ int a = 0;
    private static final gp0 zzg;
    private static volatile b33 zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        gp0 gp0Var = new gp0();
        zzg = gp0Var;
        d23.t(gp0.class, gp0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iZ == 3) {
            return new gp0();
        }
        if (iZ == 4) {
            return new xo0(zzg);
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
        synchronized (gp0.class) {
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
