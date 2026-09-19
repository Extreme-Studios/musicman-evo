package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ju2 extends d23 {
    private static final ju2 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb;
    private nu2 zzc;
    private yv2 zzd;

    static {
        ju2 ju2Var = new ju2();
        zze = ju2Var;
        d23.t(ju2.class, ju2Var);
    }

    public static ju2 C(n13 n13Var, v13 v13Var) {
        return (ju2) d23.m(zze, n13Var, v13Var);
    }

    public static iu2 D() {
        return (iu2) zze.q();
    }

    public static b33 E() {
        return zze.o();
    }

    public final nu2 A() {
        nu2 nu2Var = this.zzc;
        return nu2Var == null ? nu2.D() : nu2Var;
    }

    public final yv2 B() {
        yv2 yv2Var = this.zzd;
        return yv2Var == null ? yv2.E() : yv2Var;
    }

    public final /* synthetic */ void F(nu2 nu2Var) {
        this.zzc = nu2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(yv2 yv2Var) {
        this.zzd = yv2Var;
        this.zza |= 2;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new ju2();
        }
        if (iZ == 4) {
            return new iu2(zze);
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
        synchronized (ju2.class) {
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
