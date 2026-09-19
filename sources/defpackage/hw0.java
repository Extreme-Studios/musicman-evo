package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hw0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final hw0 zzl;
    private static volatile b33 zzm;
    private int zzf;
    private int zzg = 1000;
    private xv0 zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        hw0 hw0Var = new hw0();
        zzl = hw0Var;
        d23.t(hw0.class, hw0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", vo0.w, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iZ == 3) {
            return new hw0();
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
        synchronized (hw0.class) {
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
