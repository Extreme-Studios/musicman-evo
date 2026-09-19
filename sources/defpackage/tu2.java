package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tu2 extends d23 {
    private static final tu2 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb;
    private xu2 zzc;
    private n13 zzd = n13.g;

    static {
        tu2 tu2Var = new tu2();
        zze = tu2Var;
        d23.t(tu2.class, tu2Var);
    }

    public static tu2 C(n13 n13Var, v13 v13Var) {
        return (tu2) d23.m(zze, n13Var, v13Var);
    }

    public static su2 D() {
        return (su2) zze.q();
    }

    public static b33 E() {
        return zze.o();
    }

    public final xu2 A() {
        xu2 xu2Var = this.zzc;
        return xu2Var == null ? xu2.B() : xu2Var;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final /* synthetic */ void F(xu2 xu2Var) {
        this.zzc = xu2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(l13 l13Var) {
        this.zzd = l13Var;
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
            return new tu2();
        }
        if (iZ == 4) {
            return new su2(zze);
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
        synchronized (tu2.class) {
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
