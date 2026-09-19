package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ap0 extends d23 {
    private static final ap0 zzg;
    private static volatile b33 zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        ap0 ap0Var = new ap0();
        zzg = ap0Var;
        d23.t(ap0.class, ap0Var);
    }

    public static ap0 E() {
        return zzg;
    }

    public final int A() {
        return this.zzc;
    }

    public final boolean B() {
        return this.zzd;
    }

    public final boolean C() {
        return this.zze;
    }

    public final boolean D() {
        return this.zzf;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iZ == 3) {
            return new ap0();
        }
        if (iZ == 4) {
            return new xo0(zzg);
        }
        if (iZ == 5) {
            return zzg;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzh;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (ap0.class) {
            try {
                c23Var = zzh;
                if (c23Var == null) {
                    c23Var = new c23(zzg);
                    zzh = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final boolean z() {
        return this.zzb;
    }
}
