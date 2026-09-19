package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t43 extends d23 {
    private static final t43 zzf;
    private static volatile b33 zzg;
    private int zza;
    private s43 zzc;
    private long zzd;
    private String zzb = "";
    private String zze = "";

    static {
        t43 t43Var = new t43();
        zzf = t43Var;
        d23.t(t43.class, t43Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new t43();
        }
        if (iZ == 4) {
            return new jw0(zzf);
        }
        if (iZ == 5) {
            return zzf;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzg;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (t43.class) {
            try {
                c23Var = zzg;
                if (c23Var == null) {
                    c23Var = new c23(zzf);
                    zzg = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
