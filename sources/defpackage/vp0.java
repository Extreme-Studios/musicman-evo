package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vp0 extends d23 {
    private static final vp0 zzl;
    private static volatile b33 zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private h23 zze = e23.j;
    private l23 zzh = e33.j;

    static {
        vp0 vp0Var = new vp0();
        zzl = vp0Var;
        d23.t(vp0.class, vp0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\b᠌\u0005\t᠌\u0006\n᠌\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", yp0.class, "zzi", vo0.B, "zzj", vo0.D, "zzk", vo0.C});
        }
        if (iZ == 3) {
            return new vp0();
        }
        if (iZ == 4) {
            return new xo0(zzl);
        }
        if (iZ == 5) {
            return zzl;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzm;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (vp0.class) {
            try {
                c23Var = zzm;
                if (c23Var == null) {
                    c23Var = new c23(zzl);
                    zzm = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
