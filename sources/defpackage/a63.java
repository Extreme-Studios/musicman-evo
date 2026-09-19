package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a63 extends d23 {
    private static final a63 zzn;
    private static volatile b33 zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private c63 zzk;
    private z53 zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        a63 a63Var = new a63();
        zzn = a63Var;
        d23.t(a63.class, a63Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", k43.w, "zze", k43.v, "zzf", "zzg", "zzh", "zzi", "zzj", k43.u, "zzk", "zzl", "zzm"});
        }
        if (iZ == 3) {
            return new a63();
        }
        if (iZ == 4) {
            return new r43(zzn);
        }
        if (iZ == 5) {
            return zzn;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzo;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (a63.class) {
            try {
                c23Var = zzo;
                if (c23Var == null) {
                    c23Var = new c23(zzn);
                    zzo = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
