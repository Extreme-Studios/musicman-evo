package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f63 extends d23 {
    private static final f63 zzj;
    private static volatile b33 zzk;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private l23 zzd;
    private l23 zze;
    private l23 zzf;
    private int zzg;
    private y53 zzh;
    private String zzi;

    static {
        f63 f63Var = new f63();
        zzj = f63Var;
        d23.t(f63.class, f63Var);
    }

    public f63() {
        e33 e33Var = e33.j;
        this.zzd = e33Var;
        this.zze = e33Var;
        this.zzf = e33Var;
        this.zzg = -1;
        this.zzi = "";
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", a63.class, "zze", d63.class, "zzg", "zzb", "zzf", i63.class, "zzi", "zzh"});
        }
        if (iZ == 3) {
            return new f63();
        }
        if (iZ == 4) {
            return new r43(zzj);
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
        synchronized (f63.class) {
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
