package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rw0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final rw0 zzh;
    private static volatile b33 zzi;
    private int zzd;
    private String zze = "";
    private l23 zzf = e33.j;
    private int zzg;

    static {
        rw0 rw0Var = new rw0();
        zzh = rw0Var;
        d23.t(rw0.class, rw0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", qw0.class, "zzg", vo0.w});
        }
        if (iZ == 3) {
            return new rw0();
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
        synchronized (rw0.class) {
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
