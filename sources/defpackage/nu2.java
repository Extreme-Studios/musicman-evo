package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nu2 extends d23 {
    private static final nu2 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb;
    private ru2 zzc;
    private n13 zzd = n13.g;

    static {
        nu2 nu2Var = new nu2();
        zze = nu2Var;
        d23.t(nu2.class, nu2Var);
    }

    public static mu2 C() {
        return (mu2) zze.q();
    }

    public static nu2 D() {
        return zze;
    }

    public final ru2 A() {
        ru2 ru2Var = this.zzc;
        return ru2Var == null ? ru2.B() : ru2Var;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final /* synthetic */ void E(ru2 ru2Var) {
        this.zzc = ru2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(n13 n13Var) {
        this.zzd = n13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new nu2();
        }
        if (iZ == 4) {
            return new mu2(zze);
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
        synchronized (nu2.class) {
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

    public final int z() {
        return this.zzb;
    }
}
