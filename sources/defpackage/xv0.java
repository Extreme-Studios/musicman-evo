package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xv0 extends d23 {
    public static final int zza = 1;
    private static final xv0 zzd;
    private static volatile b33 zze;
    private int zzb;
    private int zzc;

    static {
        xv0 xv0Var = new xv0();
        zzd = xv0Var;
        d23.t(xv0.class, xv0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzc", vo0.s});
        }
        if (iZ == 3) {
            return new xv0();
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
        synchronized (xv0.class) {
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
