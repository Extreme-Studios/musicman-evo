package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cx0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final cx0 zzj;
    private static volatile b33 zzk;
    private int zze;
    private ax0 zzf;
    private l23 zzg = e33.j;
    private int zzh;
    private sv0 zzi;

    static {
        cx0 cx0Var = new cx0();
        zzj = cx0Var;
        d23.t(cx0.class, cx0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", rv0.class, "zzh", vo0.w, "zzi"});
        }
        if (iZ == 3) {
            return new cx0();
        }
        if (iZ == 4) {
            return new jw0(zzj);
        }
        if (iZ == 5) {
            return zzj;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzk;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (cx0.class) {
            try {
                c23Var = zzk;
                if (c23Var == null) {
                    c23Var = new c23(zzj);
                    zzk = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
