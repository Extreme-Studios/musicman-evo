package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class du2 extends d23 {
    private static final du2 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb;
    private n13 zzc = n13.g;
    private hu2 zzd;

    static {
        du2 du2Var = new du2();
        zze = du2Var;
        d23.t(du2.class, du2Var);
    }

    public static du2 C(n13 n13Var, v13 v13Var) {
        return (du2) d23.m(zze, n13Var, v13Var);
    }

    public static cu2 D() {
        return (cu2) zze.q();
    }

    public static b33 E() {
        return zze.o();
    }

    public final n13 A() {
        return this.zzc;
    }

    public final hu2 B() {
        hu2 hu2Var = this.zzd;
        return hu2Var == null ? hu2.B() : hu2Var;
    }

    public final /* synthetic */ void F(n13 n13Var) {
        this.zzc = n13Var;
    }

    public final /* synthetic */ void G(hu2 hu2Var) {
        this.zzd = hu2Var;
        this.zza |= 1;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new du2();
        }
        if (iZ == 4) {
            return new cu2(zze);
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
        synchronized (du2.class) {
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
