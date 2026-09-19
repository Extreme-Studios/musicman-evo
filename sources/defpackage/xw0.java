package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xw0 extends d23 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final xw0 zzj;
    private static volatile b33 zzk;
    private int zze;
    private int zzf;
    private uv0 zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        xw0 xw0Var = new xw0();
        zzj = xw0Var;
        d23.t(xw0.class, xw0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", vo0.v, "zzg", "zzh", "zzi"});
        }
        if (iZ == 3) {
            return new xw0();
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
        synchronized (xw0.class) {
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
