package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w53 extends d23 {
    private static final w53 zzp;
    private static volatile b33 zzu;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private l23 zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private l23 zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        w53 w53Var = new w53();
        zzp = w53Var;
        d23.t(w53.class, w53Var);
    }

    public w53() {
        e33 e33Var = e33.j;
        this.zze = e33Var;
        this.zzf = "";
        this.zzg = "";
        this.zzj = e33Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", k43.t, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", v53.class, "zzc", "zzk", k43.s, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iZ == 3) {
            return new w53();
        }
        if (iZ == 4) {
            return new r43(zzp);
        }
        if (iZ == 5) {
            return zzp;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzu;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (w53.class) {
            try {
                c23Var = zzu;
                if (c23Var == null) {
                    c23Var = new c23(zzp);
                    zzu = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
