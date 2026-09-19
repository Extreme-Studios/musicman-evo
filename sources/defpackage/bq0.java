package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bq0 extends d23 {
    private static final bq0 zze;
    private static volatile b33 zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private n13 zzd = n13.g;

    static {
        bq0 bq0Var = new bq0();
        zze = bq0Var;
        d23.t(bq0.class, bq0Var);
    }

    public static bq0 D() {
        return zze;
    }

    public final long A() {
        return this.zzb;
    }

    public final String B() {
        return this.zzc;
    }

    public final n13 C() {
        return this.zzd;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new bq0();
        }
        if (iZ == 4) {
            return new xo0(zze);
        }
        if (iZ == 5) {
            return zze;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzf;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (bq0.class) {
            try {
                c23Var = zzf;
                if (c23Var == null) {
                    c23Var = new c23(zze);
                    zzf = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final boolean z() {
        return (this.zza & 1) != 0;
    }
}
