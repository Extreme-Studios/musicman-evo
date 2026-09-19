package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bd2 extends d23 {
    private static final bd2 zzi;
    private static volatile b33 zzj;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";

    static {
        bd2 bd2Var = new bd2();
        zzi = bd2Var;
        d23.t(bd2.class, bd2Var);
    }

    public static ad2 D() {
        return (ad2) zzi.q();
    }

    public static bd2 E() {
        return zzi;
    }

    public final long A() {
        return this.zzf;
    }

    public final String B() {
        return this.zzg;
    }

    public final long C() {
        return this.zzh;
    }

    public final /* synthetic */ void F(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 64;
        this.zzh = j;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iZ == 3) {
            return new bd2();
        }
        if (iZ == 4) {
            return new ad2(zzi);
        }
        if (iZ == 5) {
            return zzi;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzj;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (bd2.class) {
            try {
                c23Var = zzj;
                if (c23Var == null) {
                    c23Var = new c23(zzi);
                    zzj = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final boolean z() {
        return this.zzd;
    }
}
