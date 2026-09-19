package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m43 extends d23 {
    private static final m43 zzy;
    private static volatile b33 zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private l23 zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private l23 zzo;
    private boolean zzp;
    private long zzu;
    private h23 zzv;
    private boolean zzw;
    private h23 zzx;

    static {
        m43 m43Var = new m43();
        zzy = m43Var;
        d23.t(m43.class, m43Var);
    }

    public m43() {
        e33 e33Var = e33.j;
        this.zze = e33Var;
        this.zzj = "";
        this.zzo = e33Var;
        e23 e23Var = e23.j;
        this.zzv = e23Var;
        this.zzx = e23Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", k43.e, "zzc", "zzd", "zze", "zzf", k43.c, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", l43.class, "zzp", "zzu", "zzv", vo0.E, "zzw", "zzx", k43.d});
        }
        if (iZ == 3) {
            return new m43();
        }
        if (iZ == 4) {
            return new jw0(zzy);
        }
        if (iZ == 5) {
            return zzy;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzz;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (m43.class) {
            try {
                c23Var = zzz;
                if (c23Var == null) {
                    c23Var = new c23(zzy);
                    zzz = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
