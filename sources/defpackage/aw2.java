package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aw2 extends d23 {
    private static final aw2 zze;
    private static volatile b33 zzf;
    private int zza;
    private cw2 zzb;
    private int zzc;
    private int zzd;

    static {
        aw2 aw2Var = new aw2();
        zze = aw2Var;
        d23.t(aw2.class, aw2Var);
    }

    public static aw2 C(n13 n13Var, v13 v13Var) {
        return (aw2) d23.m(zze, n13Var, v13Var);
    }

    public static zv2 D() {
        return (zv2) zze.q();
    }

    public static aw2 E() {
        return zze;
    }

    public final int A() {
        return this.zzc;
    }

    public final int B() {
        return this.zzd;
    }

    public final /* synthetic */ void F(cw2 cw2Var) {
        this.zzb = cw2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new aw2();
        }
        if (iZ == 4) {
            return new zv2(zze);
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
        synchronized (aw2.class) {
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

    public final cw2 z() {
        cw2 cw2Var = this.zzb;
        return cw2Var == null ? cw2.C() : cw2Var;
    }
}
