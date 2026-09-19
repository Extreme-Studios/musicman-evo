package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l03 extends d23 {
    private static final l03 zzf;
    private static volatile b33 zzg;
    private int zza;
    private n13 zzb = n13.g;
    private String zzc = "";
    private l23 zzd = e33.j;
    private boolean zze;

    static {
        l03 l03Var = new l03();
        zzf = l03Var;
        d23.t(l03.class, l03Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (iZ == 3) {
            return new l03();
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
        synchronized (l03.class) {
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
