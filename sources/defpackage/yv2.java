package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yv2 extends d23 {
    private static final yv2 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb;
    private cw2 zzc;
    private n13 zzd = n13.g;

    static {
        yv2 yv2Var = new yv2();
        zze = yv2Var;
        d23.t(yv2.class, yv2Var);
    }

    public static yv2 C(n13 n13Var, v13 v13Var) {
        return (yv2) d23.m(zze, n13Var, v13Var);
    }

    public static xv2 D() {
        return (xv2) zze.q();
    }

    public static yv2 E() {
        return zze;
    }

    public static b33 F() {
        return zze.o();
    }

    public final cw2 A() {
        cw2 cw2Var = this.zzc;
        return cw2Var == null ? cw2.C() : cw2Var;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final /* synthetic */ void G(cw2 cw2Var) {
        this.zzc = cw2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(n13 n13Var) {
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
            return new yv2();
        }
        if (iZ == 4) {
            return new xv2(zze);
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
        synchronized (yv2.class) {
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
