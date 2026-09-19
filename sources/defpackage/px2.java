package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class px2 extends d23 {
    private static final px2 zzf;
    private static volatile b33 zzg;
    private int zza;
    private int zzb;
    private lx2 zzc;
    private n13 zzd;
    private n13 zze;

    static {
        px2 px2Var = new px2();
        zzf = px2Var;
        d23.t(px2.class, px2Var);
    }

    public px2() {
        l13 l13Var = n13.g;
        this.zzd = l13Var;
        this.zze = l13Var;
    }

    public static px2 D(n13 n13Var, v13 v13Var) {
        return (px2) d23.m(zzf, n13Var, v13Var);
    }

    public static ox2 E() {
        return (ox2) zzf.q();
    }

    public static px2 F() {
        return zzf;
    }

    public static b33 G() {
        return zzf.o();
    }

    public final lx2 A() {
        lx2 lx2Var = this.zzc;
        return lx2Var == null ? lx2.D() : lx2Var;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final n13 C() {
        return this.zze;
    }

    public final /* synthetic */ void H(int i) {
        this.zzb = 0;
    }

    public final /* synthetic */ void I(lx2 lx2Var) {
        this.zzc = lx2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(l13 l13Var) {
        this.zzd = l13Var;
    }

    public final /* synthetic */ void K(l13 l13Var) {
        this.zze = l13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new px2();
        }
        if (iZ == 4) {
            return new ox2(zzf);
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
        synchronized (px2.class) {
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

    public final int z() {
        return this.zzb;
    }
}
