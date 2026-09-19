package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n53 extends d23 {
    private static final n53 zzf;
    private static volatile b33 zzg;
    private int zza;
    private String zzb = "";
    private l23 zzc;
    private l23 zzd;
    private String zze;

    static {
        n53 n53Var = new n53();
        zzf = n53Var;
        d23.t(n53.class, n53Var);
    }

    public n53() {
        e33 e33Var = e33.j;
        this.zzc = e33Var;
        this.zzd = e33Var;
        this.zze = "";
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new n53();
        }
        if (iZ == 4) {
            return new r43(zzf);
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
        synchronized (n53.class) {
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
