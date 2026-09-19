package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lp0 extends d23 {
    private static final lp0 zzd;
    private static volatile b33 zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        lp0 lp0Var = new lp0();
        zzd = lp0Var;
        d23.t(lp0.class, lp0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", vo0.g, "zzc"});
        }
        if (iZ == 3) {
            return new lp0();
        }
        if (iZ == 4) {
            return new xo0(zzd);
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
        synchronized (lp0.class) {
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
